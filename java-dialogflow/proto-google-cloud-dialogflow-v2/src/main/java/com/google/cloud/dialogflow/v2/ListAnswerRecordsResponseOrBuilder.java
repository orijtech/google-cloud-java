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
// source: google/cloud/dialogflow/v2/answer_record.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public interface ListAnswerRecordsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ListAnswerRecordsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.AnswerRecord> getAnswerRecordsList();
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  com.google.cloud.dialogflow.v2.AnswerRecord getAnswerRecords(int index);
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  int getAnswerRecordsCount();
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder>
      getAnswerRecordsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder getAnswerRecordsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Or empty if there are no more
   * results.
   * Pass this value in the
   * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
   * field in the subsequent call to `ListAnswerRecords` method to retrieve the
   * next page of results.
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
   * A token to retrieve next page of results. Or empty if there are no more
   * results.
   * Pass this value in the
   * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
   * field in the subsequent call to `ListAnswerRecords` method to retrieve the
   * next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
