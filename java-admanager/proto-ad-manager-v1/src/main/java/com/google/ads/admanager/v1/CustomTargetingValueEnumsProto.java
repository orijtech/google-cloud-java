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
// source: google/ads/admanager/v1/custom_targeting_value_enums.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class CustomTargetingValueEnumsProto {
  private CustomTargetingValueEnumsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_CustomTargetingValueStatusEnum_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_CustomTargetingValueStatusEnum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_CustomTargetingValueMatchTypeEnum_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_CustomTargetingValueMatchTypeEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/admanager/v1/custom_targeti"
          + "ng_value_enums.proto\022\027google.ads.admanag"
          + "er.v1\"\207\001\n\036CustomTargetingValueStatusEnum"
          + "\"e\n\032CustomTargetingValueStatus\022-\n)CUSTOM"
          + "_TARGETING_VALUE_STATUS_UNSPECIFIED\020\000\022\n\n"
          + "\006ACTIVE\020\001\022\014\n\010INACTIVE\020\002\"\306\001\n!CustomTarget"
          + "ingValueMatchTypeEnum\"\240\001\n\035CustomTargetin"
          + "gValueMatchType\0221\n-CUSTOM_TARGETING_VALU"
          + "E_MATCH_TYPE_UNSPECIFIED\020\000\022\t\n\005EXACT\020\001\022\t\n"
          + "\005BROAD\020\002\022\n\n\006PREFIX\020\003\022\020\n\014BROAD_PREFIX\020\004\022\n"
          + "\n\006SUFFIX\020\005\022\014\n\010CONTAINS\020\006B\322\001\n\033com.google."
          + "ads.admanager.v1B\036CustomTargetingValueEn"
          + "umsProtoP\001Z@google.golang.org/genproto/g"
          + "oogleapis/ads/admanager/v1;admanager\252\002\027G"
          + "oogle.Ads.AdManager.V1\312\002\027Google\\Ads\\AdMa"
          + "nager\\V1\352\002\032Google::Ads::AdManager::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_ads_admanager_v1_CustomTargetingValueStatusEnum_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_CustomTargetingValueStatusEnum_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_CustomTargetingValueStatusEnum_descriptor,
            new java.lang.String[] {});
    internal_static_google_ads_admanager_v1_CustomTargetingValueMatchTypeEnum_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_CustomTargetingValueMatchTypeEnum_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_CustomTargetingValueMatchTypeEnum_descriptor,
            new java.lang.String[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
