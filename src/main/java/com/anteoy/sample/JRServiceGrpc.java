package com.anteoy.sample;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: jr.proto")
public final class JRServiceGrpc {

  private JRServiceGrpc() {}

  public static final String SERVICE_NAME = "JRService.JRService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<SingerId,
          SongList> METHOD_LIST_SONGS =
      io.grpc.MethodDescriptor.<SingerId, SongList>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "JRService.JRService", "ListSongs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              SingerId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              SongList.getDefaultInstance()))
          .setSchemaDescriptor(new JRServiceMethodDescriptorSupplier("ListSongs"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<SingerId,
          Song> METHOD_GET_SONGS =
      io.grpc.MethodDescriptor.<SingerId, Song>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "JRService.JRService", "GetSongs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              SingerId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Song.getDefaultInstance()))
          .setSchemaDescriptor(new JRServiceMethodDescriptorSupplier("GetSongs"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JRServiceStub newStub(io.grpc.Channel channel) {
    return new JRServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JRServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JRServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JRServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JRServiceFutureStub(channel);
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static abstract class JRServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listSongs(SingerId request,
        io.grpc.stub.StreamObserver<SongList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SONGS, responseObserver);
    }

    /**
     */
    public void getSongs(SingerId request,
        io.grpc.stub.StreamObserver<Song> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SONGS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_SONGS,
            asyncUnaryCall(
              new MethodHandlers<
                      SingerId,
                      SongList>(
                  this, METHODID_LIST_SONGS)))
          .addMethod(
            METHOD_GET_SONGS,
            asyncServerStreamingCall(
              new MethodHandlers<
                      SingerId,
                      Song>(
                  this, METHODID_GET_SONGS)))
          .build();
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class JRServiceStub extends io.grpc.stub.AbstractStub<JRServiceStub> {
    private JRServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JRServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JRServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JRServiceStub(channel, callOptions);
    }

    /**
     */
    public void listSongs(SingerId request,
        io.grpc.stub.StreamObserver<SongList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SONGS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSongs(SingerId request,
        io.grpc.stub.StreamObserver<Song> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_SONGS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class JRServiceBlockingStub extends io.grpc.stub.AbstractStub<JRServiceBlockingStub> {
    private JRServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JRServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JRServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JRServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public SongList listSongs(SingerId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SONGS, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Song> getSongs(
        SingerId request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_SONGS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class JRServiceFutureStub extends io.grpc.stub.AbstractStub<JRServiceFutureStub> {
    private JRServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JRServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JRServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JRServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SongList> listSongs(
        SingerId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SONGS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SONGS = 0;
  private static final int METHODID_GET_SONGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JRServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JRServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SONGS:
          serviceImpl.listSongs((SingerId) request,
              (io.grpc.stub.StreamObserver<SongList>) responseObserver);
          break;
        case METHODID_GET_SONGS:
          serviceImpl.getSongs((SingerId) request,
              (io.grpc.stub.StreamObserver<Song>) responseObserver);
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

  private static abstract class JRServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JRServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return JRProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JRService");
    }
  }

  private static final class JRServiceFileDescriptorSupplier
      extends JRServiceBaseDescriptorSupplier {
    JRServiceFileDescriptorSupplier() {}
  }

  private static final class JRServiceMethodDescriptorSupplier
      extends JRServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JRServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JRServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JRServiceFileDescriptorSupplier())
              .addMethod(METHOD_LIST_SONGS)
              .addMethod(METHOD_GET_SONGS)
              .build();
        }
      }
    }
    return result;
  }
}
