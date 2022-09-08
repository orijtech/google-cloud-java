// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/common.proto

package com.google.cloud.gaming.v1;

public interface SpecSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.SpecSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The game server config resource. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}/configs/{config_id}`.
   * </pre>
   *
   * <code>string game_server_config_name = 1;</code>
   * @return The gameServerConfigName.
   */
  java.lang.String getGameServerConfigName();
  /**
   * <pre>
   * The game server config resource. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}/configs/{config_id}`.
   * </pre>
   *
   * <code>string game_server_config_name = 1;</code>
   * @return The bytes for gameServerConfigName.
   */
  com.google.protobuf.ByteString
      getGameServerConfigNameBytes();

  /**
   * <pre>
   * The name of the Agones leet config or Agones scaling config used to derive
   * the Agones fleet or Agones autoscaler spec.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the Agones leet config or Agones scaling config used to derive
   * the Agones fleet or Agones autoscaler spec.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}