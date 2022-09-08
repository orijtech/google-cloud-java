// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/streaming.proto

package com.google.dataflow.v1beta3;

public interface MountedDataDiskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.MountedDataDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the data disk.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 1;</code>
   * @return The dataDisk.
   */
  java.lang.String getDataDisk();
  /**
   * <pre>
   * The name of the data disk.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 1;</code>
   * @return The bytes for dataDisk.
   */
  com.google.protobuf.ByteString
      getDataDiskBytes();
}