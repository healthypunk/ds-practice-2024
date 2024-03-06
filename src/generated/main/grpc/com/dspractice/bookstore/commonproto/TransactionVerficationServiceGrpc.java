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
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest,
      com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verify",
      requestType = com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest.class,
      responseType = com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest,
      com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse> getVerifyMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest, com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse> getVerifyMethod;
    if ((getVerifyMethod = TransactionVerficationServiceGrpc.getVerifyMethod) == null) {
      synchronized (TransactionVerficationServiceGrpc.class) {
        if ((getVerifyMethod = TransactionVerficationServiceGrpc.getVerifyMethod) == null) {
          TransactionVerficationServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest, com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionVerficationServiceMethodDescriptorSupplier("verify"))
              .build();
        }
      }
    }
    return getVerifyMethod;
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
    public void verify(com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVerifyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest,
                com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse>(
                  this, METHODID_VERIFY)))
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
    public void verify(com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
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
    public com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse verify(com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse> verify(
        com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERIFY = 0;

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
        case METHODID_VERIFY:
          serviceImpl.verify((com.dspractice.bookstore.commonproto.TransactionVerification.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.TransactionVerification.TransactionResponse>) responseObserver);
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
              .addMethod(getVerifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
