package com.dspractice.bookstore.commonproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: PaymentService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.commonproto.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceInitRequest,
      com.dspractice.bookstore.commonproto.PaymentServiceResponse> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "init",
      requestType = com.dspractice.bookstore.commonproto.PaymentServiceInitRequest.class,
      responseType = com.dspractice.bookstore.commonproto.PaymentServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceInitRequest,
      com.dspractice.bookstore.commonproto.PaymentServiceResponse> getInitMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceInitRequest, com.dspractice.bookstore.commonproto.PaymentServiceResponse> getInitMethod;
    if ((getInitMethod = PaymentServiceGrpc.getInitMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getInitMethod = PaymentServiceGrpc.getInitMethod) == null) {
          PaymentServiceGrpc.getInitMethod = getInitMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.PaymentServiceInitRequest, com.dspractice.bookstore.commonproto.PaymentServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.PaymentServiceInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.PaymentServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("init"))
              .build();
        }
      }
    }
    return getInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest,
      com.dspractice.bookstore.commonproto.PaymentServiceResponse> getCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commit",
      requestType = com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest.class,
      responseType = com.dspractice.bookstore.commonproto.PaymentServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest,
      com.dspractice.bookstore.commonproto.PaymentServiceResponse> getCommitMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest, com.dspractice.bookstore.commonproto.PaymentServiceResponse> getCommitMethod;
    if ((getCommitMethod = PaymentServiceGrpc.getCommitMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getCommitMethod = PaymentServiceGrpc.getCommitMethod) == null) {
          PaymentServiceGrpc.getCommitMethod = getCommitMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest, com.dspractice.bookstore.commonproto.PaymentServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "commit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.PaymentServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("commit"))
              .build();
        }
      }
    }
    return getCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest,
      com.dspractice.bookstore.commonproto.PaymentServiceResponse> getRollbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rollback",
      requestType = com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest.class,
      responseType = com.dspractice.bookstore.commonproto.PaymentServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest,
      com.dspractice.bookstore.commonproto.PaymentServiceResponse> getRollbackMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest, com.dspractice.bookstore.commonproto.PaymentServiceResponse> getRollbackMethod;
    if ((getRollbackMethod = PaymentServiceGrpc.getRollbackMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getRollbackMethod = PaymentServiceGrpc.getRollbackMethod) == null) {
          PaymentServiceGrpc.getRollbackMethod = getRollbackMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest, com.dspractice.bookstore.commonproto.PaymentServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rollback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.PaymentServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("rollback"))
              .build();
        }
      }
    }
    return getRollbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void init(com.dspractice.bookstore.commonproto.PaymentServiceInitRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitMethod(), responseObserver);
    }

    /**
     */
    public void commit(com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitMethod(), responseObserver);
    }

    /**
     */
    public void rollback(com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRollbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.PaymentServiceInitRequest,
                com.dspractice.bookstore.commonproto.PaymentServiceResponse>(
                  this, METHODID_INIT)))
          .addMethod(
            getCommitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest,
                com.dspractice.bookstore.commonproto.PaymentServiceResponse>(
                  this, METHODID_COMMIT)))
          .addMethod(
            getRollbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest,
                com.dspractice.bookstore.commonproto.PaymentServiceResponse>(
                  this, METHODID_ROLLBACK)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void init(com.dspractice.bookstore.commonproto.PaymentServiceInitRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rollback(com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRollbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.PaymentServiceResponse init(com.dspractice.bookstore.commonproto.PaymentServiceInitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.PaymentServiceResponse commit(com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.PaymentServiceResponse rollback(com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRollbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.PaymentServiceResponse> init(
        com.dspractice.bookstore.commonproto.PaymentServiceInitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.PaymentServiceResponse> commit(
        com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.PaymentServiceResponse> rollback(
        com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRollbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT = 0;
  private static final int METHODID_COMMIT = 1;
  private static final int METHODID_ROLLBACK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INIT:
          serviceImpl.init((com.dspractice.bookstore.commonproto.PaymentServiceInitRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((com.dspractice.bookstore.commonproto.PaymentServiceCommitRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse>) responseObserver);
          break;
        case METHODID_ROLLBACK:
          serviceImpl.rollback((com.dspractice.bookstore.commonproto.PaymentServiceRollbackRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.PaymentServiceResponse>) responseObserver);
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

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.commonproto.PaymentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getInitMethod())
              .addMethod(getCommitMethod())
              .addMethod(getRollbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
