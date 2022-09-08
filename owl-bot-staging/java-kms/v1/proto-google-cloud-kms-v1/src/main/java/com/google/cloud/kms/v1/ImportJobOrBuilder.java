// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface ImportJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ImportJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name for this
   * [ImportJob][google.cloud.kms.v1.ImportJob] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;importJobs/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name for this
   * [ImportJob][google.cloud.kms.v1.ImportJob] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;importJobs/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Immutable. The wrapping method to be used for incoming key
   * material.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob.ImportMethod import_method = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for importMethod.
   */
  int getImportMethodValue();
  /**
   * <pre>
   * Required. Immutable. The wrapping method to be used for incoming key
   * material.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob.ImportMethod import_method = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The importMethod.
   */
  com.google.cloud.kms.v1.ImportJob.ImportMethod getImportMethod();

  /**
   * <pre>
   * Required. Immutable. The protection level of the
   * [ImportJob][google.cloud.kms.v1.ImportJob]. This must match the
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
   * of the [version_template][google.cloud.kms.v1.CryptoKey.version_template]
   * on the [CryptoKey][google.cloud.kms.v1.CryptoKey] you attempt to import
   * into.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();
  /**
   * <pre>
   * Required. Immutable. The protection level of the
   * [ImportJob][google.cloud.kms.v1.ImportJob]. This must match the
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
   * of the [version_template][google.cloud.kms.v1.CryptoKey.version_template]
   * on the [CryptoKey][google.cloud.kms.v1.CryptoKey] you attempt to import
   * into.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();

  /**
   * <pre>
   * Output only. The time at which this
   * [ImportJob][google.cloud.kms.v1.ImportJob] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which this
   * [ImportJob][google.cloud.kms.v1.ImportJob] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which this
   * [ImportJob][google.cloud.kms.v1.ImportJob] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time this [ImportJob][google.cloud.kms.v1.ImportJob]'s key
   * material was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp generate_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the generateTime field is set.
   */
  boolean hasGenerateTime();
  /**
   * <pre>
   * Output only. The time this [ImportJob][google.cloud.kms.v1.ImportJob]'s key
   * material was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp generate_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The generateTime.
   */
  com.google.protobuf.Timestamp getGenerateTime();
  /**
   * <pre>
   * Output only. The time this [ImportJob][google.cloud.kms.v1.ImportJob]'s key
   * material was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp generate_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getGenerateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time at which this
   * [ImportJob][google.cloud.kms.v1.ImportJob] is scheduled for expiration and
   * can no longer be used to import key material.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * Output only. The time at which this
   * [ImportJob][google.cloud.kms.v1.ImportJob] is scheduled for expiration and
   * can no longer be used to import key material.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   * <pre>
   * Output only. The time at which this
   * [ImportJob][google.cloud.kms.v1.ImportJob] is scheduled for expiration and
   * can no longer be used to import key material.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time this [ImportJob][google.cloud.kms.v1.ImportJob]
   * expired. Only present if [state][google.cloud.kms.v1.ImportJob.state] is
   * [EXPIRED][google.cloud.kms.v1.ImportJob.ImportJobState.EXPIRED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_event_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expireEventTime field is set.
   */
  boolean hasExpireEventTime();
  /**
   * <pre>
   * Output only. The time this [ImportJob][google.cloud.kms.v1.ImportJob]
   * expired. Only present if [state][google.cloud.kms.v1.ImportJob.state] is
   * [EXPIRED][google.cloud.kms.v1.ImportJob.ImportJobState.EXPIRED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_event_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expireEventTime.
   */
  com.google.protobuf.Timestamp getExpireEventTime();
  /**
   * <pre>
   * Output only. The time this [ImportJob][google.cloud.kms.v1.ImportJob]
   * expired. Only present if [state][google.cloud.kms.v1.ImportJob.state] is
   * [EXPIRED][google.cloud.kms.v1.ImportJob.ImportJobState.EXPIRED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_event_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireEventTimeOrBuilder();

  /**
   * <pre>
   * Output only. The current state of the
   * [ImportJob][google.cloud.kms.v1.ImportJob], indicating if it can be used.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob.ImportJobState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current state of the
   * [ImportJob][google.cloud.kms.v1.ImportJob], indicating if it can be used.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob.ImportJobState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.kms.v1.ImportJob.ImportJobState getState();

  /**
   * <pre>
   * Output only. The public key with which to wrap key material prior to
   * import. Only returned if [state][google.cloud.kms.v1.ImportJob.state] is
   * [ACTIVE][google.cloud.kms.v1.ImportJob.ImportJobState.ACTIVE].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob.WrappingPublicKey public_key = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the publicKey field is set.
   */
  boolean hasPublicKey();
  /**
   * <pre>
   * Output only. The public key with which to wrap key material prior to
   * import. Only returned if [state][google.cloud.kms.v1.ImportJob.state] is
   * [ACTIVE][google.cloud.kms.v1.ImportJob.ImportJobState.ACTIVE].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob.WrappingPublicKey public_key = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The publicKey.
   */
  com.google.cloud.kms.v1.ImportJob.WrappingPublicKey getPublicKey();
  /**
   * <pre>
   * Output only. The public key with which to wrap key material prior to
   * import. Only returned if [state][google.cloud.kms.v1.ImportJob.state] is
   * [ACTIVE][google.cloud.kms.v1.ImportJob.ImportJobState.ACTIVE].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob.WrappingPublicKey public_key = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.kms.v1.ImportJob.WrappingPublicKeyOrBuilder getPublicKeyOrBuilder();

  /**
   * <pre>
   * Output only. Statement that was generated and signed by the key creator
   * (for example, an HSM) at key creation time. Use this statement to verify
   * attributes of the key as stored on the HSM, independently of Google.
   * Only present if the chosen
   * [ImportMethod][google.cloud.kms.v1.ImportJob.ImportMethod] is one with a
   * protection level of [HSM][google.cloud.kms.v1.ProtectionLevel.HSM].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation attestation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the attestation field is set.
   */
  boolean hasAttestation();
  /**
   * <pre>
   * Output only. Statement that was generated and signed by the key creator
   * (for example, an HSM) at key creation time. Use this statement to verify
   * attributes of the key as stored on the HSM, independently of Google.
   * Only present if the chosen
   * [ImportMethod][google.cloud.kms.v1.ImportJob.ImportMethod] is one with a
   * protection level of [HSM][google.cloud.kms.v1.ProtectionLevel.HSM].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation attestation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The attestation.
   */
  com.google.cloud.kms.v1.KeyOperationAttestation getAttestation();
  /**
   * <pre>
   * Output only. Statement that was generated and signed by the key creator
   * (for example, an HSM) at key creation time. Use this statement to verify
   * attributes of the key as stored on the HSM, independently of Google.
   * Only present if the chosen
   * [ImportMethod][google.cloud.kms.v1.ImportJob.ImportMethod] is one with a
   * protection level of [HSM][google.cloud.kms.v1.ProtectionLevel.HSM].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation attestation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.kms.v1.KeyOperationAttestationOrBuilder getAttestationOrBuilder();
}