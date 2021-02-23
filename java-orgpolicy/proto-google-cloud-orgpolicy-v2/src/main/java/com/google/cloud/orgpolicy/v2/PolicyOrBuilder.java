/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

public interface PolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v2.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the Policy. Must be one of the following
   * forms, where constraint_name is the name of the constraint which this
   * Policy configures:
   * * `projects/{project_number}/policies/{constraint_name}`
   * * `folders/{folder_id}/policies/{constraint_name}`
   * * `organizations/{organization_id}/policies/{constraint_name}`
   * For example, "projects/123/policies/compute.disableSerialPortAccess".
   * Note: `projects/{project_id}/policies/{constraint_name}` is also an
   * acceptable name for API requests, but responses will return the name using
   * the equivalent project number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the Policy. Must be one of the following
   * forms, where constraint_name is the name of the constraint which this
   * Policy configures:
   * * `projects/{project_number}/policies/{constraint_name}`
   * * `folders/{folder_id}/policies/{constraint_name}`
   * * `organizations/{organization_id}/policies/{constraint_name}`
   * For example, "projects/123/policies/compute.disableSerialPortAccess".
   * Note: `projects/{project_id}/policies/{constraint_name}` is also an
   * acceptable name for API requests, but responses will return the name using
   * the equivalent project number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Basic information about the Organization Policy.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   *
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   *
   *
   * <pre>
   * Basic information about the Organization Policy.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   *
   * @return The spec.
   */
  com.google.cloud.orgpolicy.v2.PolicySpec getSpec();
  /**
   *
   *
   * <pre>
   * Basic information about the Organization Policy.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   */
  com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder getSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * An alternate policy configuration that will be used instead of the baseline
   * policy configurations as determined by the launch.
   * Currently the only way the launch can trigger the alternate configuration
   * is via dry-run/darklaunch.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.AlternatePolicySpec alternate = 3;</code>
   *
   * @return Whether the alternate field is set.
   */
  boolean hasAlternate();
  /**
   *
   *
   * <pre>
   * An alternate policy configuration that will be used instead of the baseline
   * policy configurations as determined by the launch.
   * Currently the only way the launch can trigger the alternate configuration
   * is via dry-run/darklaunch.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.AlternatePolicySpec alternate = 3;</code>
   *
   * @return The alternate.
   */
  com.google.cloud.orgpolicy.v2.AlternatePolicySpec getAlternate();
  /**
   *
   *
   * <pre>
   * An alternate policy configuration that will be used instead of the baseline
   * policy configurations as determined by the launch.
   * Currently the only way the launch can trigger the alternate configuration
   * is via dry-run/darklaunch.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.AlternatePolicySpec alternate = 3;</code>
   */
  com.google.cloud.orgpolicy.v2.AlternatePolicySpecOrBuilder getAlternateOrBuilder();
}
