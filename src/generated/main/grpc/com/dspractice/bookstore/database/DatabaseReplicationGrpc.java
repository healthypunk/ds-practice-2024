package com.dspractice.bookstore.database;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: DatabaseService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatabaseReplicationGrpc {

  private DatabaseReplicationGrpc() {}

  public static final String SERVICE_NAME = "com.dspractice.bookstore.database.DatabaseReplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.database.SnapshotRequest,
      com.dspractice.bookstore.database.SnapshotResponse> getSendSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendSnapshot",
      requestType = com.dspractice.bookstore.database.SnapshotRequest.class,
      responseType = com.dspractice.bookstore.database.SnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.database.SnapshotRequest,
      com.dspractice.bookstore.database.SnapshotResponse> getSendSnapshotMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.database.SnapshotRequest, com.dspractice.bookstore.database.SnapshotResponse> getSendSnapshotMethod;
    if ((getSendSnapshotMethod = DatabaseReplicationGrpc.getSendSnapshotMethod) == null) {
      synchronized (DatabaseReplicationGrpc.class) {
        if ((getSendSnapshotMethod = DatabaseReplicationGrpc.getSendSnapshotMethod) == null) {
          DatabaseReplicationGrpc.getSendSnapshotMethod = getSendSnapshotMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.database.SnapshotRequest, com.dspractice.bookstore.database.SnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.SnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.SnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseReplicationMethodDescriptorSupplier("sendSnapshot"))
              .build();
        }
      }
    }
    return getSendSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.database.UpdateRequest,
      com.dspractice.bookstore.database.UpdateResponse> getSendUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendUpdate",
      requestType = com.dspractice.bookstore.database.UpdateRequest.class,
      responseType = com.dspractice.bookstore.database.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.database.UpdateRequest,
      com.dspractice.bookstore.database.UpdateResponse> getSendUpdateMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.database.UpdateRequest, com.dspractice.bookstore.database.UpdateResponse> getSendUpdateMethod;
    if ((getSendUpdateMethod = DatabaseReplicationGrpc.getSendUpdateMethod) == null) {
      synchronized (DatabaseReplicationGrpc.class) {
        if ((getSendUpdateMethod = DatabaseReplicationGrpc.getSendUpdateMethod) == null) {
          DatabaseReplicationGrpc.getSendUpdateMethod = getSendUpdateMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.database.UpdateRequest, com.dspractice.bookstore.database.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseReplicationMethodDescriptorSupplier("sendUpdate"))
              .build();
        }
      }
    }
    return getSendUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.database.UpdateSinceRequest,
      com.dspractice.bookstore.database.UpdateSinceResponse> getRequestUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "requestUpdates",
      requestType = com.dspractice.bookstore.database.UpdateSinceRequest.class,
      responseType = com.dspractice.bookstore.database.UpdateSinceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.database.UpdateSinceRequest,
      com.dspractice.bookstore.database.UpdateSinceResponse> getRequestUpdatesMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.database.UpdateSinceRequest, com.dspractice.bookstore.database.UpdateSinceResponse> getRequestUpdatesMethod;
    if ((getRequestUpdatesMethod = DatabaseReplicationGrpc.getRequestUpdatesMethod) == null) {
      synchronized (DatabaseReplicationGrpc.class) {
        if ((getRequestUpdatesMethod = DatabaseReplicationGrpc.getRequestUpdatesMethod) == null) {
          DatabaseReplicationGrpc.getRequestUpdatesMethod = getRequestUpdatesMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.database.UpdateSinceRequest, com.dspractice.bookstore.database.UpdateSinceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "requestUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.UpdateSinceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.UpdateSinceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseReplicationMethodDescriptorSupplier("requestUpdates"))
              .build();
        }
      }
    }
    return getRequestUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dspractice.bookstore.database.QueryMasterRequest,
      com.dspractice.bookstore.database.QueryMasterResponse> getIsMasterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isMaster",
      requestType = com.dspractice.bookstore.database.QueryMasterRequest.class,
      responseType = com.dspractice.bookstore.database.QueryMasterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dspractice.bookstore.database.QueryMasterRequest,
      com.dspractice.bookstore.database.QueryMasterResponse> getIsMasterMethod() {
    io.grpc.MethodDescriptor<com.dspractice.bookstore.database.QueryMasterRequest, com.dspractice.bookstore.database.QueryMasterResponse> getIsMasterMethod;
    if ((getIsMasterMethod = DatabaseReplicationGrpc.getIsMasterMethod) == null) {
      synchronized (DatabaseReplicationGrpc.class) {
        if ((getIsMasterMethod = DatabaseReplicationGrpc.getIsMasterMethod) == null) {
          DatabaseReplicationGrpc.getIsMasterMethod = getIsMasterMethod =
              io.grpc.MethodDescriptor.<com.dspractice.bookstore.database.QueryMasterRequest, com.dspractice.bookstore.database.QueryMasterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "isMaster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.QueryMasterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dspractice.bookstore.database.QueryMasterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseReplicationMethodDescriptorSupplier("isMaster"))
              .build();
        }
      }
    }
    return getIsMasterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseReplicationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseReplicationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseReplicationStub>() {
        @java.lang.Override
        public DatabaseReplicationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseReplicationStub(channel, callOptions);
        }
      };
    return DatabaseReplicationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseReplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseReplicationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseReplicationBlockingStub>() {
        @java.lang.Override
        public DatabaseReplicationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseReplicationBlockingStub(channel, callOptions);
        }
      };
    return DatabaseReplicationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseReplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseReplicationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseReplicationFutureStub>() {
        @java.lang.Override
        public DatabaseReplicationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseReplicationFutureStub(channel, callOptions);
        }
      };
    return DatabaseReplicationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DatabaseReplicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendSnapshot(com.dspractice.bookstore.database.SnapshotRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.SnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendSnapshotMethod(), responseObserver);
    }

    /**
     */
    public void sendUpdate(com.dspractice.bookstore.database.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.UpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendUpdateMethod(), responseObserver);
    }

    /**
     */
    public void requestUpdates(com.dspractice.bookstore.database.UpdateSinceRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.UpdateSinceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestUpdatesMethod(), responseObserver);
    }

    /**
     */
    public void isMaster(com.dspractice.bookstore.database.QueryMasterRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.QueryMasterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMasterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.database.SnapshotRequest,
                com.dspractice.bookstore.database.SnapshotResponse>(
                  this, METHODID_SEND_SNAPSHOT)))
          .addMethod(
            getSendUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.database.UpdateRequest,
                com.dspractice.bookstore.database.UpdateResponse>(
                  this, METHODID_SEND_UPDATE)))
          .addMethod(
            getRequestUpdatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.database.UpdateSinceRequest,
                com.dspractice.bookstore.database.UpdateSinceResponse>(
                  this, METHODID_REQUEST_UPDATES)))
          .addMethod(
            getIsMasterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dspractice.bookstore.database.QueryMasterRequest,
                com.dspractice.bookstore.database.QueryMasterResponse>(
                  this, METHODID_IS_MASTER)))
          .build();
    }
  }

  /**
   */
  public static final class DatabaseReplicationStub extends io.grpc.stub.AbstractAsyncStub<DatabaseReplicationStub> {
    private DatabaseReplicationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseReplicationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseReplicationStub(channel, callOptions);
    }

    /**
     */
    public void sendSnapshot(com.dspractice.bookstore.database.SnapshotRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.SnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendUpdate(com.dspractice.bookstore.database.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.UpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestUpdates(com.dspractice.bookstore.database.UpdateSinceRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.UpdateSinceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isMaster(com.dspractice.bookstore.database.QueryMasterRequest request,
        io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.QueryMasterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsMasterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DatabaseReplicationBlockingStub extends io.grpc.stub.AbstractBlockingStub<DatabaseReplicationBlockingStub> {
    private DatabaseReplicationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseReplicationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseReplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dspractice.bookstore.database.SnapshotResponse sendSnapshot(com.dspractice.bookstore.database.SnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendSnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.database.UpdateResponse sendUpdate(com.dspractice.bookstore.database.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.database.UpdateSinceResponse requestUpdates(com.dspractice.bookstore.database.UpdateSinceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestUpdatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dspractice.bookstore.database.QueryMasterResponse isMaster(com.dspractice.bookstore.database.QueryMasterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsMasterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DatabaseReplicationFutureStub extends io.grpc.stub.AbstractFutureStub<DatabaseReplicationFutureStub> {
    private DatabaseReplicationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseReplicationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseReplicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.database.SnapshotResponse> sendSnapshot(
        com.dspractice.bookstore.database.SnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendSnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.database.UpdateResponse> sendUpdate(
        com.dspractice.bookstore.database.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.database.UpdateSinceResponse> requestUpdates(
        com.dspractice.bookstore.database.UpdateSinceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestUpdatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dspractice.bookstore.database.QueryMasterResponse> isMaster(
        com.dspractice.bookstore.database.QueryMasterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsMasterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_SNAPSHOT = 0;
  private static final int METHODID_SEND_UPDATE = 1;
  private static final int METHODID_REQUEST_UPDATES = 2;
  private static final int METHODID_IS_MASTER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatabaseReplicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatabaseReplicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_SNAPSHOT:
          serviceImpl.sendSnapshot((com.dspractice.bookstore.database.SnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.SnapshotResponse>) responseObserver);
          break;
        case METHODID_SEND_UPDATE:
          serviceImpl.sendUpdate((com.dspractice.bookstore.database.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.UpdateResponse>) responseObserver);
          break;
        case METHODID_REQUEST_UPDATES:
          serviceImpl.requestUpdates((com.dspractice.bookstore.database.UpdateSinceRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.UpdateSinceResponse>) responseObserver);
          break;
        case METHODID_IS_MASTER:
          serviceImpl.isMaster((com.dspractice.bookstore.database.QueryMasterRequest) request,
              (io.grpc.stub.StreamObserver<com.dspractice.bookstore.database.QueryMasterResponse>) responseObserver);
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

  private static abstract class DatabaseReplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatabaseReplicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dspractice.bookstore.database.DatabaseServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatabaseReplication");
    }
  }

  private static final class DatabaseReplicationFileDescriptorSupplier
      extends DatabaseReplicationBaseDescriptorSupplier {
    DatabaseReplicationFileDescriptorSupplier() {}
  }

  private static final class DatabaseReplicationMethodDescriptorSupplier
      extends DatabaseReplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatabaseReplicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (DatabaseReplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseReplicationFileDescriptorSupplier())
              .addMethod(getSendSnapshotMethod())
              .addMethod(getSendUpdateMethod())
              .addMethod(getRequestUpdatesMethod())
              .addMethod(getIsMasterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
