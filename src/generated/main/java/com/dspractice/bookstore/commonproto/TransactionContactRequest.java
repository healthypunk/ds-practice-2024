// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransactionVerification.proto

package com.dspractice.bookstore.commonproto;

/**
 * Protobuf type {@code com.dspractice.bookstore.commonproto.TransactionContactRequest}
 */
public final class TransactionContactRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dspractice.bookstore.commonproto.TransactionContactRequest)
    TransactionContactRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionContactRequest.newBuilder() to construct.
  private TransactionContactRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionContactRequest() {
    orderId_ = "";
    name_ = "";
    contact_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransactionContactRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransactionContactRequest(
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

            orderId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            contact_ = s;
            break;
          }
          case 34: {
            com.dspractice.bookstore.commonproto.ContactAddress.Builder subBuilder = null;
            if (contactAddress_ != null) {
              subBuilder = contactAddress_.toBuilder();
            }
            contactAddress_ = input.readMessage(com.dspractice.bookstore.commonproto.ContactAddress.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(contactAddress_);
              contactAddress_ = subBuilder.buildPartial();
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
    return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dspractice.bookstore.commonproto.TransactionContactRequest.class, com.dspractice.bookstore.commonproto.TransactionContactRequest.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderId_;
  /**
   * <code>string orderId = 1;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string orderId = 1;</code>
   * @return The bytes for orderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
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
   * <code>string name = 2;</code>
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

  public static final int CONTACT_FIELD_NUMBER = 3;
  private volatile java.lang.Object contact_;
  /**
   * <code>string contact = 3;</code>
   * @return The contact.
   */
  @java.lang.Override
  public java.lang.String getContact() {
    java.lang.Object ref = contact_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contact_ = s;
      return s;
    }
  }
  /**
   * <code>string contact = 3;</code>
   * @return The bytes for contact.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContactBytes() {
    java.lang.Object ref = contact_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contact_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTACTADDRESS_FIELD_NUMBER = 4;
  private com.dspractice.bookstore.commonproto.ContactAddress contactAddress_;
  /**
   * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
   * @return Whether the contactAddress field is set.
   */
  @java.lang.Override
  public boolean hasContactAddress() {
    return contactAddress_ != null;
  }
  /**
   * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
   * @return The contactAddress.
   */
  @java.lang.Override
  public com.dspractice.bookstore.commonproto.ContactAddress getContactAddress() {
    return contactAddress_ == null ? com.dspractice.bookstore.commonproto.ContactAddress.getDefaultInstance() : contactAddress_;
  }
  /**
   * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
   */
  @java.lang.Override
  public com.dspractice.bookstore.commonproto.ContactAddressOrBuilder getContactAddressOrBuilder() {
    return getContactAddress();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contact_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, contact_);
    }
    if (contactAddress_ != null) {
      output.writeMessage(4, getContactAddress());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contact_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, contact_);
    }
    if (contactAddress_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getContactAddress());
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
    if (!(obj instanceof com.dspractice.bookstore.commonproto.TransactionContactRequest)) {
      return super.equals(obj);
    }
    com.dspractice.bookstore.commonproto.TransactionContactRequest other = (com.dspractice.bookstore.commonproto.TransactionContactRequest) obj;

    if (!getOrderId()
        .equals(other.getOrderId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getContact()
        .equals(other.getContact())) return false;
    if (hasContactAddress() != other.hasContactAddress()) return false;
    if (hasContactAddress()) {
      if (!getContactAddress()
          .equals(other.getContactAddress())) return false;
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
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CONTACT_FIELD_NUMBER;
    hash = (53 * hash) + getContact().hashCode();
    if (hasContactAddress()) {
      hash = (37 * hash) + CONTACTADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getContactAddress().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.TransactionContactRequest parseFrom(
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
  public static Builder newBuilder(com.dspractice.bookstore.commonproto.TransactionContactRequest prototype) {
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
   * Protobuf type {@code com.dspractice.bookstore.commonproto.TransactionContactRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dspractice.bookstore.commonproto.TransactionContactRequest)
      com.dspractice.bookstore.commonproto.TransactionContactRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dspractice.bookstore.commonproto.TransactionContactRequest.class, com.dspractice.bookstore.commonproto.TransactionContactRequest.Builder.class);
    }

    // Construct using com.dspractice.bookstore.commonproto.TransactionContactRequest.newBuilder()
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
      orderId_ = "";

      name_ = "";

      contact_ = "";

      if (contactAddressBuilder_ == null) {
        contactAddress_ = null;
      } else {
        contactAddress_ = null;
        contactAddressBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_descriptor;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.TransactionContactRequest getDefaultInstanceForType() {
      return com.dspractice.bookstore.commonproto.TransactionContactRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.TransactionContactRequest build() {
      com.dspractice.bookstore.commonproto.TransactionContactRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.TransactionContactRequest buildPartial() {
      com.dspractice.bookstore.commonproto.TransactionContactRequest result = new com.dspractice.bookstore.commonproto.TransactionContactRequest(this);
      result.orderId_ = orderId_;
      result.name_ = name_;
      result.contact_ = contact_;
      if (contactAddressBuilder_ == null) {
        result.contactAddress_ = contactAddress_;
      } else {
        result.contactAddress_ = contactAddressBuilder_.build();
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
      if (other instanceof com.dspractice.bookstore.commonproto.TransactionContactRequest) {
        return mergeFrom((com.dspractice.bookstore.commonproto.TransactionContactRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dspractice.bookstore.commonproto.TransactionContactRequest other) {
      if (other == com.dspractice.bookstore.commonproto.TransactionContactRequest.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getContact().isEmpty()) {
        contact_ = other.contact_;
        onChanged();
      }
      if (other.hasContactAddress()) {
        mergeContactAddress(other.getContactAddress());
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
      com.dspractice.bookstore.commonproto.TransactionContactRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dspractice.bookstore.commonproto.TransactionContactRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderId_ = "";
    /**
     * <code>string orderId = 1;</code>
     * @return The orderId.
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     * @return The bytes for orderId.
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      
      orderId_ = getDefaultInstance().getOrderId();
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     * @param value The bytes for orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
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
     * <code>string name = 2;</code>
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
     * <code>string name = 2;</code>
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
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
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

    private java.lang.Object contact_ = "";
    /**
     * <code>string contact = 3;</code>
     * @return The contact.
     */
    public java.lang.String getContact() {
      java.lang.Object ref = contact_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contact_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string contact = 3;</code>
     * @return The bytes for contact.
     */
    public com.google.protobuf.ByteString
        getContactBytes() {
      java.lang.Object ref = contact_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contact_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string contact = 3;</code>
     * @param value The contact to set.
     * @return This builder for chaining.
     */
    public Builder setContact(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contact_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string contact = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearContact() {
      
      contact_ = getDefaultInstance().getContact();
      onChanged();
      return this;
    }
    /**
     * <code>string contact = 3;</code>
     * @param value The bytes for contact to set.
     * @return This builder for chaining.
     */
    public Builder setContactBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      contact_ = value;
      onChanged();
      return this;
    }

    private com.dspractice.bookstore.commonproto.ContactAddress contactAddress_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dspractice.bookstore.commonproto.ContactAddress, com.dspractice.bookstore.commonproto.ContactAddress.Builder, com.dspractice.bookstore.commonproto.ContactAddressOrBuilder> contactAddressBuilder_;
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     * @return Whether the contactAddress field is set.
     */
    public boolean hasContactAddress() {
      return contactAddressBuilder_ != null || contactAddress_ != null;
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     * @return The contactAddress.
     */
    public com.dspractice.bookstore.commonproto.ContactAddress getContactAddress() {
      if (contactAddressBuilder_ == null) {
        return contactAddress_ == null ? com.dspractice.bookstore.commonproto.ContactAddress.getDefaultInstance() : contactAddress_;
      } else {
        return contactAddressBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     */
    public Builder setContactAddress(com.dspractice.bookstore.commonproto.ContactAddress value) {
      if (contactAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contactAddress_ = value;
        onChanged();
      } else {
        contactAddressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     */
    public Builder setContactAddress(
        com.dspractice.bookstore.commonproto.ContactAddress.Builder builderForValue) {
      if (contactAddressBuilder_ == null) {
        contactAddress_ = builderForValue.build();
        onChanged();
      } else {
        contactAddressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     */
    public Builder mergeContactAddress(com.dspractice.bookstore.commonproto.ContactAddress value) {
      if (contactAddressBuilder_ == null) {
        if (contactAddress_ != null) {
          contactAddress_ =
            com.dspractice.bookstore.commonproto.ContactAddress.newBuilder(contactAddress_).mergeFrom(value).buildPartial();
        } else {
          contactAddress_ = value;
        }
        onChanged();
      } else {
        contactAddressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     */
    public Builder clearContactAddress() {
      if (contactAddressBuilder_ == null) {
        contactAddress_ = null;
        onChanged();
      } else {
        contactAddress_ = null;
        contactAddressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     */
    public com.dspractice.bookstore.commonproto.ContactAddress.Builder getContactAddressBuilder() {
      
      onChanged();
      return getContactAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     */
    public com.dspractice.bookstore.commonproto.ContactAddressOrBuilder getContactAddressOrBuilder() {
      if (contactAddressBuilder_ != null) {
        return contactAddressBuilder_.getMessageOrBuilder();
      } else {
        return contactAddress_ == null ?
            com.dspractice.bookstore.commonproto.ContactAddress.getDefaultInstance() : contactAddress_;
      }
    }
    /**
     * <code>.com.dspractice.bookstore.commonproto.ContactAddress contactAddress = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dspractice.bookstore.commonproto.ContactAddress, com.dspractice.bookstore.commonproto.ContactAddress.Builder, com.dspractice.bookstore.commonproto.ContactAddressOrBuilder> 
        getContactAddressFieldBuilder() {
      if (contactAddressBuilder_ == null) {
        contactAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dspractice.bookstore.commonproto.ContactAddress, com.dspractice.bookstore.commonproto.ContactAddress.Builder, com.dspractice.bookstore.commonproto.ContactAddressOrBuilder>(
                getContactAddress(),
                getParentForChildren(),
                isClean());
        contactAddress_ = null;
      }
      return contactAddressBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.dspractice.bookstore.commonproto.TransactionContactRequest)
  }

  // @@protoc_insertion_point(class_scope:com.dspractice.bookstore.commonproto.TransactionContactRequest)
  private static final com.dspractice.bookstore.commonproto.TransactionContactRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dspractice.bookstore.commonproto.TransactionContactRequest();
  }

  public static com.dspractice.bookstore.commonproto.TransactionContactRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionContactRequest>
      PARSER = new com.google.protobuf.AbstractParser<TransactionContactRequest>() {
    @java.lang.Override
    public TransactionContactRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransactionContactRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransactionContactRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionContactRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dspractice.bookstore.commonproto.TransactionContactRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

