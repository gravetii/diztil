package io.github.gravetii.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: diztl.proto")
public final class DiztlServiceGrpc {

  public static final String SERVICE_NAME = "DiztlService";
  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_UPLOAD = 1;
  private static final int METHODID_PING = 2;
  private static final int METHODID_FIND = 3;
  private static final int METHODID_DOWNLOAD = 4;
  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.SearchReq, io.github.gravetii.gen.Diztl.SearchResp>
      getSearchMethod;
  private static volatile io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.UploadReq, io.github.gravetii.gen.Diztl.FileChunk>
      getUploadMethod;
  private static volatile io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.PingReq, io.github.gravetii.gen.Diztl.PingResp>
      getPingMethod;
  private static volatile io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.FindReq, io.github.gravetii.gen.Diztl.FindResp>
      getFindMethod;
  private static volatile io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.DownloadReq, io.github.gravetii.gen.Diztl.DownloadResp>
      getDownloadMethod;
  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  private DiztlServiceGrpc() {}

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = io.github.gravetii.gen.Diztl.SearchReq.class,
      responseType = io.github.gravetii.gen.Diztl.SearchResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.SearchReq, io.github.gravetii.gen.Diztl.SearchResp>
      getSearchMethod() {
    io.grpc.MethodDescriptor<
            io.github.gravetii.gen.Diztl.SearchReq, io.github.gravetii.gen.Diztl.SearchResp>
        getSearchMethod;
    if ((getSearchMethod = DiztlServiceGrpc.getSearchMethod) == null) {
      synchronized (DiztlServiceGrpc.class) {
        if ((getSearchMethod = DiztlServiceGrpc.getSearchMethod) == null) {
          DiztlServiceGrpc.getSearchMethod =
              getSearchMethod =
                  io.grpc.MethodDescriptor
                      .<io.github.gravetii.gen.Diztl.SearchReq,
                          io.github.gravetii.gen.Diztl.SearchResp>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName("DiztlService", "Search"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.SearchReq.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.SearchResp.getDefaultInstance()))
                      .setSchemaDescriptor(new DiztlServiceMethodDescriptorSupplier("Search"))
                      .build();
        }
      }
    }
    return getSearchMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = io.github.gravetii.gen.Diztl.UploadReq.class,
      responseType = io.github.gravetii.gen.Diztl.FileChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.UploadReq, io.github.gravetii.gen.Diztl.FileChunk>
      getUploadMethod() {
    io.grpc.MethodDescriptor<
            io.github.gravetii.gen.Diztl.UploadReq, io.github.gravetii.gen.Diztl.FileChunk>
        getUploadMethod;
    if ((getUploadMethod = DiztlServiceGrpc.getUploadMethod) == null) {
      synchronized (DiztlServiceGrpc.class) {
        if ((getUploadMethod = DiztlServiceGrpc.getUploadMethod) == null) {
          DiztlServiceGrpc.getUploadMethod =
              getUploadMethod =
                  io.grpc.MethodDescriptor
                      .<io.github.gravetii.gen.Diztl.UploadReq,
                          io.github.gravetii.gen.Diztl.FileChunk>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                      .setFullMethodName(generateFullMethodName("DiztlService", "Upload"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.UploadReq.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.FileChunk.getDefaultInstance()))
                      .setSchemaDescriptor(new DiztlServiceMethodDescriptorSupplier("Upload"))
                      .build();
        }
      }
    }
    return getUploadMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = io.github.gravetii.gen.Diztl.PingReq.class,
      responseType = io.github.gravetii.gen.Diztl.PingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.PingReq, io.github.gravetii.gen.Diztl.PingResp>
      getPingMethod() {
    io.grpc.MethodDescriptor<
            io.github.gravetii.gen.Diztl.PingReq, io.github.gravetii.gen.Diztl.PingResp>
        getPingMethod;
    if ((getPingMethod = DiztlServiceGrpc.getPingMethod) == null) {
      synchronized (DiztlServiceGrpc.class) {
        if ((getPingMethod = DiztlServiceGrpc.getPingMethod) == null) {
          DiztlServiceGrpc.getPingMethod =
              getPingMethod =
                  io.grpc.MethodDescriptor
                      .<io.github.gravetii.gen.Diztl.PingReq, io.github.gravetii.gen.Diztl.PingResp>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName("DiztlService", "Ping"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.PingReq.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.PingResp.getDefaultInstance()))
                      .setSchemaDescriptor(new DiztlServiceMethodDescriptorSupplier("Ping"))
                      .build();
        }
      }
    }
    return getPingMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Find",
      requestType = io.github.gravetii.gen.Diztl.FindReq.class,
      responseType = io.github.gravetii.gen.Diztl.FindResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.FindReq, io.github.gravetii.gen.Diztl.FindResp>
      getFindMethod() {
    io.grpc.MethodDescriptor<
            io.github.gravetii.gen.Diztl.FindReq, io.github.gravetii.gen.Diztl.FindResp>
        getFindMethod;
    if ((getFindMethod = DiztlServiceGrpc.getFindMethod) == null) {
      synchronized (DiztlServiceGrpc.class) {
        if ((getFindMethod = DiztlServiceGrpc.getFindMethod) == null) {
          DiztlServiceGrpc.getFindMethod =
              getFindMethod =
                  io.grpc.MethodDescriptor
                      .<io.github.gravetii.gen.Diztl.FindReq, io.github.gravetii.gen.Diztl.FindResp>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName("DiztlService", "Find"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.FindReq.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.FindResp.getDefaultInstance()))
                      .setSchemaDescriptor(new DiztlServiceMethodDescriptorSupplier("Find"))
                      .build();
        }
      }
    }
    return getFindMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Download",
      requestType = io.github.gravetii.gen.Diztl.DownloadReq.class,
      responseType = io.github.gravetii.gen.Diztl.DownloadResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          io.github.gravetii.gen.Diztl.DownloadReq, io.github.gravetii.gen.Diztl.DownloadResp>
      getDownloadMethod() {
    io.grpc.MethodDescriptor<
            io.github.gravetii.gen.Diztl.DownloadReq, io.github.gravetii.gen.Diztl.DownloadResp>
        getDownloadMethod;
    if ((getDownloadMethod = DiztlServiceGrpc.getDownloadMethod) == null) {
      synchronized (DiztlServiceGrpc.class) {
        if ((getDownloadMethod = DiztlServiceGrpc.getDownloadMethod) == null) {
          DiztlServiceGrpc.getDownloadMethod =
              getDownloadMethod =
                  io.grpc.MethodDescriptor
                      .<io.github.gravetii.gen.Diztl.DownloadReq,
                          io.github.gravetii.gen.Diztl.DownloadResp>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName("DiztlService", "Download"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.DownloadReq.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.github.gravetii.gen.Diztl.DownloadResp.getDefaultInstance()))
                      .setSchemaDescriptor(new DiztlServiceMethodDescriptorSupplier("Download"))
                      .build();
        }
      }
    }
    return getDownloadMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static DiztlServiceStub newStub(io.grpc.Channel channel) {
    return new DiztlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiztlServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new DiztlServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static DiztlServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new DiztlServiceFutureStub(channel);
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DiztlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new DiztlServiceFileDescriptorSupplier())
                      .addMethod(getSearchMethod())
                      .addMethod(getUploadMethod())
                      .addMethod(getPingMethod())
                      .addMethod(getFindMethod())
                      .addMethod(getDownloadMethod())
                      .build();
        }
      }
    }
    return result;
  }

  /** */
  public abstract static class DiztlServiceImplBase implements io.grpc.BindableService {

    /** */
    public void search(
        io.github.gravetii.gen.Diztl.SearchReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.SearchResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /** */
    public void upload(
        io.github.gravetii.gen.Diztl.UploadReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.FileChunk> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /** */
    public void ping(
        io.github.gravetii.gen.Diztl.PingReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.PingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /** */
    public void find(
        io.github.gravetii.gen.Diztl.FindReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.FindResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFindMethod(), responseObserver);
    }

    /** */
    public void download(
        io.github.gravetii.gen.Diztl.DownloadReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.DownloadResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getSearchMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      io.github.gravetii.gen.Diztl.SearchReq,
                      io.github.gravetii.gen.Diztl.SearchResp>(this, METHODID_SEARCH)))
          .addMethod(
              getUploadMethod(),
              asyncServerStreamingCall(
                  new MethodHandlers<
                      io.github.gravetii.gen.Diztl.UploadReq,
                      io.github.gravetii.gen.Diztl.FileChunk>(this, METHODID_UPLOAD)))
          .addMethod(
              getPingMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      io.github.gravetii.gen.Diztl.PingReq, io.github.gravetii.gen.Diztl.PingResp>(
                      this, METHODID_PING)))
          .addMethod(
              getFindMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      io.github.gravetii.gen.Diztl.FindReq, io.github.gravetii.gen.Diztl.FindResp>(
                      this, METHODID_FIND)))
          .addMethod(
              getDownloadMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      io.github.gravetii.gen.Diztl.DownloadReq,
                      io.github.gravetii.gen.Diztl.DownloadResp>(this, METHODID_DOWNLOAD)))
          .build();
    }
  }

  /** */
  public static final class DiztlServiceStub extends io.grpc.stub.AbstractStub<DiztlServiceStub> {
    private DiztlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiztlServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiztlServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiztlServiceStub(channel, callOptions);
    }

    /** */
    public void search(
        io.github.gravetii.gen.Diztl.SearchReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.SearchResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void upload(
        io.github.gravetii.gen.Diztl.UploadReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.FileChunk> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void ping(
        io.github.gravetii.gen.Diztl.PingReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.PingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void find(
        io.github.gravetii.gen.Diztl.FindReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.FindResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void download(
        io.github.gravetii.gen.Diztl.DownloadReq request,
        io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.DownloadResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /** */
  public static final class DiztlServiceBlockingStub
      extends io.grpc.stub.AbstractStub<DiztlServiceBlockingStub> {
    private DiztlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiztlServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiztlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiztlServiceBlockingStub(channel, callOptions);
    }

    /** */
    public io.github.gravetii.gen.Diztl.SearchResp search(
        io.github.gravetii.gen.Diztl.SearchReq request) {
      return blockingUnaryCall(getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /** */
    public java.util.Iterator<io.github.gravetii.gen.Diztl.FileChunk> upload(
        io.github.gravetii.gen.Diztl.UploadReq request) {
      return blockingServerStreamingCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /** */
    public io.github.gravetii.gen.Diztl.PingResp ping(
        io.github.gravetii.gen.Diztl.PingReq request) {
      return blockingUnaryCall(getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /** */
    public io.github.gravetii.gen.Diztl.FindResp find(
        io.github.gravetii.gen.Diztl.FindReq request) {
      return blockingUnaryCall(getChannel(), getFindMethod(), getCallOptions(), request);
    }

    /** */
    public io.github.gravetii.gen.Diztl.DownloadResp download(
        io.github.gravetii.gen.Diztl.DownloadReq request) {
      return blockingUnaryCall(getChannel(), getDownloadMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class DiztlServiceFutureStub
      extends io.grpc.stub.AbstractStub<DiztlServiceFutureStub> {
    private DiztlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiztlServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiztlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiztlServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            io.github.gravetii.gen.Diztl.SearchResp>
        search(io.github.gravetii.gen.Diztl.SearchReq request) {
      return futureUnaryCall(getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<io.github.gravetii.gen.Diztl.PingResp>
        ping(io.github.gravetii.gen.Diztl.PingReq request) {
      return futureUnaryCall(getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<io.github.gravetii.gen.Diztl.FindResp>
        find(io.github.gravetii.gen.Diztl.FindReq request) {
      return futureUnaryCall(getChannel().newCall(getFindMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            io.github.gravetii.gen.Diztl.DownloadResp>
        download(io.github.gravetii.gen.Diztl.DownloadReq request) {
      return futureUnaryCall(getChannel().newCall(getDownloadMethod(), getCallOptions()), request);
    }
  }

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiztlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiztlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search(
              (io.github.gravetii.gen.Diztl.SearchReq) request,
              (io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.SearchResp>)
                  responseObserver);
          break;
        case METHODID_UPLOAD:
          serviceImpl.upload(
              (io.github.gravetii.gen.Diztl.UploadReq) request,
              (io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.FileChunk>)
                  responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping(
              (io.github.gravetii.gen.Diztl.PingReq) request,
              (io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.PingResp>)
                  responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find(
              (io.github.gravetii.gen.Diztl.FindReq) request,
              (io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.FindResp>)
                  responseObserver);
          break;
        case METHODID_DOWNLOAD:
          serviceImpl.download(
              (io.github.gravetii.gen.Diztl.DownloadReq) request,
              (io.grpc.stub.StreamObserver<io.github.gravetii.gen.Diztl.DownloadResp>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class DiztlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiztlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.github.gravetii.gen.Diztl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiztlService");
    }
  }

  private static final class DiztlServiceFileDescriptorSupplier
      extends DiztlServiceBaseDescriptorSupplier {
    DiztlServiceFileDescriptorSupplier() {}
  }

  private static final class DiztlServiceMethodDescriptorSupplier
      extends DiztlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiztlServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }
}