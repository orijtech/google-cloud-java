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
// source: google/cloud/alloydb/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1;

public interface ClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Cluster created from backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.BackupSource backup_source = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the backupSource field is set.
   */
  boolean hasBackupSource();
  /**
   *
   *
   * <pre>
   * Output only. Cluster created from backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.BackupSource backup_source = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The backupSource.
   */
  com.google.cloud.alloydb.v1.BackupSource getBackupSource();
  /**
   *
   *
   * <pre>
   * Output only. Cluster created from backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.BackupSource backup_source = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.BackupSourceOrBuilder getBackupSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Cluster created via DMS migration.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MigrationSource migration_source = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the migrationSource field is set.
   */
  boolean hasMigrationSource();
  /**
   *
   *
   * <pre>
   * Output only. Cluster created via DMS migration.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MigrationSource migration_source = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The migrationSource.
   */
  com.google.cloud.alloydb.v1.MigrationSource getMigrationSource();
  /**
   *
   *
   * <pre>
   * Output only. Cluster created via DMS migration.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MigrationSource migration_source = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.MigrationSourceOrBuilder getMigrationSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the cluster resource with the format:
   *  * projects/{project}/locations/{region}/clusters/{cluster_id}
   * where the cluster ID segment should satisfy the regex expression
   * `[a-z0-9-]+`. For more details see https://google.aip.dev/122.
   * The prefix of the cluster resource name is the name of the parent resource:
   *  * projects/{project}/locations/{region}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the cluster resource with the format:
   *  * projects/{project}/locations/{region}/clusters/{cluster_id}
   * where the cluster ID segment should satisfy the regex expression
   * `[a-z0-9-]+`. For more details see https://google.aip.dev/122.
   * The prefix of the cluster resource name is the name of the parent resource:
   *  * projects/{project}/locations/{region}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User-settable and human-readable display name for the Cluster.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * User-settable and human-readable display name for the Cluster.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the resource. The UID is assigned
   * when the resource is created, and it is retained until it is deleted.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the resource. The UID is assigned
   * when the resource is created, and it is retained until it is deleted.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The current serving state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current serving state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.alloydb.v1.Cluster.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The type of the cluster. This is an output-only field and it's
   * populated at the Cluster creation time or the Cluster promotion
   * time. The cluster type is determined by which RPC was used to create
   * the cluster (i.e. `CreateCluster` vs. `CreateSecondaryCluster`
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.ClusterType cluster_type = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for clusterType.
   */
  int getClusterTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of the cluster. This is an output-only field and it's
   * populated at the Cluster creation time or the Cluster promotion
   * time. The cluster type is determined by which RPC was used to create
   * the cluster (i.e. `CreateCluster` vs. `CreateSecondaryCluster`
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.ClusterType cluster_type = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The clusterType.
   */
  com.google.cloud.alloydb.v1.Cluster.ClusterType getClusterType();

  /**
   *
   *
   * <pre>
   * Optional. The database engine major version. This is an optional field and
   * it is populated at the Cluster creation time. If a database version is not
   * supplied at cluster creation time, then a default database version will
   * be used.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.DatabaseVersion database_version = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for databaseVersion.
   */
  int getDatabaseVersionValue();
  /**
   *
   *
   * <pre>
   * Optional. The database engine major version. This is an optional field and
   * it is populated at the Cluster creation time. If a database version is not
   * supplied at cluster creation time, then a default database version will
   * be used.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.DatabaseVersion database_version = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The databaseVersion.
   */
  com.google.cloud.alloydb.v1.DatabaseVersion getDatabaseVersion();

  /**
   * <code>
   * .google.cloud.alloydb.v1.Cluster.NetworkConfig network_config = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the networkConfig field is set.
   */
  boolean hasNetworkConfig();
  /**
   * <code>
   * .google.cloud.alloydb.v1.Cluster.NetworkConfig network_config = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The networkConfig.
   */
  com.google.cloud.alloydb.v1.Cluster.NetworkConfig getNetworkConfig();
  /**
   * <code>
   * .google.cloud.alloydb.v1.Cluster.NetworkConfig network_config = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.alloydb.v1.Cluster.NetworkConfigOrBuilder getNetworkConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource link for the VPC network in which cluster resources
   * are created and from which they are accessible via Private IP. The network
   * must belong to the same project as the cluster. It is specified in the
   * form: `projects/{project}/global/networks/{network_id}`. This is required
   * to create a cluster. Deprecated, use network_config.network instead.
   * </pre>
   *
   * <code>
   * string network = 10 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.alloydb.v1.Cluster.network is deprecated. See
   *     google/cloud/alloydb/v1/resources.proto;l=616
   * @return The network.
   */
  @java.lang.Deprecated
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Required. The resource link for the VPC network in which cluster resources
   * are created and from which they are accessible via Private IP. The network
   * must belong to the same project as the cluster. It is specified in the
   * form: `projects/{project}/global/networks/{network_id}`. This is required
   * to create a cluster. Deprecated, use network_config.network instead.
   * </pre>
   *
   * <code>
   * string network = 10 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.alloydb.v1.Cluster.network is deprecated. See
   *     google/cloud/alloydb/v1/resources.proto;l=616
   * @return The bytes for network.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * For Resource freshness validation (https://google.aip.dev/154)
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * For Resource freshness validation (https://google.aip.dev/154)
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Reconciling (https://google.aip.dev/128#reconciliation).
   * Set to true if the current state of Cluster does not match the user's
   * intended state, and the service is actively updating the resource to
   * reconcile them. This can happen due to user-triggered updates or
   * system actions like failover or maintenance.
   * </pre>
   *
   * <code>bool reconciling = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Input only. Initial user to setup during cluster creation. Required.
   * If used in `RestoreCluster` this is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.UserPassword initial_user = 14 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return Whether the initialUser field is set.
   */
  boolean hasInitialUser();
  /**
   *
   *
   * <pre>
   * Input only. Initial user to setup during cluster creation. Required.
   * If used in `RestoreCluster` this is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.UserPassword initial_user = 14 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The initialUser.
   */
  com.google.cloud.alloydb.v1.UserPassword getInitialUser();
  /**
   *
   *
   * <pre>
   * Input only. Initial user to setup during cluster creation. Required.
   * If used in `RestoreCluster` this is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.UserPassword initial_user = 14 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.UserPasswordOrBuilder getInitialUserOrBuilder();

  /**
   *
   *
   * <pre>
   * The automated backup policy for this cluster.
   *
   * If no policy is provided then the default policy will be used. If backups
   * are supported for the cluster, the default policy takes one backup a day,
   * has a backup window of 1 hour, and retains backups for 14 days.
   * For more information on the defaults, consult the
   * documentation for the message type.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.AutomatedBackupPolicy automated_backup_policy = 17;</code>
   *
   * @return Whether the automatedBackupPolicy field is set.
   */
  boolean hasAutomatedBackupPolicy();
  /**
   *
   *
   * <pre>
   * The automated backup policy for this cluster.
   *
   * If no policy is provided then the default policy will be used. If backups
   * are supported for the cluster, the default policy takes one backup a day,
   * has a backup window of 1 hour, and retains backups for 14 days.
   * For more information on the defaults, consult the
   * documentation for the message type.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.AutomatedBackupPolicy automated_backup_policy = 17;</code>
   *
   * @return The automatedBackupPolicy.
   */
  com.google.cloud.alloydb.v1.AutomatedBackupPolicy getAutomatedBackupPolicy();
  /**
   *
   *
   * <pre>
   * The automated backup policy for this cluster.
   *
   * If no policy is provided then the default policy will be used. If backups
   * are supported for the cluster, the default policy takes one backup a day,
   * has a backup window of 1 hour, and retains backups for 14 days.
   * For more information on the defaults, consult the
   * documentation for the message type.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.AutomatedBackupPolicy automated_backup_policy = 17;</code>
   */
  com.google.cloud.alloydb.v1.AutomatedBackupPolicyOrBuilder getAutomatedBackupPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * SSL configuration for this AlloyDB cluster.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.SslConfig ssl_config = 18 [deprecated = true];</code>
   *
   * @deprecated google.cloud.alloydb.v1.Cluster.ssl_config is deprecated. See
   *     google/cloud/alloydb/v1/resources.proto;l=651
   * @return Whether the sslConfig field is set.
   */
  @java.lang.Deprecated
  boolean hasSslConfig();
  /**
   *
   *
   * <pre>
   * SSL configuration for this AlloyDB cluster.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.SslConfig ssl_config = 18 [deprecated = true];</code>
   *
   * @deprecated google.cloud.alloydb.v1.Cluster.ssl_config is deprecated. See
   *     google/cloud/alloydb/v1/resources.proto;l=651
   * @return The sslConfig.
   */
  @java.lang.Deprecated
  com.google.cloud.alloydb.v1.SslConfig getSslConfig();
  /**
   *
   *
   * <pre>
   * SSL configuration for this AlloyDB cluster.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.SslConfig ssl_config = 18 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.cloud.alloydb.v1.SslConfigOrBuilder getSslConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the data disks
   * and other persistent data resources of a cluster with a
   * customer-managed encryption key (CMEK). When this field is not
   * specified, the cluster will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionConfig encryption_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the data disks
   * and other persistent data resources of a cluster with a
   * customer-managed encryption key (CMEK). When this field is not
   * specified, the cluster will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionConfig encryption_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.cloud.alloydb.v1.EncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the data disks
   * and other persistent data resources of a cluster with a
   * customer-managed encryption key (CMEK). When this field is not
   * specified, the cluster will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionConfig encryption_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.alloydb.v1.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionInfo encryption_info = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionInfo field is set.
   */
  boolean hasEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionInfo encryption_info = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionInfo.
   */
  com.google.cloud.alloydb.v1.EncryptionInfo getEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionInfo encryption_info = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.EncryptionInfoOrBuilder getEncryptionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Continuous backup configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.ContinuousBackupConfig continuous_backup_config = 27 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the continuousBackupConfig field is set.
   */
  boolean hasContinuousBackupConfig();
  /**
   *
   *
   * <pre>
   * Optional. Continuous backup configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.ContinuousBackupConfig continuous_backup_config = 27 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The continuousBackupConfig.
   */
  com.google.cloud.alloydb.v1.ContinuousBackupConfig getContinuousBackupConfig();
  /**
   *
   *
   * <pre>
   * Optional. Continuous backup configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.ContinuousBackupConfig continuous_backup_config = 27 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.alloydb.v1.ContinuousBackupConfigOrBuilder getContinuousBackupConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Continuous backup properties for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.ContinuousBackupInfo continuous_backup_info = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the continuousBackupInfo field is set.
   */
  boolean hasContinuousBackupInfo();
  /**
   *
   *
   * <pre>
   * Output only. Continuous backup properties for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.ContinuousBackupInfo continuous_backup_info = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The continuousBackupInfo.
   */
  com.google.cloud.alloydb.v1.ContinuousBackupInfo getContinuousBackupInfo();
  /**
   *
   *
   * <pre>
   * Output only. Continuous backup properties for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.ContinuousBackupInfo continuous_backup_info = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.ContinuousBackupInfoOrBuilder getContinuousBackupInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Cross Region replication config specific to SECONDARY cluster.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Cluster.SecondaryConfig secondary_config = 22;</code>
   *
   * @return Whether the secondaryConfig field is set.
   */
  boolean hasSecondaryConfig();
  /**
   *
   *
   * <pre>
   * Cross Region replication config specific to SECONDARY cluster.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Cluster.SecondaryConfig secondary_config = 22;</code>
   *
   * @return The secondaryConfig.
   */
  com.google.cloud.alloydb.v1.Cluster.SecondaryConfig getSecondaryConfig();
  /**
   *
   *
   * <pre>
   * Cross Region replication config specific to SECONDARY cluster.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Cluster.SecondaryConfig secondary_config = 22;</code>
   */
  com.google.cloud.alloydb.v1.Cluster.SecondaryConfigOrBuilder getSecondaryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Cross Region replication config specific to PRIMARY cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.PrimaryConfig primary_config = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the primaryConfig field is set.
   */
  boolean hasPrimaryConfig();
  /**
   *
   *
   * <pre>
   * Output only. Cross Region replication config specific to PRIMARY cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.PrimaryConfig primary_config = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The primaryConfig.
   */
  com.google.cloud.alloydb.v1.Cluster.PrimaryConfig getPrimaryConfig();
  /**
   *
   *
   * <pre>
   * Output only. Cross Region replication config specific to PRIMARY cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.PrimaryConfig primary_config = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.Cluster.PrimaryConfigOrBuilder getPrimaryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Optional. The configuration for Private Service Connect (PSC) for the
   * cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.PscConfig psc_config = 31 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the pscConfig field is set.
   */
  boolean hasPscConfig();
  /**
   *
   *
   * <pre>
   * Optional. The configuration for Private Service Connect (PSC) for the
   * cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.PscConfig psc_config = 31 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The pscConfig.
   */
  com.google.cloud.alloydb.v1.Cluster.PscConfig getPscConfig();
  /**
   *
   *
   * <pre>
   * Optional. The configuration for Private Service Connect (PSC) for the
   * cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.PscConfig psc_config = 31 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.alloydb.v1.Cluster.PscConfigOrBuilder getPscConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The maintenance update policy determines when to allow or deny
   * updates.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MaintenanceUpdatePolicy maintenance_update_policy = 32 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maintenanceUpdatePolicy field is set.
   */
  boolean hasMaintenanceUpdatePolicy();
  /**
   *
   *
   * <pre>
   * Optional. The maintenance update policy determines when to allow or deny
   * updates.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MaintenanceUpdatePolicy maintenance_update_policy = 32 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maintenanceUpdatePolicy.
   */
  com.google.cloud.alloydb.v1.MaintenanceUpdatePolicy getMaintenanceUpdatePolicy();
  /**
   *
   *
   * <pre>
   * Optional. The maintenance update policy determines when to allow or deny
   * updates.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MaintenanceUpdatePolicy maintenance_update_policy = 32 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.alloydb.v1.MaintenanceUpdatePolicyOrBuilder
      getMaintenanceUpdatePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The maintenance schedule for the cluster, generated for a
   * specific rollout if a maintenance window is set.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MaintenanceSchedule maintenance_schedule = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the maintenanceSchedule field is set.
   */
  boolean hasMaintenanceSchedule();
  /**
   *
   *
   * <pre>
   * Output only. The maintenance schedule for the cluster, generated for a
   * specific rollout if a maintenance window is set.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MaintenanceSchedule maintenance_schedule = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The maintenanceSchedule.
   */
  com.google.cloud.alloydb.v1.MaintenanceSchedule getMaintenanceSchedule();
  /**
   *
   *
   * <pre>
   * Output only. The maintenance schedule for the cluster, generated for a
   * specific rollout if a maintenance window is set.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.MaintenanceSchedule maintenance_schedule = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.MaintenanceScheduleOrBuilder getMaintenanceScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Subscription type of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SubscriptionType subscription_type = 38 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for subscriptionType.
   */
  int getSubscriptionTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. Subscription type of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SubscriptionType subscription_type = 38 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The subscriptionType.
   */
  com.google.cloud.alloydb.v1.SubscriptionType getSubscriptionType();

  /**
   *
   *
   * <pre>
   * Output only. Metadata for free trial clusters
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.TrialMetadata trial_metadata = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the trialMetadata field is set.
   */
  boolean hasTrialMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata for free trial clusters
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.TrialMetadata trial_metadata = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The trialMetadata.
   */
  com.google.cloud.alloydb.v1.Cluster.TrialMetadata getTrialMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata for free trial clusters
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Cluster.TrialMetadata trial_metadata = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.Cluster.TrialMetadataOrBuilder getTrialMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 41 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 41 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsTags(java.lang.String key);
  /** Use {@link #getTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getTags();
  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 41 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getTagsMap();
  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 41 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 41 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getTagsOrThrow(java.lang.String key);

  com.google.cloud.alloydb.v1.Cluster.SourceCase getSourceCase();
}
