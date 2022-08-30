/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/speech/v1beta1/cloud_speech.proto

package com.google.cloud.speech.v1beta1;

public interface RecognitionAudioOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1beta1.RecognitionAudio)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
   * pure binary representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   */
  com.google.protobuf.ByteString getContent();

  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more information, see
   * [Request URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more information, see
   * [Request URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   */
  com.google.protobuf.ByteString getUriBytes();

  public com.google.cloud.speech.v1beta1.RecognitionAudio.AudioSourceCase getAudioSourceCase();
}