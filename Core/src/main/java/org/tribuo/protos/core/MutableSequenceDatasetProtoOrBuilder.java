// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

public interface MutableSequenceDatasetProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.MutableSequenceDatasetProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
   * @return The metadata.
   */
  org.tribuo.protos.core.DatasetDataProto getMetadata();
  /**
   * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
   */
  org.tribuo.protos.core.DatasetDataProtoOrBuilder getMetadataOrBuilder();

  /**
   * <code>repeated .tribuo.core.SequenceExampleProto examples = 2;</code>
   */
  java.util.List<org.tribuo.protos.core.SequenceExampleProto> 
      getExamplesList();
  /**
   * <code>repeated .tribuo.core.SequenceExampleProto examples = 2;</code>
   */
  org.tribuo.protos.core.SequenceExampleProto getExamples(int index);
  /**
   * <code>repeated .tribuo.core.SequenceExampleProto examples = 2;</code>
   */
  int getExamplesCount();
  /**
   * <code>repeated .tribuo.core.SequenceExampleProto examples = 2;</code>
   */
  java.util.List<? extends org.tribuo.protos.core.SequenceExampleProtoOrBuilder> 
      getExamplesOrBuilderList();
  /**
   * <code>repeated .tribuo.core.SequenceExampleProto examples = 2;</code>
   */
  org.tribuo.protos.core.SequenceExampleProtoOrBuilder getExamplesOrBuilder(
      int index);

  /**
   * <code>bool dense = 3;</code>
   * @return The dense.
   */
  boolean getDense();
}
