/*
 * Copyright 2023 Google LLC
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
// source: google/shopping/css/v1/accounts.proto

package com.google.shopping.css.v1;

/**
 *
 *
 * <pre>
 * The request message for the `UpdateLabels` method.
 * </pre>
 *
 * Protobuf type {@code google.shopping.css.v1.UpdateAccountLabelsRequest}
 */
public final class UpdateAccountLabelsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.css.v1.UpdateAccountLabelsRequest)
    UpdateAccountLabelsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateAccountLabelsRequest.newBuilder() to construct.
  private UpdateAccountLabelsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateAccountLabelsRequest() {
    name_ = "";
    labelIds_ = emptyLongList();
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateAccountLabelsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.css.v1.AccountsProto
        .internal_static_google_shopping_css_v1_UpdateAccountLabelsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.css.v1.AccountsProto
        .internal_static_google_shopping_css_v1_UpdateAccountLabelsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.css.v1.UpdateAccountLabelsRequest.class,
            com.google.shopping.css.v1.UpdateAccountLabelsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The label resource name.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
   * Required. The label resource name.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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

  public static final int LABEL_IDS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList labelIds_;
  /**
   *
   *
   * <pre>
   * The list of label IDs to overwrite the existing account label IDs.
   * If the list is empty, all currently assigned label IDs will be deleted.
   * </pre>
   *
   * <code>repeated int64 label_ids = 2;</code>
   *
   * @return A list containing the labelIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long> getLabelIdsList() {
    return labelIds_;
  }
  /**
   *
   *
   * <pre>
   * The list of label IDs to overwrite the existing account label IDs.
   * If the list is empty, all currently assigned label IDs will be deleted.
   * </pre>
   *
   * <code>repeated int64 label_ids = 2;</code>
   *
   * @return The count of labelIds.
   */
  public int getLabelIdsCount() {
    return labelIds_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of label IDs to overwrite the existing account label IDs.
   * If the list is empty, all currently assigned label IDs will be deleted.
   * </pre>
   *
   * <code>repeated int64 label_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The labelIds at the given index.
   */
  public long getLabelIds(int index) {
    return labelIds_.getLong(index);
  }

  private int labelIdsMemoizedSerializedSize = -1;

  public static final int PARENT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Only required when updating MC account labels.
   * The CSS domain that is the parent resource of the MC account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the parent field is set.
   */
  @java.lang.Override
  public boolean hasParent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Only required when updating MC account labels.
   * The CSS domain that is the parent resource of the MC account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
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
   * Optional. Only required when updating MC account labels.
   * The CSS domain that is the parent resource of the MC account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (getLabelIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(labelIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < labelIds_.size(); i++) {
      output.writeInt64NoTag(labelIds_.getLong(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < labelIds_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeInt64SizeNoTag(labelIds_.getLong(i));
      }
      size += dataSize;
      if (!getLabelIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      labelIdsMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parent_);
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
    if (!(obj instanceof com.google.shopping.css.v1.UpdateAccountLabelsRequest)) {
      return super.equals(obj);
    }
    com.google.shopping.css.v1.UpdateAccountLabelsRequest other =
        (com.google.shopping.css.v1.UpdateAccountLabelsRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getLabelIdsList().equals(other.getLabelIdsList())) return false;
    if (hasParent() != other.hasParent()) return false;
    if (hasParent()) {
      if (!getParent().equals(other.getParent())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getLabelIdsCount() > 0) {
      hash = (37 * hash) + LABEL_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelIdsList().hashCode();
    }
    if (hasParent()) {
      hash = (37 * hash) + PARENT_FIELD_NUMBER;
      hash = (53 * hash) + getParent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest parseFrom(
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
      com.google.shopping.css.v1.UpdateAccountLabelsRequest prototype) {
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
   * The request message for the `UpdateLabels` method.
   * </pre>
   *
   * Protobuf type {@code google.shopping.css.v1.UpdateAccountLabelsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.css.v1.UpdateAccountLabelsRequest)
      com.google.shopping.css.v1.UpdateAccountLabelsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.css.v1.AccountsProto
          .internal_static_google_shopping_css_v1_UpdateAccountLabelsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.css.v1.AccountsProto
          .internal_static_google_shopping_css_v1_UpdateAccountLabelsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.css.v1.UpdateAccountLabelsRequest.class,
              com.google.shopping.css.v1.UpdateAccountLabelsRequest.Builder.class);
    }

    // Construct using com.google.shopping.css.v1.UpdateAccountLabelsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      labelIds_ = emptyLongList();
      parent_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.css.v1.AccountsProto
          .internal_static_google_shopping_css_v1_UpdateAccountLabelsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.css.v1.UpdateAccountLabelsRequest getDefaultInstanceForType() {
      return com.google.shopping.css.v1.UpdateAccountLabelsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.css.v1.UpdateAccountLabelsRequest build() {
      com.google.shopping.css.v1.UpdateAccountLabelsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.css.v1.UpdateAccountLabelsRequest buildPartial() {
      com.google.shopping.css.v1.UpdateAccountLabelsRequest result =
          new com.google.shopping.css.v1.UpdateAccountLabelsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.shopping.css.v1.UpdateAccountLabelsRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        labelIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.labelIds_ = labelIds_;
    }

    private void buildPartial0(com.google.shopping.css.v1.UpdateAccountLabelsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.parent_ = parent_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.shopping.css.v1.UpdateAccountLabelsRequest) {
        return mergeFrom((com.google.shopping.css.v1.UpdateAccountLabelsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.css.v1.UpdateAccountLabelsRequest other) {
      if (other == com.google.shopping.css.v1.UpdateAccountLabelsRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.labelIds_.isEmpty()) {
        if (labelIds_.isEmpty()) {
          labelIds_ = other.labelIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureLabelIdsIsMutable();
          labelIds_.addAll(other.labelIds_);
        }
        onChanged();
      }
      if (other.hasParent()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000004;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                long v = input.readInt64();
                ensureLabelIdsIsMutable();
                labelIds_.addLong(v);
                break;
              } // case 16
            case 18:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureLabelIdsIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  labelIds_.addLong(input.readInt64());
                }
                input.popLimit(limit);
                break;
              } // case 18
            case 26:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The label resource name.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
     * Required. The label resource name.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
     * Required. The label resource name.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The label resource name.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The label resource name.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList labelIds_ = emptyLongList();

    private void ensureLabelIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        labelIds_ = mutableCopy(labelIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of label IDs to overwrite the existing account label IDs.
     * If the list is empty, all currently assigned label IDs will be deleted.
     * </pre>
     *
     * <code>repeated int64 label_ids = 2;</code>
     *
     * @return A list containing the labelIds.
     */
    public java.util.List<java.lang.Long> getLabelIdsList() {
      return ((bitField0_ & 0x00000002) != 0)
          ? java.util.Collections.unmodifiableList(labelIds_)
          : labelIds_;
    }
    /**
     *
     *
     * <pre>
     * The list of label IDs to overwrite the existing account label IDs.
     * If the list is empty, all currently assigned label IDs will be deleted.
     * </pre>
     *
     * <code>repeated int64 label_ids = 2;</code>
     *
     * @return The count of labelIds.
     */
    public int getLabelIdsCount() {
      return labelIds_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of label IDs to overwrite the existing account label IDs.
     * If the list is empty, all currently assigned label IDs will be deleted.
     * </pre>
     *
     * <code>repeated int64 label_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The labelIds at the given index.
     */
    public long getLabelIds(int index) {
      return labelIds_.getLong(index);
    }
    /**
     *
     *
     * <pre>
     * The list of label IDs to overwrite the existing account label IDs.
     * If the list is empty, all currently assigned label IDs will be deleted.
     * </pre>
     *
     * <code>repeated int64 label_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The labelIds to set.
     * @return This builder for chaining.
     */
    public Builder setLabelIds(int index, long value) {

      ensureLabelIdsIsMutable();
      labelIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of label IDs to overwrite the existing account label IDs.
     * If the list is empty, all currently assigned label IDs will be deleted.
     * </pre>
     *
     * <code>repeated int64 label_ids = 2;</code>
     *
     * @param value The labelIds to add.
     * @return This builder for chaining.
     */
    public Builder addLabelIds(long value) {

      ensureLabelIdsIsMutable();
      labelIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of label IDs to overwrite the existing account label IDs.
     * If the list is empty, all currently assigned label IDs will be deleted.
     * </pre>
     *
     * <code>repeated int64 label_ids = 2;</code>
     *
     * @param values The labelIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllLabelIds(java.lang.Iterable<? extends java.lang.Long> values) {
      ensureLabelIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, labelIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of label IDs to overwrite the existing account label IDs.
     * If the list is empty, all currently assigned label IDs will be deleted.
     * </pre>
     *
     * <code>repeated int64 label_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLabelIds() {
      labelIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Only required when updating MC account labels.
     * The CSS domain that is the parent resource of the MC account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return Whether the parent field is set.
     */
    public boolean hasParent() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Only required when updating MC account labels.
     * The CSS domain that is the parent resource of the MC account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
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
     * Optional. Only required when updating MC account labels.
     * The CSS domain that is the parent resource of the MC account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
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
     * Optional. Only required when updating MC account labels.
     * The CSS domain that is the parent resource of the MC account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Only required when updating MC account labels.
     * The CSS domain that is the parent resource of the MC account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Only required when updating MC account labels.
     * The CSS domain that is the parent resource of the MC account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * optional string parent = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
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
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.css.v1.UpdateAccountLabelsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.css.v1.UpdateAccountLabelsRequest)
  private static final com.google.shopping.css.v1.UpdateAccountLabelsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.css.v1.UpdateAccountLabelsRequest();
  }

  public static com.google.shopping.css.v1.UpdateAccountLabelsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAccountLabelsRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateAccountLabelsRequest>() {
        @java.lang.Override
        public UpdateAccountLabelsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAccountLabelsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAccountLabelsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.css.v1.UpdateAccountLabelsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
