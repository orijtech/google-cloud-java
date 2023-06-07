/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datacatalog/v1/tags.proto

package com.google.cloud.datacatalog.v1;

public final class Tags {
  private Tags() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Tag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagTemplateField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_FieldType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_FieldType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/datacatalog/v1/tags.proto"
          + "\022\033google.cloud.datacatalog.v1\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032\037google/protobuf/timestamp.pro"
          + "to\"\211\003\n\003Tag\022\014\n\004name\030\001 \001(\t\022\026\n\010template\030\002 \001"
          + "(\tB\004\342A\001\002\022#\n\025template_display_name\030\005 \001(\tB"
          + "\004\342A\001\003\022\020\n\006column\030\004 \001(\tH\000\022B\n\006fields\030\003 \003(\0132"
          + ",.google.cloud.datacatalog.v1.Tag.Fields"
          + "EntryB\004\342A\001\002\032T\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "4\n\005value\030\002 \001(\0132%.google.cloud.datacatalo"
          + "g.v1.TagField:\0028\001:\201\001\352A~\n\036datacatalog.goo"
          + "gleapis.com/Tag\022\\projects/{project}/loca"
          + "tions/{location}/entryGroups/{entry_grou"
          + "p}/entries/{entry}/tags/{tag}B\007\n\005scope\"\304"
          + "\002\n\010TagField\022\032\n\014display_name\030\001 \001(\tB\004\342A\001\003\022"
          + "\026\n\014double_value\030\002 \001(\001H\000\022\026\n\014string_value\030"
          + "\003 \001(\tH\000\022\024\n\nbool_value\030\004 \001(\010H\000\0225\n\017timesta"
          + "mp_value\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mpH\000\022E\n\nenum_value\030\006 \001(\0132/.google.cloud."
          + "datacatalog.v1.TagField.EnumValueH\000\022\030\n\016r"
          + "ichtext_value\030\010 \001(\tH\000\022\023\n\005order\030\007 \001(\005B\004\342A"
          + "\001\003\032!\n\tEnumValue\022\024\n\014display_name\030\001 \001(\tB\006\n"
          + "\004kind\"\353\002\n\013TagTemplate\022\014\n\004name\030\001 \001(\t\022\024\n\014d"
          + "isplay_name\030\002 \001(\t\022\034\n\024is_publicly_readabl"
          + "e\030\005 \001(\010\022J\n\006fields\030\003 \003(\01324.google.cloud.d"
          + "atacatalog.v1.TagTemplate.FieldsEntryB\004\342"
          + "A\001\002\032\\\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\022<\n\005value"
          + "\030\002 \001(\0132-.google.cloud.datacatalog.v1.Tag"
          + "TemplateField:\0028\001:p\352Am\n&datacatalog.goog"
          + "leapis.com/TagTemplate\022Cprojects/{projec"
          + "t}/locations/{location}/tagTemplates/{ta"
          + "g_template}\"\271\002\n\020TagTemplateField\022\022\n\004name"
          + "\030\006 \001(\tB\004\342A\001\003\022\024\n\014display_name\030\001 \001(\t\022:\n\004ty"
          + "pe\030\002 \001(\0132&.google.cloud.datacatalog.v1.F"
          + "ieldTypeB\004\342A\001\002\022\023\n\013is_required\030\003 \001(\010\022\023\n\013d"
          + "escription\030\004 \001(\t\022\r\n\005order\030\005 \001(\005:\205\001\352A\201\001\n+"
          + "datacatalog.googleapis.com/TagTemplateFi"
          + "eld\022Rprojects/{project}/locations/{locat"
          + "ion}/tagTemplates/{tag_template}/fields/"
          + "{field}\"\247\003\n\tFieldType\022N\n\016primitive_type\030"
          + "\001 \001(\01624.google.cloud.datacatalog.v1.Fiel"
          + "dType.PrimitiveTypeH\000\022D\n\tenum_type\030\002 \001(\013"
          + "2/.google.cloud.datacatalog.v1.FieldType"
          + ".EnumTypeH\000\032\206\001\n\010EnumType\022Q\n\016allowed_valu"
          + "es\030\001 \003(\01329.google.cloud.datacatalog.v1.F"
          + "ieldType.EnumType.EnumValue\032\'\n\tEnumValue"
          + "\022\032\n\014display_name\030\001 \001(\tB\004\342A\001\002\"n\n\rPrimitiv"
          + "eType\022\036\n\032PRIMITIVE_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006DOUBLE\020\001\022\n\n\006STRING\020\002\022\010\n\004BOOL\020\003\022\r\n\tTIMES"
          + "TAMP\020\004\022\014\n\010RICHTEXT\020\005B\013\n\ttype_declB\306\001\n\037co"
          + "m.google.cloud.datacatalog.v1P\001ZAcloud.g"
          + "oogle.com/go/datacatalog/apiv1/datacatal"
          + "ogpb;datacatalogpb\370\001\001\252\002\033Google.Cloud.Dat"
          + "aCatalog.V1\312\002\033Google\\Cloud\\DataCatalog\\V"
          + "1\352\002\036Google::Cloud::DataCatalog::V1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_Tag_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Tag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Tag_descriptor,
            new java.lang.String[] {
              "Name", "Template", "TemplateDisplayName", "Column", "Fields", "Scope",
            });
    internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_descriptor =
        internal_static_google_cloud_datacatalog_v1_Tag_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datacatalog_v1_TagField_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_TagField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagField_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "DoubleValue",
              "StringValue",
              "BoolValue",
              "TimestampValue",
              "EnumValue",
              "RichtextValue",
              "Order",
              "Kind",
            });
    internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_descriptor =
        internal_static_google_cloud_datacatalog_v1_TagField_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_descriptor,
            new java.lang.String[] {
              "DisplayName",
            });
    internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_TagTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "IsPubliclyReadable", "Fields",
            });
    internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_descriptor =
        internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_TagTemplateField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Type", "IsRequired", "Description", "Order",
            });
    internal_static_google_cloud_datacatalog_v1_FieldType_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1_FieldType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_FieldType_descriptor,
            new java.lang.String[] {
              "PrimitiveType", "EnumType", "TypeDecl",
            });
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor =
        internal_static_google_cloud_datacatalog_v1_FieldType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor,
            new java.lang.String[] {
              "AllowedValues",
            });
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_descriptor =
        internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_descriptor,
            new java.lang.String[] {
              "DisplayName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
