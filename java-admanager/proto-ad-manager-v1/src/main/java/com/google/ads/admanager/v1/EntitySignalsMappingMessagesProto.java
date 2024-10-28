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
// source: google/ads/admanager/v1/entity_signals_mapping_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class EntitySignalsMappingMessagesProto {
  private EntitySignalsMappingMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_EntitySignalsMapping_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_EntitySignalsMapping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/admanager/v1/entity_signals"
          + "_mapping_messages.proto\022\027google.ads.adma"
          + "nager.v1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\"\213\003\n\024EntityS"
          + "ignalsMapping\022\035\n\023audience_segment_id\030\003 \001"
          + "(\003H\000\022\033\n\021content_bundle_id\030\004 \001(\003H\000\022#\n\031cus"
          + "tom_targeting_value_id\030\005 \001(\003H\000\022\021\n\004name\030\001"
          + " \001(\tB\003\340A\010\022&\n\031entity_signals_mapping_id\030\002"
          + " \001(\003B\003\340A\003\022\"\n\025taxonomy_category_ids\030\006 \003(\003"
          + "B\003\340A\002:\250\001\352A\244\001\n-admanager.googleapis.com/E"
          + "ntitySignalsMapping\022Fnetworks/{network_c"
          + "ode}/entitySignalsMappings/{entity_signa"
          + "ls_mapping}*\025entitySignalsMappings2\024enti"
          + "tySignalsMappingB\010\n\006entityB\325\001\n\033com.googl"
          + "e.ads.admanager.v1B!EntitySignalsMapping"
          + "MessagesProtoP\001Z@google.golang.org/genpr"
          + "oto/googleapis/ads/admanager/v1;admanage"
          + "r\252\002\027Google.Ads.AdManager.V1\312\002\027Google\\Ads"
          + "\\AdManager\\V1\352\002\032Google::Ads::AdManager::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_EntitySignalsMapping_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_EntitySignalsMapping_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_EntitySignalsMapping_descriptor,
            new java.lang.String[] {
              "AudienceSegmentId",
              "ContentBundleId",
              "CustomTargetingValueId",
              "Name",
              "EntitySignalsMappingId",
              "TaxonomyCategoryIds",
              "Entity",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
