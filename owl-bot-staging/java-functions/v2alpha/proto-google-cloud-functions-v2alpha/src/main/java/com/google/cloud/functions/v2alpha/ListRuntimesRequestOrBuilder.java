// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2alpha/functions.proto

package com.google.cloud.functions.v2alpha;

public interface ListRuntimesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2alpha.ListRuntimesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location from which the runtimes should be listed,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location from which the runtimes should be listed,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The filter for Runtimes that match the filter expression,
   * following the syntax outlined in https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The filter for Runtimes that match the filter expression,
   * following the syntax outlined in https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}