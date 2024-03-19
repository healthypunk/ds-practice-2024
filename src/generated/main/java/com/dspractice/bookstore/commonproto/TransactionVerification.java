// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransactionVerification.proto

package com.dspractice.bookstore.commonproto;

public final class TransactionVerification {
  private TransactionVerification() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_CreditCard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_CreditCard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_ContactAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_ContactAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_TransactionBooksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_TransactionBooksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_TransactionBooksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_TransactionBooksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_TransactionContactResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_TransactionContactResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035TransactionVerification.proto\022$com.dsp" +
      "ractice.bookstore.commonproto\"B\n\nCreditC" +
      "ard\022\016\n\006number\030\001 \001(\t\022\027\n\017expiration_date\030\002" +
      " \001(\t\022\013\n\003cvv\030\003 \001(\t\"[\n\016ContactAddress\022\016\n\006s" +
      "treet\030\001 \001(\t\022\014\n\004city\030\002 \001(\t\022\r\n\005state\030\003 \001(\t" +
      "\022\013\n\003zip\030\004 \001(\t\022\017\n\007country\030\005 \001(\t\"o\n\034Transa" +
      "ctionCreditCardRequest\022\017\n\007orderId\030\001 \001(\t\022" +
      ">\n\004card\030\002 \001(\01320.com.dspractice.bookstore" +
      ".commonproto.CreditCard\"L\n\035TransactionCr" +
      "editCardResponse\022\017\n\007orderId\030\001 \001(\t\022\032\n\022ver" +
      "ificationStatus\030\002 \001(\t\"&\n\004Item\022\014\n\004name\030\001 " +
      "\001(\t\022\020\n\010quantity\030\002 \001(\t\"e\n\027TransactionBook" +
      "sRequest\022\017\n\007orderId\030\001 \001(\t\0229\n\005books\030\002 \003(\013" +
      "2*.com.dspractice.bookstore.commonproto." +
      "Item\"+\n\030TransactionBooksResponse\022\017\n\007orde" +
      "rId\030\001 \001(\t\"\231\001\n\031TransactionContactRequest\022" +
      "\017\n\007orderId\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\017\n\007contac" +
      "t\030\003 \001(\t\022L\n\016contactAddress\030\004 \001(\01324.com.ds" +
      "practice.bookstore.commonproto.ContactAd" +
      "dress\"-\n\032TransactionContactResponse\022\017\n\007o" +
      "rderId\030\001 \001(\t2\342\003\n\036TransactionVerification" +
      "Service\022\214\001\n\013verifyBooks\022=.com.dspractice" +
      ".bookstore.commonproto.TransactionBooksR" +
      "equest\032>.com.dspractice.bookstore.common" +
      "proto.TransactionBooksResponse\022\233\001\n\020verif" +
      "yCreditCard\022B.com.dspractice.bookstore.c" +
      "ommonproto.TransactionCreditCardRequest\032" +
      "C.com.dspractice.bookstore.commonproto.T" +
      "ransactionCreditCardResponse\022\222\001\n\rverifyC" +
      "ontact\022?.com.dspractice.bookstore.common" +
      "proto.TransactionContactRequest\032@.com.ds" +
      "practice.bookstore.commonproto.Transacti" +
      "onContactResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_dspractice_bookstore_commonproto_CreditCard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dspractice_bookstore_commonproto_CreditCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_CreditCard_descriptor,
        new java.lang.String[] { "Number", "ExpirationDate", "Cvv", });
    internal_static_com_dspractice_bookstore_commonproto_ContactAddress_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_dspractice_bookstore_commonproto_ContactAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_ContactAddress_descriptor,
        new java.lang.String[] { "Street", "City", "State", "Zip", "Country", });
    internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardRequest_descriptor,
        new java.lang.String[] { "OrderId", "Card", });
    internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_TransactionCreditCardResponse_descriptor,
        new java.lang.String[] { "OrderId", "VerificationStatus", });
    internal_static_com_dspractice_bookstore_commonproto_Item_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_dspractice_bookstore_commonproto_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_Item_descriptor,
        new java.lang.String[] { "Name", "Quantity", });
    internal_static_com_dspractice_bookstore_commonproto_TransactionBooksRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_dspractice_bookstore_commonproto_TransactionBooksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_TransactionBooksRequest_descriptor,
        new java.lang.String[] { "OrderId", "Books", });
    internal_static_com_dspractice_bookstore_commonproto_TransactionBooksResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_dspractice_bookstore_commonproto_TransactionBooksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_TransactionBooksResponse_descriptor,
        new java.lang.String[] { "OrderId", });
    internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_TransactionContactRequest_descriptor,
        new java.lang.String[] { "OrderId", "Name", "Contact", "ContactAddress", });
    internal_static_com_dspractice_bookstore_commonproto_TransactionContactResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_dspractice_bookstore_commonproto_TransactionContactResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_TransactionContactResponse_descriptor,
        new java.lang.String[] { "OrderId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
