// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface DecryptRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.DecryptRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] to use for decryption. The
   * server will choose the appropriate version.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] to use for decryption. The
   * server will choose the appropriate version.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The encrypted data originally returned in
   * [EncryptResponse.ciphertext][google.cloud.kms.v1.EncryptResponse.ciphertext].
   * </pre>
   *
   * <code>bytes ciphertext = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The ciphertext.
   */
  com.google.protobuf.ByteString getCiphertext();

  /**
   * <pre>
   * Optional. Optional data that must match the data originally supplied in
   * [EncryptRequest.additional_authenticated_data][google.cloud.kms.v1.EncryptRequest.additional_authenticated_data].
   * </pre>
   *
   * <code>bytes additional_authenticated_data = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The additionalAuthenticatedData.
   */
  com.google.protobuf.ByteString getAdditionalAuthenticatedData();

  /**
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext].
   * If specified,
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * verify the integrity of the received
   * [DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext]
   * using this checksum.
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext])
   * is equal to
   * [DecryptRequest.ciphertext_crc32c][google.cloud.kms.v1.DecryptRequest.ciphertext_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ciphertext_crc32c = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the ciphertextCrc32c field is set.
   */
  boolean hasCiphertextCrc32C();
  /**
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext].
   * If specified,
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * verify the integrity of the received
   * [DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext]
   * using this checksum.
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext])
   * is equal to
   * [DecryptRequest.ciphertext_crc32c][google.cloud.kms.v1.DecryptRequest.ciphertext_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ciphertext_crc32c = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ciphertextCrc32c.
   */
  com.google.protobuf.Int64Value getCiphertextCrc32C();
  /**
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext].
   * If specified,
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * verify the integrity of the received
   * [DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext]
   * using this checksum.
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([DecryptRequest.ciphertext][google.cloud.kms.v1.DecryptRequest.ciphertext])
   * is equal to
   * [DecryptRequest.ciphertext_crc32c][google.cloud.kms.v1.DecryptRequest.ciphertext_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ciphertext_crc32c = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCiphertextCrc32COrBuilder();

  /**
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
   * If specified,
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * verify the integrity of the received
   * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data]
   * using this checksum.
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data])
   * is equal to
   * [DecryptRequest.additional_authenticated_data_crc32c][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value additional_authenticated_data_crc32c = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the additionalAuthenticatedDataCrc32c field is set.
   */
  boolean hasAdditionalAuthenticatedDataCrc32C();
  /**
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
   * If specified,
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * verify the integrity of the received
   * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data]
   * using this checksum.
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data])
   * is equal to
   * [DecryptRequest.additional_authenticated_data_crc32c][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value additional_authenticated_data_crc32c = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The additionalAuthenticatedDataCrc32c.
   */
  com.google.protobuf.Int64Value getAdditionalAuthenticatedDataCrc32C();
  /**
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
   * If specified,
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * verify the integrity of the received
   * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data]
   * using this checksum.
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] will
   * report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data])
   * is equal to
   * [DecryptRequest.additional_authenticated_data_crc32c][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value additional_authenticated_data_crc32c = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAdditionalAuthenticatedDataCrc32COrBuilder();
}