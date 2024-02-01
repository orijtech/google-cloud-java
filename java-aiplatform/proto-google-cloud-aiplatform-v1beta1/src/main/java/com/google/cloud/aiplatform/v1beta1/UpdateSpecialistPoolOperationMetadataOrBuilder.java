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
// source: google/cloud/aiplatform/v1beta1/specialist_pool_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface UpdateSpecialistPoolOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateSpecialistPoolOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the SpecialistPool to which the specialists are
   * being added. Format:
   * `projects/{project_id}/locations/{location_id}/specialistPools/{specialist_pool}`
   * </pre>
   *
   * <code>
   * string specialist_pool = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The specialistPool.
   */
  java.lang.String getSpecialistPool();
  /**
   *
   *
   * <pre>
   * Output only. The name of the SpecialistPool to which the specialists are
   * being added. Format:
   * `projects/{project_id}/locations/{location_id}/specialistPools/{specialist_pool}`
   * </pre>
   *
   * <code>
   * string specialist_pool = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for specialistPool.
   */
  com.google.protobuf.ByteString getSpecialistPoolBytes();

  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 2;</code>
   *
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 2;</code>
   *
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata();
  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder
      getGenericMetadataOrBuilder();
}
