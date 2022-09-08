// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/vendor_settings.proto

package com.google.cloud.run.v2;

public interface RevisionScalingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.RevisionScaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Minimum number of serving instances that this resource should have.
   * </pre>
   *
   * <code>int32 min_instance_count = 1;</code>
   * @return The minInstanceCount.
   */
  int getMinInstanceCount();

  /**
   * <pre>
   * Maximum number of serving instances that this resource should have.
   * </pre>
   *
   * <code>int32 max_instance_count = 2;</code>
   * @return The maxInstanceCount.
   */
  int getMaxInstanceCount();
}