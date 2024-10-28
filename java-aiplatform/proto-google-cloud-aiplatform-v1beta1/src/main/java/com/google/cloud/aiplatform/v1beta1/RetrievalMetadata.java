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
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Metadata related to retrieval in the grounding flow.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RetrievalMetadata}
 */
public final class RetrievalMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RetrievalMetadata)
    RetrievalMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RetrievalMetadata.newBuilder() to construct.
  private RetrievalMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetrievalMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetrievalMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ContentProto
        .internal_static_google_cloud_aiplatform_v1beta1_RetrievalMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ContentProto
        .internal_static_google_cloud_aiplatform_v1beta1_RetrievalMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RetrievalMetadata.class,
            com.google.cloud.aiplatform.v1beta1.RetrievalMetadata.Builder.class);
  }

  public static final int GOOGLE_SEARCH_DYNAMIC_RETRIEVAL_SCORE_FIELD_NUMBER = 2;
  private float googleSearchDynamicRetrievalScore_ = 0F;
  /**
   *
   *
   * <pre>
   * Optional. Score indicating how likely information from Google Search could
   * help answer the prompt. The score is in the range `[0, 1]`, where 0 is the
   * least likely and 1 is the most likely. This score is only populated when
   * Google Search grounding and dynamic retrieval is enabled. It will be
   * compared to the threshold to determine whether to trigger Google Search.
   * </pre>
   *
   * <code>
   * float google_search_dynamic_retrieval_score = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The googleSearchDynamicRetrievalScore.
   */
  @java.lang.Override
  public float getGoogleSearchDynamicRetrievalScore() {
    return googleSearchDynamicRetrievalScore_;
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
    if (java.lang.Float.floatToRawIntBits(googleSearchDynamicRetrievalScore_) != 0) {
      output.writeFloat(2, googleSearchDynamicRetrievalScore_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(googleSearchDynamicRetrievalScore_) != 0) {
      size +=
          com.google.protobuf.CodedOutputStream.computeFloatSize(
              2, googleSearchDynamicRetrievalScore_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RetrievalMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RetrievalMetadata other =
        (com.google.cloud.aiplatform.v1beta1.RetrievalMetadata) obj;

    if (java.lang.Float.floatToIntBits(getGoogleSearchDynamicRetrievalScore())
        != java.lang.Float.floatToIntBits(other.getGoogleSearchDynamicRetrievalScore()))
      return false;
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
    hash = (37 * hash) + GOOGLE_SEARCH_DYNAMIC_RETRIEVAL_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getGoogleSearchDynamicRetrievalScore());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.RetrievalMetadata prototype) {
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
   * Metadata related to retrieval in the grounding flow.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RetrievalMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RetrievalMetadata)
      com.google.cloud.aiplatform.v1beta1.RetrievalMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto
          .internal_static_google_cloud_aiplatform_v1beta1_RetrievalMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto
          .internal_static_google_cloud_aiplatform_v1beta1_RetrievalMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RetrievalMetadata.class,
              com.google.cloud.aiplatform.v1beta1.RetrievalMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RetrievalMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      googleSearchDynamicRetrievalScore_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto
          .internal_static_google_cloud_aiplatform_v1beta1_RetrievalMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RetrievalMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RetrievalMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RetrievalMetadata build() {
      com.google.cloud.aiplatform.v1beta1.RetrievalMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RetrievalMetadata buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RetrievalMetadata result =
          new com.google.cloud.aiplatform.v1beta1.RetrievalMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.RetrievalMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.googleSearchDynamicRetrievalScore_ = googleSearchDynamicRetrievalScore_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RetrievalMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RetrievalMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.RetrievalMetadata other) {
      if (other == com.google.cloud.aiplatform.v1beta1.RetrievalMetadata.getDefaultInstance())
        return this;
      if (other.getGoogleSearchDynamicRetrievalScore() != 0F) {
        setGoogleSearchDynamicRetrievalScore(other.getGoogleSearchDynamicRetrievalScore());
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
            case 21:
              {
                googleSearchDynamicRetrievalScore_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 21
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

    private float googleSearchDynamicRetrievalScore_;
    /**
     *
     *
     * <pre>
     * Optional. Score indicating how likely information from Google Search could
     * help answer the prompt. The score is in the range `[0, 1]`, where 0 is the
     * least likely and 1 is the most likely. This score is only populated when
     * Google Search grounding and dynamic retrieval is enabled. It will be
     * compared to the threshold to determine whether to trigger Google Search.
     * </pre>
     *
     * <code>
     * float google_search_dynamic_retrieval_score = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The googleSearchDynamicRetrievalScore.
     */
    @java.lang.Override
    public float getGoogleSearchDynamicRetrievalScore() {
      return googleSearchDynamicRetrievalScore_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Score indicating how likely information from Google Search could
     * help answer the prompt. The score is in the range `[0, 1]`, where 0 is the
     * least likely and 1 is the most likely. This score is only populated when
     * Google Search grounding and dynamic retrieval is enabled. It will be
     * compared to the threshold to determine whether to trigger Google Search.
     * </pre>
     *
     * <code>
     * float google_search_dynamic_retrieval_score = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The googleSearchDynamicRetrievalScore to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleSearchDynamicRetrievalScore(float value) {

      googleSearchDynamicRetrievalScore_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Score indicating how likely information from Google Search could
     * help answer the prompt. The score is in the range `[0, 1]`, where 0 is the
     * least likely and 1 is the most likely. This score is only populated when
     * Google Search grounding and dynamic retrieval is enabled. It will be
     * compared to the threshold to determine whether to trigger Google Search.
     * </pre>
     *
     * <code>
     * float google_search_dynamic_retrieval_score = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGoogleSearchDynamicRetrievalScore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      googleSearchDynamicRetrievalScore_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RetrievalMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RetrievalMetadata)
  private static final com.google.cloud.aiplatform.v1beta1.RetrievalMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RetrievalMetadata();
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrievalMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrievalMetadata> PARSER =
      new com.google.protobuf.AbstractParser<RetrievalMetadata>() {
        @java.lang.Override
        public RetrievalMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetrievalMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrievalMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RetrievalMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
