// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

/**
 * Protobuf type {@code custom_proto.RequestGetTeas}
 */
public  final class RequestGetTeas extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.RequestGetTeas)
    RequestGetTeasOrBuilder {
  // Use RequestGetTeas.newBuilder() to construct.
  private RequestGetTeas(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestGetTeas() {
    pageSize_ = 0L;
    currentPage_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RequestGetTeas(
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

            pageSize_ = input.readInt64();
            break;
          }
          case 16: {

            currentPage_ = input.readInt64();
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
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RequestGetTeas_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RequestGetTeas_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.class100.service.usercenter.RequestGetTeas.class, com.class100.service.usercenter.RequestGetTeas.Builder.class);
  }

  public static final int PAGESIZE_FIELD_NUMBER = 1;
  private long pageSize_;
  /**
   * <code>int64 pageSize = 1;</code>
   */
  public long getPageSize() {
    return pageSize_;
  }

  public static final int CURRENTPAGE_FIELD_NUMBER = 2;
  private long currentPage_;
  /**
   * <pre>
   * 搜索条件
   * </pre>
   *
   * <code>int64 currentPage = 2;</code>
   */
  public long getCurrentPage() {
    return currentPage_;
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
    if (pageSize_ != 0L) {
      output.writeInt64(1, pageSize_);
    }
    if (currentPage_ != 0L) {
      output.writeInt64(2, currentPage_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageSize_);
    }
    if (currentPage_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, currentPage_);
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
    if (!(obj instanceof com.class100.service.usercenter.RequestGetTeas)) {
      return super.equals(obj);
    }
    com.class100.service.usercenter.RequestGetTeas other = (com.class100.service.usercenter.RequestGetTeas) obj;

    boolean result = true;
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && (getCurrentPage()
        == other.getCurrentPage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (37 * hash) + CURRENTPAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCurrentPage());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.class100.service.usercenter.RequestGetTeas parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.RequestGetTeas parseFrom(
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
  public static Builder newBuilder(com.class100.service.usercenter.RequestGetTeas prototype) {
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
   * Protobuf type {@code custom_proto.RequestGetTeas}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.RequestGetTeas)
      com.class100.service.usercenter.RequestGetTeasOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RequestGetTeas_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RequestGetTeas_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.class100.service.usercenter.RequestGetTeas.class, com.class100.service.usercenter.RequestGetTeas.Builder.class);
    }

    // Construct using com.class100.service.usercenter.RequestGetTeas.newBuilder()
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
      pageSize_ = 0L;

      currentPage_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_RequestGetTeas_descriptor;
    }

    public com.class100.service.usercenter.RequestGetTeas getDefaultInstanceForType() {
      return com.class100.service.usercenter.RequestGetTeas.getDefaultInstance();
    }

    public com.class100.service.usercenter.RequestGetTeas build() {
      com.class100.service.usercenter.RequestGetTeas result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.class100.service.usercenter.RequestGetTeas buildPartial() {
      com.class100.service.usercenter.RequestGetTeas result = new com.class100.service.usercenter.RequestGetTeas(this);
      result.pageSize_ = pageSize_;
      result.currentPage_ = currentPage_;
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
      if (other instanceof com.class100.service.usercenter.RequestGetTeas) {
        return mergeFrom((com.class100.service.usercenter.RequestGetTeas)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.class100.service.usercenter.RequestGetTeas other) {
      if (other == com.class100.service.usercenter.RequestGetTeas.getDefaultInstance()) return this;
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
      }
      if (other.getCurrentPage() != 0L) {
        setCurrentPage(other.getCurrentPage());
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
      com.class100.service.usercenter.RequestGetTeas parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.class100.service.usercenter.RequestGetTeas) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pageSize_ ;
    /**
     * <code>int64 pageSize = 1;</code>
     */
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int64 pageSize = 1;</code>
     */
    public Builder setPageSize(long value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pageSize = 1;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0L;
      onChanged();
      return this;
    }

    private long currentPage_ ;
    /**
     * <pre>
     * 搜索条件
     * </pre>
     *
     * <code>int64 currentPage = 2;</code>
     */
    public long getCurrentPage() {
      return currentPage_;
    }
    /**
     * <pre>
     * 搜索条件
     * </pre>
     *
     * <code>int64 currentPage = 2;</code>
     */
    public Builder setCurrentPage(long value) {
      
      currentPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 搜索条件
     * </pre>
     *
     * <code>int64 currentPage = 2;</code>
     */
    public Builder clearCurrentPage() {
      
      currentPage_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:custom_proto.RequestGetTeas)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.RequestGetTeas)
  private static final com.class100.service.usercenter.RequestGetTeas DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.class100.service.usercenter.RequestGetTeas();
  }

  public static com.class100.service.usercenter.RequestGetTeas getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestGetTeas>
      PARSER = new com.google.protobuf.AbstractParser<RequestGetTeas>() {
    public RequestGetTeas parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestGetTeas(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestGetTeas> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestGetTeas> getParserForType() {
    return PARSER;
  }

  public com.class100.service.usercenter.RequestGetTeas getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
