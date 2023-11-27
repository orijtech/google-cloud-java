/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1/model.proto

package com.google.cloud.aiplatform.v1;

public final class ModelProto {
  private ModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_LargeModelReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_LargeModelReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictSchemata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Port_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Probe_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Probe_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/model.proto"
          + "\022\032google.cloud.aiplatform.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0323google/cloud/aiplatform/v1/dep"
          + "loyed_model_ref.proto\0320google/cloud/aipl"
          + "atform/v1/encryption_spec.proto\032(google/"
          + "cloud/aiplatform/v1/env_var.proto\032,googl"
          + "e/cloud/aiplatform/v1/explanation.proto\032"
          + "\036google/protobuf/duration.proto\032\034google/"
          + "protobuf/struct.proto\032\037google/protobuf/t"
          + "imestamp.proto\"\364\020\n\005Model\022\014\n\004name\030\001 \001(\t\022\031"
          + "\n\nversion_id\030\034 \001(\tB\005\342A\002\005\003\022\027\n\017version_ali"
          + "ases\030\035 \003(\t\022=\n\023version_create_time\030\037 \001(\0132"
          + "\032.google.protobuf.TimestampB\004\342A\001\003\022=\n\023ver"
          + "sion_update_time\030  \001(\0132\032.google.protobuf"
          + ".TimestampB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004"
          + "\342A\001\002\022\023\n\013description\030\003 \001(\t\022\033\n\023version_des"
          + "cription\030\036 \001(\t\022E\n\020predict_schemata\030\004 \001(\013"
          + "2+.google.cloud.aiplatform.v1.PredictSch"
          + "emata\022!\n\023metadata_schema_uri\030\005 \001(\tB\004\342A\001\005"
          + "\022.\n\010metadata\030\006 \001(\0132\026.google.protobuf.Val"
          + "ueB\004\342A\001\005\022V\n\030supported_export_formats\030\024 \003"
          + "(\0132..google.cloud.aiplatform.v1.Model.Ex"
          + "portFormatB\004\342A\001\003\022N\n\021training_pipeline\030\007 "
          + "\001(\tB3\342A\001\003\372A,\n*aiplatform.googleapis.com/"
          + "TrainingPipeline\022D\n\014pipeline_job\030/ \001(\tB."
          + "\342A\001\001\372A\'\n%aiplatform.googleapis.com/Pipel"
          + "ineJob\022L\n\016container_spec\030\t \001(\0132..google."
          + "cloud.aiplatform.v1.ModelContainerSpecB\004"
          + "\342A\001\004\022\032\n\014artifact_uri\030\032 \001(\tB\004\342A\001\005\022m\n$supp"
          + "orted_deployment_resources_types\030\n \003(\01629"
          + ".google.cloud.aiplatform.v1.Model.Deploy"
          + "mentResourcesTypeB\004\342A\001\003\022-\n\037supported_inp"
          + "ut_storage_formats\030\013 \003(\tB\004\342A\001\003\022.\n suppor"
          + "ted_output_storage_formats\030\014 \003(\tB\004\342A\001\003\0225"
          + "\n\013create_time\030\r \001(\0132\032.google.protobuf.Ti"
          + "mestampB\004\342A\001\003\0225\n\013update_time\030\016 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\003\022K\n\017deployed"
          + "_models\030\017 \003(\0132,.google.cloud.aiplatform."
          + "v1.DeployedModelRefB\004\342A\001\003\022E\n\020explanation"
          + "_spec\030\027 \001(\0132+.google.cloud.aiplatform.v1"
          + ".ExplanationSpec\022\014\n\004etag\030\020 \001(\t\022=\n\006labels"
          + "\030\021 \003(\0132-.google.cloud.aiplatform.v1.Mode"
          + "l.LabelsEntry\022C\n\017encryption_spec\030\030 \001(\0132*"
          + ".google.cloud.aiplatform.v1.EncryptionSp"
          + "ec\022L\n\021model_source_info\030& \001(\0132+.google.c"
          + "loud.aiplatform.v1.ModelSourceInfoB\004\342A\001\003"
          + "\022V\n\023original_model_info\030\" \001(\01323.google.c"
          + "loud.aiplatform.v1.Model.OriginalModelIn"
          + "foB\004\342A\001\003\022\037\n\021metadata_artifact\030, \001(\tB\004\342A\001"
          + "\003\032\327\001\n\014ExportFormat\022\020\n\002id\030\001 \001(\tB\004\342A\001\003\022c\n\023"
          + "exportable_contents\030\002 \003(\0162@.google.cloud"
          + ".aiplatform.v1.Model.ExportFormat.Export"
          + "ableContentB\004\342A\001\003\"P\n\021ExportableContent\022\""
          + "\n\036EXPORTABLE_CONTENT_UNSPECIFIED\020\000\022\014\n\010AR"
          + "TIFACT\020\001\022\t\n\005IMAGE\020\002\032L\n\021OriginalModelInfo"
          + "\0227\n\005model\030\001 \001(\tB(\342A\001\003\372A!\n\037aiplatform.goo"
          + "gleapis.com/Model\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\214\001\n\027DeploymentR"
          + "esourcesType\022)\n%DEPLOYMENT_RESOURCES_TYP"
          + "E_UNSPECIFIED\020\000\022\027\n\023DEDICATED_RESOURCES\020\001"
          + "\022\027\n\023AUTOMATIC_RESOURCES\020\002\022\024\n\020SHARED_RESO"
          + "URCES\020\003:\\\352AY\n\037aiplatform.googleapis.com/"
          + "Model\0226projects/{project}/locations/{loc"
          + "ation}/models/{model}\")\n\023LargeModelRefer"
          + "ence\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\"~\n\017PredictSchem"
          + "ata\022!\n\023instance_schema_uri\030\001 \001(\tB\004\342A\001\005\022#"
          + "\n\025parameters_schema_uri\030\002 \001(\tB\004\342A\001\005\022#\n\025p"
          + "rediction_schema_uri\030\003 \001(\tB\004\342A\001\005\"\235\004\n\022Mod"
          + "elContainerSpec\022\030\n\timage_uri\030\001 \001(\tB\005\342A\002\002"
          + "\005\022\025\n\007command\030\002 \003(\tB\004\342A\001\005\022\022\n\004args\030\003 \003(\tB\004"
          + "\342A\001\005\0225\n\003env\030\004 \003(\0132\".google.cloud.aiplatf"
          + "orm.v1.EnvVarB\004\342A\001\005\0225\n\005ports\030\005 \003(\0132 .goo"
          + "gle.cloud.aiplatform.v1.PortB\004\342A\001\005\022\033\n\rpr"
          + "edict_route\030\006 \001(\tB\004\342A\001\005\022\032\n\014health_route\030"
          + "\007 \001(\tB\004\342A\001\005\022:\n\ngrpc_ports\030\t \003(\0132 .google"
          + ".cloud.aiplatform.v1.PortB\004\342A\001\005\022;\n\022deplo"
          + "yment_timeout\030\n \001(\0132\031.google.protobuf.Du"
          + "rationB\004\342A\001\005\022#\n\025shared_memory_size_mb\030\013 "
          + "\001(\003B\004\342A\001\005\022>\n\rstartup_probe\030\014 \001(\0132!.googl"
          + "e.cloud.aiplatform.v1.ProbeB\004\342A\001\005\022=\n\014hea"
          + "lth_probe\030\r \001(\0132!.google.cloud.aiplatfor"
          + "m.v1.ProbeB\004\342A\001\005\"\036\n\004Port\022\026\n\016container_po"
          + "rt\030\003 \001(\005\"\346\001\n\017ModelSourceInfo\022P\n\013source_t"
          + "ype\030\001 \001(\0162;.google.cloud.aiplatform.v1.M"
          + "odelSourceInfo.ModelSourceType\022\014\n\004copy\030\002"
          + " \001(\010\"s\n\017ModelSourceType\022!\n\035MODEL_SOURCE_"
          + "TYPE_UNSPECIFIED\020\000\022\n\n\006AUTOML\020\001\022\n\n\006CUSTOM"
          + "\020\002\022\010\n\004BQML\020\003\022\020\n\014MODEL_GARDEN\020\004\022\t\n\005GENIE\020"
          + "\005\"\243\001\n\005Probe\022<\n\004exec\030\001 \001(\0132,.google.cloud"
          + ".aiplatform.v1.Probe.ExecActionH\000\022\026\n\016per"
          + "iod_seconds\030\002 \001(\005\022\027\n\017timeout_seconds\030\003 \001"
          + "(\005\032\035\n\nExecAction\022\017\n\007command\030\001 \003(\tB\014\n\npro"
          + "be_typeB\310\001\n\036com.google.cloud.aiplatform."
          + "v1B\nModelProtoP\001Z>cloud.google.com/go/ai"
          + "platform/apiv1/aiplatformpb;aiplatformpb"
          + "\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\C"
          + "loud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPl"
          + "atform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_descriptor,
            new java.lang.String[] {
              "Name",
              "VersionId",
              "VersionAliases",
              "VersionCreateTime",
              "VersionUpdateTime",
              "DisplayName",
              "Description",
              "VersionDescription",
              "PredictSchemata",
              "MetadataSchemaUri",
              "Metadata",
              "SupportedExportFormats",
              "TrainingPipeline",
              "PipelineJob",
              "ContainerSpec",
              "ArtifactUri",
              "SupportedDeploymentResourcesTypes",
              "SupportedInputStorageFormats",
              "SupportedOutputStorageFormats",
              "CreateTime",
              "UpdateTime",
              "DeployedModels",
              "ExplanationSpec",
              "Etag",
              "Labels",
              "EncryptionSpec",
              "ModelSourceInfo",
              "OriginalModelInfo",
              "MetadataArtifact",
            });
    internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor,
            new java.lang.String[] {
              "Id", "ExportableContents",
            });
    internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_LargeModelReference_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_LargeModelReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_LargeModelReference_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_PredictSchemata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor,
            new java.lang.String[] {
              "InstanceSchemaUri", "ParametersSchemaUri", "PredictionSchemaUri",
            });
    internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri",
              "Command",
              "Args",
              "Env",
              "Ports",
              "PredictRoute",
              "HealthRoute",
              "GrpcPorts",
              "DeploymentTimeout",
              "SharedMemorySizeMb",
              "StartupProbe",
              "HealthProbe",
            });
    internal_static_google_cloud_aiplatform_v1_Port_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_Port_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Port_descriptor,
            new java.lang.String[] {
              "ContainerPort",
            });
    internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor,
            new java.lang.String[] {
              "SourceType", "Copy",
            });
    internal_static_google_cloud_aiplatform_v1_Probe_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_Probe_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Probe_descriptor,
            new java.lang.String[] {
              "Exec", "PeriodSeconds", "TimeoutSeconds", "ProbeType",
            });
    internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_descriptor =
        internal_static_google_cloud_aiplatform_v1_Probe_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_descriptor,
            new java.lang.String[] {
              "Command",
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
    com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
