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
// source: google/cloud/discoveryengine/v1/conversational_search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface AnswerQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.AnswerQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Search serving config, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/engines/&#42;&#47;servingConfigs/default_serving_config`,
   * or
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/&#42;&#47;servingConfigs/default_serving_config`.
   * This field is used to identify the serving configuration name, set
   * of models used to make the search.
   * </pre>
   *
   * <code>
   * string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The servingConfig.
   */
  java.lang.String getServingConfig();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Search serving config, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/engines/&#42;&#47;servingConfigs/default_serving_config`,
   * or
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/&#42;&#47;servingConfigs/default_serving_config`.
   * This field is used to identify the serving configuration name, set
   * of models used to make the search.
   * </pre>
   *
   * <code>
   * string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for servingConfig.
   */
  com.google.protobuf.ByteString getServingConfigBytes();

  /**
   *
   *
   * <pre>
   * Required. Current user query.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Query query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   *
   *
   * <pre>
   * Required. Current user query.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Query query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The query.
   */
  com.google.cloud.discoveryengine.v1.Query getQuery();
  /**
   *
   *
   * <pre>
   * Required. Current user query.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Query query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1.QueryOrBuilder getQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * The session resource name. Not required.
   *
   * When session field is not set, the API is in sessionless mode.
   *
   * We support auto session mode: users can use the wildcard symbol `-` as
   * session ID.  A new ID will be automatically generated and assigned.
   * </pre>
   *
   * <code>string session = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * The session resource name. Not required.
   *
   * When session field is not set, the API is in sessionless mode.
   *
   * We support auto session mode: users can use the wildcard symbol `-` as
   * session ID.  A new ID will be automatically generated and assigned.
   * </pre>
   *
   * <code>string session = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Model specification.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.AnswerQueryRequest.SafetySpec safety_spec = 4;</code>
   *
   * @return Whether the safetySpec field is set.
   */
  boolean hasSafetySpec();
  /**
   *
   *
   * <pre>
   * Model specification.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.AnswerQueryRequest.SafetySpec safety_spec = 4;</code>
   *
   * @return The safetySpec.
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.SafetySpec getSafetySpec();
  /**
   *
   *
   * <pre>
   * Model specification.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.AnswerQueryRequest.SafetySpec safety_spec = 4;</code>
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.SafetySpecOrBuilder
      getSafetySpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Related questions specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.RelatedQuestionsSpec related_questions_spec = 5;
   * </code>
   *
   * @return Whether the relatedQuestionsSpec field is set.
   */
  boolean hasRelatedQuestionsSpec();
  /**
   *
   *
   * <pre>
   * Related questions specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.RelatedQuestionsSpec related_questions_spec = 5;
   * </code>
   *
   * @return The relatedQuestionsSpec.
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.RelatedQuestionsSpec
      getRelatedQuestionsSpec();
  /**
   *
   *
   * <pre>
   * Related questions specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.RelatedQuestionsSpec related_questions_spec = 5;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.RelatedQuestionsSpecOrBuilder
      getRelatedQuestionsSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Answer generation specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.AnswerGenerationSpec answer_generation_spec = 7;
   * </code>
   *
   * @return Whether the answerGenerationSpec field is set.
   */
  boolean hasAnswerGenerationSpec();
  /**
   *
   *
   * <pre>
   * Answer generation specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.AnswerGenerationSpec answer_generation_spec = 7;
   * </code>
   *
   * @return The answerGenerationSpec.
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.AnswerGenerationSpec
      getAnswerGenerationSpec();
  /**
   *
   *
   * <pre>
   * Answer generation specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.AnswerGenerationSpec answer_generation_spec = 7;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.AnswerGenerationSpecOrBuilder
      getAnswerGenerationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Search specification.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.AnswerQueryRequest.SearchSpec search_spec = 8;</code>
   *
   * @return Whether the searchSpec field is set.
   */
  boolean hasSearchSpec();
  /**
   *
   *
   * <pre>
   * Search specification.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.AnswerQueryRequest.SearchSpec search_spec = 8;</code>
   *
   * @return The searchSpec.
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.SearchSpec getSearchSpec();
  /**
   *
   *
   * <pre>
   * Search specification.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.AnswerQueryRequest.SearchSpec search_spec = 8;</code>
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.SearchSpecOrBuilder
      getSearchSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Query understanding specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.QueryUnderstandingSpec query_understanding_spec = 9;
   * </code>
   *
   * @return Whether the queryUnderstandingSpec field is set.
   */
  boolean hasQueryUnderstandingSpec();
  /**
   *
   *
   * <pre>
   * Query understanding specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.QueryUnderstandingSpec query_understanding_spec = 9;
   * </code>
   *
   * @return The queryUnderstandingSpec.
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.QueryUnderstandingSpec
      getQueryUnderstandingSpec();
  /**
   *
   *
   * <pre>
   * Query understanding specification.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.AnswerQueryRequest.QueryUnderstandingSpec query_understanding_spec = 9;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.AnswerQueryRequest.QueryUnderstandingSpecOrBuilder
      getQueryUnderstandingSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated: This field is deprecated. Streaming Answer API will be
   * supported.
   *
   * Asynchronous mode control.
   *
   * If enabled, the response will be returned with answer/session resource
   * name without final answer. The API users need to do the polling to get
   * the latest status of answer/session by calling
   * [ConversationalSearchService.GetAnswer][google.cloud.discoveryengine.v1.ConversationalSearchService.GetAnswer]
   * or
   * [ConversationalSearchService.GetSession][google.cloud.discoveryengine.v1.ConversationalSearchService.GetSession]
   * method.
   * </pre>
   *
   * <code>bool asynchronous_mode = 10 [deprecated = true];</code>
   *
   * @deprecated google.cloud.discoveryengine.v1.AnswerQueryRequest.asynchronous_mode is deprecated.
   *     See google/cloud/discoveryengine/v1/conversational_search_service.proto;l=821
   * @return The asynchronousMode.
   */
  @java.lang.Deprecated
  boolean getAsynchronousMode();

  /**
   *
   *
   * <pre>
   * A unique identifier for tracking visitors. For example, this could be
   * implemented with an HTTP cookie, which should be able to uniquely identify
   * a visitor on a single device. This unique identifier should not change if
   * the visitor logs in or out of the website.
   *
   * This field should NOT have a fixed value such as `unknown_visitor`.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an  `INVALID_ARGUMENT`  error is returned.
   * </pre>
   *
   * <code>string user_pseudo_id = 12;</code>
   *
   * @return The userPseudoId.
   */
  java.lang.String getUserPseudoId();
  /**
   *
   *
   * <pre>
   * A unique identifier for tracking visitors. For example, this could be
   * implemented with an HTTP cookie, which should be able to uniquely identify
   * a visitor on a single device. This unique identifier should not change if
   * the visitor logs in or out of the website.
   *
   * This field should NOT have a fixed value such as `unknown_visitor`.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an  `INVALID_ARGUMENT`  error is returned.
   * </pre>
   *
   * <code>string user_pseudo_id = 12;</code>
   *
   * @return The bytes for userPseudoId.
   */
  com.google.protobuf.ByteString getUserPseudoIdBytes();

  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 13;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 13;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 13;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 13;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 13;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);
}
