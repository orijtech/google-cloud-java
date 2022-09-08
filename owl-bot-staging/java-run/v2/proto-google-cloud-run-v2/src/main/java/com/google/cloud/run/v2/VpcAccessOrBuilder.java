// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/vendor_settings.proto

package com.google.cloud.run.v2;

public interface VpcAccessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.VpcAccess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * VPC Access connector name.
   * Format: projects/{project}/locations/{location}/connectors/{connector}
   * </pre>
   *
   * <code>string connector = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The connector.
   */
  java.lang.String getConnector();
  /**
   * <pre>
   * VPC Access connector name.
   * Format: projects/{project}/locations/{location}/connectors/{connector}
   * </pre>
   *
   * <code>string connector = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for connector.
   */
  com.google.protobuf.ByteString
      getConnectorBytes();

  /**
   * <pre>
   * Traffic VPC egress settings.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess.VpcEgress egress = 2;</code>
   * @return The enum numeric value on the wire for egress.
   */
  int getEgressValue();
  /**
   * <pre>
   * Traffic VPC egress settings.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess.VpcEgress egress = 2;</code>
   * @return The egress.
   */
  com.google.cloud.run.v2.VpcAccess.VpcEgress getEgress();
}