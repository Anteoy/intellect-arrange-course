// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.anteoy.service.usercenter;

/**
 * <pre>
 *gaidonghou
 * </pre>
 *
 * Protobuf type {@code custom_proto.CascadeStuGRPC}
 */
public  final class CascadeStuGRPC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.CascadeStuGRPC)
    CascadeStuGRPCOrBuilder {
  // Use CascadeStuGRPC.newBuilder() to construct.
  private CascadeStuGRPC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CascadeStuGRPC() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CascadeStuGRPC(
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
            RequestRStudentStruct.Builder subBuilder = null;
            if (requestRStudentStruct_ != null) {
              subBuilder = requestRStudentStruct_.toBuilder();
            }
            requestRStudentStruct_ = input.readMessage(RequestRStudentStruct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(requestRStudentStruct_);
              requestRStudentStruct_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            RequestRTeachingAssistantStruct.Builder subBuilder = null;
            if (requestRTeachingAssistantStruct_ != null) {
              subBuilder = requestRTeachingAssistantStruct_.toBuilder();
            }
            requestRTeachingAssistantStruct_ = input.readMessage(RequestRTeachingAssistantStruct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(requestRTeachingAssistantStruct_);
              requestRTeachingAssistantStruct_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            RequestRSchoolStruct.Builder subBuilder = null;
            if (schoolLogin_ != null) {
              subBuilder = schoolLogin_.toBuilder();
            }
            schoolLogin_ = input.readMessage(RequestRSchoolStruct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(schoolLogin_);
              schoolLogin_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            RequestRClassStruct.Builder subBuilder = null;
            if (classCa_ != null) {
              subBuilder = classCa_.toBuilder();
            }
            classCa_ = input.readMessage(RequestRClassStruct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(classCa_);
              classCa_ = subBuilder.buildPartial();
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
    return UserCenterProto.internal_static_custom_proto_CascadeStuGRPC_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return UserCenterProto.internal_static_custom_proto_CascadeStuGRPC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CascadeStuGRPC.class, CascadeStuGRPC.Builder.class);
  }

  public static final int REQUESTRSTUDENTSTRUCT_FIELD_NUMBER = 1;
  private RequestRStudentStruct requestRStudentStruct_;
  /**
   * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
   */
  public boolean hasRequestRStudentStruct() {
    return requestRStudentStruct_ != null;
  }
  /**
   * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
   */
  public RequestRStudentStruct getRequestRStudentStruct() {
    return requestRStudentStruct_ == null ? RequestRStudentStruct.getDefaultInstance() : requestRStudentStruct_;
  }
  /**
   * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
   */
  public RequestRStudentStructOrBuilder getRequestRStudentStructOrBuilder() {
    return getRequestRStudentStruct();
  }

  public static final int REQUESTRTEACHINGASSISTANTSTRUCT_FIELD_NUMBER = 2;
  private RequestRTeachingAssistantStruct requestRTeachingAssistantStruct_;
  /**
   * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
   */
  public boolean hasRequestRTeachingAssistantStruct() {
    return requestRTeachingAssistantStruct_ != null;
  }
  /**
   * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
   */
  public RequestRTeachingAssistantStruct getRequestRTeachingAssistantStruct() {
    return requestRTeachingAssistantStruct_ == null ? RequestRTeachingAssistantStruct.getDefaultInstance() : requestRTeachingAssistantStruct_;
  }
  /**
   * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
   */
  public RequestRTeachingAssistantStructOrBuilder getRequestRTeachingAssistantStructOrBuilder() {
    return getRequestRTeachingAssistantStruct();
  }

  public static final int SCHOOLLOGIN_FIELD_NUMBER = 3;
  private RequestRSchoolStruct schoolLogin_;
  /**
   * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
   */
  public boolean hasSchoolLogin() {
    return schoolLogin_ != null;
  }
  /**
   * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
   */
  public RequestRSchoolStruct getSchoolLogin() {
    return schoolLogin_ == null ? RequestRSchoolStruct.getDefaultInstance() : schoolLogin_;
  }
  /**
   * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
   */
  public RequestRSchoolStructOrBuilder getSchoolLoginOrBuilder() {
    return getSchoolLogin();
  }

  public static final int CLASSCA_FIELD_NUMBER = 4;
  private RequestRClassStruct classCa_;
  /**
   * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
   */
  public boolean hasClassCa() {
    return classCa_ != null;
  }
  /**
   * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
   */
  public RequestRClassStruct getClassCa() {
    return classCa_ == null ? RequestRClassStruct.getDefaultInstance() : classCa_;
  }
  /**
   * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
   */
  public RequestRClassStructOrBuilder getClassCaOrBuilder() {
    return getClassCa();
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
    if (requestRStudentStruct_ != null) {
      output.writeMessage(1, getRequestRStudentStruct());
    }
    if (requestRTeachingAssistantStruct_ != null) {
      output.writeMessage(2, getRequestRTeachingAssistantStruct());
    }
    if (schoolLogin_ != null) {
      output.writeMessage(3, getSchoolLogin());
    }
    if (classCa_ != null) {
      output.writeMessage(4, getClassCa());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestRStudentStruct_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequestRStudentStruct());
    }
    if (requestRTeachingAssistantStruct_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRequestRTeachingAssistantStruct());
    }
    if (schoolLogin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSchoolLogin());
    }
    if (classCa_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getClassCa());
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
    if (!(obj instanceof CascadeStuGRPC)) {
      return super.equals(obj);
    }
    CascadeStuGRPC other = (CascadeStuGRPC) obj;

    boolean result = true;
    result = result && (hasRequestRStudentStruct() == other.hasRequestRStudentStruct());
    if (hasRequestRStudentStruct()) {
      result = result && getRequestRStudentStruct()
          .equals(other.getRequestRStudentStruct());
    }
    result = result && (hasRequestRTeachingAssistantStruct() == other.hasRequestRTeachingAssistantStruct());
    if (hasRequestRTeachingAssistantStruct()) {
      result = result && getRequestRTeachingAssistantStruct()
          .equals(other.getRequestRTeachingAssistantStruct());
    }
    result = result && (hasSchoolLogin() == other.hasSchoolLogin());
    if (hasSchoolLogin()) {
      result = result && getSchoolLogin()
          .equals(other.getSchoolLogin());
    }
    result = result && (hasClassCa() == other.hasClassCa());
    if (hasClassCa()) {
      result = result && getClassCa()
          .equals(other.getClassCa());
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
    if (hasRequestRStudentStruct()) {
      hash = (37 * hash) + REQUESTRSTUDENTSTRUCT_FIELD_NUMBER;
      hash = (53 * hash) + getRequestRStudentStruct().hashCode();
    }
    if (hasRequestRTeachingAssistantStruct()) {
      hash = (37 * hash) + REQUESTRTEACHINGASSISTANTSTRUCT_FIELD_NUMBER;
      hash = (53 * hash) + getRequestRTeachingAssistantStruct().hashCode();
    }
    if (hasSchoolLogin()) {
      hash = (37 * hash) + SCHOOLLOGIN_FIELD_NUMBER;
      hash = (53 * hash) + getSchoolLogin().hashCode();
    }
    if (hasClassCa()) {
      hash = (37 * hash) + CLASSCA_FIELD_NUMBER;
      hash = (53 * hash) + getClassCa().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CascadeStuGRPC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CascadeStuGRPC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CascadeStuGRPC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CascadeStuGRPC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CascadeStuGRPC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CascadeStuGRPC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CascadeStuGRPC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CascadeStuGRPC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CascadeStuGRPC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CascadeStuGRPC parseFrom(
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
  public static Builder newBuilder(CascadeStuGRPC prototype) {
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
   * <pre>
   *gaidonghou
   * </pre>
   *
   * Protobuf type {@code custom_proto.CascadeStuGRPC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.CascadeStuGRPC)
          CascadeStuGRPCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserCenterProto.internal_static_custom_proto_CascadeStuGRPC_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserCenterProto.internal_static_custom_proto_CascadeStuGRPC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CascadeStuGRPC.class, CascadeStuGRPC.Builder.class);
    }

    // Construct using CascadeStuGRPC.newBuilder()
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
      if (requestRStudentStructBuilder_ == null) {
        requestRStudentStruct_ = null;
      } else {
        requestRStudentStruct_ = null;
        requestRStudentStructBuilder_ = null;
      }
      if (requestRTeachingAssistantStructBuilder_ == null) {
        requestRTeachingAssistantStruct_ = null;
      } else {
        requestRTeachingAssistantStruct_ = null;
        requestRTeachingAssistantStructBuilder_ = null;
      }
      if (schoolLoginBuilder_ == null) {
        schoolLogin_ = null;
      } else {
        schoolLogin_ = null;
        schoolLoginBuilder_ = null;
      }
      if (classCaBuilder_ == null) {
        classCa_ = null;
      } else {
        classCa_ = null;
        classCaBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return UserCenterProto.internal_static_custom_proto_CascadeStuGRPC_descriptor;
    }

    public CascadeStuGRPC getDefaultInstanceForType() {
      return CascadeStuGRPC.getDefaultInstance();
    }

    public CascadeStuGRPC build() {
      CascadeStuGRPC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public CascadeStuGRPC buildPartial() {
      CascadeStuGRPC result = new CascadeStuGRPC(this);
      if (requestRStudentStructBuilder_ == null) {
        result.requestRStudentStruct_ = requestRStudentStruct_;
      } else {
        result.requestRStudentStruct_ = requestRStudentStructBuilder_.build();
      }
      if (requestRTeachingAssistantStructBuilder_ == null) {
        result.requestRTeachingAssistantStruct_ = requestRTeachingAssistantStruct_;
      } else {
        result.requestRTeachingAssistantStruct_ = requestRTeachingAssistantStructBuilder_.build();
      }
      if (schoolLoginBuilder_ == null) {
        result.schoolLogin_ = schoolLogin_;
      } else {
        result.schoolLogin_ = schoolLoginBuilder_.build();
      }
      if (classCaBuilder_ == null) {
        result.classCa_ = classCa_;
      } else {
        result.classCa_ = classCaBuilder_.build();
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
      if (other instanceof CascadeStuGRPC) {
        return mergeFrom((CascadeStuGRPC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CascadeStuGRPC other) {
      if (other == CascadeStuGRPC.getDefaultInstance()) return this;
      if (other.hasRequestRStudentStruct()) {
        mergeRequestRStudentStruct(other.getRequestRStudentStruct());
      }
      if (other.hasRequestRTeachingAssistantStruct()) {
        mergeRequestRTeachingAssistantStruct(other.getRequestRTeachingAssistantStruct());
      }
      if (other.hasSchoolLogin()) {
        mergeSchoolLogin(other.getSchoolLogin());
      }
      if (other.hasClassCa()) {
        mergeClassCa(other.getClassCa());
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
      CascadeStuGRPC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CascadeStuGRPC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private RequestRStudentStruct requestRStudentStruct_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRStudentStruct, RequestRStudentStruct.Builder, RequestRStudentStructOrBuilder> requestRStudentStructBuilder_;
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public boolean hasRequestRStudentStruct() {
      return requestRStudentStructBuilder_ != null || requestRStudentStruct_ != null;
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public RequestRStudentStruct getRequestRStudentStruct() {
      if (requestRStudentStructBuilder_ == null) {
        return requestRStudentStruct_ == null ? RequestRStudentStruct.getDefaultInstance() : requestRStudentStruct_;
      } else {
        return requestRStudentStructBuilder_.getMessage();
      }
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public Builder setRequestRStudentStruct(RequestRStudentStruct value) {
      if (requestRStudentStructBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestRStudentStruct_ = value;
        onChanged();
      } else {
        requestRStudentStructBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public Builder setRequestRStudentStruct(
        RequestRStudentStruct.Builder builderForValue) {
      if (requestRStudentStructBuilder_ == null) {
        requestRStudentStruct_ = builderForValue.build();
        onChanged();
      } else {
        requestRStudentStructBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public Builder mergeRequestRStudentStruct(RequestRStudentStruct value) {
      if (requestRStudentStructBuilder_ == null) {
        if (requestRStudentStruct_ != null) {
          requestRStudentStruct_ =
            RequestRStudentStruct.newBuilder(requestRStudentStruct_).mergeFrom(value).buildPartial();
        } else {
          requestRStudentStruct_ = value;
        }
        onChanged();
      } else {
        requestRStudentStructBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public Builder clearRequestRStudentStruct() {
      if (requestRStudentStructBuilder_ == null) {
        requestRStudentStruct_ = null;
        onChanged();
      } else {
        requestRStudentStruct_ = null;
        requestRStudentStructBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public RequestRStudentStruct.Builder getRequestRStudentStructBuilder() {
      
      onChanged();
      return getRequestRStudentStructFieldBuilder().getBuilder();
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    public RequestRStudentStructOrBuilder getRequestRStudentStructOrBuilder() {
      if (requestRStudentStructBuilder_ != null) {
        return requestRStudentStructBuilder_.getMessageOrBuilder();
      } else {
        return requestRStudentStruct_ == null ?
            RequestRStudentStruct.getDefaultInstance() : requestRStudentStruct_;
      }
    }
    /**
     * <code>.custom_proto.RequestRStudentStruct requestRStudentStruct = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRStudentStruct, RequestRStudentStruct.Builder, RequestRStudentStructOrBuilder>
        getRequestRStudentStructFieldBuilder() {
      if (requestRStudentStructBuilder_ == null) {
        requestRStudentStructBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                RequestRStudentStruct, RequestRStudentStruct.Builder, RequestRStudentStructOrBuilder>(
                getRequestRStudentStruct(),
                getParentForChildren(),
                isClean());
        requestRStudentStruct_ = null;
      }
      return requestRStudentStructBuilder_;
    }

    private RequestRTeachingAssistantStruct requestRTeachingAssistantStruct_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRTeachingAssistantStruct, RequestRTeachingAssistantStruct.Builder, RequestRTeachingAssistantStructOrBuilder> requestRTeachingAssistantStructBuilder_;
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public boolean hasRequestRTeachingAssistantStruct() {
      return requestRTeachingAssistantStructBuilder_ != null || requestRTeachingAssistantStruct_ != null;
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public RequestRTeachingAssistantStruct getRequestRTeachingAssistantStruct() {
      if (requestRTeachingAssistantStructBuilder_ == null) {
        return requestRTeachingAssistantStruct_ == null ? RequestRTeachingAssistantStruct.getDefaultInstance() : requestRTeachingAssistantStruct_;
      } else {
        return requestRTeachingAssistantStructBuilder_.getMessage();
      }
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public Builder setRequestRTeachingAssistantStruct(RequestRTeachingAssistantStruct value) {
      if (requestRTeachingAssistantStructBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestRTeachingAssistantStruct_ = value;
        onChanged();
      } else {
        requestRTeachingAssistantStructBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public Builder setRequestRTeachingAssistantStruct(
        RequestRTeachingAssistantStruct.Builder builderForValue) {
      if (requestRTeachingAssistantStructBuilder_ == null) {
        requestRTeachingAssistantStruct_ = builderForValue.build();
        onChanged();
      } else {
        requestRTeachingAssistantStructBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public Builder mergeRequestRTeachingAssistantStruct(RequestRTeachingAssistantStruct value) {
      if (requestRTeachingAssistantStructBuilder_ == null) {
        if (requestRTeachingAssistantStruct_ != null) {
          requestRTeachingAssistantStruct_ =
            RequestRTeachingAssistantStruct.newBuilder(requestRTeachingAssistantStruct_).mergeFrom(value).buildPartial();
        } else {
          requestRTeachingAssistantStruct_ = value;
        }
        onChanged();
      } else {
        requestRTeachingAssistantStructBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public Builder clearRequestRTeachingAssistantStruct() {
      if (requestRTeachingAssistantStructBuilder_ == null) {
        requestRTeachingAssistantStruct_ = null;
        onChanged();
      } else {
        requestRTeachingAssistantStruct_ = null;
        requestRTeachingAssistantStructBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public RequestRTeachingAssistantStruct.Builder getRequestRTeachingAssistantStructBuilder() {
      
      onChanged();
      return getRequestRTeachingAssistantStructFieldBuilder().getBuilder();
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    public RequestRTeachingAssistantStructOrBuilder getRequestRTeachingAssistantStructOrBuilder() {
      if (requestRTeachingAssistantStructBuilder_ != null) {
        return requestRTeachingAssistantStructBuilder_.getMessageOrBuilder();
      } else {
        return requestRTeachingAssistantStruct_ == null ?
            RequestRTeachingAssistantStruct.getDefaultInstance() : requestRTeachingAssistantStruct_;
      }
    }
    /**
     * <code>.custom_proto.RequestRTeachingAssistantStruct requestRTeachingAssistantStruct = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRTeachingAssistantStruct, RequestRTeachingAssistantStruct.Builder, RequestRTeachingAssistantStructOrBuilder>
        getRequestRTeachingAssistantStructFieldBuilder() {
      if (requestRTeachingAssistantStructBuilder_ == null) {
        requestRTeachingAssistantStructBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                RequestRTeachingAssistantStruct, RequestRTeachingAssistantStruct.Builder, RequestRTeachingAssistantStructOrBuilder>(
                getRequestRTeachingAssistantStruct(),
                getParentForChildren(),
                isClean());
        requestRTeachingAssistantStruct_ = null;
      }
      return requestRTeachingAssistantStructBuilder_;
    }

    private RequestRSchoolStruct schoolLogin_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRSchoolStruct, RequestRSchoolStruct.Builder, RequestRSchoolStructOrBuilder> schoolLoginBuilder_;
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public boolean hasSchoolLogin() {
      return schoolLoginBuilder_ != null || schoolLogin_ != null;
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public RequestRSchoolStruct getSchoolLogin() {
      if (schoolLoginBuilder_ == null) {
        return schoolLogin_ == null ? RequestRSchoolStruct.getDefaultInstance() : schoolLogin_;
      } else {
        return schoolLoginBuilder_.getMessage();
      }
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public Builder setSchoolLogin(RequestRSchoolStruct value) {
      if (schoolLoginBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schoolLogin_ = value;
        onChanged();
      } else {
        schoolLoginBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public Builder setSchoolLogin(
        RequestRSchoolStruct.Builder builderForValue) {
      if (schoolLoginBuilder_ == null) {
        schoolLogin_ = builderForValue.build();
        onChanged();
      } else {
        schoolLoginBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public Builder mergeSchoolLogin(RequestRSchoolStruct value) {
      if (schoolLoginBuilder_ == null) {
        if (schoolLogin_ != null) {
          schoolLogin_ =
            RequestRSchoolStruct.newBuilder(schoolLogin_).mergeFrom(value).buildPartial();
        } else {
          schoolLogin_ = value;
        }
        onChanged();
      } else {
        schoolLoginBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public Builder clearSchoolLogin() {
      if (schoolLoginBuilder_ == null) {
        schoolLogin_ = null;
        onChanged();
      } else {
        schoolLogin_ = null;
        schoolLoginBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public RequestRSchoolStruct.Builder getSchoolLoginBuilder() {
      
      onChanged();
      return getSchoolLoginFieldBuilder().getBuilder();
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    public RequestRSchoolStructOrBuilder getSchoolLoginOrBuilder() {
      if (schoolLoginBuilder_ != null) {
        return schoolLoginBuilder_.getMessageOrBuilder();
      } else {
        return schoolLogin_ == null ?
            RequestRSchoolStruct.getDefaultInstance() : schoolLogin_;
      }
    }
    /**
     * <code>.custom_proto.RequestRSchoolStruct SchoolLogin = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRSchoolStruct, RequestRSchoolStruct.Builder, RequestRSchoolStructOrBuilder>
        getSchoolLoginFieldBuilder() {
      if (schoolLoginBuilder_ == null) {
        schoolLoginBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                RequestRSchoolStruct, RequestRSchoolStruct.Builder, RequestRSchoolStructOrBuilder>(
                getSchoolLogin(),
                getParentForChildren(),
                isClean());
        schoolLogin_ = null;
      }
      return schoolLoginBuilder_;
    }

    private RequestRClassStruct classCa_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRClassStruct, RequestRClassStruct.Builder, RequestRClassStructOrBuilder> classCaBuilder_;
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public boolean hasClassCa() {
      return classCaBuilder_ != null || classCa_ != null;
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public RequestRClassStruct getClassCa() {
      if (classCaBuilder_ == null) {
        return classCa_ == null ? RequestRClassStruct.getDefaultInstance() : classCa_;
      } else {
        return classCaBuilder_.getMessage();
      }
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public Builder setClassCa(RequestRClassStruct value) {
      if (classCaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        classCa_ = value;
        onChanged();
      } else {
        classCaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public Builder setClassCa(
        RequestRClassStruct.Builder builderForValue) {
      if (classCaBuilder_ == null) {
        classCa_ = builderForValue.build();
        onChanged();
      } else {
        classCaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public Builder mergeClassCa(RequestRClassStruct value) {
      if (classCaBuilder_ == null) {
        if (classCa_ != null) {
          classCa_ =
            RequestRClassStruct.newBuilder(classCa_).mergeFrom(value).buildPartial();
        } else {
          classCa_ = value;
        }
        onChanged();
      } else {
        classCaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public Builder clearClassCa() {
      if (classCaBuilder_ == null) {
        classCa_ = null;
        onChanged();
      } else {
        classCa_ = null;
        classCaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public RequestRClassStruct.Builder getClassCaBuilder() {
      
      onChanged();
      return getClassCaFieldBuilder().getBuilder();
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    public RequestRClassStructOrBuilder getClassCaOrBuilder() {
      if (classCaBuilder_ != null) {
        return classCaBuilder_.getMessageOrBuilder();
      } else {
        return classCa_ == null ?
            RequestRClassStruct.getDefaultInstance() : classCa_;
      }
    }
    /**
     * <code>.custom_proto.RequestRClassStruct ClassCa = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            RequestRClassStruct, RequestRClassStruct.Builder, RequestRClassStructOrBuilder>
        getClassCaFieldBuilder() {
      if (classCaBuilder_ == null) {
        classCaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                RequestRClassStruct, RequestRClassStruct.Builder, RequestRClassStructOrBuilder>(
                getClassCa(),
                getParentForChildren(),
                isClean());
        classCa_ = null;
      }
      return classCaBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:custom_proto.CascadeStuGRPC)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.CascadeStuGRPC)
  private static final CascadeStuGRPC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CascadeStuGRPC();
  }

  public static CascadeStuGRPC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CascadeStuGRPC>
      PARSER = new com.google.protobuf.AbstractParser<CascadeStuGRPC>() {
    public CascadeStuGRPC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CascadeStuGRPC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CascadeStuGRPC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CascadeStuGRPC> getParserForType() {
    return PARSER;
  }

  public CascadeStuGRPC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
