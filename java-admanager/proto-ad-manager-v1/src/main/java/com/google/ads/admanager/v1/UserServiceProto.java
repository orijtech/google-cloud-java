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
// source: google/ads/admanager/v1/user_service.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class UserServiceProto {
  private UserServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_GetUserRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetUserRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/ads/admanager/v1/user_service.p"
          + "roto\022\027google.ads.admanager.v1\032+google/ad"
          + "s/admanager/v1/user_messages.proto\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\"E\n\016GetUser"
          + "Request\0223\n\004name\030\001 \001(\tB%\340A\002\372A\037\n\035admanager"
          + ".googleapis.com/User2\253\001\n\013UserService\022\177\n\007"
          + "GetUser\022\'.google.ads.admanager.v1.GetUse"
          + "rRequest\032\035.google.ads.admanager.v1.User\""
          + ",\332A\004name\202\323\344\223\002\037\022\035/v1/{name=networks/*/use"
          + "rs/*}\032\033\312A\030admanager.googleapis.comB\304\001\n\033c"
          + "om.google.ads.admanager.v1B\020UserServiceP"
          + "rotoP\001Z@google.golang.org/genproto/googl"
          + "eapis/ads/admanager/v1;admanager\252\002\027Googl"
          + "e.Ads.AdManager.V1\312\002\027Google\\Ads\\AdManage"
          + "r\\V1\352\002\032Google::Ads::AdManager::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.UserMessagesProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_GetUserRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_GetUserRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_GetUserRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.UserMessagesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
