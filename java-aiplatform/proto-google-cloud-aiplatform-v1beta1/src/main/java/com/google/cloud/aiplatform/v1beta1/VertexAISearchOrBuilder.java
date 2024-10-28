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
// source: google/cloud/aiplatform/v1beta1/tool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface VertexAISearchOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.VertexAISearch)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Fully-qualified Vertex AI Search data store resource ID.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{dataStore}`
   * </pre>
   *
   * <code>string datastore = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The datastore.
   */
  java.lang.String getDatastore();
  /**
   *
   *
   * <pre>
   * Required. Fully-qualified Vertex AI Search data store resource ID.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{dataStore}`
   * </pre>
   *
   * <code>string datastore = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for datastore.
   */
  com.google.protobuf.ByteString getDatastoreBytes();
}
