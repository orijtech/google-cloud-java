// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetExternalVpnGatewayRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetExternalVpnGatewayRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the externalVpnGateway to return.
   * </pre>
   *
   * <code>string external_vpn_gateway = 109898629 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The externalVpnGateway.
   */
  java.lang.String getExternalVpnGateway();
  /**
   * <pre>
   * Name of the externalVpnGateway to return.
   * </pre>
   *
   * <code>string external_vpn_gateway = 109898629 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for externalVpnGateway.
   */
  com.google.protobuf.ByteString
      getExternalVpnGatewayBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();
}