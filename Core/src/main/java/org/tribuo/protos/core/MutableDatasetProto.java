// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

/**
 * <pre>
 *MutableDataset proto
 * </pre>
 *
 * Protobuf type {@code tribuo.core.MutableDatasetProto}
 */
public final class MutableDatasetProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.core.MutableDatasetProto)
    MutableDatasetProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutableDatasetProto.newBuilder() to construct.
  private MutableDatasetProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutableDatasetProto() {
    examples_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutableDatasetProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutableDatasetProto(
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
            org.tribuo.protos.core.DatasetDataProto.Builder subBuilder = null;
            if (metadata_ != null) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(org.tribuo.protos.core.DatasetDataProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              examples_ = new java.util.ArrayList<org.tribuo.protos.core.ExampleProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            examples_.add(
                input.readMessage(org.tribuo.protos.core.ExampleProto.parser(), extensionRegistry));
            break;
          }
          case 24: {

            dense_ = input.readBool();
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
        examples_ = java.util.Collections.unmodifiableList(examples_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_MutableDatasetProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_MutableDatasetProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.protos.core.MutableDatasetProto.class, org.tribuo.protos.core.MutableDatasetProto.Builder.class);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  private org.tribuo.protos.core.DatasetDataProto metadata_;
  /**
   * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
   * @return The metadata.
   */
  @java.lang.Override
  public org.tribuo.protos.core.DatasetDataProto getMetadata() {
    return metadata_ == null ? org.tribuo.protos.core.DatasetDataProto.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
   */
  @java.lang.Override
  public org.tribuo.protos.core.DatasetDataProtoOrBuilder getMetadataOrBuilder() {
    return getMetadata();
  }

  public static final int EXAMPLES_FIELD_NUMBER = 2;
  private java.util.List<org.tribuo.protos.core.ExampleProto> examples_;
  /**
   * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.tribuo.protos.core.ExampleProto> getExamplesList() {
    return examples_;
  }
  /**
   * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.tribuo.protos.core.ExampleProtoOrBuilder> 
      getExamplesOrBuilderList() {
    return examples_;
  }
  /**
   * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
   */
  @java.lang.Override
  public int getExamplesCount() {
    return examples_.size();
  }
  /**
   * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
   */
  @java.lang.Override
  public org.tribuo.protos.core.ExampleProto getExamples(int index) {
    return examples_.get(index);
  }
  /**
   * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
   */
  @java.lang.Override
  public org.tribuo.protos.core.ExampleProtoOrBuilder getExamplesOrBuilder(
      int index) {
    return examples_.get(index);
  }

  public static final int DENSE_FIELD_NUMBER = 3;
  private boolean dense_;
  /**
   * <code>bool dense = 3;</code>
   * @return The dense.
   */
  @java.lang.Override
  public boolean getDense() {
    return dense_;
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
    if (metadata_ != null) {
      output.writeMessage(1, getMetadata());
    }
    for (int i = 0; i < examples_.size(); i++) {
      output.writeMessage(2, examples_.get(i));
    }
    if (dense_ != false) {
      output.writeBool(3, dense_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetadata());
    }
    for (int i = 0; i < examples_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, examples_.get(i));
    }
    if (dense_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, dense_);
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
    if (!(obj instanceof org.tribuo.protos.core.MutableDatasetProto)) {
      return super.equals(obj);
    }
    org.tribuo.protos.core.MutableDatasetProto other = (org.tribuo.protos.core.MutableDatasetProto) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
    }
    if (!getExamplesList()
        .equals(other.getExamplesList())) return false;
    if (getDense()
        != other.getDense()) return false;
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
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    if (getExamplesCount() > 0) {
      hash = (37 * hash) + EXAMPLES_FIELD_NUMBER;
      hash = (53 * hash) + getExamplesList().hashCode();
    }
    hash = (37 * hash) + DENSE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDense());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.MutableDatasetProto parseFrom(
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
  public static Builder newBuilder(org.tribuo.protos.core.MutableDatasetProto prototype) {
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
   * <pre>
   *MutableDataset proto
   * </pre>
   *
   * Protobuf type {@code tribuo.core.MutableDatasetProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.core.MutableDatasetProto)
      org.tribuo.protos.core.MutableDatasetProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_MutableDatasetProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_MutableDatasetProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.protos.core.MutableDatasetProto.class, org.tribuo.protos.core.MutableDatasetProto.Builder.class);
    }

    // Construct using org.tribuo.protos.core.MutableDatasetProto.newBuilder()
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
        getExamplesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      if (examplesBuilder_ == null) {
        examples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        examplesBuilder_.clear();
      }
      dense_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_MutableDatasetProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.protos.core.MutableDatasetProto getDefaultInstanceForType() {
      return org.tribuo.protos.core.MutableDatasetProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.protos.core.MutableDatasetProto build() {
      org.tribuo.protos.core.MutableDatasetProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.protos.core.MutableDatasetProto buildPartial() {
      org.tribuo.protos.core.MutableDatasetProto result = new org.tribuo.protos.core.MutableDatasetProto(this);
      int from_bitField0_ = bitField0_;
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
      if (examplesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          examples_ = java.util.Collections.unmodifiableList(examples_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.examples_ = examples_;
      } else {
        result.examples_ = examplesBuilder_.build();
      }
      result.dense_ = dense_;
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
      if (other instanceof org.tribuo.protos.core.MutableDatasetProto) {
        return mergeFrom((org.tribuo.protos.core.MutableDatasetProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.protos.core.MutableDatasetProto other) {
      if (other == org.tribuo.protos.core.MutableDatasetProto.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
      }
      if (examplesBuilder_ == null) {
        if (!other.examples_.isEmpty()) {
          if (examples_.isEmpty()) {
            examples_ = other.examples_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExamplesIsMutable();
            examples_.addAll(other.examples_);
          }
          onChanged();
        }
      } else {
        if (!other.examples_.isEmpty()) {
          if (examplesBuilder_.isEmpty()) {
            examplesBuilder_.dispose();
            examplesBuilder_ = null;
            examples_ = other.examples_;
            bitField0_ = (bitField0_ & ~0x00000001);
            examplesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExamplesFieldBuilder() : null;
          } else {
            examplesBuilder_.addAllMessages(other.examples_);
          }
        }
      }
      if (other.getDense() != false) {
        setDense(other.getDense());
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
      org.tribuo.protos.core.MutableDatasetProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tribuo.protos.core.MutableDatasetProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.tribuo.protos.core.DatasetDataProto metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.protos.core.DatasetDataProto, org.tribuo.protos.core.DatasetDataProto.Builder, org.tribuo.protos.core.DatasetDataProtoOrBuilder> metadataBuilder_;
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     * @return The metadata.
     */
    public org.tribuo.protos.core.DatasetDataProto getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? org.tribuo.protos.core.DatasetDataProto.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     */
    public Builder setMetadata(org.tribuo.protos.core.DatasetDataProto value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     */
    public Builder setMetadata(
        org.tribuo.protos.core.DatasetDataProto.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     */
    public Builder mergeMetadata(org.tribuo.protos.core.DatasetDataProto value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            org.tribuo.protos.core.DatasetDataProto.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     */
    public org.tribuo.protos.core.DatasetDataProto.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     */
    public org.tribuo.protos.core.DatasetDataProtoOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            org.tribuo.protos.core.DatasetDataProto.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>.tribuo.core.DatasetDataProto metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.protos.core.DatasetDataProto, org.tribuo.protos.core.DatasetDataProto.Builder, org.tribuo.protos.core.DatasetDataProtoOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tribuo.protos.core.DatasetDataProto, org.tribuo.protos.core.DatasetDataProto.Builder, org.tribuo.protos.core.DatasetDataProtoOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    private java.util.List<org.tribuo.protos.core.ExampleProto> examples_ =
      java.util.Collections.emptyList();
    private void ensureExamplesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        examples_ = new java.util.ArrayList<org.tribuo.protos.core.ExampleProto>(examples_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tribuo.protos.core.ExampleProto, org.tribuo.protos.core.ExampleProto.Builder, org.tribuo.protos.core.ExampleProtoOrBuilder> examplesBuilder_;

    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public java.util.List<org.tribuo.protos.core.ExampleProto> getExamplesList() {
      if (examplesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(examples_);
      } else {
        return examplesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public int getExamplesCount() {
      if (examplesBuilder_ == null) {
        return examples_.size();
      } else {
        return examplesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public org.tribuo.protos.core.ExampleProto getExamples(int index) {
      if (examplesBuilder_ == null) {
        return examples_.get(index);
      } else {
        return examplesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder setExamples(
        int index, org.tribuo.protos.core.ExampleProto value) {
      if (examplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExamplesIsMutable();
        examples_.set(index, value);
        onChanged();
      } else {
        examplesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder setExamples(
        int index, org.tribuo.protos.core.ExampleProto.Builder builderForValue) {
      if (examplesBuilder_ == null) {
        ensureExamplesIsMutable();
        examples_.set(index, builderForValue.build());
        onChanged();
      } else {
        examplesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder addExamples(org.tribuo.protos.core.ExampleProto value) {
      if (examplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExamplesIsMutable();
        examples_.add(value);
        onChanged();
      } else {
        examplesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder addExamples(
        int index, org.tribuo.protos.core.ExampleProto value) {
      if (examplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExamplesIsMutable();
        examples_.add(index, value);
        onChanged();
      } else {
        examplesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder addExamples(
        org.tribuo.protos.core.ExampleProto.Builder builderForValue) {
      if (examplesBuilder_ == null) {
        ensureExamplesIsMutable();
        examples_.add(builderForValue.build());
        onChanged();
      } else {
        examplesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder addExamples(
        int index, org.tribuo.protos.core.ExampleProto.Builder builderForValue) {
      if (examplesBuilder_ == null) {
        ensureExamplesIsMutable();
        examples_.add(index, builderForValue.build());
        onChanged();
      } else {
        examplesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder addAllExamples(
        java.lang.Iterable<? extends org.tribuo.protos.core.ExampleProto> values) {
      if (examplesBuilder_ == null) {
        ensureExamplesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, examples_);
        onChanged();
      } else {
        examplesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder clearExamples() {
      if (examplesBuilder_ == null) {
        examples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        examplesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public Builder removeExamples(int index) {
      if (examplesBuilder_ == null) {
        ensureExamplesIsMutable();
        examples_.remove(index);
        onChanged();
      } else {
        examplesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public org.tribuo.protos.core.ExampleProto.Builder getExamplesBuilder(
        int index) {
      return getExamplesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public org.tribuo.protos.core.ExampleProtoOrBuilder getExamplesOrBuilder(
        int index) {
      if (examplesBuilder_ == null) {
        return examples_.get(index);  } else {
        return examplesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public java.util.List<? extends org.tribuo.protos.core.ExampleProtoOrBuilder> 
         getExamplesOrBuilderList() {
      if (examplesBuilder_ != null) {
        return examplesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(examples_);
      }
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public org.tribuo.protos.core.ExampleProto.Builder addExamplesBuilder() {
      return getExamplesFieldBuilder().addBuilder(
          org.tribuo.protos.core.ExampleProto.getDefaultInstance());
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public org.tribuo.protos.core.ExampleProto.Builder addExamplesBuilder(
        int index) {
      return getExamplesFieldBuilder().addBuilder(
          index, org.tribuo.protos.core.ExampleProto.getDefaultInstance());
    }
    /**
     * <code>repeated .tribuo.core.ExampleProto examples = 2;</code>
     */
    public java.util.List<org.tribuo.protos.core.ExampleProto.Builder> 
         getExamplesBuilderList() {
      return getExamplesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tribuo.protos.core.ExampleProto, org.tribuo.protos.core.ExampleProto.Builder, org.tribuo.protos.core.ExampleProtoOrBuilder> 
        getExamplesFieldBuilder() {
      if (examplesBuilder_ == null) {
        examplesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tribuo.protos.core.ExampleProto, org.tribuo.protos.core.ExampleProto.Builder, org.tribuo.protos.core.ExampleProtoOrBuilder>(
                examples_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        examples_ = null;
      }
      return examplesBuilder_;
    }

    private boolean dense_ ;
    /**
     * <code>bool dense = 3;</code>
     * @return The dense.
     */
    @java.lang.Override
    public boolean getDense() {
      return dense_;
    }
    /**
     * <code>bool dense = 3;</code>
     * @param value The dense to set.
     * @return This builder for chaining.
     */
    public Builder setDense(boolean value) {
      
      dense_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dense = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDense() {
      
      dense_ = false;
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


    // @@protoc_insertion_point(builder_scope:tribuo.core.MutableDatasetProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.core.MutableDatasetProto)
  private static final org.tribuo.protos.core.MutableDatasetProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.protos.core.MutableDatasetProto();
  }

  public static org.tribuo.protos.core.MutableDatasetProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutableDatasetProto>
      PARSER = new com.google.protobuf.AbstractParser<MutableDatasetProto>() {
    @java.lang.Override
    public MutableDatasetProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutableDatasetProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutableDatasetProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutableDatasetProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.protos.core.MutableDatasetProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

