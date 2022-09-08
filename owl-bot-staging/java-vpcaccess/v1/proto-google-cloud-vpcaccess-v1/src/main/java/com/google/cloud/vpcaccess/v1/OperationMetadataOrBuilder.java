// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vpcaccess/v1/vpc_access.proto

package com.google.cloud.vpcaccess.v1;

public interface OperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vpcaccess.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Method that initiated the operation e.g.
   * google.cloud.vpcaccess.v1.Connectors.CreateConnector.
   * </pre>
   *
   * <code>string method = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <pre>
   * Output only. Method that initiated the operation e.g.
   * google.cloud.vpcaccess.v1.Connectors.CreateConnector.
   * </pre>
   *
   * <code>string method = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the operation completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. Time when the operation completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. Time when the operation completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. Name of the resource that this operation is acting on e.g.
   * projects/my-project/locations/us-central1/connectors/v1.
   * </pre>
   *
   * <code>string target = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * Output only. Name of the resource that this operation is acting on e.g.
   * projects/my-project/locations/us-central1/connectors/v1.
   * </pre>
   *
   * <code>string target = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();
}