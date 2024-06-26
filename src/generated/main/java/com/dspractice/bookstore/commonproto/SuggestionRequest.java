// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SuggestionService.proto

package com.dspractice.bookstore.commonproto;

/**
 * Protobuf type {@code com.dspractice.bookstore.commonproto.SuggestionRequest}
 */
public final class SuggestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dspractice.bookstore.commonproto.SuggestionRequest)
    SuggestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestionRequest.newBuilder() to construct.
  private SuggestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestionRequest() {
    orderId_ = "";
    booksNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SuggestionRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            orderId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              booksNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            booksNames_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        booksNames_ = booksNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.internal_static_com_dspractice_bookstore_commonproto_SuggestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.internal_static_com_dspractice_bookstore_commonproto_SuggestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dspractice.bookstore.commonproto.SuggestionRequest.class, com.dspractice.bookstore.commonproto.SuggestionRequest.Builder.class);
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

  public static final int BOOKSNAMES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList booksNames_;
  /**
   * <code>repeated string booksNames = 2;</code>
   * @return A list containing the booksNames.
   */
  public com.google.protobuf.ProtocolStringList
      getBooksNamesList() {
    return booksNames_;
  }
  /**
   * <code>repeated string booksNames = 2;</code>
   * @return The count of booksNames.
   */
  public int getBooksNamesCount() {
    return booksNames_.size();
  }
  /**
   * <code>repeated string booksNames = 2;</code>
   * @param index The index of the element to return.
   * @return The booksNames at the given index.
   */
  public java.lang.String getBooksNames(int index) {
    return booksNames_.get(index);
  }
  /**
   * <code>repeated string booksNames = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the booksNames at the given index.
   */
  public com.google.protobuf.ByteString
      getBooksNamesBytes(int index) {
    return booksNames_.getByteString(index);
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
    for (int i = 0; i < booksNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, booksNames_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < booksNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(booksNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBooksNamesList().size();
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
    if (!(obj instanceof com.dspractice.bookstore.commonproto.SuggestionRequest)) {
      return super.equals(obj);
    }
    com.dspractice.bookstore.commonproto.SuggestionRequest other = (com.dspractice.bookstore.commonproto.SuggestionRequest) obj;

    if (!getOrderId()
        .equals(other.getOrderId())) return false;
    if (!getBooksNamesList()
        .equals(other.getBooksNamesList())) return false;
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
    if (getBooksNamesCount() > 0) {
      hash = (37 * hash) + BOOKSNAMES_FIELD_NUMBER;
      hash = (53 * hash) + getBooksNamesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.SuggestionRequest parseFrom(
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
  public static Builder newBuilder(com.dspractice.bookstore.commonproto.SuggestionRequest prototype) {
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
   * Protobuf type {@code com.dspractice.bookstore.commonproto.SuggestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dspractice.bookstore.commonproto.SuggestionRequest)
      com.dspractice.bookstore.commonproto.SuggestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.internal_static_com_dspractice_bookstore_commonproto_SuggestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.internal_static_com_dspractice_bookstore_commonproto_SuggestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dspractice.bookstore.commonproto.SuggestionRequest.class, com.dspractice.bookstore.commonproto.SuggestionRequest.Builder.class);
    }

    // Construct using com.dspractice.bookstore.commonproto.SuggestionRequest.newBuilder()
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

      booksNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass.internal_static_com_dspractice_bookstore_commonproto_SuggestionRequest_descriptor;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.SuggestionRequest getDefaultInstanceForType() {
      return com.dspractice.bookstore.commonproto.SuggestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.SuggestionRequest build() {
      com.dspractice.bookstore.commonproto.SuggestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.SuggestionRequest buildPartial() {
      com.dspractice.bookstore.commonproto.SuggestionRequest result = new com.dspractice.bookstore.commonproto.SuggestionRequest(this);
      int from_bitField0_ = bitField0_;
      result.orderId_ = orderId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        booksNames_ = booksNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.booksNames_ = booksNames_;
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
      if (other instanceof com.dspractice.bookstore.commonproto.SuggestionRequest) {
        return mergeFrom((com.dspractice.bookstore.commonproto.SuggestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dspractice.bookstore.commonproto.SuggestionRequest other) {
      if (other == com.dspractice.bookstore.commonproto.SuggestionRequest.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (!other.booksNames_.isEmpty()) {
        if (booksNames_.isEmpty()) {
          booksNames_ = other.booksNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBooksNamesIsMutable();
          booksNames_.addAll(other.booksNames_);
        }
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
      com.dspractice.bookstore.commonproto.SuggestionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dspractice.bookstore.commonproto.SuggestionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private com.google.protobuf.LazyStringList booksNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureBooksNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        booksNames_ = new com.google.protobuf.LazyStringArrayList(booksNames_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @return A list containing the booksNames.
     */
    public com.google.protobuf.ProtocolStringList
        getBooksNamesList() {
      return booksNames_.getUnmodifiableView();
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @return The count of booksNames.
     */
    public int getBooksNamesCount() {
      return booksNames_.size();
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @param index The index of the element to return.
     * @return The booksNames at the given index.
     */
    public java.lang.String getBooksNames(int index) {
      return booksNames_.get(index);
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the booksNames at the given index.
     */
    public com.google.protobuf.ByteString
        getBooksNamesBytes(int index) {
      return booksNames_.getByteString(index);
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @param index The index to set the value at.
     * @param value The booksNames to set.
     * @return This builder for chaining.
     */
    public Builder setBooksNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBooksNamesIsMutable();
      booksNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @param value The booksNames to add.
     * @return This builder for chaining.
     */
    public Builder addBooksNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBooksNamesIsMutable();
      booksNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @param values The booksNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllBooksNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureBooksNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, booksNames_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBooksNames() {
      booksNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string booksNames = 2;</code>
     * @param value The bytes of the booksNames to add.
     * @return This builder for chaining.
     */
    public Builder addBooksNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureBooksNamesIsMutable();
      booksNames_.add(value);
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


    // @@protoc_insertion_point(builder_scope:com.dspractice.bookstore.commonproto.SuggestionRequest)
  }

  // @@protoc_insertion_point(class_scope:com.dspractice.bookstore.commonproto.SuggestionRequest)
  private static final com.dspractice.bookstore.commonproto.SuggestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dspractice.bookstore.commonproto.SuggestionRequest();
  }

  public static com.dspractice.bookstore.commonproto.SuggestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<SuggestionRequest>() {
    @java.lang.Override
    public SuggestionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SuggestionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SuggestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dspractice.bookstore.commonproto.SuggestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

