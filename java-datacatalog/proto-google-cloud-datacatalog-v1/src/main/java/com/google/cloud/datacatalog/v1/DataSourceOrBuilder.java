/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datacatalog/v1/data_source.proto

package com.google.cloud.datacatalog.v1;

public interface DataSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.DataSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Service that physically stores the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
   *
   * @return The enum numeric value on the wire for service.
   */
  int getServiceValue();
  /**
   *
   *
   * <pre>
   * Service that physically stores the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
   *
   * @return The service.
   */
  com.google.cloud.datacatalog.v1.DataSource.Service getService();

  /**
   *
   *
   * <pre>
   * Full name of a resource as defined by the service. For example:
   *
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Full name of a resource as defined by the service. For example:
   *
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Output only. Data Catalog entry name, if applicable.
   * </pre>
   *
   * <code>string source_entry = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sourceEntry.
   */
  java.lang.String getSourceEntry();
  /**
   *
   *
   * <pre>
   * Output only. Data Catalog entry name, if applicable.
   * </pre>
   *
   * <code>string source_entry = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for sourceEntry.
   */
  com.google.protobuf.ByteString getSourceEntryBytes();

  /**
   *
   *
   * <pre>
   * Detailed properties of the underlying storage.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.StorageProperties storage_properties = 4;</code>
   *
   * @return Whether the storageProperties field is set.
   */
  boolean hasStorageProperties();
  /**
   *
   *
   * <pre>
   * Detailed properties of the underlying storage.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.StorageProperties storage_properties = 4;</code>
   *
   * @return The storageProperties.
   */
  com.google.cloud.datacatalog.v1.StorageProperties getStorageProperties();
  /**
   *
   *
   * <pre>
   * Detailed properties of the underlying storage.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.StorageProperties storage_properties = 4;</code>
   */
  com.google.cloud.datacatalog.v1.StoragePropertiesOrBuilder getStoragePropertiesOrBuilder();

  com.google.cloud.datacatalog.v1.DataSource.PropertiesCase getPropertiesCase();
}
