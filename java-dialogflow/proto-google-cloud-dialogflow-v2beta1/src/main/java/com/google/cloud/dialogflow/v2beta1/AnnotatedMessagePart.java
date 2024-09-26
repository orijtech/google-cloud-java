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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Represents a part of a message possibly annotated with an entity. The part
 * can be an entity or purely a part of the message between two entities or
 * message start/end.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.AnnotatedMessagePart}
 */
public final class AnnotatedMessagePart extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.AnnotatedMessagePart)
    AnnotatedMessagePartOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnnotatedMessagePart.newBuilder() to construct.
  private AnnotatedMessagePart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnnotatedMessagePart() {
    text_ = "";
    entityType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AnnotatedMessagePart();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_AnnotatedMessagePart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_AnnotatedMessagePart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.class,
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder.class);
  }

  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   *
   *
   * <pre>
   * Required. A part of a message possibly annotated with an entity.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. A part of a message possibly annotated with an entity.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entityType_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity
   * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
   * of this message part. If this is empty, Dialogflow could not annotate the
   * phrase part with a system entity.
   * </pre>
   *
   * <code>string entity_type = 2;</code>
   *
   * @return The entityType.
   */
  @java.lang.Override
  public java.lang.String getEntityType() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity
   * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
   * of this message part. If this is empty, Dialogflow could not annotate the
   * phrase part with a system entity.
   * </pre>
   *
   * <code>string entity_type = 2;</code>
   *
   * @return The bytes for entityType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntityTypeBytes() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entityType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORMATTED_VALUE_FIELD_NUMBER = 3;
  private com.google.protobuf.Value formattedValue_;
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
   * this message part. For example for a system entity of type
   * `&#64;sys.unit-currency`, this may contain:
   * &lt;pre&gt;
   * {
   *   "amount": 5,
   *   "currency": "USD"
   * }
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Value formatted_value = 3;</code>
   *
   * @return Whether the formattedValue field is set.
   */
  @java.lang.Override
  public boolean hasFormattedValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
   * this message part. For example for a system entity of type
   * `&#64;sys.unit-currency`, this may contain:
   * &lt;pre&gt;
   * {
   *   "amount": 5,
   *   "currency": "USD"
   * }
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Value formatted_value = 3;</code>
   *
   * @return The formattedValue.
   */
  @java.lang.Override
  public com.google.protobuf.Value getFormattedValue() {
    return formattedValue_ == null
        ? com.google.protobuf.Value.getDefaultInstance()
        : formattedValue_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
   * this message part. For example for a system entity of type
   * `&#64;sys.unit-currency`, this may contain:
   * &lt;pre&gt;
   * {
   *   "amount": 5,
   *   "currency": "USD"
   * }
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Value formatted_value = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getFormattedValueOrBuilder() {
    return formattedValue_ == null
        ? com.google.protobuf.Value.getDefaultInstance()
        : formattedValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getFormattedValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entityType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getFormattedValue());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart other =
        (com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart) obj;

    if (!getText().equals(other.getText())) return false;
    if (!getEntityType().equals(other.getEntityType())) return false;
    if (hasFormattedValue() != other.hasFormattedValue()) return false;
    if (hasFormattedValue()) {
      if (!getFormattedValue().equals(other.getFormattedValue())) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEntityType().hashCode();
    if (hasFormattedValue()) {
      hash = (37 * hash) + FORMATTED_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getFormattedValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart prototype) {
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
   * Represents a part of a message possibly annotated with an entity. The part
   * can be an entity or purely a part of the message between two entities or
   * message start/end.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.AnnotatedMessagePart}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.AnnotatedMessagePart)
      com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_AnnotatedMessagePart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_AnnotatedMessagePart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.class,
              com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFormattedValueFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      text_ = "";
      entityType_ = "";
      formattedValue_ = null;
      if (formattedValueBuilder_ != null) {
        formattedValueBuilder_.dispose();
        formattedValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_AnnotatedMessagePart_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart build() {
      com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart buildPartial() {
      com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart result =
          new com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityType_ = entityType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.formattedValue_ =
            formattedValueBuilder_ == null ? formattedValue_ : formattedValueBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart other) {
      if (other == com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.getDefaultInstance())
        return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEntityType().isEmpty()) {
        entityType_ = other.entityType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasFormattedValue()) {
        mergeFormattedValue(other.getFormattedValue());
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
                text_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                entityType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getFormattedValueFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object text_ = "";
    /**
     *
     *
     * <pre>
     * Required. A part of a message possibly annotated with an entity.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A part of a message possibly annotated with an entity.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A part of a message possibly annotated with an entity.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A part of a message possibly annotated with an entity.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A part of a message possibly annotated with an entity.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object entityType_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity
     * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
     * of this message part. If this is empty, Dialogflow could not annotate the
     * phrase part with a system entity.
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @return The entityType.
     */
    public java.lang.String getEntityType() {
      java.lang.Object ref = entityType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity
     * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
     * of this message part. If this is empty, Dialogflow could not annotate the
     * phrase part with a system entity.
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @return The bytes for entityType.
     */
    public com.google.protobuf.ByteString getEntityTypeBytes() {
      java.lang.Object ref = entityType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entityType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity
     * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
     * of this message part. If this is empty, Dialogflow could not annotate the
     * phrase part with a system entity.
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @param value The entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entityType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity
     * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
     * of this message part. If this is empty, Dialogflow could not annotate the
     * phrase part with a system entity.
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityType() {
      entityType_ = getDefaultInstance().getEntityType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity
     * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
     * of this message part. If this is empty, Dialogflow could not annotate the
     * phrase part with a system entity.
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @param value The bytes for entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entityType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Value formattedValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        formattedValueBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     *
     * @return Whether the formattedValue field is set.
     */
    public boolean hasFormattedValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     *
     * @return The formattedValue.
     */
    public com.google.protobuf.Value getFormattedValue() {
      if (formattedValueBuilder_ == null) {
        return formattedValue_ == null
            ? com.google.protobuf.Value.getDefaultInstance()
            : formattedValue_;
      } else {
        return formattedValueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     */
    public Builder setFormattedValue(com.google.protobuf.Value value) {
      if (formattedValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        formattedValue_ = value;
      } else {
        formattedValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     */
    public Builder setFormattedValue(com.google.protobuf.Value.Builder builderForValue) {
      if (formattedValueBuilder_ == null) {
        formattedValue_ = builderForValue.build();
      } else {
        formattedValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     */
    public Builder mergeFormattedValue(com.google.protobuf.Value value) {
      if (formattedValueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && formattedValue_ != null
            && formattedValue_ != com.google.protobuf.Value.getDefaultInstance()) {
          getFormattedValueBuilder().mergeFrom(value);
        } else {
          formattedValue_ = value;
        }
      } else {
        formattedValueBuilder_.mergeFrom(value);
      }
      if (formattedValue_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     */
    public Builder clearFormattedValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      formattedValue_ = null;
      if (formattedValueBuilder_ != null) {
        formattedValueBuilder_.dispose();
        formattedValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     */
    public com.google.protobuf.Value.Builder getFormattedValueBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFormattedValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     */
    public com.google.protobuf.ValueOrBuilder getFormattedValueOrBuilder() {
      if (formattedValueBuilder_ != null) {
        return formattedValueBuilder_.getMessageOrBuilder();
      } else {
        return formattedValue_ == null
            ? com.google.protobuf.Value.getDefaultInstance()
            : formattedValue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The [Dialogflow system entity formatted value
     * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
     * this message part. For example for a system entity of type
     * `&#64;sys.unit-currency`, this may contain:
     * &lt;pre&gt;
     * {
     *   "amount": 5,
     *   "currency": "USD"
     * }
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>.google.protobuf.Value formatted_value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        getFormattedValueFieldBuilder() {
      if (formattedValueBuilder_ == null) {
        formattedValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Value,
                com.google.protobuf.Value.Builder,
                com.google.protobuf.ValueOrBuilder>(
                getFormattedValue(), getParentForChildren(), isClean());
        formattedValue_ = null;
      }
      return formattedValueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.AnnotatedMessagePart)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.AnnotatedMessagePart)
  private static final com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart();
  }

  public static com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotatedMessagePart> PARSER =
      new com.google.protobuf.AbstractParser<AnnotatedMessagePart>() {
        @java.lang.Override
        public AnnotatedMessagePart parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnnotatedMessagePart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotatedMessagePart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
