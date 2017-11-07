// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

/**
 * Protobuf type {@code custom_proto.GradeStruct}
 */
public  final class GradeStruct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.GradeStruct)
    GradeStructOrBuilder {
  // Use GradeStruct.newBuilder() to construct.
  private GradeStruct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GradeStruct() {
    gradeId_ = 0L;
    gradeName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GradeStruct(
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

            gradeId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            gradeName_ = s;
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
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_GradeStruct_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_GradeStruct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.class100.service.usercenter.GradeStruct.class, com.class100.service.usercenter.GradeStruct.Builder.class);
  }

  public static final int GRADEID_FIELD_NUMBER = 1;
  private long gradeId_;
  /**
   * <code>int64 gradeId = 1;</code>
   */
  public long getGradeId() {
    return gradeId_;
  }

  public static final int GRADENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object gradeName_;
  /**
   * <code>string gradeName = 2;</code>
   */
  public java.lang.String getGradeName() {
    java.lang.Object ref = gradeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gradeName_ = s;
      return s;
    }
  }
  /**
   * <code>string gradeName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getGradeNameBytes() {
    java.lang.Object ref = gradeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gradeName_ = b;
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
    if (gradeId_ != 0L) {
      output.writeInt64(1, gradeId_);
    }
    if (!getGradeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gradeName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gradeId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, gradeId_);
    }
    if (!getGradeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gradeName_);
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
    if (!(obj instanceof com.class100.service.usercenter.GradeStruct)) {
      return super.equals(obj);
    }
    com.class100.service.usercenter.GradeStruct other = (com.class100.service.usercenter.GradeStruct) obj;

    boolean result = true;
    result = result && (getGradeId()
        == other.getGradeId());
    result = result && getGradeName()
        .equals(other.getGradeName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GRADEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGradeId());
    hash = (37 * hash) + GRADENAME_FIELD_NUMBER;
    hash = (53 * hash) + getGradeName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.class100.service.usercenter.GradeStruct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.GradeStruct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.GradeStruct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.GradeStruct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.GradeStruct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.GradeStruct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.GradeStruct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.GradeStruct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.GradeStruct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.GradeStruct parseFrom(
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
  public static Builder newBuilder(com.class100.service.usercenter.GradeStruct prototype) {
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
   * Protobuf type {@code custom_proto.GradeStruct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.GradeStruct)
      com.class100.service.usercenter.GradeStructOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_GradeStruct_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_GradeStruct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.class100.service.usercenter.GradeStruct.class, com.class100.service.usercenter.GradeStruct.Builder.class);
    }

    // Construct using com.class100.service.usercenter.GradeStruct.newBuilder()
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
      gradeId_ = 0L;

      gradeName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_GradeStruct_descriptor;
    }

    public com.class100.service.usercenter.GradeStruct getDefaultInstanceForType() {
      return com.class100.service.usercenter.GradeStruct.getDefaultInstance();
    }

    public com.class100.service.usercenter.GradeStruct build() {
      com.class100.service.usercenter.GradeStruct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.class100.service.usercenter.GradeStruct buildPartial() {
      com.class100.service.usercenter.GradeStruct result = new com.class100.service.usercenter.GradeStruct(this);
      result.gradeId_ = gradeId_;
      result.gradeName_ = gradeName_;
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
      if (other instanceof com.class100.service.usercenter.GradeStruct) {
        return mergeFrom((com.class100.service.usercenter.GradeStruct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.class100.service.usercenter.GradeStruct other) {
      if (other == com.class100.service.usercenter.GradeStruct.getDefaultInstance()) return this;
      if (other.getGradeId() != 0L) {
        setGradeId(other.getGradeId());
      }
      if (!other.getGradeName().isEmpty()) {
        gradeName_ = other.gradeName_;
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
      com.class100.service.usercenter.GradeStruct parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.class100.service.usercenter.GradeStruct) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long gradeId_ ;
    /**
     * <code>int64 gradeId = 1;</code>
     */
    public long getGradeId() {
      return gradeId_;
    }
    /**
     * <code>int64 gradeId = 1;</code>
     */
    public Builder setGradeId(long value) {
      
      gradeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gradeId = 1;</code>
     */
    public Builder clearGradeId() {
      
      gradeId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object gradeName_ = "";
    /**
     * <code>string gradeName = 2;</code>
     */
    public java.lang.String getGradeName() {
      java.lang.Object ref = gradeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gradeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gradeName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGradeNameBytes() {
      java.lang.Object ref = gradeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gradeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gradeName = 2;</code>
     */
    public Builder setGradeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gradeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gradeName = 2;</code>
     */
    public Builder clearGradeName() {
      
      gradeName_ = getDefaultInstance().getGradeName();
      onChanged();
      return this;
    }
    /**
     * <code>string gradeName = 2;</code>
     */
    public Builder setGradeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gradeName_ = value;
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


    // @@protoc_insertion_point(builder_scope:custom_proto.GradeStruct)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.GradeStruct)
  private static final com.class100.service.usercenter.GradeStruct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.class100.service.usercenter.GradeStruct();
  }

  public static com.class100.service.usercenter.GradeStruct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GradeStruct>
      PARSER = new com.google.protobuf.AbstractParser<GradeStruct>() {
    public GradeStruct parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GradeStruct(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GradeStruct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GradeStruct> getParserForType() {
    return PARSER;
  }

  public com.class100.service.usercenter.GradeStruct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

