package com.dspractice.bookstore.commonproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: ExecutorService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExecutorServiceGrpc {

  private ExecutorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.commonproto.ExecutorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest,
      com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse> getIsActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isActive",
      requestType = com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest.class,
      responseType = com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest,
      com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse> getIsActiveMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest, com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse> getIsActiveMethod;
    if ((getIsActiveMethod = ExecutorServiceGrpc.getIsActiveMethod) == null) {
      synchronized (ExecutorServiceGrpc.class) {
        if ((getIsActiveMethod = ExecutorServiceGrpc.getIsActiveMethod) == null) {
          ExecutorServiceGrpc.getIsActiveMethod = getIsActiveMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest, com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "isActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutorServiceMethodDescriptorSupplier("isActive"))
              .build();
        }
      }
    }
    return getIsActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest,
      com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "execute",
      requestType = com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest.class,
      responseType = com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest,
      com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse> getExecuteMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest, com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse> getExecuteMethod;
    if ((getExecuteMethod = ExecutorServiceGrpc.getExecuteMethod) == null) {
      synchronized (ExecutorServiceGrpc.class) {
        if ((getExecuteMethod = ExecutorServiceGrpc.getExecuteMethod) == null) {
          ExecutorServiceGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest, com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutorServiceMethodDescriptorSupplier("execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExecutorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutorServiceStub>() {
        @java.lang.Override
        public ExecutorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutorServiceStub(channel, callOptions);
        }
      };
    return ExecutorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExecutorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutorServiceBlockingStub>() {
        @java.lang.Override
        public ExecutorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutorServiceBlockingStub(channel, callOptions);
        }
      };
    return ExecutorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExecutorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutorServiceFutureStub>() {
        @java.lang.Override
        public ExecutorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutorServiceFutureStub(channel, callOptions);
        }
      };
    return ExecutorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExecutorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void isActive(com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsActiveMethod(), responseObserver);
    }

    /**
     */
    public void execute(com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIsActiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest,
                com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse>(
                  this, METHODID_IS_ACTIVE)))
          .addMethod(
            getExecuteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest,
                com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse>(
                  this, METHODID_EXECUTE)))
          .build();
    }
  }

  /**
   */
  public static final class ExecutorServiceStub extends io.grpc.stub.AbstractAsyncStub<ExecutorServiceStub> {
    private ExecutorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutorServiceStub(channel, callOptions);
    }

    /**
     */
    public void isActive(com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execute(com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExecutorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExecutorServiceBlockingStub> {
    private ExecutorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse isActive(com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsActiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse execute(com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExecutorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExecutorServiceFutureStub> {
    private ExecutorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse> isActive(
        com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse> execute(
        com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_ACTIVE = 0;
  private static final int METHODID_EXECUTE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExecutorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExecutorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IS_ACTIVE:
          serviceImpl.isActive((com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse>) responseObserver);
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

  private static abstract class ExecutorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExecutorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.commonproto.ExecutorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExecutorService");
    }
  }

  private static final class ExecutorServiceFileDescriptorSupplier
      extends ExecutorServiceBaseDescriptorSupplier {
    ExecutorServiceFileDescriptorSupplier() {}
  }

  private static final class ExecutorServiceMethodDescriptorSupplier
      extends ExecutorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExecutorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExecutorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExecutorServiceFileDescriptorSupplier())
              .addMethod(getIsActiveMethod())
              .addMethod(getExecuteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
