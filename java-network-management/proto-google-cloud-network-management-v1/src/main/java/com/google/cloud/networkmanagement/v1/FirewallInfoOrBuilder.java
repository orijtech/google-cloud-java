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
// source: google/cloud/networkmanagement/v1/trace.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1;

public interface FirewallInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.FirewallInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The display name of the firewall rule. This field might be empty for
   * firewall policy rules.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the firewall rule. This field might be empty for
   * firewall policy rules.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The URI of the firewall rule. This field is not applicable to implied
   * VPC firewall rules.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The URI of the firewall rule. This field is not applicable to implied
   * VPC firewall rules.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Possible values: INGRESS, EGRESS
   * </pre>
   *
   * <code>string direction = 3;</code>
   *
   * @return The direction.
   */
  java.lang.String getDirection();
  /**
   *
   *
   * <pre>
   * Possible values: INGRESS, EGRESS
   * </pre>
   *
   * <code>string direction = 3;</code>
   *
   * @return The bytes for direction.
   */
  com.google.protobuf.ByteString getDirectionBytes();

  /**
   *
   *
   * <pre>
   * Possible values: ALLOW, DENY, APPLY_SECURITY_PROFILE_GROUP
   * </pre>
   *
   * <code>string action = 4;</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * Possible values: ALLOW, DENY, APPLY_SECURITY_PROFILE_GROUP
   * </pre>
   *
   * <code>string action = 4;</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * The priority of the firewall rule.
   * </pre>
   *
   * <code>int32 priority = 5;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * The URI of the VPC network that the firewall rule is associated with.
   * This field is not applicable to hierarchical firewall policy rules.
   * </pre>
   *
   * <code>string network_uri = 6;</code>
   *
   * @return The networkUri.
   */
  java.lang.String getNetworkUri();
  /**
   *
   *
   * <pre>
   * The URI of the VPC network that the firewall rule is associated with.
   * This field is not applicable to hierarchical firewall policy rules.
   * </pre>
   *
   * <code>string network_uri = 6;</code>
   *
   * @return The bytes for networkUri.
   */
  com.google.protobuf.ByteString getNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * The target tags defined by the VPC firewall rule. This field is not
   * applicable to firewall policy rules.
   * </pre>
   *
   * <code>repeated string target_tags = 7;</code>
   *
   * @return A list containing the targetTags.
   */
  java.util.List<java.lang.String> getTargetTagsList();
  /**
   *
   *
   * <pre>
   * The target tags defined by the VPC firewall rule. This field is not
   * applicable to firewall policy rules.
   * </pre>
   *
   * <code>repeated string target_tags = 7;</code>
   *
   * @return The count of targetTags.
   */
  int getTargetTagsCount();
  /**
   *
   *
   * <pre>
   * The target tags defined by the VPC firewall rule. This field is not
   * applicable to firewall policy rules.
   * </pre>
   *
   * <code>repeated string target_tags = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The targetTags at the given index.
   */
  java.lang.String getTargetTags(int index);
  /**
   *
   *
   * <pre>
   * The target tags defined by the VPC firewall rule. This field is not
   * applicable to firewall policy rules.
   * </pre>
   *
   * <code>repeated string target_tags = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetTags at the given index.
   */
  com.google.protobuf.ByteString getTargetTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * The target service accounts specified by the firewall rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 8;</code>
   *
   * @return A list containing the targetServiceAccounts.
   */
  java.util.List<java.lang.String> getTargetServiceAccountsList();
  /**
   *
   *
   * <pre>
   * The target service accounts specified by the firewall rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 8;</code>
   *
   * @return The count of targetServiceAccounts.
   */
  int getTargetServiceAccountsCount();
  /**
   *
   *
   * <pre>
   * The target service accounts specified by the firewall rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The targetServiceAccounts at the given index.
   */
  java.lang.String getTargetServiceAccounts(int index);
  /**
   *
   *
   * <pre>
   * The target service accounts specified by the firewall rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetServiceAccounts at the given index.
   */
  com.google.protobuf.ByteString getTargetServiceAccountsBytes(int index);

  /**
   *
   *
   * <pre>
   * The name of the firewall policy that this rule is associated with.
   * This field is not applicable to VPC firewall rules and implied VPC firewall
   * rules.
   * </pre>
   *
   * <code>string policy = 9;</code>
   *
   * @return The policy.
   */
  java.lang.String getPolicy();
  /**
   *
   *
   * <pre>
   * The name of the firewall policy that this rule is associated with.
   * This field is not applicable to VPC firewall rules and implied VPC firewall
   * rules.
   * </pre>
   *
   * <code>string policy = 9;</code>
   *
   * @return The bytes for policy.
   */
  com.google.protobuf.ByteString getPolicyBytes();

  /**
   *
   *
   * <pre>
   * The URI of the firewall policy that this rule is associated with.
   * This field is not applicable to VPC firewall rules and implied VPC firewall
   * rules.
   * </pre>
   *
   * <code>string policy_uri = 11;</code>
   *
   * @return The policyUri.
   */
  java.lang.String getPolicyUri();
  /**
   *
   *
   * <pre>
   * The URI of the firewall policy that this rule is associated with.
   * This field is not applicable to VPC firewall rules and implied VPC firewall
   * rules.
   * </pre>
   *
   * <code>string policy_uri = 11;</code>
   *
   * @return The bytes for policyUri.
   */
  com.google.protobuf.ByteString getPolicyUriBytes();

  /**
   *
   *
   * <pre>
   * The firewall rule's type.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.FirewallInfo.FirewallRuleType firewall_rule_type = 10;
   * </code>
   *
   * @return The enum numeric value on the wire for firewallRuleType.
   */
  int getFirewallRuleTypeValue();
  /**
   *
   *
   * <pre>
   * The firewall rule's type.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.FirewallInfo.FirewallRuleType firewall_rule_type = 10;
   * </code>
   *
   * @return The firewallRuleType.
   */
  com.google.cloud.networkmanagement.v1.FirewallInfo.FirewallRuleType getFirewallRuleType();
}
