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

public interface WarehouseCutoffTimeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.WarehouseCutoffTime)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Hour of the cutoff time until which an order has to be placed to
   * be processed in the same day by the warehouse. Hour is based on the
   * timezone of warehouse.
   * </pre>
   *
   * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the hour field is set.
   */
  boolean hasHour();
  /**
   *
   *
   * <pre>
   * Required. Hour of the cutoff time until which an order has to be placed to
   * be processed in the same day by the warehouse. Hour is based on the
   * timezone of warehouse.
   * </pre>
   *
   * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The hour.
   */
  int getHour();

  /**
   *
   *
   * <pre>
   * Required. Minute of the cutoff time until which an order has to be placed
   * to be processed in the same day by the warehouse. Minute is based on the
   * timezone of warehouse.
   * </pre>
   *
   * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the minute field is set.
   */
  boolean hasMinute();
  /**
   *
   *
   * <pre>
   * Required. Minute of the cutoff time until which an order has to be placed
   * to be processed in the same day by the warehouse. Minute is based on the
   * timezone of warehouse.
   * </pre>
   *
   * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The minute.
   */
  int getMinute();
}
