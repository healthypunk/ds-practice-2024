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
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest,
      com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse> getDetectCardFraudMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "detectCardFraud",
      requestType = com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest.class,
      responseType = com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest,
      com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse> getDetectCardFraudMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest, com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse> getDetectCardFraudMethod;
    if ((getDetectCardFraudMethod = FraudDetectionServiceGrpc.getDetectCardFraudMethod) == null) {
      synchronized (FraudDetectionServiceGrpc.class) {
        if ((getDetectCardFraudMethod = FraudDetectionServiceGrpc.getDetectCardFraudMethod) == null) {
          FraudDetectionServiceGrpc.getDetectCardFraudMethod = getDetectCardFraudMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest, com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "detectCardFraud"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FraudDetectionServiceMethodDescriptorSupplier("detectCardFraud"))
              .build();
        }
      }
    }
    return getDetectCardFraudMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudUserDataRequest,
      com.dspractice.bookstore.commonproto.FraudUserDataResponse> getDetectUserDataFraudMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "detectUserDataFraud",
      requestType = com.dspractice.bookstore.commonproto.FraudUserDataRequest.class,
      responseType = com.dspractice.bookstore.commonproto.FraudUserDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudUserDataRequest,
      com.dspractice.bookstore.commonproto.FraudUserDataResponse> getDetectUserDataFraudMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.FraudUserDataRequest, com.dspractice.bookstore.commonproto.FraudUserDataResponse> getDetectUserDataFraudMethod;
    if ((getDetectUserDataFraudMethod = FraudDetectionServiceGrpc.getDetectUserDataFraudMethod) == null) {
      synchronized (FraudDetectionServiceGrpc.class) {
        if ((getDetectUserDataFraudMethod = FraudDetectionServiceGrpc.getDetectUserDataFraudMethod) == null) {
          FraudDetectionServiceGrpc.getDetectUserDataFraudMethod = getDetectUserDataFraudMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.FraudUserDataRequest, com.dspractice.bookstore.commonproto.FraudUserDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "detectUserDataFraud"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.FraudUserDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.FraudUserDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FraudDetectionServiceMethodDescriptorSupplier("detectUserDataFraud"))
              .build();
        }
      }
    }
    return getDetectUserDataFraudMethod;
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
    public void detectCardFraud(com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetectCardFraudMethod(), responseObserver);
    }

    /**
     */
    public void detectUserDataFraud(com.dspractice.bookstore.commonproto.FraudUserDataRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudUserDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetectUserDataFraudMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectCardFraudMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest,
                com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse>(
                  this, METHODID_DETECT_CARD_FRAUD)))
          .addMethod(
            getDetectUserDataFraudMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.FraudUserDataRequest,
                com.dspractice.bookstore.commonproto.FraudUserDataResponse>(
                  this, METHODID_DETECT_USER_DATA_FRAUD)))
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
    public void detectCardFraud(com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetectCardFraudMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void detectUserDataFraud(com.dspractice.bookstore.commonproto.FraudUserDataRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudUserDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetectUserDataFraudMethod(), getCallOptions()), request, responseObserver);
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
    public com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse detectCardFraud(com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetectCardFraudMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.FraudUserDataResponse detectUserDataFraud(com.dspractice.bookstore.commonproto.FraudUserDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetectUserDataFraudMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse> detectCardFraud(
        com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetectCardFraudMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.FraudUserDataResponse> detectUserDataFraud(
        com.dspractice.bookstore.commonproto.FraudUserDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetectUserDataFraudMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_CARD_FRAUD = 0;
  private static final int METHODID_DETECT_USER_DATA_FRAUD = 1;

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
        case METHODID_DETECT_CARD_FRAUD:
          serviceImpl.detectCardFraud((com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudCreditCardDetectionResponse>) responseObserver);
          break;
        case METHODID_DETECT_USER_DATA_FRAUD:
          serviceImpl.detectUserDataFraud((com.dspractice.bookstore.commonproto.FraudUserDataRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.FraudUserDataResponse>) responseObserver);
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
              .addMethod(getDetectCardFraudMethod())
              .addMethod(getDetectUserDataFraudMethod())
              .build();
        }
      }
    }
    return result;
  }
}
