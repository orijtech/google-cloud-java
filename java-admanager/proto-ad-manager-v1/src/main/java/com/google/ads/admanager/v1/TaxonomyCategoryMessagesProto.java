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
// source: google/ads/admanager/v1/taxonomy_category_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class TaxonomyCategoryMessagesProto {
  private TaxonomyCategoryMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_TaxonomyCategory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_TaxonomyCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/admanager/v1/taxonomy_categ"
          + "ory_messages.proto\022\027google.ads.admanager"
          + ".v1\0320google/ads/admanager/v1/taxonomy_ty"
          + "pe_enum.proto\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\"\337\003\n\020Ta"
          + "xonomyCategory\022\021\n\004name\030\001 \001(\tB\003\340A\010\022!\n\024tax"
          + "onomy_category_id\030\002 \001(\003B\003\340A\003\022\031\n\014display_"
          + "name\030\003 \001(\tB\003\340A\003\022\032\n\rgrouping_only\030\005 \001(\010B\003"
          + "\340A\003\022(\n\033parent_taxonomy_category_id\030\006 \001(\003"
          + "B\003\340A\003\022R\n\rtaxonomy_type\030\t \001(\01626.google.ad"
          + "s.admanager.v1.TaxonomyTypeEnum.Taxonomy"
          + "TypeB\003\340A\003\022\033\n\016ancestor_names\030\007 \003(\tB\003\340A\003\022+"
          + "\n\036ancestor_taxonomy_category_ids\030\010 \003(\003B\003"
          + "\340A\003:\225\001\352A\221\001\n)admanager.googleapis.com/Tax"
          + "onomyCategory\022>networks/{network_code}/t"
          + "axonomyCategories/{taxonomy_category}*\022t"
          + "axonomyCategories2\020taxonomyCategoryB\321\001\n\033"
          + "com.google.ads.admanager.v1B\035TaxonomyCat"
          + "egoryMessagesProtoP\001Z@google.golang.org/"
          + "genproto/googleapis/ads/admanager/v1;adm"
          + "anager\252\002\027Google.Ads.AdManager.V1\312\002\027Googl"
          + "e\\Ads\\AdManager\\V1\352\002\032Google::Ads::AdMana"
          + "ger::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.TaxonomyTypeEnumProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_TaxonomyCategory_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_TaxonomyCategory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_TaxonomyCategory_descriptor,
            new java.lang.String[] {
              "Name",
              "TaxonomyCategoryId",
              "DisplayName",
              "GroupingOnly",
              "ParentTaxonomyCategoryId",
              "TaxonomyType",
              "AncestorNames",
              "AncestorTaxonomyCategoryIds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.TaxonomyTypeEnumProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
