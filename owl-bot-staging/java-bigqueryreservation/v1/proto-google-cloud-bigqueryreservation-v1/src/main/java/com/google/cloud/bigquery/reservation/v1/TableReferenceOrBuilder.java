// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface TableReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.TableReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The assigned project ID of the project.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The assigned project ID of the project.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The ID of the dataset in the above project.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <pre>
   * The ID of the dataset in the above project.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <pre>
   * The ID of the table in the above dataset.
   * </pre>
   *
   * <code>string table_id = 3;</code>
   * @return The tableId.
   */
  java.lang.String getTableId();
  /**
   * <pre>
   * The ID of the table in the above dataset.
   * </pre>
   *
   * <code>string table_id = 3;</code>
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString
      getTableIdBytes();
}