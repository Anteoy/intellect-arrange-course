// Code generated by protoc-gen-go.
// source: jr.proto
// DO NOT EDIT!

/*
Package JRService is a generated protocol buffer package.

It is generated from these files:
	jr.proto

It has these top-level messages:
	SingerId
	Singer
	Song
	SongList
*/
package JRService

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type SingerId struct {
	Id int32 `protobuf:"varint,1,opt,name=id" json:"id"`
}

func (m *SingerId) Reset()                    { *m = SingerId{} }
func (m *SingerId) String() string            { return proto.CompactTextString(m) }
func (*SingerId) ProtoMessage()               {}
func (*SingerId) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{0} }

func (m *SingerId) GetId() int32 {
	if m != nil {
		return m.Id
	}
	return 0
}

type Singer struct {
	Id   int32  `protobuf:"varint,1,opt,name=id" json:"id"`
	Name string `protobuf:"bytes,2,opt,name=name" json:"name"`
}

func (m *Singer) Reset()                    { *m = Singer{} }
func (m *Singer) String() string            { return proto.CompactTextString(m) }
func (*Singer) ProtoMessage()               {}
func (*Singer) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{1} }

func (m *Singer) GetId() int32 {
	if m != nil {
		return m.Id
	}
	return 0
}

func (m *Singer) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

type Song struct {
	Id     int32   `protobuf:"varint,1,opt,name=id" json:"id"`
	Name   string  `protobuf:"bytes,2,opt,name=name" json:"name"`
	Singer *Singer `protobuf:"bytes,3,opt,name=singer" json:"singer"`
}

func (m *Song) Reset()                    { *m = Song{} }
func (m *Song) String() string            { return proto.CompactTextString(m) }
func (*Song) ProtoMessage()               {}
func (*Song) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{2} }

func (m *Song) GetId() int32 {
	if m != nil {
		return m.Id
	}
	return 0
}

func (m *Song) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Song) GetSinger() *Singer {
	if m != nil {
		return m.Singer
	}
	return nil
}

type SongList struct {
	Songs []*Song `protobuf:"bytes,1,rep,name=songs" json:"songs"`
}

func (m *SongList) Reset()                    { *m = SongList{} }
func (m *SongList) String() string            { return proto.CompactTextString(m) }
func (*SongList) ProtoMessage()               {}
func (*SongList) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{3} }

func (m *SongList) GetSongs() []*Song {
	if m != nil {
		return m.Songs
	}
	return nil
}

func init() {
	proto.RegisterType((*SingerId)(nil), "JRService.SingerId")
	proto.RegisterType((*Singer)(nil), "JRService.Singer")
	proto.RegisterType((*Song)(nil), "JRService.Song")
	proto.RegisterType((*SongList)(nil), "JRService.SongList")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// Client API for JRService service

type JRServiceClient interface {
	ListSongs(ctx context.Context, in *SingerId, opts ...grpc.CallOption) (*SongList, error)
	GetSongs(ctx context.Context, in *SingerId, opts ...grpc.CallOption) (JRService_GetSongsClient, error)
}

type jRServiceClient struct {
	cc *grpc.ClientConn
}

func NewJRServiceClient(cc *grpc.ClientConn) JRServiceClient {
	return &jRServiceClient{cc}
}

func (c *jRServiceClient) ListSongs(ctx context.Context, in *SingerId, opts ...grpc.CallOption) (*SongList, error) {
	out := new(SongList)
	err := grpc.Invoke(ctx, "/JRService.JRService/ListSongs", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jRServiceClient) GetSongs(ctx context.Context, in *SingerId, opts ...grpc.CallOption) (JRService_GetSongsClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_JRService_serviceDesc.Streams[0], c.cc, "/JRService.JRService/GetSongs", opts...)
	if err != nil {
		return nil, err
	}
	x := &jRServiceGetSongsClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type JRService_GetSongsClient interface {
	Recv() (*Song, error)
	grpc.ClientStream
}

type jRServiceGetSongsClient struct {
	grpc.ClientStream
}

func (x *jRServiceGetSongsClient) Recv() (*Song, error) {
	m := new(Song)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// Server API for JRService service

type JRServiceServer interface {
	ListSongs(context.Context, *SingerId) (*SongList, error)
	GetSongs(*SingerId, JRService_GetSongsServer) error
}

func RegisterJRServiceServer(s *grpc.Server, srv JRServiceServer) {
	s.RegisterService(&_JRService_serviceDesc, srv)
}

func _JRService_ListSongs_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SingerId)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JRServiceServer).ListSongs(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/JRService.JRService/ListSongs",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JRServiceServer).ListSongs(ctx, req.(*SingerId))
	}
	return interceptor(ctx, in, info, handler)
}

func _JRService_GetSongs_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(SingerId)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(JRServiceServer).GetSongs(m, &jRServiceGetSongsServer{stream})
}

type JRService_GetSongsServer interface {
	Send(*Song) error
	grpc.ServerStream
}

type jRServiceGetSongsServer struct {
	grpc.ServerStream
}

func (x *jRServiceGetSongsServer) Send(m *Song) error {
	return x.ServerStream.SendMsg(m)
}

var _JRService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "JRService.JRService",
	HandlerType: (*JRServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ListSongs",
			Handler:    _JRService_ListSongs_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "GetSongs",
			Handler:       _JRService_GetSongs_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "jr.proto",
}

func init() { proto.RegisterFile("jr.proto", fileDescriptor0) }

var fileDescriptor0 = []byte{
	// 237 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x09, 0x6e, 0x88, 0x02, 0xff, 0xe2, 0xe2, 0xc8, 0x2a, 0xd2, 0x2b,
	0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2, 0xf4, 0x0a, 0x0a, 0x4e, 0x2d, 0x2a, 0xcb, 0x4c, 0x4e, 0x55,
	0x92, 0xe2, 0xe2, 0x08, 0xce, 0xcc, 0x4b, 0x4f, 0x2d, 0xf2, 0x4c, 0x11, 0xe2, 0xe3, 0x62, 0xca,
	0x4c, 0x91, 0x60, 0x54, 0x60, 0xd4, 0x60, 0x0d, 0x62, 0xca, 0x4c, 0x51, 0xd2, 0xe1, 0x62, 0x83,
	0xc8, 0xa1, 0xcb, 0x08, 0x09, 0x71, 0xb1, 0xe4, 0x25, 0xe6, 0xa6, 0x4a, 0x30, 0x29, 0x30, 0x6a,
	0x70, 0x06, 0x81, 0xd9, 0x4a, 0xa1, 0x5c, 0x2c, 0xc1, 0xf9, 0x79, 0xe9, 0xc4, 0xa8, 0x15, 0xd2,
	0xe4, 0x62, 0x2b, 0x06, 0x9b, 0x2c, 0xc1, 0xac, 0xc0, 0xa8, 0xc1, 0x6d, 0x24, 0xa8, 0x07, 0x77,
	0x91, 0x1e, 0xc4, 0xca, 0x20, 0xa8, 0x02, 0x25, 0x43, 0x2e, 0x0e, 0x90, 0xb1, 0x3e, 0x99, 0xc5,
	0x25, 0x42, 0xaa, 0x5c, 0xac, 0xc5, 0xf9, 0x79, 0xe9, 0xc5, 0x12, 0x8c, 0x0a, 0xcc, 0x1a, 0xdc,
	0x46, 0xfc, 0xc8, 0xba, 0xf2, 0xf3, 0xd2, 0x83, 0x20, 0xb2, 0x46, 0x55, 0x5c, 0x08, 0x0f, 0x0a,
	0x99, 0x73, 0x71, 0x82, 0xf4, 0x82, 0xe4, 0x8b, 0x85, 0x84, 0x31, 0xec, 0xf1, 0x4c, 0x91, 0x12,
	0x46, 0x33, 0x06, 0xa4, 0x5c, 0x89, 0x41, 0xc8, 0x84, 0x8b, 0xc3, 0x3d, 0x15, 0x9f, 0x3e, 0x74,
	0xeb, 0x95, 0x18, 0x0c, 0x18, 0x9d, 0x64, 0xb9, 0x04, 0x92, 0xf3, 0x73, 0xf5, 0xb2, 0x8a, 0x10,
	0x92, 0x4e, 0xec, 0x5e, 0x41, 0x01, 0xa0, 0x70, 0x0f, 0x60, 0x4c, 0x62, 0x03, 0x47, 0x80, 0x31,
	0x20, 0x00, 0x00, 0xff, 0xff, 0x5e, 0xd4, 0x94, 0xd5, 0x8c, 0x01, 0x00, 0x00,
}
