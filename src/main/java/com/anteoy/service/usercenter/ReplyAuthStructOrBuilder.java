// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.anteoy.service.usercenter;

public interface ReplyAuthStructOrBuilder extends
    // @@protoc_insertion_point(interface_extends:custom_proto.ReplyAuthStruct)
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
   * <pre>
   *200 认证成功 401 认证失败 500 服务器内部错误
   * </pre>
   *
   * <code>string code = 2;</code>
   */
  java.lang.String getCode();
  /**
   * <pre>
   *200 认证成功 401 认证失败 500 服务器内部错误
   * </pre>
   *
   * <code>string code = 2;</code>
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>string token = 3;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 3;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
