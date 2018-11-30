// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ListDlpJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListDlpJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
   * * Supported fields/values for inspect jobs:
   *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - `trigger_name` - The resource name of the trigger that created job.
   * * Supported fields for risk analysis jobs:
   *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
   * * The operator must be `=` or `!=`.
   * Examples:
   * * inspected_storage = cloud_storage AND state = done
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 1;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
   * * Supported fields/values for inspect jobs:
   *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - `trigger_name` - The resource name of the trigger that created job.
   * * Supported fields for risk analysis jobs:
   *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
   * * The operator must be `=` or `!=`.
   * Examples:
   * * inspected_storage = cloud_storage AND state = done
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 1;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The type of job. Defaults to `DlpJobType.INSPECT`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DlpJobType type = 5;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of job. Defaults to `DlpJobType.INSPECT`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DlpJobType type = 5;</code>
   */
  com.google.privacy.dlp.v2.DlpJobType getType();

  /**
   *
   *
   * <pre>
   * Optional comma separated list of fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc, end_time asc, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the job was created.
   * - `end_time`: corresponds to time the job ended.
   * - `name`: corresponds to job's name.
   * - `state`: corresponds to `state`
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional comma separated list of fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc, end_time asc, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the job was created.
   * - `end_time`: corresponds to time the job ended.
   * - `name`: corresponds to job's name.
   * - `state`: corresponds to `state`
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
