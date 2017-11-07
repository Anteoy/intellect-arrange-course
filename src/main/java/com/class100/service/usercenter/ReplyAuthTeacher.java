// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

/**
 * Protobuf type {@code custom_proto.ReplyAuthTeacher}
 */
public  final class ReplyAuthTeacher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.ReplyAuthTeacher)
    ReplyAuthTeacherOrBuilder {
  // Use ReplyAuthTeacher.newBuilder() to construct.
  private ReplyAuthTeacher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplyAuthTeacher() {
    message_ = "";
    code_ = "";
    token_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReplyAuthTeacher(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            code_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 34: {
            com.class100.service.usercenter.RequestRTeacherStruct.Builder subBuilder = null;
            if (teacherInfo_ != null) {
              subBuilder = teacherInfo_.toBuilder();
            }
            teacherInfo_ = input.readMessage(com.class100.service.usercenter.RequestRTeacherStruct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(teacherInfo_);
              teacherInfo_ = subBuilder.buildPartial();
            }

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
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyAuthTeacher_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyAuthTeacher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.class100.service.usercenter.ReplyAuthTeacher.class, com.class100.service.usercenter.ReplyAuthTeacher.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 1;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object code_;
  /**
   * <pre>
   *200 认证成功 401 认证失败 500 服务器内部错误
   * </pre>
   *
   * <code>string code = 2;</code>
   */
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *200 认证成功 401 认证失败 500 服务器内部错误
   * </pre>
   *
   * <code>string code = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object token_;
  /**
   * <code>string token = 3;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEACHERINFO_FIELD_NUMBER = 4;
  private com.class100.service.usercenter.RequestRTeacherStruct teacherInfo_;
  /**
   * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
   */
  public boolean hasTeacherInfo() {
    return teacherInfo_ != null;
  }
  /**
   * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
   */
  public com.class100.service.usercenter.RequestRTeacherStruct getTeacherInfo() {
    return teacherInfo_ == null ? com.class100.service.usercenter.RequestRTeacherStruct.getDefaultInstance() : teacherInfo_;
  }
  /**
   * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
   */
  public com.class100.service.usercenter.RequestRTeacherStructOrBuilder getTeacherInfoOrBuilder() {
    return getTeacherInfo();
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
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (!getCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
    }
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, token_);
    }
    if (teacherInfo_ != null) {
      output.writeMessage(4, getTeacherInfo());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (!getCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
    }
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, token_);
    }
    if (teacherInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTeacherInfo());
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
    if (!(obj instanceof com.class100.service.usercenter.ReplyAuthTeacher)) {
      return super.equals(obj);
    }
    com.class100.service.usercenter.ReplyAuthTeacher other = (com.class100.service.usercenter.ReplyAuthTeacher) obj;

    boolean result = true;
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getCode()
        .equals(other.getCode());
    result = result && getToken()
        .equals(other.getToken());
    result = result && (hasTeacherInfo() == other.hasTeacherInfo());
    if (hasTeacherInfo()) {
      result = result && getTeacherInfo()
          .equals(other.getTeacherInfo());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    if (hasTeacherInfo()) {
      hash = (37 * hash) + TEACHERINFO_FIELD_NUMBER;
      hash = (53 * hash) + getTeacherInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReplyAuthTeacher parseFrom(
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
  public static Builder newBuilder(com.class100.service.usercenter.ReplyAuthTeacher prototype) {
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
   * Protobuf type {@code custom_proto.ReplyAuthTeacher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.ReplyAuthTeacher)
      com.class100.service.usercenter.ReplyAuthTeacherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyAuthTeacher_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyAuthTeacher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.class100.service.usercenter.ReplyAuthTeacher.class, com.class100.service.usercenter.ReplyAuthTeacher.Builder.class);
    }

    // Construct using com.class100.service.usercenter.ReplyAuthTeacher.newBuilder()
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
      message_ = "";

      code_ = "";

      token_ = "";

      if (teacherInfoBuilder_ == null) {
        teacherInfo_ = null;
      } else {
        teacherInfo_ = null;
        teacherInfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyAuthTeacher_descriptor;
    }

    public com.class100.service.usercenter.ReplyAuthTeacher getDefaultInstanceForType() {
      return com.class100.service.usercenter.ReplyAuthTeacher.getDefaultInstance();
    }

    public com.class100.service.usercenter.ReplyAuthTeacher build() {
      com.class100.service.usercenter.ReplyAuthTeacher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.class100.service.usercenter.ReplyAuthTeacher buildPartial() {
      com.class100.service.usercenter.ReplyAuthTeacher result = new com.class100.service.usercenter.ReplyAuthTeacher(this);
      result.message_ = message_;
      result.code_ = code_;
      result.token_ = token_;
      if (teacherInfoBuilder_ == null) {
        result.teacherInfo_ = teacherInfo_;
      } else {
        result.teacherInfo_ = teacherInfoBuilder_.build();
      }
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
      if (other instanceof com.class100.service.usercenter.ReplyAuthTeacher) {
        return mergeFrom((com.class100.service.usercenter.ReplyAuthTeacher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.class100.service.usercenter.ReplyAuthTeacher other) {
      if (other == com.class100.service.usercenter.ReplyAuthTeacher.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (other.hasTeacherInfo()) {
        mergeTeacherInfo(other.getTeacherInfo());
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
      com.class100.service.usercenter.ReplyAuthTeacher parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.class100.service.usercenter.ReplyAuthTeacher) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     * <pre>
     *200 认证成功 401 认证失败 500 服务器内部错误
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *200 认证成功 401 认证失败 500 服务器内部错误
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *200 认证成功 401 认证失败 500 服务器内部错误
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *200 认证成功 401 认证失败 500 服务器内部错误
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public Builder clearCode() {
      
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *200 认证成功 401 认证失败 500 服务器内部错误
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      code_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 3;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 3;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 3;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>string token = 3;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private com.class100.service.usercenter.RequestRTeacherStruct teacherInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.class100.service.usercenter.RequestRTeacherStruct, com.class100.service.usercenter.RequestRTeacherStruct.Builder, com.class100.service.usercenter.RequestRTeacherStructOrBuilder> teacherInfoBuilder_;
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public boolean hasTeacherInfo() {
      return teacherInfoBuilder_ != null || teacherInfo_ != null;
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public com.class100.service.usercenter.RequestRTeacherStruct getTeacherInfo() {
      if (teacherInfoBuilder_ == null) {
        return teacherInfo_ == null ? com.class100.service.usercenter.RequestRTeacherStruct.getDefaultInstance() : teacherInfo_;
      } else {
        return teacherInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public Builder setTeacherInfo(com.class100.service.usercenter.RequestRTeacherStruct value) {
      if (teacherInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        teacherInfo_ = value;
        onChanged();
      } else {
        teacherInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public Builder setTeacherInfo(
        com.class100.service.usercenter.RequestRTeacherStruct.Builder builderForValue) {
      if (teacherInfoBuilder_ == null) {
        teacherInfo_ = builderForValue.build();
        onChanged();
      } else {
        teacherInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public Builder mergeTeacherInfo(com.class100.service.usercenter.RequestRTeacherStruct value) {
      if (teacherInfoBuilder_ == null) {
        if (teacherInfo_ != null) {
          teacherInfo_ =
            com.class100.service.usercenter.RequestRTeacherStruct.newBuilder(teacherInfo_).mergeFrom(value).buildPartial();
        } else {
          teacherInfo_ = value;
        }
        onChanged();
      } else {
        teacherInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public Builder clearTeacherInfo() {
      if (teacherInfoBuilder_ == null) {
        teacherInfo_ = null;
        onChanged();
      } else {
        teacherInfo_ = null;
        teacherInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public com.class100.service.usercenter.RequestRTeacherStruct.Builder getTeacherInfoBuilder() {
      
      onChanged();
      return getTeacherInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    public com.class100.service.usercenter.RequestRTeacherStructOrBuilder getTeacherInfoOrBuilder() {
      if (teacherInfoBuilder_ != null) {
        return teacherInfoBuilder_.getMessageOrBuilder();
      } else {
        return teacherInfo_ == null ?
            com.class100.service.usercenter.RequestRTeacherStruct.getDefaultInstance() : teacherInfo_;
      }
    }
    /**
     * <code>.custom_proto.RequestRTeacherStruct teacherInfo = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.class100.service.usercenter.RequestRTeacherStruct, com.class100.service.usercenter.RequestRTeacherStruct.Builder, com.class100.service.usercenter.RequestRTeacherStructOrBuilder> 
        getTeacherInfoFieldBuilder() {
      if (teacherInfoBuilder_ == null) {
        teacherInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.class100.service.usercenter.RequestRTeacherStruct, com.class100.service.usercenter.RequestRTeacherStruct.Builder, com.class100.service.usercenter.RequestRTeacherStructOrBuilder>(
                getTeacherInfo(),
                getParentForChildren(),
                isClean());
        teacherInfo_ = null;
      }
      return teacherInfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:custom_proto.ReplyAuthTeacher)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.ReplyAuthTeacher)
  private static final com.class100.service.usercenter.ReplyAuthTeacher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.class100.service.usercenter.ReplyAuthTeacher();
  }

  public static com.class100.service.usercenter.ReplyAuthTeacher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplyAuthTeacher>
      PARSER = new com.google.protobuf.AbstractParser<ReplyAuthTeacher>() {
    public ReplyAuthTeacher parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReplyAuthTeacher(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReplyAuthTeacher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplyAuthTeacher> getParserForType() {
    return PARSER;
  }

  public com.class100.service.usercenter.ReplyAuthTeacher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

