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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ServiceAccountSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ServiceAccountSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. If true, custom user-managed service account is enforced to run
   * any workloads (for example, Vertex Jobs) on the resource. Otherwise, uses
   * the [Vertex AI Custom Code Service
   * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents).
   * </pre>
   *
   * <code>bool enable_custom_service_account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The enableCustomServiceAccount.
   */
  boolean getEnableCustomServiceAccount();

  /**
   *
   *
   * <pre>
   * Optional. Default service account that this PersistentResource's workloads
   * run as. The workloads include:
   *
   *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
   *    for example, Ray.
   *  * Jobs submitted to PersistentResource, if no other service account
   *    specified in the job specs.
   *
   * Only works when custom service account is enabled and users have the
   * `iam.serviceAccounts.actAs` permission on this service account.
   *
   * Required if any containers are specified in `ResourceRuntimeSpec`.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. Default service account that this PersistentResource's workloads
   * run as. The workloads include:
   *
   *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
   *    for example, Ray.
   *  * Jobs submitted to PersistentResource, if no other service account
   *    specified in the job specs.
   *
   * Only works when custom service account is enabled and users have the
   * `iam.serviceAccounts.actAs` permission on this service account.
   *
   * Required if any containers are specified in `ResourceRuntimeSpec`.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();
}
