/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/video_action_recognition.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class VideoActionRecognitionPredictionResultProto {
  private VideoActionRecognitionPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoActionRecognitionPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoActionRecognitionPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nXgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/prediction/video_action_recogni"
          + "tion.proto\0229google.cloud.aiplatform.v1be"
          + "ta1.schema.predict.prediction\032\036google/pr"
          + "otobuf/duration.proto\032\036google/protobuf/w"
          + "rappers.proto\"\347\001\n&VideoActionRecognition"
          + "PredictionResult\022\n\n\002id\030\001 \001(\t\022\024\n\014display_"
          + "name\030\002 \001(\t\0225\n\022time_segment_start\030\004 \001(\0132\031"
          + ".google.protobuf.Duration\0223\n\020time_segmen"
          + "t_end\030\005 \001(\0132\031.google.protobuf.Duration\022/"
          + "\n\nconfidence\030\006 \001(\0132\033.google.protobuf.Flo"
          + "atValueB\207\003\n=com.google.cloud.aiplatform."
          + "v1beta1.schema.predict.predictionB+Video"
          + "ActionRecognitionPredictionResultProtoP\001"
          + "Z]cloud.google.com/go/aiplatform/apiv1be"
          + "ta1/schema/predict/prediction/prediction"
          + "pb;predictionpb\252\0029Google.Cloud.AIPlatfor"
          + "m.V1Beta1.Schema.Predict.Prediction\312\0029Go"
          + "ogle\\Cloud\\AIPlatform\\V1beta1\\Schema\\Pre"
          + "dict\\Prediction\352\002?Google::Cloud::AIPlatf"
          + "orm::V1beta1::Schema::Predict::Predictio"
          + "nb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoActionRecognitionPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoActionRecognitionPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoActionRecognitionPredictionResult_descriptor,
            new java.lang.String[] {
              "Id", "DisplayName", "TimeSegmentStart", "TimeSegmentEnd", "Confidence",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
