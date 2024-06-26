// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FraudService.proto

package com.dspractice.bookstore.commonproto;

/**
 * Protobuf type {@code com.dspractice.bookstore.commonproto.FraudCreditCard}
 */
public final class FraudCreditCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dspractice.bookstore.commonproto.FraudCreditCard)
    FraudCreditCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FraudCreditCard.newBuilder() to construct.
  private FraudCreditCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FraudCreditCard() {
    number_ = "";
    expirationDate_ = "";
    cvv_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FraudCreditCard();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FraudCreditCard(
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

            number_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            expirationDate_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cvv_ = s;
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
    return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudCreditCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudCreditCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dspractice.bookstore.commonproto.FraudCreditCard.class, com.dspractice.bookstore.commonproto.FraudCreditCard.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object number_;
  /**
   * <code>string number = 1;</code>
   * @return The number.
   */
  @java.lang.Override
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <code>string number = 1;</code>
   * @return The bytes for number.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRATIONDATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object expirationDate_;
  /**
   * <code>string expirationDate = 2;</code>
   * @return The expirationDate.
   */
  @java.lang.Override
  public java.lang.String getExpirationDate() {
    java.lang.Object ref = expirationDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expirationDate_ = s;
      return s;
    }
  }
  /**
   * <code>string expirationDate = 2;</code>
   * @return The bytes for expirationDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExpirationDateBytes() {
    java.lang.Object ref = expirationDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expirationDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CVV_FIELD_NUMBER = 3;
  private volatile java.lang.Object cvv_;
  /**
   * <code>string cvv = 3;</code>
   * @return The cvv.
   */
  @java.lang.Override
  public java.lang.String getCvv() {
    java.lang.Object ref = cvv_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cvv_ = s;
      return s;
    }
  }
  /**
   * <code>string cvv = 3;</code>
   * @return The bytes for cvv.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCvvBytes() {
    java.lang.Object ref = cvv_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cvv_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expirationDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, expirationDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cvv_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cvv_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expirationDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, expirationDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cvv_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cvv_);
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
    if (!(obj instanceof com.dspractice.bookstore.commonproto.FraudCreditCard)) {
      return super.equals(obj);
    }
    com.dspractice.bookstore.commonproto.FraudCreditCard other = (com.dspractice.bookstore.commonproto.FraudCreditCard) obj;

    if (!getNumber()
        .equals(other.getNumber())) return false;
    if (!getExpirationDate()
        .equals(other.getExpirationDate())) return false;
    if (!getCvv()
        .equals(other.getCvv())) return false;
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
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (37 * hash) + EXPIRATIONDATE_FIELD_NUMBER;
    hash = (53 * hash) + getExpirationDate().hashCode();
    hash = (37 * hash) + CVV_FIELD_NUMBER;
    hash = (53 * hash) + getCvv().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.FraudCreditCard parseFrom(
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
  public static Builder newBuilder(com.dspractice.bookstore.commonproto.FraudCreditCard prototype) {
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
   * Protobuf type {@code com.dspractice.bookstore.commonproto.FraudCreditCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dspractice.bookstore.commonproto.FraudCreditCard)
      com.dspractice.bookstore.commonproto.FraudCreditCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudCreditCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudCreditCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dspractice.bookstore.commonproto.FraudCreditCard.class, com.dspractice.bookstore.commonproto.FraudCreditCard.Builder.class);
    }

    // Construct using com.dspractice.bookstore.commonproto.FraudCreditCard.newBuilder()
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
      number_ = "";

      expirationDate_ = "";

      cvv_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudCreditCard_descriptor;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.FraudCreditCard getDefaultInstanceForType() {
      return com.dspractice.bookstore.commonproto.FraudCreditCard.getDefaultInstance();
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.FraudCreditCard build() {
      com.dspractice.bookstore.commonproto.FraudCreditCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.FraudCreditCard buildPartial() {
      com.dspractice.bookstore.commonproto.FraudCreditCard result = new com.dspractice.bookstore.commonproto.FraudCreditCard(this);
      result.number_ = number_;
      result.expirationDate_ = expirationDate_;
      result.cvv_ = cvv_;
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
      if (other instanceof com.dspractice.bookstore.commonproto.FraudCreditCard) {
        return mergeFrom((com.dspractice.bookstore.commonproto.FraudCreditCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dspractice.bookstore.commonproto.FraudCreditCard other) {
      if (other == com.dspractice.bookstore.commonproto.FraudCreditCard.getDefaultInstance()) return this;
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        onChanged();
      }
      if (!other.getExpirationDate().isEmpty()) {
        expirationDate_ = other.expirationDate_;
        onChanged();
      }
      if (!other.getCvv().isEmpty()) {
        cvv_ = other.cvv_;
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
      com.dspractice.bookstore.commonproto.FraudCreditCard parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dspractice.bookstore.commonproto.FraudCreditCard) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object number_ = "";
    /**
     * <code>string number = 1;</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string number = 1;</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 1;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = getDefaultInstance().getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string number = 1;</code>
     * @param value The bytes for number to set.
     * @return This builder for chaining.
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      number_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expirationDate_ = "";
    /**
     * <code>string expirationDate = 2;</code>
     * @return The expirationDate.
     */
    public java.lang.String getExpirationDate() {
      java.lang.Object ref = expirationDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expirationDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expirationDate = 2;</code>
     * @return The bytes for expirationDate.
     */
    public com.google.protobuf.ByteString
        getExpirationDateBytes() {
      java.lang.Object ref = expirationDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expirationDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expirationDate = 2;</code>
     * @param value The expirationDate to set.
     * @return This builder for chaining.
     */
    public Builder setExpirationDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expirationDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string expirationDate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpirationDate() {
      
      expirationDate_ = getDefaultInstance().getExpirationDate();
      onChanged();
      return this;
    }
    /**
     * <code>string expirationDate = 2;</code>
     * @param value The bytes for expirationDate to set.
     * @return This builder for chaining.
     */
    public Builder setExpirationDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expirationDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cvv_ = "";
    /**
     * <code>string cvv = 3;</code>
     * @return The cvv.
     */
    public java.lang.String getCvv() {
      java.lang.Object ref = cvv_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cvv_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cvv = 3;</code>
     * @return The bytes for cvv.
     */
    public com.google.protobuf.ByteString
        getCvvBytes() {
      java.lang.Object ref = cvv_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cvv_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cvv = 3;</code>
     * @param value The cvv to set.
     * @return This builder for chaining.
     */
    public Builder setCvv(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cvv_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cvv = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCvv() {
      
      cvv_ = getDefaultInstance().getCvv();
      onChanged();
      return this;
    }
    /**
     * <code>string cvv = 3;</code>
     * @param value The bytes for cvv to set.
     * @return This builder for chaining.
     */
    public Builder setCvvBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cvv_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.dspractice.bookstore.commonproto.FraudCreditCard)
  }

  // @@protoc_insertion_point(class_scope:com.dspractice.bookstore.commonproto.FraudCreditCard)
  private static final com.dspractice.bookstore.commonproto.FraudCreditCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dspractice.bookstore.commonproto.FraudCreditCard();
  }

  public static com.dspractice.bookstore.commonproto.FraudCreditCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FraudCreditCard>
      PARSER = new com.google.protobuf.AbstractParser<FraudCreditCard>() {
    @java.lang.Override
    public FraudCreditCard parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FraudCreditCard(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FraudCreditCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FraudCreditCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dspractice.bookstore.commonproto.FraudCreditCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

