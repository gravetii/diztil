// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: diztl.proto

package io.github.gravetii.grpc;

public interface SearchReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The filename to search for.
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * The filename to search for.
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * The origin node of this request.
   * </pre>
   *
   * <code>.Node source = 2;</code>
   */
  boolean hasSource();
  /**
   * <pre>
   * The origin node of this request.
   * </pre>
   *
   * <code>.Node source = 2;</code>
   */
  io.github.gravetii.grpc.Node getSource();
  /**
   * <pre>
   * The origin node of this request.
   * </pre>
   *
   * <code>.Node source = 2;</code>
   */
  io.github.gravetii.grpc.NodeOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * The search constraints
   * </pre>
   *
   * <code>.SearchConstraints constraints = 3;</code>
   */
  boolean hasConstraints();
  /**
   * <pre>
   * The search constraints
   * </pre>
   *
   * <code>.SearchConstraints constraints = 3;</code>
   */
  io.github.gravetii.grpc.SearchConstraints getConstraints();
  /**
   * <pre>
   * The search constraints
   * </pre>
   *
   * <code>.SearchConstraints constraints = 3;</code>
   */
  io.github.gravetii.grpc.SearchConstraintsOrBuilder getConstraintsOrBuilder();
}
