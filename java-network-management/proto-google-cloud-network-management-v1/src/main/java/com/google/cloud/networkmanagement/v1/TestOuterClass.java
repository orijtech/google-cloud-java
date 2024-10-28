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
// source: google/cloud/networkmanagement/v1/connectivity_test.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1;

public final class TestOuterClass {
  private TestOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudFunctionEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudFunctionEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_Endpoint_AppEngineVersionEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_Endpoint_AppEngineVersionEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudRunRevisionEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudRunRevisionEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_LatencyPercentile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_LatencyPercentile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_LatencyDistribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_LatencyDistribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ProbingDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ProbingDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ProbingDetails_EdgeLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ProbingDetails_EdgeLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/networkmanagement/v1/conn"
          + "ectivity_test.proto\022!google.cloud.networ"
          + "kmanagement.v1\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032-goog"
          + "le/cloud/networkmanagement/v1/trace.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\027goog"
          + "le/rpc/status.proto\"\270\006\n\020ConnectivityTest"
          + "\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\023\n\013description\030\002 \001(\t"
          + "\022@\n\006source\030\003 \001(\0132+.google.cloud.networkm"
          + "anagement.v1.EndpointB\003\340A\002\022E\n\013destinatio"
          + "n\030\004 \001(\0132+.google.cloud.networkmanagement"
          + ".v1.EndpointB\003\340A\002\022\020\n\010protocol\030\005 \001(\t\022\030\n\020r"
          + "elated_projects\030\006 \003(\t\022\031\n\014display_name\030\007 "
          + "\001(\tB\003\340A\003\022O\n\006labels\030\010 \003(\0132?.google.cloud."
          + "networkmanagement.v1.ConnectivityTest.La"
          + "belsEntry\0224\n\013create_time\030\n \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\0224\n\013update_time\030\013"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022Y\n"
          + "\024reachability_details\030\014 \001(\01326.google.clo"
          + "ud.networkmanagement.v1.ReachabilityDeta"
          + "ilsB\003\340A\003\022O\n\017probing_details\030\016 \001(\01321.goog"
          + "le.cloud.networkmanagement.v1.ProbingDet"
          + "ailsB\003\340A\003\022\036\n\026bypass_firewall_checks\030\021 \001("
          + "\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001:t\352Aq\n1networkmanagement.googlea"
          + "pis.com/ConnectivityTest\022<projects/{proj"
          + "ect}/locations/global/connectivityTests/"
          + "{test}\"\311\t\n\010Endpoint\022\022\n\nip_address\030\001 \001(\t\022"
          + "\014\n\004port\030\002 \001(\005\022\020\n\010instance\030\003 \001(\t\022\027\n\017forwa"
          + "rding_rule\030\r \001(\t\022j\n\026forwarding_rule_targ"
          + "et\030\016 \001(\0162@.google.cloud.networkmanagemen"
          + "t.v1.Endpoint.ForwardingRuleTargetB\003\340A\003H"
          + "\000\210\001\001\022\"\n\020load_balancer_id\030\017 \001(\tB\003\340A\003H\001\210\001\001"
          + "\022Y\n\022load_balancer_type\030\020 \001(\01623.google.cl"
          + "oud.networkmanagement.v1.LoadBalancerTyp"
          + "eB\003\340A\003H\002\210\001\001\022\032\n\022gke_master_cluster\030\007 \001(\t\022"
          + "\032\n\022cloud_sql_instance\030\010 \001(\t\022\026\n\016redis_ins"
          + "tance\030\021 \001(\t\022\025\n\rredis_cluster\030\022 \001(\t\022Y\n\016cl"
          + "oud_function\030\n \001(\0132A.google.cloud.networ"
          + "kmanagement.v1.Endpoint.CloudFunctionEnd"
          + "point\022`\n\022app_engine_version\030\013 \001(\0132D.goog"
          + "le.cloud.networkmanagement.v1.Endpoint.A"
          + "ppEngineVersionEndpoint\022`\n\022cloud_run_rev"
          + "ision\030\014 \001(\0132D.google.cloud.networkmanage"
          + "ment.v1.Endpoint.CloudRunRevisionEndpoin"
          + "t\022\017\n\007network\030\004 \001(\t\022M\n\014network_type\030\005 \001(\016"
          + "27.google.cloud.networkmanagement.v1.End"
          + "point.NetworkType\022\022\n\nproject_id\030\006 \001(\t\032$\n"
          + "\025CloudFunctionEndpoint\022\013\n\003uri\030\001 \001(\t\032\'\n\030A"
          + "ppEngineVersionEndpoint\022\013\n\003uri\030\001 \001(\t\032\'\n\030"
          + "CloudRunRevisionEndpoint\022\013\n\003uri\030\001 \001(\t\"Q\n"
          + "\013NetworkType\022\034\n\030NETWORK_TYPE_UNSPECIFIED"
          + "\020\000\022\017\n\013GCP_NETWORK\020\001\022\023\n\017NON_GCP_NETWORK\020\002"
          + "\"y\n\024ForwardingRuleTarget\022&\n\"FORWARDING_R"
          + "ULE_TARGET_UNSPECIFIED\020\000\022\014\n\010INSTANCE\020\001\022\021"
          + "\n\rLOAD_BALANCER\020\002\022\017\n\013VPN_GATEWAY\020\003\022\007\n\003PS"
          + "C\020\004B\031\n\027_forwarding_rule_targetB\023\n\021_load_"
          + "balancer_idB\025\n\023_load_balancer_type\"\325\002\n\023R"
          + "eachabilityDetails\022M\n\006result\030\001 \001(\0162=.goo"
          + "gle.cloud.networkmanagement.v1.Reachabil"
          + "ityDetails.Result\022/\n\013verify_time\030\002 \001(\0132\032"
          + ".google.protobuf.Timestamp\022!\n\005error\030\003 \001("
          + "\0132\022.google.rpc.Status\0228\n\006traces\030\005 \003(\0132(."
          + "google.cloud.networkmanagement.v1.Trace\""
          + "a\n\006Result\022\026\n\022RESULT_UNSPECIFIED\020\000\022\r\n\tREA"
          + "CHABLE\020\001\022\017\n\013UNREACHABLE\020\002\022\r\n\tAMBIGUOUS\020\004"
          + "\022\020\n\014UNDETERMINED\020\005\"<\n\021LatencyPercentile\022"
          + "\017\n\007percent\030\001 \001(\005\022\026\n\016latency_micros\030\002 \001(\003"
          + "\"h\n\023LatencyDistribution\022Q\n\023latency_perce"
          + "ntiles\030\001 \003(\01324.google.cloud.networkmanag"
          + "ement.v1.LatencyPercentile\"\336\006\n\016ProbingDe"
          + "tails\022O\n\006result\030\001 \001(\0162?.google.cloud.net"
          + "workmanagement.v1.ProbingDetails.Probing"
          + "Result\022/\n\013verify_time\030\002 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022!\n\005error\030\003 \001(\0132\022.google."
          + "rpc.Status\022X\n\013abort_cause\030\004 \001(\0162C.google"
          + ".cloud.networkmanagement.v1.ProbingDetai"
          + "ls.ProbingAbortCause\022\030\n\020sent_probe_count"
          + "\030\005 \001(\005\022\036\n\026successful_probe_count\030\006 \001(\005\022F"
          + "\n\rendpoint_info\030\007 \001(\0132/.google.cloud.net"
          + "workmanagement.v1.EndpointInfo\022O\n\017probin"
          + "g_latency\030\010 \001(\01326.google.cloud.networkma"
          + "nagement.v1.LatencyDistribution\022c\n\033desti"
          + "nation_egress_location\030\t \001(\0132>.google.cl"
          + "oud.networkmanagement.v1.ProbingDetails."
          + "EdgeLocation\032)\n\014EdgeLocation\022\031\n\021metropol"
          + "itan_area\030\001 \001(\t\"\200\001\n\rProbingResult\022\036\n\032PRO"
          + "BING_RESULT_UNSPECIFIED\020\000\022\r\n\tREACHABLE\020\001"
          + "\022\017\n\013UNREACHABLE\020\002\022\035\n\031REACHABILITY_INCONS"
          + "ISTENT\020\003\022\020\n\014UNDETERMINED\020\004\"g\n\021ProbingAbo"
          + "rtCause\022#\n\037PROBING_ABORT_CAUSE_UNSPECIFI"
          + "ED\020\000\022\025\n\021PERMISSION_DENIED\020\001\022\026\n\022NO_SOURCE"
          + "_LOCATION\020\002B\375\001\n%com.google.cloud.network"
          + "management.v1B\016TestOuterClassP\001ZScloud.g"
          + "oogle.com/go/networkmanagement/apiv1/net"
          + "workmanagementpb;networkmanagementpb\252\002!G"
          + "oogle.Cloud.NetworkManagement.V1\312\002!Googl"
          + "e\\Cloud\\NetworkManagement\\V1\352\002$Google::C"
          + "loud::NetworkManagement::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.networkmanagement.v1.TraceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Source",
              "Destination",
              "Protocol",
              "RelatedProjects",
              "DisplayName",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "ReachabilityDetails",
              "ProbingDetails",
              "BypassFirewallChecks",
            });
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_descriptor =
        internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor,
            new java.lang.String[] {
              "IpAddress",
              "Port",
              "Instance",
              "ForwardingRule",
              "ForwardingRuleTarget",
              "LoadBalancerId",
              "LoadBalancerType",
              "GkeMasterCluster",
              "CloudSqlInstance",
              "RedisInstance",
              "RedisCluster",
              "CloudFunction",
              "AppEngineVersion",
              "CloudRunRevision",
              "Network",
              "NetworkType",
              "ProjectId",
            });
    internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudFunctionEndpoint_descriptor =
        internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudFunctionEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudFunctionEndpoint_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_networkmanagement_v1_Endpoint_AppEngineVersionEndpoint_descriptor =
        internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_networkmanagement_v1_Endpoint_AppEngineVersionEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_Endpoint_AppEngineVersionEndpoint_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudRunRevisionEndpoint_descriptor =
        internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudRunRevisionEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_Endpoint_CloudRunRevisionEndpoint_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_descriptor,
            new java.lang.String[] {
              "Result", "VerifyTime", "Error", "Traces",
            });
    internal_static_google_cloud_networkmanagement_v1_LatencyPercentile_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1_LatencyPercentile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_LatencyPercentile_descriptor,
            new java.lang.String[] {
              "Percent", "LatencyMicros",
            });
    internal_static_google_cloud_networkmanagement_v1_LatencyDistribution_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1_LatencyDistribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_LatencyDistribution_descriptor,
            new java.lang.String[] {
              "LatencyPercentiles",
            });
    internal_static_google_cloud_networkmanagement_v1_ProbingDetails_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1_ProbingDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ProbingDetails_descriptor,
            new java.lang.String[] {
              "Result",
              "VerifyTime",
              "Error",
              "AbortCause",
              "SentProbeCount",
              "SuccessfulProbeCount",
              "EndpointInfo",
              "ProbingLatency",
              "DestinationEgressLocation",
            });
    internal_static_google_cloud_networkmanagement_v1_ProbingDetails_EdgeLocation_descriptor =
        internal_static_google_cloud_networkmanagement_v1_ProbingDetails_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkmanagement_v1_ProbingDetails_EdgeLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ProbingDetails_EdgeLocation_descriptor,
            new java.lang.String[] {
              "MetropolitanArea",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networkmanagement.v1.TraceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
