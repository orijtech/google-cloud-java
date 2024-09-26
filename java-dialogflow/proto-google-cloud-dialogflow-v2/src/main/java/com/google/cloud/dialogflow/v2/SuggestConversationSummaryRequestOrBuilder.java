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
// source: google/cloud/dialogflow/v2/conversation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public interface SuggestConversationSummaryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SuggestConversationSummaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The conversation to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The conversation.
   */
  java.lang.String getConversation();
  /**
   *
   *
   * <pre>
   * Required. The conversation to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for conversation.
   */
  com.google.protobuf.ByteString getConversationBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the latest conversation message used as context for
   * compiling suggestion. If empty, the latest message of the conversation will
   * be used.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>
   * string latest_message = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The latestMessage.
   */
  java.lang.String getLatestMessage();
  /**
   *
   *
   * <pre>
   * Optional. The name of the latest conversation message used as context for
   * compiling suggestion. If empty, the latest message of the conversation will
   * be used.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>
   * string latest_message = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString getLatestMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Max number of messages prior to and including
   * [latest_message] to use as context when compiling the
   * suggestion. By default 500 and at most 1000.
   * </pre>
   *
   * <code>int32 context_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The contextSize.
   */
  int getContextSize();

  /**
   *
   *
   * <pre>
   * Optional. Parameters for a human assist query. Only used for POC/demo
   * purpose.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AssistQueryParameters assist_query_params = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the assistQueryParams field is set.
   */
  boolean hasAssistQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. Parameters for a human assist query. Only used for POC/demo
   * purpose.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AssistQueryParameters assist_query_params = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The assistQueryParams.
   */
  com.google.cloud.dialogflow.v2.AssistQueryParameters getAssistQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. Parameters for a human assist query. Only used for POC/demo
   * purpose.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AssistQueryParameters assist_query_params = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.AssistQueryParametersOrBuilder getAssistQueryParamsOrBuilder();
}
