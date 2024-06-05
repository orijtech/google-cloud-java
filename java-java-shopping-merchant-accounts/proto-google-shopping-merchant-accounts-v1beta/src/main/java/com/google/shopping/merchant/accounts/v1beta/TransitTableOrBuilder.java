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

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

public interface TransitTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.TransitTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A list of region names
   * [Region.name][google.shopping.merchant.accounts.v1beta.Region.name] . The
   * last value can be
   * `"all other locations"`. Example:
   * `["zone 1", "zone 2", "all other locations"]`. The referred
   * postal code groups must match the delivery country of the service.
   * </pre>
   *
   * <code>repeated string postal_code_group_names = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the postalCodeGroupNames.
   */
  java.util.List<java.lang.String> getPostalCodeGroupNamesList();
  /**
   *
   *
   * <pre>
   * Required. A list of region names
   * [Region.name][google.shopping.merchant.accounts.v1beta.Region.name] . The
   * last value can be
   * `"all other locations"`. Example:
   * `["zone 1", "zone 2", "all other locations"]`. The referred
   * postal code groups must match the delivery country of the service.
   * </pre>
   *
   * <code>repeated string postal_code_group_names = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of postalCodeGroupNames.
   */
  int getPostalCodeGroupNamesCount();
  /**
   *
   *
   * <pre>
   * Required. A list of region names
   * [Region.name][google.shopping.merchant.accounts.v1beta.Region.name] . The
   * last value can be
   * `"all other locations"`. Example:
   * `["zone 1", "zone 2", "all other locations"]`. The referred
   * postal code groups must match the delivery country of the service.
   * </pre>
   *
   * <code>repeated string postal_code_group_names = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The postalCodeGroupNames at the given index.
   */
  java.lang.String getPostalCodeGroupNames(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of region names
   * [Region.name][google.shopping.merchant.accounts.v1beta.Region.name] . The
   * last value can be
   * `"all other locations"`. Example:
   * `["zone 1", "zone 2", "all other locations"]`. The referred
   * postal code groups must match the delivery country of the service.
   * </pre>
   *
   * <code>repeated string postal_code_group_names = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the postalCodeGroupNames at the given index.
   */
  com.google.protobuf.ByteString getPostalCodeGroupNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. A list of transit time labels. The last value can be
   * `"all other labels"`. Example:
   * `["food", "electronics", "all other labels"]`.
   * </pre>
   *
   * <code>repeated string transit_time_labels = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the transitTimeLabels.
   */
  java.util.List<java.lang.String> getTransitTimeLabelsList();
  /**
   *
   *
   * <pre>
   * Required. A list of transit time labels. The last value can be
   * `"all other labels"`. Example:
   * `["food", "electronics", "all other labels"]`.
   * </pre>
   *
   * <code>repeated string transit_time_labels = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of transitTimeLabels.
   */
  int getTransitTimeLabelsCount();
  /**
   *
   *
   * <pre>
   * Required. A list of transit time labels. The last value can be
   * `"all other labels"`. Example:
   * `["food", "electronics", "all other labels"]`.
   * </pre>
   *
   * <code>repeated string transit_time_labels = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The transitTimeLabels at the given index.
   */
  java.lang.String getTransitTimeLabels(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of transit time labels. The last value can be
   * `"all other labels"`. Example:
   * `["food", "electronics", "all other labels"]`.
   * </pre>
   *
   * <code>repeated string transit_time_labels = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the transitTimeLabels at the given index.
   */
  com.google.protobuf.ByteString getTransitTimeLabelsBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. If there's only one dimension set of `postal_code_group_names` or
   * `transit_time_labels`, there are multiple rows each with one value
   * for that dimension. If there are two dimensions, each row corresponds to a
   * `postal_code_group_names`, and columns (values) to a
   * `transit_time_labels`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRow rows = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRow>
      getRowsList();
  /**
   *
   *
   * <pre>
   * Required. If there's only one dimension set of `postal_code_group_names` or
   * `transit_time_labels`, there are multiple rows each with one value
   * for that dimension. If there are two dimensions, each row corresponds to a
   * `postal_code_group_names`, and columns (values) to a
   * `transit_time_labels`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRow rows = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRow getRows(int index);
  /**
   *
   *
   * <pre>
   * Required. If there's only one dimension set of `postal_code_group_names` or
   * `transit_time_labels`, there are multiple rows each with one value
   * for that dimension. If there are two dimensions, each row corresponds to a
   * `postal_code_group_names`, and columns (values) to a
   * `transit_time_labels`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRow rows = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRowsCount();
  /**
   *
   *
   * <pre>
   * Required. If there's only one dimension set of `postal_code_group_names` or
   * `transit_time_labels`, there are multiple rows each with one value
   * for that dimension. If there are two dimensions, each row corresponds to a
   * `postal_code_group_names`, and columns (values) to a
   * `transit_time_labels`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRow rows = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRowOrBuilder>
      getRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. If there's only one dimension set of `postal_code_group_names` or
   * `transit_time_labels`, there are multiple rows each with one value
   * for that dimension. If there are two dimensions, each row corresponds to a
   * `postal_code_group_names`, and columns (values) to a
   * `transit_time_labels`.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRow rows = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.TransitTable.TransitTimeRowOrBuilder
      getRowsOrBuilder(int index);
}
