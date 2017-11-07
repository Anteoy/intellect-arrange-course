package com.anteoy.service.usercenter;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

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
  public static final io.grpc.MethodDescriptor<RequestAuthStruct,
          ReplyAuthStudent> METHOD_AUTH_STUDENT =
      io.grpc.MethodDescriptor.<RequestAuthStruct, ReplyAuthStudent>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyAuthStudent.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthStudent"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestAuthStruct,
          ReplyAuthTeacher> METHOD_AUTH_TEACHER =
      io.grpc.MethodDescriptor.<RequestAuthStruct, ReplyAuthTeacher>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyAuthTeacher.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthTeacher"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestAuthStruct,
          ReplyAuthTeachingAssistant> METHOD_AUTH_TEACHING_ASSISTANT =
      io.grpc.MethodDescriptor.<RequestAuthStruct, ReplyAuthTeachingAssistant>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthTeachingAssistant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyAuthTeachingAssistant.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthTeachingAssistant"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestAuthStruct,
          ReplyAuthSchool> METHOD_AUTH_SCHOOL =
      io.grpc.MethodDescriptor.<RequestAuthStruct, ReplyAuthSchool>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "AuthSchool"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestAuthStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyAuthSchool.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("AuthSchool"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRStudentStruct,
          ReplyRStruct> METHOD_REGISTER_STUDENT =
      io.grpc.MethodDescriptor.<RequestRStudentStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRStudentStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterStudent"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRTeacherStruct,
          ReplyRStruct> METHOD_REGISTER_TEACHER =
      io.grpc.MethodDescriptor.<RequestRTeacherStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRTeacherStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterTeacher"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRTeachingAssistantStruct,
          ReplyRStruct> METHOD_REGISTER_TEACHING_ASSISTANT =
      io.grpc.MethodDescriptor.<RequestRTeachingAssistantStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterTeachingAssistant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRTeachingAssistantStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterTeachingAssistant"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRSchoolStruct,
          ReplyRStruct> METHOD_REGISTER_SCHOOL =
      io.grpc.MethodDescriptor.<RequestRSchoolStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "RegisterSchool"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRSchoolStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("RegisterSchool"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRStudentStruct,
          ReplyRStruct> METHOD_UPDATE_STUDENT =
      io.grpc.MethodDescriptor.<RequestRStudentStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRStudentStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateStudent"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRTeacherStruct,
          ReplyRStruct> METHOD_UPDATE_TEACHER =
      io.grpc.MethodDescriptor.<RequestRTeacherStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRTeacherStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateTeacher"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRTeachingAssistantStruct,
          ReplyRStruct> METHOD_UPDATE_TEACHING_ASSISTANT =
      io.grpc.MethodDescriptor.<RequestRTeachingAssistantStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateTeachingAssistant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRTeachingAssistantStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateTeachingAssistant"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRSchoolStruct,
          ReplyRStruct> METHOD_UPDATE_SCHOOL =
      io.grpc.MethodDescriptor.<RequestRSchoolStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateSchool"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRSchoolStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateSchool"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestGetStus,
          CascadeStuGRPCs> METHOD_GET_STUDENTS =
      io.grpc.MethodDescriptor.<RequestGetStus, CascadeStuGRPCs>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudents"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestGetStus.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              CascadeStuGRPCs.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudents"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestGetTeas,
          ReplyTeachers> METHOD_GET_TEACHERS =
      io.grpc.MethodDescriptor.<RequestGetTeas, ReplyTeachers>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTeachers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestGetTeas.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyTeachers.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTeachers"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestGetTeaassis,
          ReplyTeachingAssistants> METHOD_GET_TEACHING_ASSISTANTS =
      io.grpc.MethodDescriptor.<RequestGetTeaassis, ReplyTeachingAssistants>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTeachingAssistants"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestGetTeaassis.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyTeachingAssistants.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTeachingAssistants"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestGetSchs,
          ReplySchools> METHOD_GET_SCHOOLS =
      io.grpc.MethodDescriptor.<RequestGetSchs, ReplySchools>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchools"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestGetSchs.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplySchools.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchools"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestGetClassesStruct,
          ReplyGetClassesStruct> METHOD_GET_CLASSES =
      io.grpc.MethodDescriptor.<RequestGetClassesStruct, ReplyGetClassesStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetClasses"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestGetClassesStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyGetClassesStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetClasses"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<Request_studentinfo_app,
          RequestRStudentStruct> METHOD_GET_STUDENT_INFO_BY_ID =
      io.grpc.MethodDescriptor.<Request_studentinfo_app, RequestRStudentStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentInfoById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Request_studentinfo_app.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRStudentStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentInfoById"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetStudentByLoginName,
          RequestRStudentStruct> METHOD_GET_STUDENT_BY_LOGIN_NAME =
      io.grpc.MethodDescriptor.<ReqGetStudentByLoginName, RequestRStudentStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentByLoginName"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetStudentByLoginName.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRStudentStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentByLoginName"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<Request_MySchoolmate_app,
          Reply_MySchoolmate_app> METHOD_GET_MY_SCHOOLMATE =
      io.grpc.MethodDescriptor.<Request_MySchoolmate_app, Reply_MySchoolmate_app>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetMySchoolmate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Request_MySchoolmate_app.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Reply_MySchoolmate_app.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetMySchoolmate"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestClassID,
          ReplyGetStudents> METHOD_GET_STUDENTS_BY_CLASS_ID =
      io.grpc.MethodDescriptor.<RequestClassID, ReplyGetStudents>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentsByClassID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestClassID.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyGetStudents.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentsByClassID"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestStudentScreen,
          ReplyGetStudents> METHOD_GET_STUDENTS_BY_SCREEN =
      io.grpc.MethodDescriptor.<RequestStudentScreen, ReplyGetStudents>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentsByScreen"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestStudentScreen.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyGetStudents.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentsByScreen"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetTeacherInfoByIdRequest,
          ReplyAuthTeacher> METHOD_GET_TEACHER_INFO_BY_ID =
      io.grpc.MethodDescriptor.<GetTeacherInfoByIdRequest, ReplyAuthTeacher>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTeacherInfoById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetTeacherInfoByIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyAuthTeacher.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTeacherInfoById"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetAccelerates,
          RepGetAccelerates> METHOD_GET_ACCELERATES =
      io.grpc.MethodDescriptor.<ReqGetAccelerates, RepGetAccelerates>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetAccelerates"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetAccelerates.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetAccelerates.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetAccelerates"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<Accelerates,
          ReplyRStruct> METHOD_CREATE_ACCELERATE =
      io.grpc.MethodDescriptor.<Accelerates, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "CreateAccelerate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Accelerates.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("CreateAccelerate"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<Accelerates,
          ReplyRStruct> METHOD_UPDATE_ACCELERATE =
      io.grpc.MethodDescriptor.<Accelerates, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateAccelerate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Accelerates.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateAccelerate"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestSchoolWechat,
          ResponseSchoolsByRegionType> METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE =
      io.grpc.MethodDescriptor.<RequestSchoolWechat, ResponseSchoolsByRegionType>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "FindAllSchoolByOregionType"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestSchoolWechat.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResponseSchoolsByRegionType.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("FindAllSchoolByOregionType"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestSchoolCMS,
          ResponseSchoolsByRegionType> METHOD_FIND_ALL_SCHOOL_BY_OREGION =
      io.grpc.MethodDescriptor.<RequestSchoolCMS, ResponseSchoolsByRegionType>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "FindAllSchoolByOregion"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestSchoolCMS.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResponseSchoolsByRegionType.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("FindAllSchoolByOregion"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestPhone,
          ResponseExistedByPhoneStu> METHOD_IS_EXIST_STU_BY_PHONE =
      io.grpc.MethodDescriptor.<RequestPhone, ResponseExistedByPhoneStu>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "IsExistStuByPhone"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestPhone.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResponseExistedByPhoneStu.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("IsExistStuByPhone"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestRStudentStruct,
          ReplyRStruct> METHOD_UPDATE_STUDENT_BY_PHONE =
      io.grpc.MethodDescriptor.<RequestRStudentStruct, ReplyRStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "UpdateStudentByPhone"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRStudentStruct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyRStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("UpdateStudentByPhone"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetSchoolProvince,
          RepGetSchoolProvince> METHOD_GET_SCHOOL_PROVINCE =
      io.grpc.MethodDescriptor.<ReqGetSchoolProvince, RepGetSchoolProvince>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchoolProvince"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetSchoolProvince.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetSchoolProvince.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchoolProvince"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetCityByProvince,
          RepGetCityByProvince> METHOD_GET_CITY_BY_PROVINCE =
      io.grpc.MethodDescriptor.<ReqGetCityByProvince, RepGetCityByProvince>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetCityByProvince"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetCityByProvince.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetCityByProvince.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetCityByProvince"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetRegionByTypeAndProvinceCity,
          RepGetRegionByTypeAndProvinceCity> METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY =
      io.grpc.MethodDescriptor.<ReqGetRegionByTypeAndProvinceCity, RepGetRegionByTypeAndProvinceCity>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetRegionByTypeAndProvinceCity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetRegionByTypeAndProvinceCity.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetRegionByTypeAndProvinceCity.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetRegionByTypeAndProvinceCity"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetSchInfoByID,
          RequestRSchoolStruct> METHOD_GET_SCH_INFO_BY_ID =
      io.grpc.MethodDescriptor.<ReqGetSchInfoByID, RequestRSchoolStruct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchInfoByID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetSchInfoByID.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestRSchoolStruct.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchInfoByID"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetTextbooksVersion,
          RepGetTextbooksVersion> METHOD_GET_TEXTBOOKS_VERSION =
      io.grpc.MethodDescriptor.<ReqGetTextbooksVersion, RepGetTextbooksVersion>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetTextbooksVersion"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetTextbooksVersion.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetTextbooksVersion.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetTextbooksVersion"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestUIDs,
          ReplyGetStudents> METHOD_GET_STUDENTS_BY_UIDS =
      io.grpc.MethodDescriptor.<RequestUIDs, ReplyGetStudents>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentsByUIDs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestUIDs.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyGetStudents.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentsByUIDs"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestGetStudentIDsBySchoolGrade,
          ReplyGetStudentIDsBySchoolGrade> METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE =
      io.grpc.MethodDescriptor.<RequestGetStudentIDsBySchoolGrade, ReplyGetStudentIDsBySchoolGrade>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetStudentIDsBySchoolGrade"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestGetStudentIDsBySchoolGrade.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplyGetStudentIDsBySchoolGrade.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetStudentIDsBySchoolGrade"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RequestUIDs,
          ReplySchools> METHOD_GET_SCHOOLS_BY_UIDS =
      io.grpc.MethodDescriptor.<RequestUIDs, ReplySchools>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetSchoolsByUIDs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RequestUIDs.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReplySchools.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetSchoolsByUIDs"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetClassInfoById,
          RepGetClassInfoById> METHOD_GET_CLASS_INFO_BY_ID =
      io.grpc.MethodDescriptor.<ReqGetClassInfoById, RepGetClassInfoById>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetClassInfoById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetClassInfoById.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetClassInfoById.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetClassInfoById"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetClassBySchoolD,
          RepGetClassBySchoolD> METHOD_GET_CLASS_BY_SCHOOL_D =
      io.grpc.MethodDescriptor.<ReqGetClassBySchoolD, RepGetClassBySchoolD>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetClassBySchoolD"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetClassBySchoolD.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetClassBySchoolD.getDefaultInstance()))
          .setSchemaDescriptor(new ConsumerCentreMethodDescriptorSupplier("GetClassBySchoolD"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ReqGetforeignerByNickName,
          RepGetforeignerByNickName> METHOD_GETFOREIGNER_BY_NICK_NAME =
      io.grpc.MethodDescriptor.<ReqGetforeignerByNickName, RepGetforeignerByNickName>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "custom_proto.ConsumerCentre", "GetforeignerByNickName"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ReqGetforeignerByNickName.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RepGetforeignerByNickName.getDefaultInstance()))
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
    public void authStudent(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthStudent> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_STUDENT, responseObserver);
    }

    /**
     */
    public void authTeacher(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthTeacher> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_TEACHER, responseObserver);
    }

    /**
     */
    public void authTeachingAssistant(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthTeachingAssistant> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_TEACHING_ASSISTANT, responseObserver);
    }

    /**
     */
    public void authSchool(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthSchool> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTH_SCHOOL, responseObserver);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public void registerStudent(RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_STUDENT, responseObserver);
    }

    /**
     */
    public void registerTeacher(RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_TEACHER, responseObserver);
    }

    /**
     */
    public void registerTeachingAssistant(RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_TEACHING_ASSISTANT, responseObserver);
    }

    /**
     */
    public void registerSchool(RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_SCHOOL, responseObserver);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public void updateStudent(RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STUDENT, responseObserver);
    }

    /**
     */
    public void updateTeacher(RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TEACHER, responseObserver);
    }

    /**
     */
    public void updateTeachingAssistant(RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TEACHING_ASSISTANT, responseObserver);
    }

    /**
     */
    public void updateSchool(RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SCHOOL, responseObserver);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public void getStudents(RequestGetStus request,
        io.grpc.stub.StreamObserver<CascadeStuGRPCs> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS, responseObserver);
    }

    /**
     */
    public void getTeachers(RequestGetTeas request,
        io.grpc.stub.StreamObserver<ReplyTeachers> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEACHERS, responseObserver);
    }

    /**
     */
    public void getTeachingAssistants(RequestGetTeaassis request,
        io.grpc.stub.StreamObserver<ReplyTeachingAssistants> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEACHING_ASSISTANTS, responseObserver);
    }

    /**
     */
    public void getSchools(RequestGetSchs request,
        io.grpc.stub.StreamObserver<ReplySchools> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCHOOLS, responseObserver);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public void getClasses(RequestGetClassesStruct request,
        io.grpc.stub.StreamObserver<ReplyGetClassesStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLASSES, responseObserver);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public void getStudentInfoById(Request_studentinfo_app request,
        io.grpc.stub.StreamObserver<RequestRStudentStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENT_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public void getStudentByLoginName(ReqGetStudentByLoginName request,
        io.grpc.stub.StreamObserver<RequestRStudentStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENT_BY_LOGIN_NAME, responseObserver);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public void getMySchoolmate(Request_MySchoolmate_app request,
        io.grpc.stub.StreamObserver<Reply_MySchoolmate_app> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MY_SCHOOLMATE, responseObserver);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public void getStudentsByClassID(RequestClassID request,
        io.grpc.stub.StreamObserver<ReplyGetStudents> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS_BY_CLASS_ID, responseObserver);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public void getStudentsByScreen(RequestStudentScreen request,
        io.grpc.stub.StreamObserver<ReplyGetStudents> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS_BY_SCREEN, responseObserver);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public void getTeacherInfoById(GetTeacherInfoByIdRequest request,
        io.grpc.stub.StreamObserver<ReplyAuthTeacher> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEACHER_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public void getAccelerates(ReqGetAccelerates request,
        io.grpc.stub.StreamObserver<RepGetAccelerates> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ACCELERATES, responseObserver);
    }

    /**
     */
    public void createAccelerate(Accelerates request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ACCELERATE, responseObserver);
    }

    /**
     */
    public void updateAccelerate(Accelerates request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ACCELERATE, responseObserver);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public void findAllSchoolByOregionType(RequestSchoolWechat request,
        io.grpc.stub.StreamObserver<ResponseSchoolsByRegionType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, responseObserver);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public void findAllSchoolByOregion(RequestSchoolCMS request,
        io.grpc.stub.StreamObserver<ResponseSchoolsByRegionType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION, responseObserver);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public void isExistStuByPhone(RequestPhone request,
        io.grpc.stub.StreamObserver<ResponseExistedByPhoneStu> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_EXIST_STU_BY_PHONE, responseObserver);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public void updateStudentByPhone(RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STUDENT_BY_PHONE, responseObserver);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public void getSchoolProvince(ReqGetSchoolProvince request,
        io.grpc.stub.StreamObserver<RepGetSchoolProvince> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCHOOL_PROVINCE, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public void getCityByProvince(ReqGetCityByProvince request,
        io.grpc.stub.StreamObserver<RepGetCityByProvince> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CITY_BY_PROVINCE, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public void getRegionByTypeAndProvinceCity(ReqGetRegionByTypeAndProvinceCity request,
        io.grpc.stub.StreamObserver<RepGetRegionByTypeAndProvinceCity> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, responseObserver);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public void getSchInfoByID(ReqGetSchInfoByID request,
        io.grpc.stub.StreamObserver<RequestRSchoolStruct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCH_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public void getTextbooksVersion(ReqGetTextbooksVersion request,
        io.grpc.stub.StreamObserver<RepGetTextbooksVersion> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEXTBOOKS_VERSION, responseObserver);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public void getStudentsByUIDs(RequestUIDs request,
        io.grpc.stub.StreamObserver<ReplyGetStudents> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENTS_BY_UIDS, responseObserver);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public void getStudentIDsBySchoolGrade(RequestGetStudentIDsBySchoolGrade request,
        io.grpc.stub.StreamObserver<ReplyGetStudentIDsBySchoolGrade> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, responseObserver);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public void getSchoolsByUIDs(RequestUIDs request,
        io.grpc.stub.StreamObserver<ReplySchools> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SCHOOLS_BY_UIDS, responseObserver);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public void getClassInfoById(ReqGetClassInfoById request,
        io.grpc.stub.StreamObserver<RepGetClassInfoById> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLASS_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public void getClassBySchoolD(ReqGetClassBySchoolD request,
        io.grpc.stub.StreamObserver<RepGetClassBySchoolD> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLASS_BY_SCHOOL_D, responseObserver);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public void getforeignerByNickName(ReqGetforeignerByNickName request,
        io.grpc.stub.StreamObserver<RepGetforeignerByNickName> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GETFOREIGNER_BY_NICK_NAME, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_AUTH_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestAuthStruct,
                      ReplyAuthStudent>(
                  this, METHODID_AUTH_STUDENT)))
          .addMethod(
            METHOD_AUTH_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestAuthStruct,
                      ReplyAuthTeacher>(
                  this, METHODID_AUTH_TEACHER)))
          .addMethod(
            METHOD_AUTH_TEACHING_ASSISTANT,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestAuthStruct,
                      ReplyAuthTeachingAssistant>(
                  this, METHODID_AUTH_TEACHING_ASSISTANT)))
          .addMethod(
            METHOD_AUTH_SCHOOL,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestAuthStruct,
                      ReplyAuthSchool>(
                  this, METHODID_AUTH_SCHOOL)))
          .addMethod(
            METHOD_REGISTER_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRStudentStruct,
                      ReplyRStruct>(
                  this, METHODID_REGISTER_STUDENT)))
          .addMethod(
            METHOD_REGISTER_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRTeacherStruct,
                      ReplyRStruct>(
                  this, METHODID_REGISTER_TEACHER)))
          .addMethod(
            METHOD_REGISTER_TEACHING_ASSISTANT,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRTeachingAssistantStruct,
                      ReplyRStruct>(
                  this, METHODID_REGISTER_TEACHING_ASSISTANT)))
          .addMethod(
            METHOD_REGISTER_SCHOOL,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRSchoolStruct,
                      ReplyRStruct>(
                  this, METHODID_REGISTER_SCHOOL)))
          .addMethod(
            METHOD_UPDATE_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRStudentStruct,
                      ReplyRStruct>(
                  this, METHODID_UPDATE_STUDENT)))
          .addMethod(
            METHOD_UPDATE_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRTeacherStruct,
                      ReplyRStruct>(
                  this, METHODID_UPDATE_TEACHER)))
          .addMethod(
            METHOD_UPDATE_TEACHING_ASSISTANT,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRTeachingAssistantStruct,
                      ReplyRStruct>(
                  this, METHODID_UPDATE_TEACHING_ASSISTANT)))
          .addMethod(
            METHOD_UPDATE_SCHOOL,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRSchoolStruct,
                      ReplyRStruct>(
                  this, METHODID_UPDATE_SCHOOL)))
          .addMethod(
            METHOD_GET_STUDENTS,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestGetStus,
                      CascadeStuGRPCs>(
                  this, METHODID_GET_STUDENTS)))
          .addMethod(
            METHOD_GET_TEACHERS,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestGetTeas,
                      ReplyTeachers>(
                  this, METHODID_GET_TEACHERS)))
          .addMethod(
            METHOD_GET_TEACHING_ASSISTANTS,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestGetTeaassis,
                      ReplyTeachingAssistants>(
                  this, METHODID_GET_TEACHING_ASSISTANTS)))
          .addMethod(
            METHOD_GET_SCHOOLS,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestGetSchs,
                      ReplySchools>(
                  this, METHODID_GET_SCHOOLS)))
          .addMethod(
            METHOD_GET_CLASSES,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestGetClassesStruct,
                      ReplyGetClassesStruct>(
                  this, METHODID_GET_CLASSES)))
          .addMethod(
            METHOD_GET_STUDENT_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      Request_studentinfo_app,
                      RequestRStudentStruct>(
                  this, METHODID_GET_STUDENT_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_STUDENT_BY_LOGIN_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetStudentByLoginName,
                      RequestRStudentStruct>(
                  this, METHODID_GET_STUDENT_BY_LOGIN_NAME)))
          .addMethod(
            METHOD_GET_MY_SCHOOLMATE,
            asyncUnaryCall(
              new MethodHandlers<
                      Request_MySchoolmate_app,
                      Reply_MySchoolmate_app>(
                  this, METHODID_GET_MY_SCHOOLMATE)))
          .addMethod(
            METHOD_GET_STUDENTS_BY_CLASS_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestClassID,
                      ReplyGetStudents>(
                  this, METHODID_GET_STUDENTS_BY_CLASS_ID)))
          .addMethod(
            METHOD_GET_STUDENTS_BY_SCREEN,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestStudentScreen,
                      ReplyGetStudents>(
                  this, METHODID_GET_STUDENTS_BY_SCREEN)))
          .addMethod(
            METHOD_GET_TEACHER_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      GetTeacherInfoByIdRequest,
                      ReplyAuthTeacher>(
                  this, METHODID_GET_TEACHER_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_ACCELERATES,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetAccelerates,
                      RepGetAccelerates>(
                  this, METHODID_GET_ACCELERATES)))
          .addMethod(
            METHOD_CREATE_ACCELERATE,
            asyncUnaryCall(
              new MethodHandlers<
                      Accelerates,
                      ReplyRStruct>(
                  this, METHODID_CREATE_ACCELERATE)))
          .addMethod(
            METHOD_UPDATE_ACCELERATE,
            asyncUnaryCall(
              new MethodHandlers<
                      Accelerates,
                      ReplyRStruct>(
                  this, METHODID_UPDATE_ACCELERATE)))
          .addMethod(
            METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestSchoolWechat,
                      ResponseSchoolsByRegionType>(
                  this, METHODID_FIND_ALL_SCHOOL_BY_OREGION_TYPE)))
          .addMethod(
            METHOD_FIND_ALL_SCHOOL_BY_OREGION,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestSchoolCMS,
                      ResponseSchoolsByRegionType>(
                  this, METHODID_FIND_ALL_SCHOOL_BY_OREGION)))
          .addMethod(
            METHOD_IS_EXIST_STU_BY_PHONE,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestPhone,
                      ResponseExistedByPhoneStu>(
                  this, METHODID_IS_EXIST_STU_BY_PHONE)))
          .addMethod(
            METHOD_UPDATE_STUDENT_BY_PHONE,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestRStudentStruct,
                      ReplyRStruct>(
                  this, METHODID_UPDATE_STUDENT_BY_PHONE)))
          .addMethod(
            METHOD_GET_SCHOOL_PROVINCE,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetSchoolProvince,
                      RepGetSchoolProvince>(
                  this, METHODID_GET_SCHOOL_PROVINCE)))
          .addMethod(
            METHOD_GET_CITY_BY_PROVINCE,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetCityByProvince,
                      RepGetCityByProvince>(
                  this, METHODID_GET_CITY_BY_PROVINCE)))
          .addMethod(
            METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetRegionByTypeAndProvinceCity,
                      RepGetRegionByTypeAndProvinceCity>(
                  this, METHODID_GET_REGION_BY_TYPE_AND_PROVINCE_CITY)))
          .addMethod(
            METHOD_GET_SCH_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetSchInfoByID,
                      RequestRSchoolStruct>(
                  this, METHODID_GET_SCH_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_TEXTBOOKS_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetTextbooksVersion,
                      RepGetTextbooksVersion>(
                  this, METHODID_GET_TEXTBOOKS_VERSION)))
          .addMethod(
            METHOD_GET_STUDENTS_BY_UIDS,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestUIDs,
                      ReplyGetStudents>(
                  this, METHODID_GET_STUDENTS_BY_UIDS)))
          .addMethod(
            METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestGetStudentIDsBySchoolGrade,
                      ReplyGetStudentIDsBySchoolGrade>(
                  this, METHODID_GET_STUDENT_IDS_BY_SCHOOL_GRADE)))
          .addMethod(
            METHOD_GET_SCHOOLS_BY_UIDS,
            asyncUnaryCall(
              new MethodHandlers<
                      RequestUIDs,
                      ReplySchools>(
                  this, METHODID_GET_SCHOOLS_BY_UIDS)))
          .addMethod(
            METHOD_GET_CLASS_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetClassInfoById,
                      RepGetClassInfoById>(
                  this, METHODID_GET_CLASS_INFO_BY_ID)))
          .addMethod(
            METHOD_GET_CLASS_BY_SCHOOL_D,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetClassBySchoolD,
                      RepGetClassBySchoolD>(
                  this, METHODID_GET_CLASS_BY_SCHOOL_D)))
          .addMethod(
            METHOD_GETFOREIGNER_BY_NICK_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                      ReqGetforeignerByNickName,
                      RepGetforeignerByNickName>(
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
    public void authStudent(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthStudent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authTeacher(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthTeacher> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authTeachingAssistant(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthTeachingAssistant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHING_ASSISTANT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authSchool(RequestAuthStruct request,
        io.grpc.stub.StreamObserver<ReplyAuthSchool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTH_SCHOOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public void registerStudent(RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerTeacher(RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerTeachingAssistant(RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHING_ASSISTANT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerSchool(RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_SCHOOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public void updateStudent(RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeacher(RequestRTeacherStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeachingAssistant(RequestRTeachingAssistantStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHING_ASSISTANT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSchool(RequestRSchoolStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SCHOOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public void getStudents(RequestGetStus request,
        io.grpc.stub.StreamObserver<CascadeStuGRPCs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeachers(RequestGetTeas request,
        io.grpc.stub.StreamObserver<ReplyTeachers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeachingAssistants(RequestGetTeaassis request,
        io.grpc.stub.StreamObserver<ReplyTeachingAssistants> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHING_ASSISTANTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSchools(RequestGetSchs request,
        io.grpc.stub.StreamObserver<ReplySchools> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public void getClasses(RequestGetClassesStruct request,
        io.grpc.stub.StreamObserver<ReplyGetClassesStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLASSES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public void getStudentInfoById(Request_studentinfo_app request,
        io.grpc.stub.StreamObserver<RequestRStudentStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public void getStudentByLoginName(ReqGetStudentByLoginName request,
        io.grpc.stub.StreamObserver<RequestRStudentStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_BY_LOGIN_NAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public void getMySchoolmate(Request_MySchoolmate_app request,
        io.grpc.stub.StreamObserver<Reply_MySchoolmate_app> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MY_SCHOOLMATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public void getStudentsByClassID(RequestClassID request,
        io.grpc.stub.StreamObserver<ReplyGetStudents> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_CLASS_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public void getStudentsByScreen(RequestStudentScreen request,
        io.grpc.stub.StreamObserver<ReplyGetStudents> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_SCREEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public void getTeacherInfoById(GetTeacherInfoByIdRequest request,
        io.grpc.stub.StreamObserver<ReplyAuthTeacher> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHER_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public void getAccelerates(ReqGetAccelerates request,
        io.grpc.stub.StreamObserver<RepGetAccelerates> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ACCELERATES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccelerate(Accelerates request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ACCELERATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccelerate(Accelerates request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ACCELERATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public void findAllSchoolByOregionType(RequestSchoolWechat request,
        io.grpc.stub.StreamObserver<ResponseSchoolsByRegionType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public void findAllSchoolByOregion(RequestSchoolCMS request,
        io.grpc.stub.StreamObserver<ResponseSchoolsByRegionType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public void isExistStuByPhone(RequestPhone request,
        io.grpc.stub.StreamObserver<ResponseExistedByPhoneStu> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_EXIST_STU_BY_PHONE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public void updateStudentByPhone(RequestRStudentStruct request,
        io.grpc.stub.StreamObserver<ReplyRStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT_BY_PHONE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public void getSchoolProvince(ReqGetSchoolProvince request,
        io.grpc.stub.StreamObserver<RepGetSchoolProvince> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOL_PROVINCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public void getCityByProvince(ReqGetCityByProvince request,
        io.grpc.stub.StreamObserver<RepGetCityByProvince> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CITY_BY_PROVINCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public void getRegionByTypeAndProvinceCity(ReqGetRegionByTypeAndProvinceCity request,
        io.grpc.stub.StreamObserver<RepGetRegionByTypeAndProvinceCity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public void getSchInfoByID(ReqGetSchInfoByID request,
        io.grpc.stub.StreamObserver<RequestRSchoolStruct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCH_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public void getTextbooksVersion(ReqGetTextbooksVersion request,
        io.grpc.stub.StreamObserver<RepGetTextbooksVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TEXTBOOKS_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public void getStudentsByUIDs(RequestUIDs request,
        io.grpc.stub.StreamObserver<ReplyGetStudents> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_UIDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public void getStudentIDsBySchoolGrade(RequestGetStudentIDsBySchoolGrade request,
        io.grpc.stub.StreamObserver<ReplyGetStudentIDsBySchoolGrade> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public void getSchoolsByUIDs(RequestUIDs request,
        io.grpc.stub.StreamObserver<ReplySchools> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS_BY_UIDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public void getClassInfoById(ReqGetClassInfoById request,
        io.grpc.stub.StreamObserver<RepGetClassInfoById> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public void getClassBySchoolD(ReqGetClassBySchoolD request,
        io.grpc.stub.StreamObserver<RepGetClassBySchoolD> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_BY_SCHOOL_D, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public void getforeignerByNickName(ReqGetforeignerByNickName request,
        io.grpc.stub.StreamObserver<RepGetforeignerByNickName> responseObserver) {
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
    public ReplyAuthStudent authStudent(RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_STUDENT, getCallOptions(), request);
    }

    /**
     */
    public ReplyAuthTeacher authTeacher(RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_TEACHER, getCallOptions(), request);
    }

    /**
     */
    public ReplyAuthTeachingAssistant authTeachingAssistant(RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_TEACHING_ASSISTANT, getCallOptions(), request);
    }

    /**
     */
    public ReplyAuthSchool authSchool(RequestAuthStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTH_SCHOOL, getCallOptions(), request);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public ReplyRStruct registerStudent(RequestRStudentStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_STUDENT, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct registerTeacher(RequestRTeacherStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_TEACHER, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct registerTeachingAssistant(RequestRTeachingAssistantStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_TEACHING_ASSISTANT, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct registerSchool(RequestRSchoolStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_SCHOOL, getCallOptions(), request);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public ReplyRStruct updateStudent(RequestRStudentStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STUDENT, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct updateTeacher(RequestRTeacherStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TEACHER, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct updateTeachingAssistant(RequestRTeachingAssistantStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TEACHING_ASSISTANT, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct updateSchool(RequestRSchoolStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SCHOOL, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public CascadeStuGRPCs getStudents(RequestGetStus request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS, getCallOptions(), request);
    }

    /**
     */
    public ReplyTeachers getTeachers(RequestGetTeas request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEACHERS, getCallOptions(), request);
    }

    /**
     */
    public ReplyTeachingAssistants getTeachingAssistants(RequestGetTeaassis request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEACHING_ASSISTANTS, getCallOptions(), request);
    }

    /**
     */
    public ReplySchools getSchools(RequestGetSchs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCHOOLS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public ReplyGetClassesStruct getClasses(RequestGetClassesStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLASSES, getCallOptions(), request);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public RequestRStudentStruct getStudentInfoById(Request_studentinfo_app request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENT_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public RequestRStudentStruct getStudentByLoginName(ReqGetStudentByLoginName request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENT_BY_LOGIN_NAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public Reply_MySchoolmate_app getMySchoolmate(Request_MySchoolmate_app request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MY_SCHOOLMATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public ReplyGetStudents getStudentsByClassID(RequestClassID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS_BY_CLASS_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public ReplyGetStudents getStudentsByScreen(RequestStudentScreen request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS_BY_SCREEN, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public ReplyAuthTeacher getTeacherInfoById(GetTeacherInfoByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEACHER_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public RepGetAccelerates getAccelerates(ReqGetAccelerates request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ACCELERATES, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct createAccelerate(Accelerates request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ACCELERATE, getCallOptions(), request);
    }

    /**
     */
    public ReplyRStruct updateAccelerate(Accelerates request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ACCELERATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public ResponseSchoolsByRegionType findAllSchoolByOregionType(RequestSchoolWechat request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public ResponseSchoolsByRegionType findAllSchoolByOregion(RequestSchoolCMS request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ALL_SCHOOL_BY_OREGION, getCallOptions(), request);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public ResponseExistedByPhoneStu isExistStuByPhone(RequestPhone request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_EXIST_STU_BY_PHONE, getCallOptions(), request);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public ReplyRStruct updateStudentByPhone(RequestRStudentStruct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STUDENT_BY_PHONE, getCallOptions(), request);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public RepGetSchoolProvince getSchoolProvince(ReqGetSchoolProvince request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCHOOL_PROVINCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public RepGetCityByProvince getCityByProvince(ReqGetCityByProvince request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CITY_BY_PROVINCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public RepGetRegionByTypeAndProvinceCity getRegionByTypeAndProvinceCity(ReqGetRegionByTypeAndProvinceCity request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public RequestRSchoolStruct getSchInfoByID(ReqGetSchInfoByID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCH_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public RepGetTextbooksVersion getTextbooksVersion(ReqGetTextbooksVersion request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TEXTBOOKS_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public ReplyGetStudents getStudentsByUIDs(RequestUIDs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENTS_BY_UIDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public ReplyGetStudentIDsBySchoolGrade getStudentIDsBySchoolGrade(RequestGetStudentIDsBySchoolGrade request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public ReplySchools getSchoolsByUIDs(RequestUIDs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SCHOOLS_BY_UIDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public RepGetClassInfoById getClassInfoById(ReqGetClassInfoById request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLASS_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public RepGetClassBySchoolD getClassBySchoolD(ReqGetClassBySchoolD request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLASS_BY_SCHOOL_D, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public RepGetforeignerByNickName getforeignerByNickName(ReqGetforeignerByNickName request) {
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
    public com.google.common.util.concurrent.ListenableFuture<ReplyAuthStudent> authStudent(
        RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_STUDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyAuthTeacher> authTeacher(
        RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyAuthTeachingAssistant> authTeachingAssistant(
        RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_TEACHING_ASSISTANT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyAuthSchool> authSchool(
        RequestAuthStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTH_SCHOOL, getCallOptions()), request);
    }

    /**
     * <pre>
     *统一注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> registerStudent(
        RequestRStudentStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_STUDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> registerTeacher(
        RequestRTeacherStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> registerTeachingAssistant(
        RequestRTeachingAssistantStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_TEACHING_ASSISTANT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> registerSchool(
        RequestRSchoolStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_SCHOOL, getCallOptions()), request);
    }

    /**
     * <pre>
     *统一更新
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> updateStudent(
        RequestRStudentStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> updateTeacher(
        RequestRTeacherStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> updateTeachingAssistant(
        RequestRTeachingAssistantStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHING_ASSISTANT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> updateSchool(
        RequestRSchoolStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SCHOOL, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取所有
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CascadeStuGRPCs> getStudents(
        RequestGetStus request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyTeachers> getTeachers(
        RequestGetTeas request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyTeachingAssistants> getTeachingAssistants(
        RequestGetTeaassis request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHING_ASSISTANTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplySchools> getSchools(
        RequestGetSchs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据学校id和年级id获取所有班级
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyGetClassesStruct> getClasses(
        RequestGetClassesStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLASSES, getCallOptions()), request);
    }

    /**
     * <pre>
     *app 根据学生id获取级联学生信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RequestRStudentStruct> getStudentInfoById(
        Request_studentinfo_app request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据登录名查询学生信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RequestRStudentStruct> getStudentByLoginName(
        ReqGetStudentByLoginName request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_BY_LOGIN_NAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *app 查询我的同学
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Reply_MySchoolmate_app> getMySchoolmate(
        Request_MySchoolmate_app request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MY_SCHOOLMATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据班级id获取所有学生
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyGetStudents> getStudentsByClassID(
        RequestClassID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_CLASS_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学生姓名获取所有此姓名学生
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyGetStudents> getStudentsByScreen(
        RequestStudentScreen request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_SCREEN, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据老师ID查询老师
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyAuthTeacher> getTeacherInfoById(
        GetTeacherInfoByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEACHER_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取所有加速线路
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetAccelerates> getAccelerates(
        ReqGetAccelerates request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ACCELERATES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> createAccelerate(
        Accelerates request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ACCELERATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> updateAccelerate(
        Accelerates request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ACCELERATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *wechat 
     *塞选学校
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseSchoolsByRegionType> findAllSchoolByOregionType(
        RequestSchoolWechat request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     *cms 省市区学校
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseSchoolsByRegionType> findAllSchoolByOregion(
        RequestSchoolCMS request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_SCHOOL_BY_OREGION, getCallOptions()), request);
    }

    /**
     * <pre>
     *通过手机号判断当前用户是否存在
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseExistedByPhoneStu> isExistStuByPhone(
        RequestPhone request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_EXIST_STU_BY_PHONE, getCallOptions()), request);
    }

    /**
     * <pre>
     *新用户增加密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyRStruct> updateStudentByPhone(
        RequestRStudentStruct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT_BY_PHONE, getCallOptions()), request);
    }

    /**
     * <pre>
     *app add
     *学校类型 获取省
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetSchoolProvince> getSchoolProvince(
        ReqGetSchoolProvince request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOL_PROVINCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *学校类型 省 获取市
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetCityByProvince> getCityByProvince(
        ReqGetCityByProvince request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CITY_BY_PROVINCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *学校类型 省 市 获取区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetRegionByTypeAndProvinceCity> getRegionByTypeAndProvinceCity(
        ReqGetRegionByTypeAndProvinceCity request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REGION_BY_TYPE_AND_PROVINCE_CITY, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据id获取学校的详细信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RequestRSchoolStruct> getSchInfoByID(
        ReqGetSchInfoByID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCH_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取所有教材版本
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetTextbooksVersion> getTextbooksVersion(
        ReqGetTextbooksVersion request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TEXTBOOKS_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据id列表获取所有学生详细信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyGetStudents> getStudentsByUIDs(
        RequestUIDs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENTS_BY_UIDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学校和年级id获取的学生id列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplyGetStudentIDsBySchoolGrade> getStudentIDsBySchoolGrade(
        RequestGetStudentIDsBySchoolGrade request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STUDENT_IDS_BY_SCHOOL_GRADE, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学生id列表获取这些学生属于的学校列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ReplySchools> getSchoolsByUIDs(
        RequestUIDs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SCHOOLS_BY_UIDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *extra
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetClassInfoById> getClassInfoById(
        ReqGetClassInfoById request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据学校名等获取班级信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetClassBySchoolD> getClassBySchoolD(
        ReqGetClassBySchoolD request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLASS_BY_SCHOOL_D, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据外教nickname获取外教信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RepGetforeignerByNickName> getforeignerByNickName(
        ReqGetforeignerByNickName request) {
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
          serviceImpl.authStudent((RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<ReplyAuthStudent>) responseObserver);
          break;
        case METHODID_AUTH_TEACHER:
          serviceImpl.authTeacher((RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<ReplyAuthTeacher>) responseObserver);
          break;
        case METHODID_AUTH_TEACHING_ASSISTANT:
          serviceImpl.authTeachingAssistant((RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<ReplyAuthTeachingAssistant>) responseObserver);
          break;
        case METHODID_AUTH_SCHOOL:
          serviceImpl.authSchool((RequestAuthStruct) request,
              (io.grpc.stub.StreamObserver<ReplyAuthSchool>) responseObserver);
          break;
        case METHODID_REGISTER_STUDENT:
          serviceImpl.registerStudent((RequestRStudentStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_REGISTER_TEACHER:
          serviceImpl.registerTeacher((RequestRTeacherStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_REGISTER_TEACHING_ASSISTANT:
          serviceImpl.registerTeachingAssistant((RequestRTeachingAssistantStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_REGISTER_SCHOOL:
          serviceImpl.registerSchool((RequestRSchoolStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT:
          serviceImpl.updateStudent((RequestRStudentStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_TEACHER:
          serviceImpl.updateTeacher((RequestRTeacherStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_TEACHING_ASSISTANT:
          serviceImpl.updateTeachingAssistant((RequestRTeachingAssistantStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_SCHOOL:
          serviceImpl.updateSchool((RequestRSchoolStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_GET_STUDENTS:
          serviceImpl.getStudents((RequestGetStus) request,
              (io.grpc.stub.StreamObserver<CascadeStuGRPCs>) responseObserver);
          break;
        case METHODID_GET_TEACHERS:
          serviceImpl.getTeachers((RequestGetTeas) request,
              (io.grpc.stub.StreamObserver<ReplyTeachers>) responseObserver);
          break;
        case METHODID_GET_TEACHING_ASSISTANTS:
          serviceImpl.getTeachingAssistants((RequestGetTeaassis) request,
              (io.grpc.stub.StreamObserver<ReplyTeachingAssistants>) responseObserver);
          break;
        case METHODID_GET_SCHOOLS:
          serviceImpl.getSchools((RequestGetSchs) request,
              (io.grpc.stub.StreamObserver<ReplySchools>) responseObserver);
          break;
        case METHODID_GET_CLASSES:
          serviceImpl.getClasses((RequestGetClassesStruct) request,
              (io.grpc.stub.StreamObserver<ReplyGetClassesStruct>) responseObserver);
          break;
        case METHODID_GET_STUDENT_INFO_BY_ID:
          serviceImpl.getStudentInfoById((Request_studentinfo_app) request,
              (io.grpc.stub.StreamObserver<RequestRStudentStruct>) responseObserver);
          break;
        case METHODID_GET_STUDENT_BY_LOGIN_NAME:
          serviceImpl.getStudentByLoginName((ReqGetStudentByLoginName) request,
              (io.grpc.stub.StreamObserver<RequestRStudentStruct>) responseObserver);
          break;
        case METHODID_GET_MY_SCHOOLMATE:
          serviceImpl.getMySchoolmate((Request_MySchoolmate_app) request,
              (io.grpc.stub.StreamObserver<Reply_MySchoolmate_app>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_CLASS_ID:
          serviceImpl.getStudentsByClassID((RequestClassID) request,
              (io.grpc.stub.StreamObserver<ReplyGetStudents>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_SCREEN:
          serviceImpl.getStudentsByScreen((RequestStudentScreen) request,
              (io.grpc.stub.StreamObserver<ReplyGetStudents>) responseObserver);
          break;
        case METHODID_GET_TEACHER_INFO_BY_ID:
          serviceImpl.getTeacherInfoById((GetTeacherInfoByIdRequest) request,
              (io.grpc.stub.StreamObserver<ReplyAuthTeacher>) responseObserver);
          break;
        case METHODID_GET_ACCELERATES:
          serviceImpl.getAccelerates((ReqGetAccelerates) request,
              (io.grpc.stub.StreamObserver<RepGetAccelerates>) responseObserver);
          break;
        case METHODID_CREATE_ACCELERATE:
          serviceImpl.createAccelerate((Accelerates) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_UPDATE_ACCELERATE:
          serviceImpl.updateAccelerate((Accelerates) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_FIND_ALL_SCHOOL_BY_OREGION_TYPE:
          serviceImpl.findAllSchoolByOregionType((RequestSchoolWechat) request,
              (io.grpc.stub.StreamObserver<ResponseSchoolsByRegionType>) responseObserver);
          break;
        case METHODID_FIND_ALL_SCHOOL_BY_OREGION:
          serviceImpl.findAllSchoolByOregion((RequestSchoolCMS) request,
              (io.grpc.stub.StreamObserver<ResponseSchoolsByRegionType>) responseObserver);
          break;
        case METHODID_IS_EXIST_STU_BY_PHONE:
          serviceImpl.isExistStuByPhone((RequestPhone) request,
              (io.grpc.stub.StreamObserver<ResponseExistedByPhoneStu>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT_BY_PHONE:
          serviceImpl.updateStudentByPhone((RequestRStudentStruct) request,
              (io.grpc.stub.StreamObserver<ReplyRStruct>) responseObserver);
          break;
        case METHODID_GET_SCHOOL_PROVINCE:
          serviceImpl.getSchoolProvince((ReqGetSchoolProvince) request,
              (io.grpc.stub.StreamObserver<RepGetSchoolProvince>) responseObserver);
          break;
        case METHODID_GET_CITY_BY_PROVINCE:
          serviceImpl.getCityByProvince((ReqGetCityByProvince) request,
              (io.grpc.stub.StreamObserver<RepGetCityByProvince>) responseObserver);
          break;
        case METHODID_GET_REGION_BY_TYPE_AND_PROVINCE_CITY:
          serviceImpl.getRegionByTypeAndProvinceCity((ReqGetRegionByTypeAndProvinceCity) request,
              (io.grpc.stub.StreamObserver<RepGetRegionByTypeAndProvinceCity>) responseObserver);
          break;
        case METHODID_GET_SCH_INFO_BY_ID:
          serviceImpl.getSchInfoByID((ReqGetSchInfoByID) request,
              (io.grpc.stub.StreamObserver<RequestRSchoolStruct>) responseObserver);
          break;
        case METHODID_GET_TEXTBOOKS_VERSION:
          serviceImpl.getTextbooksVersion((ReqGetTextbooksVersion) request,
              (io.grpc.stub.StreamObserver<RepGetTextbooksVersion>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_UIDS:
          serviceImpl.getStudentsByUIDs((RequestUIDs) request,
              (io.grpc.stub.StreamObserver<ReplyGetStudents>) responseObserver);
          break;
        case METHODID_GET_STUDENT_IDS_BY_SCHOOL_GRADE:
          serviceImpl.getStudentIDsBySchoolGrade((RequestGetStudentIDsBySchoolGrade) request,
              (io.grpc.stub.StreamObserver<ReplyGetStudentIDsBySchoolGrade>) responseObserver);
          break;
        case METHODID_GET_SCHOOLS_BY_UIDS:
          serviceImpl.getSchoolsByUIDs((RequestUIDs) request,
              (io.grpc.stub.StreamObserver<ReplySchools>) responseObserver);
          break;
        case METHODID_GET_CLASS_INFO_BY_ID:
          serviceImpl.getClassInfoById((ReqGetClassInfoById) request,
              (io.grpc.stub.StreamObserver<RepGetClassInfoById>) responseObserver);
          break;
        case METHODID_GET_CLASS_BY_SCHOOL_D:
          serviceImpl.getClassBySchoolD((ReqGetClassBySchoolD) request,
              (io.grpc.stub.StreamObserver<RepGetClassBySchoolD>) responseObserver);
          break;
        case METHODID_GETFOREIGNER_BY_NICK_NAME:
          serviceImpl.getforeignerByNickName((ReqGetforeignerByNickName) request,
              (io.grpc.stub.StreamObserver<RepGetforeignerByNickName>) responseObserver);
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
      return UserCenterProto.getDescriptor();
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
