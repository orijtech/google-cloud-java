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
// source: google/ads/admanager/v1/user_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class UserMessagesProto {
  private UserMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_User_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/admanager/v1/user_messages."
          + "proto\022\027google.ads.admanager.v1\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\"\337\002\n\004User\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\024"
          + "\n\007user_id\030\n \001(\003B\003\340A\003\022\031\n\014display_name\030\002 \001"
          + "(\tB\003\340A\002\022\022\n\005email\030\003 \001(\tB\003\340A\002\0223\n\004role\030\004 \001("
          + "\tB%\340A\002\372A\037\n\035admanager.googleapis.com/Role"
          + "\022\023\n\006active\030\006 \001(\010B\003\340A\003\022\030\n\013external_id\030\007 \001"
          + "(\tB\003\340A\001\022\034\n\017service_account\030\010 \001(\010B\003\340A\003\022&\n"
          + "\031orders_ui_local_time_zone\030\t \001(\tB\003\340A\001:U\352"
          + "AR\n\035admanager.googleapis.com/User\022$netwo"
          + "rks/{network_code}/users/{user}*\005users2\004"
          + "userB\305\001\n\033com.google.ads.admanager.v1B\021Us"
          + "erMessagesProtoP\001Z@google.golang.org/gen"
          + "proto/googleapis/ads/admanager/v1;admana"
          + "ger\252\002\027Google.Ads.AdManager.V1\312\002\027Google\\A"
          + "ds\\AdManager\\V1\352\002\032Google::Ads::AdManager"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_User_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_User_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_User_descriptor,
            new java.lang.String[] {
              "Name",
              "UserId",
              "DisplayName",
              "Email",
              "Role",
              "Active",
              "ExternalId",
              "ServiceAccount",
              "OrdersUiLocalTimeZone",
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
