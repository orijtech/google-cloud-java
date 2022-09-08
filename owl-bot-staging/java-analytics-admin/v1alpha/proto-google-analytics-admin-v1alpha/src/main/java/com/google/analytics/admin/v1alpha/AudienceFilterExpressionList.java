// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/audience.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * A list of Audience filter expressions.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AudienceFilterExpressionList}
 */
public final class AudienceFilterExpressionList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AudienceFilterExpressionList)
    AudienceFilterExpressionListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudienceFilterExpressionList.newBuilder() to construct.
  private AudienceFilterExpressionList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudienceFilterExpressionList() {
    filterExpressions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudienceFilterExpressionList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AudienceFilterExpressionList(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              filterExpressions_ = new java.util.ArrayList<com.google.analytics.admin.v1alpha.AudienceFilterExpression>();
              mutable_bitField0_ |= 0x00000001;
            }
            filterExpressions_.add(
                input.readMessage(com.google.analytics.admin.v1alpha.AudienceFilterExpression.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        filterExpressions_ = java.util.Collections.unmodifiableList(filterExpressions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1alpha.AudienceProto.internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AudienceProto.internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AudienceFilterExpressionList.class, com.google.analytics.admin.v1alpha.AudienceFilterExpressionList.Builder.class);
  }

  public static final int FILTER_EXPRESSIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.admin.v1alpha.AudienceFilterExpression> filterExpressions_;
  /**
   * <pre>
   * A list of Audience filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.AudienceFilterExpression> getFilterExpressionsList() {
    return filterExpressions_;
  }
  /**
   * <pre>
   * A list of Audience filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder> 
      getFilterExpressionsOrBuilderList() {
    return filterExpressions_;
  }
  /**
   * <pre>
   * A list of Audience filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
   */
  @java.lang.Override
  public int getFilterExpressionsCount() {
    return filterExpressions_.size();
  }
  /**
   * <pre>
   * A list of Audience filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterExpression getFilterExpressions(int index) {
    return filterExpressions_.get(index);
  }
  /**
   * <pre>
   * A list of Audience filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder getFilterExpressionsOrBuilder(
      int index) {
    return filterExpressions_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < filterExpressions_.size(); i++) {
      output.writeMessage(1, filterExpressions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < filterExpressions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, filterExpressions_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AudienceFilterExpressionList)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AudienceFilterExpressionList other = (com.google.analytics.admin.v1alpha.AudienceFilterExpressionList) obj;

    if (!getFilterExpressionsList()
        .equals(other.getFilterExpressionsList())) return false;
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
    if (getFilterExpressionsCount() > 0) {
      hash = (37 * hash) + FILTER_EXPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getFilterExpressionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.analytics.admin.v1alpha.AudienceFilterExpressionList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A list of Audience filter expressions.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AudienceFilterExpressionList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AudienceFilterExpressionList)
      com.google.analytics.admin.v1alpha.AudienceFilterExpressionListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1alpha.AudienceProto.internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AudienceProto.internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AudienceFilterExpressionList.class, com.google.analytics.admin.v1alpha.AudienceFilterExpressionList.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AudienceFilterExpressionList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFilterExpressionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (filterExpressionsBuilder_ == null) {
        filterExpressions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        filterExpressionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AudienceProto.internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceFilterExpressionList getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AudienceFilterExpressionList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceFilterExpressionList build() {
      com.google.analytics.admin.v1alpha.AudienceFilterExpressionList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceFilterExpressionList buildPartial() {
      com.google.analytics.admin.v1alpha.AudienceFilterExpressionList result = new com.google.analytics.admin.v1alpha.AudienceFilterExpressionList(this);
      int from_bitField0_ = bitField0_;
      if (filterExpressionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          filterExpressions_ = java.util.Collections.unmodifiableList(filterExpressions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.filterExpressions_ = filterExpressions_;
      } else {
        result.filterExpressions_ = filterExpressionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.admin.v1alpha.AudienceFilterExpressionList) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AudienceFilterExpressionList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AudienceFilterExpressionList other) {
      if (other == com.google.analytics.admin.v1alpha.AudienceFilterExpressionList.getDefaultInstance()) return this;
      if (filterExpressionsBuilder_ == null) {
        if (!other.filterExpressions_.isEmpty()) {
          if (filterExpressions_.isEmpty()) {
            filterExpressions_ = other.filterExpressions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFilterExpressionsIsMutable();
            filterExpressions_.addAll(other.filterExpressions_);
          }
          onChanged();
        }
      } else {
        if (!other.filterExpressions_.isEmpty()) {
          if (filterExpressionsBuilder_.isEmpty()) {
            filterExpressionsBuilder_.dispose();
            filterExpressionsBuilder_ = null;
            filterExpressions_ = other.filterExpressions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            filterExpressionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFilterExpressionsFieldBuilder() : null;
          } else {
            filterExpressionsBuilder_.addAllMessages(other.filterExpressions_);
          }
        }
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
      com.google.analytics.admin.v1alpha.AudienceFilterExpressionList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1alpha.AudienceFilterExpressionList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.analytics.admin.v1alpha.AudienceFilterExpression> filterExpressions_ =
      java.util.Collections.emptyList();
    private void ensureFilterExpressionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        filterExpressions_ = new java.util.ArrayList<com.google.analytics.admin.v1alpha.AudienceFilterExpression>(filterExpressions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1alpha.AudienceFilterExpression, com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder, com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder> filterExpressionsBuilder_;

    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AudienceFilterExpression> getFilterExpressionsList() {
      if (filterExpressionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(filterExpressions_);
      } else {
        return filterExpressionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public int getFilterExpressionsCount() {
      if (filterExpressionsBuilder_ == null) {
        return filterExpressions_.size();
      } else {
        return filterExpressionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression getFilterExpressions(int index) {
      if (filterExpressionsBuilder_ == null) {
        return filterExpressions_.get(index);
      } else {
        return filterExpressionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder setFilterExpressions(
        int index, com.google.analytics.admin.v1alpha.AudienceFilterExpression value) {
      if (filterExpressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilterExpressionsIsMutable();
        filterExpressions_.set(index, value);
        onChanged();
      } else {
        filterExpressionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder setFilterExpressions(
        int index, com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder builderForValue) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.set(index, builderForValue.build());
        onChanged();
      } else {
        filterExpressionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder addFilterExpressions(com.google.analytics.admin.v1alpha.AudienceFilterExpression value) {
      if (filterExpressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(value);
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder addFilterExpressions(
        int index, com.google.analytics.admin.v1alpha.AudienceFilterExpression value) {
      if (filterExpressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(index, value);
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder addFilterExpressions(
        com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder builderForValue) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(builderForValue.build());
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder addFilterExpressions(
        int index, com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder builderForValue) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(index, builderForValue.build());
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder addAllFilterExpressions(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.AudienceFilterExpression> values) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filterExpressions_);
        onChanged();
      } else {
        filterExpressionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder clearFilterExpressions() {
      if (filterExpressionsBuilder_ == null) {
        filterExpressions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        filterExpressionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public Builder removeFilterExpressions(int index) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.remove(index);
        onChanged();
      } else {
        filterExpressionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder getFilterExpressionsBuilder(
        int index) {
      return getFilterExpressionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder getFilterExpressionsOrBuilder(
        int index) {
      if (filterExpressionsBuilder_ == null) {
        return filterExpressions_.get(index);  } else {
        return filterExpressionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder> 
         getFilterExpressionsOrBuilderList() {
      if (filterExpressionsBuilder_ != null) {
        return filterExpressionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(filterExpressions_);
      }
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder addFilterExpressionsBuilder() {
      return getFilterExpressionsFieldBuilder().addBuilder(
          com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder addFilterExpressionsBuilder(
        int index) {
      return getFilterExpressionsFieldBuilder().addBuilder(
          index, com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of Audience filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expressions = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder> 
         getFilterExpressionsBuilderList() {
      return getFilterExpressionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1alpha.AudienceFilterExpression, com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder, com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder> 
        getFilterExpressionsFieldBuilder() {
      if (filterExpressionsBuilder_ == null) {
        filterExpressionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AudienceFilterExpression, com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder, com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder>(
                filterExpressions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        filterExpressions_ = null;
      }
      return filterExpressionsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AudienceFilterExpressionList)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AudienceFilterExpressionList)
  private static final com.google.analytics.admin.v1alpha.AudienceFilterExpressionList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AudienceFilterExpressionList();
  }

  public static com.google.analytics.admin.v1alpha.AudienceFilterExpressionList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceFilterExpressionList>
      PARSER = new com.google.protobuf.AbstractParser<AudienceFilterExpressionList>() {
    @java.lang.Override
    public AudienceFilterExpressionList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AudienceFilterExpressionList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AudienceFilterExpressionList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceFilterExpressionList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterExpressionList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
