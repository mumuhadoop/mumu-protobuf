// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.lovecws.mumu.protobuf.user;

/**
 * <pre>
 *用户信息
 * </pre>
 *
 * Protobuf type {@code com.lovecws.mumu.protobuf.user.AppUser}
 */
public  final class AppUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.lovecws.mumu.protobuf.user.AppUser)
    AppUserOrBuilder {
  // Use AppUser.newBuilder() to construct.
  private AppUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppUser() {
    userId_ = 0L;
    userName_ = "";
    userPassword_ = "";
    sexType_ = 0;
    userPhone_ = "";
    userEmail_ = "";
    userBirthday_ = "";
    userArea_ = 0L;
    sign_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AppUser(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            userId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userPassword_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            sexType_ = rawValue;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            userPhone_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            userEmail_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            userBirthday_ = s;
            break;
          }
          case 64: {

            userArea_ = input.readInt64();
            break;
          }
          case 74: {
            java.lang.String s = input.readStringRequireUtf8();

            sign_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lovecws.mumu.protobuf.user.User.internal_static_com_lovecws_mumu_protobuf_user_AppUser_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lovecws.mumu.protobuf.user.User.internal_static_com_lovecws_mumu_protobuf_user_AppUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lovecws.mumu.protobuf.user.AppUser.class, com.lovecws.mumu.protobuf.user.AppUser.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private long userId_;
  /**
   * <code>int64 userId = 1;</code>
   */
  public long getUserId() {
    return userId_;
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object userName_;
  /**
   * <code>string userName = 2;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERPASSWORD_FIELD_NUMBER = 3;
  private volatile java.lang.Object userPassword_;
  /**
   * <code>string userPassword = 3;</code>
   */
  public java.lang.String getUserPassword() {
    java.lang.Object ref = userPassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userPassword_ = s;
      return s;
    }
  }
  /**
   * <code>string userPassword = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserPasswordBytes() {
    java.lang.Object ref = userPassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userPassword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEXTYPE_FIELD_NUMBER = 4;
  private int sexType_;
  /**
   * <code>.com.lovecws.mumu.protobuf.user.SexType sexType = 4;</code>
   */
  public int getSexTypeValue() {
    return sexType_;
  }
  /**
   * <code>.com.lovecws.mumu.protobuf.user.SexType sexType = 4;</code>
   */
  public com.lovecws.mumu.protobuf.user.SexType getSexType() {
    com.lovecws.mumu.protobuf.user.SexType result = com.lovecws.mumu.protobuf.user.SexType.valueOf(sexType_);
    return result == null ? com.lovecws.mumu.protobuf.user.SexType.UNRECOGNIZED : result;
  }

  public static final int USERPHONE_FIELD_NUMBER = 5;
  private volatile java.lang.Object userPhone_;
  /**
   * <code>string userPhone = 5;</code>
   */
  public java.lang.String getUserPhone() {
    java.lang.Object ref = userPhone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userPhone_ = s;
      return s;
    }
  }
  /**
   * <code>string userPhone = 5;</code>
   */
  public com.google.protobuf.ByteString
      getUserPhoneBytes() {
    java.lang.Object ref = userPhone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userPhone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USEREMAIL_FIELD_NUMBER = 6;
  private volatile java.lang.Object userEmail_;
  /**
   * <code>string userEmail = 6;</code>
   */
  public java.lang.String getUserEmail() {
    java.lang.Object ref = userEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string userEmail = 6;</code>
   */
  public com.google.protobuf.ByteString
      getUserEmailBytes() {
    java.lang.Object ref = userEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERBIRTHDAY_FIELD_NUMBER = 7;
  private volatile java.lang.Object userBirthday_;
  /**
   * <code>string userBirthday = 7;</code>
   */
  public java.lang.String getUserBirthday() {
    java.lang.Object ref = userBirthday_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userBirthday_ = s;
      return s;
    }
  }
  /**
   * <code>string userBirthday = 7;</code>
   */
  public com.google.protobuf.ByteString
      getUserBirthdayBytes() {
    java.lang.Object ref = userBirthday_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userBirthday_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERAREA_FIELD_NUMBER = 8;
  private long userArea_;
  /**
   * <code>int64 userArea = 8;</code>
   */
  public long getUserArea() {
    return userArea_;
  }

  public static final int SIGN_FIELD_NUMBER = 9;
  private volatile java.lang.Object sign_;
  /**
   * <code>string sign = 9;</code>
   */
  public java.lang.String getSign() {
    java.lang.Object ref = sign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sign_ = s;
      return s;
    }
  }
  /**
   * <code>string sign = 9;</code>
   */
  public com.google.protobuf.ByteString
      getSignBytes() {
    java.lang.Object ref = sign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userId_ != 0L) {
      output.writeInt64(1, userId_);
    }
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userName_);
    }
    if (!getUserPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userPassword_);
    }
    if (sexType_ != com.lovecws.mumu.protobuf.user.SexType.MALE.getNumber()) {
      output.writeEnum(4, sexType_);
    }
    if (!getUserPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, userPhone_);
    }
    if (!getUserEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, userEmail_);
    }
    if (!getUserBirthdayBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, userBirthday_);
    }
    if (userArea_ != 0L) {
      output.writeInt64(8, userArea_);
    }
    if (!getSignBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, sign_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, userId_);
    }
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userName_);
    }
    if (!getUserPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userPassword_);
    }
    if (sexType_ != com.lovecws.mumu.protobuf.user.SexType.MALE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, sexType_);
    }
    if (!getUserPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, userPhone_);
    }
    if (!getUserEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, userEmail_);
    }
    if (!getUserBirthdayBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, userBirthday_);
    }
    if (userArea_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, userArea_);
    }
    if (!getSignBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, sign_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.lovecws.mumu.protobuf.user.AppUser)) {
      return super.equals(obj);
    }
    com.lovecws.mumu.protobuf.user.AppUser other = (com.lovecws.mumu.protobuf.user.AppUser) obj;

    boolean result = true;
    result = result && (getUserId()
        == other.getUserId());
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && getUserPassword()
        .equals(other.getUserPassword());
    result = result && sexType_ == other.sexType_;
    result = result && getUserPhone()
        .equals(other.getUserPhone());
    result = result && getUserEmail()
        .equals(other.getUserEmail());
    result = result && getUserBirthday()
        .equals(other.getUserBirthday());
    result = result && (getUserArea()
        == other.getUserArea());
    result = result && getSign()
        .equals(other.getSign());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserId());
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + USERPASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getUserPassword().hashCode();
    hash = (37 * hash) + SEXTYPE_FIELD_NUMBER;
    hash = (53 * hash) + sexType_;
    hash = (37 * hash) + USERPHONE_FIELD_NUMBER;
    hash = (53 * hash) + getUserPhone().hashCode();
    hash = (37 * hash) + USEREMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getUserEmail().hashCode();
    hash = (37 * hash) + USERBIRTHDAY_FIELD_NUMBER;
    hash = (53 * hash) + getUserBirthday().hashCode();
    hash = (37 * hash) + USERAREA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserArea());
    hash = (37 * hash) + SIGN_FIELD_NUMBER;
    hash = (53 * hash) + getSign().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lovecws.mumu.protobuf.user.AppUser parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lovecws.mumu.protobuf.user.AppUser prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   *用户信息
   * </pre>
   *
   * Protobuf type {@code com.lovecws.mumu.protobuf.user.AppUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.lovecws.mumu.protobuf.user.AppUser)
      com.lovecws.mumu.protobuf.user.AppUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lovecws.mumu.protobuf.user.User.internal_static_com_lovecws_mumu_protobuf_user_AppUser_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lovecws.mumu.protobuf.user.User.internal_static_com_lovecws_mumu_protobuf_user_AppUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lovecws.mumu.protobuf.user.AppUser.class, com.lovecws.mumu.protobuf.user.AppUser.Builder.class);
    }

    // Construct using com.lovecws.mumu.protobuf.user.AppUser.newBuilder()
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
    public Builder clear() {
      super.clear();
      userId_ = 0L;

      userName_ = "";

      userPassword_ = "";

      sexType_ = 0;

      userPhone_ = "";

      userEmail_ = "";

      userBirthday_ = "";

      userArea_ = 0L;

      sign_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lovecws.mumu.protobuf.user.User.internal_static_com_lovecws_mumu_protobuf_user_AppUser_descriptor;
    }

    public com.lovecws.mumu.protobuf.user.AppUser getDefaultInstanceForType() {
      return com.lovecws.mumu.protobuf.user.AppUser.getDefaultInstance();
    }

    public com.lovecws.mumu.protobuf.user.AppUser build() {
      com.lovecws.mumu.protobuf.user.AppUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lovecws.mumu.protobuf.user.AppUser buildPartial() {
      com.lovecws.mumu.protobuf.user.AppUser result = new com.lovecws.mumu.protobuf.user.AppUser(this);
      result.userId_ = userId_;
      result.userName_ = userName_;
      result.userPassword_ = userPassword_;
      result.sexType_ = sexType_;
      result.userPhone_ = userPhone_;
      result.userEmail_ = userEmail_;
      result.userBirthday_ = userBirthday_;
      result.userArea_ = userArea_;
      result.sign_ = sign_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lovecws.mumu.protobuf.user.AppUser) {
        return mergeFrom((com.lovecws.mumu.protobuf.user.AppUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lovecws.mumu.protobuf.user.AppUser other) {
      if (other == com.lovecws.mumu.protobuf.user.AppUser.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getUserPassword().isEmpty()) {
        userPassword_ = other.userPassword_;
        onChanged();
      }
      if (other.sexType_ != 0) {
        setSexTypeValue(other.getSexTypeValue());
      }
      if (!other.getUserPhone().isEmpty()) {
        userPhone_ = other.userPhone_;
        onChanged();
      }
      if (!other.getUserEmail().isEmpty()) {
        userEmail_ = other.userEmail_;
        onChanged();
      }
      if (!other.getUserBirthday().isEmpty()) {
        userBirthday_ = other.userBirthday_;
        onChanged();
      }
      if (other.getUserArea() != 0L) {
        setUserArea(other.getUserArea());
      }
      if (!other.getSign().isEmpty()) {
        sign_ = other.sign_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.lovecws.mumu.protobuf.user.AppUser parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lovecws.mumu.protobuf.user.AppUser) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long userId_ ;
    /**
     * <code>int64 userId = 1;</code>
     */
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>int64 userId = 1;</code>
     */
    public Builder setUserId(long value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userId = 1;</code>
     */
    public Builder clearUserId() {
      
      userId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string userName = 2;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 2;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 2;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 2;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userPassword_ = "";
    /**
     * <code>string userPassword = 3;</code>
     */
    public java.lang.String getUserPassword() {
      java.lang.Object ref = userPassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userPassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userPassword = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserPasswordBytes() {
      java.lang.Object ref = userPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userPassword = 3;</code>
     */
    public Builder setUserPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userPassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userPassword = 3;</code>
     */
    public Builder clearUserPassword() {
      
      userPassword_ = getDefaultInstance().getUserPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string userPassword = 3;</code>
     */
    public Builder setUserPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userPassword_ = value;
      onChanged();
      return this;
    }

    private int sexType_ = 0;
    /**
     * <code>.com.lovecws.mumu.protobuf.user.SexType sexType = 4;</code>
     */
    public int getSexTypeValue() {
      return sexType_;
    }
    /**
     * <code>.com.lovecws.mumu.protobuf.user.SexType sexType = 4;</code>
     */
    public Builder setSexTypeValue(int value) {
      sexType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.lovecws.mumu.protobuf.user.SexType sexType = 4;</code>
     */
    public com.lovecws.mumu.protobuf.user.SexType getSexType() {
      com.lovecws.mumu.protobuf.user.SexType result = com.lovecws.mumu.protobuf.user.SexType.valueOf(sexType_);
      return result == null ? com.lovecws.mumu.protobuf.user.SexType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.lovecws.mumu.protobuf.user.SexType sexType = 4;</code>
     */
    public Builder setSexType(com.lovecws.mumu.protobuf.user.SexType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sexType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.lovecws.mumu.protobuf.user.SexType sexType = 4;</code>
     */
    public Builder clearSexType() {
      
      sexType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object userPhone_ = "";
    /**
     * <code>string userPhone = 5;</code>
     */
    public java.lang.String getUserPhone() {
      java.lang.Object ref = userPhone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userPhone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userPhone = 5;</code>
     */
    public com.google.protobuf.ByteString
        getUserPhoneBytes() {
      java.lang.Object ref = userPhone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userPhone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userPhone = 5;</code>
     */
    public Builder setUserPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userPhone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userPhone = 5;</code>
     */
    public Builder clearUserPhone() {
      
      userPhone_ = getDefaultInstance().getUserPhone();
      onChanged();
      return this;
    }
    /**
     * <code>string userPhone = 5;</code>
     */
    public Builder setUserPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userPhone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userEmail_ = "";
    /**
     * <code>string userEmail = 6;</code>
     */
    public java.lang.String getUserEmail() {
      java.lang.Object ref = userEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userEmail = 6;</code>
     */
    public com.google.protobuf.ByteString
        getUserEmailBytes() {
      java.lang.Object ref = userEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userEmail = 6;</code>
     */
    public Builder setUserEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userEmail = 6;</code>
     */
    public Builder clearUserEmail() {
      
      userEmail_ = getDefaultInstance().getUserEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string userEmail = 6;</code>
     */
    public Builder setUserEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userEmail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userBirthday_ = "";
    /**
     * <code>string userBirthday = 7;</code>
     */
    public java.lang.String getUserBirthday() {
      java.lang.Object ref = userBirthday_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userBirthday_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userBirthday = 7;</code>
     */
    public com.google.protobuf.ByteString
        getUserBirthdayBytes() {
      java.lang.Object ref = userBirthday_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userBirthday_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userBirthday = 7;</code>
     */
    public Builder setUserBirthday(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userBirthday_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userBirthday = 7;</code>
     */
    public Builder clearUserBirthday() {
      
      userBirthday_ = getDefaultInstance().getUserBirthday();
      onChanged();
      return this;
    }
    /**
     * <code>string userBirthday = 7;</code>
     */
    public Builder setUserBirthdayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userBirthday_ = value;
      onChanged();
      return this;
    }

    private long userArea_ ;
    /**
     * <code>int64 userArea = 8;</code>
     */
    public long getUserArea() {
      return userArea_;
    }
    /**
     * <code>int64 userArea = 8;</code>
     */
    public Builder setUserArea(long value) {
      
      userArea_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userArea = 8;</code>
     */
    public Builder clearUserArea() {
      
      userArea_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object sign_ = "";
    /**
     * <code>string sign = 9;</code>
     */
    public java.lang.String getSign() {
      java.lang.Object ref = sign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sign = 9;</code>
     */
    public com.google.protobuf.ByteString
        getSignBytes() {
      java.lang.Object ref = sign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sign = 9;</code>
     */
    public Builder setSign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sign_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sign = 9;</code>
     */
    public Builder clearSign() {
      
      sign_ = getDefaultInstance().getSign();
      onChanged();
      return this;
    }
    /**
     * <code>string sign = 9;</code>
     */
    public Builder setSignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sign_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.lovecws.mumu.protobuf.user.AppUser)
  }

  // @@protoc_insertion_point(class_scope:com.lovecws.mumu.protobuf.user.AppUser)
  private static final com.lovecws.mumu.protobuf.user.AppUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lovecws.mumu.protobuf.user.AppUser();
  }

  public static com.lovecws.mumu.protobuf.user.AppUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppUser>
      PARSER = new com.google.protobuf.AbstractParser<AppUser>() {
    public AppUser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AppUser(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppUser> getParserForType() {
    return PARSER;
  }

  public com.lovecws.mumu.protobuf.user.AppUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

