/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/networkmanagement/v1beta1/reachability.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1beta1;

public interface CreateConnectivityTestRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the Connectivity Test to create:
   *     `projects/{project_id}/locations/global`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the Connectivity Test to create:
   *     `projects/{project_id}/locations/global`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The logical name of the Connectivity Test in your project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project
   * </pre>
   *
   * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The testId.
   */
  java.lang.String getTestId();
  /**
   *
   *
   * <pre>
   * Required. The logical name of the Connectivity Test in your project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project
   * </pre>
   *
   * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for testId.
   */
  com.google.protobuf.ByteString getTestIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A `ConnectivityTest` resource
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * Required. A `ConnectivityTest` resource
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resource.
   */
  com.google.cloud.networkmanagement.v1beta1.ConnectivityTest getResource();
  /**
   *
   *
   * <pre>
   * Required. A `ConnectivityTest` resource
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.ConnectivityTestOrBuilder getResourceOrBuilder();
}
