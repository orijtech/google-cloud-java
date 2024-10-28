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
// source: google/cloud/aiplatform/v1beta1/tuning_job.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface TuningJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.TuningJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The base model that is being tuned, e.g., "gemini-1.0-pro-002".
   * </pre>
   *
   * <code>string base_model = 4;</code>
   *
   * @return Whether the baseModel field is set.
   */
  boolean hasBaseModel();
  /**
   *
   *
   * <pre>
   * The base model that is being tuned, e.g., "gemini-1.0-pro-002".
   * </pre>
   *
   * <code>string base_model = 4;</code>
   *
   * @return The baseModel.
   */
  java.lang.String getBaseModel();
  /**
   *
   *
   * <pre>
   * The base model that is being tuned, e.g., "gemini-1.0-pro-002".
   * </pre>
   *
   * <code>string base_model = 4;</code>
   *
   * @return The bytes for baseModel.
   */
  com.google.protobuf.ByteString getBaseModelBytes();

  /**
   *
   *
   * <pre>
   * Tuning Spec for Supervised Fine Tuning.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SupervisedTuningSpec supervised_tuning_spec = 5;</code>
   *
   * @return Whether the supervisedTuningSpec field is set.
   */
  boolean hasSupervisedTuningSpec();
  /**
   *
   *
   * <pre>
   * Tuning Spec for Supervised Fine Tuning.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SupervisedTuningSpec supervised_tuning_spec = 5;</code>
   *
   * @return The supervisedTuningSpec.
   */
  com.google.cloud.aiplatform.v1beta1.SupervisedTuningSpec getSupervisedTuningSpec();
  /**
   *
   *
   * <pre>
   * Tuning Spec for Supervised Fine Tuning.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SupervisedTuningSpec supervised_tuning_spec = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SupervisedTuningSpecOrBuilder
      getSupervisedTuningSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Tuning Spec for Distillation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DistillationSpec distillation_spec = 17;</code>
   *
   * @return Whether the distillationSpec field is set.
   */
  boolean hasDistillationSpec();
  /**
   *
   *
   * <pre>
   * Tuning Spec for Distillation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DistillationSpec distillation_spec = 17;</code>
   *
   * @return The distillationSpec.
   */
  com.google.cloud.aiplatform.v1beta1.DistillationSpec getDistillationSpec();
  /**
   *
   *
   * <pre>
   * Tuning Spec for Distillation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DistillationSpec distillation_spec = 17;</code>
   */
  com.google.cloud.aiplatform.v1beta1.DistillationSpecOrBuilder getDistillationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Tuning Spec for open sourced and third party partner models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PartnerModelTuningSpec partner_model_tuning_spec = 21;
   * </code>
   *
   * @return Whether the partnerModelTuningSpec field is set.
   */
  boolean hasPartnerModelTuningSpec();
  /**
   *
   *
   * <pre>
   * Tuning Spec for open sourced and third party partner models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PartnerModelTuningSpec partner_model_tuning_spec = 21;
   * </code>
   *
   * @return The partnerModelTuningSpec.
   */
  com.google.cloud.aiplatform.v1beta1.PartnerModelTuningSpec getPartnerModelTuningSpec();
  /**
   *
   *
   * <pre>
   * Tuning Spec for open sourced and third party partner models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PartnerModelTuningSpec partner_model_tuning_spec = 21;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PartnerModelTuningSpecOrBuilder
      getPartnerModelTuningSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Identifier. Resource name of a TuningJob. Format:
   * `projects/{project}/locations/{location}/tuningJobs/{tuning_job}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Identifier. Resource name of a TuningJob. Format:
   * `projects/{project}/locations/{location}/tuningJobs/{tuning_job}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The display name of the
   * [TunedModel][google.cloud.aiplatform.v1.Model]. The name can be up to 128
   * characters long and can consist of any UTF-8 characters.
   * </pre>
   *
   * <code>string tuned_model_display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The tunedModelDisplayName.
   */
  java.lang.String getTunedModelDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The display name of the
   * [TunedModel][google.cloud.aiplatform.v1.Model]. The name can be up to 128
   * characters long and can consist of any UTF-8 characters.
   * </pre>
   *
   * <code>string tuned_model_display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for tunedModelDisplayName.
   */
  com.google.protobuf.ByteString getTunedModelDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.JobState getState();

  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] for the first time
   * entered the `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] for the first time
   * entered the `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] for the first time
   * entered the `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the TuningJob entered any of the following
   * [JobStates][google.cloud.aiplatform.v1.JobState]: `JOB_STATE_SUCCEEDED`,
   * `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`, `JOB_STATE_EXPIRED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the TuningJob entered any of the following
   * [JobStates][google.cloud.aiplatform.v1.JobState]: `JOB_STATE_SUCCEEDED`,
   * `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`, `JOB_STATE_EXPIRED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the TuningJob entered any of the following
   * [JobStates][google.cloud.aiplatform.v1.JobState]: `JOB_STATE_SUCCEEDED`,
   * `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`, `JOB_STATE_EXPIRED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Only populated when job's state is `JOB_STATE_FAILED` or
   * `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when job's state is `JOB_STATE_FAILED` or
   * `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when job's state is `JOB_STATE_FAILED` or
   * `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] and generated resources
   * such as [Model][google.cloud.aiplatform.v1.Model] and
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint].
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] and generated resources
   * such as [Model][google.cloud.aiplatform.v1.Model] and
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint].
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] and generated resources
   * such as [Model][google.cloud.aiplatform.v1.Model] and
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint].
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] and generated resources
   * such as [Model][google.cloud.aiplatform.v1.Model] and
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint].
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob] and generated resources
   * such as [Model][google.cloud.aiplatform.v1.Model] and
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint].
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The Experiment associated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * string experiment = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The experiment.
   */
  java.lang.String getExperiment();
  /**
   *
   *
   * <pre>
   * Output only. The Experiment associated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * string experiment = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for experiment.
   */
  com.google.protobuf.ByteString getExperimentBytes();

  /**
   *
   *
   * <pre>
   * Output only. The tuned model resources assiociated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TunedModel tuned_model = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the tunedModel field is set.
   */
  boolean hasTunedModel();
  /**
   *
   *
   * <pre>
   * Output only. The tuned model resources assiociated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TunedModel tuned_model = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The tunedModel.
   */
  com.google.cloud.aiplatform.v1beta1.TunedModel getTunedModel();
  /**
   *
   *
   * <pre>
   * Output only. The tuned model resources assiociated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TunedModel tuned_model = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TunedModelOrBuilder getTunedModelOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The tuning data statistics associated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TuningDataStats tuning_data_stats = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the tuningDataStats field is set.
   */
  boolean hasTuningDataStats();
  /**
   *
   *
   * <pre>
   * Output only. The tuning data statistics associated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TuningDataStats tuning_data_stats = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The tuningDataStats.
   */
  com.google.cloud.aiplatform.v1beta1.TuningDataStats getTuningDataStats();
  /**
   *
   *
   * <pre>
   * Output only. The tuning data statistics associated with this
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TuningDataStats tuning_data_stats = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TuningDataStatsOrBuilder getTuningDataStatsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the PipelineJob associated with the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob]. Format:
   * `projects/{project}/locations/{location}/pipelineJobs/{pipeline_job}`.
   * </pre>
   *
   * <code>
   * string pipeline_job = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The pipelineJob.
   */
  java.lang.String getPipelineJob();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the PipelineJob associated with the
   * [TuningJob][google.cloud.aiplatform.v1.TuningJob]. Format:
   * `projects/{project}/locations/{location}/pipelineJobs/{pipeline_job}`.
   * </pre>
   *
   * <code>
   * string pipeline_job = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for pipelineJob.
   */
  com.google.protobuf.ByteString getPipelineJobBytes();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options for a TuningJob. If this is set,
   * then all resources created by the TuningJob will be encrypted with the
   * provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 16;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options for a TuningJob. If this is set,
   * then all resources created by the TuningJob will be encrypted with the
   * provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 16;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options for a TuningJob. If this is set,
   * then all resources created by the TuningJob will be encrypted with the
   * provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 16;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  com.google.cloud.aiplatform.v1beta1.TuningJob.SourceModelCase getSourceModelCase();

  com.google.cloud.aiplatform.v1beta1.TuningJob.TuningSpecCase getTuningSpecCase();
}
