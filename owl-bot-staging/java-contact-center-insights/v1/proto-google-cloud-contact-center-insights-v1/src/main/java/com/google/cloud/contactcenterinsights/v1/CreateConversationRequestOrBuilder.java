// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

public interface CreateConversationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.CreateConversationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource of the conversation.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource of the conversation.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversation.
   */
  com.google.cloud.contactcenterinsights.v1.Conversation getConversation();
  /**
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder getConversationOrBuilder();

  /**
   * <pre>
   * A unique ID for the new conversation. This ID will become the final
   * component of the conversation's resource name. If no ID is specified, a
   * server-generated ID will be used.
   * This value should be 4-64 characters and must match the regular
   * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
   * </pre>
   *
   * <code>string conversation_id = 3;</code>
   * @return The conversationId.
   */
  java.lang.String getConversationId();
  /**
   * <pre>
   * A unique ID for the new conversation. This ID will become the final
   * component of the conversation's resource name. If no ID is specified, a
   * server-generated ID will be used.
   * This value should be 4-64 characters and must match the regular
   * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
   * </pre>
   *
   * <code>string conversation_id = 3;</code>
   * @return The bytes for conversationId.
   */
  com.google.protobuf.ByteString
      getConversationIdBytes();
}