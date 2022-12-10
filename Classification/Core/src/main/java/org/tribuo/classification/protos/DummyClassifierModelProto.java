// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-classification-core.proto

package org.tribuo.classification.protos;

/**
 * <pre>
 *DummyClassifierModel proto
 * </pre>
 *
 * Protobuf type {@code tribuo.classification.DummyClassifierModelProto}
 */
public final class DummyClassifierModelProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.classification.DummyClassifierModelProto)
    DummyClassifierModelProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DummyClassifierModelProto.newBuilder() to construct.
  private DummyClassifierModelProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DummyClassifierModelProto() {
    dummyType_ = "";
    cdf_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DummyClassifierModelProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DummyClassifierModelProto(
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
            org.tribuo.protos.core.ModelDataProto.Builder subBuilder = null;
            if (metadata_ != null) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(org.tribuo.protos.core.ModelDataProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dummyType_ = s;
            break;
          }
          case 26: {
            org.tribuo.protos.core.OutputProto.Builder subBuilder = null;
            if (constantLabel_ != null) {
              subBuilder = constantLabel_.toBuilder();
            }
            constantLabel_ = input.readMessage(org.tribuo.protos.core.OutputProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(constantLabel_);
              constantLabel_ = subBuilder.buildPartial();
            }

            break;
          }
          case 33: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cdf_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            cdf_.addDouble(input.readDouble());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              cdf_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              cdf_.addDouble(input.readDouble());
            }
            input.popLimit(limit);
            break;
          }
          case 40: {

            seed_ = input.readInt64();
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
        cdf_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tribuo.classification.protos.TribuoClassificationCore.internal_static_tribuo_classification_DummyClassifierModelProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.classification.protos.TribuoClassificationCore.internal_static_tribuo_classification_DummyClassifierModelProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.classification.protos.DummyClassifierModelProto.class, org.tribuo.classification.protos.DummyClassifierModelProto.Builder.class);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  private org.tribuo.protos.core.ModelDataProto metadata_;
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return The metadata.
   */
  @java.lang.Override
  public org.tribuo.protos.core.ModelDataProto getMetadata() {
    return metadata_ == null ? org.tribuo.protos.core.ModelDataProto.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   */
  @java.lang.Override
  public org.tribuo.protos.core.ModelDataProtoOrBuilder getMetadataOrBuilder() {
    return getMetadata();
  }

  public static final int DUMMY_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object dummyType_;
  /**
   * <code>string dummy_type = 2;</code>
   * @return The dummyType.
   */
  @java.lang.Override
  public java.lang.String getDummyType() {
    java.lang.Object ref = dummyType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dummyType_ = s;
      return s;
    }
  }
  /**
   * <code>string dummy_type = 2;</code>
   * @return The bytes for dummyType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDummyTypeBytes() {
    java.lang.Object ref = dummyType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dummyType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSTANT_LABEL_FIELD_NUMBER = 3;
  private org.tribuo.protos.core.OutputProto constantLabel_;
  /**
   * <code>.tribuo.core.OutputProto constant_label = 3;</code>
   * @return Whether the constantLabel field is set.
   */
  @java.lang.Override
  public boolean hasConstantLabel() {
    return constantLabel_ != null;
  }
  /**
   * <code>.tribuo.core.OutputProto constant_label = 3;</code>
   * @return The constantLabel.
   */
  @java.lang.Override
  public org.tribuo.protos.core.OutputProto getConstantLabel() {
    return constantLabel_ == null ? org.tribuo.protos.core.OutputProto.getDefaultInstance() : constantLabel_;
  }
  /**
   * <code>.tribuo.core.OutputProto constant_label = 3;</code>
   */
  @java.lang.Override
  public org.tribuo.protos.core.OutputProtoOrBuilder getConstantLabelOrBuilder() {
    return getConstantLabel();
  }

  public static final int CDF_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.DoubleList cdf_;
  /**
   * <code>repeated double cdf = 4;</code>
   * @return A list containing the cdf.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getCdfList() {
    return cdf_;
  }
  /**
   * <code>repeated double cdf = 4;</code>
   * @return The count of cdf.
   */
  public int getCdfCount() {
    return cdf_.size();
  }
  /**
   * <code>repeated double cdf = 4;</code>
   * @param index The index of the element to return.
   * @return The cdf at the given index.
   */
  public double getCdf(int index) {
    return cdf_.getDouble(index);
  }
  private int cdfMemoizedSerializedSize = -1;

  public static final int SEED_FIELD_NUMBER = 5;
  private long seed_;
  /**
   * <code>int64 seed = 5;</code>
   * @return The seed.
   */
  @java.lang.Override
  public long getSeed() {
    return seed_;
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
    getSerializedSize();
    if (metadata_ != null) {
      output.writeMessage(1, getMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dummyType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dummyType_);
    }
    if (constantLabel_ != null) {
      output.writeMessage(3, getConstantLabel());
    }
    if (getCdfList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(cdfMemoizedSerializedSize);
    }
    for (int i = 0; i < cdf_.size(); i++) {
      output.writeDoubleNoTag(cdf_.getDouble(i));
    }
    if (seed_ != 0L) {
      output.writeInt64(5, seed_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dummyType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dummyType_);
    }
    if (constantLabel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConstantLabel());
    }
    {
      int dataSize = 0;
      dataSize = 8 * getCdfList().size();
      size += dataSize;
      if (!getCdfList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      cdfMemoizedSerializedSize = dataSize;
    }
    if (seed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, seed_);
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
    if (!(obj instanceof org.tribuo.classification.protos.DummyClassifierModelProto)) {
      return super.equals(obj);
    }
    org.tribuo.classification.protos.DummyClassifierModelProto other = (org.tribuo.classification.protos.DummyClassifierModelProto) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
    }
    if (!getDummyType()
        .equals(other.getDummyType())) return false;
    if (hasConstantLabel() != other.hasConstantLabel()) return false;
    if (hasConstantLabel()) {
      if (!getConstantLabel()
          .equals(other.getConstantLabel())) return false;
    }
    if (!getCdfList()
        .equals(other.getCdfList())) return false;
    if (getSeed()
        != other.getSeed()) return false;
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
    hash = (37 * hash) + DUMMY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDummyType().hashCode();
    if (hasConstantLabel()) {
      hash = (37 * hash) + CONSTANT_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getConstantLabel().hashCode();
    }
    if (getCdfCount() > 0) {
      hash = (37 * hash) + CDF_FIELD_NUMBER;
      hash = (53 * hash) + getCdfList().hashCode();
    }
    hash = (37 * hash) + SEED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSeed());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.classification.protos.DummyClassifierModelProto parseFrom(
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
  public static Builder newBuilder(org.tribuo.classification.protos.DummyClassifierModelProto prototype) {
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
   *DummyClassifierModel proto
   * </pre>
   *
   * Protobuf type {@code tribuo.classification.DummyClassifierModelProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.classification.DummyClassifierModelProto)
      org.tribuo.classification.protos.DummyClassifierModelProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.classification.protos.TribuoClassificationCore.internal_static_tribuo_classification_DummyClassifierModelProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.classification.protos.TribuoClassificationCore.internal_static_tribuo_classification_DummyClassifierModelProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.classification.protos.DummyClassifierModelProto.class, org.tribuo.classification.protos.DummyClassifierModelProto.Builder.class);
    }

    // Construct using org.tribuo.classification.protos.DummyClassifierModelProto.newBuilder()
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
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      dummyType_ = "";

      if (constantLabelBuilder_ == null) {
        constantLabel_ = null;
      } else {
        constantLabel_ = null;
        constantLabelBuilder_ = null;
      }
      cdf_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      seed_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.classification.protos.TribuoClassificationCore.internal_static_tribuo_classification_DummyClassifierModelProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.classification.protos.DummyClassifierModelProto getDefaultInstanceForType() {
      return org.tribuo.classification.protos.DummyClassifierModelProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.classification.protos.DummyClassifierModelProto build() {
      org.tribuo.classification.protos.DummyClassifierModelProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.classification.protos.DummyClassifierModelProto buildPartial() {
      org.tribuo.classification.protos.DummyClassifierModelProto result = new org.tribuo.classification.protos.DummyClassifierModelProto(this);
      int from_bitField0_ = bitField0_;
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
      result.dummyType_ = dummyType_;
      if (constantLabelBuilder_ == null) {
        result.constantLabel_ = constantLabel_;
      } else {
        result.constantLabel_ = constantLabelBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        cdf_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cdf_ = cdf_;
      result.seed_ = seed_;
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
      if (other instanceof org.tribuo.classification.protos.DummyClassifierModelProto) {
        return mergeFrom((org.tribuo.classification.protos.DummyClassifierModelProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.classification.protos.DummyClassifierModelProto other) {
      if (other == org.tribuo.classification.protos.DummyClassifierModelProto.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
      }
      if (!other.getDummyType().isEmpty()) {
        dummyType_ = other.dummyType_;
        onChanged();
      }
      if (other.hasConstantLabel()) {
        mergeConstantLabel(other.getConstantLabel());
      }
      if (!other.cdf_.isEmpty()) {
        if (cdf_.isEmpty()) {
          cdf_ = other.cdf_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCdfIsMutable();
          cdf_.addAll(other.cdf_);
        }
        onChanged();
      }
      if (other.getSeed() != 0L) {
        setSeed(other.getSeed());
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
      org.tribuo.classification.protos.DummyClassifierModelProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tribuo.classification.protos.DummyClassifierModelProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.tribuo.protos.core.ModelDataProto metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.protos.core.ModelDataProto, org.tribuo.protos.core.ModelDataProto.Builder, org.tribuo.protos.core.ModelDataProtoOrBuilder> metadataBuilder_;
    /**
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     * @return The metadata.
     */
    public org.tribuo.protos.core.ModelDataProto getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? org.tribuo.protos.core.ModelDataProto.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     */
    public Builder setMetadata(org.tribuo.protos.core.ModelDataProto value) {
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
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     */
    public Builder setMetadata(
        org.tribuo.protos.core.ModelDataProto.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     */
    public Builder mergeMetadata(org.tribuo.protos.core.ModelDataProto value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            org.tribuo.protos.core.ModelDataProto.newBuilder(metadata_).mergeFrom(value).buildPartial();
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
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
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
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     */
    public org.tribuo.protos.core.ModelDataProto.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     */
    public org.tribuo.protos.core.ModelDataProtoOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            org.tribuo.protos.core.ModelDataProto.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.protos.core.ModelDataProto, org.tribuo.protos.core.ModelDataProto.Builder, org.tribuo.protos.core.ModelDataProtoOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tribuo.protos.core.ModelDataProto, org.tribuo.protos.core.ModelDataProto.Builder, org.tribuo.protos.core.ModelDataProtoOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    private java.lang.Object dummyType_ = "";
    /**
     * <code>string dummy_type = 2;</code>
     * @return The dummyType.
     */
    public java.lang.String getDummyType() {
      java.lang.Object ref = dummyType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dummyType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dummy_type = 2;</code>
     * @return The bytes for dummyType.
     */
    public com.google.protobuf.ByteString
        getDummyTypeBytes() {
      java.lang.Object ref = dummyType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dummyType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dummy_type = 2;</code>
     * @param value The dummyType to set.
     * @return This builder for chaining.
     */
    public Builder setDummyType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dummyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dummy_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDummyType() {
      
      dummyType_ = getDefaultInstance().getDummyType();
      onChanged();
      return this;
    }
    /**
     * <code>string dummy_type = 2;</code>
     * @param value The bytes for dummyType to set.
     * @return This builder for chaining.
     */
    public Builder setDummyTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dummyType_ = value;
      onChanged();
      return this;
    }

    private org.tribuo.protos.core.OutputProto constantLabel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.protos.core.OutputProto, org.tribuo.protos.core.OutputProto.Builder, org.tribuo.protos.core.OutputProtoOrBuilder> constantLabelBuilder_;
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     * @return Whether the constantLabel field is set.
     */
    public boolean hasConstantLabel() {
      return constantLabelBuilder_ != null || constantLabel_ != null;
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     * @return The constantLabel.
     */
    public org.tribuo.protos.core.OutputProto getConstantLabel() {
      if (constantLabelBuilder_ == null) {
        return constantLabel_ == null ? org.tribuo.protos.core.OutputProto.getDefaultInstance() : constantLabel_;
      } else {
        return constantLabelBuilder_.getMessage();
      }
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     */
    public Builder setConstantLabel(org.tribuo.protos.core.OutputProto value) {
      if (constantLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        constantLabel_ = value;
        onChanged();
      } else {
        constantLabelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     */
    public Builder setConstantLabel(
        org.tribuo.protos.core.OutputProto.Builder builderForValue) {
      if (constantLabelBuilder_ == null) {
        constantLabel_ = builderForValue.build();
        onChanged();
      } else {
        constantLabelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     */
    public Builder mergeConstantLabel(org.tribuo.protos.core.OutputProto value) {
      if (constantLabelBuilder_ == null) {
        if (constantLabel_ != null) {
          constantLabel_ =
            org.tribuo.protos.core.OutputProto.newBuilder(constantLabel_).mergeFrom(value).buildPartial();
        } else {
          constantLabel_ = value;
        }
        onChanged();
      } else {
        constantLabelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     */
    public Builder clearConstantLabel() {
      if (constantLabelBuilder_ == null) {
        constantLabel_ = null;
        onChanged();
      } else {
        constantLabel_ = null;
        constantLabelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     */
    public org.tribuo.protos.core.OutputProto.Builder getConstantLabelBuilder() {
      
      onChanged();
      return getConstantLabelFieldBuilder().getBuilder();
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     */
    public org.tribuo.protos.core.OutputProtoOrBuilder getConstantLabelOrBuilder() {
      if (constantLabelBuilder_ != null) {
        return constantLabelBuilder_.getMessageOrBuilder();
      } else {
        return constantLabel_ == null ?
            org.tribuo.protos.core.OutputProto.getDefaultInstance() : constantLabel_;
      }
    }
    /**
     * <code>.tribuo.core.OutputProto constant_label = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.protos.core.OutputProto, org.tribuo.protos.core.OutputProto.Builder, org.tribuo.protos.core.OutputProtoOrBuilder> 
        getConstantLabelFieldBuilder() {
      if (constantLabelBuilder_ == null) {
        constantLabelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tribuo.protos.core.OutputProto, org.tribuo.protos.core.OutputProto.Builder, org.tribuo.protos.core.OutputProtoOrBuilder>(
                getConstantLabel(),
                getParentForChildren(),
                isClean());
        constantLabel_ = null;
      }
      return constantLabelBuilder_;
    }

    private com.google.protobuf.Internal.DoubleList cdf_ = emptyDoubleList();
    private void ensureCdfIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cdf_ = mutableCopy(cdf_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated double cdf = 4;</code>
     * @return A list containing the cdf.
     */
    public java.util.List<java.lang.Double>
        getCdfList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(cdf_) : cdf_;
    }
    /**
     * <code>repeated double cdf = 4;</code>
     * @return The count of cdf.
     */
    public int getCdfCount() {
      return cdf_.size();
    }
    /**
     * <code>repeated double cdf = 4;</code>
     * @param index The index of the element to return.
     * @return The cdf at the given index.
     */
    public double getCdf(int index) {
      return cdf_.getDouble(index);
    }
    /**
     * <code>repeated double cdf = 4;</code>
     * @param index The index to set the value at.
     * @param value The cdf to set.
     * @return This builder for chaining.
     */
    public Builder setCdf(
        int index, double value) {
      ensureCdfIsMutable();
      cdf_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double cdf = 4;</code>
     * @param value The cdf to add.
     * @return This builder for chaining.
     */
    public Builder addCdf(double value) {
      ensureCdfIsMutable();
      cdf_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double cdf = 4;</code>
     * @param values The cdf to add.
     * @return This builder for chaining.
     */
    public Builder addAllCdf(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureCdfIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cdf_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double cdf = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCdf() {
      cdf_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long seed_ ;
    /**
     * <code>int64 seed = 5;</code>
     * @return The seed.
     */
    @java.lang.Override
    public long getSeed() {
      return seed_;
    }
    /**
     * <code>int64 seed = 5;</code>
     * @param value The seed to set.
     * @return This builder for chaining.
     */
    public Builder setSeed(long value) {
      
      seed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 seed = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeed() {
      
      seed_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tribuo.classification.DummyClassifierModelProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.classification.DummyClassifierModelProto)
  private static final org.tribuo.classification.protos.DummyClassifierModelProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.classification.protos.DummyClassifierModelProto();
  }

  public static org.tribuo.classification.protos.DummyClassifierModelProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DummyClassifierModelProto>
      PARSER = new com.google.protobuf.AbstractParser<DummyClassifierModelProto>() {
    @java.lang.Override
    public DummyClassifierModelProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DummyClassifierModelProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DummyClassifierModelProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DummyClassifierModelProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.classification.protos.DummyClassifierModelProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

