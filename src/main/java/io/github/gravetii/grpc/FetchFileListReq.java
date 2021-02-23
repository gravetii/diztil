// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: diztl.proto

package io.github.gravetii.grpc;

/**
 * Protobuf type {@code FetchFileListReq}
 */
public  final class FetchFileListReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FetchFileListReq)
    FetchFileListReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetchFileListReq.newBuilder() to construct.
  private FetchFileListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchFileListReq() {
    dir_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FetchFileListReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.github.gravetii.grpc.Node.Builder subBuilder = null;
            if (node_ != null) {
              subBuilder = node_.toBuilder();
            }
            node_ = input.readMessage(io.github.gravetii.grpc.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(node_);
              node_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dir_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.github.gravetii.grpc.Diztl.internal_static_FetchFileListReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.gravetii.grpc.Diztl.internal_static_FetchFileListReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.gravetii.grpc.FetchFileListReq.class, io.github.gravetii.grpc.FetchFileListReq.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;
  private io.github.gravetii.grpc.Node node_;
  /**
   * <code>.Node node = 1;</code>
   */
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   * <code>.Node node = 1;</code>
   */
  public io.github.gravetii.grpc.Node getNode() {
    return node_ == null ? io.github.gravetii.grpc.Node.getDefaultInstance() : node_;
  }
  /**
   * <code>.Node node = 1;</code>
   */
  public io.github.gravetii.grpc.NodeOrBuilder getNodeOrBuilder() {
    return getNode();
  }

  public static final int DIR_FIELD_NUMBER = 2;
  private volatile java.lang.Object dir_;
  /**
   * <code>string dir = 2;</code>
   */
  public java.lang.String getDir() {
    java.lang.Object ref = dir_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dir_ = s;
      return s;
    }
  }
  /**
   * <code>string dir = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDirBytes() {
    java.lang.Object ref = dir_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dir_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (node_ != null) {
      output.writeMessage(1, getNode());
    }
    if (!getDirBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dir_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNode());
    }
    if (!getDirBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dir_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.github.gravetii.grpc.FetchFileListReq)) {
      return super.equals(obj);
    }
    io.github.gravetii.grpc.FetchFileListReq other = (io.github.gravetii.grpc.FetchFileListReq) obj;

    boolean result = true;
    result = result && (hasNode() == other.hasNode());
    if (hasNode()) {
      result = result && getNode()
          .equals(other.getNode());
    }
    result = result && getDir()
        .equals(other.getDir());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    hash = (37 * hash) + DIR_FIELD_NUMBER;
    hash = (53 * hash) + getDir().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.gravetii.grpc.FetchFileListReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.github.gravetii.grpc.FetchFileListReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code FetchFileListReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FetchFileListReq)
      io.github.gravetii.grpc.FetchFileListReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.gravetii.grpc.Diztl.internal_static_FetchFileListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.gravetii.grpc.Diztl.internal_static_FetchFileListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.gravetii.grpc.FetchFileListReq.class, io.github.gravetii.grpc.FetchFileListReq.Builder.class);
    }

    // Construct using io.github.gravetii.grpc.FetchFileListReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nodeBuilder_ == null) {
        node_ = null;
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }
      dir_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.gravetii.grpc.Diztl.internal_static_FetchFileListReq_descriptor;
    }

    @java.lang.Override
    public io.github.gravetii.grpc.FetchFileListReq getDefaultInstanceForType() {
      return io.github.gravetii.grpc.FetchFileListReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.github.gravetii.grpc.FetchFileListReq build() {
      io.github.gravetii.grpc.FetchFileListReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.github.gravetii.grpc.FetchFileListReq buildPartial() {
      io.github.gravetii.grpc.FetchFileListReq result = new io.github.gravetii.grpc.FetchFileListReq(this);
      if (nodeBuilder_ == null) {
        result.node_ = node_;
      } else {
        result.node_ = nodeBuilder_.build();
      }
      result.dir_ = dir_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.github.gravetii.grpc.FetchFileListReq) {
        return mergeFrom((io.github.gravetii.grpc.FetchFileListReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.gravetii.grpc.FetchFileListReq other) {
      if (other == io.github.gravetii.grpc.FetchFileListReq.getDefaultInstance()) return this;
      if (other.hasNode()) {
        mergeNode(other.getNode());
      }
      if (!other.getDir().isEmpty()) {
        dir_ = other.dir_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.github.gravetii.grpc.FetchFileListReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.gravetii.grpc.FetchFileListReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.github.gravetii.grpc.Node node_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.github.gravetii.grpc.Node, io.github.gravetii.grpc.Node.Builder, io.github.gravetii.grpc.NodeOrBuilder> nodeBuilder_;
    /**
     * <code>.Node node = 1;</code>
     */
    public boolean hasNode() {
      return nodeBuilder_ != null || node_ != null;
    }
    /**
     * <code>.Node node = 1;</code>
     */
    public io.github.gravetii.grpc.Node getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? io.github.gravetii.grpc.Node.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.Node node = 1;</code>
     */
    public Builder setNode(io.github.gravetii.grpc.Node value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        nodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Node node = 1;</code>
     */
    public Builder setNode(
        io.github.gravetii.grpc.Node.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Node node = 1;</code>
     */
    public Builder mergeNode(io.github.gravetii.grpc.Node value) {
      if (nodeBuilder_ == null) {
        if (node_ != null) {
          node_ =
            io.github.gravetii.grpc.Node.newBuilder(node_).mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        nodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Node node = 1;</code>
     */
    public Builder clearNode() {
      if (nodeBuilder_ == null) {
        node_ = null;
        onChanged();
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Node node = 1;</code>
     */
    public io.github.gravetii.grpc.Node.Builder getNodeBuilder() {
      
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.Node node = 1;</code>
     */
    public io.github.gravetii.grpc.NodeOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ?
            io.github.gravetii.grpc.Node.getDefaultInstance() : node_;
      }
    }
    /**
     * <code>.Node node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.github.gravetii.grpc.Node, io.github.gravetii.grpc.Node.Builder, io.github.gravetii.grpc.NodeOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.github.gravetii.grpc.Node, io.github.gravetii.grpc.Node.Builder, io.github.gravetii.grpc.NodeOrBuilder>(
                getNode(),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }

    private java.lang.Object dir_ = "";
    /**
     * <code>string dir = 2;</code>
     */
    public java.lang.String getDir() {
      java.lang.Object ref = dir_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dir_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dir = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDirBytes() {
      java.lang.Object ref = dir_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dir_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dir = 2;</code>
     */
    public Builder setDir(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dir_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dir = 2;</code>
     */
    public Builder clearDir() {
      
      dir_ = getDefaultInstance().getDir();
      onChanged();
      return this;
    }
    /**
     * <code>string dir = 2;</code>
     */
    public Builder setDirBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dir_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FetchFileListReq)
  }

  // @@protoc_insertion_point(class_scope:FetchFileListReq)
  private static final io.github.gravetii.grpc.FetchFileListReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.gravetii.grpc.FetchFileListReq();
  }

  public static io.github.gravetii.grpc.FetchFileListReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchFileListReq>
      PARSER = new com.google.protobuf.AbstractParser<FetchFileListReq>() {
    @java.lang.Override
    public FetchFileListReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FetchFileListReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetchFileListReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchFileListReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.github.gravetii.grpc.FetchFileListReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
