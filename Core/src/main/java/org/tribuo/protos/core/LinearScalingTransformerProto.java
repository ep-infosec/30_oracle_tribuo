// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

/**
 * <pre>
 *LinearScalingTransformer proto
 * </pre>
 *
 * Protobuf type {@code tribuo.core.LinearScalingTransformerProto}
 */
public final class LinearScalingTransformerProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.core.LinearScalingTransformerProto)
    LinearScalingTransformerProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LinearScalingTransformerProto.newBuilder() to construct.
  private LinearScalingTransformerProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LinearScalingTransformerProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LinearScalingTransformerProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LinearScalingTransformerProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 9: {

            observedMin_ = input.readDouble();
            break;
          }
          case 17: {

            observedMax_ = input.readDouble();
            break;
          }
          case 25: {

            targetMin_ = input.readDouble();
            break;
          }
          case 33: {

            targetMax_ = input.readDouble();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_LinearScalingTransformerProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_LinearScalingTransformerProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.protos.core.LinearScalingTransformerProto.class, org.tribuo.protos.core.LinearScalingTransformerProto.Builder.class);
  }

  public static final int OBSERVEDMIN_FIELD_NUMBER = 1;
  private double observedMin_;
  /**
   * <code>double observedMin = 1;</code>
   * @return The observedMin.
   */
  @java.lang.Override
  public double getObservedMin() {
    return observedMin_;
  }

  public static final int OBSERVEDMAX_FIELD_NUMBER = 2;
  private double observedMax_;
  /**
   * <code>double observedMax = 2;</code>
   * @return The observedMax.
   */
  @java.lang.Override
  public double getObservedMax() {
    return observedMax_;
  }

  public static final int TARGETMIN_FIELD_NUMBER = 3;
  private double targetMin_;
  /**
   * <code>double targetMin = 3;</code>
   * @return The targetMin.
   */
  @java.lang.Override
  public double getTargetMin() {
    return targetMin_;
  }

  public static final int TARGETMAX_FIELD_NUMBER = 4;
  private double targetMax_;
  /**
   * <code>double targetMax = 4;</code>
   * @return The targetMax.
   */
  @java.lang.Override
  public double getTargetMax() {
    return targetMax_;
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
    if (java.lang.Double.doubleToRawLongBits(observedMin_) != 0) {
      output.writeDouble(1, observedMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(observedMax_) != 0) {
      output.writeDouble(2, observedMax_);
    }
    if (java.lang.Double.doubleToRawLongBits(targetMin_) != 0) {
      output.writeDouble(3, targetMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(targetMax_) != 0) {
      output.writeDouble(4, targetMax_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(observedMin_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, observedMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(observedMax_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, observedMax_);
    }
    if (java.lang.Double.doubleToRawLongBits(targetMin_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, targetMin_);
    }
    if (java.lang.Double.doubleToRawLongBits(targetMax_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, targetMax_);
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
    if (!(obj instanceof org.tribuo.protos.core.LinearScalingTransformerProto)) {
      return super.equals(obj);
    }
    org.tribuo.protos.core.LinearScalingTransformerProto other = (org.tribuo.protos.core.LinearScalingTransformerProto) obj;

    if (java.lang.Double.doubleToLongBits(getObservedMin())
        != java.lang.Double.doubleToLongBits(
            other.getObservedMin())) return false;
    if (java.lang.Double.doubleToLongBits(getObservedMax())
        != java.lang.Double.doubleToLongBits(
            other.getObservedMax())) return false;
    if (java.lang.Double.doubleToLongBits(getTargetMin())
        != java.lang.Double.doubleToLongBits(
            other.getTargetMin())) return false;
    if (java.lang.Double.doubleToLongBits(getTargetMax())
        != java.lang.Double.doubleToLongBits(
            other.getTargetMax())) return false;
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
    hash = (37 * hash) + OBSERVEDMIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getObservedMin()));
    hash = (37 * hash) + OBSERVEDMAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getObservedMax()));
    hash = (37 * hash) + TARGETMIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTargetMin()));
    hash = (37 * hash) + TARGETMAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTargetMax()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.LinearScalingTransformerProto parseFrom(
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
  public static Builder newBuilder(org.tribuo.protos.core.LinearScalingTransformerProto prototype) {
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
   *LinearScalingTransformer proto
   * </pre>
   *
   * Protobuf type {@code tribuo.core.LinearScalingTransformerProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.core.LinearScalingTransformerProto)
      org.tribuo.protos.core.LinearScalingTransformerProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_LinearScalingTransformerProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_LinearScalingTransformerProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.protos.core.LinearScalingTransformerProto.class, org.tribuo.protos.core.LinearScalingTransformerProto.Builder.class);
    }

    // Construct using org.tribuo.protos.core.LinearScalingTransformerProto.newBuilder()
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
      observedMin_ = 0D;

      observedMax_ = 0D;

      targetMin_ = 0D;

      targetMax_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_LinearScalingTransformerProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.protos.core.LinearScalingTransformerProto getDefaultInstanceForType() {
      return org.tribuo.protos.core.LinearScalingTransformerProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.protos.core.LinearScalingTransformerProto build() {
      org.tribuo.protos.core.LinearScalingTransformerProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.protos.core.LinearScalingTransformerProto buildPartial() {
      org.tribuo.protos.core.LinearScalingTransformerProto result = new org.tribuo.protos.core.LinearScalingTransformerProto(this);
      result.observedMin_ = observedMin_;
      result.observedMax_ = observedMax_;
      result.targetMin_ = targetMin_;
      result.targetMax_ = targetMax_;
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
      if (other instanceof org.tribuo.protos.core.LinearScalingTransformerProto) {
        return mergeFrom((org.tribuo.protos.core.LinearScalingTransformerProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.protos.core.LinearScalingTransformerProto other) {
      if (other == org.tribuo.protos.core.LinearScalingTransformerProto.getDefaultInstance()) return this;
      if (other.getObservedMin() != 0D) {
        setObservedMin(other.getObservedMin());
      }
      if (other.getObservedMax() != 0D) {
        setObservedMax(other.getObservedMax());
      }
      if (other.getTargetMin() != 0D) {
        setTargetMin(other.getTargetMin());
      }
      if (other.getTargetMax() != 0D) {
        setTargetMax(other.getTargetMax());
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
      org.tribuo.protos.core.LinearScalingTransformerProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tribuo.protos.core.LinearScalingTransformerProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double observedMin_ ;
    /**
     * <code>double observedMin = 1;</code>
     * @return The observedMin.
     */
    @java.lang.Override
    public double getObservedMin() {
      return observedMin_;
    }
    /**
     * <code>double observedMin = 1;</code>
     * @param value The observedMin to set.
     * @return This builder for chaining.
     */
    public Builder setObservedMin(double value) {
      
      observedMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double observedMin = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearObservedMin() {
      
      observedMin_ = 0D;
      onChanged();
      return this;
    }

    private double observedMax_ ;
    /**
     * <code>double observedMax = 2;</code>
     * @return The observedMax.
     */
    @java.lang.Override
    public double getObservedMax() {
      return observedMax_;
    }
    /**
     * <code>double observedMax = 2;</code>
     * @param value The observedMax to set.
     * @return This builder for chaining.
     */
    public Builder setObservedMax(double value) {
      
      observedMax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double observedMax = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearObservedMax() {
      
      observedMax_ = 0D;
      onChanged();
      return this;
    }

    private double targetMin_ ;
    /**
     * <code>double targetMin = 3;</code>
     * @return The targetMin.
     */
    @java.lang.Override
    public double getTargetMin() {
      return targetMin_;
    }
    /**
     * <code>double targetMin = 3;</code>
     * @param value The targetMin to set.
     * @return This builder for chaining.
     */
    public Builder setTargetMin(double value) {
      
      targetMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double targetMin = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetMin() {
      
      targetMin_ = 0D;
      onChanged();
      return this;
    }

    private double targetMax_ ;
    /**
     * <code>double targetMax = 4;</code>
     * @return The targetMax.
     */
    @java.lang.Override
    public double getTargetMax() {
      return targetMax_;
    }
    /**
     * <code>double targetMax = 4;</code>
     * @param value The targetMax to set.
     * @return This builder for chaining.
     */
    public Builder setTargetMax(double value) {
      
      targetMax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double targetMax = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetMax() {
      
      targetMax_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:tribuo.core.LinearScalingTransformerProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.core.LinearScalingTransformerProto)
  private static final org.tribuo.protos.core.LinearScalingTransformerProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.protos.core.LinearScalingTransformerProto();
  }

  public static org.tribuo.protos.core.LinearScalingTransformerProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinearScalingTransformerProto>
      PARSER = new com.google.protobuf.AbstractParser<LinearScalingTransformerProto>() {
    @java.lang.Override
    public LinearScalingTransformerProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LinearScalingTransformerProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LinearScalingTransformerProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinearScalingTransformerProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.protos.core.LinearScalingTransformerProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
