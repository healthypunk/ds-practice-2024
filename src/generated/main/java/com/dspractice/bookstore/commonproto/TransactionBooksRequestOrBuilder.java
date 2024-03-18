// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransactionVerification.proto

package com.dspractice.bookstore.commonproto;

public interface TransactionBooksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dspractice.bookstore.commonproto.TransactionBooksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orderId = 1;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 1;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>repeated .com.dspractice.bookstore.commonproto.Item books = 2;</code>
   */
  java.util.List<com.dspractice.bookstore.commonproto.Item> 
      getBooksList();
  /**
   * <code>repeated .com.dspractice.bookstore.commonproto.Item books = 2;</code>
   */
  com.dspractice.bookstore.commonproto.Item getBooks(int index);
  /**
   * <code>repeated .com.dspractice.bookstore.commonproto.Item books = 2;</code>
   */
  int getBooksCount();
  /**
   * <code>repeated .com.dspractice.bookstore.commonproto.Item books = 2;</code>
   */
  java.util.List<? extends com.dspractice.bookstore.commonproto.ItemOrBuilder> 
      getBooksOrBuilderList();
  /**
   * <code>repeated .com.dspractice.bookstore.commonproto.Item books = 2;</code>
   */
  com.dspractice.bookstore.commonproto.ItemOrBuilder getBooksOrBuilder(
      int index);
}