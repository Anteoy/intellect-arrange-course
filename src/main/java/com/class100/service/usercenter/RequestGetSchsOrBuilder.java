// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.class100.service.usercenter;

public interface RequestGetSchsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:custom_proto.RequestGetSchs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 pageSize = 1;</code>
   */
  long getPageSize();

  /**
   * <code>int64 currentPage = 2;</code>
   */
  long getCurrentPage();

  /**
   * <pre>
   * 搜索条件
   * </pre>
   *
   * <code>string searchName = 3;</code>
   */
  java.lang.String getSearchName();
  /**
   * <pre>
   * 搜索条件
   * </pre>
   *
   * <code>string searchName = 3;</code>
   */
  com.google.protobuf.ByteString
      getSearchNameBytes();

  /**
   * <pre>
   *额外搜索条件
   * </pre>
   *
   * <code>int64 ExtraFlag = 4;</code>
   */
  long getExtraFlag();
}
