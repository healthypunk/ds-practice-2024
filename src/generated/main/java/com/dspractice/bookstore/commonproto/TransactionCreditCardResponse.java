// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransactionVerification.proto

package com.dspractice.bookstore.commonproto;

/**
 * Protobuf type {@code com.dspractice.bookstore.commonproto.TransactionCreditCardResponse}
 */
public final class TransactionCreditCardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dspractice.bookstore.commonproto.TransactionCreditCardResponse)
    TransactionCreditCardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionCreditCardResponse.newBuilder() to construct.
  private TransactionCreditCardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionCreditCardResponse() {
    orderId_ = "";
    verificationStatus_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransactionCreditCardResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransactionCreditCardResponse(
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

            verificationStatus_ = s;
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
    return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.class, com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.Builder.class);
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

  public static final int VERIFICATIONSTATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object verificationStatus_;
  /**
   * <code>string verificationStatus = 2;</code>
   * @return The verificationStatus.
   */
  @java.lang.Override
  public java.lang.String getVerificationStatus() {
    java.lang.Object ref = verificationStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      verificationStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string verificationStatus = 2;</code>
   * @return The bytes for verificationStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVerificationStatusBytes() {
    java.lang.Object ref = verificationStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      verificationStatus_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(verificationStatus_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, verificationStatus_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(verificationStatus_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, verificationStatus_);
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
    if (!(obj instanceof com.dspractice.bookstore.commonproto.TransactionCreditCardResponse)) {
      return super.equals(obj);
    }
    com.dspractice.bookstore.commonproto.TransactionCreditCardResponse other = (com.dspractice.bookstore.commonproto.TransactionCreditCardResponse) obj;

    if (!getOrderId()
        .equals(other.getOrderId())) return false;
    if (!getVerificationStatus()
        .equals(other.getVerificationStatus())) return false;
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
    hash = (37 * hash) + VERIFICATIONSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getVerificationStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parseFrom(
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
  public static Builder newBuilder(com.dspractice.bookstore.commonproto.TransactionCreditCardResponse prototype) {
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
   * Protobuf type {@code com.dspractice.bookstore.commonproto.TransactionCreditCardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dspractice.bookstore.commonproto.TransactionCreditCardResponse)
      com.dspractice.bookstore.commonproto.TransactionCreditCardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.class, com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.Builder.class);
    }

    // Construct using com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.newBuilder()
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

      verificationStatus_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dspractice.bookstore.commonproto.TransactionVerification.internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_descriptor;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.TransactionCreditCardResponse getDefaultInstanceForType() {
      return com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.TransactionCreditCardResponse build() {
      com.dspractice.bookstore.commonproto.TransactionCreditCardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.TransactionCreditCardResponse buildPartial() {
      com.dspractice.bookstore.commonproto.TransactionCreditCardResponse result = new com.dspractice.bookstore.commonproto.TransactionCreditCardResponse(this);
      result.orderId_ = orderId_;
      result.verificationStatus_ = verificationStatus_;
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
      if (other instanceof com.dspractice.bookstore.commonproto.TransactionCreditCardResponse) {
        return mergeFrom((com.dspractice.bookstore.commonproto.TransactionCreditCardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dspractice.bookstore.commonproto.TransactionCreditCardResponse other) {
      if (other == com.dspractice.bookstore.commonproto.TransactionCreditCardResponse.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (!other.getVerificationStatus().isEmpty()) {
        verificationStatus_ = other.verificationStatus_;
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
      com.dspractice.bookstore.commonproto.TransactionCreditCardResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dspractice.bookstore.commonproto.TransactionCreditCardResponse) e.getUnfinishedMessage();
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

    private java.lang.Object verificationStatus_ = "";
    /**
     * <code>string verificationStatus = 2;</code>
     * @return The verificationStatus.
     */
    public java.lang.String getVerificationStatus() {
      java.lang.Object ref = verificationStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        verificationStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string verificationStatus = 2;</code>
     * @return The bytes for verificationStatus.
     */
    public com.google.protobuf.ByteString
        getVerificationStatusBytes() {
      java.lang.Object ref = verificationStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verificationStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string verificationStatus = 2;</code>
     * @param value The verificationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVerificationStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      verificationStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string verificationStatus = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerificationStatus() {
      
      verificationStatus_ = getDefaultInstance().getVerificationStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string verificationStatus = 2;</code>
     * @param value The bytes for verificationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVerificationStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      verificationStatus_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.dspractice.bookstore.commonproto.TransactionCreditCardResponse)
  }

  // @@protoc_insertion_point(class_scope:com.dspractice.bookstore.commonproto.TransactionCreditCardResponse)
  private static final com.dspractice.bookstore.commonproto.TransactionCreditCardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dspractice.bookstore.commonproto.TransactionCreditCardResponse();
  }

  public static com.dspractice.bookstore.commonproto.TransactionCreditCardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionCreditCardResponse>
      PARSER = new com.google.protobuf.AbstractParser<TransactionCreditCardResponse>() {
    @java.lang.Override
    public TransactionCreditCardResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransactionCreditCardResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransactionCreditCardResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionCreditCardResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dspractice.bookstore.commonproto.TransactionCreditCardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

