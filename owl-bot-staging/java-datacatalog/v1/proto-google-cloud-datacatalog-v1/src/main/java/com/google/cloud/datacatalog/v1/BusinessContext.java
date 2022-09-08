// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Business Context of the entry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.BusinessContext}
 */
public final class BusinessContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.BusinessContext)
    BusinessContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusinessContext.newBuilder() to construct.
  private BusinessContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusinessContext() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BusinessContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BusinessContext(
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
            com.google.cloud.datacatalog.v1.EntryOverview.Builder subBuilder = null;
            if (entryOverview_ != null) {
              subBuilder = entryOverview_.toBuilder();
            }
            entryOverview_ = input.readMessage(com.google.cloud.datacatalog.v1.EntryOverview.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entryOverview_);
              entryOverview_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.datacatalog.v1.Contacts.Builder subBuilder = null;
            if (contacts_ != null) {
              subBuilder = contacts_.toBuilder();
            }
            contacts_ = input.readMessage(com.google.cloud.datacatalog.v1.Contacts.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(contacts_);
              contacts_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_BusinessContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_BusinessContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.BusinessContext.class, com.google.cloud.datacatalog.v1.BusinessContext.Builder.class);
  }

  public static final int ENTRY_OVERVIEW_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1.EntryOverview entryOverview_;
  /**
   * <pre>
   * Entry overview fields for rich text descriptions of entries.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
   * @return Whether the entryOverview field is set.
   */
  @java.lang.Override
  public boolean hasEntryOverview() {
    return entryOverview_ != null;
  }
  /**
   * <pre>
   * Entry overview fields for rich text descriptions of entries.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
   * @return The entryOverview.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryOverview getEntryOverview() {
    return entryOverview_ == null ? com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance() : entryOverview_;
  }
  /**
   * <pre>
   * Entry overview fields for rich text descriptions of entries.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder getEntryOverviewOrBuilder() {
    return getEntryOverview();
  }

  public static final int CONTACTS_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.Contacts contacts_;
  /**
   * <pre>
   * Contact people for the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
   * @return Whether the contacts field is set.
   */
  @java.lang.Override
  public boolean hasContacts() {
    return contacts_ != null;
  }
  /**
   * <pre>
   * Contact people for the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
   * @return The contacts.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.Contacts getContacts() {
    return contacts_ == null ? com.google.cloud.datacatalog.v1.Contacts.getDefaultInstance() : contacts_;
  }
  /**
   * <pre>
   * Contact people for the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ContactsOrBuilder getContactsOrBuilder() {
    return getContacts();
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
    if (entryOverview_ != null) {
      output.writeMessage(1, getEntryOverview());
    }
    if (contacts_ != null) {
      output.writeMessage(2, getContacts());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entryOverview_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntryOverview());
    }
    if (contacts_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getContacts());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.BusinessContext)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.BusinessContext other = (com.google.cloud.datacatalog.v1.BusinessContext) obj;

    if (hasEntryOverview() != other.hasEntryOverview()) return false;
    if (hasEntryOverview()) {
      if (!getEntryOverview()
          .equals(other.getEntryOverview())) return false;
    }
    if (hasContacts() != other.hasContacts()) return false;
    if (hasContacts()) {
      if (!getContacts()
          .equals(other.getContacts())) return false;
    }
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
    if (hasEntryOverview()) {
      hash = (37 * hash) + ENTRY_OVERVIEW_FIELD_NUMBER;
      hash = (53 * hash) + getEntryOverview().hashCode();
    }
    if (hasContacts()) {
      hash = (37 * hash) + CONTACTS_FIELD_NUMBER;
      hash = (53 * hash) + getContacts().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.BusinessContext parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.BusinessContext prototype) {
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
   * Business Context of the entry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.BusinessContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.BusinessContext)
      com.google.cloud.datacatalog.v1.BusinessContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_BusinessContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_BusinessContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.BusinessContext.class, com.google.cloud.datacatalog.v1.BusinessContext.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.BusinessContext.newBuilder()
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
      if (entryOverviewBuilder_ == null) {
        entryOverview_ = null;
      } else {
        entryOverview_ = null;
        entryOverviewBuilder_ = null;
      }
      if (contactsBuilder_ == null) {
        contacts_ = null;
      } else {
        contacts_ = null;
        contactsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_BusinessContext_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BusinessContext getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.BusinessContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BusinessContext build() {
      com.google.cloud.datacatalog.v1.BusinessContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BusinessContext buildPartial() {
      com.google.cloud.datacatalog.v1.BusinessContext result = new com.google.cloud.datacatalog.v1.BusinessContext(this);
      if (entryOverviewBuilder_ == null) {
        result.entryOverview_ = entryOverview_;
      } else {
        result.entryOverview_ = entryOverviewBuilder_.build();
      }
      if (contactsBuilder_ == null) {
        result.contacts_ = contacts_;
      } else {
        result.contacts_ = contactsBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.BusinessContext) {
        return mergeFrom((com.google.cloud.datacatalog.v1.BusinessContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.BusinessContext other) {
      if (other == com.google.cloud.datacatalog.v1.BusinessContext.getDefaultInstance()) return this;
      if (other.hasEntryOverview()) {
        mergeEntryOverview(other.getEntryOverview());
      }
      if (other.hasContacts()) {
        mergeContacts(other.getContacts());
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
      com.google.cloud.datacatalog.v1.BusinessContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.v1.BusinessContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datacatalog.v1.EntryOverview entryOverview_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.EntryOverview, com.google.cloud.datacatalog.v1.EntryOverview.Builder, com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder> entryOverviewBuilder_;
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     * @return Whether the entryOverview field is set.
     */
    public boolean hasEntryOverview() {
      return entryOverviewBuilder_ != null || entryOverview_ != null;
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     * @return The entryOverview.
     */
    public com.google.cloud.datacatalog.v1.EntryOverview getEntryOverview() {
      if (entryOverviewBuilder_ == null) {
        return entryOverview_ == null ? com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance() : entryOverview_;
      } else {
        return entryOverviewBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     */
    public Builder setEntryOverview(com.google.cloud.datacatalog.v1.EntryOverview value) {
      if (entryOverviewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entryOverview_ = value;
        onChanged();
      } else {
        entryOverviewBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     */
    public Builder setEntryOverview(
        com.google.cloud.datacatalog.v1.EntryOverview.Builder builderForValue) {
      if (entryOverviewBuilder_ == null) {
        entryOverview_ = builderForValue.build();
        onChanged();
      } else {
        entryOverviewBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     */
    public Builder mergeEntryOverview(com.google.cloud.datacatalog.v1.EntryOverview value) {
      if (entryOverviewBuilder_ == null) {
        if (entryOverview_ != null) {
          entryOverview_ =
            com.google.cloud.datacatalog.v1.EntryOverview.newBuilder(entryOverview_).mergeFrom(value).buildPartial();
        } else {
          entryOverview_ = value;
        }
        onChanged();
      } else {
        entryOverviewBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     */
    public Builder clearEntryOverview() {
      if (entryOverviewBuilder_ == null) {
        entryOverview_ = null;
        onChanged();
      } else {
        entryOverview_ = null;
        entryOverviewBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.EntryOverview.Builder getEntryOverviewBuilder() {
      
      onChanged();
      return getEntryOverviewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder getEntryOverviewOrBuilder() {
      if (entryOverviewBuilder_ != null) {
        return entryOverviewBuilder_.getMessageOrBuilder();
      } else {
        return entryOverview_ == null ?
            com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance() : entryOverview_;
      }
    }
    /**
     * <pre>
     * Entry overview fields for rich text descriptions of entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryOverview entry_overview = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.EntryOverview, com.google.cloud.datacatalog.v1.EntryOverview.Builder, com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder> 
        getEntryOverviewFieldBuilder() {
      if (entryOverviewBuilder_ == null) {
        entryOverviewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.EntryOverview, com.google.cloud.datacatalog.v1.EntryOverview.Builder, com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder>(
                getEntryOverview(),
                getParentForChildren(),
                isClean());
        entryOverview_ = null;
      }
      return entryOverviewBuilder_;
    }

    private com.google.cloud.datacatalog.v1.Contacts contacts_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.Contacts, com.google.cloud.datacatalog.v1.Contacts.Builder, com.google.cloud.datacatalog.v1.ContactsOrBuilder> contactsBuilder_;
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     * @return Whether the contacts field is set.
     */
    public boolean hasContacts() {
      return contactsBuilder_ != null || contacts_ != null;
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     * @return The contacts.
     */
    public com.google.cloud.datacatalog.v1.Contacts getContacts() {
      if (contactsBuilder_ == null) {
        return contacts_ == null ? com.google.cloud.datacatalog.v1.Contacts.getDefaultInstance() : contacts_;
      } else {
        return contactsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     */
    public Builder setContacts(com.google.cloud.datacatalog.v1.Contacts value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contacts_ = value;
        onChanged();
      } else {
        contactsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     */
    public Builder setContacts(
        com.google.cloud.datacatalog.v1.Contacts.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        contacts_ = builderForValue.build();
        onChanged();
      } else {
        contactsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     */
    public Builder mergeContacts(com.google.cloud.datacatalog.v1.Contacts value) {
      if (contactsBuilder_ == null) {
        if (contacts_ != null) {
          contacts_ =
            com.google.cloud.datacatalog.v1.Contacts.newBuilder(contacts_).mergeFrom(value).buildPartial();
        } else {
          contacts_ = value;
        }
        onChanged();
      } else {
        contactsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     */
    public Builder clearContacts() {
      if (contactsBuilder_ == null) {
        contacts_ = null;
        onChanged();
      } else {
        contacts_ = null;
        contactsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     */
    public com.google.cloud.datacatalog.v1.Contacts.Builder getContactsBuilder() {
      
      onChanged();
      return getContactsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     */
    public com.google.cloud.datacatalog.v1.ContactsOrBuilder getContactsOrBuilder() {
      if (contactsBuilder_ != null) {
        return contactsBuilder_.getMessageOrBuilder();
      } else {
        return contacts_ == null ?
            com.google.cloud.datacatalog.v1.Contacts.getDefaultInstance() : contacts_;
      }
    }
    /**
     * <pre>
     * Contact people for the entry.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.Contacts, com.google.cloud.datacatalog.v1.Contacts.Builder, com.google.cloud.datacatalog.v1.ContactsOrBuilder> 
        getContactsFieldBuilder() {
      if (contactsBuilder_ == null) {
        contactsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Contacts, com.google.cloud.datacatalog.v1.Contacts.Builder, com.google.cloud.datacatalog.v1.ContactsOrBuilder>(
                getContacts(),
                getParentForChildren(),
                isClean());
        contacts_ = null;
      }
      return contactsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.BusinessContext)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.BusinessContext)
  private static final com.google.cloud.datacatalog.v1.BusinessContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.BusinessContext();
  }

  public static com.google.cloud.datacatalog.v1.BusinessContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessContext>
      PARSER = new com.google.protobuf.AbstractParser<BusinessContext>() {
    @java.lang.Override
    public BusinessContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BusinessContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BusinessContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.BusinessContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
