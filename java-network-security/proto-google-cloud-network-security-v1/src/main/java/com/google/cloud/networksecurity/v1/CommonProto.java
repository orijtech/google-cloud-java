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
// source: google/cloud/networksecurity/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networksecurity.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/networksecurity/v1/common"
          + ".proto\022\037google.cloud.networksecurity.v1\032"
          + "\037google/api/field_behavior.proto\032\037google"
          + "/protobuf/timestamp.proto\"\200\002\n\021OperationM"
          + "etadata\0224\n\013create_time\030\001 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022\023\n\006targ"
          + "et\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016stat"
          + "us_message\030\005 \001(\tB\003\340A\003\022#\n\026requested_cance"
          + "llation\030\006 \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB"
          + "\003\340A\003B\354\001\n#com.google.cloud.networksecurit"
          + "y.v1B\013CommonProtoP\001ZMcloud.google.com/go"
          + "/networksecurity/apiv1/networksecuritypb"
          + ";networksecuritypb\252\002\037Google.Cloud.Networ"
          + "kSecurity.V1\312\002\037Google\\Cloud\\NetworkSecur"
          + "ity\\V1\352\002\"Google::Cloud::NetworkSecurity:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networksecurity_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
