// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

/**
 * <pre>
 * VM creation configuration message
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.VmCreationConfig}
 */
public final class VmCreationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.VmCreationConfig)
    VmCreationConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VmCreationConfig.newBuilder() to construct.
  private VmCreationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VmCreationConfig() {
    vmMachineType_ = "";
    vmZone_ = "";
    subnet_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VmCreationConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VmCreationConfig(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            vmMachineType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            vmZone_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            subnet_ = s;
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
    return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_VmCreationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_VmCreationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.VmCreationConfig.class, com.google.cloud.clouddms.v1.VmCreationConfig.Builder.class);
  }

  public static final int VM_MACHINE_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object vmMachineType_;
  /**
   * <pre>
   * Required. VM instance machine type to create.
   * </pre>
   *
   * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vmMachineType.
   */
  @java.lang.Override
  public java.lang.String getVmMachineType() {
    java.lang.Object ref = vmMachineType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vmMachineType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. VM instance machine type to create.
   * </pre>
   *
   * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for vmMachineType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVmMachineTypeBytes() {
    java.lang.Object ref = vmMachineType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vmMachineType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VM_ZONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object vmZone_;
  /**
   * <pre>
   * The Google Cloud Platform zone to create the VM in.
   * </pre>
   *
   * <code>string vm_zone = 2;</code>
   * @return The vmZone.
   */
  @java.lang.Override
  public java.lang.String getVmZone() {
    java.lang.Object ref = vmZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vmZone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Google Cloud Platform zone to create the VM in.
   * </pre>
   *
   * <code>string vm_zone = 2;</code>
   * @return The bytes for vmZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVmZoneBytes() {
    java.lang.Object ref = vmZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vmZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBNET_FIELD_NUMBER = 3;
  private volatile java.lang.Object subnet_;
  /**
   * <pre>
   * The subnet name the vm needs to be created in.
   * </pre>
   *
   * <code>string subnet = 3;</code>
   * @return The subnet.
   */
  @java.lang.Override
  public java.lang.String getSubnet() {
    java.lang.Object ref = subnet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnet_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The subnet name the vm needs to be created in.
   * </pre>
   *
   * <code>string subnet = 3;</code>
   * @return The bytes for subnet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubnetBytes() {
    java.lang.Object ref = subnet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subnet_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmMachineType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vmMachineType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmZone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vmZone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subnet_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmMachineType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vmMachineType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmZone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vmZone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subnet_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.VmCreationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.VmCreationConfig other = (com.google.cloud.clouddms.v1.VmCreationConfig) obj;

    if (!getVmMachineType()
        .equals(other.getVmMachineType())) return false;
    if (!getVmZone()
        .equals(other.getVmZone())) return false;
    if (!getSubnet()
        .equals(other.getSubnet())) return false;
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
    hash = (37 * hash) + VM_MACHINE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getVmMachineType().hashCode();
    hash = (37 * hash) + VM_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getVmZone().hashCode();
    hash = (37 * hash) + SUBNET_FIELD_NUMBER;
    hash = (53 * hash) + getSubnet().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.VmCreationConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.clouddms.v1.VmCreationConfig prototype) {
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
   * VM creation configuration message
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.VmCreationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.VmCreationConfig)
      com.google.cloud.clouddms.v1.VmCreationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_VmCreationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_VmCreationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.VmCreationConfig.class, com.google.cloud.clouddms.v1.VmCreationConfig.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.VmCreationConfig.newBuilder()
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
      vmMachineType_ = "";

      vmZone_ = "";

      subnet_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_VmCreationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.VmCreationConfig getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.VmCreationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.VmCreationConfig build() {
      com.google.cloud.clouddms.v1.VmCreationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.VmCreationConfig buildPartial() {
      com.google.cloud.clouddms.v1.VmCreationConfig result = new com.google.cloud.clouddms.v1.VmCreationConfig(this);
      result.vmMachineType_ = vmMachineType_;
      result.vmZone_ = vmZone_;
      result.subnet_ = subnet_;
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
      if (other instanceof com.google.cloud.clouddms.v1.VmCreationConfig) {
        return mergeFrom((com.google.cloud.clouddms.v1.VmCreationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.VmCreationConfig other) {
      if (other == com.google.cloud.clouddms.v1.VmCreationConfig.getDefaultInstance()) return this;
      if (!other.getVmMachineType().isEmpty()) {
        vmMachineType_ = other.vmMachineType_;
        onChanged();
      }
      if (!other.getVmZone().isEmpty()) {
        vmZone_ = other.vmZone_;
        onChanged();
      }
      if (!other.getSubnet().isEmpty()) {
        subnet_ = other.subnet_;
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
      com.google.cloud.clouddms.v1.VmCreationConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.clouddms.v1.VmCreationConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vmMachineType_ = "";
    /**
     * <pre>
     * Required. VM instance machine type to create.
     * </pre>
     *
     * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The vmMachineType.
     */
    public java.lang.String getVmMachineType() {
      java.lang.Object ref = vmMachineType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vmMachineType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. VM instance machine type to create.
     * </pre>
     *
     * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for vmMachineType.
     */
    public com.google.protobuf.ByteString
        getVmMachineTypeBytes() {
      java.lang.Object ref = vmMachineType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vmMachineType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. VM instance machine type to create.
     * </pre>
     *
     * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The vmMachineType to set.
     * @return This builder for chaining.
     */
    public Builder setVmMachineType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vmMachineType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. VM instance machine type to create.
     * </pre>
     *
     * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVmMachineType() {
      
      vmMachineType_ = getDefaultInstance().getVmMachineType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. VM instance machine type to create.
     * </pre>
     *
     * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for vmMachineType to set.
     * @return This builder for chaining.
     */
    public Builder setVmMachineTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vmMachineType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object vmZone_ = "";
    /**
     * <pre>
     * The Google Cloud Platform zone to create the VM in.
     * </pre>
     *
     * <code>string vm_zone = 2;</code>
     * @return The vmZone.
     */
    public java.lang.String getVmZone() {
      java.lang.Object ref = vmZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vmZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Platform zone to create the VM in.
     * </pre>
     *
     * <code>string vm_zone = 2;</code>
     * @return The bytes for vmZone.
     */
    public com.google.protobuf.ByteString
        getVmZoneBytes() {
      java.lang.Object ref = vmZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vmZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Platform zone to create the VM in.
     * </pre>
     *
     * <code>string vm_zone = 2;</code>
     * @param value The vmZone to set.
     * @return This builder for chaining.
     */
    public Builder setVmZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vmZone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Platform zone to create the VM in.
     * </pre>
     *
     * <code>string vm_zone = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVmZone() {
      
      vmZone_ = getDefaultInstance().getVmZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Platform zone to create the VM in.
     * </pre>
     *
     * <code>string vm_zone = 2;</code>
     * @param value The bytes for vmZone to set.
     * @return This builder for chaining.
     */
    public Builder setVmZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vmZone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subnet_ = "";
    /**
     * <pre>
     * The subnet name the vm needs to be created in.
     * </pre>
     *
     * <code>string subnet = 3;</code>
     * @return The subnet.
     */
    public java.lang.String getSubnet() {
      java.lang.Object ref = subnet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The subnet name the vm needs to be created in.
     * </pre>
     *
     * <code>string subnet = 3;</code>
     * @return The bytes for subnet.
     */
    public com.google.protobuf.ByteString
        getSubnetBytes() {
      java.lang.Object ref = subnet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subnet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The subnet name the vm needs to be created in.
     * </pre>
     *
     * <code>string subnet = 3;</code>
     * @param value The subnet to set.
     * @return This builder for chaining.
     */
    public Builder setSubnet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subnet_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subnet name the vm needs to be created in.
     * </pre>
     *
     * <code>string subnet = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubnet() {
      
      subnet_ = getDefaultInstance().getSubnet();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subnet name the vm needs to be created in.
     * </pre>
     *
     * <code>string subnet = 3;</code>
     * @param value The bytes for subnet to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subnet_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.VmCreationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.VmCreationConfig)
  private static final com.google.cloud.clouddms.v1.VmCreationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.VmCreationConfig();
  }

  public static com.google.cloud.clouddms.v1.VmCreationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VmCreationConfig>
      PARSER = new com.google.protobuf.AbstractParser<VmCreationConfig>() {
    @java.lang.Override
    public VmCreationConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VmCreationConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VmCreationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VmCreationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.VmCreationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
