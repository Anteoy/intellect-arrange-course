// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

/**
 * Protobuf type {@code custom_proto.RepGetAccelerates}
 */
public  final class RepGetAccelerates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.RepGetAccelerates)
    RepGetAcceleratesOrBuilder {
  // Use RepGetAccelerates.newBuilder() to construct.
  private RepGetAccelerates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepGetAccelerates() {
    message_ = "";
    code_ = "";
    sls_ = java.util.Collections.emptyList();
    total_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RepGetAccelerates(
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
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              sls_ = new java.util.ArrayList<com.class100.service.usercenter.Accelerates>();
              mutable_bitField0_ |= 0x00000004;
            }
            sls_.add(
                input.readMessage(com.class100.service.usercenter.Accelerates.parser(), extensionRegistry));
            break;
          }
          case 32: {

            total_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        sls_ = java.util.Collections.unmodifiableList(sls_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RepGetAccelerates_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RepGetAccelerates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.class100.service.usercenter.RepGetAccelerates.class, com.class100.service.usercenter.RepGetAccelerates.Builder.class);
  }

  private int bitField0_;
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

  public static final int SLS_FIELD_NUMBER = 3;
  private java.util.List<com.class100.service.usercenter.Accelerates> sls_;
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  public java.util.List<com.class100.service.usercenter.Accelerates> getSlsList() {
    return sls_;
  }
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  public java.util.List<? extends com.class100.service.usercenter.AcceleratesOrBuilder> 
      getSlsOrBuilderList() {
    return sls_;
  }
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  public int getSlsCount() {
    return sls_.size();
  }
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  public com.class100.service.usercenter.Accelerates getSls(int index) {
    return sls_.get(index);
  }
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  public com.class100.service.usercenter.AcceleratesOrBuilder getSlsOrBuilder(
      int index) {
    return sls_.get(index);
  }

  public static final int TOTAL_FIELD_NUMBER = 4;
  private long total_;
  /**
   * <code>int64 total = 4;</code>
   */
  public long getTotal() {
    return total_;
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
    for (int i = 0; i < sls_.size(); i++) {
      output.writeMessage(3, sls_.get(i));
    }
    if (total_ != 0L) {
      output.writeInt64(4, total_);
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
    for (int i = 0; i < sls_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, sls_.get(i));
    }
    if (total_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, total_);
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
    if (!(obj instanceof com.class100.service.usercenter.RepGetAccelerates)) {
      return super.equals(obj);
    }
    com.class100.service.usercenter.RepGetAccelerates other = (com.class100.service.usercenter.RepGetAccelerates) obj;

    boolean result = true;
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getCode()
        .equals(other.getCode());
    result = result && getSlsList()
        .equals(other.getSlsList());
    result = result && (getTotal()
        == other.getTotal());
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
    if (getSlsCount() > 0) {
      hash = (37 * hash) + SLS_FIELD_NUMBER;
      hash = (53 * hash) + getSlsList().hashCode();
    }
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotal());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.RepGetAccelerates parseFrom(
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
  public static Builder newBuilder(com.class100.service.usercenter.RepGetAccelerates prototype) {
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
   * Protobuf type {@code custom_proto.RepGetAccelerates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.RepGetAccelerates)
      com.class100.service.usercenter.RepGetAcceleratesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RepGetAccelerates_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RepGetAccelerates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.class100.service.usercenter.RepGetAccelerates.class, com.class100.service.usercenter.RepGetAccelerates.Builder.class);
    }

    // Construct using com.class100.service.usercenter.RepGetAccelerates.newBuilder()
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
        getSlsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      message_ = "";

      code_ = "";

      if (slsBuilder_ == null) {
        sls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        slsBuilder_.clear();
      }
      total_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RepGetAccelerates_descriptor;
    }

    public com.class100.service.usercenter.RepGetAccelerates getDefaultInstanceForType() {
      return com.class100.service.usercenter.RepGetAccelerates.getDefaultInstance();
    }

    public com.class100.service.usercenter.RepGetAccelerates build() {
      com.class100.service.usercenter.RepGetAccelerates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.class100.service.usercenter.RepGetAccelerates buildPartial() {
      com.class100.service.usercenter.RepGetAccelerates result = new com.class100.service.usercenter.RepGetAccelerates(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.message_ = message_;
      result.code_ = code_;
      if (slsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          sls_ = java.util.Collections.unmodifiableList(sls_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.sls_ = sls_;
      } else {
        result.sls_ = slsBuilder_.build();
      }
      result.total_ = total_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.class100.service.usercenter.RepGetAccelerates) {
        return mergeFrom((com.class100.service.usercenter.RepGetAccelerates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.class100.service.usercenter.RepGetAccelerates other) {
      if (other == com.class100.service.usercenter.RepGetAccelerates.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      if (slsBuilder_ == null) {
        if (!other.sls_.isEmpty()) {
          if (sls_.isEmpty()) {
            sls_ = other.sls_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureSlsIsMutable();
            sls_.addAll(other.sls_);
          }
          onChanged();
        }
      } else {
        if (!other.sls_.isEmpty()) {
          if (slsBuilder_.isEmpty()) {
            slsBuilder_.dispose();
            slsBuilder_ = null;
            sls_ = other.sls_;
            bitField0_ = (bitField0_ & ~0x00000004);
            slsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSlsFieldBuilder() : null;
          } else {
            slsBuilder_.addAllMessages(other.sls_);
          }
        }
      }
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
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
      com.class100.service.usercenter.RepGetAccelerates parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.class100.service.usercenter.RepGetAccelerates) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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
     * <code>string code = 2;</code>
     */
    public Builder clearCode() {
      
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
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

    private java.util.List<com.class100.service.usercenter.Accelerates> sls_ =
      java.util.Collections.emptyList();
    private void ensureSlsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        sls_ = new java.util.ArrayList<com.class100.service.usercenter.Accelerates>(sls_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.class100.service.usercenter.Accelerates, com.class100.service.usercenter.Accelerates.Builder, com.class100.service.usercenter.AcceleratesOrBuilder> slsBuilder_;

    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public java.util.List<com.class100.service.usercenter.Accelerates> getSlsList() {
      if (slsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sls_);
      } else {
        return slsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public int getSlsCount() {
      if (slsBuilder_ == null) {
        return sls_.size();
      } else {
        return slsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public com.class100.service.usercenter.Accelerates getSls(int index) {
      if (slsBuilder_ == null) {
        return sls_.get(index);
      } else {
        return slsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder setSls(
        int index, com.class100.service.usercenter.Accelerates value) {
      if (slsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSlsIsMutable();
        sls_.set(index, value);
        onChanged();
      } else {
        slsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder setSls(
        int index, com.class100.service.usercenter.Accelerates.Builder builderForValue) {
      if (slsBuilder_ == null) {
        ensureSlsIsMutable();
        sls_.set(index, builderForValue.build());
        onChanged();
      } else {
        slsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder addSls(com.class100.service.usercenter.Accelerates value) {
      if (slsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSlsIsMutable();
        sls_.add(value);
        onChanged();
      } else {
        slsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder addSls(
        int index, com.class100.service.usercenter.Accelerates value) {
      if (slsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSlsIsMutable();
        sls_.add(index, value);
        onChanged();
      } else {
        slsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder addSls(
        com.class100.service.usercenter.Accelerates.Builder builderForValue) {
      if (slsBuilder_ == null) {
        ensureSlsIsMutable();
        sls_.add(builderForValue.build());
        onChanged();
      } else {
        slsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder addSls(
        int index, com.class100.service.usercenter.Accelerates.Builder builderForValue) {
      if (slsBuilder_ == null) {
        ensureSlsIsMutable();
        sls_.add(index, builderForValue.build());
        onChanged();
      } else {
        slsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder addAllSls(
        java.lang.Iterable<? extends com.class100.service.usercenter.Accelerates> values) {
      if (slsBuilder_ == null) {
        ensureSlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sls_);
        onChanged();
      } else {
        slsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder clearSls() {
      if (slsBuilder_ == null) {
        sls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        slsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public Builder removeSls(int index) {
      if (slsBuilder_ == null) {
        ensureSlsIsMutable();
        sls_.remove(index);
        onChanged();
      } else {
        slsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public com.class100.service.usercenter.Accelerates.Builder getSlsBuilder(
        int index) {
      return getSlsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public com.class100.service.usercenter.AcceleratesOrBuilder getSlsOrBuilder(
        int index) {
      if (slsBuilder_ == null) {
        return sls_.get(index);  } else {
        return slsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public java.util.List<? extends com.class100.service.usercenter.AcceleratesOrBuilder> 
         getSlsOrBuilderList() {
      if (slsBuilder_ != null) {
        return slsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sls_);
      }
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public com.class100.service.usercenter.Accelerates.Builder addSlsBuilder() {
      return getSlsFieldBuilder().addBuilder(
          com.class100.service.usercenter.Accelerates.getDefaultInstance());
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public com.class100.service.usercenter.Accelerates.Builder addSlsBuilder(
        int index) {
      return getSlsFieldBuilder().addBuilder(
          index, com.class100.service.usercenter.Accelerates.getDefaultInstance());
    }
    /**
     * <code>repeated .custom_proto.Accelerates sls = 3;</code>
     */
    public java.util.List<com.class100.service.usercenter.Accelerates.Builder> 
         getSlsBuilderList() {
      return getSlsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.class100.service.usercenter.Accelerates, com.class100.service.usercenter.Accelerates.Builder, com.class100.service.usercenter.AcceleratesOrBuilder> 
        getSlsFieldBuilder() {
      if (slsBuilder_ == null) {
        slsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.class100.service.usercenter.Accelerates, com.class100.service.usercenter.Accelerates.Builder, com.class100.service.usercenter.AcceleratesOrBuilder>(
                sls_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        sls_ = null;
      }
      return slsBuilder_;
    }

    private long total_ ;
    /**
     * <code>int64 total = 4;</code>
     */
    public long getTotal() {
      return total_;
    }
    /**
     * <code>int64 total = 4;</code>
     */
    public Builder setTotal(long value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total = 4;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:custom_proto.RepGetAccelerates)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.RepGetAccelerates)
  private static final com.class100.service.usercenter.RepGetAccelerates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.class100.service.usercenter.RepGetAccelerates();
  }

  public static com.class100.service.usercenter.RepGetAccelerates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepGetAccelerates>
      PARSER = new com.google.protobuf.AbstractParser<RepGetAccelerates>() {
    public RepGetAccelerates parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RepGetAccelerates(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RepGetAccelerates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepGetAccelerates> getParserForType() {
    return PARSER;
  }

  public com.class100.service.usercenter.RepGetAccelerates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

