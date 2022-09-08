// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1beta/data.proto

package com.google.analytics.data.v1beta;

/**
 * <pre>
 * A contiguous set of minutes: startMinutesAgo, startMinutesAgo + 1, ...,
 * endMinutesAgo. Requests are allowed up to 2 minute ranges.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1beta.MinuteRange}
 */
public final class MinuteRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1beta.MinuteRange)
    MinuteRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MinuteRange.newBuilder() to construct.
  private MinuteRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MinuteRange() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MinuteRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MinuteRange(
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
          case 8: {
            bitField0_ |= 0x00000001;
            startMinutesAgo_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            endMinutesAgo_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.data.v1beta.ReportingApiProto.internal_static_google_analytics_data_v1beta_MinuteRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1beta.ReportingApiProto.internal_static_google_analytics_data_v1beta_MinuteRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1beta.MinuteRange.class, com.google.analytics.data.v1beta.MinuteRange.Builder.class);
  }

  private int bitField0_;
  public static final int START_MINUTES_AGO_FIELD_NUMBER = 1;
  private int startMinutesAgo_;
  /**
   * <pre>
   * The inclusive start minute for the query as a number of minutes before now.
   * For example, `"startMinutesAgo": 29` specifies the report should include
   * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
   * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
   * properties can request up to the last 30 minutes of event data
   * (`startMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
   * up to the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 start_minutes_ago = 1;</code>
   * @return Whether the startMinutesAgo field is set.
   */
  @java.lang.Override
  public boolean hasStartMinutesAgo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The inclusive start minute for the query as a number of minutes before now.
   * For example, `"startMinutesAgo": 29` specifies the report should include
   * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
   * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
   * properties can request up to the last 30 minutes of event data
   * (`startMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
   * up to the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 start_minutes_ago = 1;</code>
   * @return The startMinutesAgo.
   */
  @java.lang.Override
  public int getStartMinutesAgo() {
    return startMinutesAgo_;
  }

  public static final int END_MINUTES_AGO_FIELD_NUMBER = 2;
  private int endMinutesAgo_;
  /**
   * <pre>
   * The inclusive end minute for the query as a number of minutes before now.
   * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
   * specifies the report should include event data from prior to 15 minutes
   * ago.
   * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
   * properties can request any minute in the last 30 minutes of event data
   * (`endMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
   * any minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 end_minutes_ago = 2;</code>
   * @return Whether the endMinutesAgo field is set.
   */
  @java.lang.Override
  public boolean hasEndMinutesAgo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The inclusive end minute for the query as a number of minutes before now.
   * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
   * specifies the report should include event data from prior to 15 minutes
   * ago.
   * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
   * properties can request any minute in the last 30 minutes of event data
   * (`endMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
   * any minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 end_minutes_ago = 2;</code>
   * @return The endMinutesAgo.
   */
  @java.lang.Override
  public int getEndMinutesAgo() {
    return endMinutesAgo_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Assigns a name to this minute range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, minute ranges are named by their zero based index
   * in the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Assigns a name to this minute range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, minute ranges are named by their zero based index
   * in the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, startMinutesAgo_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, endMinutesAgo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, startMinutesAgo_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, endMinutesAgo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof com.google.analytics.data.v1beta.MinuteRange)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1beta.MinuteRange other = (com.google.analytics.data.v1beta.MinuteRange) obj;

    if (hasStartMinutesAgo() != other.hasStartMinutesAgo()) return false;
    if (hasStartMinutesAgo()) {
      if (getStartMinutesAgo()
          != other.getStartMinutesAgo()) return false;
    }
    if (hasEndMinutesAgo() != other.hasEndMinutesAgo()) return false;
    if (hasEndMinutesAgo()) {
      if (getEndMinutesAgo()
          != other.getEndMinutesAgo()) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
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
    if (hasStartMinutesAgo()) {
      hash = (37 * hash) + START_MINUTES_AGO_FIELD_NUMBER;
      hash = (53 * hash) + getStartMinutesAgo();
    }
    if (hasEndMinutesAgo()) {
      hash = (37 * hash) + END_MINUTES_AGO_FIELD_NUMBER;
      hash = (53 * hash) + getEndMinutesAgo();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1beta.MinuteRange parseFrom(
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
  public static Builder newBuilder(com.google.analytics.data.v1beta.MinuteRange prototype) {
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
   * A contiguous set of minutes: startMinutesAgo, startMinutesAgo + 1, ...,
   * endMinutesAgo. Requests are allowed up to 2 minute ranges.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1beta.MinuteRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1beta.MinuteRange)
      com.google.analytics.data.v1beta.MinuteRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.data.v1beta.ReportingApiProto.internal_static_google_analytics_data_v1beta_MinuteRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1beta.ReportingApiProto.internal_static_google_analytics_data_v1beta_MinuteRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1beta.MinuteRange.class, com.google.analytics.data.v1beta.MinuteRange.Builder.class);
    }

    // Construct using com.google.analytics.data.v1beta.MinuteRange.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      startMinutesAgo_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      endMinutesAgo_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.data.v1beta.ReportingApiProto.internal_static_google_analytics_data_v1beta_MinuteRange_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.MinuteRange getDefaultInstanceForType() {
      return com.google.analytics.data.v1beta.MinuteRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.MinuteRange build() {
      com.google.analytics.data.v1beta.MinuteRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.MinuteRange buildPartial() {
      com.google.analytics.data.v1beta.MinuteRange result = new com.google.analytics.data.v1beta.MinuteRange(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startMinutesAgo_ = startMinutesAgo_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endMinutesAgo_ = endMinutesAgo_;
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.analytics.data.v1beta.MinuteRange) {
        return mergeFrom((com.google.analytics.data.v1beta.MinuteRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1beta.MinuteRange other) {
      if (other == com.google.analytics.data.v1beta.MinuteRange.getDefaultInstance()) return this;
      if (other.hasStartMinutesAgo()) {
        setStartMinutesAgo(other.getStartMinutesAgo());
      }
      if (other.hasEndMinutesAgo()) {
        setEndMinutesAgo(other.getEndMinutesAgo());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
      com.google.analytics.data.v1beta.MinuteRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1beta.MinuteRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int startMinutesAgo_ ;
    /**
     * <pre>
     * The inclusive start minute for the query as a number of minutes before now.
     * For example, `"startMinutesAgo": 29` specifies the report should include
     * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
     * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
     * properties can request up to the last 30 minutes of event data
     * (`startMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * up to the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 start_minutes_ago = 1;</code>
     * @return Whether the startMinutesAgo field is set.
     */
    @java.lang.Override
    public boolean hasStartMinutesAgo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The inclusive start minute for the query as a number of minutes before now.
     * For example, `"startMinutesAgo": 29` specifies the report should include
     * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
     * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
     * properties can request up to the last 30 minutes of event data
     * (`startMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * up to the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 start_minutes_ago = 1;</code>
     * @return The startMinutesAgo.
     */
    @java.lang.Override
    public int getStartMinutesAgo() {
      return startMinutesAgo_;
    }
    /**
     * <pre>
     * The inclusive start minute for the query as a number of minutes before now.
     * For example, `"startMinutesAgo": 29` specifies the report should include
     * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
     * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
     * properties can request up to the last 30 minutes of event data
     * (`startMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * up to the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 start_minutes_ago = 1;</code>
     * @param value The startMinutesAgo to set.
     * @return This builder for chaining.
     */
    public Builder setStartMinutesAgo(int value) {
      bitField0_ |= 0x00000001;
      startMinutesAgo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive start minute for the query as a number of minutes before now.
     * For example, `"startMinutesAgo": 29` specifies the report should include
     * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
     * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
     * properties can request up to the last 30 minutes of event data
     * (`startMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * up to the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 start_minutes_ago = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartMinutesAgo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startMinutesAgo_ = 0;
      onChanged();
      return this;
    }

    private int endMinutesAgo_ ;
    /**
     * <pre>
     * The inclusive end minute for the query as a number of minutes before now.
     * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
     * specifies the report should include event data from prior to 15 minutes
     * ago.
     * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
     * properties can request any minute in the last 30 minutes of event data
     * (`endMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * any minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 end_minutes_ago = 2;</code>
     * @return Whether the endMinutesAgo field is set.
     */
    @java.lang.Override
    public boolean hasEndMinutesAgo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The inclusive end minute for the query as a number of minutes before now.
     * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
     * specifies the report should include event data from prior to 15 minutes
     * ago.
     * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
     * properties can request any minute in the last 30 minutes of event data
     * (`endMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * any minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 end_minutes_ago = 2;</code>
     * @return The endMinutesAgo.
     */
    @java.lang.Override
    public int getEndMinutesAgo() {
      return endMinutesAgo_;
    }
    /**
     * <pre>
     * The inclusive end minute for the query as a number of minutes before now.
     * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
     * specifies the report should include event data from prior to 15 minutes
     * ago.
     * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
     * properties can request any minute in the last 30 minutes of event data
     * (`endMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * any minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 end_minutes_ago = 2;</code>
     * @param value The endMinutesAgo to set.
     * @return This builder for chaining.
     */
    public Builder setEndMinutesAgo(int value) {
      bitField0_ |= 0x00000002;
      endMinutesAgo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive end minute for the query as a number of minutes before now.
     * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
     * specifies the report should include event data from prior to 15 minutes
     * ago.
     * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
     * properties can request any minute in the last 30 minutes of event data
     * (`endMinutesAgo &lt;= 29`), and Google Analytics 360 properties can request
     * any minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
     * </pre>
     *
     * <code>optional int32 end_minutes_ago = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndMinutesAgo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endMinutesAgo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Assigns a name to this minute range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, minute ranges are named by their zero based index
     * in the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Assigns a name to this minute range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, minute ranges are named by their zero based index
     * in the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Assigns a name to this minute range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, minute ranges are named by their zero based index
     * in the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Assigns a name to this minute range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, minute ranges are named by their zero based index
     * in the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Assigns a name to this minute range. The dimension `dateRange` is valued to
     * this name in a report response. If set, cannot begin with `date_range_` or
     * `RESERVED_`. If not set, minute ranges are named by their zero based index
     * in the request: `date_range_0`, `date_range_1`, etc.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1beta.MinuteRange)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1beta.MinuteRange)
  private static final com.google.analytics.data.v1beta.MinuteRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1beta.MinuteRange();
  }

  public static com.google.analytics.data.v1beta.MinuteRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MinuteRange>
      PARSER = new com.google.protobuf.AbstractParser<MinuteRange>() {
    @java.lang.Override
    public MinuteRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MinuteRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MinuteRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MinuteRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1beta.MinuteRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
