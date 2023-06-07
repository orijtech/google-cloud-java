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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CreateEntry][google.cloud.datacatalog.v1.DataCatalog.CreateEntry].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.CreateEntryRequest}
 */
public final class CreateEntryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.CreateEntryRequest)
    CreateEntryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateEntryRequest.newBuilder() to construct.
  private CreateEntryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEntryRequest() {
    parent_ = "";
    entryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEntryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.CreateEntryRequest.class,
            com.google.cloud.datacatalog.v1.CreateEntryRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the entry group this entry belongs to.
   *
   * Note: The entry itself and its child resources might not be stored in
   * the location specified in its name.
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
   * Required. The name of the entry group this entry belongs to.
   *
   * Note: The entry itself and its child resources might not be stored in
   * the location specified in its name.
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

  public static final int ENTRY_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entryId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID of the entry to create.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * and underscores (_).
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entryId.
   */
  @java.lang.Override
  public java.lang.String getEntryId() {
    java.lang.Object ref = entryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entryId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the entry to create.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * and underscores (_).
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntryIdBytes() {
    java.lang.Object ref = entryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTRY_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.Entry entry_;
  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entry field is set.
   */
  @java.lang.Override
  public boolean hasEntry() {
    return entry_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entry.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.Entry getEntry() {
    return entry_ == null ? com.google.cloud.datacatalog.v1.Entry.getDefaultInstance() : entry_;
  }
  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryOrBuilder getEntryOrBuilder() {
    return entry_ == null ? com.google.cloud.datacatalog.v1.Entry.getDefaultInstance() : entry_;
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
    if (entry_ != null) {
      output.writeMessage(2, getEntry());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, entryId_);
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
    if (entry_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEntry());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, entryId_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.CreateEntryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.CreateEntryRequest other =
        (com.google.cloud.datacatalog.v1.CreateEntryRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getEntryId().equals(other.getEntryId())) return false;
    if (hasEntry() != other.hasEntry()) return false;
    if (hasEntry()) {
      if (!getEntry().equals(other.getEntry())) return false;
    }
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
    hash = (37 * hash) + ENTRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntryId().hashCode();
    if (hasEntry()) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntry().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.CreateEntryRequest prototype) {
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
   * Request message for
   * [CreateEntry][google.cloud.datacatalog.v1.DataCatalog.CreateEntry].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.CreateEntryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.CreateEntryRequest)
      com.google.cloud.datacatalog.v1.CreateEntryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.CreateEntryRequest.class,
              com.google.cloud.datacatalog.v1.CreateEntryRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.CreateEntryRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      entryId_ = "";
      entry_ = null;
      if (entryBuilder_ != null) {
        entryBuilder_.dispose();
        entryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.CreateEntryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryRequest build() {
      com.google.cloud.datacatalog.v1.CreateEntryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryRequest buildPartial() {
      com.google.cloud.datacatalog.v1.CreateEntryRequest result =
          new com.google.cloud.datacatalog.v1.CreateEntryRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.CreateEntryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entryId_ = entryId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.entry_ = entryBuilder_ == null ? entry_ : entryBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.CreateEntryRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.CreateEntryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.CreateEntryRequest other) {
      if (other == com.google.cloud.datacatalog.v1.CreateEntryRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEntryId().isEmpty()) {
        entryId_ = other.entryId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasEntry()) {
        mergeEntry(other.getEntry());
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
                input.readMessage(getEntryFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 18
            case 26:
              {
                entryId_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the entry group this entry belongs to.
     *
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to.
     *
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to.
     *
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to.
     *
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to.
     *
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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

    private java.lang.Object entryId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     *
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The entryId.
     */
    public java.lang.String getEntryId() {
      java.lang.Object ref = entryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     *
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for entryId.
     */
    public com.google.protobuf.ByteString getEntryIdBytes() {
      java.lang.Object ref = entryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     *
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The entryId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entryId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     *
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntryId() {
      entryId_ = getDefaultInstance().getEntryId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     *
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for entryId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entryId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.Entry entry_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Entry,
            com.google.cloud.datacatalog.v1.Entry.Builder,
            com.google.cloud.datacatalog.v1.EntryOrBuilder>
        entryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entry field is set.
     */
    public boolean hasEntry() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entry.
     */
    public com.google.cloud.datacatalog.v1.Entry getEntry() {
      if (entryBuilder_ == null) {
        return entry_ == null ? com.google.cloud.datacatalog.v1.Entry.getDefaultInstance() : entry_;
      } else {
        return entryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntry(com.google.cloud.datacatalog.v1.Entry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
      } else {
        entryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntry(com.google.cloud.datacatalog.v1.Entry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        entry_ = builderForValue.build();
      } else {
        entryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntry(com.google.cloud.datacatalog.v1.Entry value) {
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && entry_ != null
            && entry_ != com.google.cloud.datacatalog.v1.Entry.getDefaultInstance()) {
          getEntryBuilder().mergeFrom(value);
        } else {
          entry_ = value;
        }
      } else {
        entryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntry() {
      bitField0_ = (bitField0_ & ~0x00000004);
      entry_ = null;
      if (entryBuilder_ != null) {
        entryBuilder_.dispose();
        entryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.Entry.Builder getEntryBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEntryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.EntryOrBuilder getEntryOrBuilder() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilder();
      } else {
        return entry_ == null ? com.google.cloud.datacatalog.v1.Entry.getDefaultInstance() : entry_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Entry,
            com.google.cloud.datacatalog.v1.Entry.Builder,
            com.google.cloud.datacatalog.v1.EntryOrBuilder>
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.Entry,
                com.google.cloud.datacatalog.v1.Entry.Builder,
                com.google.cloud.datacatalog.v1.EntryOrBuilder>(
                getEntry(), getParentForChildren(), isClean());
        entry_ = null;
      }
      return entryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.CreateEntryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.CreateEntryRequest)
  private static final com.google.cloud.datacatalog.v1.CreateEntryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.CreateEntryRequest();
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntryRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateEntryRequest>() {
        @java.lang.Override
        public CreateEntryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEntryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.CreateEntryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
