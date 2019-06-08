package file

import (
	"bufio"
	"bytes"
	"errors"
	"log"
	"os"
	"path"

	"github.com/gravetii/diztl/dir"
	"github.com/gravetii/diztl/diztl"
)

// Writer - the file writer.
type Writer struct {
	metadata *diztl.FileMetadata
	buf      *bufio.Writer
	f        *os.File
}

// Close closes the resources held by this writer and returns the created file after verifying checksum.
func (obj *Writer) Close() (*os.File, error) {
	obj.buf.Flush()
	obj.f.Close()
	if !obj.verifyChecksum() {
		return obj.f, errors.New("Invalid checksum, file is probably corrupted")
	}

	return obj.moveToOutputDir()
}

func (obj *Writer) moveToOutputDir() (*os.File, error) {
	fname := path.Base(obj.f.Name())
	dir.EnsureOutputDir()
	fpath := dir.GetOutputPath(fname)
	if err := os.Rename(obj.f.Name(), fpath); err != nil {
		return nil, err
	}

	f, err := openFile(fpath)
	if err != nil {
		return nil, err
	}

	return f, nil
}

func (obj *Writer) verifyChecksum() bool {
	c := obj.metadata.Hash.Checksum
	hash, err := Hash(obj.f.Name())
	if err != nil {
		log.Printf("Unable to verify checksum for file %s. File is probably corrupted.: %v\n",
			obj.f.Name(), err)
		return false
	}

	return bytes.Equal(c, hash.Checksum)
}

// CreateWriter returns an instance of the Writer for the given file metadata.
func CreateWriter(metadata *diztl.FileMetadata) (*Writer, error) {
	f, err := createFile(metadata.GetName())
	if err != nil {
		return nil, err
	}

	buf := bufio.NewWriter(f)
	return &Writer{metadata, buf, f}, nil
}

func createFile(fname string) (*os.File, error) {
	fpath := dir.GetTempPath(fname)
	f, err := os.Create(fpath)
	if err != nil {
		log.Printf("Unable to create file %s: %v\n", fpath, err)
		return nil, err
	}

	return f, nil
}

// Write writes the given set of bytes to the underlying buffer.
func (obj *Writer) Write(data []byte) error {
	_, err := obj.buf.Write(data)
	return err
}

// Name returns the name of the file that will be created by this file writer.
func (obj *Writer) Name() string {
	return obj.f.Name()
}

// Chunks returns the total number of chunks that need to be written to create the file.
func (obj *Writer) Chunks() int32 {
	return obj.metadata.GetChunks()
}
