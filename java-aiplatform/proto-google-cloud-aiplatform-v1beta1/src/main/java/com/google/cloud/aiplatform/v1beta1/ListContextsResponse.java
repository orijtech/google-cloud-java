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
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [MetadataService.ListContexts][google.cloud.aiplatform.v1beta1.MetadataService.ListContexts].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListContextsResponse}
 */
public final class ListContextsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListContextsResponse)
    ListContextsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListContextsResponse.newBuilder() to construct.
  private ListContextsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListContextsResponse() {
    contexts_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListContextsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListContextsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                contexts_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Context>();
                mutable_bitField0_ |= 0x00000001;
              }
              contexts_.add(
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.Context.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        contexts_ = java.util.Collections.unmodifiableList(contexts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListContextsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListContextsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListContextsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListContextsResponse.Builder.class);
  }

  public static final int CONTEXTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Context> contexts_;
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Context> getContextsList() {
    return contexts_;
  }
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ContextOrBuilder>
      getContextsOrBuilderList() {
    return contexts_;
  }
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
   */
  @java.lang.Override
  public int getContextsCount() {
    return contexts_.size();
  }
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Context getContexts(int index) {
    return contexts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ContextOrBuilder getContextsOrBuilder(int index) {
    return contexts_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1beta1.ListContextsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1beta1.ListContextsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < contexts_.size(); i++) {
      output.writeMessage(1, contexts_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contexts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, contexts_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListContextsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListContextsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListContextsResponse) obj;

    if (!getContextsList().equals(other.getContextsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getContextsCount() > 0) {
      hash = (37 * hash) + CONTEXTS_FIELD_NUMBER;
      hash = (53 * hash) + getContextsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListContextsResponse prototype) {
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
   * Response message for [MetadataService.ListContexts][google.cloud.aiplatform.v1beta1.MetadataService.ListContexts].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListContextsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListContextsResponse)
      com.google.cloud.aiplatform.v1beta1.ListContextsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListContextsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListContextsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListContextsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListContextsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListContextsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getContextsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (contextsBuilder_ == null) {
        contexts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        contextsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListContextsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListContextsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListContextsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListContextsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListContextsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListContextsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListContextsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListContextsResponse(this);
      int from_bitField0_ = bitField0_;
      if (contextsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contexts_ = java.util.Collections.unmodifiableList(contexts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contexts_ = contexts_;
      } else {
        result.contexts_ = contextsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListContextsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListContextsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListContextsResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListContextsResponse.getDefaultInstance())
        return this;
      if (contextsBuilder_ == null) {
        if (!other.contexts_.isEmpty()) {
          if (contexts_.isEmpty()) {
            contexts_ = other.contexts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContextsIsMutable();
            contexts_.addAll(other.contexts_);
          }
          onChanged();
        }
      } else {
        if (!other.contexts_.isEmpty()) {
          if (contextsBuilder_.isEmpty()) {
            contextsBuilder_.dispose();
            contextsBuilder_ = null;
            contexts_ = other.contexts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contextsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getContextsFieldBuilder()
                    : null;
          } else {
            contextsBuilder_.addAllMessages(other.contexts_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.aiplatform.v1beta1.ListContextsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ListContextsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Context> contexts_ =
        java.util.Collections.emptyList();

    private void ensureContextsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contexts_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Context>(contexts_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Context,
            com.google.cloud.aiplatform.v1beta1.Context.Builder,
            com.google.cloud.aiplatform.v1beta1.ContextOrBuilder>
        contextsBuilder_;

    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Context> getContextsList() {
      if (contextsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contexts_);
      } else {
        return contextsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public int getContextsCount() {
      if (contextsBuilder_ == null) {
        return contexts_.size();
      } else {
        return contextsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Context getContexts(int index) {
      if (contextsBuilder_ == null) {
        return contexts_.get(index);
      } else {
        return contextsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder setContexts(int index, com.google.cloud.aiplatform.v1beta1.Context value) {
      if (contextsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContextsIsMutable();
        contexts_.set(index, value);
        onChanged();
      } else {
        contextsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder setContexts(
        int index, com.google.cloud.aiplatform.v1beta1.Context.Builder builderForValue) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.set(index, builderForValue.build());
        onChanged();
      } else {
        contextsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder addContexts(com.google.cloud.aiplatform.v1beta1.Context value) {
      if (contextsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContextsIsMutable();
        contexts_.add(value);
        onChanged();
      } else {
        contextsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder addContexts(int index, com.google.cloud.aiplatform.v1beta1.Context value) {
      if (contextsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContextsIsMutable();
        contexts_.add(index, value);
        onChanged();
      } else {
        contextsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder addContexts(
        com.google.cloud.aiplatform.v1beta1.Context.Builder builderForValue) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.add(builderForValue.build());
        onChanged();
      } else {
        contextsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder addContexts(
        int index, com.google.cloud.aiplatform.v1beta1.Context.Builder builderForValue) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.add(index, builderForValue.build());
        onChanged();
      } else {
        contextsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder addAllContexts(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Context> values) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, contexts_);
        onChanged();
      } else {
        contextsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder clearContexts() {
      if (contextsBuilder_ == null) {
        contexts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contextsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public Builder removeContexts(int index) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.remove(index);
        onChanged();
      } else {
        contextsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Context.Builder getContextsBuilder(int index) {
      return getContextsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ContextOrBuilder getContextsOrBuilder(int index) {
      if (contextsBuilder_ == null) {
        return contexts_.get(index);
      } else {
        return contextsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ContextOrBuilder>
        getContextsOrBuilderList() {
      if (contextsBuilder_ != null) {
        return contextsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contexts_);
      }
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Context.Builder addContextsBuilder() {
      return getContextsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Context.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Context.Builder addContextsBuilder(int index) {
      return getContextsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Context.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Contexts retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Context contexts = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Context.Builder>
        getContextsBuilderList() {
      return getContextsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Context,
            com.google.cloud.aiplatform.v1beta1.Context.Builder,
            com.google.cloud.aiplatform.v1beta1.ContextOrBuilder>
        getContextsFieldBuilder() {
      if (contextsBuilder_ == null) {
        contextsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Context,
                com.google.cloud.aiplatform.v1beta1.Context.Builder,
                com.google.cloud.aiplatform.v1beta1.ContextOrBuilder>(
                contexts_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        contexts_ = null;
      }
      return contextsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1beta1.ListContextsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1beta1.ListContextsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1beta1.ListContextsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1beta1.ListContextsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1beta1.ListContextsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListContextsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListContextsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListContextsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListContextsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListContextsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListContextsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListContextsResponse>() {
        @java.lang.Override
        public ListContextsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListContextsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListContextsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListContextsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListContextsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
