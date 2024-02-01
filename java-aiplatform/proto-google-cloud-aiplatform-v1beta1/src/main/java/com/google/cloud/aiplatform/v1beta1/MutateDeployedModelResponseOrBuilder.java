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
// source: google/cloud/aiplatform/v1beta1/endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface MutateDeployedModelResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.MutateDeployedModelResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The DeployedModel that's being mutated.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
   *
   * @return Whether the deployedModel field is set.
   */
  boolean hasDeployedModel();
  /**
   *
   *
   * <pre>
   * The DeployedModel that's being mutated.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
   *
   * @return The deployedModel.
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModel getDeployedModel();
  /**
   *
   *
   * <pre>
   * The DeployedModel that's being mutated.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder getDeployedModelOrBuilder();
}
