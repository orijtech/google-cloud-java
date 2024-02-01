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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_text_extraction.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLTextExtractionProto {
  private AutoMLTextExtractionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtraction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtraction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtractionInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtractionInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nUgoogle/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_text_extractio"
          + "n.proto\0228google.cloud.aiplatform.v1.sche"
          + "ma.trainingjob.definition\"|\n\024AutoMlTextE"
          + "xtraction\022d\n\006inputs\030\001 \001(\0132T.google.cloud"
          + ".aiplatform.v1.schema.trainingjob.defini"
          + "tion.AutoMlTextExtractionInputs\"\034\n\032AutoM"
          + "lTextExtractionInputsB\360\002\n<com.google.clo"
          + "ud.aiplatform.v1.schema.trainingjob.defi"
          + "nitionB\031AutoMLTextExtractionProtoP\001Z\\clo"
          + "ud.google.com/go/aiplatform/apiv1/schema"
          + "/trainingjob/definition/definitionpb;def"
          + "initionpb\252\0028Google.Cloud.AIPlatform.V1.S"
          + "chema.TrainingJob.Definition\312\0028Google\\Cl"
          + "oud\\AIPlatform\\V1\\Schema\\TrainingJob\\Def"
          + "inition\352\002>Google::Cloud::AIPlatform::V1:"
          + ":Schema::TrainingJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtraction_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtraction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtraction_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtractionInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtractionInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextExtractionInputs_descriptor,
            new java.lang.String[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
