// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AzureNodeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureNodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The Azure VM size name. Example: `Standard_DS2_v2`.
   * See [Supported VM
   * sizes](/anthos/clusters/docs/azure/reference/supported-vms) for options.
   * When unspecified, it defaults to `Standard_DS2_v2`.
   * </pre>
   *
   * <code>string vm_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The vmSize.
   */
  java.lang.String getVmSize();
  /**
   * <pre>
   * Optional. The Azure VM size name. Example: `Standard_DS2_v2`.
   * See [Supported VM
   * sizes](/anthos/clusters/docs/azure/reference/supported-vms) for options.
   * When unspecified, it defaults to `Standard_DS2_v2`.
   * </pre>
   *
   * <code>string vm_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for vmSize.
   */
  com.google.protobuf.ByteString
      getVmSizeBytes();

  /**
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * node pool machine.
   * When unspecified, it defaults to a 32-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate root_volume = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the rootVolume field is set.
   */
  boolean hasRootVolume();
  /**
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * node pool machine.
   * When unspecified, it defaults to a 32-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate root_volume = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rootVolume.
   */
  com.google.cloud.gkemulticloud.v1.AzureDiskTemplate getRootVolume();
  /**
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * node pool machine.
   * When unspecified, it defaults to a 32-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate root_volume = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureDiskTemplateOrBuilder getRootVolumeOrBuilder();

  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying Azure resources for this node
   * pool. This currently only includes Virtual Machine Scale Sets.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying Azure resources for this node
   * pool. This currently only includes Virtual Machine Scale Sets.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying Azure resources for this node
   * pool. This currently only includes Virtual Machine Scale Sets.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying Azure resources for this node
   * pool. This currently only includes Virtual Machine Scale Sets.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying Azure resources for this node
   * pool. This currently only includes Virtual Machine Scale Sets.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. The OS image type to use on node pool instances.
   * Can have a value of `ubuntu`, or `windows` if the cluster enables
   * the Windows node pool preview feature.
   * When unspecified, it defaults to `ubuntu`.
   * </pre>
   *
   * <code>string image_type = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The imageType.
   */
  java.lang.String getImageType();
  /**
   * <pre>
   * Optional. The OS image type to use on node pool instances.
   * Can have a value of `ubuntu`, or `windows` if the cluster enables
   * the Windows node pool preview feature.
   * When unspecified, it defaults to `ubuntu`.
   * </pre>
   *
   * <code>string image_type = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for imageType.
   */
  com.google.protobuf.ByteString
      getImageTypeBytes();

  /**
   * <pre>
   * Required. SSH configuration for how to access the node pool machines.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureSshConfig ssh_config = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the sshConfig field is set.
   */
  boolean hasSshConfig();
  /**
   * <pre>
   * Required. SSH configuration for how to access the node pool machines.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureSshConfig ssh_config = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sshConfig.
   */
  com.google.cloud.gkemulticloud.v1.AzureSshConfig getSshConfig();
  /**
   * <pre>
   * Required. SSH configuration for how to access the node pool machines.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureSshConfig ssh_config = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureSshConfigOrBuilder getSshConfigOrBuilder();

  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureProxyConfig proxy_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the proxyConfig field is set.
   */
  boolean hasProxyConfig();
  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureProxyConfig proxy_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The proxyConfig.
   */
  com.google.cloud.gkemulticloud.v1.AzureProxyConfig getProxyConfig();
  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureProxyConfig proxy_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureProxyConfigOrBuilder getProxyConfigOrBuilder();

  /**
   * <pre>
   * Optional. Configuration related to vm config encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureConfigEncryption config_encryption = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the configEncryption field is set.
   */
  boolean hasConfigEncryption();
  /**
   * <pre>
   * Optional. Configuration related to vm config encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureConfigEncryption config_encryption = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The configEncryption.
   */
  com.google.cloud.gkemulticloud.v1.AzureConfigEncryption getConfigEncryption();
  /**
   * <pre>
   * Optional. Configuration related to vm config encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureConfigEncryption config_encryption = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureConfigEncryptionOrBuilder getConfigEncryptionOrBuilder();

  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.NodeTaint> 
      getTaintsList();
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.NodeTaint getTaints(int index);
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getTaintsCount();
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.NodeTaintOrBuilder> 
      getTaintsOrBuilderList();
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.NodeTaintOrBuilder getTaintsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}