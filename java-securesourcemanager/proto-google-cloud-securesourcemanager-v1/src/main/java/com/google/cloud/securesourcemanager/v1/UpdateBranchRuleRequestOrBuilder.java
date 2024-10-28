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
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securesourcemanager.v1;

public interface UpdateBranchRuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securesourcemanager.v1.UpdateBranchRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>
   * .google.cloud.securesourcemanager.v1.BranchRule branch_rule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the branchRule field is set.
   */
  boolean hasBranchRule();
  /**
   * <code>
   * .google.cloud.securesourcemanager.v1.BranchRule branch_rule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The branchRule.
   */
  com.google.cloud.securesourcemanager.v1.BranchRule getBranchRule();
  /**
   * <code>
   * .google.cloud.securesourcemanager.v1.BranchRule branch_rule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securesourcemanager.v1.BranchRuleOrBuilder getBranchRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set, validate the request and preview the review, but do not
   * actually post it.  (https://google.aip.dev/163, for declarative friendly)
   * </pre>
   *
   * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * branchRule resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask.
   * The special value "*" means full replacement.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * branchRule resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask.
   * The special value "*" means full replacement.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * branchRule resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask.
   * The special value "*" means full replacement.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
