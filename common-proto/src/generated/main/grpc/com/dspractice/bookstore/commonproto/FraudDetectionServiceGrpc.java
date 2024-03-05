package com.dspractice.bookstore.commonproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: FraudService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FraudDetectionServiceGrpc {

  private FraudDetectionServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.commonproto.FraudDetectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest,
      com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse> getDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "detect",
      requestType = com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest.class,
      responseType = com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest,
      com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse> getDetectMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest, com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse> getDetectMethod;
    if ((getDetectMethod = FraudDetectionServiceGrpc.getDetectMethod) == null) {
      synchronized (FraudDetectionServiceGrpc.class) {
        if ((getDetectMethod = FraudDetectionServiceGrpc.getDetectMethod) == null) {
          FraudDetectionServiceGrpc.getDetectMethod = getDetectMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest, com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "detect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FraudDetectionServiceMethodDescriptorSupplier("detect"))
              .build();
        }
      }
    }
    return getDetectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FraudDetectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FraudDetectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FraudDetectionServiceStub>() {
        @java.lang.Override
        public FraudDetectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FraudDetectionServiceStub(channel, callOptions);
        }
      };
    return FraudDetectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FraudDetectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FraudDetectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FraudDetectionServiceBlockingStub>() {
        @java.lang.Override
        public FraudDetectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FraudDetectionServiceBlockingStub(channel, callOptions);
        }
      };
    return FraudDetectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FraudDetectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FraudDetectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FraudDetectionServiceFutureStub>() {
        @java.lang.Override
        public FraudDetectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FraudDetectionServiceFutureStub(channel, callOptions);
        }
      };
    return FraudDetectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FraudDetectionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void detect(com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest,
                com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse>(
                  this, METHODID_DETECT)))
          .build();
    }
  }

  /**
   */
  public static final class FraudDetectionServiceStub extends io.grpc.stub.AbstractAsyncStub<FraudDetectionServiceStub> {
    private FraudDetectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FraudDetectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FraudDetectionServiceStub(channel, callOptions);
    }

    /**
     */
    public void detect(com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FraudDetectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FraudDetectionServiceBlockingStub> {
    private FraudDetectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FraudDetectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FraudDetectionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse detect(com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FraudDetectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FraudDetectionServiceFutureStub> {
    private FraudDetectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FraudDetectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FraudDetectionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse> detect(
        com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FraudDetectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FraudDetectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECT:
          serviceImpl.detect((com.dspractice.bookstore.commonproto.FraudService.FraudDetectionRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudService.FraudDetectionResponse>) responseObserver);
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

  private static abstract class FraudDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FraudDetectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.commonproto.FraudService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FraudDetectionService");
    }
  }

  private static final class FraudDetectionServiceFileDescriptorSupplier
      extends FraudDetectionServiceBaseDescriptorSupplier {
    FraudDetectionServiceFileDescriptorSupplier() {}
  }

  private static final class FraudDetectionServiceMethodDescriptorSupplier
      extends FraudDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FraudDetectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FraudDetectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FraudDetectionServiceFileDescriptorSupplier())
              .addMethod(getDetectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
