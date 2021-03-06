// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.anteoy.service.usercenter;

/**
 * Protobuf type {@code custom_proto.Accelerates}
 */
public  final class Accelerates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.Accelerates)
    AcceleratesOrBuilder {
  // Use Accelerates.newBuilder() to construct.
  private Accelerates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Accelerates() {
    id_ = 0L;
    accelerateLine_ = "";
    monitorWebsocket_ = "";
    classWebsocket_ = "";
    httpServer_ = "";
    janusServer_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Accelerates(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            accelerateLine_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            monitorWebsocket_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            classWebsocket_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            httpServer_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            janusServer_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return UserCenterProto.internal_static_custom_proto_Accelerates_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return UserCenterProto.internal_static_custom_proto_Accelerates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Accelerates.class, Accelerates.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int ACCELERATELINE_FIELD_NUMBER = 2;
  private volatile java.lang.Object accelerateLine_;
  /**
   * <code>string accelerateLine = 2;</code>
   */
  public java.lang.String getAccelerateLine() {
    java.lang.Object ref = accelerateLine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accelerateLine_ = s;
      return s;
    }
  }
  /**
   * <code>string accelerateLine = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAccelerateLineBytes() {
    java.lang.Object ref = accelerateLine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accelerateLine_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MONITORWEBSOCKET_FIELD_NUMBER = 3;
  private volatile java.lang.Object monitorWebsocket_;
  /**
   * <code>string monitorWebsocket = 3;</code>
   */
  public java.lang.String getMonitorWebsocket() {
    java.lang.Object ref = monitorWebsocket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      monitorWebsocket_ = s;
      return s;
    }
  }
  /**
   * <code>string monitorWebsocket = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMonitorWebsocketBytes() {
    java.lang.Object ref = monitorWebsocket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      monitorWebsocket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLASSWEBSOCKET_FIELD_NUMBER = 4;
  private volatile java.lang.Object classWebsocket_;
  /**
   * <code>string classWebsocket = 4;</code>
   */
  public java.lang.String getClassWebsocket() {
    java.lang.Object ref = classWebsocket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classWebsocket_ = s;
      return s;
    }
  }
  /**
   * <code>string classWebsocket = 4;</code>
   */
  public com.google.protobuf.ByteString
      getClassWebsocketBytes() {
    java.lang.Object ref = classWebsocket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classWebsocket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HTTPSERVER_FIELD_NUMBER = 5;
  private volatile java.lang.Object httpServer_;
  /**
   * <code>string httpServer = 5;</code>
   */
  public java.lang.String getHttpServer() {
    java.lang.Object ref = httpServer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      httpServer_ = s;
      return s;
    }
  }
  /**
   * <code>string httpServer = 5;</code>
   */
  public com.google.protobuf.ByteString
      getHttpServerBytes() {
    java.lang.Object ref = httpServer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      httpServer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JANUSSERVER_FIELD_NUMBER = 6;
  private volatile java.lang.Object janusServer_;
  /**
   * <code>string janusServer = 6;</code>
   */
  public java.lang.String getJanusServer() {
    java.lang.Object ref = janusServer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      janusServer_ = s;
      return s;
    }
  }
  /**
   * <code>string janusServer = 6;</code>
   */
  public com.google.protobuf.ByteString
      getJanusServerBytes() {
    java.lang.Object ref = janusServer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      janusServer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getAccelerateLineBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accelerateLine_);
    }
    if (!getMonitorWebsocketBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, monitorWebsocket_);
    }
    if (!getClassWebsocketBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, classWebsocket_);
    }
    if (!getHttpServerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, httpServer_);
    }
    if (!getJanusServerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, janusServer_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getAccelerateLineBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accelerateLine_);
    }
    if (!getMonitorWebsocketBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, monitorWebsocket_);
    }
    if (!getClassWebsocketBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, classWebsocket_);
    }
    if (!getHttpServerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, httpServer_);
    }
    if (!getJanusServerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, janusServer_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Accelerates)) {
      return super.equals(obj);
    }
    Accelerates other = (Accelerates) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getAccelerateLine()
        .equals(other.getAccelerateLine());
    result = result && getMonitorWebsocket()
        .equals(other.getMonitorWebsocket());
    result = result && getClassWebsocket()
        .equals(other.getClassWebsocket());
    result = result && getHttpServer()
        .equals(other.getHttpServer());
    result = result && getJanusServer()
        .equals(other.getJanusServer());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + ACCELERATELINE_FIELD_NUMBER;
    hash = (53 * hash) + getAccelerateLine().hashCode();
    hash = (37 * hash) + MONITORWEBSOCKET_FIELD_NUMBER;
    hash = (53 * hash) + getMonitorWebsocket().hashCode();
    hash = (37 * hash) + CLASSWEBSOCKET_FIELD_NUMBER;
    hash = (53 * hash) + getClassWebsocket().hashCode();
    hash = (37 * hash) + HTTPSERVER_FIELD_NUMBER;
    hash = (53 * hash) + getHttpServer().hashCode();
    hash = (37 * hash) + JANUSSERVER_FIELD_NUMBER;
    hash = (53 * hash) + getJanusServer().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Accelerates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Accelerates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Accelerates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Accelerates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Accelerates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Accelerates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Accelerates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Accelerates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Accelerates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Accelerates parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Accelerates prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code custom_proto.Accelerates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.Accelerates)
          AcceleratesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserCenterProto.internal_static_custom_proto_Accelerates_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserCenterProto.internal_static_custom_proto_Accelerates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Accelerates.class, Accelerates.Builder.class);
    }

    // Construct using Accelerates.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      accelerateLine_ = "";

      monitorWebsocket_ = "";

      classWebsocket_ = "";

      httpServer_ = "";

      janusServer_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return UserCenterProto.internal_static_custom_proto_Accelerates_descriptor;
    }

    public Accelerates getDefaultInstanceForType() {
      return Accelerates.getDefaultInstance();
    }

    public Accelerates build() {
      Accelerates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Accelerates buildPartial() {
      Accelerates result = new Accelerates(this);
      result.id_ = id_;
      result.accelerateLine_ = accelerateLine_;
      result.monitorWebsocket_ = monitorWebsocket_;
      result.classWebsocket_ = classWebsocket_;
      result.httpServer_ = httpServer_;
      result.janusServer_ = janusServer_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Accelerates) {
        return mergeFrom((Accelerates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Accelerates other) {
      if (other == Accelerates.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getAccelerateLine().isEmpty()) {
        accelerateLine_ = other.accelerateLine_;
        onChanged();
      }
      if (!other.getMonitorWebsocket().isEmpty()) {
        monitorWebsocket_ = other.monitorWebsocket_;
        onChanged();
      }
      if (!other.getClassWebsocket().isEmpty()) {
        classWebsocket_ = other.classWebsocket_;
        onChanged();
      }
      if (!other.getHttpServer().isEmpty()) {
        httpServer_ = other.httpServer_;
        onChanged();
      }
      if (!other.getJanusServer().isEmpty()) {
        janusServer_ = other.janusServer_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Accelerates parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Accelerates) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object accelerateLine_ = "";
    /**
     * <code>string accelerateLine = 2;</code>
     */
    public java.lang.String getAccelerateLine() {
      java.lang.Object ref = accelerateLine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accelerateLine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string accelerateLine = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAccelerateLineBytes() {
      java.lang.Object ref = accelerateLine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accelerateLine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string accelerateLine = 2;</code>
     */
    public Builder setAccelerateLine(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accelerateLine_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string accelerateLine = 2;</code>
     */
    public Builder clearAccelerateLine() {
      
      accelerateLine_ = getDefaultInstance().getAccelerateLine();
      onChanged();
      return this;
    }
    /**
     * <code>string accelerateLine = 2;</code>
     */
    public Builder setAccelerateLineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accelerateLine_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object monitorWebsocket_ = "";
    /**
     * <code>string monitorWebsocket = 3;</code>
     */
    public java.lang.String getMonitorWebsocket() {
      java.lang.Object ref = monitorWebsocket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        monitorWebsocket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string monitorWebsocket = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMonitorWebsocketBytes() {
      java.lang.Object ref = monitorWebsocket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        monitorWebsocket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string monitorWebsocket = 3;</code>
     */
    public Builder setMonitorWebsocket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      monitorWebsocket_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string monitorWebsocket = 3;</code>
     */
    public Builder clearMonitorWebsocket() {
      
      monitorWebsocket_ = getDefaultInstance().getMonitorWebsocket();
      onChanged();
      return this;
    }
    /**
     * <code>string monitorWebsocket = 3;</code>
     */
    public Builder setMonitorWebsocketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      monitorWebsocket_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object classWebsocket_ = "";
    /**
     * <code>string classWebsocket = 4;</code>
     */
    public java.lang.String getClassWebsocket() {
      java.lang.Object ref = classWebsocket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classWebsocket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string classWebsocket = 4;</code>
     */
    public com.google.protobuf.ByteString
        getClassWebsocketBytes() {
      java.lang.Object ref = classWebsocket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classWebsocket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string classWebsocket = 4;</code>
     */
    public Builder setClassWebsocket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      classWebsocket_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string classWebsocket = 4;</code>
     */
    public Builder clearClassWebsocket() {
      
      classWebsocket_ = getDefaultInstance().getClassWebsocket();
      onChanged();
      return this;
    }
    /**
     * <code>string classWebsocket = 4;</code>
     */
    public Builder setClassWebsocketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      classWebsocket_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object httpServer_ = "";
    /**
     * <code>string httpServer = 5;</code>
     */
    public java.lang.String getHttpServer() {
      java.lang.Object ref = httpServer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        httpServer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string httpServer = 5;</code>
     */
    public com.google.protobuf.ByteString
        getHttpServerBytes() {
      java.lang.Object ref = httpServer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        httpServer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string httpServer = 5;</code>
     */
    public Builder setHttpServer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      httpServer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string httpServer = 5;</code>
     */
    public Builder clearHttpServer() {
      
      httpServer_ = getDefaultInstance().getHttpServer();
      onChanged();
      return this;
    }
    /**
     * <code>string httpServer = 5;</code>
     */
    public Builder setHttpServerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      httpServer_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object janusServer_ = "";
    /**
     * <code>string janusServer = 6;</code>
     */
    public java.lang.String getJanusServer() {
      java.lang.Object ref = janusServer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        janusServer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string janusServer = 6;</code>
     */
    public com.google.protobuf.ByteString
        getJanusServerBytes() {
      java.lang.Object ref = janusServer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        janusServer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string janusServer = 6;</code>
     */
    public Builder setJanusServer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      janusServer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string janusServer = 6;</code>
     */
    public Builder clearJanusServer() {
      
      janusServer_ = getDefaultInstance().getJanusServer();
      onChanged();
      return this;
    }
    /**
     * <code>string janusServer = 6;</code>
     */
    public Builder setJanusServerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      janusServer_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:custom_proto.Accelerates)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.Accelerates)
  private static final Accelerates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Accelerates();
  }

  public static Accelerates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Accelerates>
      PARSER = new com.google.protobuf.AbstractParser<Accelerates>() {
    public Accelerates parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Accelerates(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Accelerates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Accelerates> getParserForType() {
    return PARSER;
  }

  public Accelerates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

