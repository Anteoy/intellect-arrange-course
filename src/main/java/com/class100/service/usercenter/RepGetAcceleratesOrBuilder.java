// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

public interface RepGetAcceleratesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:custom_proto.RepGetAccelerates)
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
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  java.util.List<com.class100.service.usercenter.Accelerates> 
      getSlsList();
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  com.class100.service.usercenter.Accelerates getSls(int index);
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  int getSlsCount();
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  java.util.List<? extends com.class100.service.usercenter.AcceleratesOrBuilder> 
      getSlsOrBuilderList();
  /**
   * <code>repeated .custom_proto.Accelerates sls = 3;</code>
   */
  com.class100.service.usercenter.AcceleratesOrBuilder getSlsOrBuilder(
      int index);

  /**
   * <code>int64 total = 4;</code>
   */
  long getTotal();
}
