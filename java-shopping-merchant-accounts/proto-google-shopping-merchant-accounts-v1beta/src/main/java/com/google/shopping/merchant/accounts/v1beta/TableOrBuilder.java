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
// source: google/shopping/merchant/accounts/v1beta/shippingsettings.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.accounts.v1beta;

public interface TableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.Table)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the table. Required for subtables, ignored for the main table.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the table. Required for subtables, ignored for the main table.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the table. Required for subtables, ignored for the main table.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Headers of the table's rows.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.Headers row_headers = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rowHeaders field is set.
   */
  boolean hasRowHeaders();
  /**
   *
   *
   * <pre>
   * Required. Headers of the table's rows.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.Headers row_headers = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rowHeaders.
   */
  com.google.shopping.merchant.accounts.v1beta.Headers getRowHeaders();
  /**
   *
   *
   * <pre>
   * Required. Headers of the table's rows.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.Headers row_headers = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.HeadersOrBuilder getRowHeadersOrBuilder();

  /**
   *
   *
   * <pre>
   * Headers of the table's columns. Optional: if not set then the table has
   * only one dimension.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Headers column_headers = 3;</code>
   *
   * @return Whether the columnHeaders field is set.
   */
  boolean hasColumnHeaders();
  /**
   *
   *
   * <pre>
   * Headers of the table's columns. Optional: if not set then the table has
   * only one dimension.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Headers column_headers = 3;</code>
   *
   * @return The columnHeaders.
   */
  com.google.shopping.merchant.accounts.v1beta.Headers getColumnHeaders();
  /**
   *
   *
   * <pre>
   * Headers of the table's columns. Optional: if not set then the table has
   * only one dimension.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Headers column_headers = 3;</code>
   */
  com.google.shopping.merchant.accounts.v1beta.HeadersOrBuilder getColumnHeadersOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of rows that constitute the table. Must have the same
   * length as `row_headers`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Row rows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.shopping.merchant.accounts.v1beta.Row> getRowsList();
  /**
   *
   *
   * <pre>
   * Required. The list of rows that constitute the table. Must have the same
   * length as `row_headers`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Row rows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.Row getRows(int index);
  /**
   *
   *
   * <pre>
   * Required. The list of rows that constitute the table. Must have the same
   * length as `row_headers`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Row rows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRowsCount();
  /**
   *
   *
   * <pre>
   * Required. The list of rows that constitute the table. Must have the same
   * length as `row_headers`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Row rows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.shopping.merchant.accounts.v1beta.RowOrBuilder>
      getRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The list of rows that constitute the table. Must have the same
   * length as `row_headers`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Row rows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.RowOrBuilder getRowsOrBuilder(int index);
}
