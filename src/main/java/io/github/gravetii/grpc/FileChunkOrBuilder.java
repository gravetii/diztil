// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: diztl.proto

package io.github.gravetii.grpc;

public interface FileChunkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FileChunk)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metadata of the parent file typically sent in the first file chunk.
   * </pre>
   *
   * <code>.FileMetadata metadata = 1;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * The metadata of the parent file typically sent in the first file chunk.
   * </pre>
   *
   * <code>.FileMetadata metadata = 1;</code>
   */
  io.github.gravetii.grpc.FileMetadata getMetadata();
  /**
   * <pre>
   * The metadata of the parent file typically sent in the first file chunk.
   * </pre>
   *
   * <code>.FileMetadata metadata = 1;</code>
   */
  io.github.gravetii.grpc.FileMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * The data of this file chunk.
   * </pre>
   *
   * <code>bytes data = 2;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * The chunk number of this chunk of data starting from one.
   * </pre>
   *
   * <code>int32 chunk = 3;</code>
   */
  int getChunk();

  /**
   * <pre>
   * The total number of chunks of this file that the receiver should
   * expect...sent only in the first file chunk.
   * </pre>
   *
   * <code>int32 chunks = 4;</code>
   */
  int getChunks();
}
