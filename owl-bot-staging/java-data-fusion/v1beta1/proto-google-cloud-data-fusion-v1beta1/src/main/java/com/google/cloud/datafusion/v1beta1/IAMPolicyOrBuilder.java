// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

package com.google.cloud.datafusion.v1beta1;

public interface IAMPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.IAMPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Policy definition if IAM policy fetching is successful,
   * otherwise empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   * <pre>
   * Policy definition if IAM policy fetching is successful,
   * otherwise empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   * @return The policy.
   */
  com.google.iam.v1.Policy getPolicy();
  /**
   * <pre>
   * Policy definition if IAM policy fetching is successful,
   * otherwise empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder();

  /**
   * <pre>
   * Status of iam policy fetching.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Status of iam policy fetching.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * Status of iam policy fetching.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();
}