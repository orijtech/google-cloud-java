// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/type/device_resources.proto

package com.google.identity.accesscontextmanager.type;

/**
 * <pre>
 * The operating system type of the device.
 * Next id: 7
 * </pre>
 *
 * Protobuf enum {@code google.identity.accesscontextmanager.type.OsType}
 */
public enum OsType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The operating system of the device is not specified or not known.
   * </pre>
   *
   * <code>OS_UNSPECIFIED = 0;</code>
   */
  OS_UNSPECIFIED(0),
  /**
   * <pre>
   * A desktop Mac operating system.
   * </pre>
   *
   * <code>DESKTOP_MAC = 1;</code>
   */
  DESKTOP_MAC(1),
  /**
   * <pre>
   * A desktop Windows operating system.
   * </pre>
   *
   * <code>DESKTOP_WINDOWS = 2;</code>
   */
  DESKTOP_WINDOWS(2),
  /**
   * <pre>
   * A desktop Linux operating system.
   * </pre>
   *
   * <code>DESKTOP_LINUX = 3;</code>
   */
  DESKTOP_LINUX(3),
  /**
   * <pre>
   * A desktop ChromeOS operating system.
   * </pre>
   *
   * <code>DESKTOP_CHROME_OS = 6;</code>
   */
  DESKTOP_CHROME_OS(6),
  /**
   * <pre>
   * An Android operating system.
   * </pre>
   *
   * <code>ANDROID = 4;</code>
   */
  ANDROID(4),
  /**
   * <pre>
   * An iOS operating system.
   * </pre>
   *
   * <code>IOS = 5;</code>
   */
  IOS(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The operating system of the device is not specified or not known.
   * </pre>
   *
   * <code>OS_UNSPECIFIED = 0;</code>
   */
  public static final int OS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A desktop Mac operating system.
   * </pre>
   *
   * <code>DESKTOP_MAC = 1;</code>
   */
  public static final int DESKTOP_MAC_VALUE = 1;
  /**
   * <pre>
   * A desktop Windows operating system.
   * </pre>
   *
   * <code>DESKTOP_WINDOWS = 2;</code>
   */
  public static final int DESKTOP_WINDOWS_VALUE = 2;
  /**
   * <pre>
   * A desktop Linux operating system.
   * </pre>
   *
   * <code>DESKTOP_LINUX = 3;</code>
   */
  public static final int DESKTOP_LINUX_VALUE = 3;
  /**
   * <pre>
   * A desktop ChromeOS operating system.
   * </pre>
   *
   * <code>DESKTOP_CHROME_OS = 6;</code>
   */
  public static final int DESKTOP_CHROME_OS_VALUE = 6;
  /**
   * <pre>
   * An Android operating system.
   * </pre>
   *
   * <code>ANDROID = 4;</code>
   */
  public static final int ANDROID_VALUE = 4;
  /**
   * <pre>
   * An iOS operating system.
   * </pre>
   *
   * <code>IOS = 5;</code>
   */
  public static final int IOS_VALUE = 5;


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
  public static OsType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OsType forNumber(int value) {
    switch (value) {
      case 0: return OS_UNSPECIFIED;
      case 1: return DESKTOP_MAC;
      case 2: return DESKTOP_WINDOWS;
      case 3: return DESKTOP_LINUX;
      case 6: return DESKTOP_CHROME_OS;
      case 4: return ANDROID;
      case 5: return IOS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OsType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OsType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OsType>() {
          public OsType findValueByNumber(int number) {
            return OsType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.identity.accesscontextmanager.type.TypeProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final OsType[] VALUES = values();

  public static OsType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OsType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.identity.accesscontextmanager.type.OsType)
}
