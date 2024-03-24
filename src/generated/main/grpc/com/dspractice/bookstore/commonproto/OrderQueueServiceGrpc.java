package com.dspractice.bookstore.commonproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: OrderService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderQueueServiceGrpc {

  private OrderQueueServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.commonproto.OrderQueueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.OrderEnqueueRequest,
      com.dspractice.bookstore.commonproto.OrderEnqueueResponse> getEnqueueOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enqueueOrder",
      requestType = com.dspractice.bookstore.commonproto.OrderEnqueueRequest.class,
      responseType = com.dspractice.bookstore.commonproto.OrderEnqueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.OrderEnqueueRequest,
      com.dspractice.bookstore.commonproto.OrderEnqueueResponse> getEnqueueOrderMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.commonproto.OrderEnqueueRequest, com.dspractice.bookstore.commonproto.OrderEnqueueResponse> getEnqueueOrderMethod;
    if ((getEnqueueOrderMethod = OrderQueueServiceGrpc.getEnqueueOrderMethod) == null) {
      synchronized (OrderQueueServiceGrpc.class) {
        if ((getEnqueueOrderMethod = OrderQueueServiceGrpc.getEnqueueOrderMethod) == null) {
          OrderQueueServiceGrpc.getEnqueueOrderMethod = getEnqueueOrderMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.commonproto.OrderEnqueueRequest, com.dspractice.bookstore.commonproto.OrderEnqueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enqueueOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.OrderEnqueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.commonproto.OrderEnqueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderQueueServiceMethodDescriptorSupplier("enqueueOrder"))
              .build();
        }
      }
    }
    return getEnqueueOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderQueueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderQueueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderQueueServiceStub>() {
        @java.lang.Override
        public OrderQueueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderQueueServiceStub(channel, callOptions);
        }
      };
    return OrderQueueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderQueueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderQueueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderQueueServiceBlockingStub>() {
        @java.lang.Override
        public OrderQueueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderQueueServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderQueueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderQueueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderQueueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderQueueServiceFutureStub>() {
        @java.lang.Override
        public OrderQueueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderQueueServiceFutureStub(channel, callOptions);
        }
      };
    return OrderQueueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderQueueServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  rpc dequeOrder () returns ()
     * </pre>
     */
    public void enqueueOrder(com.dspractice.bookstore.commonproto.OrderEnqueueRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.OrderEnqueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnqueueOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnqueueOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.commonproto.OrderEnqueueRequest,
                com.dspractice.bookstore.commonproto.OrderEnqueueResponse>(
                  this, METHODID_ENQUEUE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class OrderQueueServiceStub extends io.grpc.stub.AbstractAsyncStub<OrderQueueServiceStub> {
    private OrderQueueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderQueueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderQueueServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc dequeOrder () returns ()
     * </pre>
     */
    public void enqueueOrder(com.dspractice.bookstore.commonproto.OrderEnqueueRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.OrderEnqueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnqueueOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderQueueServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderQueueServiceBlockingStub> {
    private OrderQueueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderQueueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderQueueServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc dequeOrder () returns ()
     * </pre>
     */
    public com.dspractice.bookstore.commonproto.OrderEnqueueResponse enqueueOrder(com.dspractice.bookstore.commonproto.OrderEnqueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnqueueOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderQueueServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrderQueueServiceFutureStub> {
    private OrderQueueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderQueueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderQueueServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc dequeOrder () returns ()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.commonproto.OrderEnqueueResponse> enqueueOrder(
        com.dspractice.bookstore.commonproto.OrderEnqueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnqueueOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENQUEUE_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderQueueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderQueueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENQUEUE_ORDER:
          serviceImpl.enqueueOrder((com.dspractice.bookstore.commonproto.OrderEnqueueRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.commonproto.OrderEnqueueResponse>) responseObserver);
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

  private static abstract class OrderQueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderQueueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.commonproto.OrderService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderQueueService");
    }
  }

  private static final class OrderQueueServiceFileDescriptorSupplier
      extends OrderQueueServiceBaseDescriptorSupplier {
    OrderQueueServiceFileDescriptorSupplier() {}
  }

  private static final class OrderQueueServiceMethodDescriptorSupplier
      extends OrderQueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderQueueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderQueueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderQueueServiceFileDescriptorSupplier())
              .addMethod(getEnqueueOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
