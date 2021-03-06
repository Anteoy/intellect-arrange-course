// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: custom_proto.proto

package com.anteoy.service.usercenter;

public interface RequestRSchoolStructOrBuilder extends
    // @@protoc_insertion_point(interface_extends:custom_proto.RequestRSchoolStruct)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string loginName = 2;</code>
   */
  java.lang.String getLoginName();
  /**
   * <code>string loginName = 2;</code>
   */
  com.google.protobuf.ByteString
      getLoginNameBytes();

  /**
   * <code>string password = 3;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 3;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string schoolname = 4;</code>
   */
  java.lang.String getSchoolname();
  /**
   * <code>string schoolname = 4;</code>
   */
  com.google.protobuf.ByteString
      getSchoolnameBytes();

  /**
   * <code>int64 regionId = 5;</code>
   */
  long getRegionId();

  /**
   * <code>string region_name = 6;</code>
   */
  java.lang.String getRegionName();
  /**
   * <code>string region_name = 6;</code>
   */
  com.google.protobuf.ByteString
      getRegionNameBytes();

  /**
   * <code>string city = 7;</code>
   */
  java.lang.String getCity();
  /**
   * <code>string city = 7;</code>
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>string province = 8;</code>
   */
  java.lang.String getProvince();
  /**
   * <code>string province = 8;</code>
   */
  com.google.protobuf.ByteString
      getProvinceBytes();

  /**
   * <code>repeated int64 grades = 9;</code>
   */
  java.util.List<java.lang.Long> getGradesList();
  /**
   * <code>repeated int64 grades = 9;</code>
   */
  int getGradesCount();
  /**
   * <code>repeated int64 grades = 9;</code>
   */
  long getGrades(int index);

  /**
   * <code>string sgrades = 10;</code>
   */
  java.lang.String getSgrades();
  /**
   * <code>string sgrades = 10;</code>
   */
  com.google.protobuf.ByteString
      getSgradesBytes();

  /**
   * <code>int64 phone = 11;</code>
   */
  long getPhone();

  /**
   * <code>int64 type = 12;</code>
   */
  long getType();

  /**
   * <code>map&lt;string, string&gt; GradesKV = 13;</code>
   */
  int getGradesKVCount();
  /**
   * <code>map&lt;string, string&gt; GradesKV = 13;</code>
   */
  boolean containsGradesKV(
      java.lang.String key);
  /**
   * Use {@link #getGradesKVMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getGradesKV();
  /**
   * <code>map&lt;string, string&gt; GradesKV = 13;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getGradesKVMap();
  /**
   * <code>map&lt;string, string&gt; GradesKV = 13;</code>
   */

  java.lang.String getGradesKVOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; GradesKV = 13;</code>
   */

  java.lang.String getGradesKVOrThrow(
      java.lang.String key);
}
