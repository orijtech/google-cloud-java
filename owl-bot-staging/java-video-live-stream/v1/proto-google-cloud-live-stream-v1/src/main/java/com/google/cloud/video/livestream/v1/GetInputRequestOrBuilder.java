// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/service.proto

package com.google.cloud.video.livestream.v1;

public interface GetInputRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.GetInputRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the input resource, in the form of:
   * `projects/{project}/locations/{location}/inputs/{inputId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the input resource, in the form of:
   * `projects/{project}/locations/{location}/inputs/{inputId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}