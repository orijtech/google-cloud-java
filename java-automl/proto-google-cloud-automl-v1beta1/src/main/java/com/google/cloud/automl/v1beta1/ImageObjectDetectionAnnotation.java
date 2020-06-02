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
// source: google/cloud/automl/v1beta1/detection.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Annotation details for image object detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation}
 */
public final class ImageObjectDetectionAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation)
    ImageObjectDetectionAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageObjectDetectionAnnotation.newBuilder() to construct.
  private ImageObjectDetectionAnnotation(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageObjectDetectionAnnotation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageObjectDetectionAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImageObjectDetectionAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              com.google.cloud.automl.v1beta1.BoundingPoly.Builder subBuilder = null;
              if (boundingBox_ != null) {
                subBuilder = boundingBox_.toBuilder();
              }
              boundingBox_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.BoundingPoly.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(boundingBox_);
                boundingBox_ = subBuilder.buildPartial();
              }

              break;
            }
          case 21:
            {
              score_ = input.readFloat();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.Detection
        .internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.Detection
        .internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation.class,
            com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation.Builder.class);
  }

  public static final int BOUNDING_BOX_FIELD_NUMBER = 1;
  private com.google.cloud.automl.v1beta1.BoundingPoly boundingBox_;
  /**
   *
   *
   * <pre>
   * Output only. The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
   *
   * @return Whether the boundingBox field is set.
   */
  public boolean hasBoundingBox() {
    return boundingBox_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
   *
   * @return The boundingBox.
   */
  public com.google.cloud.automl.v1beta1.BoundingPoly getBoundingBox() {
    return boundingBox_ == null
        ? com.google.cloud.automl.v1beta1.BoundingPoly.getDefaultInstance()
        : boundingBox_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
    return getBoundingBox();
  }

  public static final int SCORE_FIELD_NUMBER = 2;
  private float score_;
  /**
   *
   *
   * <pre>
   * Output only. The confidence that this annotation is positive for the parent example,
   * value in [0, 1], higher means higher positivity confidence.
   * </pre>
   *
   * <code>float score = 2;</code>
   *
   * @return The score.
   */
  public float getScore() {
    return score_;
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
    if (boundingBox_ != null) {
      output.writeMessage(1, getBoundingBox());
    }
    if (score_ != 0F) {
      output.writeFloat(2, score_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (boundingBox_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBoundingBox());
    }
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, score_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation other =
        (com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation) obj;

    if (hasBoundingBox() != other.hasBoundingBox()) return false;
    if (hasBoundingBox()) {
      if (!getBoundingBox().equals(other.getBoundingBox())) return false;
    }
    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(other.getScore())) return false;
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
    if (hasBoundingBox()) {
      hash = (37 * hash) + BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingBox().hashCode();
    }
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parseFrom(
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
      com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation prototype) {
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
   * Annotation details for image object detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation)
      com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.Detection
          .internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.Detection
          .internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation.class,
              com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }
      score_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.Detection
          .internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation
        getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation build() {
      com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation buildPartial() {
      com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation result =
          new com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation(this);
      if (boundingBoxBuilder_ == null) {
        result.boundingBox_ = boundingBox_;
      } else {
        result.boundingBox_ = boundingBoxBuilder_.build();
      }
      result.score_ = score_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation) {
        return mergeFrom((com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation other) {
      if (other
          == com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation.getDefaultInstance())
        return this;
      if (other.hasBoundingBox()) {
        mergeBoundingBox(other.getBoundingBox());
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
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
      com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.automl.v1beta1.BoundingPoly boundingBox_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.BoundingPoly,
            com.google.cloud.automl.v1beta1.BoundingPoly.Builder,
            com.google.cloud.automl.v1beta1.BoundingPolyOrBuilder>
        boundingBoxBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     *
     * @return Whether the boundingBox field is set.
     */
    public boolean hasBoundingBox() {
      return boundingBoxBuilder_ != null || boundingBox_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     *
     * @return The boundingBox.
     */
    public com.google.cloud.automl.v1beta1.BoundingPoly getBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        return boundingBox_ == null
            ? com.google.cloud.automl.v1beta1.BoundingPoly.getDefaultInstance()
            : boundingBox_;
      } else {
        return boundingBoxBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     */
    public Builder setBoundingBox(com.google.cloud.automl.v1beta1.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundingBox_ = value;
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     */
    public Builder setBoundingBox(
        com.google.cloud.automl.v1beta1.BoundingPoly.Builder builderForValue) {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = builderForValue.build();
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     */
    public Builder mergeBoundingBox(com.google.cloud.automl.v1beta1.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (boundingBox_ != null) {
          boundingBox_ =
              com.google.cloud.automl.v1beta1.BoundingPoly.newBuilder(boundingBox_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          boundingBox_ = value;
        }
        onChanged();
      } else {
        boundingBoxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     */
    public Builder clearBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
        onChanged();
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.BoundingPoly.Builder getBoundingBoxBuilder() {

      onChanged();
      return getBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
      if (boundingBoxBuilder_ != null) {
        return boundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return boundingBox_ == null
            ? com.google.cloud.automl.v1beta1.BoundingPoly.getDefaultInstance()
            : boundingBox_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The rectangle representing the object location.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.BoundingPoly,
            com.google.cloud.automl.v1beta1.BoundingPoly.Builder,
            com.google.cloud.automl.v1beta1.BoundingPolyOrBuilder>
        getBoundingBoxFieldBuilder() {
      if (boundingBoxBuilder_ == null) {
        boundingBoxBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.BoundingPoly,
                com.google.cloud.automl.v1beta1.BoundingPoly.Builder,
                com.google.cloud.automl.v1beta1.BoundingPolyOrBuilder>(
                getBoundingBox(), getParentForChildren(), isClean());
        boundingBox_ = null;
      }
      return boundingBoxBuilder_;
    }

    private float score_;
    /**
     *
     *
     * <pre>
     * Output only. The confidence that this annotation is positive for the parent example,
     * value in [0, 1], higher means higher positivity confidence.
     * </pre>
     *
     * <code>float score = 2;</code>
     *
     * @return The score.
     */
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The confidence that this annotation is positive for the parent example,
     * value in [0, 1], higher means higher positivity confidence.
     * </pre>
     *
     * <code>float score = 2;</code>
     *
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The confidence that this annotation is positive for the parent example,
     * value in [0, 1], higher means higher positivity confidence.
     * </pre>
     *
     * <code>float score = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScore() {

      score_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation)
  private static final com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation();
  }

  public static com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageObjectDetectionAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<ImageObjectDetectionAnnotation>() {
        @java.lang.Override
        public ImageObjectDetectionAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImageObjectDetectionAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImageObjectDetectionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageObjectDetectionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
