// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-test.proto

package org.tribuo.test.protos;

public interface MockOutputInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.MockOutputInfoProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string label = 1;</code>
   * @return A list containing the label.
   */
  java.util.List<java.lang.String>
      getLabelList();
  /**
   * <code>repeated string label = 1;</code>
   * @return The count of label.
   */
  int getLabelCount();
  /**
   * <code>repeated string label = 1;</code>
   * @param index The index of the element to return.
   * @return The label at the given index.
   */
  java.lang.String getLabel(int index);
  /**
   * <code>repeated string label = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the label at the given index.
   */
  com.google.protobuf.ByteString
      getLabelBytes(int index);

  /**
   * <code>repeated int64 counts = 2;</code>
   * @return A list containing the counts.
   */
  java.util.List<java.lang.Long> getCountsList();
  /**
   * <code>repeated int64 counts = 2;</code>
   * @return The count of counts.
   */
  int getCountsCount();
  /**
   * <code>repeated int64 counts = 2;</code>
   * @param index The index of the element to return.
   * @return The counts at the given index.
   */
  long getCounts(int index);

  /**
   * <code>repeated int32 id = 3;</code>
   * @return A list containing the id.
   */
  java.util.List<java.lang.Integer> getIdList();
  /**
   * <code>repeated int32 id = 3;</code>
   * @return The count of id.
   */
  int getIdCount();
  /**
   * <code>repeated int32 id = 3;</code>
   * @param index The index of the element to return.
   * @return The id at the given index.
   */
  int getId(int index);

  /**
   * <code>int32 unknownCount = 4;</code>
   * @return The unknownCount.
   */
  int getUnknownCount();

  /**
   * <code>int32 labelCounter = 5;</code>
   * @return The labelCounter.
   */
  int getLabelCounter();
}
