package main

import (
	"log"
	"net"

	"github.com/gravetii/diztl/config"
	pb "github.com/gravetii/diztl/diztl"
	"github.com/gravetii/diztl/keeper"
	service "github.com/gravetii/diztl/service"
	"github.com/gravetii/diztl/util"
	"google.golang.org/grpc"
)

func main() {
	lis, err := net.Listen("tcp", ":"+config.TrackerPort)
	if err != nil {
		log.Fatalf("Unable to start server :%v", err)
	}

	s := grpc.NewServer()
	ip := util.GetMyIP()
	nk := keeper.NewNodeKeeper()
	pb.RegisterTrackerServiceServer(s, &service.TrackerService{Nodekeeper: nk})
	log.Printf("Server started on %s:%s\n", ip, config.TrackerPort)
	serr := s.Serve(lis)
	if serr != nil {
		log.Fatalf("Failed to serve: %v\n", err)
	}

	log.Println("Shutting down tracker server.")
}
