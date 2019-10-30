package main

import (
	"github.com/gravetii/diztl/diztl"
	"github.com/gravetii/diztl/service"
	"github.com/gravetii/logger"
	"github.com/therecipe/qt/core"
)

// QmlBridge to pass data back and forth to the frontend.
type QmlBridge struct {
	core.QObject
	n *service.NodeService

	// QmlBridge constructor
	_ func() `constructor:"init"`

	// slots
	_ func() `slot:"index"`
	_ func() `slot:"registerToTracker"`
	_ func(term string, sizeKeyIndex int, size string,
		sizeUnitIndex int, fileTypeIndex int) `slot:"search"`

	// signals
	_ func(fpath string) `signal:"FileIndexed"`
	_ func()             `signal:"IndexComplete"`
	_ func(addr string)  `signal:"registerToTrackerComplete"`
}

func (qmlBridge *QmlBridge) init() {
	logger.Infof("Initializing QmlBridge...")
}

func (qmlBridge *QmlBridge) configure(n *service.NodeService) {
	qmlBridge.n = n
	// Connect the index slot to index all the shared files.
	qmlBridge.ConnectIndex(func() {
		paths := make(chan string)
		go func() {
			for p := range paths {
				// Notify frontend when a file is indexed.
				qmlBridge.FileIndexed(p)
			}

			// Notify frontend when all shared files have been indexed.
			qmlBridge.IndexComplete()
		}()

		go qmlBridge.n.Index(paths)
	})

	// Connect the registerToTracker slot to register node to the tracker.
	qmlBridge.ConnectRegisterToTracker(func() {
		// todo: handle error here...
		addr, _ := qmlBridge.n.Register()
		qmlBridge.RegisterToTrackerComplete(addr)
	})

	// Connect the search slot whenever the user searches
	// for files with a query term.
	qmlBridge.ConnectSearch(func(term string, sizeKeyIndex int, size string,
		sizeUnitIndex int, fileTypeIndex int) {
		s := &diztl.SizeConstraint{Key: int32(sizeKeyIndex), Value: size, Unit: int32(sizeUnitIndex)}
		t := &diztl.TypeConstraint{Type: int32(fileTypeIndex)}
		constraint := &diztl.SearchConstraint{S: s, T: t}
		n.Find(term, constraint)
	})
}
