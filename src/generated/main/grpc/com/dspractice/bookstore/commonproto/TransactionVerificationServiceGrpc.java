package com.dspractice.bookstore.commonproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: TransactionVerification.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionVerificationServiceGrpc {

  private TransactionVerificationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.commonproto.TransactionVerificationService";

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
    if ((getVerifyBooksMethod = TransactionVerificationServiceGrpc.getVerifyBooksMethod) == null) {
      synchronized (TransactionVerificationServiceGrpc.class) {
        if ((getVerifyBooksMethod = TransactionVerificationServiceGrpc.getVerifyBooksMethod) == null) {
          TransactionVerificationServiceGrpc.getVerifyBooksMethod = getVerifyBooksMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.TransactionBooksRequest, com.dspractice.bookstore.commonproto.TransactionBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verifyBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionVerificationServiceMethodDescriptorSupplier("verifyBooks"))
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
    if ((getVerifyCreditCardMethod = TransactionVerificationServiceGrpc.getVerifyCreditCardMethod) == null) {
      synchronized (TransactionVerificationServiceGrpc.class) {
        if ((getVerifyCreditCardMethod = TransactionVerificationServiceGrpc.getVerifyCreditCardMethod) == null) {
          TransactionVerificationServiceGrpc.getVerifyCreditCardMethod = getVerifyCreditCardMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.TransactionCreditCardRequest, com.dspractice.bookstore.commonproto.TransactionCreditCardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verifyCreditCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionCreditCardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionVerificationServiceMethodDescriptorSupplier("verifyCreditCard"))
              .build();
        }
      }
    }
    return getVerifyCreditCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionContactRequest,
      com.dspractice.bookstore.commonproto.TransactionContactResponse> getVerifyContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verifyContact",
      requestType = com.dspractice.bookstore.commonproto.TransactionContactRequest.class,
      responseType = com.dspractice.bookstore.commonproto.TransactionContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionContactRequest,
      com.dspractice.bookstore.commonproto.TransactionContactResponse> getVerifyContactMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionContactRequest, com.dspractice.bookstore.commonproto.TransactionContactResponse> getVerifyContactMethod;
    if ((getVerifyContactMethod = TransactionVerificationServiceGrpc.getVerifyContactMethod) == null) {
      synchronized (TransactionVerificationServiceGrpc.class) {
        if ((getVerifyContactMethod = TransactionVerificationServiceGrpc.getVerifyContactMethod) == null) {
          TransactionVerificationServiceGrpc.getVerifyContactMethod = getVerifyContactMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.TransactionContactRequest, com.dspractice.bookstore.commonproto.TransactionContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verifyContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionVerificationServiceMethodDescriptorSupplier("verifyContact"))
              .build();
        }
      }
    }
    return getVerifyContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionVerificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionVerificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionVerificationServiceStub>() {
        @java.lang.Override
        public TransactionVerificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionVerificationServiceStub(channel, callOptions);
        }
      };
    return TransactionVerificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionVerificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionVerificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionVerificationServiceBlockingStub>() {
        @java.lang.Override
        public TransactionVerificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionVerificationServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionVerificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionVerificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionVerificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionVerificationServiceFutureStub>() {
        @java.lang.Override
        public TransactionVerificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionVerificationServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionVerificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TransactionVerificationServiceImplBase implements io.grpc.BindableService {

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

    /**
     */
    public void verifyContact(com.dspractice.bookstore.commonproto.TransactionContactRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionContactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyContactMethod(), responseObserver);
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
          .addMethod(
            getVerifyContactMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.TransactionContactRequest,
                com.dspractice.bookstore.commonproto.TransactionContactResponse>(
                  this, METHODID_VERIFY_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionVerificationServiceStub extends io.grpc.stub.AbstractAsyncStub<TransactionVerificationServiceStub> {
    private TransactionVerificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionVerificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionVerificationServiceStub(channel, callOptions);
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

    /**
     */
    public void verifyContact(com.dspractice.bookstore.commonproto.TransactionContactRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionContactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionVerificationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransactionVerificationServiceBlockingStub> {
    private TransactionVerificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionVerificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionVerificationServiceBlockingStub(channel, callOptions);
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

    /**
     */
    public com.dspractice.bookstore.commonproto.TransactionContactResponse verifyContact(com.dspractice.bookstore.commonproto.TransactionContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionVerificationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TransactionVerificationServiceFutureStub> {
    private TransactionVerificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionVerificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionVerificationServiceFutureStub(channel, callOptions);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.TransactionContactResponse> verifyContact(
        com.dspractice.bookstore.commonproto.TransactionContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERIFY_BOOKS = 0;
  private static final int METHODID_VERIFY_CREDIT_CARD = 1;
  private static final int METHODID_VERIFY_CONTACT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionVerificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionVerificationServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_VERIFY_CONTACT:
          serviceImpl.verifyContact((com.dspractice.bookstore.commonproto.TransactionContactRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionContactResponse>) responseObserver);
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

  private static abstract class TransactionVerificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionVerificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionVerificationService");
    }
  }

  private static final class TransactionVerificationServiceFileDescriptorSupplier
      extends TransactionVerificationServiceBaseDescriptorSupplier {
    TransactionVerificationServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionVerificationServiceMethodDescriptorSupplier
      extends TransactionVerificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransactionVerificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransactionVerificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionVerificationServiceFileDescriptorSupplier())
              .addMethod(getVerifyBooksMethod())
              .addMethod(getVerifyCreditCardMethod())
              .addMethod(getVerifyContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
