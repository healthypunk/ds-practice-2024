package com.dspractice.bookstore.commonproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: TransactionVerification.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionVerficationServiceGrpc {

  private TransactionVerficationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.commonproto.TransactionVerficationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionBooksRequest,
      com.dspractice.bookstore.commonproto.TransactionBooksResponse> getVerifyBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verifyBooks",
      requestType = com.dspractice.bookstore.commonproto.TransactionBooksRequest.class,
      responseType = com.dspractice.bookstore.commonproto.TransactionBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionBooksRequest,
      com.dspractice.bookstore.commonproto.TransactionBooksResponse> getVerifyBooksMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionBooksRequest, com.dspractice.bookstore.commonproto.TransactionBooksResponse> getVerifyBooksMethod;
    if ((getVerifyBooksMethod = TransactionVerficationServiceGrpc.getVerifyBooksMethod) == null) {
      synchronized (TransactionVerficationServiceGrpc.class) {
        if ((getVerifyBooksMethod = TransactionVerficationServiceGrpc.getVerifyBooksMethod) == null) {
          TransactionVerficationServiceGrpc.getVerifyBooksMethod = getVerifyBooksMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.TransactionBooksRequest, com.dspractice.bookstore.commonproto.TransactionBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verifyBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionVerficationServiceMethodDescriptorSupplier("verifyBooks"))
              .build();
        }
      }
    }
    return getVerifyBooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionCreditCardRequest,
      com.dspractice.bookstore.commonproto.TransactionCreditCardResponse> getVerifyCreditCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verifyCreditCard",
      requestType = com.dspractice.bookstore.commonproto.TransactionCreditCardRequest.class,
      responseType = com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionCreditCardRequest,
      com.dspractice.bookstore.commonproto.TransactionCreditCardResponse> getVerifyCreditCardMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionCreditCardRequest, com.dspractice.bookstore.commonproto.TransactionCreditCardResponse> getVerifyCreditCardMethod;
    if ((getVerifyCreditCardMethod = TransactionVerficationServiceGrpc.getVerifyCreditCardMethod) == null) {
      synchronized (TransactionVerficationServiceGrpc.class) {
        if ((getVerifyCreditCardMethod = TransactionVerficationServiceGrpc.getVerifyCreditCardMethod) == null) {
          TransactionVerficationServiceGrpc.getVerifyCreditCardMethod = getVerifyCreditCardMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.TransactionCreditCardRequest, com.dspractice.bookstore.commonproto.TransactionCreditCardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verifyCreditCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionCreditCardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionVerficationServiceMethodDescriptorSupplier("verifyCreditCard"))
              .build();
        }
      }
    }
    return getVerifyCreditCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionVerficationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionVerficationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionVerficationServiceStub>() {
        @java.lang.Override
        public TransactionVerficationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionVerficationServiceStub(channel, callOptions);
        }
      };
    return TransactionVerficationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionVerficationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionVerficationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionVerficationServiceBlockingStub>() {
        @java.lang.Override
        public TransactionVerficationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionVerficationServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionVerficationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionVerficationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionVerficationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionVerficationServiceFutureStub>() {
        @java.lang.Override
        public TransactionVerficationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionVerficationServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionVerficationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TransactionVerficationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void verifyBooks(com.dspractice.bookstore.commonproto.TransactionBooksRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyBooksMethod(), responseObserver);
    }

    /**
     */
    public void verifyCreditCard(com.dspractice.bookstore.commonproto.TransactionCreditCardRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionCreditCardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyCreditCardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVerifyBooksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.TransactionBooksRequest,
                com.dspractice.bookstore.commonproto.TransactionBooksResponse>(
                  this, METHODID_VERIFY_BOOKS)))
          .addMethod(
            getVerifyCreditCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.TransactionCreditCardRequest,
                com.dspractice.bookstore.commonproto.TransactionCreditCardResponse>(
                  this, METHODID_VERIFY_CREDIT_CARD)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionVerficationServiceStub extends io.grpc.stub.AbstractAsyncStub<TransactionVerficationServiceStub> {
    private TransactionVerficationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionVerficationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionVerficationServiceStub(channel, callOptions);
    }

    /**
     */
    public void verifyBooks(com.dspractice.bookstore.commonproto.TransactionBooksRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyBooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyCreditCard(com.dspractice.bookstore.commonproto.TransactionCreditCardRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionCreditCardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyCreditCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionVerficationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransactionVerficationServiceBlockingStub> {
    private TransactionVerficationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionVerficationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionVerficationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.TransactionBooksResponse verifyBooks(com.dspractice.bookstore.commonproto.TransactionBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyBooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.TransactionCreditCardResponse verifyCreditCard(com.dspractice.bookstore.commonproto.TransactionCreditCardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyCreditCardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionVerficationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TransactionVerficationServiceFutureStub> {
    private TransactionVerficationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionVerficationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionVerficationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.TransactionBooksResponse> verifyBooks(
        com.dspractice.bookstore.commonproto.TransactionBooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyBooksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.TransactionCreditCardResponse> verifyCreditCard(
        com.dspractice.bookstore.commonproto.TransactionCreditCardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyCreditCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERIFY_BOOKS = 0;
  private static final int METHODID_VERIFY_CREDIT_CARD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionVerficationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionVerficationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VERIFY_BOOKS:
          serviceImpl.verifyBooks((com.dspractice.bookstore.commonproto.TransactionBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionBooksResponse>) responseObserver);
          break;
        case METHODID_VERIFY_CREDIT_CARD:
          serviceImpl.verifyCreditCard((com.dspractice.bookstore.commonproto.TransactionCreditCardRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionCreditCardResponse>) responseObserver);
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

  private static abstract class TransactionVerficationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionVerficationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionVerficationService");
    }
  }

  private static final class TransactionVerficationServiceFileDescriptorSupplier
      extends TransactionVerficationServiceBaseDescriptorSupplier {
    TransactionVerficationServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionVerficationServiceMethodDescriptorSupplier
      extends TransactionVerficationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransactionVerficationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransactionVerficationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionVerficationServiceFileDescriptorSupplier())
              .addMethod(getVerifyBooksMethod())
              .addMethod(getVerifyCreditCardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
