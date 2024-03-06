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
// source: google/chat/v1/deletion_metadata.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * Information about a deleted message. A message is deleted when `delete_time`
 * is set.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.DeletionMetadata}
 */
public final class DeletionMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.DeletionMetadata)
    DeletionMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeletionMetadata.newBuilder() to construct.
  private DeletionMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeletionMetadata() {
    deletionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeletionMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.DeletionMetadataProto
        .internal_static_google_chat_v1_DeletionMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.DeletionMetadataProto
        .internal_static_google_chat_v1_DeletionMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.DeletionMetadata.class,
            com.google.chat.v1.DeletionMetadata.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Who deleted the message and how it was deleted.
   * </pre>
   *
   * Protobuf enum {@code google.chat.v1.DeletionMetadata.DeletionType}
   */
  public enum DeletionType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * This value is unused.
     * </pre>
     *
     * <code>DELETION_TYPE_UNSPECIFIED = 0;</code>
     */
    DELETION_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * User deleted their own message.
     * </pre>
     *
     * <code>CREATOR = 1;</code>
     */
    CREATOR(1),
    /**
     *
     *
     * <pre>
     * The space owner deleted the message.
     * </pre>
     *
     * <code>SPACE_OWNER = 2;</code>
     */
    SPACE_OWNER(2),
    /**
     *
     *
     * <pre>
     * A Google Workspace admin deleted the message.
     * </pre>
     *
     * <code>ADMIN = 3;</code>
     */
    ADMIN(3),
    /**
     *
     *
     * <pre>
     * A Chat app deleted its own message when it expired.
     * </pre>
     *
     * <code>APP_MESSAGE_EXPIRY = 4;</code>
     */
    APP_MESSAGE_EXPIRY(4),
    /**
     *
     *
     * <pre>
     * A Chat app deleted the message on behalf of the user.
     * </pre>
     *
     * <code>CREATOR_VIA_APP = 5;</code>
     */
    CREATOR_VIA_APP(5),
    /**
     *
     *
     * <pre>
     * A Chat app deleted the message on behalf of the space owner.
     * </pre>
     *
     * <code>SPACE_OWNER_VIA_APP = 6;</code>
     */
    SPACE_OWNER_VIA_APP(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * This value is unused.
     * </pre>
     *
     * <code>DELETION_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int DELETION_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * User deleted their own message.
     * </pre>
     *
     * <code>CREATOR = 1;</code>
     */
    public static final int CREATOR_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The space owner deleted the message.
     * </pre>
     *
     * <code>SPACE_OWNER = 2;</code>
     */
    public static final int SPACE_OWNER_VALUE = 2;
    /**
     *
     *
     * <pre>
     * A Google Workspace admin deleted the message.
     * </pre>
     *
     * <code>ADMIN = 3;</code>
     */
    public static final int ADMIN_VALUE = 3;
    /**
     *
     *
     * <pre>
     * A Chat app deleted its own message when it expired.
     * </pre>
     *
     * <code>APP_MESSAGE_EXPIRY = 4;</code>
     */
    public static final int APP_MESSAGE_EXPIRY_VALUE = 4;
    /**
     *
     *
     * <pre>
     * A Chat app deleted the message on behalf of the user.
     * </pre>
     *
     * <code>CREATOR_VIA_APP = 5;</code>
     */
    public static final int CREATOR_VIA_APP_VALUE = 5;
    /**
     *
     *
     * <pre>
     * A Chat app deleted the message on behalf of the space owner.
     * </pre>
     *
     * <code>SPACE_OWNER_VIA_APP = 6;</code>
     */
    public static final int SPACE_OWNER_VIA_APP_VALUE = 6;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DeletionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DeletionType forNumber(int value) {
      switch (value) {
        case 0:
          return DELETION_TYPE_UNSPECIFIED;
        case 1:
          return CREATOR;
        case 2:
          return SPACE_OWNER;
        case 3:
          return ADMIN;
        case 4:
          return APP_MESSAGE_EXPIRY;
        case 5:
          return CREATOR_VIA_APP;
        case 6:
          return SPACE_OWNER_VIA_APP;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeletionType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<DeletionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeletionType>() {
          public DeletionType findValueByNumber(int number) {
            return DeletionType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.chat.v1.DeletionMetadata.getDescriptor().getEnumTypes().get(0);
    }

    private static final DeletionType[] VALUES = values();

    public static DeletionType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DeletionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.chat.v1.DeletionMetadata.DeletionType)
  }

  public static final int DELETION_TYPE_FIELD_NUMBER = 1;
  private int deletionType_ = 0;
  /**
   *
   *
   * <pre>
   * Indicates who deleted the message.
   * </pre>
   *
   * <code>.google.chat.v1.DeletionMetadata.DeletionType deletion_type = 1;</code>
   *
   * @return The enum numeric value on the wire for deletionType.
   */
  @java.lang.Override
  public int getDeletionTypeValue() {
    return deletionType_;
  }
  /**
   *
   *
   * <pre>
   * Indicates who deleted the message.
   * </pre>
   *
   * <code>.google.chat.v1.DeletionMetadata.DeletionType deletion_type = 1;</code>
   *
   * @return The deletionType.
   */
  @java.lang.Override
  public com.google.chat.v1.DeletionMetadata.DeletionType getDeletionType() {
    com.google.chat.v1.DeletionMetadata.DeletionType result =
        com.google.chat.v1.DeletionMetadata.DeletionType.forNumber(deletionType_);
    return result == null ? com.google.chat.v1.DeletionMetadata.DeletionType.UNRECOGNIZED : result;
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
    if (deletionType_
        != com.google.chat.v1.DeletionMetadata.DeletionType.DELETION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, deletionType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deletionType_
        != com.google.chat.v1.DeletionMetadata.DeletionType.DELETION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, deletionType_);
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
    if (!(obj instanceof com.google.chat.v1.DeletionMetadata)) {
      return super.equals(obj);
    }
    com.google.chat.v1.DeletionMetadata other = (com.google.chat.v1.DeletionMetadata) obj;

    if (deletionType_ != other.deletionType_) return false;
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
    hash = (37 * hash) + DELETION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + deletionType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.DeletionMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.DeletionMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.DeletionMetadata parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.DeletionMetadata prototype) {
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
   * Information about a deleted message. A message is deleted when `delete_time`
   * is set.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.DeletionMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.DeletionMetadata)
      com.google.chat.v1.DeletionMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.DeletionMetadataProto
          .internal_static_google_chat_v1_DeletionMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.DeletionMetadataProto
          .internal_static_google_chat_v1_DeletionMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.DeletionMetadata.class,
              com.google.chat.v1.DeletionMetadata.Builder.class);
    }

    // Construct using com.google.chat.v1.DeletionMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      deletionType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.DeletionMetadataProto
          .internal_static_google_chat_v1_DeletionMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.DeletionMetadata getDefaultInstanceForType() {
      return com.google.chat.v1.DeletionMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.DeletionMetadata build() {
      com.google.chat.v1.DeletionMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.DeletionMetadata buildPartial() {
      com.google.chat.v1.DeletionMetadata result = new com.google.chat.v1.DeletionMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.DeletionMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deletionType_ = deletionType_;
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
      if (other instanceof com.google.chat.v1.DeletionMetadata) {
        return mergeFrom((com.google.chat.v1.DeletionMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.DeletionMetadata other) {
      if (other == com.google.chat.v1.DeletionMetadata.getDefaultInstance()) return this;
      if (other.deletionType_ != 0) {
        setDeletionTypeValue(other.getDeletionTypeValue());
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
            case 8:
              {
                deletionType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int deletionType_ = 0;
    /**
     *
     *
     * <pre>
     * Indicates who deleted the message.
     * </pre>
     *
     * <code>.google.chat.v1.DeletionMetadata.DeletionType deletion_type = 1;</code>
     *
     * @return The enum numeric value on the wire for deletionType.
     */
    @java.lang.Override
    public int getDeletionTypeValue() {
      return deletionType_;
    }
    /**
     *
     *
     * <pre>
     * Indicates who deleted the message.
     * </pre>
     *
     * <code>.google.chat.v1.DeletionMetadata.DeletionType deletion_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for deletionType to set.
     * @return This builder for chaining.
     */
    public Builder setDeletionTypeValue(int value) {
      deletionType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates who deleted the message.
     * </pre>
     *
     * <code>.google.chat.v1.DeletionMetadata.DeletionType deletion_type = 1;</code>
     *
     * @return The deletionType.
     */
    @java.lang.Override
    public com.google.chat.v1.DeletionMetadata.DeletionType getDeletionType() {
      com.google.chat.v1.DeletionMetadata.DeletionType result =
          com.google.chat.v1.DeletionMetadata.DeletionType.forNumber(deletionType_);
      return result == null
          ? com.google.chat.v1.DeletionMetadata.DeletionType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Indicates who deleted the message.
     * </pre>
     *
     * <code>.google.chat.v1.DeletionMetadata.DeletionType deletion_type = 1;</code>
     *
     * @param value The deletionType to set.
     * @return This builder for chaining.
     */
    public Builder setDeletionType(com.google.chat.v1.DeletionMetadata.DeletionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      deletionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates who deleted the message.
     * </pre>
     *
     * <code>.google.chat.v1.DeletionMetadata.DeletionType deletion_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeletionType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deletionType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.DeletionMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.DeletionMetadata)
  private static final com.google.chat.v1.DeletionMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.DeletionMetadata();
  }

  public static com.google.chat.v1.DeletionMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeletionMetadata> PARSER =
      new com.google.protobuf.AbstractParser<DeletionMetadata>() {
        @java.lang.Override
        public DeletionMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeletionMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeletionMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.DeletionMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
