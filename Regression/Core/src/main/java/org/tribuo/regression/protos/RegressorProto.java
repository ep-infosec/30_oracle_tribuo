// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-regression-core.proto

package org.tribuo.regression.protos;

/**
 * <pre>
 *Regressor proto
 * </pre>
 *
 * Protobuf type {@code tribuo.regression.RegressorProto}
 */
public final class RegressorProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.regression.RegressorProto)
    RegressorProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegressorProto.newBuilder() to construct.
  private RegressorProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegressorProto() {
    name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    value_ = emptyDoubleList();
    variance_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegressorProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegressorProto(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              name_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            name_.add(s);
            break;
          }
          case 17: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              value_ = newDoubleList();
              mutable_bitField0_ |= 0x00000002;
            }
            value_.addDouble(input.readDouble());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              value_ = newDoubleList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              value_.addDouble(input.readDouble());
            }
            input.popLimit(limit);
            break;
          }
          case 25: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              variance_ = newDoubleList();
              mutable_bitField0_ |= 0x00000004;
            }
            variance_.addDouble(input.readDouble());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
              variance_ = newDoubleList();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              variance_.addDouble(input.readDouble());
            }
            input.popLimit(limit);
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
        name_ = name_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        value_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        variance_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tribuo.regression.protos.TribuoRegressionCore.internal_static_tribuo_regression_RegressorProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.regression.protos.TribuoRegressionCore.internal_static_tribuo_regression_RegressorProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.regression.protos.RegressorProto.class, org.tribuo.regression.protos.RegressorProto.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList name_;
  /**
   * <code>repeated string name = 1;</code>
   * @return A list containing the name.
   */
  public com.google.protobuf.ProtocolStringList
      getNameList() {
    return name_;
  }
  /**
   * <code>repeated string name = 1;</code>
   * @return The count of name.
   */
  public int getNameCount() {
    return name_.size();
  }
  /**
   * <code>repeated string name = 1;</code>
   * @param index The index of the element to return.
   * @return The name at the given index.
   */
  public java.lang.String getName(int index) {
    return name_.get(index);
  }
  /**
   * <code>repeated string name = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the name at the given index.
   */
  public com.google.protobuf.ByteString
      getNameBytes(int index) {
    return name_.getByteString(index);
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.DoubleList value_;
  /**
   * <code>repeated double value = 2;</code>
   * @return A list containing the value.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getValueList() {
    return value_;
  }
  /**
   * <code>repeated double value = 2;</code>
   * @return The count of value.
   */
  public int getValueCount() {
    return value_.size();
  }
  /**
   * <code>repeated double value = 2;</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  public double getValue(int index) {
    return value_.getDouble(index);
  }
  private int valueMemoizedSerializedSize = -1;

  public static final int VARIANCE_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.DoubleList variance_;
  /**
   * <code>repeated double variance = 3;</code>
   * @return A list containing the variance.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getVarianceList() {
    return variance_;
  }
  /**
   * <code>repeated double variance = 3;</code>
   * @return The count of variance.
   */
  public int getVarianceCount() {
    return variance_.size();
  }
  /**
   * <code>repeated double variance = 3;</code>
   * @param index The index of the element to return.
   * @return The variance at the given index.
   */
  public double getVariance(int index) {
    return variance_.getDouble(index);
  }
  private int varianceMemoizedSerializedSize = -1;

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
    for (int i = 0; i < name_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_.getRaw(i));
    }
    if (getValueList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(valueMemoizedSerializedSize);
    }
    for (int i = 0; i < value_.size(); i++) {
      output.writeDoubleNoTag(value_.getDouble(i));
    }
    if (getVarianceList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(varianceMemoizedSerializedSize);
    }
    for (int i = 0; i < variance_.size(); i++) {
      output.writeDoubleNoTag(variance_.getDouble(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < name_.size(); i++) {
        dataSize += computeStringSizeNoTag(name_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNameList().size();
    }
    {
      int dataSize = 0;
      dataSize = 8 * getValueList().size();
      size += dataSize;
      if (!getValueList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valueMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 8 * getVarianceList().size();
      size += dataSize;
      if (!getVarianceList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      varianceMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tribuo.regression.protos.RegressorProto)) {
      return super.equals(obj);
    }
    org.tribuo.regression.protos.RegressorProto other = (org.tribuo.regression.protos.RegressorProto) obj;

    if (!getNameList()
        .equals(other.getNameList())) return false;
    if (!getValueList()
        .equals(other.getValueList())) return false;
    if (!getVarianceList()
        .equals(other.getVarianceList())) return false;
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
    if (getNameCount() > 0) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getNameList().hashCode();
    }
    if (getValueCount() > 0) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValueList().hashCode();
    }
    if (getVarianceCount() > 0) {
      hash = (37 * hash) + VARIANCE_FIELD_NUMBER;
      hash = (53 * hash) + getVarianceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.regression.protos.RegressorProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.regression.protos.RegressorProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tribuo.regression.protos.RegressorProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.regression.protos.RegressorProto parseFrom(
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
  public static Builder newBuilder(org.tribuo.regression.protos.RegressorProto prototype) {
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
   *Regressor proto
   * </pre>
   *
   * Protobuf type {@code tribuo.regression.RegressorProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.regression.RegressorProto)
      org.tribuo.regression.protos.RegressorProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.regression.protos.TribuoRegressionCore.internal_static_tribuo_regression_RegressorProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.regression.protos.TribuoRegressionCore.internal_static_tribuo_regression_RegressorProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.regression.protos.RegressorProto.class, org.tribuo.regression.protos.RegressorProto.Builder.class);
    }

    // Construct using org.tribuo.regression.protos.RegressorProto.newBuilder()
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
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000002);
      variance_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.regression.protos.TribuoRegressionCore.internal_static_tribuo_regression_RegressorProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.regression.protos.RegressorProto getDefaultInstanceForType() {
      return org.tribuo.regression.protos.RegressorProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.regression.protos.RegressorProto build() {
      org.tribuo.regression.protos.RegressorProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.regression.protos.RegressorProto buildPartial() {
      org.tribuo.regression.protos.RegressorProto result = new org.tribuo.regression.protos.RegressorProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        name_ = name_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) != 0)) {
        value_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.value_ = value_;
      if (((bitField0_ & 0x00000004) != 0)) {
        variance_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.variance_ = variance_;
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
      if (other instanceof org.tribuo.regression.protos.RegressorProto) {
        return mergeFrom((org.tribuo.regression.protos.RegressorProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.regression.protos.RegressorProto other) {
      if (other == org.tribuo.regression.protos.RegressorProto.getDefaultInstance()) return this;
      if (!other.name_.isEmpty()) {
        if (name_.isEmpty()) {
          name_ = other.name_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNameIsMutable();
          name_.addAll(other.name_);
        }
        onChanged();
      }
      if (!other.value_.isEmpty()) {
        if (value_.isEmpty()) {
          value_ = other.value_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureValueIsMutable();
          value_.addAll(other.value_);
        }
        onChanged();
      }
      if (!other.variance_.isEmpty()) {
        if (variance_.isEmpty()) {
          variance_ = other.variance_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureVarianceIsMutable();
          variance_.addAll(other.variance_);
        }
        onChanged();
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
      org.tribuo.regression.protos.RegressorProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tribuo.regression.protos.RegressorProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNameIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        name_ = new com.google.protobuf.LazyStringArrayList(name_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string name = 1;</code>
     * @return A list containing the name.
     */
    public com.google.protobuf.ProtocolStringList
        getNameList() {
      return name_.getUnmodifiableView();
    }
    /**
     * <code>repeated string name = 1;</code>
     * @return The count of name.
     */
    public int getNameCount() {
      return name_.size();
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param index The index of the element to return.
     * @return The name at the given index.
     */
    public java.lang.String getName(int index) {
      return name_.get(index);
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the name at the given index.
     */
    public com.google.protobuf.ByteString
        getNameBytes(int index) {
      return name_.getByteString(index);
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param index The index to set the value at.
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param value The name to add.
     * @return This builder for chaining.
     */
    public Builder addName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param values The name to add.
     * @return This builder for chaining.
     */
    public Builder addAllName(
        java.lang.Iterable<java.lang.String> values) {
      ensureNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, name_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     * @param value The bytes of the name to add.
     * @return This builder for chaining.
     */
    public Builder addNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNameIsMutable();
      name_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList value_ = emptyDoubleList();
    private void ensureValueIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        value_ = mutableCopy(value_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated double value = 2;</code>
     * @return A list containing the value.
     */
    public java.util.List<java.lang.Double>
        getValueList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(value_) : value_;
    }
    /**
     * <code>repeated double value = 2;</code>
     * @return The count of value.
     */
    public int getValueCount() {
      return value_.size();
    }
    /**
     * <code>repeated double value = 2;</code>
     * @param index The index of the element to return.
     * @return The value at the given index.
     */
    public double getValue(int index) {
      return value_.getDouble(index);
    }
    /**
     * <code>repeated double value = 2;</code>
     * @param index The index to set the value at.
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        int index, double value) {
      ensureValueIsMutable();
      value_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double value = 2;</code>
     * @param value The value to add.
     * @return This builder for chaining.
     */
    public Builder addValue(double value) {
      ensureValueIsMutable();
      value_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double value = 2;</code>
     * @param values The value to add.
     * @return This builder for chaining.
     */
    public Builder addAllValue(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureValueIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, value_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList variance_ = emptyDoubleList();
    private void ensureVarianceIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        variance_ = mutableCopy(variance_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated double variance = 3;</code>
     * @return A list containing the variance.
     */
    public java.util.List<java.lang.Double>
        getVarianceList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(variance_) : variance_;
    }
    /**
     * <code>repeated double variance = 3;</code>
     * @return The count of variance.
     */
    public int getVarianceCount() {
      return variance_.size();
    }
    /**
     * <code>repeated double variance = 3;</code>
     * @param index The index of the element to return.
     * @return The variance at the given index.
     */
    public double getVariance(int index) {
      return variance_.getDouble(index);
    }
    /**
     * <code>repeated double variance = 3;</code>
     * @param index The index to set the value at.
     * @param value The variance to set.
     * @return This builder for chaining.
     */
    public Builder setVariance(
        int index, double value) {
      ensureVarianceIsMutable();
      variance_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double variance = 3;</code>
     * @param value The variance to add.
     * @return This builder for chaining.
     */
    public Builder addVariance(double value) {
      ensureVarianceIsMutable();
      variance_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double variance = 3;</code>
     * @param values The variance to add.
     * @return This builder for chaining.
     */
    public Builder addAllVariance(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureVarianceIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, variance_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double variance = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVariance() {
      variance_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:tribuo.regression.RegressorProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.regression.RegressorProto)
  private static final org.tribuo.regression.protos.RegressorProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.regression.protos.RegressorProto();
  }

  public static org.tribuo.regression.protos.RegressorProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegressorProto>
      PARSER = new com.google.protobuf.AbstractParser<RegressorProto>() {
    @java.lang.Override
    public RegressorProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegressorProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegressorProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegressorProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.regression.protos.RegressorProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
