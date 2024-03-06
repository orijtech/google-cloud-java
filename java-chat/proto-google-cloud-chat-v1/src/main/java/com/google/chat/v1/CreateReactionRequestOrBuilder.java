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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public interface CreateReactionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.CreateReactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The message where the reaction is created.
   *
   * Format: `spaces/{space}/messages/{message}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The message where the reaction is created.
   *
   * Format: `spaces/{space}/messages/{message}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The reaction to create.
   * </pre>
   *
   * <code>.google.chat.v1.Reaction reaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the reaction field is set.
   */
  boolean hasReaction();
  /**
   *
   *
   * <pre>
   * Required. The reaction to create.
   * </pre>
   *
   * <code>.google.chat.v1.Reaction reaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The reaction.
   */
  com.google.chat.v1.Reaction getReaction();
  /**
   *
   *
   * <pre>
   * Required. The reaction to create.
   * </pre>
   *
   * <code>.google.chat.v1.Reaction reaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.chat.v1.ReactionOrBuilder getReactionOrBuilder();
}
