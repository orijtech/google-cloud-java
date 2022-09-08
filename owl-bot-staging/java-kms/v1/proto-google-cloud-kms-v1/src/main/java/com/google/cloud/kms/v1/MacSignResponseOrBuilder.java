// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface MacSignResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.MacSignResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for signing.
   * Check this field to verify that the intended resource was used for signing.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for signing.
   * Check this field to verify that the intended resource was used for signing.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The created signature.
   * </pre>
   *
   * <code>bytes mac = 2;</code>
   * @return The mac.
   */
  com.google.protobuf.ByteString getMac();

  /**
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac]. An
   * integrity check of
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac] can be
   * performed by computing the CRC32C checksum of
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac] and
   * comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value mac_crc32c = 3;</code>
   * @return Whether the macCrc32c field is set.
   */
  boolean hasMacCrc32C();
  /**
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac]. An
   * integrity check of
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac] can be
   * performed by computing the CRC32C checksum of
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac] and
   * comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value mac_crc32c = 3;</code>
   * @return The macCrc32c.
   */
  com.google.protobuf.Int64Value getMacCrc32C();
  /**
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac]. An
   * integrity check of
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac] can be
   * performed by computing the CRC32C checksum of
   * [MacSignResponse.mac][google.cloud.kms.v1.MacSignResponse.mac] and
   * comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value mac_crc32c = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMacCrc32COrBuilder();

  /**
   * <pre>
   * Integrity verification field. A flag indicating whether
   * [MacSignRequest.data_crc32c][google.cloud.kms.v1.MacSignRequest.data_crc32c]
   * was received by
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] and used
   * for the integrity verification of the
   * [data][google.cloud.kms.v1.MacSignRequest.data]. A false value of this
   * field indicates either that
   * [MacSignRequest.data_crc32c][google.cloud.kms.v1.MacSignRequest.data_crc32c]
   * was left unset or that it was not delivered to
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService]. If you've
   * set
   * [MacSignRequest.data_crc32c][google.cloud.kms.v1.MacSignRequest.data_crc32c]
   * but this field is still false, discard the response and perform a limited
   * number of retries.
   * </pre>
   *
   * <code>bool verified_data_crc32c = 4;</code>
   * @return The verifiedDataCrc32c.
   */
  boolean getVerifiedDataCrc32C();

  /**
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for signing.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 5;</code>
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();
  /**
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for signing.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 5;</code>
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();
}