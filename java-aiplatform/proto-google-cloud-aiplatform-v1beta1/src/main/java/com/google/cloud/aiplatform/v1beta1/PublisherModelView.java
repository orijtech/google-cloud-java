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
// source: google/cloud/aiplatform/v1beta1/model_garden_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * View enumeration of PublisherModel.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.PublisherModelView}
 */
public enum PublisherModelView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default / unset value. The API will default to the BASIC view.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VIEW_UNSPECIFIED = 0;</code>
   */
  PUBLISHER_MODEL_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Include basic metadata about the publisher model, but not the full
   * contents.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VIEW_BASIC = 1;</code>
   */
  PUBLISHER_MODEL_VIEW_BASIC(1),
  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VIEW_FULL = 2;</code>
   */
  PUBLISHER_MODEL_VIEW_FULL(2),
  /**
   *
   *
   * <pre>
   * Include: VersionId, ModelVersionExternalName, and SupportedActions.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VERSION_VIEW_BASIC = 3;</code>
   */
  PUBLISHER_MODEL_VERSION_VIEW_BASIC(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default / unset value. The API will default to the BASIC view.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int PUBLISHER_MODEL_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Include basic metadata about the publisher model, but not the full
   * contents.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VIEW_BASIC = 1;</code>
   */
  public static final int PUBLISHER_MODEL_VIEW_BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VIEW_FULL = 2;</code>
   */
  public static final int PUBLISHER_MODEL_VIEW_FULL_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Include: VersionId, ModelVersionExternalName, and SupportedActions.
   * </pre>
   *
   * <code>PUBLISHER_MODEL_VERSION_VIEW_BASIC = 3;</code>
   */
  public static final int PUBLISHER_MODEL_VERSION_VIEW_BASIC_VALUE = 3;

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
  public static PublisherModelView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PublisherModelView forNumber(int value) {
    switch (value) {
      case 0:
        return PUBLISHER_MODEL_VIEW_UNSPECIFIED;
      case 1:
        return PUBLISHER_MODEL_VIEW_BASIC;
      case 2:
        return PUBLISHER_MODEL_VIEW_FULL;
      case 3:
        return PUBLISHER_MODEL_VERSION_VIEW_BASIC;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PublisherModelView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PublisherModelView>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PublisherModelView>() {
            public PublisherModelView findValueByNumber(int number) {
              return PublisherModelView.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.ModelGardenServiceProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final PublisherModelView[] VALUES = values();

  public static PublisherModelView valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PublisherModelView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.PublisherModelView)
}
