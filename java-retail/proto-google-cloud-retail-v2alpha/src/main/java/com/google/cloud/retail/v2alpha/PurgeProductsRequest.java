/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/retail/v2alpha/purge_config.proto

package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Request message for PurgeProducts method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.PurgeProductsRequest}
 */
public final class PurgeProductsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.PurgeProductsRequest)
    PurgeProductsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PurgeProductsRequest.newBuilder() to construct.
  private PurgeProductsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PurgeProductsRequest() {
    parent_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PurgeProductsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.PurgeConfigProto
        .internal_static_google_cloud_retail_v2alpha_PurgeProductsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.PurgeConfigProto
        .internal_static_google_cloud_retail_v2alpha_PurgeProductsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.PurgeProductsRequest.class,
            com.google.cloud.retail.v2alpha.PurgeProductsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the branch under which the products are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the branch under which the products are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   *
   *
   * <pre>
   * Required. The filter string to specify the products to be deleted with a
   * length limit of 5,000 characters.
   * Empty string filter is not allowed. "*" implies delete all items in a
   * branch.
   * The eligible fields for filtering are:
   * * `availability`: Double quoted
   * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
   * string.
   * * `create_time` : in ISO 8601 "zulu" format.
   * Supported syntax:
   * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z"
   *   * availability = "IN_STOCK"
   * * Conjunctions ("AND")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
   * * Disjunctions ("OR")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
   * * Can support nested queries.
   *   Examples:
   *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
   *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
   * * Filter Limits:
   *   * Filter should not contain more than 6 conditions.
   *   * Max nesting depth should not exceed 2 levels.
   * Examples queries:
   * * Delete back order products created before a timestamp.
   *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The filter string to specify the products to be deleted with a
   * length limit of 5,000 characters.
   * Empty string filter is not allowed. "*" implies delete all items in a
   * branch.
   * The eligible fields for filtering are:
   * * `availability`: Double quoted
   * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
   * string.
   * * `create_time` : in ISO 8601 "zulu" format.
   * Supported syntax:
   * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z"
   *   * availability = "IN_STOCK"
   * * Conjunctions ("AND")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
   * * Disjunctions ("OR")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
   * * Can support nested queries.
   *   Examples:
   *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
   *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
   * * Filter Limits:
   *   * Filter should not contain more than 6 conditions.
   *   * Max nesting depth should not exceed 2 levels.
   * Examples queries:
   * * Delete back order products created before a timestamp.
   *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORCE_FIELD_NUMBER = 3;
  private boolean force_ = false;
  /**
   *
   *
   * <pre>
   * Actually perform the purge.
   * If `force` is set to false, the method will return the expected purge count
   * without deleting any products.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  @java.lang.Override
  public boolean getForce() {
    return force_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
    }
    if (force_ != false) {
      output.writeBool(3, force_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
    }
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, force_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.retail.v2alpha.PurgeProductsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.PurgeProductsRequest other =
        (com.google.cloud.retail.v2alpha.PurgeProductsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getFilter().equals(other.getFilter())) return false;
    if (getForce() != other.getForce()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getForce());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.retail.v2alpha.PurgeProductsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for PurgeProducts method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.PurgeProductsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.PurgeProductsRequest)
      com.google.cloud.retail.v2alpha.PurgeProductsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.PurgeConfigProto
          .internal_static_google_cloud_retail_v2alpha_PurgeProductsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.PurgeConfigProto
          .internal_static_google_cloud_retail_v2alpha_PurgeProductsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.PurgeProductsRequest.class,
              com.google.cloud.retail.v2alpha.PurgeProductsRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.PurgeProductsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      filter_ = "";
      force_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.PurgeConfigProto
          .internal_static_google_cloud_retail_v2alpha_PurgeProductsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.PurgeProductsRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.PurgeProductsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.PurgeProductsRequest build() {
      com.google.cloud.retail.v2alpha.PurgeProductsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.PurgeProductsRequest buildPartial() {
      com.google.cloud.retail.v2alpha.PurgeProductsRequest result =
          new com.google.cloud.retail.v2alpha.PurgeProductsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2alpha.PurgeProductsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filter_ = filter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.force_ = force_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.retail.v2alpha.PurgeProductsRequest) {
        return mergeFrom((com.google.cloud.retail.v2alpha.PurgeProductsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.PurgeProductsRequest other) {
      if (other == com.google.cloud.retail.v2alpha.PurgeProductsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                filter_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                force_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the branch under which the products are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the branch under which the products are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the branch under which the products are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the branch under which the products are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the branch under which the products are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * Required. The filter string to specify the products to be deleted with a
     * length limit of 5,000 characters.
     * Empty string filter is not allowed. "*" implies delete all items in a
     * branch.
     * The eligible fields for filtering are:
     * * `availability`: Double quoted
     * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
     * string.
     * * `create_time` : in ISO 8601 "zulu" format.
     * Supported syntax:
     * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z"
     *   * availability = "IN_STOCK"
     * * Conjunctions ("AND")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
     * * Disjunctions ("OR")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
     * * Can support nested queries.
     *   Examples:
     *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
     *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
     * * Filter Limits:
     *   * Filter should not contain more than 6 conditions.
     *   * Max nesting depth should not exceed 2 levels.
     * Examples queries:
     * * Delete back order products created before a timestamp.
     *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The filter string to specify the products to be deleted with a
     * length limit of 5,000 characters.
     * Empty string filter is not allowed. "*" implies delete all items in a
     * branch.
     * The eligible fields for filtering are:
     * * `availability`: Double quoted
     * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
     * string.
     * * `create_time` : in ISO 8601 "zulu" format.
     * Supported syntax:
     * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z"
     *   * availability = "IN_STOCK"
     * * Conjunctions ("AND")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
     * * Disjunctions ("OR")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
     * * Can support nested queries.
     *   Examples:
     *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
     *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
     * * Filter Limits:
     *   * Filter should not contain more than 6 conditions.
     *   * Max nesting depth should not exceed 2 levels.
     * Examples queries:
     * * Delete back order products created before a timestamp.
     *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The filter string to specify the products to be deleted with a
     * length limit of 5,000 characters.
     * Empty string filter is not allowed. "*" implies delete all items in a
     * branch.
     * The eligible fields for filtering are:
     * * `availability`: Double quoted
     * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
     * string.
     * * `create_time` : in ISO 8601 "zulu" format.
     * Supported syntax:
     * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z"
     *   * availability = "IN_STOCK"
     * * Conjunctions ("AND")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
     * * Disjunctions ("OR")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
     * * Can support nested queries.
     *   Examples:
     *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
     *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
     * * Filter Limits:
     *   * Filter should not contain more than 6 conditions.
     *   * Max nesting depth should not exceed 2 levels.
     * Examples queries:
     * * Delete back order products created before a timestamp.
     *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The filter string to specify the products to be deleted with a
     * length limit of 5,000 characters.
     * Empty string filter is not allowed. "*" implies delete all items in a
     * branch.
     * The eligible fields for filtering are:
     * * `availability`: Double quoted
     * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
     * string.
     * * `create_time` : in ISO 8601 "zulu" format.
     * Supported syntax:
     * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z"
     *   * availability = "IN_STOCK"
     * * Conjunctions ("AND")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
     * * Disjunctions ("OR")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
     * * Can support nested queries.
     *   Examples:
     *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
     *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
     * * Filter Limits:
     *   * Filter should not contain more than 6 conditions.
     *   * Max nesting depth should not exceed 2 levels.
     * Examples queries:
     * * Delete back order products created before a timestamp.
     *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The filter string to specify the products to be deleted with a
     * length limit of 5,000 characters.
     * Empty string filter is not allowed. "*" implies delete all items in a
     * branch.
     * The eligible fields for filtering are:
     * * `availability`: Double quoted
     * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
     * string.
     * * `create_time` : in ISO 8601 "zulu" format.
     * Supported syntax:
     * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z"
     *   * availability = "IN_STOCK"
     * * Conjunctions ("AND")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
     * * Disjunctions ("OR")
     *   Examples:
     *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
     * * Can support nested queries.
     *   Examples:
     *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
     *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
     * * Filter Limits:
     *   * Filter should not contain more than 6 conditions.
     *   * Max nesting depth should not exceed 2 levels.
     * Examples queries:
     * * Delete back order products created before a timestamp.
     *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean force_;
    /**
     *
     *
     * <pre>
     * Actually perform the purge.
     * If `force` is set to false, the method will return the expected purge count
     * without deleting any products.
     * </pre>
     *
     * <code>bool force = 3;</code>
     *
     * @return The force.
     */
    @java.lang.Override
    public boolean getForce() {
      return force_;
    }
    /**
     *
     *
     * <pre>
     * Actually perform the purge.
     * If `force` is set to false, the method will return the expected purge count
     * without deleting any products.
     * </pre>
     *
     * <code>bool force = 3;</code>
     *
     * @param value The force to set.
     * @return This builder for chaining.
     */
    public Builder setForce(boolean value) {

      force_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Actually perform the purge.
     * If `force` is set to false, the method will return the expected purge count
     * without deleting any products.
     * </pre>
     *
     * <code>bool force = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearForce() {
      bitField0_ = (bitField0_ & ~0x00000004);
      force_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.PurgeProductsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.PurgeProductsRequest)
  private static final com.google.cloud.retail.v2alpha.PurgeProductsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.PurgeProductsRequest();
  }

  public static com.google.cloud.retail.v2alpha.PurgeProductsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurgeProductsRequest> PARSER =
      new com.google.protobuf.AbstractParser<PurgeProductsRequest>() {
        @java.lang.Override
        public PurgeProductsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PurgeProductsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurgeProductsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.PurgeProductsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
