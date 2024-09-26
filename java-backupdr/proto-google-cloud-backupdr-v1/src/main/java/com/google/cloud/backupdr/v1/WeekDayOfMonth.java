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
// source: google/cloud/backupdr/v1/backupplan.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.backupdr.v1;

/**
 *
 *
 * <pre>
 * `WeekDayOfMonth` defines the week day of the month on which the backups will
 * run. The message combines a `WeekOfMonth` and `DayOfWeek` to produce values
 * like `FIRST`/`MONDAY` or `LAST`/`FRIDAY`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.backupdr.v1.WeekDayOfMonth}
 */
public final class WeekDayOfMonth extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.backupdr.v1.WeekDayOfMonth)
    WeekDayOfMonthOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WeekDayOfMonth.newBuilder() to construct.
  private WeekDayOfMonth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WeekDayOfMonth() {
    weekOfMonth_ = 0;
    dayOfWeek_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WeekDayOfMonth();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.backupdr.v1.BackupPlanProto
        .internal_static_google_cloud_backupdr_v1_WeekDayOfMonth_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.backupdr.v1.BackupPlanProto
        .internal_static_google_cloud_backupdr_v1_WeekDayOfMonth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.backupdr.v1.WeekDayOfMonth.class,
            com.google.cloud.backupdr.v1.WeekDayOfMonth.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * `WeekOfMonth` enumerates possible weeks in the month, e.g. the first,
   * third, or last week of the month.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth}
   */
  public enum WeekOfMonth implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The zero value. Do not use.
     * </pre>
     *
     * <code>WEEK_OF_MONTH_UNSPECIFIED = 0;</code>
     */
    WEEK_OF_MONTH_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The first week of the month.
     * </pre>
     *
     * <code>FIRST = 1;</code>
     */
    FIRST(1),
    /**
     *
     *
     * <pre>
     * The second week of the month.
     * </pre>
     *
     * <code>SECOND = 2;</code>
     */
    SECOND(2),
    /**
     *
     *
     * <pre>
     * The third week of the month.
     * </pre>
     *
     * <code>THIRD = 3;</code>
     */
    THIRD(3),
    /**
     *
     *
     * <pre>
     * The fourth  week of the month.
     * </pre>
     *
     * <code>FOURTH = 4;</code>
     */
    FOURTH(4),
    /**
     *
     *
     * <pre>
     * The last  week of the month.
     * </pre>
     *
     * <code>LAST = 5;</code>
     */
    LAST(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The zero value. Do not use.
     * </pre>
     *
     * <code>WEEK_OF_MONTH_UNSPECIFIED = 0;</code>
     */
    public static final int WEEK_OF_MONTH_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The first week of the month.
     * </pre>
     *
     * <code>FIRST = 1;</code>
     */
    public static final int FIRST_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The second week of the month.
     * </pre>
     *
     * <code>SECOND = 2;</code>
     */
    public static final int SECOND_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The third week of the month.
     * </pre>
     *
     * <code>THIRD = 3;</code>
     */
    public static final int THIRD_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The fourth  week of the month.
     * </pre>
     *
     * <code>FOURTH = 4;</code>
     */
    public static final int FOURTH_VALUE = 4;
    /**
     *
     *
     * <pre>
     * The last  week of the month.
     * </pre>
     *
     * <code>LAST = 5;</code>
     */
    public static final int LAST_VALUE = 5;

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
    public static WeekOfMonth valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WeekOfMonth forNumber(int value) {
      switch (value) {
        case 0:
          return WEEK_OF_MONTH_UNSPECIFIED;
        case 1:
          return FIRST;
        case 2:
          return SECOND;
        case 3:
          return THIRD;
        case 4:
          return FOURTH;
        case 5:
          return LAST;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WeekOfMonth> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<WeekOfMonth> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WeekOfMonth>() {
          public WeekOfMonth findValueByNumber(int number) {
            return WeekOfMonth.forNumber(number);
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
      return com.google.cloud.backupdr.v1.WeekDayOfMonth.getDescriptor().getEnumTypes().get(0);
    }

    private static final WeekOfMonth[] VALUES = values();

    public static WeekOfMonth valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WeekOfMonth(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth)
  }

  public static final int WEEK_OF_MONTH_FIELD_NUMBER = 1;
  private int weekOfMonth_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Specifies the week of the month.
   * </pre>
   *
   * <code>
   * .google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth week_of_month = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for weekOfMonth.
   */
  @java.lang.Override
  public int getWeekOfMonthValue() {
    return weekOfMonth_;
  }
  /**
   *
   *
   * <pre>
   * Required. Specifies the week of the month.
   * </pre>
   *
   * <code>
   * .google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth week_of_month = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The weekOfMonth.
   */
  @java.lang.Override
  public com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth getWeekOfMonth() {
    com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth result =
        com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth.forNumber(weekOfMonth_);
    return result == null
        ? com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth.UNRECOGNIZED
        : result;
  }

  public static final int DAY_OF_WEEK_FIELD_NUMBER = 2;
  private int dayOfWeek_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Specifies the day of the week.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  @java.lang.Override
  public int getDayOfWeekValue() {
    return dayOfWeek_;
  }
  /**
   *
   *
   * <pre>
   * Required. Specifies the day of the week.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dayOfWeek.
   */
  @java.lang.Override
  public com.google.type.DayOfWeek getDayOfWeek() {
    com.google.type.DayOfWeek result = com.google.type.DayOfWeek.forNumber(dayOfWeek_);
    return result == null ? com.google.type.DayOfWeek.UNRECOGNIZED : result;
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
    if (weekOfMonth_
        != com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth.WEEK_OF_MONTH_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, weekOfMonth_);
    }
    if (dayOfWeek_ != com.google.type.DayOfWeek.DAY_OF_WEEK_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, dayOfWeek_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weekOfMonth_
        != com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth.WEEK_OF_MONTH_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, weekOfMonth_);
    }
    if (dayOfWeek_ != com.google.type.DayOfWeek.DAY_OF_WEEK_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, dayOfWeek_);
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
    if (!(obj instanceof com.google.cloud.backupdr.v1.WeekDayOfMonth)) {
      return super.equals(obj);
    }
    com.google.cloud.backupdr.v1.WeekDayOfMonth other =
        (com.google.cloud.backupdr.v1.WeekDayOfMonth) obj;

    if (weekOfMonth_ != other.weekOfMonth_) return false;
    if (dayOfWeek_ != other.dayOfWeek_) return false;
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
    hash = (37 * hash) + WEEK_OF_MONTH_FIELD_NUMBER;
    hash = (53 * hash) + weekOfMonth_;
    hash = (37 * hash) + DAY_OF_WEEK_FIELD_NUMBER;
    hash = (53 * hash) + dayOfWeek_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth parseFrom(
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

  public static Builder newBuilder(com.google.cloud.backupdr.v1.WeekDayOfMonth prototype) {
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
   * `WeekDayOfMonth` defines the week day of the month on which the backups will
   * run. The message combines a `WeekOfMonth` and `DayOfWeek` to produce values
   * like `FIRST`/`MONDAY` or `LAST`/`FRIDAY`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.backupdr.v1.WeekDayOfMonth}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.backupdr.v1.WeekDayOfMonth)
      com.google.cloud.backupdr.v1.WeekDayOfMonthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.backupdr.v1.BackupPlanProto
          .internal_static_google_cloud_backupdr_v1_WeekDayOfMonth_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.backupdr.v1.BackupPlanProto
          .internal_static_google_cloud_backupdr_v1_WeekDayOfMonth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.backupdr.v1.WeekDayOfMonth.class,
              com.google.cloud.backupdr.v1.WeekDayOfMonth.Builder.class);
    }

    // Construct using com.google.cloud.backupdr.v1.WeekDayOfMonth.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      weekOfMonth_ = 0;
      dayOfWeek_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.backupdr.v1.BackupPlanProto
          .internal_static_google_cloud_backupdr_v1_WeekDayOfMonth_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.WeekDayOfMonth getDefaultInstanceForType() {
      return com.google.cloud.backupdr.v1.WeekDayOfMonth.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.WeekDayOfMonth build() {
      com.google.cloud.backupdr.v1.WeekDayOfMonth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.WeekDayOfMonth buildPartial() {
      com.google.cloud.backupdr.v1.WeekDayOfMonth result =
          new com.google.cloud.backupdr.v1.WeekDayOfMonth(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.backupdr.v1.WeekDayOfMonth result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.weekOfMonth_ = weekOfMonth_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dayOfWeek_ = dayOfWeek_;
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
      if (other instanceof com.google.cloud.backupdr.v1.WeekDayOfMonth) {
        return mergeFrom((com.google.cloud.backupdr.v1.WeekDayOfMonth) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.backupdr.v1.WeekDayOfMonth other) {
      if (other == com.google.cloud.backupdr.v1.WeekDayOfMonth.getDefaultInstance()) return this;
      if (other.weekOfMonth_ != 0) {
        setWeekOfMonthValue(other.getWeekOfMonthValue());
      }
      if (other.dayOfWeek_ != 0) {
        setDayOfWeekValue(other.getDayOfWeekValue());
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
                weekOfMonth_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                dayOfWeek_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int weekOfMonth_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Specifies the week of the month.
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth week_of_month = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for weekOfMonth.
     */
    @java.lang.Override
    public int getWeekOfMonthValue() {
      return weekOfMonth_;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the week of the month.
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth week_of_month = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for weekOfMonth to set.
     * @return This builder for chaining.
     */
    public Builder setWeekOfMonthValue(int value) {
      weekOfMonth_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the week of the month.
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth week_of_month = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The weekOfMonth.
     */
    @java.lang.Override
    public com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth getWeekOfMonth() {
      com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth result =
          com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth.forNumber(weekOfMonth_);
      return result == null
          ? com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the week of the month.
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth week_of_month = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The weekOfMonth to set.
     * @return This builder for chaining.
     */
    public Builder setWeekOfMonth(com.google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      weekOfMonth_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the week of the month.
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.WeekDayOfMonth.WeekOfMonth week_of_month = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWeekOfMonth() {
      bitField0_ = (bitField0_ & ~0x00000001);
      weekOfMonth_ = 0;
      onChanged();
      return this;
    }

    private int dayOfWeek_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Specifies the day of the week.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for dayOfWeek.
     */
    @java.lang.Override
    public int getDayOfWeekValue() {
      return dayOfWeek_;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the day of the week.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeekValue(int value) {
      dayOfWeek_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the day of the week.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dayOfWeek.
     */
    @java.lang.Override
    public com.google.type.DayOfWeek getDayOfWeek() {
      com.google.type.DayOfWeek result = com.google.type.DayOfWeek.forNumber(dayOfWeek_);
      return result == null ? com.google.type.DayOfWeek.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the day of the week.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeek(com.google.type.DayOfWeek value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      dayOfWeek_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the day of the week.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDayOfWeek() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dayOfWeek_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.backupdr.v1.WeekDayOfMonth)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.backupdr.v1.WeekDayOfMonth)
  private static final com.google.cloud.backupdr.v1.WeekDayOfMonth DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.backupdr.v1.WeekDayOfMonth();
  }

  public static com.google.cloud.backupdr.v1.WeekDayOfMonth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeekDayOfMonth> PARSER =
      new com.google.protobuf.AbstractParser<WeekDayOfMonth>() {
        @java.lang.Override
        public WeekDayOfMonth parsePartialFrom(
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

  public static com.google.protobuf.Parser<WeekDayOfMonth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeekDayOfMonth> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.backupdr.v1.WeekDayOfMonth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
