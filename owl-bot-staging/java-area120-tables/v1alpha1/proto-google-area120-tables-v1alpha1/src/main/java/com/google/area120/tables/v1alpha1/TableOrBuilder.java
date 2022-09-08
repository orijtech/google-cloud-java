// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface TableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.Table)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the table.
   * Table names have the form `tables/{table}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the table.
   * Table names have the form `tables/{table}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The human readable title of the table.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The human readable title of the table.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  java.util.List<com.google.area120.tables.v1alpha1.ColumnDescription> 
      getColumnsList();
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  com.google.area120.tables.v1alpha1.ColumnDescription getColumns(int index);
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  int getColumnsCount();
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  java.util.List<? extends com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder getColumnsOrBuilder(
      int index);
}