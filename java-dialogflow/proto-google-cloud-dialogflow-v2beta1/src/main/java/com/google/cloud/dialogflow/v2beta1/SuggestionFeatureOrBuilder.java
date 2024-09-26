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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface SuggestionFeatureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SuggestionFeature)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of Human Agent Assistant API feature to request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestionFeature.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Type of Human Agent Assistant API feature to request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestionFeature.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionFeature.Type getType();
}
