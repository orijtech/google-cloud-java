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
// source: google/cloud/discoveryengine/v1/control.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public final class ControlProto {
  private ControlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/discoveryengine/v1/contro"
          + "l.proto\022\037google.cloud.discoveryengine.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032,google/cloud/disco"
          + "veryengine/v1/common.proto\032\037google/proto"
          + "buf/timestamp.proto\"\334\002\n\tCondition\022I\n\013que"
          + "ry_terms\030\002 \003(\01324.google.cloud.discoverye"
          + "ngine.v1.Condition.QueryTerm\022O\n\021active_t"
          + "ime_range\030\003 \003(\01324.google.cloud.discovery"
          + "engine.v1.Condition.TimeRange\022\030\n\013query_r"
          + "egex\030\004 \001(\tB\003\340A\001\032.\n\tQueryTerm\022\r\n\005value\030\001 "
          + "\001(\t\022\022\n\nfull_match\030\002 \001(\010\032i\n\tTimeRange\022.\n\n"
          + "start_time\030\001 \001(\0132\032.google.protobuf.Times"
          + "tamp\022,\n\010end_time\030\002 \001(\0132\032.google.protobuf"
          + ".Timestamp\"\224\n\n\007Control\022L\n\014boost_action\030\006"
          + " \001(\01324.google.cloud.discoveryengine.v1.C"
          + "ontrol.BoostActionH\000\022N\n\rfilter_action\030\007 "
          + "\001(\01325.google.cloud.discoveryengine.v1.Co"
          + "ntrol.FilterActionH\000\022R\n\017redirect_action\030"
          + "\t \001(\01327.google.cloud.discoveryengine.v1."
          + "Control.RedirectActionH\000\022R\n\017synonyms_act"
          + "ion\030\n \001(\01327.google.cloud.discoveryengine"
          + ".v1.Control.SynonymsActionH\000\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\005\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022*\n\035as"
          + "sociated_serving_config_ids\030\003 \003(\tB\003\340A\003\022L"
          + "\n\rsolution_type\030\004 \001(\0162-.google.cloud.dis"
          + "coveryengine.v1.SolutionTypeB\006\340A\002\340A\005\022A\n\t"
          + "use_cases\030\010 \003(\0162..google.cloud.discovery"
          + "engine.v1.SearchUseCase\022>\n\nconditions\030\005 "
          + "\003(\0132*.google.cloud.discoveryengine.v1.Co"
          + "ndition\032|\n\013BoostAction\022\022\n\005boost\030\001 \001(\002B\003\340"
          + "A\002\022\023\n\006filter\030\002 \001(\tB\003\340A\002\022D\n\ndata_store\030\003 "
          + "\001(\tB0\340A\002\372A*\n(discoveryengine.googleapis."
          + "com/DataStore\032i\n\014FilterAction\022\023\n\006filter\030"
          + "\001 \001(\tB\003\340A\002\022D\n\ndata_store\030\002 \001(\tB0\340A\002\372A*\n("
          + "discoveryengine.googleapis.com/DataStore"
          + "\032+\n\016RedirectAction\022\031\n\014redirect_uri\030\001 \001(\t"
          + "B\003\340A\002\032\"\n\016SynonymsAction\022\020\n\010synonyms\030\001 \003("
          + "\t:\323\002\352A\317\002\n&discoveryengine.googleapis.com"
          + "/Control\022Rprojects/{project}/locations/{"
          + "location}/dataStores/{data_store}/contro"
          + "ls/{control}\022kprojects/{project}/locatio"
          + "ns/{location}/collections/{collection}/d"
          + "ataStores/{data_store}/controls/{control"
          + "}\022dprojects/{project}/locations/{locatio"
          + "n}/collections/{collection}/engines/{eng"
          + "ine}/controls/{control}B\010\n\006actionB\377\001\n#co"
          + "m.google.cloud.discoveryengine.v1B\014Contr"
          + "olProtoP\001ZMcloud.google.com/go/discovery"
          + "engine/apiv1/discoveryenginepb;discovery"
          + "enginepb\242\002\017DISCOVERYENGINE\252\002\037Google.Clou"
          + "d.DiscoveryEngine.V1\312\002\037Google\\Cloud\\Disc"
          + "overyEngine\\V1\352\002\"Google::Cloud::Discover"
          + "yEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_Condition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Condition_descriptor,
            new java.lang.String[] {
              "QueryTerms", "ActiveTimeRange", "QueryRegex",
            });
    internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Condition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_descriptor,
            new java.lang.String[] {
              "Value", "FullMatch",
            });
    internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Condition_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_Control_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_descriptor,
            new java.lang.String[] {
              "BoostAction",
              "FilterAction",
              "RedirectAction",
              "SynonymsAction",
              "Name",
              "DisplayName",
              "AssociatedServingConfigIds",
              "SolutionType",
              "UseCases",
              "Conditions",
              "Action",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_descriptor,
            new java.lang.String[] {
              "Boost", "Filter", "DataStore",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_descriptor,
            new java.lang.String[] {
              "Filter", "DataStore",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_descriptor,
            new java.lang.String[] {
              "RedirectUri",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_descriptor,
            new java.lang.String[] {
              "Synonyms",
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
    com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
