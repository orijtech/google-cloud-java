// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

package com.google.cloud.vision.v1p4beta1;

public interface ProductSetPurgeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.ProductSetPurgeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ProductSet that contains the Products to delete. If a Product is a
   * member of product_set_id in addition to other ProductSets, the Product will
   * still be deleted.
   * </pre>
   *
   * <code>string product_set_id = 1;</code>
   * @return The productSetId.
   */
  java.lang.String getProductSetId();
  /**
   * <pre>
   * The ProductSet that contains the Products to delete. If a Product is a
   * member of product_set_id in addition to other ProductSets, the Product will
   * still be deleted.
   * </pre>
   *
   * <code>string product_set_id = 1;</code>
   * @return The bytes for productSetId.
   */
  com.google.protobuf.ByteString
      getProductSetIdBytes();
}