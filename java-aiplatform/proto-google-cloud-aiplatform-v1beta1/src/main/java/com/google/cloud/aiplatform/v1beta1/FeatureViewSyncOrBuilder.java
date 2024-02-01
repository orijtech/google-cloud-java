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
// source: google/cloud/aiplatform/v1beta1/feature_view_sync.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface FeatureViewSyncOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureViewSync)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of the FeatureViewSync. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}/featureViewSyncs/{feature_view_sync}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Name of the FeatureViewSync. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}/featureViewSyncs/{feature_view_sync}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this FeatureViewSync is created. Creation of a
   * FeatureViewSync means that the job is pending / waiting for sufficient
   * resources but may not have started the actual data transfer yet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this FeatureViewSync is created. Creation of a
   * FeatureViewSync means that the job is pending / waiting for sufficient
   * resources but may not have started the actual data transfer yet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this FeatureViewSync is created. Creation of a
   * FeatureViewSync means that the job is pending / waiting for sufficient
   * resources but may not have started the actual data transfer yet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this FeatureViewSync is finished.
   * </pre>
   *
   * <code>.google.type.Interval run_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the runTime field is set.
   */
  boolean hasRunTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this FeatureViewSync is finished.
   * </pre>
   *
   * <code>.google.type.Interval run_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The runTime.
   */
  com.google.type.Interval getRunTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this FeatureViewSync is finished.
   * </pre>
   *
   * <code>.google.type.Interval run_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.type.IntervalOrBuilder getRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Final status of the FeatureViewSync.
   * </pre>
   *
   * <code>.google.rpc.Status final_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the finalStatus field is set.
   */
  boolean hasFinalStatus();
  /**
   *
   *
   * <pre>
   * Output only. Final status of the FeatureViewSync.
   * </pre>
   *
   * <code>.google.rpc.Status final_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The finalStatus.
   */
  com.google.rpc.Status getFinalStatus();
  /**
   *
   *
   * <pre>
   * Output only. Final status of the FeatureViewSync.
   * </pre>
   *
   * <code>.google.rpc.Status final_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getFinalStatusOrBuilder();
}
