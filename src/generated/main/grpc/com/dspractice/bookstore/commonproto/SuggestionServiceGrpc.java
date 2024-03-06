package com.dspractice.bookstore.commonproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: SuggestionService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SuggestionServiceGrpc {

  private SuggestionServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.commonproto.SuggestionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest,
      com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse> getSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "suggest",
      requestType = com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest.class,
      responseType = com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest,
      com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse> getSuggestMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest, com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse> getSuggestMethod;
    if ((getSuggestMethod = SuggestionServiceGrpc.getSuggestMethod) == null) {
      synchronized (SuggestionServiceGrpc.class) {
        if ((getSuggestMethod = SuggestionServiceGrpc.getSuggestMethod) == null) {
          SuggestionServiceGrpc.getSuggestMethod = getSuggestMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest, com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "suggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SuggestionServiceMethodDescriptorSupplier("suggest"))
              .build();
        }
      }
    }
    return getSuggestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SuggestionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SuggestionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SuggestionServiceStub>() {
        @java.lang.Override
        public SuggestionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SuggestionServiceStub(channel, callOptions);
        }
      };
    return SuggestionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SuggestionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SuggestionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SuggestionServiceBlockingStub>() {
        @java.lang.Override
        public SuggestionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SuggestionServiceBlockingStub(channel, callOptions);
        }
      };
    return SuggestionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SuggestionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SuggestionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SuggestionServiceFutureStub>() {
        @java.lang.Override
        public SuggestionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SuggestionServiceFutureStub(channel, callOptions);
        }
      };
    return SuggestionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SuggestionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void suggest(com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSuggestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest,
                com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse>(
                  this, METHODID_SUGGEST)))
          .build();
    }
  }

  /**
   */
  public static final class SuggestionServiceStub extends io.grpc.stub.AbstractAsyncStub<SuggestionServiceStub> {
    private SuggestionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SuggestionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SuggestionServiceStub(channel, callOptions);
    }

    /**
     */
    public void suggest(com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SuggestionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SuggestionServiceBlockingStub> {
    private SuggestionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SuggestionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SuggestionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse suggest(com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SuggestionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SuggestionServiceFutureStub> {
    private SuggestionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SuggestionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SuggestionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse> suggest(
        com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SuggestionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SuggestionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUGGEST:
          serviceImpl.suggest((com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.SuggestionResponse>) responseObserver);
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

  private static abstract class SuggestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SuggestionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SuggestionService");
    }
  }

  private static final class SuggestionServiceFileDescriptorSupplier
      extends SuggestionServiceBaseDescriptorSupplier {
    SuggestionServiceFileDescriptorSupplier() {}
  }

  private static final class SuggestionServiceMethodDescriptorSupplier
      extends SuggestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SuggestionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SuggestionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SuggestionServiceFileDescriptorSupplier())
              .addMethod(getSuggestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
