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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1;

public interface UpdateNodePoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.UpdateNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3020
   * @return The projectId.
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3020
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3026
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3026
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3030
   * @return The clusterId.
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3030
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.node_pool_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3034
   * @return The nodePoolId.
   */
  @java.lang.Deprecated
  java.lang.String getNodePoolId();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.UpdateNodePoolRequest.node_pool_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3034
   * @return The bytes for nodePoolId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNodePoolIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Kubernetes version to change the nodes to (typically an
   * upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or
   * version aliases, which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the Kubernetes master version
   * </pre>
   *
   * <code>string node_version = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The nodeVersion.
   */
  java.lang.String getNodeVersion();
  /**
   *
   *
   * <pre>
   * Required. The Kubernetes version to change the nodes to (typically an
   * upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or
   * version aliases, which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the Kubernetes master version
   * </pre>
   *
   * <code>string node_version = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for nodeVersion.
   */
  com.google.protobuf.ByteString getNodeVersionBytes();

  /**
   *
   *
   * <pre>
   * Required. The desired image type for the node pool. Please see
   * https://cloud.google.com/kubernetes-engine/docs/concepts/node-images for
   * available image types.
   * </pre>
   *
   * <code>string image_type = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The imageType.
   */
  java.lang.String getImageType();
  /**
   *
   *
   * <pre>
   * Required. The desired image type for the node pool. Please see
   * https://cloud.google.com/kubernetes-engine/docs/concepts/node-images for
   * available image types.
   * </pre>
   *
   * <code>string image_type = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for imageType.
   */
  com.google.protobuf.ByteString getImageTypeBytes();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to
   * update. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 8;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to
   * update. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 8;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * node pool's nodes should be located. Changing the locations for a node pool
   * will result in nodes being either created or removed from the node pool,
   * depending on whether locations are being added or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @return A list containing the locations.
   */
  java.util.List<java.lang.String> getLocationsList();
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * node pool's nodes should be located. Changing the locations for a node pool
   * will result in nodes being either created or removed from the node pool,
   * depending on whether locations are being added or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @return The count of locations.
   */
  int getLocationsCount();
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * node pool's nodes should be located. Changing the locations for a node pool
   * will result in nodes being either created or removed from the node pool,
   * depending on whether locations are being added or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @param index The index of the element to return.
   * @return The locations at the given index.
   */
  java.lang.String getLocations(int index);
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * node pool's nodes should be located. Changing the locations for a node pool
   * will result in nodes being either created or removed from the node pool,
   * depending on whether locations are being added or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the locations at the given index.
   */
  com.google.protobuf.ByteString getLocationsBytes(int index);

  /**
   *
   *
   * <pre>
   * The desired workload metadata config for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadMetadataConfig workload_metadata_config = 14;</code>
   *
   * @return Whether the workloadMetadataConfig field is set.
   */
  boolean hasWorkloadMetadataConfig();
  /**
   *
   *
   * <pre>
   * The desired workload metadata config for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadMetadataConfig workload_metadata_config = 14;</code>
   *
   * @return The workloadMetadataConfig.
   */
  com.google.container.v1.WorkloadMetadataConfig getWorkloadMetadataConfig();
  /**
   *
   *
   * <pre>
   * The desired workload metadata config for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadMetadataConfig workload_metadata_config = 14;</code>
   */
  com.google.container.v1.WorkloadMetadataConfigOrBuilder getWorkloadMetadataConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.UpgradeSettings upgrade_settings = 15;</code>
   *
   * @return Whether the upgradeSettings field is set.
   */
  boolean hasUpgradeSettings();
  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.UpgradeSettings upgrade_settings = 15;</code>
   *
   * @return The upgradeSettings.
   */
  com.google.container.v1.NodePool.UpgradeSettings getUpgradeSettings();
  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.UpgradeSettings upgrade_settings = 15;</code>
   */
  com.google.container.v1.NodePool.UpgradeSettingsOrBuilder getUpgradeSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired network tags to be applied to all nodes in the node pool.
   * If this field is not present, the tags will not be changed. Otherwise,
   * the existing network tags will be *replaced* with the provided tags.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags tags = 16;</code>
   *
   * @return Whether the tags field is set.
   */
  boolean hasTags();
  /**
   *
   *
   * <pre>
   * The desired network tags to be applied to all nodes in the node pool.
   * If this field is not present, the tags will not be changed. Otherwise,
   * the existing network tags will be *replaced* with the provided tags.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags tags = 16;</code>
   *
   * @return The tags.
   */
  com.google.container.v1.NetworkTags getTags();
  /**
   *
   *
   * <pre>
   * The desired network tags to be applied to all nodes in the node pool.
   * If this field is not present, the tags will not be changed. Otherwise,
   * the existing network tags will be *replaced* with the provided tags.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags tags = 16;</code>
   */
  com.google.container.v1.NetworkTagsOrBuilder getTagsOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired node taints to be applied to all nodes in the node pool.
   * If this field is not present, the taints will not be changed. Otherwise,
   * the existing node taints will be *replaced* with the provided taints.
   * </pre>
   *
   * <code>.google.container.v1.NodeTaints taints = 17;</code>
   *
   * @return Whether the taints field is set.
   */
  boolean hasTaints();
  /**
   *
   *
   * <pre>
   * The desired node taints to be applied to all nodes in the node pool.
   * If this field is not present, the taints will not be changed. Otherwise,
   * the existing node taints will be *replaced* with the provided taints.
   * </pre>
   *
   * <code>.google.container.v1.NodeTaints taints = 17;</code>
   *
   * @return The taints.
   */
  com.google.container.v1.NodeTaints getTaints();
  /**
   *
   *
   * <pre>
   * The desired node taints to be applied to all nodes in the node pool.
   * If this field is not present, the taints will not be changed. Otherwise,
   * the existing node taints will be *replaced* with the provided taints.
   * </pre>
   *
   * <code>.google.container.v1.NodeTaints taints = 17;</code>
   */
  com.google.container.v1.NodeTaintsOrBuilder getTaintsOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired node labels to be applied to all nodes in the node pool.
   * If this field is not present, the labels will not be changed. Otherwise,
   * the existing node labels will be *replaced* with the provided labels.
   * </pre>
   *
   * <code>.google.container.v1.NodeLabels labels = 18;</code>
   *
   * @return Whether the labels field is set.
   */
  boolean hasLabels();
  /**
   *
   *
   * <pre>
   * The desired node labels to be applied to all nodes in the node pool.
   * If this field is not present, the labels will not be changed. Otherwise,
   * the existing node labels will be *replaced* with the provided labels.
   * </pre>
   *
   * <code>.google.container.v1.NodeLabels labels = 18;</code>
   *
   * @return The labels.
   */
  com.google.container.v1.NodeLabels getLabels();
  /**
   *
   *
   * <pre>
   * The desired node labels to be applied to all nodes in the node pool.
   * If this field is not present, the labels will not be changed. Otherwise,
   * the existing node labels will be *replaced* with the provided labels.
   * </pre>
   *
   * <code>.google.container.v1.NodeLabels labels = 18;</code>
   */
  com.google.container.v1.NodeLabelsOrBuilder getLabelsOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * <code>.google.container.v1.LinuxNodeConfig linux_node_config = 19;</code>
   *
   * @return Whether the linuxNodeConfig field is set.
   */
  boolean hasLinuxNodeConfig();
  /**
   *
   *
   * <pre>
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * <code>.google.container.v1.LinuxNodeConfig linux_node_config = 19;</code>
   *
   * @return The linuxNodeConfig.
   */
  com.google.container.v1.LinuxNodeConfig getLinuxNodeConfig();
  /**
   *
   *
   * <pre>
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * <code>.google.container.v1.LinuxNodeConfig linux_node_config = 19;</code>
   */
  com.google.container.v1.LinuxNodeConfigOrBuilder getLinuxNodeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Node kubelet configs.
   * </pre>
   *
   * <code>.google.container.v1.NodeKubeletConfig kubelet_config = 20;</code>
   *
   * @return Whether the kubeletConfig field is set.
   */
  boolean hasKubeletConfig();
  /**
   *
   *
   * <pre>
   * Node kubelet configs.
   * </pre>
   *
   * <code>.google.container.v1.NodeKubeletConfig kubelet_config = 20;</code>
   *
   * @return The kubeletConfig.
   */
  com.google.container.v1.NodeKubeletConfig getKubeletConfig();
  /**
   *
   *
   * <pre>
   * Node kubelet configs.
   * </pre>
   *
   * <code>.google.container.v1.NodeKubeletConfig kubelet_config = 20;</code>
   */
  com.google.container.v1.NodeKubeletConfigOrBuilder getKubeletConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Node network config.
   * </pre>
   *
   * <code>.google.container.v1.NodeNetworkConfig node_network_config = 21;</code>
   *
   * @return Whether the nodeNetworkConfig field is set.
   */
  boolean hasNodeNetworkConfig();
  /**
   *
   *
   * <pre>
   * Node network config.
   * </pre>
   *
   * <code>.google.container.v1.NodeNetworkConfig node_network_config = 21;</code>
   *
   * @return The nodeNetworkConfig.
   */
  com.google.container.v1.NodeNetworkConfig getNodeNetworkConfig();
  /**
   *
   *
   * <pre>
   * Node network config.
   * </pre>
   *
   * <code>.google.container.v1.NodeNetworkConfig node_network_config = 21;</code>
   */
  com.google.container.v1.NodeNetworkConfigOrBuilder getNodeNetworkConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * GCFS config.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 22;</code>
   *
   * @return Whether the gcfsConfig field is set.
   */
  boolean hasGcfsConfig();
  /**
   *
   *
   * <pre>
   * GCFS config.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 22;</code>
   *
   * @return The gcfsConfig.
   */
  com.google.container.v1.GcfsConfig getGcfsConfig();
  /**
   *
   *
   * <pre>
   * GCFS config.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 22;</code>
   */
  com.google.container.v1.GcfsConfigOrBuilder getGcfsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Confidential nodes config.
   * All the nodes in the node pool will be Confidential VM once enabled.
   * </pre>
   *
   * <code>.google.container.v1.ConfidentialNodes confidential_nodes = 23;</code>
   *
   * @return Whether the confidentialNodes field is set.
   */
  boolean hasConfidentialNodes();
  /**
   *
   *
   * <pre>
   * Confidential nodes config.
   * All the nodes in the node pool will be Confidential VM once enabled.
   * </pre>
   *
   * <code>.google.container.v1.ConfidentialNodes confidential_nodes = 23;</code>
   *
   * @return The confidentialNodes.
   */
  com.google.container.v1.ConfidentialNodes getConfidentialNodes();
  /**
   *
   *
   * <pre>
   * Confidential nodes config.
   * All the nodes in the node pool will be Confidential VM once enabled.
   * </pre>
   *
   * <code>.google.container.v1.ConfidentialNodes confidential_nodes = 23;</code>
   */
  com.google.container.v1.ConfidentialNodesOrBuilder getConfidentialNodesOrBuilder();

  /**
   *
   *
   * <pre>
   * Enable or disable gvnic on the node pool.
   * </pre>
   *
   * <code>.google.container.v1.VirtualNIC gvnic = 29;</code>
   *
   * @return Whether the gvnic field is set.
   */
  boolean hasGvnic();
  /**
   *
   *
   * <pre>
   * Enable or disable gvnic on the node pool.
   * </pre>
   *
   * <code>.google.container.v1.VirtualNIC gvnic = 29;</code>
   *
   * @return The gvnic.
   */
  com.google.container.v1.VirtualNIC getGvnic();
  /**
   *
   *
   * <pre>
   * Enable or disable gvnic on the node pool.
   * </pre>
   *
   * <code>.google.container.v1.VirtualNIC gvnic = 29;</code>
   */
  com.google.container.v1.VirtualNICOrBuilder getGvnicOrBuilder();

  /**
   *
   *
   * <pre>
   * The current etag of the node pool.
   * If an etag is provided and does not match the current etag of the node
   * pool, update will be blocked and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 30;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * The current etag of the node pool.
   * If an etag is provided and does not match the current etag of the node
   * pool, update will be blocked and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 30;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Enable or disable NCCL fast socket for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.FastSocket fast_socket = 31;</code>
   *
   * @return Whether the fastSocket field is set.
   */
  boolean hasFastSocket();
  /**
   *
   *
   * <pre>
   * Enable or disable NCCL fast socket for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.FastSocket fast_socket = 31;</code>
   *
   * @return The fastSocket.
   */
  com.google.container.v1.FastSocket getFastSocket();
  /**
   *
   *
   * <pre>
   * Enable or disable NCCL fast socket for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.FastSocket fast_socket = 31;</code>
   */
  com.google.container.v1.FastSocketOrBuilder getFastSocketOrBuilder();

  /**
   *
   *
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 32;</code>
   *
   * @return Whether the loggingConfig field is set.
   */
  boolean hasLoggingConfig();
  /**
   *
   *
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 32;</code>
   *
   * @return The loggingConfig.
   */
  com.google.container.v1.NodePoolLoggingConfig getLoggingConfig();
  /**
   *
   *
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 32;</code>
   */
  com.google.container.v1.NodePoolLoggingConfigOrBuilder getLoggingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource labels for the node pool to use to annotate any related
   * Google Compute Engine resources.
   * </pre>
   *
   * <code>.google.container.v1.ResourceLabels resource_labels = 33;</code>
   *
   * @return Whether the resourceLabels field is set.
   */
  boolean hasResourceLabels();
  /**
   *
   *
   * <pre>
   * The resource labels for the node pool to use to annotate any related
   * Google Compute Engine resources.
   * </pre>
   *
   * <code>.google.container.v1.ResourceLabels resource_labels = 33;</code>
   *
   * @return The resourceLabels.
   */
  com.google.container.v1.ResourceLabels getResourceLabels();
  /**
   *
   *
   * <pre>
   * The resource labels for the node pool to use to annotate any related
   * Google Compute Engine resources.
   * </pre>
   *
   * <code>.google.container.v1.ResourceLabels resource_labels = 33;</code>
   */
  com.google.container.v1.ResourceLabelsOrBuilder getResourceLabelsOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters that can be configured on Windows nodes.
   * </pre>
   *
   * <code>.google.container.v1.WindowsNodeConfig windows_node_config = 34;</code>
   *
   * @return Whether the windowsNodeConfig field is set.
   */
  boolean hasWindowsNodeConfig();
  /**
   *
   *
   * <pre>
   * Parameters that can be configured on Windows nodes.
   * </pre>
   *
   * <code>.google.container.v1.WindowsNodeConfig windows_node_config = 34;</code>
   *
   * @return The windowsNodeConfig.
   */
  com.google.container.v1.WindowsNodeConfig getWindowsNodeConfig();
  /**
   *
   *
   * <pre>
   * Parameters that can be configured on Windows nodes.
   * </pre>
   *
   * <code>.google.container.v1.WindowsNodeConfig windows_node_config = 34;</code>
   */
  com.google.container.v1.WindowsNodeConfigOrBuilder getWindowsNodeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 35;</code>
   */
  java.util.List<com.google.container.v1.AcceleratorConfig> getAcceleratorsList();
  /**
   *
   *
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 35;</code>
   */
  com.google.container.v1.AcceleratorConfig getAccelerators(int index);
  /**
   *
   *
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 35;</code>
   */
  int getAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 35;</code>
   */
  java.util.List<? extends com.google.container.v1.AcceleratorConfigOrBuilder>
      getAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 35;</code>
   */
  com.google.container.v1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The desired [Google Compute Engine machine
   * type](https://cloud.google.com/compute/docs/machine-types) for nodes in the
   * node pool. Initiates an upgrade operation that migrates the nodes in the
   * node pool to the specified machine type.
   * </pre>
   *
   * <code>string machine_type = 36 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Optional. The desired [Google Compute Engine machine
   * type](https://cloud.google.com/compute/docs/machine-types) for nodes in the
   * node pool. Initiates an upgrade operation that migrates the nodes in the
   * node pool to the specified machine type.
   * </pre>
   *
   * <code>string machine_type = 36 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The desired disk type (e.g. 'pd-standard', 'pd-ssd' or
   * 'pd-balanced') for nodes in the node pool.
   * Initiates an upgrade operation that migrates the nodes in the
   * node pool to the specified disk type.
   * </pre>
   *
   * <code>string disk_type = 37 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * Optional. The desired disk type (e.g. 'pd-standard', 'pd-ssd' or
   * 'pd-balanced') for nodes in the node pool.
   * Initiates an upgrade operation that migrates the nodes in the
   * node pool to the specified disk type.
   * </pre>
   *
   * <code>string disk_type = 37 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The desired disk size for nodes in the node pool specified in GB.
   * The smallest allowed disk size is 10GB.
   * Initiates an upgrade operation that migrates the nodes in the
   * node pool to the specified disk size.
   * </pre>
   *
   * <code>int64 disk_size_gb = 38 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Desired resource manager tag keys and values to be attached to the nodes
   * for managing Compute Engine firewalls using Network Firewall Policies.
   * Existing tags will be replaced with new values.
   * </pre>
   *
   * <code>.google.container.v1.ResourceManagerTags resource_manager_tags = 39;</code>
   *
   * @return Whether the resourceManagerTags field is set.
   */
  boolean hasResourceManagerTags();
  /**
   *
   *
   * <pre>
   * Desired resource manager tag keys and values to be attached to the nodes
   * for managing Compute Engine firewalls using Network Firewall Policies.
   * Existing tags will be replaced with new values.
   * </pre>
   *
   * <code>.google.container.v1.ResourceManagerTags resource_manager_tags = 39;</code>
   *
   * @return The resourceManagerTags.
   */
  com.google.container.v1.ResourceManagerTags getResourceManagerTags();
  /**
   *
   *
   * <pre>
   * Desired resource manager tag keys and values to be attached to the nodes
   * for managing Compute Engine firewalls using Network Firewall Policies.
   * Existing tags will be replaced with new values.
   * </pre>
   *
   * <code>.google.container.v1.ResourceManagerTags resource_manager_tags = 39;</code>
   */
  com.google.container.v1.ResourceManagerTagsOrBuilder getResourceManagerTagsOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired containerd config for nodes in the node pool.
   * Initiates an upgrade operation that recreates the nodes with the new
   * config.
   * </pre>
   *
   * <code>.google.container.v1.ContainerdConfig containerd_config = 40;</code>
   *
   * @return Whether the containerdConfig field is set.
   */
  boolean hasContainerdConfig();
  /**
   *
   *
   * <pre>
   * The desired containerd config for nodes in the node pool.
   * Initiates an upgrade operation that recreates the nodes with the new
   * config.
   * </pre>
   *
   * <code>.google.container.v1.ContainerdConfig containerd_config = 40;</code>
   *
   * @return The containerdConfig.
   */
  com.google.container.v1.ContainerdConfig getContainerdConfig();
  /**
   *
   *
   * <pre>
   * The desired containerd config for nodes in the node pool.
   * Initiates an upgrade operation that recreates the nodes with the new
   * config.
   * </pre>
   *
   * <code>.google.container.v1.ContainerdConfig containerd_config = 40;</code>
   */
  com.google.container.v1.ContainerdConfigOrBuilder getContainerdConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the configuration of queued provisioning.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.QueuedProvisioning queued_provisioning = 42;</code>
   *
   * @return Whether the queuedProvisioning field is set.
   */
  boolean hasQueuedProvisioning();
  /**
   *
   *
   * <pre>
   * Specifies the configuration of queued provisioning.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.QueuedProvisioning queued_provisioning = 42;</code>
   *
   * @return The queuedProvisioning.
   */
  com.google.container.v1.NodePool.QueuedProvisioning getQueuedProvisioning();
  /**
   *
   *
   * <pre>
   * Specifies the configuration of queued provisioning.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.QueuedProvisioning queued_provisioning = 42;</code>
   */
  com.google.container.v1.NodePool.QueuedProvisioningOrBuilder getQueuedProvisioningOrBuilder();

  /**
   *
   *
   * <pre>
   * List of Storage Pools where boot disks are provisioned.
   * Existing Storage Pools will be replaced with storage-pools.
   * </pre>
   *
   * <code>repeated string storage_pools = 43;</code>
   *
   * @return A list containing the storagePools.
   */
  java.util.List<java.lang.String> getStoragePoolsList();
  /**
   *
   *
   * <pre>
   * List of Storage Pools where boot disks are provisioned.
   * Existing Storage Pools will be replaced with storage-pools.
   * </pre>
   *
   * <code>repeated string storage_pools = 43;</code>
   *
   * @return The count of storagePools.
   */
  int getStoragePoolsCount();
  /**
   *
   *
   * <pre>
   * List of Storage Pools where boot disks are provisioned.
   * Existing Storage Pools will be replaced with storage-pools.
   * </pre>
   *
   * <code>repeated string storage_pools = 43;</code>
   *
   * @param index The index of the element to return.
   * @return The storagePools at the given index.
   */
  java.lang.String getStoragePools(int index);
  /**
   *
   *
   * <pre>
   * List of Storage Pools where boot disks are provisioned.
   * Existing Storage Pools will be replaced with storage-pools.
   * </pre>
   *
   * <code>repeated string storage_pools = 43;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the storagePools at the given index.
   */
  com.google.protobuf.ByteString getStoragePoolsBytes(int index);
}
