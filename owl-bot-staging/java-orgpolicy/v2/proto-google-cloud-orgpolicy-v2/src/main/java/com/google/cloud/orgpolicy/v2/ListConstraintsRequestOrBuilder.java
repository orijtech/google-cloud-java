// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

public interface ListConstraintsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v2.ListConstraintsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Cloud resource that parents the constraint. Must be in one of the
   * following forms:
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The Cloud resource that parents the constraint. Must be in one of the
   * following forms:
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Size of the pages to be returned. This is currently unsupported and will
   * be ignored. The server may at any point start using this field to limit
   * page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Page token used to retrieve the next page. This is currently unsupported
   * and will be ignored. The server may at any point start using this field.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Page token used to retrieve the next page. This is currently unsupported
   * and will be ignored. The server may at any point start using this field.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}