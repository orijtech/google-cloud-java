// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/user_event.proto

package com.google.cloud.retail.v2beta;

public final class UserEventProto {
  private UserEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_UserEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_UserEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_UserEvent_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_UserEvent_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ProductDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ProductDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_CompletionDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompletionDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_PurchaseTransaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PurchaseTransaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/retail/v2beta/user_event." +
      "proto\022\032google.cloud.retail.v2beta\032\037googl" +
      "e/api/field_behavior.proto\032\'google/cloud" +
      "/retail/v2beta/common.proto\032(google/clou" +
      "d/retail/v2beta/product.proto\032\037google/pr" +
      "otobuf/timestamp.proto\032\036google/protobuf/" +
      "wrappers.proto\"\237\006\n\tUserEvent\022\027\n\nevent_ty" +
      "pe\030\001 \001(\tB\003\340A\002\022\027\n\nvisitor_id\030\002 \001(\tB\003\340A\002\022\022" +
      "\n\nsession_id\030\025 \001(\t\022.\n\nevent_time\030\003 \001(\0132\032" +
      ".google.protobuf.Timestamp\022\026\n\016experiment" +
      "_ids\030\004 \003(\t\022\031\n\021attribution_token\030\005 \001(\t\022B\n" +
      "\017product_details\030\006 \003(\0132).google.cloud.re" +
      "tail.v2beta.ProductDetail\022G\n\021completion_" +
      "detail\030\026 \001(\0132,.google.cloud.retail.v2bet" +
      "a.CompletionDetail\022I\n\nattributes\030\007 \003(\01325" +
      ".google.cloud.retail.v2beta.UserEvent.At" +
      "tributesEntry\022\017\n\007cart_id\030\010 \001(\t\022M\n\024purcha" +
      "se_transaction\030\t \001(\0132/.google.cloud.reta" +
      "il.v2beta.PurchaseTransaction\022\024\n\014search_" +
      "query\030\n \001(\t\022\016\n\006filter\030\020 \001(\t\022\020\n\010order_by\030" +
      "\021 \001(\t\022\016\n\006offset\030\022 \001(\005\022\027\n\017page_categories" +
      "\030\013 \003(\t\0227\n\tuser_info\030\014 \001(\0132$.google.cloud" +
      ".retail.v2beta.UserInfo\022\013\n\003uri\030\r \001(\t\022\024\n\014" +
      "referrer_uri\030\016 \001(\t\022\024\n\014page_view_id\030\017 \001(\t" +
      "\032^\n\017AttributesEntry\022\013\n\003key\030\001 \001(\t\022:\n\005valu" +
      "e\030\002 \001(\0132+.google.cloud.retail.v2beta.Cus" +
      "tomAttribute:\0028\001\"y\n\rProductDetail\0229\n\007pro" +
      "duct\030\001 \001(\0132#.google.cloud.retail.v2beta." +
      "ProductB\003\340A\002\022-\n\010quantity\030\002 \001(\0132\033.google." +
      "protobuf.Int32Value\"p\n\020CompletionDetail\022" +
      "$\n\034completion_attribution_token\030\001 \001(\t\022\033\n" +
      "\023selected_suggestion\030\002 \001(\t\022\031\n\021selected_p" +
      "osition\030\003 \001(\005\"n\n\023PurchaseTransaction\022\n\n\002" +
      "id\030\001 \001(\t\022\024\n\007revenue\030\002 \001(\002B\003\340A\002\022\013\n\003tax\030\003 " +
      "\001(\002\022\014\n\004cost\030\004 \001(\002\022\032\n\rcurrency_code\030\005 \001(\t" +
      "B\003\340A\002B\327\001\n\036com.google.cloud.retail.v2beta" +
      "B\016UserEventProtoP\001Z@google.golang.org/ge" +
      "nproto/googleapis/cloud/retail/v2beta;re" +
      "tail\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Be" +
      "ta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Google" +
      "::Cloud::Retail::V2betab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.retail.v2beta.CommonProto.getDescriptor(),
          com.google.cloud.retail.v2beta.ProductProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2beta_UserEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_UserEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_UserEvent_descriptor,
        new java.lang.String[] { "EventType", "VisitorId", "SessionId", "EventTime", "ExperimentIds", "AttributionToken", "ProductDetails", "CompletionDetail", "Attributes", "CartId", "PurchaseTransaction", "SearchQuery", "Filter", "OrderBy", "Offset", "PageCategories", "UserInfo", "Uri", "ReferrerUri", "PageViewId", });
    internal_static_google_cloud_retail_v2beta_UserEvent_AttributesEntry_descriptor =
      internal_static_google_cloud_retail_v2beta_UserEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_UserEvent_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_UserEvent_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_retail_v2beta_ProductDetail_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_ProductDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ProductDetail_descriptor,
        new java.lang.String[] { "Product", "Quantity", });
    internal_static_google_cloud_retail_v2beta_CompletionDetail_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_CompletionDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_CompletionDetail_descriptor,
        new java.lang.String[] { "CompletionAttributionToken", "SelectedSuggestion", "SelectedPosition", });
    internal_static_google_cloud_retail_v2beta_PurchaseTransaction_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_PurchaseTransaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_PurchaseTransaction_descriptor,
        new java.lang.String[] { "Id", "Revenue", "Tax", "Cost", "CurrencyCode", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.retail.v2beta.CommonProto.getDescriptor();
    com.google.cloud.retail.v2beta.ProductProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}