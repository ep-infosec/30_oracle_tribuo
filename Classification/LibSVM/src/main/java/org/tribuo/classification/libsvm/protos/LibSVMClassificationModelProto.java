// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-classification-libsvm.proto

package org.tribuo.classification.libsvm.protos;

/**
 * <pre>
 *LibSVMClassificationModel proto
 * </pre>
 *
 * Protobuf type {@code tribuo.classification.libsvm.LibSVMClassificationModelProto}
 */
public final class LibSVMClassificationModelProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.classification.libsvm.LibSVMClassificationModelProto)
    LibSVMClassificationModelProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LibSVMClassificationModelProto.newBuilder() to construct.
  private LibSVMClassificationModelProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LibSVMClassificationModelProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LibSVMClassificationModelProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LibSVMClassificationModelProto(
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
            org.tribuo.common.libsvm.protos.SVMModelProto.Builder subBuilder = null;
            if (model_ != null) {
              subBuilder = model_.toBuilder();
            }
            model_ = input.readMessage(org.tribuo.common.libsvm.protos.SVMModelProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(model_);
              model_ = subBuilder.buildPartial();
            }

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
    return org.tribuo.classification.libsvm.protos.TribuoClassificationLibsvm.internal_static_tribuo_classification_libsvm_LibSVMClassificationModelProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.classification.libsvm.protos.TribuoClassificationLibsvm.internal_static_tribuo_classification_libsvm_LibSVMClassificationModelProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto.class, org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto.Builder.class);
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

  public static final int MODEL_FIELD_NUMBER = 2;
  private org.tribuo.common.libsvm.protos.SVMModelProto model_;
  /**
   * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
   * @return The model.
   */
  @java.lang.Override
  public org.tribuo.common.libsvm.protos.SVMModelProto getModel() {
    return model_ == null ? org.tribuo.common.libsvm.protos.SVMModelProto.getDefaultInstance() : model_;
  }
  /**
   * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
   */
  @java.lang.Override
  public org.tribuo.common.libsvm.protos.SVMModelProtoOrBuilder getModelOrBuilder() {
    return getModel();
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
    if (model_ != null) {
      output.writeMessage(2, getModel());
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
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModel());
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
    if (!(obj instanceof org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto)) {
      return super.equals(obj);
    }
    org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto other = (org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
    }
    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel()
          .equals(other.getModel())) return false;
    }
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
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parseFrom(
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
  public static Builder newBuilder(org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto prototype) {
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
   *LibSVMClassificationModel proto
   * </pre>
   *
   * Protobuf type {@code tribuo.classification.libsvm.LibSVMClassificationModelProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.classification.libsvm.LibSVMClassificationModelProto)
      org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.classification.libsvm.protos.TribuoClassificationLibsvm.internal_static_tribuo_classification_libsvm_LibSVMClassificationModelProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.classification.libsvm.protos.TribuoClassificationLibsvm.internal_static_tribuo_classification_libsvm_LibSVMClassificationModelProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto.class, org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto.Builder.class);
    }

    // Construct using org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto.newBuilder()
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
      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.classification.libsvm.protos.TribuoClassificationLibsvm.internal_static_tribuo_classification_libsvm_LibSVMClassificationModelProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto getDefaultInstanceForType() {
      return org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto build() {
      org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto buildPartial() {
      org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto result = new org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto(this);
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
      }
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
      if (other instanceof org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto) {
        return mergeFrom((org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto other) {
      if (other == org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
      }
      if (other.hasModel()) {
        mergeModel(other.getModel());
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
      org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private org.tribuo.common.libsvm.protos.SVMModelProto model_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.common.libsvm.protos.SVMModelProto, org.tribuo.common.libsvm.protos.SVMModelProto.Builder, org.tribuo.common.libsvm.protos.SVMModelProtoOrBuilder> modelBuilder_;
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     * @return The model.
     */
    public org.tribuo.common.libsvm.protos.SVMModelProto getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? org.tribuo.common.libsvm.protos.SVMModelProto.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     */
    public Builder setModel(org.tribuo.common.libsvm.protos.SVMModelProto value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     */
    public Builder setModel(
        org.tribuo.common.libsvm.protos.SVMModelProto.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     */
    public Builder mergeModel(org.tribuo.common.libsvm.protos.SVMModelProto value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
            org.tribuo.common.libsvm.protos.SVMModelProto.newBuilder(model_).mergeFrom(value).buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     */
    public org.tribuo.common.libsvm.protos.SVMModelProto.Builder getModelBuilder() {
      
      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     */
    public org.tribuo.common.libsvm.protos.SVMModelProtoOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ?
            org.tribuo.common.libsvm.protos.SVMModelProto.getDefaultInstance() : model_;
      }
    }
    /**
     * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tribuo.common.libsvm.protos.SVMModelProto, org.tribuo.common.libsvm.protos.SVMModelProto.Builder, org.tribuo.common.libsvm.protos.SVMModelProtoOrBuilder> 
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tribuo.common.libsvm.protos.SVMModelProto, org.tribuo.common.libsvm.protos.SVMModelProto.Builder, org.tribuo.common.libsvm.protos.SVMModelProtoOrBuilder>(
                getModel(),
                getParentForChildren(),
                isClean());
        model_ = null;
      }
      return modelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tribuo.classification.libsvm.LibSVMClassificationModelProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.classification.libsvm.LibSVMClassificationModelProto)
  private static final org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto();
  }

  public static org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LibSVMClassificationModelProto>
      PARSER = new com.google.protobuf.AbstractParser<LibSVMClassificationModelProto>() {
    @java.lang.Override
    public LibSVMClassificationModelProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LibSVMClassificationModelProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LibSVMClassificationModelProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LibSVMClassificationModelProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.classification.libsvm.protos.LibSVMClassificationModelProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

