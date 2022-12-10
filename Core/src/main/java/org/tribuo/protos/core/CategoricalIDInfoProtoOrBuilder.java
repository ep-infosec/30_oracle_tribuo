// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

public interface CategoricalIDInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.CategoricalIDInfoProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  int getCount();

  /**
   * <code>int32 id = 3;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>repeated double key = 10;</code>
   * @return A list containing the key.
   */
  java.util.List<java.lang.Double> getKeyList();
  /**
   * <code>repeated double key = 10;</code>
   * @return The count of key.
   */
  int getKeyCount();
  /**
   * <code>repeated double key = 10;</code>
   * @param index The index of the element to return.
   * @return The key at the given index.
   */
  double getKey(int index);

  /**
   * <code>repeated int64 value = 11;</code>
   * @return A list containing the value.
   */
  java.util.List<java.lang.Long> getValueList();
  /**
   * <code>repeated int64 value = 11;</code>
   * @return The count of value.
   */
  int getValueCount();
  /**
   * <code>repeated int64 value = 11;</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  long getValue(int index);

  /**
   * <code>double observed_value = 12;</code>
   * @return The observedValue.
   */
  double getObservedValue();

  /**
   * <code>int64 observed_count = 13;</code>
   * @return The observedCount.
   */
  long getObservedCount();
}
