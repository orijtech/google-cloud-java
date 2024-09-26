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
// source: google/cloud/dialogflow/v2/fulfillment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public interface FulfillmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Fulfillment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the fulfillment.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent/fulfillment`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/fulfillment`
   *
   * This field is not used for Fulfillment in an Environment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the fulfillment.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent/fulfillment`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/fulfillment`
   *
   * This field is not used for Fulfillment in an Environment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The human-readable name of the fulfillment, unique within the
   * agent.
   *
   * This field is not used for Fulfillment in an Environment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The human-readable name of the fulfillment, unique within the
   * agent.
   *
   * This field is not used for Fulfillment in an Environment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Configuration for a generic web service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Fulfillment.GenericWebService generic_web_service = 3;</code>
   *
   * @return Whether the genericWebService field is set.
   */
  boolean hasGenericWebService();
  /**
   *
   *
   * <pre>
   * Configuration for a generic web service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Fulfillment.GenericWebService generic_web_service = 3;</code>
   *
   * @return The genericWebService.
   */
  com.google.cloud.dialogflow.v2.Fulfillment.GenericWebService getGenericWebService();
  /**
   *
   *
   * <pre>
   * Configuration for a generic web service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Fulfillment.GenericWebService generic_web_service = 3;</code>
   */
  com.google.cloud.dialogflow.v2.Fulfillment.GenericWebServiceOrBuilder
      getGenericWebServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Whether fulfillment is enabled.
   * </pre>
   *
   * <code>bool enabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Optional. The field defines whether the fulfillment is enabled for certain
   * features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Fulfillment.Feature features = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Fulfillment.Feature> getFeaturesList();
  /**
   *
   *
   * <pre>
   * Optional. The field defines whether the fulfillment is enabled for certain
   * features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Fulfillment.Feature features = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Fulfillment.Feature getFeatures(int index);
  /**
   *
   *
   * <pre>
   * Optional. The field defines whether the fulfillment is enabled for certain
   * features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Fulfillment.Feature features = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFeaturesCount();
  /**
   *
   *
   * <pre>
   * Optional. The field defines whether the fulfillment is enabled for certain
   * features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Fulfillment.Feature features = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.Fulfillment.FeatureOrBuilder>
      getFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The field defines whether the fulfillment is enabled for certain
   * features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Fulfillment.Feature features = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Fulfillment.FeatureOrBuilder getFeaturesOrBuilder(int index);

  com.google.cloud.dialogflow.v2.Fulfillment.FulfillmentCase getFulfillmentCase();
}
