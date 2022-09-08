// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public interface UpdateSshPublicKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The fingerprint of the public key to update. Public keys are identified by
   * their SHA-256 fingerprint. The fingerprint of the public key is in format
   * `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The fingerprint of the public key to update. Public keys are identified by
   * their SHA-256 fingerprint. The fingerprint of the public key is in format
   * `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the sshPublicKey field is set.
   */
  boolean hasSshPublicKey();
  /**
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sshPublicKey.
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey();
  /**
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder();

  /**
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}