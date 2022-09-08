// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1/budget_service.proto

package com.google.cloud.billing.budgets.v1;

public interface ListBudgetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1.ListBudgetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of billing account to list budgets under. Values
   * are of the form `billingAccounts/{billingAccountId}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Name of billing account to list budgets under. Values
   * are of the form `billingAccounts/{billingAccountId}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The maximum number of budgets to return per page.
   * The default and maximum value are 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The value returned by the last `ListBudgetsResponse` which
   * indicates that this is a continuation of a prior `ListBudgets` call,
   * and that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The value returned by the last `ListBudgetsResponse` which
   * indicates that this is a continuation of a prior `ListBudgets` call,
   * and that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}