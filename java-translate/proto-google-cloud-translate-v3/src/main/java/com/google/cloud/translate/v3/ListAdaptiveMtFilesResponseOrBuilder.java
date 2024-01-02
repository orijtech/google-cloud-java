/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/translate/v3/adaptive_mt.proto

package com.google.cloud.translate.v3;

public interface ListAdaptiveMtFilesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.ListAdaptiveMtFilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Adaptive MT files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtFile adaptive_mt_files = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.translate.v3.AdaptiveMtFile> getAdaptiveMtFilesList();
  /**
   *
   *
   * <pre>
   * Output only. The Adaptive MT files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtFile adaptive_mt_files = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.translate.v3.AdaptiveMtFile getAdaptiveMtFiles(int index);
  /**
   *
   *
   * <pre>
   * Output only. The Adaptive MT files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtFile adaptive_mt_files = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getAdaptiveMtFilesCount();
  /**
   *
   *
   * <pre>
   * Output only. The Adaptive MT files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtFile adaptive_mt_files = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.AdaptiveMtFileOrBuilder>
      getAdaptiveMtFilesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The Adaptive MT files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtFile adaptive_mt_files = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.translate.v3.AdaptiveMtFileOrBuilder getAdaptiveMtFilesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. A token to retrieve a page of results. Pass this value in the
   * ListAdaptiveMtFilesRequest.page_token field in the subsequent call to
   * `ListAdaptiveMtFiles` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token to retrieve a page of results. Pass this value in the
   * ListAdaptiveMtFilesRequest.page_token field in the subsequent call to
   * `ListAdaptiveMtFiles` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
