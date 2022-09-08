// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface ExportAssetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.ExportAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   * <pre>
   * Output configuration indicating where the results were output to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.OutputConfig output_config = 2;</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Output configuration indicating where the results were output to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.OutputConfig output_config = 2;</code>
   * @return The outputConfig.
   */
  com.google.cloud.asset.v1.OutputConfig getOutputConfig();
  /**
   * <pre>
   * Output configuration indicating where the results were output to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.OutputConfig output_config = 2;</code>
   */
  com.google.cloud.asset.v1.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * Output result indicating where the assets were exported to. For example, a
   * set of actual Google Cloud Storage object uris where the assets are
   * exported to. The uris can be different from what [output_config] has
   * specified, as the service will split the output object into multiple ones
   * once it exceeds a single Google Cloud Storage object limit.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.OutputResult output_result = 3;</code>
   * @return Whether the outputResult field is set.
   */
  boolean hasOutputResult();
  /**
   * <pre>
   * Output result indicating where the assets were exported to. For example, a
   * set of actual Google Cloud Storage object uris where the assets are
   * exported to. The uris can be different from what [output_config] has
   * specified, as the service will split the output object into multiple ones
   * once it exceeds a single Google Cloud Storage object limit.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.OutputResult output_result = 3;</code>
   * @return The outputResult.
   */
  com.google.cloud.asset.v1.OutputResult getOutputResult();
  /**
   * <pre>
   * Output result indicating where the assets were exported to. For example, a
   * set of actual Google Cloud Storage object uris where the assets are
   * exported to. The uris can be different from what [output_config] has
   * specified, as the service will split the output object into multiple ones
   * once it exceeds a single Google Cloud Storage object limit.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.OutputResult output_result = 3;</code>
   */
  com.google.cloud.asset.v1.OutputResultOrBuilder getOutputResultOrBuilder();
}