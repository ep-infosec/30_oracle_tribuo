// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-math.proto

package org.tribuo.math.protos;

public final class TribuoMath {
  private TribuoMath() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_math_DistanceProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_math_DistanceProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_math_KernelProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_math_KernelProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_math_MergerProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_math_MergerProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_math_NeighbourFactoryProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_math_NeighbourFactoryProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_math_NormalizerProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_math_NormalizerProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_math_ParametersProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_math_ParametersProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_math_TensorProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_math_TensorProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021tribuo-math.proto\022\013tribuo.math\032\031google" +
      "/protobuf/any.proto\"c\n\rDistanceProto\022\017\n\007" +
      "version\030\001 \001(\005\022\022\n\nclass_name\030\002 \001(\t\022-\n\017ser" +
      "ialized_data\030\003 \001(\0132\024.google.protobuf.Any" +
      "\"a\n\013KernelProto\022\017\n\007version\030\001 \001(\005\022\022\n\nclas" +
      "s_name\030\002 \001(\t\022-\n\017serialized_data\030\003 \001(\0132\024." +
      "google.protobuf.Any\"a\n\013MergerProto\022\017\n\007ve" +
      "rsion\030\001 \001(\005\022\022\n\nclass_name\030\002 \001(\t\022-\n\017seria" +
      "lized_data\030\003 \001(\0132\024.google.protobuf.Any\"k" +
      "\n\025NeighbourFactoryProto\022\017\n\007version\030\001 \001(\005" +
      "\022\022\n\nclass_name\030\002 \001(\t\022-\n\017serialized_data\030" +
      "\003 \001(\0132\024.google.protobuf.Any\"e\n\017Normalize" +
      "rProto\022\017\n\007version\030\001 \001(\005\022\022\n\nclass_name\030\002 " +
      "\001(\t\022-\n\017serialized_data\030\003 \001(\0132\024.google.pr" +
      "otobuf.Any\"e\n\017ParametersProto\022\017\n\007version" +
      "\030\001 \001(\005\022\022\n\nclass_name\030\002 \001(\t\022-\n\017serialized" +
      "_data\030\003 \001(\0132\024.google.protobuf.Any\"a\n\013Ten" +
      "sorProto\022\017\n\007version\030\001 \001(\005\022\022\n\nclass_name\030" +
      "\002 \001(\t\022-\n\017serialized_data\030\003 \001(\0132\024.google." +
      "protobuf.AnyB\032\n\026org.tribuo.math.protosP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_tribuo_math_DistanceProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tribuo_math_DistanceProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_math_DistanceProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    internal_static_tribuo_math_KernelProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tribuo_math_KernelProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_math_KernelProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    internal_static_tribuo_math_MergerProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tribuo_math_MergerProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_math_MergerProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    internal_static_tribuo_math_NeighbourFactoryProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tribuo_math_NeighbourFactoryProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_math_NeighbourFactoryProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    internal_static_tribuo_math_NormalizerProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tribuo_math_NormalizerProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_math_NormalizerProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    internal_static_tribuo_math_ParametersProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tribuo_math_ParametersProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_math_ParametersProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    internal_static_tribuo_math_TensorProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tribuo_math_TensorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_math_TensorProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
