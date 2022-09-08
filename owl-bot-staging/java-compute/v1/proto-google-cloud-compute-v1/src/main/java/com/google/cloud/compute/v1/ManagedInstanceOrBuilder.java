// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ManagedInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ManagedInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] The current action that the managed instance group has scheduled for the instance. Possible values: - NONE The instance is running, and the managed instance group does not have any scheduled actions for this instance. - CREATING The managed instance group is creating this instance. If the group fails to create this instance, it will try again until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create this instance only once. If the group fails to create this instance, it does not try again and the group's targetSize value is decreased instead. - RECREATING The managed instance group is recreating this instance. - DELETING The managed instance group is permanently deleting this instance. - ABANDONING The managed instance group is abandoning this instance. The instance will be removed from the instance group and from any target pools that are associated with this group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The managed instance group is applying configuration changes to the instance without stopping it. For example, the group can update the target pool list for an instance without stopping that instance. - VERIFYING The managed instance group has created the instance and it is in the process of being verified.
   * Check the CurrentAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string current_action = 178475964;</code>
   * @return Whether the currentAction field is set.
   */
  boolean hasCurrentAction();
  /**
   * <pre>
   * [Output Only] The current action that the managed instance group has scheduled for the instance. Possible values: - NONE The instance is running, and the managed instance group does not have any scheduled actions for this instance. - CREATING The managed instance group is creating this instance. If the group fails to create this instance, it will try again until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create this instance only once. If the group fails to create this instance, it does not try again and the group's targetSize value is decreased instead. - RECREATING The managed instance group is recreating this instance. - DELETING The managed instance group is permanently deleting this instance. - ABANDONING The managed instance group is abandoning this instance. The instance will be removed from the instance group and from any target pools that are associated with this group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The managed instance group is applying configuration changes to the instance without stopping it. For example, the group can update the target pool list for an instance without stopping that instance. - VERIFYING The managed instance group has created the instance and it is in the process of being verified.
   * Check the CurrentAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string current_action = 178475964;</code>
   * @return The currentAction.
   */
  java.lang.String getCurrentAction();
  /**
   * <pre>
   * [Output Only] The current action that the managed instance group has scheduled for the instance. Possible values: - NONE The instance is running, and the managed instance group does not have any scheduled actions for this instance. - CREATING The managed instance group is creating this instance. If the group fails to create this instance, it will try again until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create this instance only once. If the group fails to create this instance, it does not try again and the group's targetSize value is decreased instead. - RECREATING The managed instance group is recreating this instance. - DELETING The managed instance group is permanently deleting this instance. - ABANDONING The managed instance group is abandoning this instance. The instance will be removed from the instance group and from any target pools that are associated with this group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The managed instance group is applying configuration changes to the instance without stopping it. For example, the group can update the target pool list for an instance without stopping that instance. - VERIFYING The managed instance group has created the instance and it is in the process of being verified.
   * Check the CurrentAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string current_action = 178475964;</code>
   * @return The bytes for currentAction.
   */
  com.google.protobuf.ByteString
      getCurrentActionBytes();

  /**
   * <pre>
   * [Output only] The unique identifier for this resource. This field is empty when instance does not exist.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output only] The unique identifier for this resource. This field is empty when instance does not exist.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been created.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been created.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been created.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 382667078;</code>
   */
  java.util.List<com.google.cloud.compute.v1.ManagedInstanceInstanceHealth> 
      getInstanceHealthList();
  /**
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 382667078;</code>
   */
  com.google.cloud.compute.v1.ManagedInstanceInstanceHealth getInstanceHealth(int index);
  /**
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 382667078;</code>
   */
  int getInstanceHealthCount();
  /**
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 382667078;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ManagedInstanceInstanceHealthOrBuilder> 
      getInstanceHealthOrBuilderList();
  /**
   * <pre>
   * [Output Only] Health state of the instance per health-check.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstanceInstanceHealth instance_health = 382667078;</code>
   */
  com.google.cloud.compute.v1.ManagedInstanceInstanceHealthOrBuilder getInstanceHealthOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * Check the InstanceStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_status = 174577372;</code>
   * @return Whether the instanceStatus field is set.
   */
  boolean hasInstanceStatus();
  /**
   * <pre>
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * Check the InstanceStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_status = 174577372;</code>
   * @return The instanceStatus.
   */
  java.lang.String getInstanceStatus();
  /**
   * <pre>
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * Check the InstanceStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_status = 174577372;</code>
   * @return The bytes for instanceStatus.
   */
  com.google.protobuf.ByteString
      getInstanceStatusBytes();

  /**
   * <pre>
   * [Output Only] Information about the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ManagedInstanceLastAttempt last_attempt = 434771492;</code>
   * @return Whether the lastAttempt field is set.
   */
  boolean hasLastAttempt();
  /**
   * <pre>
   * [Output Only] Information about the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ManagedInstanceLastAttempt last_attempt = 434771492;</code>
   * @return The lastAttempt.
   */
  com.google.cloud.compute.v1.ManagedInstanceLastAttempt getLastAttempt();
  /**
   * <pre>
   * [Output Only] Information about the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ManagedInstanceLastAttempt last_attempt = 434771492;</code>
   */
  com.google.cloud.compute.v1.ManagedInstanceLastAttemptOrBuilder getLastAttemptOrBuilder();

  /**
   * <pre>
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedState preserved_state_from_config = 98661858;</code>
   * @return Whether the preservedStateFromConfig field is set.
   */
  boolean hasPreservedStateFromConfig();
  /**
   * <pre>
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedState preserved_state_from_config = 98661858;</code>
   * @return The preservedStateFromConfig.
   */
  com.google.cloud.compute.v1.PreservedState getPreservedStateFromConfig();
  /**
   * <pre>
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedState preserved_state_from_config = 98661858;</code>
   */
  com.google.cloud.compute.v1.PreservedStateOrBuilder getPreservedStateFromConfigOrBuilder();

  /**
   * <pre>
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedState preserved_state_from_policy = 470783954;</code>
   * @return Whether the preservedStateFromPolicy field is set.
   */
  boolean hasPreservedStateFromPolicy();
  /**
   * <pre>
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedState preserved_state_from_policy = 470783954;</code>
   * @return The preservedStateFromPolicy.
   */
  com.google.cloud.compute.v1.PreservedState getPreservedStateFromPolicy();
  /**
   * <pre>
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedState preserved_state_from_policy = 470783954;</code>
   */
  com.google.cloud.compute.v1.PreservedStateOrBuilder getPreservedStateFromPolicyOrBuilder();

  /**
   * <pre>
   * [Output Only] Intended version of this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ManagedInstanceVersion version = 351608024;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * [Output Only] Intended version of this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ManagedInstanceVersion version = 351608024;</code>
   * @return The version.
   */
  com.google.cloud.compute.v1.ManagedInstanceVersion getVersion();
  /**
   * <pre>
   * [Output Only] Intended version of this instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ManagedInstanceVersion version = 351608024;</code>
   */
  com.google.cloud.compute.v1.ManagedInstanceVersionOrBuilder getVersionOrBuilder();
}