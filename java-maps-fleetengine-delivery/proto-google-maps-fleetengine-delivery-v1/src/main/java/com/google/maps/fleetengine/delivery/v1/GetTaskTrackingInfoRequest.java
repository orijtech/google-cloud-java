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
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.delivery.v1;

/**
 *
 *
 * <pre>
 * The `GetTaskTrackingInfoRequest` request message.
 * </pre>
 *
 * Protobuf type {@code maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest}
 */
public final class GetTaskTrackingInfoRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest)
    GetTaskTrackingInfoRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetTaskTrackingInfoRequest.newBuilder() to construct.
  private GetTaskTrackingInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetTaskTrackingInfoRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetTaskTrackingInfoRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.fleetengine.delivery.v1.DeliveryApi
        .internal_static_maps_fleetengine_delivery_v1_GetTaskTrackingInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.fleetengine.delivery.v1.DeliveryApi
        .internal_static_maps_fleetengine_delivery_v1_GetTaskTrackingInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest.class,
            com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader header_;
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The header.
   */
  @java.lang.Override
  public com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader getHeader() {
    return header_ == null
        ? com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.getDefaultInstance()
        : header_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder
      getHeaderOrBuilder() {
    return header_ == null
        ? com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.getDefaultInstance()
        : header_;
  }

  public static final int NAME_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
   * must be the Google Cloud Project ID, and the `tracking_id` must be the
   * tracking ID associated with the task. An example name can be
   * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
   * must be the Google Cloud Project ID, and the `tracking_id` must be the
   * tracking ID associated with the task. An example name can be
   * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getHeader());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getHeader());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest)) {
      return super.equals(obj);
    }
    com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest other =
        (com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader().equals(other.getHeader())) return false;
    }
    if (!getName().equals(other.getName())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest prototype) {
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
   * The `GetTaskTrackingInfoRequest` request message.
   * </pre>
   *
   * Protobuf type {@code maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest)
      com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.fleetengine.delivery.v1.DeliveryApi
          .internal_static_maps_fleetengine_delivery_v1_GetTaskTrackingInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.fleetengine.delivery.v1.DeliveryApi
          .internal_static_maps_fleetengine_delivery_v1_GetTaskTrackingInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest.class,
              com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest.Builder.class);
    }

    // Construct using
    // com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHeaderFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.fleetengine.delivery.v1.DeliveryApi
          .internal_static_maps_fleetengine_delivery_v1_GetTaskTrackingInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
        getDefaultInstanceForType() {
      return com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest build() {
      com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest buildPartial() {
      com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest result =
          new com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null ? header_ : headerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest) {
        return mergeFrom(
            (com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest other) {
      if (other
          == com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
              .getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                input.readMessage(getHeaderFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
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

    private com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader,
            com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.Builder,
            com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder>
        headerBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The header.
     */
    public com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null
            ? com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.getDefaultInstance()
            : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setHeader(com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setHeader(
        com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeHeader(
        com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader value) {
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && header_ != null
            && header_
                != com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader
                    .getDefaultInstance()) {
          getHeaderBuilder().mergeFrom(value);
        } else {
          header_ = value;
        }
      } else {
        headerBuilder_.mergeFrom(value);
      }
      if (header_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.Builder
        getHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder
        getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null
            ? com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.getDefaultInstance()
            : header_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The standard Delivery API request header.
     * </pre>
     *
     * <code>
     * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader,
            com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.Builder,
            com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder>
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader,
                com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader.Builder,
                com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder>(
                getHeader(), getParentForChildren(), isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Must be in the format
     * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
     * must be the Google Cloud Project ID, and the `tracking_id` must be the
     * tracking ID associated with the task. An example name can be
     * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Must be in the format
     * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
     * must be the Google Cloud Project ID, and the `tracking_id` must be the
     * tracking ID associated with the task. An example name can be
     * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Must be in the format
     * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
     * must be the Google Cloud Project ID, and the `tracking_id` must be the
     * tracking ID associated with the task. An example name can be
     * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Must be in the format
     * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
     * must be the Google Cloud Project ID, and the `tracking_id` must be the
     * tracking ID associated with the task. An example name can be
     * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Must be in the format
     * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
     * must be the Google Cloud Project ID, and the `tracking_id` must be the
     * tracking ID associated with the task. An example name can be
     * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest)
  private static final com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest();
  }

  public static com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTaskTrackingInfoRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetTaskTrackingInfoRequest>() {
        @java.lang.Override
        public GetTaskTrackingInfoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTaskTrackingInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTaskTrackingInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
