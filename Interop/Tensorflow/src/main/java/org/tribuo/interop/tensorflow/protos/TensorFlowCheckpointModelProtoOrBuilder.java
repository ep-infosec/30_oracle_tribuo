// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-tensorflow.proto

package org.tribuo.interop.tensorflow.protos;

public interface TensorFlowCheckpointModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.interop.tensorflow.TensorFlowCheckpointModelProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return The metadata.
   */
  org.tribuo.protos.core.ModelDataProto getMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   */
  org.tribuo.protos.core.ModelDataProtoOrBuilder getMetadataOrBuilder();

  /**
   * <code>bytes model_def = 2;</code>
   * @return The modelDef.
   */
  com.google.protobuf.ByteString getModelDef();

  /**
   * <code>string checkpoint_directory = 3;</code>
   * @return The checkpointDirectory.
   */
  java.lang.String getCheckpointDirectory();
  /**
   * <code>string checkpoint_directory = 3;</code>
   * @return The bytes for checkpointDirectory.
   */
  com.google.protobuf.ByteString
      getCheckpointDirectoryBytes();

  /**
   * <code>string checkpoint_name = 4;</code>
   * @return The checkpointName.
   */
  java.lang.String getCheckpointName();
  /**
   * <code>string checkpoint_name = 4;</code>
   * @return The bytes for checkpointName.
   */
  com.google.protobuf.ByteString
      getCheckpointNameBytes();

  /**
   * <code>.tribuo.interop.tensorflow.FeatureConverterProto feature_converter = 5;</code>
   * @return Whether the featureConverter field is set.
   */
  boolean hasFeatureConverter();
  /**
   * <code>.tribuo.interop.tensorflow.FeatureConverterProto feature_converter = 5;</code>
   * @return The featureConverter.
   */
  org.tribuo.interop.tensorflow.protos.FeatureConverterProto getFeatureConverter();
  /**
   * <code>.tribuo.interop.tensorflow.FeatureConverterProto feature_converter = 5;</code>
   */
  org.tribuo.interop.tensorflow.protos.FeatureConverterProtoOrBuilder getFeatureConverterOrBuilder();

  /**
   * <code>.tribuo.interop.tensorflow.OutputConverterProto output_converter = 6;</code>
   * @return Whether the outputConverter field is set.
   */
  boolean hasOutputConverter();
  /**
   * <code>.tribuo.interop.tensorflow.OutputConverterProto output_converter = 6;</code>
   * @return The outputConverter.
   */
  org.tribuo.interop.tensorflow.protos.OutputConverterProto getOutputConverter();
  /**
   * <code>.tribuo.interop.tensorflow.OutputConverterProto output_converter = 6;</code>
   */
  org.tribuo.interop.tensorflow.protos.OutputConverterProtoOrBuilder getOutputConverterOrBuilder();

  /**
   * <code>int32 batch_size = 7;</code>
   * @return The batchSize.
   */
  int getBatchSize();

  /**
   * <code>string output_name = 8;</code>
   * @return The outputName.
   */
  java.lang.String getOutputName();
  /**
   * <code>string output_name = 8;</code>
   * @return The bytes for outputName.
   */
  com.google.protobuf.ByteString
      getOutputNameBytes();
}
