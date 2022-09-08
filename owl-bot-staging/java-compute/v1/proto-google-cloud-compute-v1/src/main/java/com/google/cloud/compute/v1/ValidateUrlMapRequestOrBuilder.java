// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ValidateUrlMapRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ValidateUrlMapRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the UrlMap resource to be validated as.
   * </pre>
   *
   * <code>string url_map = 367020684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The urlMap.
   */
  java.lang.String getUrlMap();
  /**
   * <pre>
   * Name of the UrlMap resource to be validated as.
   * </pre>
   *
   * <code>string url_map = 367020684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for urlMap.
   */
  com.google.protobuf.ByteString
      getUrlMapBytes();

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 395913455 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the urlMapsValidateRequestResource field is set.
   */
  boolean hasUrlMapsValidateRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 395913455 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The urlMapsValidateRequestResource.
   */
  com.google.cloud.compute.v1.UrlMapsValidateRequest getUrlMapsValidateRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 395913455 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.UrlMapsValidateRequestOrBuilder getUrlMapsValidateRequestResourceOrBuilder();
}