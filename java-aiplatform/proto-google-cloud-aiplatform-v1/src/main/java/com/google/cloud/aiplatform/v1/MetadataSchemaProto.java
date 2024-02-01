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
// source: google/cloud/aiplatform/v1/metadata_schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class MetadataSchemaProto {
  private MetadataSchemaProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MetadataSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MetadataSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/metadata_sc"
          + "hema.proto\022\032google.cloud.aiplatform.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\037google/protobuf/time"
          + "stamp.proto\"\203\004\n\016MetadataSchema\022\022\n\004name\030\001"
          + " \001(\tB\004\342A\001\003\022\026\n\016schema_version\030\002 \001(\t\022\024\n\006sc"
          + "hema\030\003 \001(\tB\004\342A\001\002\022R\n\013schema_type\030\004 \001(\0162=."
          + "google.cloud.aiplatform.v1.MetadataSchem"
          + "a.MetadataSchemaType\0225\n\013create_time\030\005 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\003\022\023\n\013d"
          + "escription\030\006 \001(\t\"s\n\022MetadataSchemaType\022$"
          + "\n METADATA_SCHEMA_TYPE_UNSPECIFIED\020\000\022\021\n\r"
          + "ARTIFACT_TYPE\020\001\022\022\n\016EXECUTION_TYPE\020\002\022\020\n\014C"
          + "ONTEXT_TYPE\020\003:\231\001\352A\225\001\n(aiplatform.googlea"
          + "pis.com/MetadataSchema\022iprojects/{projec"
          + "t}/locations/{location}/metadataStores/{"
          + "metadata_store}/metadataSchemas/{metadat"
          + "a_schema}B\321\001\n\036com.google.cloud.aiplatfor"
          + "m.v1B\023MetadataSchemaProtoP\001Z>cloud.googl"
          + "e.com/go/aiplatform/apiv1/aiplatformpb;a"
          + "iplatformpb\252\002\032Google.Cloud.AIPlatform.V1"
          + "\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::"
          + "Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_MetadataSchema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MetadataSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MetadataSchema_descriptor,
            new java.lang.String[] {
              "Name", "SchemaVersion", "Schema", "SchemaType", "CreateTime", "Description",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
