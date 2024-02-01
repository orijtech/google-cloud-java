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
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ListTensorboardsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListTensorboardsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Tensorboards mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensorboard tensorboards = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Tensorboard> getTensorboardsList();
  /**
   *
   *
   * <pre>
   * The Tensorboards mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensorboard tensorboards = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Tensorboard getTensorboards(int index);
  /**
   *
   *
   * <pre>
   * The Tensorboards mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensorboard tensorboards = 1;</code>
   */
  int getTensorboardsCount();
  /**
   *
   *
   * <pre>
   * The Tensorboards mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensorboard tensorboards = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TensorboardOrBuilder>
      getTensorboardsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Tensorboards mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensorboard tensorboards = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TensorboardOrBuilder getTensorboardsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListTensorboardsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListTensorboardsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
