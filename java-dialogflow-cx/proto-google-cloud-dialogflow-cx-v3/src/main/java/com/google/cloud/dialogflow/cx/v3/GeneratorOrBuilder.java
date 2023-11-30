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
// source: google/cloud/dialogflow/cx/v3/generator.proto

package com.google.cloud.dialogflow.cx.v3;

public interface GeneratorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.Generator)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the generator.
   * Must be set for the
   * [Generators.UpdateGenerator][google.cloud.dialogflow.cx.v3.Generators.UpdateGenerator]
   * method. [Generators.CreateGenerate][] populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/generators/&lt;Generator ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the generator.
   * Must be set for the
   * [Generators.UpdateGenerator][google.cloud.dialogflow.cx.v3.Generators.UpdateGenerator]
   * method. [Generators.CreateGenerate][] populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/generators/&lt;Generator ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the generator, unique within the
   * agent. The prompt contains pre-defined parameters such as $conversation,
   * $last-user-utterance, etc. populated by Dialogflow. It can also contain
   * custom placeholders which will be resolved during fulfillment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the generator, unique within the
   * agent. The prompt contains pre-defined parameters such as $conversation,
   * $last-user-utterance, etc. populated by Dialogflow. It can also contain
   * custom placeholders which will be resolved during fulfillment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Prompt for the LLM model.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.Phrase prompt_text = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the promptText field is set.
   */
  boolean hasPromptText();
  /**
   *
   *
   * <pre>
   * Required. Prompt for the LLM model.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.Phrase prompt_text = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The promptText.
   */
  com.google.cloud.dialogflow.cx.v3.Phrase getPromptText();
  /**
   *
   *
   * <pre>
   * Required. Prompt for the LLM model.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.Phrase prompt_text = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.PhraseOrBuilder getPromptTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. List of custom placeholders in the prompt text.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.Generator.Placeholder placeholders = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.Generator.Placeholder> getPlaceholdersList();
  /**
   *
   *
   * <pre>
   * Optional. List of custom placeholders in the prompt text.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.Generator.Placeholder placeholders = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.Generator.Placeholder getPlaceholders(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of custom placeholders in the prompt text.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.Generator.Placeholder placeholders = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPlaceholdersCount();
  /**
   *
   *
   * <pre>
   * Optional. List of custom placeholders in the prompt text.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.Generator.Placeholder placeholders = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.Generator.PlaceholderOrBuilder>
      getPlaceholdersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. List of custom placeholders in the prompt text.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.Generator.Placeholder placeholders = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.Generator.PlaceholderOrBuilder getPlaceholdersOrBuilder(
      int index);
}
