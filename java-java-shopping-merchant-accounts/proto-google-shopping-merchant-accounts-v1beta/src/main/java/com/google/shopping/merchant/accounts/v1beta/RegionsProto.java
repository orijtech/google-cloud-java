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
// source: google/shopping/merchant/accounts/v1beta/regions.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

public final class RegionsProto {
  private RegionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_GetRegionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_GetRegionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_CreateRegionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_CreateRegionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_UpdateRegionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_UpdateRegionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_DeleteRegionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_DeleteRegionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_Region_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_Region_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_PostalCodeRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_PostalCodeRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_Region_GeoTargetArea_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_Region_GeoTargetArea_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/shopping/merchant/accounts/v1be"
          + "ta/regions.proto\022(google.shopping.mercha"
          + "nt.accounts.v1beta\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\032\033google/protobuf/empty.pro"
          + "to\032 google/protobuf/field_mask.proto\032\036go"
          + "ogle/protobuf/wrappers.proto\"K\n\020GetRegio"
          + "nRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!merchant"
          + "api.googleapis.com/Region\"\260\001\n\023CreateRegi"
          + "onRequest\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$\n\"merch"
          + "antapi.googleapis.com/Account\022\026\n\tregion_"
          + "id\030\002 \001(\tB\003\340A\002\022E\n\006region\030\003 \001(\01320.google.s"
          + "hopping.merchant.accounts.v1beta.RegionB"
          + "\003\340A\002\"\222\001\n\023UpdateRegionRequest\022E\n\006region\030\001"
          + " \001(\01320.google.shopping.merchant.accounts"
          + ".v1beta.RegionB\003\340A\002\0224\n\013update_mask\030\002 \001(\013"
          + "2\032.google.protobuf.FieldMaskB\003\340A\001\"N\n\023Del"
          + "eteRegionRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!"
          + "merchantapi.googleapis.com/Region\"\201\001\n\022Li"
          + "stRegionsRequest\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$"
          + "\n\"merchantapi.googleapis.com/Account\022\026\n\t"
          + "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t"
          + "B\003\340A\001\"q\n\023ListRegionsResponse\022A\n\007regions\030"
          + "\001 \003(\01320.google.shopping.merchant.account"
          + "s.v1beta.Region\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"\361\005\n\006Region\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\036\n\014displa"
          + "y_name\030\002 \001(\tB\003\340A\001H\000\210\001\001\022^\n\020postal_code_ar"
          + "ea\030\003 \001(\0132?.google.shopping.merchant.acco"
          + "unts.v1beta.Region.PostalCodeAreaB\003\340A\001\022["
          + "\n\016geotarget_area\030\004 \001(\0132>.google.shopping"
          + ".merchant.accounts.v1beta.Region.GeoTarg"
          + "etAreaB\003\340A\001\022D\n\033regional_inventory_eligib"
          + "le\030\005 \001(\0132\032.google.protobuf.BoolValueB\003\340A"
          + "\003\022:\n\021shipping_eligible\030\006 \001(\0132\032.google.pr"
          + "otobuf.BoolValueB\003\340A\003\032\317\001\n\016PostalCodeArea"
          + "\022\030\n\013region_code\030\001 \001(\tB\003\340A\002\022j\n\014postal_cod"
          + "es\030\002 \003(\0132O.google.shopping.merchant.acco"
          + "unts.v1beta.Region.PostalCodeArea.Postal"
          + "CodeRangeB\003\340A\002\0327\n\017PostalCodeRange\022\022\n\005beg"
          + "in\030\001 \001(\tB\003\340A\002\022\020\n\003end\030\002 \001(\tB\003\340A\001\0324\n\rGeoTa"
          + "rgetArea\022#\n\026geotarget_criteria_ids\030\001 \003(\003"
          + "B\003\340A\002:\\\352AY\n!merchantapi.googleapis.com/R"
          + "egion\022#accounts/{account}/regions/{regio"
          + "n}*\007regions2\006regionB\017\n\r_display_name2\271\010\n"
          + "\016RegionsService\022\266\001\n\tGetRegion\022:.google.s"
          + "hopping.merchant.accounts.v1beta.GetRegi"
          + "onRequest\0320.google.shopping.merchant.acc"
          + "ounts.v1beta.Region\";\332A\004name\202\323\344\223\002.\022,/acc"
          + "ounts/v1beta/{name=accounts/*/regions/*}"
          + "\022\327\001\n\014CreateRegion\022=.google.shopping.merc"
          + "hant.accounts.v1beta.CreateRegionRequest"
          + "\0320.google.shopping.merchant.accounts.v1b"
          + "eta.Region\"V\332A\027parent,region,region_id\202\323"
          + "\344\223\0026\",/accounts/v1beta/{parent=accounts/"
          + "*}/regions:\006region\022\331\001\n\014UpdateRegion\022=.go"
          + "ogle.shopping.merchant.accounts.v1beta.U"
          + "pdateRegionRequest\0320.google.shopping.mer"
          + "chant.accounts.v1beta.Region\"X\332A\022region,"
          + "update_mask\202\323\344\223\002=23/accounts/v1beta/{reg"
          + "ion.name=accounts/*/regions/*}:\006region\022\242"
          + "\001\n\014DeleteRegion\022=.google.shopping.mercha"
          + "nt.accounts.v1beta.DeleteRegionRequest\032\026"
          + ".google.protobuf.Empty\";\332A\004name\202\323\344\223\002.*,/"
          + "accounts/v1beta/{name=accounts/*/regions"
          + "/*}\022\311\001\n\013ListRegions\022<.google.shopping.me"
          + "rchant.accounts.v1beta.ListRegionsReques"
          + "t\032=.google.shopping.merchant.accounts.v1"
          + "beta.ListRegionsResponse\"=\332A\006parent\202\323\344\223\002"
          + ".\022,/accounts/v1beta/{parent=accounts/*}/"
          + "regions\032G\312A\032merchantapi.googleapis.com\322A"
          + "\'https://www.googleapis.com/auth/content"
          + "B\216\001\n,com.google.shopping.merchant.accoun"
          + "ts.v1betaB\014RegionsProtoP\001ZNcloud.google."
          + "com/go/shopping/merchant/accounts/apiv1b"
          + "eta/accountspb;accountspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_accounts_v1beta_GetRegionRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_accounts_v1beta_GetRegionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_GetRegionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_CreateRegionRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_accounts_v1beta_CreateRegionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_CreateRegionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RegionId", "Region",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_UpdateRegionRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_merchant_accounts_v1beta_UpdateRegionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_UpdateRegionRequest_descriptor,
            new java.lang.String[] {
              "Region", "UpdateMask",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_DeleteRegionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_merchant_accounts_v1beta_DeleteRegionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_DeleteRegionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_ListRegionsResponse_descriptor,
            new java.lang.String[] {
              "Regions", "NextPageToken",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_Region_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_shopping_merchant_accounts_v1beta_Region_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_Region_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "PostalCodeArea",
              "GeotargetArea",
              "RegionalInventoryEligible",
              "ShippingEligible",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_descriptor =
        internal_static_google_shopping_merchant_accounts_v1beta_Region_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_descriptor,
            new java.lang.String[] {
              "RegionCode", "PostalCodes",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_PostalCodeRange_descriptor =
        internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_PostalCodeRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_Region_PostalCodeArea_PostalCodeRange_descriptor,
            new java.lang.String[] {
              "Begin", "End",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_Region_GeoTargetArea_descriptor =
        internal_static_google_shopping_merchant_accounts_v1beta_Region_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_shopping_merchant_accounts_v1beta_Region_GeoTargetArea_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_Region_GeoTargetArea_descriptor,
            new java.lang.String[] {
              "GeotargetCriteriaIds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
