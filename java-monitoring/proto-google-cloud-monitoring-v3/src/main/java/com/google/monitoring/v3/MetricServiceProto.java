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
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public final class MetricServiceProto {
  private MetricServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_QueryTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_QueryTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_QueryTimeSeriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_QueryTimeSeriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_QueryErrorList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_QueryErrorList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/monitoring/v3/metric_service.pr"
          + "oto\022\024google.monitoring.v3\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\027googl"
          + "e/api/metric.proto\032#google/api/monitored"
          + "_resource.proto\032\031google/api/resource.pro"
          + "to\032!google/monitoring/v3/common.proto\032!g"
          + "oogle/monitoring/v3/metric.proto\032\033google"
          + "/protobuf/empty.proto\032\027google/rpc/status"
          + ".proto\"\255\001\n\'ListMonitoredResourceDescript"
          + "orsRequest\022K\n\004name\030\005 \001(\tB=\340A\002\372A7\0225monito"
          + "ring.googleapis.com/MonitoredResourceDes"
          + "criptor\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001"
          + "(\005\022\022\n\npage_token\030\004 \001(\t\"\212\001\n(ListMonitored"
          + "ResourceDescriptorsResponse\022E\n\024resource_"
          + "descriptors\030\001 \003(\0132\'.google.api.Monitored"
          + "ResourceDescriptor\022\027\n\017next_page_token\030\002 "
          + "\001(\t\"t\n%GetMonitoredResourceDescriptorReq"
          + "uest\022K\n\004name\030\003 \001(\tB=\340A\002\372A7\n5monitoring.g"
          + "oogleapis.com/MonitoredResourceDescripto"
          + "r\"\227\001\n\034ListMetricDescriptorsRequest\022@\n\004na"
          + "me\030\005 \001(\tB2\340A\002\372A,\022*monitoring.googleapis."
          + "com/MetricDescriptor\022\016\n\006filter\030\002 \001(\t\022\021\n\t"
          + "page_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"r\n\035L"
          + "istMetricDescriptorsResponse\0228\n\022metric_d"
          + "escriptors\030\001 \003(\0132\034.google.api.MetricDesc"
          + "riptor\022\027\n\017next_page_token\030\002 \001(\t\"^\n\032GetMe"
          + "tricDescriptorRequest\022@\n\004name\030\003 \001(\tB2\340A\002"
          + "\372A,\n*monitoring.googleapis.com/MetricDes"
          + "criptor\"\237\001\n\035CreateMetricDescriptorReques"
          + "t\022@\n\004name\030\003 \001(\tB2\340A\002\372A,\022*monitoring.goog"
          + "leapis.com/MetricDescriptor\022<\n\021metric_de"
          + "scriptor\030\002 \001(\0132\034.google.api.MetricDescri"
          + "ptorB\003\340A\002\"a\n\035DeleteMetricDescriptorReque"
          + "st\022@\n\004name\030\003 \001(\tB2\340A\002\372A,\n*monitoring.goo"
          + "gleapis.com/MetricDescriptor\"\316\003\n\025ListTim"
          + "eSeriesRequest\022:\n\004name\030\n \001(\tB,\340A\002\372A&\022$mo"
          + "nitoring.googleapis.com/TimeSeries\022\023\n\006fi"
          + "lter\030\002 \001(\tB\003\340A\002\0229\n\010interval\030\004 \001(\0132\".goog"
          + "le.monitoring.v3.TimeIntervalB\003\340A\002\0226\n\013ag"
          + "gregation\030\005 \001(\0132!.google.monitoring.v3.A"
          + "ggregation\022@\n\025secondary_aggregation\030\013 \001("
          + "\0132!.google.monitoring.v3.Aggregation\022\020\n\010"
          + "order_by\030\006 \001(\t\022M\n\004view\030\007 \001(\0162:.google.mo"
          + "nitoring.v3.ListTimeSeriesRequest.TimeSe"
          + "riesViewB\003\340A\002\022\021\n\tpage_size\030\010 \001(\005\022\022\n\npage"
          + "_token\030\t \001(\t\"\'\n\016TimeSeriesView\022\010\n\004FULL\020\000"
          + "\022\013\n\007HEADERS\020\001\"\244\001\n\026ListTimeSeriesResponse"
          + "\0225\n\013time_series\030\001 \003(\0132 .google.monitorin"
          + "g.v3.TimeSeries\022\027\n\017next_page_token\030\002 \001(\t"
          + "\022,\n\020execution_errors\030\003 \003(\0132\022.google.rpc."
          + "Status\022\014\n\004unit\030\005 \001(\t\"\230\001\n\027CreateTimeSerie"
          + "sRequest\022A\n\004name\030\003 \001(\tB3\340A\002\372A-\n+cloudres"
          + "ourcemanager.googleapis.com/Project\022:\n\013t"
          + "ime_series\030\002 \003(\0132 .google.monitoring.v3."
          + "TimeSeriesB\003\340A\002\"z\n\025CreateTimeSeriesError"
          + "\0229\n\013time_series\030\001 \001(\0132 .google.monitorin"
          + "g.v3.TimeSeriesB\002\030\001\022&\n\006status\030\002 \001(\0132\022.go"
          + "ogle.rpc.StatusB\002\030\001\"\330\001\n\027CreateTimeSeries"
          + "Summary\022\031\n\021total_point_count\030\001 \001(\005\022\033\n\023su"
          + "ccess_point_count\030\002 \001(\005\022C\n\006errors\030\003 \003(\0132"
          + "3.google.monitoring.v3.CreateTimeSeriesS"
          + "ummary.Error\032@\n\005Error\022\"\n\006status\030\001 \001(\0132\022."
          + "google.rpc.Status\022\023\n\013point_count\030\002 \001(\005\"f"
          + "\n\026QueryTimeSeriesRequest\022\021\n\004name\030\001 \001(\tB\003"
          + "\340A\002\022\022\n\005query\030\007 \001(\tB\003\340A\002\022\021\n\tpage_size\030\t \001"
          + "(\005\022\022\n\npage_token\030\n \001(\t\"\352\001\n\027QueryTimeSeri"
          + "esResponse\022J\n\026time_series_descriptor\030\010 \001"
          + "(\0132*.google.monitoring.v3.TimeSeriesDesc"
          + "riptor\022>\n\020time_series_data\030\t \003(\0132$.googl"
          + "e.monitoring.v3.TimeSeriesData\022\027\n\017next_p"
          + "age_token\030\n \001(\t\022*\n\016partial_errors\030\013 \003(\0132"
          + "\022.google.rpc.Status\"Y\n\016QueryErrorList\0220\n"
          + "\006errors\030\001 \003(\0132 .google.monitoring.v3.Que"
          + "ryError\022\025\n\rerror_summary\030\002 \001(\t2\274\017\n\rMetri"
          + "cService\022\344\001\n ListMonitoredResourceDescri"
          + "ptors\022=.google.monitoring.v3.ListMonitor"
          + "edResourceDescriptorsRequest\032>.google.mo"
          + "nitoring.v3.ListMonitoredResourceDescrip"
          + "torsResponse\"A\332A\004name\202\323\344\223\0024\0222/v3/{name=p"
          + "rojects/*}/monitoredResourceDescriptors\022"
          + "\314\001\n\036GetMonitoredResourceDescriptor\022;.goo"
          + "gle.monitoring.v3.GetMonitoredResourceDe"
          + "scriptorRequest\032\'.google.api.MonitoredRe"
          + "sourceDescriptor\"D\332A\004name\202\323\344\223\0027\0225/v3/{na"
          + "me=projects/*/monitoredResourceDescripto"
          + "rs/**}\022\270\001\n\025ListMetricDescriptors\0222.googl"
          + "e.monitoring.v3.ListMetricDescriptorsReq"
          + "uest\0323.google.monitoring.v3.ListMetricDe"
          + "scriptorsResponse\"6\332A\004name\202\323\344\223\002)\022\'/v3/{n"
          + "ame=projects/*}/metricDescriptors\022\240\001\n\023Ge"
          + "tMetricDescriptor\0220.google.monitoring.v3"
          + ".GetMetricDescriptorRequest\032\034.google.api"
          + ".MetricDescriptor\"9\332A\004name\202\323\344\223\002,\022*/v3/{n"
          + "ame=projects/*/metricDescriptors/**}\022\310\001\n"
          + "\026CreateMetricDescriptor\0223.google.monitor"
          + "ing.v3.CreateMetricDescriptorRequest\032\034.g"
          + "oogle.api.MetricDescriptor\"[\332A\026name,metr"
          + "ic_descriptor\202\323\344\223\002<\"\'/v3/{name=projects/"
          + "*}/metricDescriptors:\021metric_descriptor\022"
          + "\240\001\n\026DeleteMetricDescriptor\0223.google.moni"
          + "toring.v3.DeleteMetricDescriptorRequest\032"
          + "\026.google.protobuf.Empty\"9\332A\004name\202\323\344\223\002,**"
          + "/v3/{name=projects/*/metricDescriptors/*"
          + "*}\022\376\001\n\016ListTimeSeries\022+.google.monitorin"
          + "g.v3.ListTimeSeriesRequest\032,.google.moni"
          + "toring.v3.ListTimeSeriesResponse\"\220\001\332A\031na"
          + "me,filter,interval,view\202\323\344\223\002n\022 /v3/{name"
          + "=projects/*}/timeSeriesZ\'\022%/v3/{name=org"
          + "anizations/*}/timeSeriesZ!\022\037/v3/{name=fo"
          + "lders/*}/timeSeries\022\231\001\n\020CreateTimeSeries"
          + "\022-.google.monitoring.v3.CreateTimeSeries"
          + "Request\032\026.google.protobuf.Empty\">\332A\020name"
          + ",time_series\202\323\344\223\002%\" /v3/{name=projects/*"
          + "}/timeSeries:\001*\022\256\001\n\027CreateServiceTimeSer"
          + "ies\022-.google.monitoring.v3.CreateTimeSer"
          + "iesRequest\032\026.google.protobuf.Empty\"L\332A\020n"
          + "ame,time_series\202\323\344\223\0023\"./v3/{name=project"
          + "s/*}/timeSeries:createService:\001*\032\332\001\312A\031mo"
          + "nitoring.googleapis.com\322A\272\001https://www.g"
          + "oogleapis.com/auth/cloud-platform,https:"
          + "//www.googleapis.com/auth/monitoring,htt"
          + "ps://www.googleapis.com/auth/monitoring."
          + "read,https://www.googleapis.com/auth/mon"
          + "itoring.writeB\211\010\n\030com.google.monitoring."
          + "v3B\022MetricServiceProtoP\001ZAcloud.google.c"
          + "om/go/monitoring/apiv3/v2/monitoringpb;m"
          + "onitoringpb\252\002\032Google.Cloud.Monitoring.V3"
          + "\312\002\032Google\\Cloud\\Monitoring\\V3\352\002\035Google::"
          + "Cloud::Monitoring::V3\352A\360\001\n*monitoring.go"
          + "ogleapis.com/MetricDescriptor\022;projects/"
          + "{project}/metricDescriptors/{metric_desc"
          + "riptor=**}\022Eorganizations/{organization}"
          + "/metricDescriptors/{metric_descriptor=**"
          + "}\0229folders/{folder}/metricDescriptors/{m"
          + "etric_descriptor=**}\022\001* \001\352A\267\002\n5monitorin"
          + "g.googleapis.com/MonitoredResourceDescri"
          + "ptor\022Oprojects/{project}/monitoredResour"
          + "ceDescriptors/{monitored_resource_descri"
          + "ptor}\022Yorganizations/{organization}/moni"
          + "toredResourceDescriptors/{monitored_reso"
          + "urce_descriptor}\022Mfolders/{folder}/monit"
          + "oredResourceDescriptors/{monitored_resou"
          + "rce_descriptor}\022\001* \001\352AQ\n#monitoring.goog"
          + "leapis.com/Workspace\022\022projects/{project}"
          + "\022\026workspaces/{workspace}\352A\265\001\n$monitoring"
          + ".googleapis.com/TimeSeries\022+projects/{pr"
          + "oject}/timeSeries/{time_series}\0225organiz"
          + "ations/{organization}/timeSeries/{time_s"
          + "eries}\022)folders/{folder}/timeSeries/{tim"
          + "e_series}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MetricProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
              com.google.monitoring.v3.MetricProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "ResourceDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "MetricDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name", "MetricDescriptor",
            });
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "Filter",
              "Interval",
              "Aggregation",
              "SecondaryAggregation",
              "OrderBy",
              "View",
              "PageSize",
              "PageToken",
            });
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor,
            new java.lang.String[] {
              "TimeSeries", "NextPageToken", "ExecutionErrors", "Unit",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name", "TimeSeries",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor,
            new java.lang.String[] {
              "TimeSeries", "Status",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor,
            new java.lang.String[] {
              "TotalPointCount", "SuccessPointCount", "Errors",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor =
        internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor,
            new java.lang.String[] {
              "Status", "PointCount",
            });
    internal_static_google_monitoring_v3_QueryTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_monitoring_v3_QueryTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_QueryTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name", "Query", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_QueryTimeSeriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_monitoring_v3_QueryTimeSeriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_QueryTimeSeriesResponse_descriptor,
            new java.lang.String[] {
              "TimeSeriesDescriptor", "TimeSeriesData", "NextPageToken", "PartialErrors",
            });
    internal_static_google_monitoring_v3_QueryErrorList_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_monitoring_v3_QueryErrorList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_QueryErrorList_descriptor,
            new java.lang.String[] {
              "Errors", "ErrorSummary",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.MetricProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
