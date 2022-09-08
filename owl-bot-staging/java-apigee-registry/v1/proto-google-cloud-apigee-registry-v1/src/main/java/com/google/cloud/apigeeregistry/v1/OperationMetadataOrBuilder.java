// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/provisioning_service.proto

package com.google.cloud.apigeeregistry.v1;

public interface OperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   * @return The verb.
   */
  java.lang.String getVerb();
  /**
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   * @return The bytes for verb.
   */
  com.google.protobuf.ByteString
      getVerbBytes();

  /**
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_message = 5;</code>
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_message = 5;</code>
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();

  /**
   * <pre>
   * Identifies whether the user has requested cancellation
   * of the operation. Operations that have successfully been cancelled
   * have [Operation.error][] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1,
   * corresponding to `Code.CANCELLED`.
   * </pre>
   *
   * <code>bool cancellation_requested = 6;</code>
   * @return The cancellationRequested.
   */
  boolean getCancellationRequested();

  /**
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   * @return The apiVersion.
   */
  java.lang.String getApiVersion();
  /**
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   * @return The bytes for apiVersion.
   */
  com.google.protobuf.ByteString
      getApiVersionBytes();
}