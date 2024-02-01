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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_text_classification.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLTextClassificationProto {
  private AutoMLTextClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n^google/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_text_clas"
          + "sification.proto\022=google.cloud.aiplatfor"
          + "m.v1beta1.schema.trainingjob.definition\""
          + "\211\001\n\030AutoMlTextClassification\022m\n\006inputs\030\001"
          + " \001(\0132].google.cloud.aiplatform.v1beta1.s"
          + "chema.trainingjob.definition.AutoMlTextC"
          + "lassificationInputs\"5\n\036AutoMlTextClassif"
          + "icationInputs\022\023\n\013multi_label\030\001 \001(\010B\215\003\nAc"
          + "om.google.cloud.aiplatform.v1beta1.schem"
          + "a.trainingjob.definitionB\035AutoMLTextClas"
          + "sificationProtoP\001Zacloud.google.com/go/a"
          + "iplatform/apiv1beta1/schema/trainingjob/"
          + "definition/definitionpb;definitionpb\252\002=G"
          + "oogle.Cloud.AIPlatform.V1Beta1.Schema.Tr"
          + "ainingJob.Definition\312\002=Google\\Cloud\\AIPl"
          + "atform\\V1beta1\\Schema\\TrainingJob\\Defini"
          + "tion\352\002CGoogle::Cloud::AIPlatform::V1beta"
          + "1::Schema::TrainingJob::Definitionb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassification_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassification_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor,
            new java.lang.String[] {
              "MultiLabel",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
