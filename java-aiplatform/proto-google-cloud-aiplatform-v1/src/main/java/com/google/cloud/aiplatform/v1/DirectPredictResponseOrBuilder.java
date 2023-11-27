/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

public interface DirectPredictResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DirectPredictResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Tensor> getOutputsList();
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Tensor getOutputs(int index);
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  int getOutputsCount();
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TensorOrBuilder>
      getOutputsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TensorOrBuilder getOutputsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
   *
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1.Tensor getParameters();
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
   */
  com.google.cloud.aiplatform.v1.TensorOrBuilder getParametersOrBuilder();
}
