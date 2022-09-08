// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/common.proto

package com.google.cloud.gkebackup.v1;

public interface NamespacesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.Namespaces)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   * @return A list containing the namespaces.
   */
  java.util.List<java.lang.String>
      getNamespacesList();
  /**
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   * @return The count of namespaces.
   */
  int getNamespacesCount();
  /**
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   * @param index The index of the element to return.
   * @return The namespaces at the given index.
   */
  java.lang.String getNamespaces(int index);
  /**
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the namespaces at the given index.
   */
  com.google.protobuf.ByteString
      getNamespacesBytes(int index);
}