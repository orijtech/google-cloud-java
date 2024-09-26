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

public interface DistanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.Distance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Integer value of distance.
   * </pre>
   *
   * <code>optional int64 value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * Integer value of distance.
   * </pre>
   *
   * <code>optional int64 value = 1;</code>
   *
   * @return The value.
   */
  long getValue();

  /**
   *
   *
   * <pre>
   * Unit can differ based on country, it is parameterized to include miles
   * and kilometers.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Distance.Unit unit = 2;</code>
   *
   * @return Whether the unit field is set.
   */
  boolean hasUnit();
  /**
   *
   *
   * <pre>
   * Unit can differ based on country, it is parameterized to include miles
   * and kilometers.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Distance.Unit unit = 2;</code>
   *
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   *
   *
   * <pre>
   * Unit can differ based on country, it is parameterized to include miles
   * and kilometers.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Distance.Unit unit = 2;</code>
   *
   * @return The unit.
   */
  com.google.shopping.merchant.accounts.v1beta.Distance.Unit getUnit();
}
