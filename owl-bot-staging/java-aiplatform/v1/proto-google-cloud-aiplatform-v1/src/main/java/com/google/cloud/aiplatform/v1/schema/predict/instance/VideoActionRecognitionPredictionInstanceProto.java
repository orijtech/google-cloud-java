// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/instance/video_action_recognition.proto

package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class VideoActionRecognitionPredictionInstanceProto {
  private VideoActionRecognitionPredictionInstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQgoogle/cloud/aiplatform/v1/schema/pred" +
      "ict/instance/video_action_recognition.pr" +
      "oto\0222google.cloud.aiplatform.v1.schema.p" +
      "redict.instance\"\204\001\n(VideoActionRecogniti" +
      "onPredictionInstance\022\017\n\007content\030\001 \001(\t\022\021\n" +
      "\tmime_type\030\002 \001(\t\022\032\n\022time_segment_start\030\003" +
      " \001(\t\022\030\n\020time_segment_end\030\004 \001(\tB\352\002\n6com.g" +
      "oogle.cloud.aiplatform.v1.schema.predict" +
      ".instanceB-VideoActionRecognitionPredict" +
      "ionInstanceProtoP\001ZZgoogle.golang.org/ge" +
      "nproto/googleapis/cloud/aiplatform/v1/sc" +
      "hema/predict/instance;instance\252\0022Google." +
      "Cloud.AIPlatform.V1.Schema.Predict.Insta" +
      "nce\312\0022Google\\Cloud\\AIPlatform\\V1\\Schema\\" +
      "Predict\\Instance\352\0028Google::Cloud::AIPlat" +
      "form::V1::Schema::Predict::Instanceb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor,
        new java.lang.String[] { "Content", "MimeType", "TimeSegmentStart", "TimeSegmentEnd", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}