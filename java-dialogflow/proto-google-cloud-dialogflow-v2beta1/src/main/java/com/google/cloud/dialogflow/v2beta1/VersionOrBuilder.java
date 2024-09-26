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
// source: google/cloud/dialogflow/v2beta1/version.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface VersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this agent version.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/versions/&lt;Version ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version
   *   ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this agent version.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/versions/&lt;Version ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version
   *   ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The developer-provided description of this version.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The developer-provided description of this version.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The sequential number of this version. This field is read-only
   * which means it cannot be set by create and update methods.
   * </pre>
   *
   * <code>int32 version_number = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The versionNumber.
   */
  int getVersionNumber();

  /**
   *
   *
   * <pre>
   * Output only. The creation time of this version. This field is read-only,
   * i.e., it cannot be set by create and update methods.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of this version. This field is read-only,
   * i.e., it cannot be set by create and update methods.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of this version. This field is read-only,
   * i.e., it cannot be set by create and update methods.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The status of this version. This field is read-only and cannot
   * be set by create and update methods.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Version.VersionStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. The status of this version. This field is read-only and cannot
   * be set by create and update methods.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Version.VersionStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.dialogflow.v2beta1.Version.VersionStatus getStatus();
}
