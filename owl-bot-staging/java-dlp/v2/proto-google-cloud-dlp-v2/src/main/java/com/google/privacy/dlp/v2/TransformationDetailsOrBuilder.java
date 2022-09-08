// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface TransformationDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TransformationDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the job that completed the transformation.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The name of the job that completed the transformation.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The top level name of the container where the transformation is located
   * (this will be the source file name or table name).
   * </pre>
   *
   * <code>string container_name = 2;</code>
   * @return The containerName.
   */
  java.lang.String getContainerName();
  /**
   * <pre>
   * The top level name of the container where the transformation is located
   * (this will be the source file name or table name).
   * </pre>
   *
   * <code>string container_name = 2;</code>
   * @return The bytes for containerName.
   */
  com.google.protobuf.ByteString
      getContainerNameBytes();

  /**
   * <pre>
   * Description of transformation. This would only contain more than one
   * element if there were multiple matching transformations and which one to
   * apply was ambiguous. Not set for states that contain no transformation,
   * currently only state that contains no transformation is
   * TransformationResultStateType.METADATA_UNRETRIEVABLE.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationDescription transformation = 3;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.TransformationDescription> 
      getTransformationList();
  /**
   * <pre>
   * Description of transformation. This would only contain more than one
   * element if there were multiple matching transformations and which one to
   * apply was ambiguous. Not set for states that contain no transformation,
   * currently only state that contains no transformation is
   * TransformationResultStateType.METADATA_UNRETRIEVABLE.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationDescription transformation = 3;</code>
   */
  com.google.privacy.dlp.v2.TransformationDescription getTransformation(int index);
  /**
   * <pre>
   * Description of transformation. This would only contain more than one
   * element if there were multiple matching transformations and which one to
   * apply was ambiguous. Not set for states that contain no transformation,
   * currently only state that contains no transformation is
   * TransformationResultStateType.METADATA_UNRETRIEVABLE.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationDescription transformation = 3;</code>
   */
  int getTransformationCount();
  /**
   * <pre>
   * Description of transformation. This would only contain more than one
   * element if there were multiple matching transformations and which one to
   * apply was ambiguous. Not set for states that contain no transformation,
   * currently only state that contains no transformation is
   * TransformationResultStateType.METADATA_UNRETRIEVABLE.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationDescription transformation = 3;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.TransformationDescriptionOrBuilder> 
      getTransformationOrBuilderList();
  /**
   * <pre>
   * Description of transformation. This would only contain more than one
   * element if there were multiple matching transformations and which one to
   * apply was ambiguous. Not set for states that contain no transformation,
   * currently only state that contains no transformation is
   * TransformationResultStateType.METADATA_UNRETRIEVABLE.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationDescription transformation = 3;</code>
   */
  com.google.privacy.dlp.v2.TransformationDescriptionOrBuilder getTransformationOrBuilder(
      int index);

  /**
   * <pre>
   * Status of the transformation, if transformation was not successful, this
   * will specify what caused it to fail, otherwise it will show that the
   * transformation was successful.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationResultStatus status_details = 4;</code>
   * @return Whether the statusDetails field is set.
   */
  boolean hasStatusDetails();
  /**
   * <pre>
   * Status of the transformation, if transformation was not successful, this
   * will specify what caused it to fail, otherwise it will show that the
   * transformation was successful.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationResultStatus status_details = 4;</code>
   * @return The statusDetails.
   */
  com.google.privacy.dlp.v2.TransformationResultStatus getStatusDetails();
  /**
   * <pre>
   * Status of the transformation, if transformation was not successful, this
   * will specify what caused it to fail, otherwise it will show that the
   * transformation was successful.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationResultStatus status_details = 4;</code>
   */
  com.google.privacy.dlp.v2.TransformationResultStatusOrBuilder getStatusDetailsOrBuilder();

  /**
   * <pre>
   * The number of bytes that were transformed. If transformation was
   * unsuccessful or did not take place because there was no content to
   * transform, this will be zero.
   * </pre>
   *
   * <code>int64 transformed_bytes = 5;</code>
   * @return The transformedBytes.
   */
  long getTransformedBytes();

  /**
   * <pre>
   * The precise location of the transformed content in the original container.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationLocation transformation_location = 6;</code>
   * @return Whether the transformationLocation field is set.
   */
  boolean hasTransformationLocation();
  /**
   * <pre>
   * The precise location of the transformed content in the original container.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationLocation transformation_location = 6;</code>
   * @return The transformationLocation.
   */
  com.google.privacy.dlp.v2.TransformationLocation getTransformationLocation();
  /**
   * <pre>
   * The precise location of the transformed content in the original container.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationLocation transformation_location = 6;</code>
   */
  com.google.privacy.dlp.v2.TransformationLocationOrBuilder getTransformationLocationOrBuilder();
}