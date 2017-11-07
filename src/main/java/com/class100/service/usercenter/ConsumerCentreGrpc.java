package com.class100.service.usercenter;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: custom_proto.proto")
public final class ConsumerCentreGrpc {

  private ConsumerCentreGrpc() {}

  public static final String SERVICE_NAME = "custom_proto.ConsumerCentre";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestAuthStruct,
      com.class100.service.usercenter.ReplyAuthStudent> METHOD_AUTH_STUDENT =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestAuthStruct, com.class100.service.usercenter.ReplyAuthStudent>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyAuthStudent.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthStudent"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestAuthStruct,
      com.class100.service.usercenter.ReplyAuthTeacher> METHOD_AUTH_TEACHER =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestAuthStruct, com.class100.service.usercenter.ReplyAuthTeacher>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyAuthTeacher.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthTeacher"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestAuthStruct,
      com.class100.service.usercenter.ReplyAuthTeachingAssistant> METHOD_AUTH_TEACHING_ASSISTANT =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestAuthStruct, com.class100.service.usercenter.ReplyAuthTeachingAssistant>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthTeachingAssistant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyAuthTeachingAssistant.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthTeachingAssistant"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestAuthStruct,
      com.class100.service.usercenter.ReplyAuthSchool> METHOD_AUTH_SCHOOL =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestAuthStruct, com.class100.service.usercenter.ReplyAuthSchool>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthSchool"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyAuthSchool.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthSchool"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRStudentStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_REGISTER_STUDENT =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRStudentStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRStudentStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterStudent"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRTeacherStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_REGISTER_TEACHER =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRTeacherStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRTeacherStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterTeacher"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRTeachingAssistantStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_REGISTER_TEACHING_ASSISTANT =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRTeachingAssistantStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterTeachingAssistant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRTeachingAssistantStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterTeachingAssistant"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRSchoolStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_REGISTER_SCHOOL =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRSchoolStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterSchool"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRSchoolStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterSchool"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRStudentStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_UPDATE_STUDENT =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRStudentStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRStudentStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateStudent"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRTeacherStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_UPDATE_TEACHER =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRTeacherStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRTeacherStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateTeacher"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRTeachingAssistantStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_UPDATE_TEACHING_ASSISTANT =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRTeachingAssistantStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateTeachingAssistant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRTeachingAssistantStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateTeachingAssistant"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRSchoolStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_UPDATE_SCHOOL =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRSchoolStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateSchool"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRSchoolStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateSchool"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestGetStus,
      com.class100.service.usercenter.CascadeStuGRPCs> METHOD_GET_STUDENTS =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestGetStus, com.class100.service.usercenter.CascadeStuGRPCs>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudents"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestGetStus.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.CascadeStuGRPCs.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudents"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestGetTeas,
      com.class100.service.usercenter.ReplyTeachers> METHOD_GET_TEACHERS =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestGetTeas, com.class100.service.usercenter.ReplyTeachers>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTeachers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestGetTeas.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyTeachers.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTeachers"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestGetTeaassis,
      com.class100.service.usercenter.ReplyTeachingAssistants> METHOD_GET_TEACHING_ASSISTANTS =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestGetTeaassis, com.class100.service.usercenter.ReplyTeachingAssistants>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTeachingAssistants"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestGetTeaassis.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyTeachingAssistants.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTeachingAssistants"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestGetSchs,
      com.class100.service.usercenter.ReplySchools> METHOD_GET_SCHOOLS =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestGetSchs, com.class100.service.usercenter.ReplySchools>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchools"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestGetSchs.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplySchools.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchools"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestGetClassesStruct,
      com.class100.service.usercenter.ReplyGetClassesStruct> METHOD_GET_CLASSES =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestGetClassesStruct, com.class100.service.usercenter.ReplyGetClassesStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetClasses"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestGetClassesStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyGetClassesStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetClasses"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.Request_studentinfo_app,
      com.class100.service.usercenter.RequestRStudentStruct> METHOD_GET_STUDENT_INFO_BY_ID =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.Request_studentinfo_app, com.class100.service.usercenter.RequestRStudentStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentInfoById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.Request_studentinfo_app.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRStudentStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentInfoById"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetStudentByLoginName,
      com.class100.service.usercenter.RequestRStudentStruct> METHOD_GET_STUDENT_BY_LOGIN_NAME =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetStudentByLoginName, com.class100.service.usercenter.RequestRStudentStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentByLoginName"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetStudentByLoginName.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRStudentStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentByLoginName"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.Request_MySchoolmate_app,
      com.class100.service.usercenter.Reply_MySchoolmate_app> METHOD_GET_MY_SCHOOLMATE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.Request_MySchoolmate_app, com.class100.service.usercenter.Reply_MySchoolmate_app>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetMySchoolmate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.Request_MySchoolmate_app.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.Reply_MySchoolmate_app.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetMySchoolmate"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestClassID,
      com.class100.service.usercenter.ReplyGetStudents> METHOD_GET_STUDENTS_BY_CLASS_ID =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestClassID, com.class100.service.usercenter.ReplyGetStudents>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentsByClassID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestClassID.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyGetStudents.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentsByClassID"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestStudentScreen,
      com.class100.service.usercenter.ReplyGetStudents> METHOD_GET_STUDENTS_BY_SCREEN =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestStudentScreen, com.class100.service.usercenter.ReplyGetStudents>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentsByScreen"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestStudentScreen.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyGetStudents.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentsByScreen"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.GetTeacherInfoByIdRequest,
      com.class100.service.usercenter.ReplyAuthTeacher> METHOD_GET_TEACHER_INFO_BY_ID =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.GetTeacherInfoByIdRequest, com.class100.service.usercenter.ReplyAuthTeacher>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTeacherInfoById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.GetTeacherInfoByIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyAuthTeacher.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTeacherInfoById"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetAccelerates,
      com.class100.service.usercenter.RepGetAccelerates> METHOD_GET_ACCELERATES =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetAccelerates, com.class100.service.usercenter.RepGetAccelerates>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetAccelerates"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetAccelerates.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetAccelerates.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetAccelerates"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.Accelerates,
      com.class100.service.usercenter.ReplyRStruct> METHOD_CREATE_ACCELERATE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.Accelerates, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "CreateAccelerate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.Accelerates.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("CreateAccelerate"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.Accelerates,
      com.class100.service.usercenter.ReplyRStruct> METHOD_UPDATE_ACCELERATE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.Accelerates, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateAccelerate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.Accelerates.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateAccelerate"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestSchoolWechat,
      com.class100.service.usercenter.ResponseSchoolsByRegionType> METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestSchoolWechat, com.class100.service.usercenter.ResponseSchoolsByRegionType>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "FindAllSchoolByOregionType"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestSchoolWechat.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ResponseSchoolsByRegionType.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("FindAllSchoolByOregionType"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestSchoolCMS,
      com.class100.service.usercenter.ResponseSchoolsByRegionType> METHOD_FIND_ALL_SCHOOL_BY_OREGION =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestSchoolCMS, com.class100.service.usercenter.ResponseSchoolsByRegionType>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "FindAllSchoolByOregion"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestSchoolCMS.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ResponseSchoolsByRegionType.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("FindAllSchoolByOregion"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestPhone,
      com.class100.service.usercenter.ResponseExistedByPhoneStu> METHOD_IS_EXIST_STU_BY_PHONE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestPhone, com.class100.service.usercenter.ResponseExistedByPhoneStu>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "IsExistStuByPhone"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestPhone.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ResponseExistedByPhoneStu.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("IsExistStuByPhone"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestRStudentStruct,
      com.class100.service.usercenter.ReplyRStruct> METHOD_UPDATE_STUDENT_BY_PHONE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestRStudentStruct, com.class100.service.usercenter.ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateStudentByPhone"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRStudentStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateStudentByPhone"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetSchoolProvince,
      com.class100.service.usercenter.RepGetSchoolProvince> METHOD_GET_SCHOOL_PROVINCE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetSchoolProvince, com.class100.service.usercenter.RepGetSchoolProvince>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchoolProvince"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetSchoolProvince.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetSchoolProvince.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchoolProvince"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetCityByProvince,
      com.class100.service.usercenter.RepGetCityByProvince> METHOD_GET_CITY_BY_PROVINCE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetCityByProvince, com.class100.service.usercenter.RepGetCityByProvince>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetCityByProvince"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetCityByProvince.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetCityByProvince.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetCityByProvince"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity,
      com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity> METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity, com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetRegionByTypeAndProvinceCity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetRegionByTypeAndProvinceCity"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetSchInfoByID,
      com.class100.service.usercenter.RequestRSchoolStruct> METHOD_GET_SCH_INFO_BY_ID =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetSchInfoByID, com.class100.service.usercenter.RequestRSchoolStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchInfoByID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetSchInfoByID.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestRSchoolStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchInfoByID"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetTextbooksVersion,
      com.class100.service.usercenter.RepGetTextbooksVersion> METHOD_GET_TEXTBOOKS_VERSION =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetTextbooksVersion, com.class100.service.usercenter.RepGetTextbooksVersion>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTextbooksVersion"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetTextbooksVersion.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetTextbooksVersion.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTextbooksVersion"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestUIDs,
      com.class100.service.usercenter.ReplyGetStudents> METHOD_GET_STUDENTS_BY_UIDS =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestUIDs, com.class100.service.usercenter.ReplyGetStudents>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentsByUIDs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestUIDs.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyGetStudents.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentsByUIDs"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade,
      com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade> METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade, com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentIDsBySchoolGrade"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentIDsBySchoolGrade"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.RequestUIDs,
      com.class100.service.usercenter.ReplySchools> METHOD_GET_SCHOOLS_BY_UIDS =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.RequestUIDs, com.class100.service.usercenter.ReplySchools>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchoolsByUIDs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RequestUIDs.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReplySchools.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchoolsByUIDs"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetClassInfoById,
      com.class100.service.usercenter.RepGetClassInfoById> METHOD_GET_CLASS_INFO_BY_ID =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetClassInfoById, com.class100.service.usercenter.RepGetClassInfoById>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetClassInfoById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetClassInfoById.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetClassInfoById.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetClassInfoById"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetClassBySchoolD,
      com.class100.service.usercenter.RepGetClassBySchoolD> METHOD_GET_CLASS_BY_SCHOOL_D =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetClassBySchoolD, com.class100.service.usercenter.RepGetClassBySchoolD>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetClassBySchoolD"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetClassBySchoolD.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetClassBySchoolD.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetClassBySchoolD"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.class100.service.usercenter.ReqGetforeignerByNickName,
      com.class100.service.usercenter.RepGetforeignerByNickName> METHOD_GETFOREIGNER_BY_NICK_NAME =
      io.grpc.MethodDescriptor.<com.class100.service.usercenter.ReqGetforeignerByNickName, com.class100.service.usercenter.RepGetforeignerByNickName>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetforeignerByNickName"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.ReqGetforeignerByNickName.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.class100.service.usercenter.RepGetforeignerByNickName.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetforeignerByNickName"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsumerCentreStub newStub(io.grpc.Channel channel) {
    return new ConsumerCentreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsumerCentreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConsumerCentreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsumerCentreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConsumerCentreFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ConsumerCentreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 统一认证登录
     * </pre>
     */
    public void authStudent(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthStudent> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_STUDENT, responseObserver);
    }

    /**
     */
    public void authTeacher(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeacher> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_TEACHER, responseObserver);
    }

    /**
     */
    public void authTeachingAssistant(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeachingAssistant> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_TEACHING_ASSISTANT, responseObserver);
    }

    /**
     */
    public void authSchool(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthSchool> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_SCHOOL, responseObserver);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public void registerStudent(com.class100.service.usercenter.RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_STUDENT, responseObserver);
    }

    /**
     */
    public void registerTeacher(com.class100.service.usercenter.RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_TEACHER, responseObserver);
    }

    /**
     */
    public void registerTeachingAssistant(com.class100.service.usercenter.RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_TEACHING_ASSISTANT, responseObserver);
    }

    /**
     */
    public void registerSchool(com.class100.service.usercenter.RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_SCHOOL, responseObserver);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public void updateStudent(com.class100.service.usercenter.RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STUDENT, responseObserver);
    }

    /**
     */
    public void updateTeacher(com.class100.service.usercenter.RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TEACHER, responseObserver);
    }

    /**
     */
    public void updateTeachingAssistant(com.class100.service.usercenter.RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TEACHING_ASSISTANT, responseObserver);
    }

    /**
     */
    public void updateSchool(com.class100.service.usercenter.RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SCHOOL, responseObserver);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public void getStudents(com.class100.service.usercenter.RequestGetStus request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.CascadeStuGRPCs> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS, responseObserver);
    }

    /**
     */
    public void getTeachers(com.class100.service.usercenter.RequestGetTeas request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyTeachers> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEACHERS, responseObserver);
    }

    /**
     */
    public void getTeachingAssistants(com.class100.service.usercenter.RequestGetTeaassis request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyTeachingAssistants> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEACHING_ASSISTANTS, responseObserver);
    }

    /**
     */
    public void getSchools(com.class100.service.usercenter.RequestGetSchs request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplySchools> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCHOOLS, responseObserver);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public void getClasses(com.class100.service.usercenter.RequestGetClassesStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetClassesStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLASSES, responseObserver);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public void getStudentInfoById(com.class100.service.usercenter.Request_studentinfo_app request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRStudentStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENT_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public void getStudentByLoginName(com.class100.service.usercenter.ReqGetStudentByLoginName request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRStudentStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENT_BY_LOGIN_NAME, responseObserver);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public void getMySchoolmate(com.class100.service.usercenter.Request_MySchoolmate_app request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.Reply_MySchoolmate_app> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MY_SCHOOLMATE, responseObserver);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public void getStudentsByClassID(com.class100.service.usercenter.RequestClassID request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS_BY_CLASS_ID, responseObserver);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public void getStudentsByScreen(com.class100.service.usercenter.RequestStudentScreen request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS_BY_SCREEN, responseObserver);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public void getTeacherInfoById(com.class100.service.usercenter.GetTeacherInfoByIdRequest request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeacher> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEACHER_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public void getAccelerates(com.class100.service.usercenter.ReqGetAccelerates request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetAccelerates> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ACCELERATES, responseObserver);
    }

    /**
     */
    public void createAccelerate(com.class100.service.usercenter.Accelerates request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ACCELERATE, responseObserver);
    }

    /**
     */
    public void updateAccelerate(com.class100.service.usercenter.Accelerates request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ACCELERATE, responseObserver);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public void findAllSchoolByOregionType(com.class100.service.usercenter.RequestSchoolWechat request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseSchoolsByRegionType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, responseObserver);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public void findAllSchoolByOregion(com.class100.service.usercenter.RequestSchoolCMS request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseSchoolsByRegionType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION, responseObserver);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public void isExistStuByPhone(com.class100.service.usercenter.RequestPhone request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseExistedByPhoneStu> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_EXIST_STU_BY_PHONE, responseObserver);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public void updateStudentByPhone(com.class100.service.usercenter.RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STUDENT_BY_PHONE, responseObserver);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public void getSchoolProvince(com.class100.service.usercenter.ReqGetSchoolProvince request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetSchoolProvince> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCHOOL_PROVINCE, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public void getCityByProvince(com.class100.service.usercenter.ReqGetCityByProvince request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetCityByProvince> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CITY_BY_PROVINCE, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public void getRegionByTypeAndProvinceCity(com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, responseObserver);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public void getSchInfoByID(com.class100.service.usercenter.ReqGetSchInfoByID request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRSchoolStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCH_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public void getTextbooksVersion(com.class100.service.usercenter.ReqGetTextbooksVersion request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetTextbooksVersion> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEXTBOOKS_VERSION, responseObserver);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public void getStudentsByUIDs(com.class100.service.usercenter.RequestUIDs request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS_BY_UIDS, responseObserver);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public void getStudentIDsBySchoolGrade(com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, responseObserver);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public void getSchoolsByUIDs(com.class100.service.usercenter.RequestUIDs request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplySchools> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCHOOLS_BY_UIDS, responseObserver);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public void getClassInfoById(com.class100.service.usercenter.ReqGetClassInfoById request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetClassInfoById> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLASS_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public void getClassBySchoolD(com.class100.service.usercenter.ReqGetClassBySchoolD request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetClassBySchoolD> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLASS_BY_SCHOOL_D, responseObserver);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public void getforeignerByNickName(com.class100.service.usercenter.ReqGetforeignerByNickName request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetforeignerByNickName> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GETFOREIGNER_BY_NICK_NAME, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_AUTH_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestAuthStruct,
                com.class100.service.usercenter.ReplyAuthStudent>(
                  this, METHODID_AUTH_STUDENT)))
          .addMethod(
            METHOD_AUTH_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestAuthStruct,
                com.class100.service.usercenter.ReplyAuthTeacher>(
                  this, METHODID_AUTH_TEACHER)))
          .addMethod(
            METHOD_AUTH_TEACHING_ASSISTANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestAuthStruct,
                com.class100.service.usercenter.ReplyAuthTeachingAssistant>(
                  this, METHODID_AUTH_TEACHING_ASSISTANT)))
          .addMethod(
            METHOD_AUTH_SCHOOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestAuthStruct,
                com.class100.service.usercenter.ReplyAuthSchool>(
                  this, METHODID_AUTH_SCHOOL)))
          .addMethod(
            METHOD_REGISTER_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRStudentStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_REGISTER_STUDENT)))
          .addMethod(
            METHOD_REGISTER_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRTeacherStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_REGISTER_TEACHER)))
          .addMethod(
            METHOD_REGISTER_TEACHING_ASSISTANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRTeachingAssistantStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_REGISTER_TEACHING_ASSISTANT)))
          .addMethod(
            METHOD_REGISTER_SCHOOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRSchoolStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_REGISTER_SCHOOL)))
          .addMethod(
            METHOD_UPDATE_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRStudentStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_UPDATE_STUDENT)))
          .addMethod(
            METHOD_UPDATE_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRTeacherStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_UPDATE_TEACHER)))
          .addMethod(
            METHOD_UPDATE_TEACHING_ASSISTANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRTeachingAssistantStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_UPDATE_TEACHING_ASSISTANT)))
          .addMethod(
            METHOD_UPDATE_SCHOOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRSchoolStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_UPDATE_SCHOOL)))
          .addMethod(
            METHOD_GET_STUDENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestGetStus,
                com.class100.service.usercenter.CascadeStuGRPCs>(
                  this, METHODID_GET_STUDENTS)))
          .addMethod(
            METHOD_GET_TEACHERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestGetTeas,
                com.class100.service.usercenter.ReplyTeachers>(
                  this, METHODID_GET_TEACHERS)))
          .addMethod(
            METHOD_GET_TEACHING_ASSISTANTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestGetTeaassis,
                com.class100.service.usercenter.ReplyTeachingAssistants>(
                  this, METHODID_GET_TEACHING_ASSISTANTS)))
          .addMethod(
            METHOD_GET_SCHOOLS,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestGetSchs,
                com.class100.service.usercenter.ReplySchools>(
                  this, METHODID_GET_SCHOOLS)))
          .addMethod(
            METHOD_GET_CLASSES,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestGetClassesStruct,
                com.class100.service.usercenter.ReplyGetClassesStruct>(
                  this, METHODID_GET_CLASSES)))
          .addMethod(
            METHOD_GET_STUDENT_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.Request_studentinfo_app,
                com.class100.service.usercenter.RequestRStudentStruct>(
                  this, METHODID_GET_STUDENT_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_STUDENT_BY_LOGIN_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetStudentByLoginName,
                com.class100.service.usercenter.RequestRStudentStruct>(
                  this, METHODID_GET_STUDENT_BY_LOGIN_NAME)))
          .addMethod(
            METHOD_GET_MY_SCHOOLMATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.Request_MySchoolmate_app,
                com.class100.service.usercenter.Reply_MySchoolmate_app>(
                  this, METHODID_GET_MY_SCHOOLMATE)))
          .addMethod(
            METHOD_GET_STUDENTS_BY_CLASS_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestClassID,
                com.class100.service.usercenter.ReplyGetStudents>(
                  this, METHODID_GET_STUDENTS_BY_CLASS_ID)))
          .addMethod(
            METHOD_GET_STUDENTS_BY_SCREEN,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestStudentScreen,
                com.class100.service.usercenter.ReplyGetStudents>(
                  this, METHODID_GET_STUDENTS_BY_SCREEN)))
          .addMethod(
            METHOD_GET_TEACHER_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.GetTeacherInfoByIdRequest,
                com.class100.service.usercenter.ReplyAuthTeacher>(
                  this, METHODID_GET_TEACHER_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_ACCELERATES,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetAccelerates,
                com.class100.service.usercenter.RepGetAccelerates>(
                  this, METHODID_GET_ACCELERATES)))
          .addMethod(
            METHOD_CREATE_ACCELERATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.Accelerates,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_CREATE_ACCELERATE)))
          .addMethod(
            METHOD_UPDATE_ACCELERATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.Accelerates,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_UPDATE_ACCELERATE)))
          .addMethod(
            METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestSchoolWechat,
                com.class100.service.usercenter.ResponseSchoolsByRegionType>(
                  this, METHODID_FIND_ALL_SCHOOL_BY_OREGION_TYPE)))
          .addMethod(
            METHOD_FIND_ALL_SCHOOL_BY_OREGION,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestSchoolCMS,
                com.class100.service.usercenter.ResponseSchoolsByRegionType>(
                  this, METHODID_FIND_ALL_SCHOOL_BY_OREGION)))
          .addMethod(
            METHOD_IS_EXIST_STU_BY_PHONE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestPhone,
                com.class100.service.usercenter.ResponseExistedByPhoneStu>(
                  this, METHODID_IS_EXIST_STU_BY_PHONE)))
          .addMethod(
            METHOD_UPDATE_STUDENT_BY_PHONE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestRStudentStruct,
                com.class100.service.usercenter.ReplyRStruct>(
                  this, METHODID_UPDATE_STUDENT_BY_PHONE)))
          .addMethod(
            METHOD_GET_SCHOOL_PROVINCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetSchoolProvince,
                com.class100.service.usercenter.RepGetSchoolProvince>(
                  this, METHODID_GET_SCHOOL_PROVINCE)))
          .addMethod(
            METHOD_GET_CITY_BY_PROVINCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetCityByProvince,
                com.class100.service.usercenter.RepGetCityByProvince>(
                  this, METHODID_GET_CITY_BY_PROVINCE)))
          .addMethod(
            METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity,
                com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity>(
                  this, METHODID_GET_REGION_BY_TYPE_AND_PROVINCE_CITY)))
          .addMethod(
            METHOD_GET_SCH_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetSchInfoByID,
                com.class100.service.usercenter.RequestRSchoolStruct>(
                  this, METHODID_GET_SCH_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_TEXTBOOKS_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetTextbooksVersion,
                com.class100.service.usercenter.RepGetTextbooksVersion>(
                  this, METHODID_GET_TEXTBOOKS_VERSION)))
          .addMethod(
            METHOD_GET_STUDENTS_BY_UIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestUIDs,
                com.class100.service.usercenter.ReplyGetStudents>(
                  this, METHODID_GET_STUDENTS_BY_UIDS)))
          .addMethod(
            METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade,
                com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade>(
                  this, METHODID_GET_STUDENT_IDS_BY_SCHOOL_GRADE)))
          .addMethod(
            METHOD_GET_SCHOOLS_BY_UIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.RequestUIDs,
                com.class100.service.usercenter.ReplySchools>(
                  this, METHODID_GET_SCHOOLS_BY_UIDS)))
          .addMethod(
            METHOD_GET_CLASS_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetClassInfoById,
                com.class100.service.usercenter.RepGetClassInfoById>(
                  this, METHODID_GET_CLASS_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_CLASS_BY_SCHOOL_D,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetClassBySchoolD,
                com.class100.service.usercenter.RepGetClassBySchoolD>(
                  this, METHODID_GET_CLASS_BY_SCHOOL_D)))
          .addMethod(
            METHOD_GETFOREIGNER_BY_NICK_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.class100.service.usercenter.ReqGetforeignerByNickName,
                com.class100.service.usercenter.RepGetforeignerByNickName>(
                  this, METHODID_GETFOREIGNER_BY_NICK_NAME)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ConsumerCentreStub extends io.grpc.stub.AbstractStub<ConsumerCentreStub> {
    private ConsumerCentreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsumerCentreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerCentreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsumerCentreStub(channel, callOptions);
    }

    /**
     * <pre>
     * 统一认证登录
     * </pre>
     */
    public void authStudent(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthStudent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authTeacher(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeacher> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authTeachingAssistant(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeachingAssistant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHING_ASSISTANT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authSchool(com.class100.service.usercenter.RequestAuthStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthSchool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_SCHOOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public void registerStudent(com.class100.service.usercenter.RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerTeacher(com.class100.service.usercenter.RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerTeachingAssistant(com.class100.service.usercenter.RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHING_ASSISTANT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerSchool(com.class100.service.usercenter.RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_SCHOOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public void updateStudent(com.class100.service.usercenter.RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeacher(com.class100.service.usercenter.RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeachingAssistant(com.class100.service.usercenter.RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHING_ASSISTANT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSchool(com.class100.service.usercenter.RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SCHOOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public void getStudents(com.class100.service.usercenter.RequestGetStus request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.CascadeStuGRPCs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeachers(com.class100.service.usercenter.RequestGetTeas request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyTeachers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeachingAssistants(com.class100.service.usercenter.RequestGetTeaassis request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyTeachingAssistants> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHING_ASSISTANTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSchools(com.class100.service.usercenter.RequestGetSchs request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplySchools> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public void getClasses(com.class100.service.usercenter.RequestGetClassesStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetClassesStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLASSES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public void getStudentInfoById(com.class100.service.usercenter.Request_studentinfo_app request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRStudentStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public void getStudentByLoginName(com.class100.service.usercenter.ReqGetStudentByLoginName request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRStudentStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_BY_LOGIN_NAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public void getMySchoolmate(com.class100.service.usercenter.Request_MySchoolmate_app request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.Reply_MySchoolmate_app> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MY_SCHOOLMATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public void getStudentsByClassID(com.class100.service.usercenter.RequestClassID request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_CLASS_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public void getStudentsByScreen(com.class100.service.usercenter.RequestStudentScreen request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_SCREEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public void getTeacherInfoById(com.class100.service.usercenter.GetTeacherInfoByIdRequest request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeacher> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHER_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public void getAccelerates(com.class100.service.usercenter.ReqGetAccelerates request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetAccelerates> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ACCELERATES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccelerate(com.class100.service.usercenter.Accelerates request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ACCELERATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccelerate(com.class100.service.usercenter.Accelerates request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ACCELERATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public void findAllSchoolByOregionType(com.class100.service.usercenter.RequestSchoolWechat request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseSchoolsByRegionType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public void findAllSchoolByOregion(com.class100.service.usercenter.RequestSchoolCMS request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseSchoolsByRegionType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public void isExistStuByPhone(com.class100.service.usercenter.RequestPhone request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseExistedByPhoneStu> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_EXIST_STU_BY_PHONE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public void updateStudentByPhone(com.class100.service.usercenter.RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT_BY_PHONE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public void getSchoolProvince(com.class100.service.usercenter.ReqGetSchoolProvince request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetSchoolProvince> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOL_PROVINCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public void getCityByProvince(com.class100.service.usercenter.ReqGetCityByProvince request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetCityByProvince> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CITY_BY_PROVINCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public void getRegionByTypeAndProvinceCity(com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public void getSchInfoByID(com.class100.service.usercenter.ReqGetSchInfoByID request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRSchoolStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCH_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public void getTextbooksVersion(com.class100.service.usercenter.ReqGetTextbooksVersion request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetTextbooksVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEXTBOOKS_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public void getStudentsByUIDs(com.class100.service.usercenter.RequestUIDs request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_UIDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public void getStudentIDsBySchoolGrade(com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public void getSchoolsByUIDs(com.class100.service.usercenter.RequestUIDs request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplySchools> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS_BY_UIDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public void getClassInfoById(com.class100.service.usercenter.ReqGetClassInfoById request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetClassInfoById> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public void getClassBySchoolD(com.class100.service.usercenter.ReqGetClassBySchoolD request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetClassBySchoolD> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_BY_SCHOOL_D, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public void getforeignerByNickName(com.class100.service.usercenter.ReqGetforeignerByNickName request,
        io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetforeignerByNickName> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GETFOREIGNER_BY_NICK_NAME, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ConsumerCentreBlockingStub extends io.grpc.stub.AbstractStub<ConsumerCentreBlockingStub> {
    private ConsumerCentreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsumerCentreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerCentreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsumerCentreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 统一认证登录
     * </pre>
     */
    public com.class100.service.usercenter.ReplyAuthStudent authStudent(com.class100.service.usercenter.RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_STUDENT, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyAuthTeacher authTeacher(com.class100.service.usercenter.RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_TEACHER, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyAuthTeachingAssistant authTeachingAssistant(com.class100.service.usercenter.RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_TEACHING_ASSISTANT, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyAuthSchool authSchool(com.class100.service.usercenter.RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_SCHOOL, getCallOptions(), request);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public com.class100.service.usercenter.ReplyRStruct registerStudent(com.class100.service.usercenter.RequestRStudentStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_STUDENT, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct registerTeacher(com.class100.service.usercenter.RequestRTeacherStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_TEACHER, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct registerTeachingAssistant(com.class100.service.usercenter.RequestRTeachingAssistantStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_TEACHING_ASSISTANT, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct registerSchool(com.class100.service.usercenter.RequestRSchoolStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_SCHOOL, getCallOptions(), request);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public com.class100.service.usercenter.ReplyRStruct updateStudent(com.class100.service.usercenter.RequestRStudentStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STUDENT, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct updateTeacher(com.class100.service.usercenter.RequestRTeacherStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TEACHER, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct updateTeachingAssistant(com.class100.service.usercenter.RequestRTeachingAssistantStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TEACHING_ASSISTANT, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct updateSchool(com.class100.service.usercenter.RequestRSchoolStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SCHOOL, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public com.class100.service.usercenter.CascadeStuGRPCs getStudents(com.class100.service.usercenter.RequestGetStus request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyTeachers getTeachers(com.class100.service.usercenter.RequestGetTeas request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEACHERS, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyTeachingAssistants getTeachingAssistants(com.class100.service.usercenter.RequestGetTeaassis request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEACHING_ASSISTANTS, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplySchools getSchools(com.class100.service.usercenter.RequestGetSchs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCHOOLS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public com.class100.service.usercenter.ReplyGetClassesStruct getClasses(com.class100.service.usercenter.RequestGetClassesStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLASSES, getCallOptions(), request);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public com.class100.service.usercenter.RequestRStudentStruct getStudentInfoById(com.class100.service.usercenter.Request_studentinfo_app request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENT_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public com.class100.service.usercenter.RequestRStudentStruct getStudentByLoginName(com.class100.service.usercenter.ReqGetStudentByLoginName request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENT_BY_LOGIN_NAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public com.class100.service.usercenter.Reply_MySchoolmate_app getMySchoolmate(com.class100.service.usercenter.Request_MySchoolmate_app request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MY_SCHOOLMATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public com.class100.service.usercenter.ReplyGetStudents getStudentsByClassID(com.class100.service.usercenter.RequestClassID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS_BY_CLASS_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public com.class100.service.usercenter.ReplyGetStudents getStudentsByScreen(com.class100.service.usercenter.RequestStudentScreen request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS_BY_SCREEN, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public com.class100.service.usercenter.ReplyAuthTeacher getTeacherInfoById(com.class100.service.usercenter.GetTeacherInfoByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEACHER_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public com.class100.service.usercenter.RepGetAccelerates getAccelerates(com.class100.service.usercenter.ReqGetAccelerates request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ACCELERATES, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct createAccelerate(com.class100.service.usercenter.Accelerates request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ACCELERATE, getCallOptions(), request);
    }

    /**
     */
    public com.class100.service.usercenter.ReplyRStruct updateAccelerate(com.class100.service.usercenter.Accelerates request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ACCELERATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public com.class100.service.usercenter.ResponseSchoolsByRegionType findAllSchoolByOregionType(com.class100.service.usercenter.RequestSchoolWechat request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public com.class100.service.usercenter.ResponseSchoolsByRegionType findAllSchoolByOregion(com.class100.service.usercenter.RequestSchoolCMS request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ALL_SCHOOL_BY_OREGION, getCallOptions(), request);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public com.class100.service.usercenter.ResponseExistedByPhoneStu isExistStuByPhone(com.class100.service.usercenter.RequestPhone request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_EXIST_STU_BY_PHONE, getCallOptions(), request);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public com.class100.service.usercenter.ReplyRStruct updateStudentByPhone(com.class100.service.usercenter.RequestRStudentStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STUDENT_BY_PHONE, getCallOptions(), request);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public com.class100.service.usercenter.RepGetSchoolProvince getSchoolProvince(com.class100.service.usercenter.ReqGetSchoolProvince request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCHOOL_PROVINCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public com.class100.service.usercenter.RepGetCityByProvince getCityByProvince(com.class100.service.usercenter.ReqGetCityByProvince request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CITY_BY_PROVINCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity getRegionByTypeAndProvinceCity(com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public com.class100.service.usercenter.RequestRSchoolStruct getSchInfoByID(com.class100.service.usercenter.ReqGetSchInfoByID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCH_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public com.class100.service.usercenter.RepGetTextbooksVersion getTextbooksVersion(com.class100.service.usercenter.ReqGetTextbooksVersion request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEXTBOOKS_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public com.class100.service.usercenter.ReplyGetStudents getStudentsByUIDs(com.class100.service.usercenter.RequestUIDs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS_BY_UIDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade getStudentIDsBySchoolGrade(com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public com.class100.service.usercenter.ReplySchools getSchoolsByUIDs(com.class100.service.usercenter.RequestUIDs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCHOOLS_BY_UIDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public com.class100.service.usercenter.RepGetClassInfoById getClassInfoById(com.class100.service.usercenter.ReqGetClassInfoById request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLASS_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public com.class100.service.usercenter.RepGetClassBySchoolD getClassBySchoolD(com.class100.service.usercenter.ReqGetClassBySchoolD request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLASS_BY_SCHOOL_D, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public com.class100.service.usercenter.RepGetforeignerByNickName getforeignerByNickName(com.class100.service.usercenter.ReqGetforeignerByNickName request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GETFOREIGNER_BY_NICK_NAME, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ConsumerCentreFutureStub extends io.grpc.stub.AbstractStub<ConsumerCentreFutureStub> {
    private ConsumerCentreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsumerCentreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerCentreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsumerCentreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 统一认证登录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyAuthStudent> authStudent(
        com.class100.service.usercenter.RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_STUDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyAuthTeacher> authTeacher(
        com.class100.service.usercenter.RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyAuthTeachingAssistant> authTeachingAssistant(
        com.class100.service.usercenter.RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHING_ASSISTANT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyAuthSchool> authSchool(
        com.class100.service.usercenter.RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_SCHOOL, getCallOptions()), request);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> registerStudent(
        com.class100.service.usercenter.RequestRStudentStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_STUDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> registerTeacher(
        com.class100.service.usercenter.RequestRTeacherStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> registerTeachingAssistant(
        com.class100.service.usercenter.RequestRTeachingAssistantStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHING_ASSISTANT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> registerSchool(
        com.class100.service.usercenter.RequestRSchoolStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_SCHOOL, getCallOptions()), request);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> updateStudent(
        com.class100.service.usercenter.RequestRStudentStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> updateTeacher(
        com.class100.service.usercenter.RequestRTeacherStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> updateTeachingAssistant(
        com.class100.service.usercenter.RequestRTeachingAssistantStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHING_ASSISTANT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> updateSchool(
        com.class100.service.usercenter.RequestRSchoolStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SCHOOL, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.CascadeStuGRPCs> getStudents(
        com.class100.service.usercenter.RequestGetStus request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyTeachers> getTeachers(
        com.class100.service.usercenter.RequestGetTeas request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyTeachingAssistants> getTeachingAssistants(
        com.class100.service.usercenter.RequestGetTeaassis request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHING_ASSISTANTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplySchools> getSchools(
        com.class100.service.usercenter.RequestGetSchs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyGetClassesStruct> getClasses(
        com.class100.service.usercenter.RequestGetClassesStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLASSES, getCallOptions()), request);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RequestRStudentStruct> getStudentInfoById(
        com.class100.service.usercenter.Request_studentinfo_app request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RequestRStudentStruct> getStudentByLoginName(
        com.class100.service.usercenter.ReqGetStudentByLoginName request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_BY_LOGIN_NAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.Reply_MySchoolmate_app> getMySchoolmate(
        com.class100.service.usercenter.Request_MySchoolmate_app request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MY_SCHOOLMATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyGetStudents> getStudentsByClassID(
        com.class100.service.usercenter.RequestClassID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_CLASS_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyGetStudents> getStudentsByScreen(
        com.class100.service.usercenter.RequestStudentScreen request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_SCREEN, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyAuthTeacher> getTeacherInfoById(
        com.class100.service.usercenter.GetTeacherInfoByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHER_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetAccelerates> getAccelerates(
        com.class100.service.usercenter.ReqGetAccelerates request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ACCELERATES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> createAccelerate(
        com.class100.service.usercenter.Accelerates request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ACCELERATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> updateAccelerate(
        com.class100.service.usercenter.Accelerates request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ACCELERATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ResponseSchoolsByRegionType> findAllSchoolByOregionType(
        com.class100.service.usercenter.RequestSchoolWechat request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ResponseSchoolsByRegionType> findAllSchoolByOregion(
        com.class100.service.usercenter.RequestSchoolCMS request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION, getCallOptions()), request);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ResponseExistedByPhoneStu> isExistStuByPhone(
        com.class100.service.usercenter.RequestPhone request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_EXIST_STU_BY_PHONE, getCallOptions()), request);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyRStruct> updateStudentByPhone(
        com.class100.service.usercenter.RequestRStudentStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT_BY_PHONE, getCallOptions()), request);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetSchoolProvince> getSchoolProvince(
        com.class100.service.usercenter.ReqGetSchoolProvince request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOL_PROVINCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetCityByProvince> getCityByProvince(
        com.class100.service.usercenter.ReqGetCityByProvince request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CITY_BY_PROVINCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity> getRegionByTypeAndProvinceCity(
        com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RequestRSchoolStruct> getSchInfoByID(
        com.class100.service.usercenter.ReqGetSchInfoByID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCH_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetTextbooksVersion> getTextbooksVersion(
        com.class100.service.usercenter.ReqGetTextbooksVersion request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEXTBOOKS_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyGetStudents> getStudentsByUIDs(
        com.class100.service.usercenter.RequestUIDs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_UIDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade> getStudentIDsBySchoolGrade(
        com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.ReplySchools> getSchoolsByUIDs(
        com.class100.service.usercenter.RequestUIDs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS_BY_UIDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetClassInfoById> getClassInfoById(
        com.class100.service.usercenter.ReqGetClassInfoById request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetClassBySchoolD> getClassBySchoolD(
        com.class100.service.usercenter.ReqGetClassBySchoolD request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_BY_SCHOOL_D, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.class100.service.usercenter.RepGetforeignerByNickName> getforeignerByNickName(
        com.class100.service.usercenter.ReqGetforeignerByNickName request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GETFOREIGNER_BY_NICK_NAME, getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH_STUDENT = 0;
  private static final int METHODID_AUTH_TEACHER = 1;
  private static final int METHODID_AUTH_TEACHING_ASSISTANT = 2;
  private static final int METHODID_AUTH_SCHOOL = 3;
  private static final int METHODID_REGISTER_STUDENT = 4;
  private static final int METHODID_REGISTER_TEACHER = 5;
  private static final int METHODID_REGISTER_TEACHING_ASSISTANT = 6;
  private static final int METHODID_REGISTER_SCHOOL = 7;
  private static final int METHODID_UPDATE_STUDENT = 8;
  private static final int METHODID_UPDATE_TEACHER = 9;
  private static final int METHODID_UPDATE_TEACHING_ASSISTANT = 10;
  private static final int METHODID_UPDATE_SCHOOL = 11;
  private static final int METHODID_GET_STUDENTS = 12;
  private static final int METHODID_GET_TEACHERS = 13;
  private static final int METHODID_GET_TEACHING_ASSISTANTS = 14;
  private static final int METHODID_GET_SCHOOLS = 15;
  private static final int METHODID_GET_CLASSES = 16;
  private static final int METHODID_GET_STUDENT_INFO_BY_ID = 17;
  private static final int METHODID_GET_STUDENT_BY_LOGIN_NAME = 18;
  private static final int METHODID_GET_MY_SCHOOLMATE = 19;
  private static final int METHODID_GET_STUDENTS_BY_CLASS_ID = 20;
  private static final int METHODID_GET_STUDENTS_BY_SCREEN = 21;
  private static final int METHODID_GET_TEACHER_INFO_BY_ID = 22;
  private static final int METHODID_GET_ACCELERATES = 23;
  private static final int METHODID_CREATE_ACCELERATE = 24;
  private static final int METHODID_UPDATE_ACCELERATE = 25;
  private static final int METHODID_FIND_ALL_SCHOOL_BY_OREGION_TYPE = 26;
  private static final int METHODID_FIND_ALL_SCHOOL_BY_OREGION = 27;
  private static final int METHODID_IS_EXIST_STU_BY_PHONE = 28;
  private static final int METHODID_UPDATE_STUDENT_BY_PHONE = 29;
  private static final int METHODID_GET_SCHOOL_PROVINCE = 30;
  private static final int METHODID_GET_CITY_BY_PROVINCE = 31;
  private static final int METHODID_GET_REGION_BY_TYPE_AND_PROVINCE_CITY = 32;
  private static final int METHODID_GET_SCH_INFO_BY_ID = 33;
  private static final int METHODID_GET_TEXTBOOKS_VERSION = 34;
  private static final int METHODID_GET_STUDENTS_BY_UIDS = 35;
  private static final int METHODID_GET_STUDENT_IDS_BY_SCHOOL_GRADE = 36;
  private static final int METHODID_GET_SCHOOLS_BY_UIDS = 37;
  private static final int METHODID_GET_CLASS_INFO_BY_ID = 38;
  private static final int METHODID_GET_CLASS_BY_SCHOOL_D = 39;
  private static final int METHODID_GETFOREIGNER_BY_NICK_NAME = 40;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsumerCentreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsumerCentreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTH_STUDENT:
          serviceImpl.authStudent((com.class100.service.usercenter.RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthStudent>) responseObserver);
          break;
        case METHODID_AUTH_TEACHER:
          serviceImpl.authTeacher((com.class100.service.usercenter.RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeacher>) responseObserver);
          break;
        case METHODID_AUTH_TEACHING_ASSISTANT:
          serviceImpl.authTeachingAssistant((com.class100.service.usercenter.RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeachingAssistant>) responseObserver);
          break;
        case METHODID_AUTH_SCHOOL:
          serviceImpl.authSchool((com.class100.service.usercenter.RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthSchool>) responseObserver);
          break;
        case METHODID_REGISTER_STUDENT:
          serviceImpl.registerStudent((com.class100.service.usercenter.RequestRStudentStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_REGISTER_TEACHER:
          serviceImpl.registerTeacher((com.class100.service.usercenter.RequestRTeacherStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_REGISTER_TEACHING_ASSISTANT:
          serviceImpl.registerTeachingAssistant((com.class100.service.usercenter.RequestRTeachingAssistantStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_REGISTER_SCHOOL:
          serviceImpl.registerSchool((com.class100.service.usercenter.RequestRSchoolStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT:
          serviceImpl.updateStudent((com.class100.service.usercenter.RequestRStudentStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_TEACHER:
          serviceImpl.updateTeacher((com.class100.service.usercenter.RequestRTeacherStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_TEACHING_ASSISTANT:
          serviceImpl.updateTeachingAssistant((com.class100.service.usercenter.RequestRTeachingAssistantStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_SCHOOL:
          serviceImpl.updateSchool((com.class100.service.usercenter.RequestRSchoolStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_GET_STUDENTS:
          serviceImpl.getStudents((com.class100.service.usercenter.RequestGetStus) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.CascadeStuGRPCs>) responseObserver);
          break;
        case METHODID_GET_TEACHERS:
          serviceImpl.getTeachers((com.class100.service.usercenter.RequestGetTeas) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyTeachers>) responseObserver);
          break;
        case METHODID_GET_TEACHING_ASSISTANTS:
          serviceImpl.getTeachingAssistants((com.class100.service.usercenter.RequestGetTeaassis) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyTeachingAssistants>) responseObserver);
          break;
        case METHODID_GET_SCHOOLS:
          serviceImpl.getSchools((com.class100.service.usercenter.RequestGetSchs) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplySchools>) responseObserver);
          break;
        case METHODID_GET_CLASSES:
          serviceImpl.getClasses((com.class100.service.usercenter.RequestGetClassesStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetClassesStruct>) responseObserver);
          break;
        case METHODID_GET_STUDENT_INFO_BY_ID:
          serviceImpl.getStudentInfoById((com.class100.service.usercenter.Request_studentinfo_app) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRStudentStruct>) responseObserver);
          break;
        case METHODID_GET_STUDENT_BY_LOGIN_NAME:
          serviceImpl.getStudentByLoginName((com.class100.service.usercenter.ReqGetStudentByLoginName) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRStudentStruct>) responseObserver);
          break;
        case METHODID_GET_MY_SCHOOLMATE:
          serviceImpl.getMySchoolmate((com.class100.service.usercenter.Request_MySchoolmate_app) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.Reply_MySchoolmate_app>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_CLASS_ID:
          serviceImpl.getStudentsByClassID((com.class100.service.usercenter.RequestClassID) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_SCREEN:
          serviceImpl.getStudentsByScreen((com.class100.service.usercenter.RequestStudentScreen) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents>) responseObserver);
          break;
        case METHODID_GET_TEACHER_INFO_BY_ID:
          serviceImpl.getTeacherInfoById((com.class100.service.usercenter.GetTeacherInfoByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyAuthTeacher>) responseObserver);
          break;
        case METHODID_GET_ACCELERATES:
          serviceImpl.getAccelerates((com.class100.service.usercenter.ReqGetAccelerates) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetAccelerates>) responseObserver);
          break;
        case METHODID_CREATE_ACCELERATE:
          serviceImpl.createAccelerate((com.class100.service.usercenter.Accelerates) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_ACCELERATE:
          serviceImpl.updateAccelerate((com.class100.service.usercenter.Accelerates) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_FIND_ALL_SCHOOL_BY_OREGION_TYPE:
          serviceImpl.findAllSchoolByOregionType((com.class100.service.usercenter.RequestSchoolWechat) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseSchoolsByRegionType>) responseObserver);
          break;
        case METHODID_FIND_ALL_SCHOOL_BY_OREGION:
          serviceImpl.findAllSchoolByOregion((com.class100.service.usercenter.RequestSchoolCMS) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseSchoolsByRegionType>) responseObserver);
          break;
        case METHODID_IS_EXIST_STU_BY_PHONE:
          serviceImpl.isExistStuByPhone((com.class100.service.usercenter.RequestPhone) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ResponseExistedByPhoneStu>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT_BY_PHONE:
          serviceImpl.updateStudentByPhone((com.class100.service.usercenter.RequestRStudentStruct) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyRStruct>) responseObserver);
          break;
        case METHODID_GET_SCHOOL_PROVINCE:
          serviceImpl.getSchoolProvince((com.class100.service.usercenter.ReqGetSchoolProvince) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetSchoolProvince>) responseObserver);
          break;
        case METHODID_GET_CITY_BY_PROVINCE:
          serviceImpl.getCityByProvince((com.class100.service.usercenter.ReqGetCityByProvince) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetCityByProvince>) responseObserver);
          break;
        case METHODID_GET_REGION_BY_TYPE_AND_PROVINCE_CITY:
          serviceImpl.getRegionByTypeAndProvinceCity((com.class100.service.usercenter.ReqGetRegionByTypeAndProvinceCity) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetRegionByTypeAndProvinceCity>) responseObserver);
          break;
        case METHODID_GET_SCH_INFO_BY_ID:
          serviceImpl.getSchInfoByID((com.class100.service.usercenter.ReqGetSchInfoByID) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RequestRSchoolStruct>) responseObserver);
          break;
        case METHODID_GET_TEXTBOOKS_VERSION:
          serviceImpl.getTextbooksVersion((com.class100.service.usercenter.ReqGetTextbooksVersion) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetTextbooksVersion>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_UIDS:
          serviceImpl.getStudentsByUIDs((com.class100.service.usercenter.RequestUIDs) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudents>) responseObserver);
          break;
        case METHODID_GET_STUDENT_IDS_BY_SCHOOL_GRADE:
          serviceImpl.getStudentIDsBySchoolGrade((com.class100.service.usercenter.RequestGetStudentIDsBySchoolGrade) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplyGetStudentIDsBySchoolGrade>) responseObserver);
          break;
        case METHODID_GET_SCHOOLS_BY_UIDS:
          serviceImpl.getSchoolsByUIDs((com.class100.service.usercenter.RequestUIDs) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.ReplySchools>) responseObserver);
          break;
        case METHODID_GET_CLASS_INFO_BY_ID:
          serviceImpl.getClassInfoById((com.class100.service.usercenter.ReqGetClassInfoById) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetClassInfoById>) responseObserver);
          break;
        case METHODID_GET_CLASS_BY_SCHOOL_D:
          serviceImpl.getClassBySchoolD((com.class100.service.usercenter.ReqGetClassBySchoolD) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetClassBySchoolD>) responseObserver);
          break;
        case METHODID_GETFOREIGNER_BY_NICK_NAME:
          serviceImpl.getforeignerByNickName((com.class100.service.usercenter.ReqGetforeignerByNickName) request,
              (io.grpc.stub.StreamObserver<com.class100.service.usercenter.RepGetforeignerByNickName>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConsumerCentreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsumerCentreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.class100.service.usercenter.UserCenterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConsumerCentre");
    }
  }

  private static final class ConsumerCentreFileDescriptorSupplier
      extends ConsumerCentreBaseDescriptorSupplier {
    ConsumerCentreFileDescriptorSupplier() {}
  }

  private static final class ConsumerCentreMethodDescriptorSupplier
      extends ConsumerCentreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsumerCentreMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConsumerCentreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsumerCentreFileDescriptorSupplier())
              .addMethod(METHOD_AUTH_STUDENT)
              .addMethod(METHOD_AUTH_TEACHER)
              .addMethod(METHOD_AUTH_TEACHING_ASSISTANT)
              .addMethod(METHOD_AUTH_SCHOOL)
              .addMethod(METHOD_REGISTER_STUDENT)
              .addMethod(METHOD_REGISTER_TEACHER)
              .addMethod(METHOD_REGISTER_TEACHING_ASSISTANT)
              .addMethod(METHOD_REGISTER_SCHOOL)
              .addMethod(METHOD_UPDATE_STUDENT)
              .addMethod(METHOD_UPDATE_TEACHER)
              .addMethod(METHOD_UPDATE_TEACHING_ASSISTANT)
              .addMethod(METHOD_UPDATE_SCHOOL)
              .addMethod(METHOD_GET_STUDENTS)
              .addMethod(METHOD_GET_TEACHERS)
              .addMethod(METHOD_GET_TEACHING_ASSISTANTS)
              .addMethod(METHOD_GET_SCHOOLS)
              .addMethod(METHOD_GET_CLASSES)
              .addMethod(METHOD_GET_STUDENT_INFO_BY_ID)
              .addMethod(METHOD_GET_STUDENT_BY_LOGIN_NAME)
              .addMethod(METHOD_GET_MY_SCHOOLMATE)
              .addMethod(METHOD_GET_STUDENTS_BY_CLASS_ID)
              .addMethod(METHOD_GET_STUDENTS_BY_SCREEN)
              .addMethod(METHOD_GET_TEACHER_INFO_BY_ID)
              .addMethod(METHOD_GET_ACCELERATES)
              .addMethod(METHOD_CREATE_ACCELERATE)
              .addMethod(METHOD_UPDATE_ACCELERATE)
              .addMethod(METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE)
              .addMethod(METHOD_FIND_ALL_SCHOOL_BY_OREGION)
              .addMethod(METHOD_IS_EXIST_STU_BY_PHONE)
              .addMethod(METHOD_UPDATE_STUDENT_BY_PHONE)
              .addMethod(METHOD_GET_SCHOOL_PROVINCE)
              .addMethod(METHOD_GET_CITY_BY_PROVINCE)
              .addMethod(METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY)
              .addMethod(METHOD_GET_SCH_INFO_BY_ID)
              .addMethod(METHOD_GET_TEXTBOOKS_VERSION)
              .addMethod(METHOD_GET_STUDENTS_BY_UIDS)
              .addMethod(METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE)
              .addMethod(METHOD_GET_SCHOOLS_BY_UIDS)
              .addMethod(METHOD_GET_CLASS_INFO_BY_ID)
              .addMethod(METHOD_GET_CLASS_BY_SCHOOL_D)
              .addMethod(METHOD_GETFOREIGNER_BY_NICK_NAME)
              .build();
        }
      }
    }
    return result;
  }
}
