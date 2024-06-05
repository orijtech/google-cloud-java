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
// source: google/shopping/merchant/accounts/v1beta/emailpreferences.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

public interface EmailPreferencesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.EmailPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the EmailPreferences. The endpoint is only
   * supported for the authenticated user.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The name of the EmailPreferences. The endpoint is only
   * supported for the authenticated user.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Updates on new features, tips and best practices.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.EmailPreferences.OptInState news_and_tips = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for newsAndTips.
   */
  int getNewsAndTipsValue();
  /**
   *
   *
   * <pre>
   * Optional. Updates on new features, tips and best practices.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.EmailPreferences.OptInState news_and_tips = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The newsAndTips.
   */
  com.google.shopping.merchant.accounts.v1beta.EmailPreferences.OptInState getNewsAndTips();
}
