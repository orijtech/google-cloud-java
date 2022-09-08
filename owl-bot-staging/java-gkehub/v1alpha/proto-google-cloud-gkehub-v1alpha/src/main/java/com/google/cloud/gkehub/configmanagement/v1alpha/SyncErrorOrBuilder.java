// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

public interface SyncErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1alpha.SyncError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An ACM defined error code
   * </pre>
   *
   * <code>string code = 1;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <pre>
   * An ACM defined error code
   * </pre>
   *
   * <code>string code = 1;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * A description of the error
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * A description of the error
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1alpha.ErrorResource error_resources = 3;</code>
   */
  java.util.List<com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource> 
      getErrorResourcesList();
  /**
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1alpha.ErrorResource error_resources = 3;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource getErrorResources(int index);
  /**
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1alpha.ErrorResource error_resources = 3;</code>
   */
  int getErrorResourcesCount();
  /**
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1alpha.ErrorResource error_resources = 3;</code>
   */
  java.util.List<? extends com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResourceOrBuilder> 
      getErrorResourcesOrBuilderList();
  /**
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1alpha.ErrorResource error_resources = 3;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResourceOrBuilder getErrorResourcesOrBuilder(
      int index);
}