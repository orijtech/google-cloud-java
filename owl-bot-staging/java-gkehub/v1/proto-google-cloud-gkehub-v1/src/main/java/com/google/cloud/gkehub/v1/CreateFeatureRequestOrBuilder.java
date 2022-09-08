// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/service.proto

package com.google.cloud.gkehub.v1;

public interface CreateFeatureRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1.CreateFeatureRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent (project and location) where the Feature will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent (project and location) where the Feature will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The ID of the feature to create.
   * </pre>
   *
   * <code>string feature_id = 2;</code>
   * @return The featureId.
   */
  java.lang.String getFeatureId();
  /**
   * <pre>
   * The ID of the feature to create.
   * </pre>
   *
   * <code>string feature_id = 2;</code>
   * @return The bytes for featureId.
   */
  com.google.protobuf.ByteString
      getFeatureIdBytes();

  /**
   * <pre>
   * The Feature resource to create.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.Feature resource = 3;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * The Feature resource to create.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.Feature resource = 3;</code>
   * @return The resource.
   */
  com.google.cloud.gkehub.v1.Feature getResource();
  /**
   * <pre>
   * The Feature resource to create.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.Feature resource = 3;</code>
   */
  com.google.cloud.gkehub.v1.FeatureOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}