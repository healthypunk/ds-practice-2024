// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FraudService.proto

package com.dspractice.bookstore.commonproto;

/**
 * Protobuf type {@code com.dspractice.bookstore.commonproto.FraudUserDataRequest}
 */
public final class FraudUserDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dspractice.bookstore.commonproto.FraudUserDataRequest)
    FraudUserDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FraudUserDataRequest.newBuilder() to construct.
  private FraudUserDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FraudUserDataRequest() {
    orderId_ = "";
    deviceType_ = "";
    deviceModel_ = "";
    deviceOs_ = "";
    browserName_ = "";
    browserVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FraudUserDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FraudUserDataRequest(
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

            deviceType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceModel_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceOs_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            browserName_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            browserVersion_ = s;
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
    return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudUserDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudUserDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dspractice.bookstore.commonproto.FraudUserDataRequest.class, com.dspractice.bookstore.commonproto.FraudUserDataRequest.Builder.class);
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

  public static final int DEVICETYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object deviceType_;
  /**
   * <code>string deviceType = 2;</code>
   * @return The deviceType.
   */
  @java.lang.Override
  public java.lang.String getDeviceType() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceType_ = s;
      return s;
    }
  }
  /**
   * <code>string deviceType = 2;</code>
   * @return The bytes for deviceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceTypeBytes() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICEMODEL_FIELD_NUMBER = 3;
  private volatile java.lang.Object deviceModel_;
  /**
   * <code>string deviceModel = 3;</code>
   * @return The deviceModel.
   */
  @java.lang.Override
  public java.lang.String getDeviceModel() {
    java.lang.Object ref = deviceModel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceModel_ = s;
      return s;
    }
  }
  /**
   * <code>string deviceModel = 3;</code>
   * @return The bytes for deviceModel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceModelBytes() {
    java.lang.Object ref = deviceModel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceModel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICEOS_FIELD_NUMBER = 4;
  private volatile java.lang.Object deviceOs_;
  /**
   * <code>string deviceOs = 4;</code>
   * @return The deviceOs.
   */
  @java.lang.Override
  public java.lang.String getDeviceOs() {
    java.lang.Object ref = deviceOs_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceOs_ = s;
      return s;
    }
  }
  /**
   * <code>string deviceOs = 4;</code>
   * @return The bytes for deviceOs.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceOsBytes() {
    java.lang.Object ref = deviceOs_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceOs_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BROWSERNAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object browserName_;
  /**
   * <code>string browserName = 5;</code>
   * @return The browserName.
   */
  @java.lang.Override
  public java.lang.String getBrowserName() {
    java.lang.Object ref = browserName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      browserName_ = s;
      return s;
    }
  }
  /**
   * <code>string browserName = 5;</code>
   * @return The bytes for browserName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrowserNameBytes() {
    java.lang.Object ref = browserName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      browserName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BROWSERVERSION_FIELD_NUMBER = 6;
  private volatile java.lang.Object browserVersion_;
  /**
   * <code>string browserVersion = 6;</code>
   * @return The browserVersion.
   */
  @java.lang.Override
  public java.lang.String getBrowserVersion() {
    java.lang.Object ref = browserVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      browserVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string browserVersion = 6;</code>
   * @return The bytes for browserVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrowserVersionBytes() {
    java.lang.Object ref = browserVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      browserVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceModel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deviceModel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceOs_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, deviceOs_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(browserName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, browserName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(browserVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, browserVersion_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceModel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deviceModel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceOs_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, deviceOs_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(browserName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, browserName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(browserVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, browserVersion_);
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
    if (!(obj instanceof com.dspractice.bookstore.commonproto.FraudUserDataRequest)) {
      return super.equals(obj);
    }
    com.dspractice.bookstore.commonproto.FraudUserDataRequest other = (com.dspractice.bookstore.commonproto.FraudUserDataRequest) obj;

    if (!getOrderId()
        .equals(other.getOrderId())) return false;
    if (!getDeviceType()
        .equals(other.getDeviceType())) return false;
    if (!getDeviceModel()
        .equals(other.getDeviceModel())) return false;
    if (!getDeviceOs()
        .equals(other.getDeviceOs())) return false;
    if (!getBrowserName()
        .equals(other.getBrowserName())) return false;
    if (!getBrowserVersion()
        .equals(other.getBrowserVersion())) return false;
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
    hash = (37 * hash) + DEVICETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceType().hashCode();
    hash = (37 * hash) + DEVICEMODEL_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceModel().hashCode();
    hash = (37 * hash) + DEVICEOS_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceOs().hashCode();
    hash = (37 * hash) + BROWSERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBrowserName().hashCode();
    hash = (37 * hash) + BROWSERVERSION_FIELD_NUMBER;
    hash = (53 * hash) + getBrowserVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest parseFrom(
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
  public static Builder newBuilder(com.dspractice.bookstore.commonproto.FraudUserDataRequest prototype) {
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
   * Protobuf type {@code com.dspractice.bookstore.commonproto.FraudUserDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dspractice.bookstore.commonproto.FraudUserDataRequest)
      com.dspractice.bookstore.commonproto.FraudUserDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudUserDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudUserDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dspractice.bookstore.commonproto.FraudUserDataRequest.class, com.dspractice.bookstore.commonproto.FraudUserDataRequest.Builder.class);
    }

    // Construct using com.dspractice.bookstore.commonproto.FraudUserDataRequest.newBuilder()
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

      deviceType_ = "";

      deviceModel_ = "";

      deviceOs_ = "";

      browserName_ = "";

      browserVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dspractice.bookstore.commonproto.FraudService.internal_static_com_dspractice_bookstore_commonproto_FraudUserDataRequest_descriptor;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.FraudUserDataRequest getDefaultInstanceForType() {
      return com.dspractice.bookstore.commonproto.FraudUserDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.FraudUserDataRequest build() {
      com.dspractice.bookstore.commonproto.FraudUserDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dspractice.bookstore.commonproto.FraudUserDataRequest buildPartial() {
      com.dspractice.bookstore.commonproto.FraudUserDataRequest result = new com.dspractice.bookstore.commonproto.FraudUserDataRequest(this);
      result.orderId_ = orderId_;
      result.deviceType_ = deviceType_;
      result.deviceModel_ = deviceModel_;
      result.deviceOs_ = deviceOs_;
      result.browserName_ = browserName_;
      result.browserVersion_ = browserVersion_;
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
      if (other instanceof com.dspractice.bookstore.commonproto.FraudUserDataRequest) {
        return mergeFrom((com.dspractice.bookstore.commonproto.FraudUserDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dspractice.bookstore.commonproto.FraudUserDataRequest other) {
      if (other == com.dspractice.bookstore.commonproto.FraudUserDataRequest.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (!other.getDeviceType().isEmpty()) {
        deviceType_ = other.deviceType_;
        onChanged();
      }
      if (!other.getDeviceModel().isEmpty()) {
        deviceModel_ = other.deviceModel_;
        onChanged();
      }
      if (!other.getDeviceOs().isEmpty()) {
        deviceOs_ = other.deviceOs_;
        onChanged();
      }
      if (!other.getBrowserName().isEmpty()) {
        browserName_ = other.browserName_;
        onChanged();
      }
      if (!other.getBrowserVersion().isEmpty()) {
        browserVersion_ = other.browserVersion_;
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
      com.dspractice.bookstore.commonproto.FraudUserDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dspractice.bookstore.commonproto.FraudUserDataRequest) e.getUnfinishedMessage();
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

    private java.lang.Object deviceType_ = "";
    /**
     * <code>string deviceType = 2;</code>
     * @return The deviceType.
     */
    public java.lang.String getDeviceType() {
      java.lang.Object ref = deviceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deviceType = 2;</code>
     * @return The bytes for deviceType.
     */
    public com.google.protobuf.ByteString
        getDeviceTypeBytes() {
      java.lang.Object ref = deviceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deviceType = 2;</code>
     * @param value The deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string deviceType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceType() {
      
      deviceType_ = getDefaultInstance().getDeviceType();
      onChanged();
      return this;
    }
    /**
     * <code>string deviceType = 2;</code>
     * @param value The bytes for deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deviceModel_ = "";
    /**
     * <code>string deviceModel = 3;</code>
     * @return The deviceModel.
     */
    public java.lang.String getDeviceModel() {
      java.lang.Object ref = deviceModel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceModel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deviceModel = 3;</code>
     * @return The bytes for deviceModel.
     */
    public com.google.protobuf.ByteString
        getDeviceModelBytes() {
      java.lang.Object ref = deviceModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deviceModel = 3;</code>
     * @param value The deviceModel to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string deviceModel = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceModel() {
      
      deviceModel_ = getDefaultInstance().getDeviceModel();
      onChanged();
      return this;
    }
    /**
     * <code>string deviceModel = 3;</code>
     * @param value The bytes for deviceModel to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceModel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deviceOs_ = "";
    /**
     * <code>string deviceOs = 4;</code>
     * @return The deviceOs.
     */
    public java.lang.String getDeviceOs() {
      java.lang.Object ref = deviceOs_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceOs_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deviceOs = 4;</code>
     * @return The bytes for deviceOs.
     */
    public com.google.protobuf.ByteString
        getDeviceOsBytes() {
      java.lang.Object ref = deviceOs_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceOs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deviceOs = 4;</code>
     * @param value The deviceOs to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceOs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceOs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string deviceOs = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceOs() {
      
      deviceOs_ = getDefaultInstance().getDeviceOs();
      onChanged();
      return this;
    }
    /**
     * <code>string deviceOs = 4;</code>
     * @param value The bytes for deviceOs to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceOsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceOs_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object browserName_ = "";
    /**
     * <code>string browserName = 5;</code>
     * @return The browserName.
     */
    public java.lang.String getBrowserName() {
      java.lang.Object ref = browserName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        browserName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string browserName = 5;</code>
     * @return The bytes for browserName.
     */
    public com.google.protobuf.ByteString
        getBrowserNameBytes() {
      java.lang.Object ref = browserName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        browserName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string browserName = 5;</code>
     * @param value The browserName to set.
     * @return This builder for chaining.
     */
    public Builder setBrowserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      browserName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string browserName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrowserName() {
      
      browserName_ = getDefaultInstance().getBrowserName();
      onChanged();
      return this;
    }
    /**
     * <code>string browserName = 5;</code>
     * @param value The bytes for browserName to set.
     * @return This builder for chaining.
     */
    public Builder setBrowserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      browserName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object browserVersion_ = "";
    /**
     * <code>string browserVersion = 6;</code>
     * @return The browserVersion.
     */
    public java.lang.String getBrowserVersion() {
      java.lang.Object ref = browserVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        browserVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string browserVersion = 6;</code>
     * @return The bytes for browserVersion.
     */
    public com.google.protobuf.ByteString
        getBrowserVersionBytes() {
      java.lang.Object ref = browserVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        browserVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string browserVersion = 6;</code>
     * @param value The browserVersion to set.
     * @return This builder for chaining.
     */
    public Builder setBrowserVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      browserVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string browserVersion = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrowserVersion() {
      
      browserVersion_ = getDefaultInstance().getBrowserVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string browserVersion = 6;</code>
     * @param value The bytes for browserVersion to set.
     * @return This builder for chaining.
     */
    public Builder setBrowserVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      browserVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.dspractice.bookstore.commonproto.FraudUserDataRequest)
  }

  // @@protoc_insertion_point(class_scope:com.dspractice.bookstore.commonproto.FraudUserDataRequest)
  private static final com.dspractice.bookstore.commonproto.FraudUserDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dspractice.bookstore.commonproto.FraudUserDataRequest();
  }

  public static com.dspractice.bookstore.commonproto.FraudUserDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FraudUserDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<FraudUserDataRequest>() {
    @java.lang.Override
    public FraudUserDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FraudUserDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FraudUserDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FraudUserDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dspractice.bookstore.commonproto.FraudUserDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

