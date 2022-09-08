// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

public interface ComputeResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.ComputeResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The milliCPU count.
   * </pre>
   *
   * <code>int64 cpu_milli = 1;</code>
   * @return The cpuMilli.
   */
  long getCpuMilli();

  /**
   * <pre>
   * Memory in MiB.
   * </pre>
   *
   * <code>int64 memory_mib = 2;</code>
   * @return The memoryMib.
   */
  long getMemoryMib();

  /**
   * <pre>
   * Extra boot disk size in MiB for each task.
   * </pre>
   *
   * <code>int64 boot_disk_mib = 4;</code>
   * @return The bootDiskMib.
   */
  long getBootDiskMib();
}