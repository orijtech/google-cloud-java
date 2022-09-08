// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface FirewallPoliciesListAssociationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FirewallPoliciesListAssociationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of associations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;</code>
   */
  java.util.List<com.google.cloud.compute.v1.FirewallPolicyAssociation> 
      getAssociationsList();
  /**
   * <pre>
   * A list of associations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;</code>
   */
  com.google.cloud.compute.v1.FirewallPolicyAssociation getAssociations(int index);
  /**
   * <pre>
   * A list of associations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;</code>
   */
  int getAssociationsCount();
  /**
   * <pre>
   * A list of associations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.FirewallPolicyAssociationOrBuilder> 
      getAssociationsOrBuilderList();
  /**
   * <pre>
   * A list of associations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;</code>
   */
  com.google.cloud.compute.v1.FirewallPolicyAssociationOrBuilder getAssociationsOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] Type of firewallPolicy associations. Always compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of firewallPolicy associations. Always compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of firewallPolicy associations. Always compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();
}