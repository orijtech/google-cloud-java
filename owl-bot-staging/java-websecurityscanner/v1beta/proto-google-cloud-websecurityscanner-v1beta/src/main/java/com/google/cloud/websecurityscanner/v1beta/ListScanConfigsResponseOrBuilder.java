// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface ListScanConfigsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanConfig scan_configs = 1;</code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1beta.ScanConfig> 
      getScanConfigsList();
  /**
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanConfig scan_configs = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanConfig getScanConfigs(int index);
  /**
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanConfig scan_configs = 1;</code>
   */
  int getScanConfigsCount();
  /**
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanConfig scan_configs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1beta.ScanConfigOrBuilder> 
      getScanConfigsOrBuilderList();
  /**
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanConfig scan_configs = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanConfigOrBuilder getScanConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}