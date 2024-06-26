// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package com.dspractice.bookstore.commonproto;

public final class OrderService {
  private OrderService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_OrderUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_OrderUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_OrderCreditCard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_OrderCreditCard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_OrderItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_OrderItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_OrderBillingAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_OrderBillingAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dspractice_bookstore_commonproto_OrderDequeueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dspractice_bookstore_commonproto_OrderDequeueRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022OrderService.proto\022$com.dspractice.boo" +
      "kstore.commonproto\"\325\003\n\023OrderEnqueueReque" +
      "st\022\n\n\002id\030\001 \001(\t\022=\n\004user\030\002 \001(\0132/.com.dspra" +
      "ctice.bookstore.commonproto.OrderUser\022J\n" +
      "\013credit_card\030\003 \001(\01325.com.dspractice.book" +
      "store.commonproto.OrderCreditCard\022\024\n\014use" +
      "r_comment\030\004 \001(\t\022>\n\005items\030\005 \003(\0132/.com.dsp" +
      "ractice.bookstore.commonproto.OrderItem\022" +
      "\025\n\rdiscount_code\030\006 \001(\t\022\027\n\017shipping_metho" +
      "d\030\007 \001(\t\022\024\n\014gift_message\030\010 \001(\t\022R\n\017billing" +
      "_address\030\t \001(\01329.com.dspractice.bookstor" +
      "e.commonproto.OrderBillingAddress\022\025\n\rgif" +
      "t_wrapping\030\n \001(\010\022 \n\030notification_prefere" +
      "nces\030\014 \003(\t\"*\n\tOrderUser\022\014\n\004name\030\001 \001(\t\022\017\n" +
      "\007contact\030\002 \001(\t\"G\n\017OrderCreditCard\022\016\n\006num" +
      "ber\030\001 \001(\t\022\027\n\017expiration_date\030\002 \001(\t\022\013\n\003cv" +
      "v\030\003 \001(\t\"+\n\tOrderItem\022\014\n\004name\030\001 \001(\t\022\020\n\010qu" +
      "antity\030\002 \001(\005\"`\n\023OrderBillingAddress\022\016\n\006s" +
      "treet\030\001 \001(\t\022\014\n\004city\030\002 \001(\t\022\r\n\005state\030\003 \001(\t" +
      "\022\013\n\003zip\030\004 \001(\t\022\017\n\007country\030\005 \001(\t\"7\n\024OrderE" +
      "nqueueResponse\022\017\n\007orderId\030\001 \001(\t\022\016\n\006statu" +
      "s\030\002 \001(\t\"\025\n\023OrderDequeueRequest2\254\002\n\021Order" +
      "QueueService\022\205\001\n\014enqueueOrder\0229.com.dspr" +
      "actice.bookstore.commonproto.OrderEnqueu" +
      "eRequest\032:.com.dspractice.bookstore.comm" +
      "onproto.OrderEnqueueResponse\022\216\001\n\024listenD" +
      "equeuedOrders\0229.com.dspractice.bookstore" +
      ".commonproto.OrderDequeueRequest\0329.com.d" +
      "spractice.bookstore.commonproto.OrderEnq" +
      "ueueRequest0\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueRequest_descriptor,
        new java.lang.String[] { "Id", "User", "CreditCard", "UserComment", "Items", "DiscountCode", "ShippingMethod", "GiftMessage", "BillingAddress", "GiftWrapping", "NotificationPreferences", });
    internal_static_com_dspractice_bookstore_commonproto_OrderUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_dspractice_bookstore_commonproto_OrderUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_OrderUser_descriptor,
        new java.lang.String[] { "Name", "Contact", });
    internal_static_com_dspractice_bookstore_commonproto_OrderCreditCard_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_dspractice_bookstore_commonproto_OrderCreditCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_OrderCreditCard_descriptor,
        new java.lang.String[] { "Number", "ExpirationDate", "Cvv", });
    internal_static_com_dspractice_bookstore_commonproto_OrderItem_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_dspractice_bookstore_commonproto_OrderItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_OrderItem_descriptor,
        new java.lang.String[] { "Name", "Quantity", });
    internal_static_com_dspractice_bookstore_commonproto_OrderBillingAddress_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_dspractice_bookstore_commonproto_OrderBillingAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_OrderBillingAddress_descriptor,
        new java.lang.String[] { "Street", "City", "State", "Zip", "Country", });
    internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_OrderEnqueueResponse_descriptor,
        new java.lang.String[] { "OrderId", "Status", });
    internal_static_com_dspractice_bookstore_commonproto_OrderDequeueRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_dspractice_bookstore_commonproto_OrderDequeueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dspractice_bookstore_commonproto_OrderDequeueRequest_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
