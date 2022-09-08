// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1beta1;

public interface SerializedPolicyTagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.SerializedPolicyTag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Display name of the policy tag. Max 200 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. Display name of the policy tag. Max 200 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Description of the serialized policy tag. The length of the
   * description is limited to 2000 bytes when encoded in UTF-8. If not set,
   * defaults to an empty description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the serialized policy tag. The length of the
   * description is limited to 2000 bytes when encoded in UTF-8. If not set,
   * defaults to an empty description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Children of the policy tag if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1beta1.SerializedPolicyTag> 
      getChildPolicyTagsList();
  /**
   * <pre>
   * Children of the policy tag if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  com.google.cloud.datacatalog.v1beta1.SerializedPolicyTag getChildPolicyTags(int index);
  /**
   * <pre>
   * Children of the policy tag if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  int getChildPolicyTagsCount();
  /**
   * <pre>
   * Children of the policy tag if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1beta1.SerializedPolicyTagOrBuilder> 
      getChildPolicyTagsOrBuilderList();
  /**
   * <pre>
   * Children of the policy tag if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  com.google.cloud.datacatalog.v1beta1.SerializedPolicyTagOrBuilder getChildPolicyTagsOrBuilder(
      int index);
}