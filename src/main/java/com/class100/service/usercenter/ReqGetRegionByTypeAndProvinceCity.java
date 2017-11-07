// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

/**
 * Protobuf type {@code custom_proto.ReqGetRegionByTypeAndProvinceCity}
 */
public  final class ReqGetRegionByTypeAndProvinceCity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.ReqGetRegionByTypeAndProvinceCity)
    ReqGetRegionByTypeAndProvinceCityOrBuilder {
  // Use ReqGetRegionByTypeAndProvinceCity.newBuilder() to construct.
  private ReqGetRegionByTypeAndProvinceCity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqGetRegionByTypeAndProvinceCity() {
    typeCode_ = 0L;
    province_ = "";
    city_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReqGetRegionByTypeAndProvinceCity(
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

            typeCode_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            province_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
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
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReqGetRegionByTypeAndProvinceCity_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReqGetRegionByTypeAndProvinceCity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.class, com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.Builder.class);
  }

  public static final int TYPECODE_FIELD_NUMBER = 1;
  private long typeCode_;
  /**
   * <code>int64 typeCode = 1;</code>
   */
  public long getTypeCode() {
    return typeCode_;
  }

  public static final int PROVINCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object province_;
  /**
   * <code>string province = 2;</code>
   */
  public java.lang.String getProvince() {
    java.lang.Object ref = province_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      province_ = s;
      return s;
    }
  }
  /**
   * <code>string province = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProvinceBytes() {
    java.lang.Object ref = province_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      province_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_FIELD_NUMBER = 3;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 3;</code>
   */
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
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
    if (typeCode_ != 0L) {
      output.writeInt64(1, typeCode_);
    }
    if (!getProvinceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, province_);
    }
    if (!getCityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, city_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, typeCode_);
    }
    if (!getProvinceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, province_);
    }
    if (!getCityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, city_);
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
    if (!(obj instanceof com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity)) {
      return super.equals(obj);
    }
    com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity other = (com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity) obj;

    boolean result = true;
    result = result && (getTypeCode()
        == other.getTypeCode());
    result = result && getProvince()
        .equals(other.getProvince());
    result = result && getCity()
        .equals(other.getCity());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPECODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTypeCode());
    hash = (37 * hash) + PROVINCE_FIELD_NUMBER;
    hash = (53 * hash) + getProvince().hashCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parseFrom(
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
  public static Builder newBuilder(com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity prototype) {
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
   * Protobuf type {@code custom_proto.ReqGetRegionByTypeAndProvinceCity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.ReqGetRegionByTypeAndProvinceCity)
      com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReqGetRegionByTypeAndProvinceCity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReqGetRegionByTypeAndProvinceCity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.class, com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.Builder.class);
    }

    // Construct using com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.newBuilder()
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
      typeCode_ = 0L;

      province_ = "";

      city_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReqGetRegionByTypeAndProvinceCity_descriptor;
    }

    public com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity getDefaultInstanceForType() {
      return com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.getDefaultInstance();
    }

    public com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity build() {
      com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity buildPartial() {
      com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity result = new com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity(this);
      result.typeCode_ = typeCode_;
      result.province_ = province_;
      result.city_ = city_;
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
      if (other instanceof com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity) {
        return mergeFrom((com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity other) {
      if (other == com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.getDefaultInstance()) return this;
      if (other.getTypeCode() != 0L) {
        setTypeCode(other.getTypeCode());
      }
      if (!other.getProvince().isEmpty()) {
        province_ = other.province_;
        onChanged();
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
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
      com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long typeCode_ ;
    /**
     * <code>int64 typeCode = 1;</code>
     */
    public long getTypeCode() {
      return typeCode_;
    }
    /**
     * <code>int64 typeCode = 1;</code>
     */
    public Builder setTypeCode(long value) {
      
      typeCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 typeCode = 1;</code>
     */
    public Builder clearTypeCode() {
      
      typeCode_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object province_ = "";
    /**
     * <code>string province = 2;</code>
     */
    public java.lang.String getProvince() {
      java.lang.Object ref = province_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        province_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string province = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProvinceBytes() {
      java.lang.Object ref = province_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        province_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string province = 2;</code>
     */
    public Builder setProvince(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      province_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string province = 2;</code>
     */
    public Builder clearProvince() {
      
      province_ = getDefaultInstance().getProvince();
      onChanged();
      return this;
    }
    /**
     * <code>string province = 2;</code>
     */
    public Builder setProvinceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      province_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 3;</code>
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 3;</code>
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 3;</code>
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 3;</code>
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
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


    // @@protoc_insertion_point(builder_scope:custom_proto.ReqGetRegionByTypeAndProvinceCity)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.ReqGetRegionByTypeAndProvinceCity)
  private static final com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity();
  }

  public static com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqGetRegionByTypeAndProvinceCity>
      PARSER = new com.google.protobuf.AbstractParser<ReqGetRegionByTypeAndProvinceCity>() {
    public ReqGetRegionByTypeAndProvinceCity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqGetRegionByTypeAndProvinceCity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReqGetRegionByTypeAndProvinceCity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqGetRegionByTypeAndProvinceCity> getParserForType() {
    return PARSER;
  }

  public com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

