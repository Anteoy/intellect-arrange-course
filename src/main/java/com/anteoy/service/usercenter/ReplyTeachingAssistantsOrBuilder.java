// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.anteoy.service.usercenter;

public interface ReplyTeachingAssistantsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:custom_proto.ReplyTeachingAssistants)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string code = 2;</code>
   */
  java.lang.String getCode();
  /**
   * <code>string code = 2;</code>
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>repeated .custom_proto.RequestRTeachingAssistantStruct sls = 3;</code>
   */
  java.util.List<RequestRTeachingAssistantStruct>
      getSlsList();
  /**
   * <code>repeated .custom_proto.RequestRTeachingAssistantStruct sls = 3;</code>
   */
  RequestRTeachingAssistantStruct getSls(int index);
  /**
   * <code>repeated .custom_proto.RequestRTeachingAssistantStruct sls = 3;</code>
   */
  int getSlsCount();
  /**
   * <code>repeated .custom_proto.RequestRTeachingAssistantStruct sls = 3;</code>
   */
  java.util.List<? extends RequestRTeachingAssistantStructOrBuilder>
      getSlsOrBuilderList();
  /**
   * <code>repeated .custom_proto.RequestRTeachingAssistantStruct sls = 3;</code>
   */
  RequestRTeachingAssistantStructOrBuilder getSlsOrBuilder(
      int index);

  /**
   * <code>int64 total = 4;</code>
   */
  long getTotal();
}
