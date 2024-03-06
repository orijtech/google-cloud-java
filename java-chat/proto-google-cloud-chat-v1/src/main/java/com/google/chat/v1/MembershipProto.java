/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chat/v1/membership.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public final class MembershipProto {
  private MembershipProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_Membership_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_Membership_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_CreateMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_CreateMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ListMembershipsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ListMembershipsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ListMembershipsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ListMembershipsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_GetMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_GetMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_DeleteMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_DeleteMembershipRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/chat/v1/membership.proto\022\016googl"
          + "e.chat.v1\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032\032google/ch"
          + "at/v1/group.proto\032\031google/chat/v1/user.p"
          + "roto\032\037google/protobuf/timestamp.proto\"\220\005"
          + "\n\nMembership\0221\n\004name\030\001 \001(\tB#\372A \n\036chat.go"
          + "ogleapis.com/Membership\022>\n\005state\030\002 \001(\0162*"
          + ".google.chat.v1.Membership.MembershipSta"
          + "teB\003\340A\003\022<\n\004role\030\007 \001(\0162).google.chat.v1.M"
          + "embership.MembershipRoleB\003\340A\001\022&\n\006member\030"
          + "\003 \001(\0132\024.google.chat.v1.UserH\000\022-\n\014group_m"
          + "ember\030\005 \001(\0132\025.google.chat.v1.GroupH\000\0227\n\013"
          + "create_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stampB\006\340A\005\340A\001\0227\n\013delete_time\030\010 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\006\340A\005\340A\001\"^\n\017Member"
          + "shipState\022 \n\034MEMBERSHIP_STATE_UNSPECIFIE"
          + "D\020\000\022\n\n\006JOINED\020\001\022\013\n\007INVITED\020\002\022\020\n\014NOT_A_ME"
          + "MBER\020\003\"T\n\016MembershipRole\022\037\n\033MEMBERSHIP_R"
          + "OLE_UNSPECIFIED\020\000\022\017\n\013ROLE_MEMBER\020\001\022\020\n\014RO"
          + "LE_MANAGER\020\002:D\352AA\n\036chat.googleapis.com/M"
          + "embership\022\037spaces/{space}/members/{membe"
          + "r}B\014\n\nmemberType\"\206\001\n\027CreateMembershipReq"
          + "uest\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036chat.googl"
          + "eapis.com/Membership\0223\n\nmembership\030\002 \001(\013"
          + "2\032.google.chat.v1.MembershipB\003\340A\002\"\313\001\n\026Li"
          + "stMembershipsRequest\0226\n\006parent\030\001 \001(\tB&\340A"
          + "\002\372A \022\036chat.googleapis.com/Membership\022\026\n\t"
          + "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t"
          + "B\003\340A\001\022\023\n\006filter\030\005 \001(\tB\003\340A\001\022\030\n\013show_group"
          + "s\030\006 \001(\010B\003\340A\001\022\031\n\014show_invited\030\007 \001(\010B\003\340A\001\""
          + "h\n\027ListMembershipsResponse\0224\n\013membership"
          + "s\030\001 \003(\0132\032.google.chat.v1.MembershipB\003\340A\006"
          + "\022\027\n\017next_page_token\030\002 \001(\t\"L\n\024GetMembersh"
          + "ipRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036chat.go"
          + "ogleapis.com/Membership\"O\n\027DeleteMembers"
          + "hipRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036chat.g"
          + "oogleapis.com/MembershipB\232\001\n\022com.google."
          + "chat.v1B\017MembershipProtoP\001Z,cloud.google"
          + ".com/go/chat/apiv1/chatpb;chatpb\252\002\023Googl"
          + "e.Apps.Chat.V1\312\002\023Google\\Apps\\Chat\\V1\352\002\026G"
          + "oogle::Apps::Chat::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.chat.v1.GroupProto.getDescriptor(),
              com.google.chat.v1.UserProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_chat_v1_Membership_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_Membership_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_Membership_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "Role",
              "Member",
              "GroupMember",
              "CreateTime",
              "DeleteTime",
              "MemberType",
            });
    internal_static_google_chat_v1_CreateMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_chat_v1_CreateMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_CreateMembershipRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Membership",
            });
    internal_static_google_chat_v1_ListMembershipsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_chat_v1_ListMembershipsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ListMembershipsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "ShowGroups", "ShowInvited",
            });
    internal_static_google_chat_v1_ListMembershipsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_chat_v1_ListMembershipsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ListMembershipsResponse_descriptor,
            new java.lang.String[] {
              "Memberships", "NextPageToken",
            });
    internal_static_google_chat_v1_GetMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_chat_v1_GetMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_GetMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_chat_v1_DeleteMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_chat_v1_DeleteMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_DeleteMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.chat.v1.GroupProto.getDescriptor();
    com.google.chat.v1.UserProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
