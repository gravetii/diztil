// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: diztl.proto

package io.github.gravetii.grpc;

public interface FileMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FileMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The directory containing this file.
   * </pre>
   *
   * <code>string dir = 1;</code>
   */
  java.lang.String getDir();
  /**
   * <pre>
   * The directory containing this file.
   * </pre>
   *
   * <code>string dir = 1;</code>
   */
  com.google.protobuf.ByteString
      getDirBytes();

  /**
   * <pre>
   * ID of the file in the local namespace.
   * </pre>
   *
   * <code>int32 id = 2;</code>
   */
  int getId();

  /**
   * <pre>
   * Size of the file in bytes.
   * </pre>
   *
   * <code>int64 size = 3;</code>
   */
  long getSize();

  /**
   * <pre>
   * Name of the file.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the file.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The hash data of the file.
   * </pre>
   *
   * <code>.FileHash hash = 5;</code>
   */
  boolean hasHash();
  /**
   * <pre>
   * The hash data of the file.
   * </pre>
   *
   * <code>.FileHash hash = 5;</code>
   */
  io.github.gravetii.grpc.FileHash getHash();
  /**
   * <pre>
   * The hash data of the file.
   * </pre>
   *
   * <code>.FileHash hash = 5;</code>
   */
  io.github.gravetii.grpc.FileHashOrBuilder getHashOrBuilder();
}
