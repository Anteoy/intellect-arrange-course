// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

/**
 * Protobuf type {@code custom_proto.ReplyGetStudents}
 */
public  final class ReplyGetStudents extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:custom_proto.ReplyGetStudents)
    ReplyGetStudentsOrBuilder {
  // Use ReplyGetStudents.newBuilder() to construct.
  private ReplyGetStudents(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplyGetStudents() {
    studentsInfo_ = java.util.Collections.emptyList();
    count_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReplyGetStudents(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              studentsInfo_ = new java.util.ArrayList<com.class100.service.usercenter.RequestRStudentStruct>();
              mutable_bitField0_ |= 0x00000001;
            }
            studentsInfo_.add(
                input.readMessage(com.class100.service.usercenter.RequestRStudentStruct.parser(), extensionRegistry));
            break;
          }
          case 16: {

            count_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        studentsInfo_ = java.util.Collections.unmodifiableList(studentsInfo_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyGetStudents_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyGetStudents_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.class100.service.usercenter.ReplyGetStudents.class, com.class100.service.usercenter.ReplyGetStudents.Builder.class);
  }

  private int bitField0_;
  public static final int STUDENTSINFO_FIELD_NUMBER = 1;
  private java.util.List<com.class100.service.usercenter.RequestRStudentStruct> studentsInfo_;
  /**
   * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
   */
  public java.util.List<com.class100.service.usercenter.RequestRStudentStruct> getStudentsInfoList() {
    return studentsInfo_;
  }
  /**
   * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
   */
  public java.util.List<? extends com.class100.service.usercenter.RequestRStudentStructOrBuilder> 
      getStudentsInfoOrBuilderList() {
    return studentsInfo_;
  }
  /**
   * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
   */
  public int getStudentsInfoCount() {
    return studentsInfo_.size();
  }
  /**
   * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
   */
  public com.class100.service.usercenter.RequestRStudentStruct getStudentsInfo(int index) {
    return studentsInfo_.get(index);
  }
  /**
   * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
   */
  public com.class100.service.usercenter.RequestRStudentStructOrBuilder getStudentsInfoOrBuilder(
      int index) {
    return studentsInfo_.get(index);
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_;
  /**
   * <code>int64 count = 2;</code>
   */
  public long getCount() {
    return count_;
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
    for (int i = 0; i < studentsInfo_.size(); i++) {
      output.writeMessage(1, studentsInfo_.get(i));
    }
    if (count_ != 0L) {
      output.writeInt64(2, count_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < studentsInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, studentsInfo_.get(i));
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, count_);
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
    if (!(obj instanceof com.class100.service.usercenter.ReplyGetStudents)) {
      return super.equals(obj);
    }
    com.class100.service.usercenter.ReplyGetStudents other = (com.class100.service.usercenter.ReplyGetStudents) obj;

    boolean result = true;
    result = result && getStudentsInfoList()
        .equals(other.getStudentsInfoList());
    result = result && (getCount()
        == other.getCount());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStudentsInfoCount() > 0) {
      hash = (37 * hash) + STUDENTSINFO_FIELD_NUMBER;
      hash = (53 * hash) + getStudentsInfoList().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.class100.service.usercenter.ReplyGetStudents parseFrom(
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
  public static Builder newBuilder(com.class100.service.usercenter.ReplyGetStudents prototype) {
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
   * Protobuf type {@code custom_proto.ReplyGetStudents}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:custom_proto.ReplyGetStudents)
      com.class100.service.usercenter.ReplyGetStudentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyGetStudents_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyGetStudents_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.class100.service.usercenter.ReplyGetStudents.class, com.class100.service.usercenter.ReplyGetStudents.Builder.class);
    }

    // Construct using com.class100.service.usercenter.ReplyGetStudents.newBuilder()
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
        getStudentsInfoFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (studentsInfoBuilder_ == null) {
        studentsInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        studentsInfoBuilder_.clear();
      }
      count_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.class100.service.usercenter.UserCenterProto.internal_static_custom_proto_ReplyGetStudents_descriptor;
    }

    public com.class100.service.usercenter.ReplyGetStudents getDefaultInstanceForType() {
      return com.class100.service.usercenter.ReplyGetStudents.getDefaultInstance();
    }

    public com.class100.service.usercenter.ReplyGetStudents build() {
      com.class100.service.usercenter.ReplyGetStudents result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.class100.service.usercenter.ReplyGetStudents buildPartial() {
      com.class100.service.usercenter.ReplyGetStudents result = new com.class100.service.usercenter.ReplyGetStudents(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (studentsInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          studentsInfo_ = java.util.Collections.unmodifiableList(studentsInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.studentsInfo_ = studentsInfo_;
      } else {
        result.studentsInfo_ = studentsInfoBuilder_.build();
      }
      result.count_ = count_;
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
      if (other instanceof com.class100.service.usercenter.ReplyGetStudents) {
        return mergeFrom((com.class100.service.usercenter.ReplyGetStudents)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.class100.service.usercenter.ReplyGetStudents other) {
      if (other == com.class100.service.usercenter.ReplyGetStudents.getDefaultInstance()) return this;
      if (studentsInfoBuilder_ == null) {
        if (!other.studentsInfo_.isEmpty()) {
          if (studentsInfo_.isEmpty()) {
            studentsInfo_ = other.studentsInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStudentsInfoIsMutable();
            studentsInfo_.addAll(other.studentsInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.studentsInfo_.isEmpty()) {
          if (studentsInfoBuilder_.isEmpty()) {
            studentsInfoBuilder_.dispose();
            studentsInfoBuilder_ = null;
            studentsInfo_ = other.studentsInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            studentsInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStudentsInfoFieldBuilder() : null;
          } else {
            studentsInfoBuilder_.addAllMessages(other.studentsInfo_);
          }
        }
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
      com.class100.service.usercenter.ReplyGetStudents parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.class100.service.usercenter.ReplyGetStudents) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.class100.service.usercenter.RequestRStudentStruct> studentsInfo_ =
      java.util.Collections.emptyList();
    private void ensureStudentsInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        studentsInfo_ = new java.util.ArrayList<com.class100.service.usercenter.RequestRStudentStruct>(studentsInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.class100.service.usercenter.RequestRStudentStruct, com.class100.service.usercenter.RequestRStudentStruct.Builder, com.class100.service.usercenter.RequestRStudentStructOrBuilder> studentsInfoBuilder_;

    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public java.util.List<com.class100.service.usercenter.RequestRStudentStruct> getStudentsInfoList() {
      if (studentsInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(studentsInfo_);
      } else {
        return studentsInfoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public int getStudentsInfoCount() {
      if (studentsInfoBuilder_ == null) {
        return studentsInfo_.size();
      } else {
        return studentsInfoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public com.class100.service.usercenter.RequestRStudentStruct getStudentsInfo(int index) {
      if (studentsInfoBuilder_ == null) {
        return studentsInfo_.get(index);
      } else {
        return studentsInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder setStudentsInfo(
        int index, com.class100.service.usercenter.RequestRStudentStruct value) {
      if (studentsInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsInfoIsMutable();
        studentsInfo_.set(index, value);
        onChanged();
      } else {
        studentsInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder setStudentsInfo(
        int index, com.class100.service.usercenter.RequestRStudentStruct.Builder builderForValue) {
      if (studentsInfoBuilder_ == null) {
        ensureStudentsInfoIsMutable();
        studentsInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        studentsInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder addStudentsInfo(com.class100.service.usercenter.RequestRStudentStruct value) {
      if (studentsInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsInfoIsMutable();
        studentsInfo_.add(value);
        onChanged();
      } else {
        studentsInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder addStudentsInfo(
        int index, com.class100.service.usercenter.RequestRStudentStruct value) {
      if (studentsInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsInfoIsMutable();
        studentsInfo_.add(index, value);
        onChanged();
      } else {
        studentsInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder addStudentsInfo(
        com.class100.service.usercenter.RequestRStudentStruct.Builder builderForValue) {
      if (studentsInfoBuilder_ == null) {
        ensureStudentsInfoIsMutable();
        studentsInfo_.add(builderForValue.build());
        onChanged();
      } else {
        studentsInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder addStudentsInfo(
        int index, com.class100.service.usercenter.RequestRStudentStruct.Builder builderForValue) {
      if (studentsInfoBuilder_ == null) {
        ensureStudentsInfoIsMutable();
        studentsInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        studentsInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder addAllStudentsInfo(
        java.lang.Iterable<? extends com.class100.service.usercenter.RequestRStudentStruct> values) {
      if (studentsInfoBuilder_ == null) {
        ensureStudentsInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, studentsInfo_);
        onChanged();
      } else {
        studentsInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder clearStudentsInfo() {
      if (studentsInfoBuilder_ == null) {
        studentsInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        studentsInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public Builder removeStudentsInfo(int index) {
      if (studentsInfoBuilder_ == null) {
        ensureStudentsInfoIsMutable();
        studentsInfo_.remove(index);
        onChanged();
      } else {
        studentsInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public com.class100.service.usercenter.RequestRStudentStruct.Builder getStudentsInfoBuilder(
        int index) {
      return getStudentsInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public com.class100.service.usercenter.RequestRStudentStructOrBuilder getStudentsInfoOrBuilder(
        int index) {
      if (studentsInfoBuilder_ == null) {
        return studentsInfo_.get(index);  } else {
        return studentsInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public java.util.List<? extends com.class100.service.usercenter.RequestRStudentStructOrBuilder> 
         getStudentsInfoOrBuilderList() {
      if (studentsInfoBuilder_ != null) {
        return studentsInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(studentsInfo_);
      }
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public com.class100.service.usercenter.RequestRStudentStruct.Builder addStudentsInfoBuilder() {
      return getStudentsInfoFieldBuilder().addBuilder(
          com.class100.service.usercenter.RequestRStudentStruct.getDefaultInstance());
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public com.class100.service.usercenter.RequestRStudentStruct.Builder addStudentsInfoBuilder(
        int index) {
      return getStudentsInfoFieldBuilder().addBuilder(
          index, com.class100.service.usercenter.RequestRStudentStruct.getDefaultInstance());
    }
    /**
     * <code>repeated .custom_proto.RequestRStudentStruct studentsInfo = 1;</code>
     */
    public java.util.List<com.class100.service.usercenter.RequestRStudentStruct.Builder> 
         getStudentsInfoBuilderList() {
      return getStudentsInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.class100.service.usercenter.RequestRStudentStruct, com.class100.service.usercenter.RequestRStudentStruct.Builder, com.class100.service.usercenter.RequestRStudentStructOrBuilder> 
        getStudentsInfoFieldBuilder() {
      if (studentsInfoBuilder_ == null) {
        studentsInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.class100.service.usercenter.RequestRStudentStruct, com.class100.service.usercenter.RequestRStudentStruct.Builder, com.class100.service.usercenter.RequestRStudentStructOrBuilder>(
                studentsInfo_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        studentsInfo_ = null;
      }
      return studentsInfoBuilder_;
    }

    private long count_ ;
    /**
     * <code>int64 count = 2;</code>
     */
    public long getCount() {
      return count_;
    }
    /**
     * <code>int64 count = 2;</code>
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:custom_proto.ReplyGetStudents)
  }

  // @@protoc_insertion_point(class_scope:custom_proto.ReplyGetStudents)
  private static final com.class100.service.usercenter.ReplyGetStudents DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.class100.service.usercenter.ReplyGetStudents();
  }

  public static com.class100.service.usercenter.ReplyGetStudents getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplyGetStudents>
      PARSER = new com.google.protobuf.AbstractParser<ReplyGetStudents>() {
    public ReplyGetStudents parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReplyGetStudents(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReplyGetStudents> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplyGetStudents> getParserForType() {
    return PARSER;
  }

  public com.class100.service.usercenter.ReplyGetStudents getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

