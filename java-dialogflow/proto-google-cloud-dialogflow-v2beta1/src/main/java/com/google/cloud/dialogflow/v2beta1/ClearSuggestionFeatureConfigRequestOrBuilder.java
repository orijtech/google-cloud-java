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
// source: google/cloud/dialogflow/v2beta1/conversation_profile.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface ClearSuggestionFeatureConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ClearSuggestionFeatureConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Conversation Profile to add or update the suggestion feature
   * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The conversationProfile.
   */
  java.lang.String getConversationProfile();
  /**
   *
   *
   * <pre>
   * Required. The Conversation Profile to add or update the suggestion feature
   * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for conversationProfile.
   */
  com.google.protobuf.ByteString getConversationProfileBytes();

  /**
   *
   *
   * <pre>
   * Required. The participant role to remove the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for participantRole.
   */
  int getParticipantRoleValue();
  /**
   *
   *
   * <pre>
   * Required. The participant role to remove the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The participantRole.
   */
  com.google.cloud.dialogflow.v2beta1.Participant.Role getParticipantRole();

  /**
   *
   *
   * <pre>
   * Required. The type of the suggestion feature to remove.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for suggestionFeatureType.
   */
  int getSuggestionFeatureTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of the suggestion feature to remove.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The suggestionFeatureType.
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionFeature.Type getSuggestionFeatureType();
}
