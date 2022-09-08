// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

public interface CallFunctionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.CallFunctionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Execution id of function invocation.
   * </pre>
   *
   * <code>string execution_id = 1;</code>
   * @return The executionId.
   */
  java.lang.String getExecutionId();
  /**
   * <pre>
   * Execution id of function invocation.
   * </pre>
   *
   * <code>string execution_id = 1;</code>
   * @return The bytes for executionId.
   */
  com.google.protobuf.ByteString
      getExecutionIdBytes();

  /**
   * <pre>
   * Result populated for successful execution of synchronous function. Will
   * not be populated if function does not return a result through context.
   * </pre>
   *
   * <code>string result = 2;</code>
   * @return The result.
   */
  java.lang.String getResult();
  /**
   * <pre>
   * Result populated for successful execution of synchronous function. Will
   * not be populated if function does not return a result through context.
   * </pre>
   *
   * <code>string result = 2;</code>
   * @return The bytes for result.
   */
  com.google.protobuf.ByteString
      getResultBytes();

  /**
   * <pre>
   * Either system or user-function generated error. Set if execution
   * was not successful.
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <pre>
   * Either system or user-function generated error. Set if execution
   * was not successful.
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}