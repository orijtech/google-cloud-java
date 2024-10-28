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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataproc.v1;

public interface InstanceFlexibilityPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.InstanceFlexibilityPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Defines how the Group selects the provisioning model to ensure
   * required reliability.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.ProvisioningModelMix provisioning_model_mix = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the provisioningModelMix field is set.
   */
  boolean hasProvisioningModelMix();
  /**
   *
   *
   * <pre>
   * Optional. Defines how the Group selects the provisioning model to ensure
   * required reliability.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.ProvisioningModelMix provisioning_model_mix = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The provisioningModelMix.
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.ProvisioningModelMix
      getProvisioningModelMix();
  /**
   *
   *
   * <pre>
   * Optional. Defines how the Group selects the provisioning model to ensure
   * required reliability.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.ProvisioningModelMix provisioning_model_mix = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.ProvisioningModelMixOrBuilder
      getProvisioningModelMixOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection>
      getInstanceSelectionListList();
  /**
   *
   *
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection getInstanceSelectionList(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getInstanceSelectionListCount();
  /**
   *
   *
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionOrBuilder>
      getInstanceSelectionListOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionOrBuilder
      getInstanceSelectionListOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult>
      getInstanceSelectionResultsList();
  /**
   *
   *
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult
      getInstanceSelectionResults(int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getInstanceSelectionResultsCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy
                  .InstanceSelectionResultOrBuilder>
      getInstanceSelectionResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResultOrBuilder
      getInstanceSelectionResultsOrBuilder(int index);
}
