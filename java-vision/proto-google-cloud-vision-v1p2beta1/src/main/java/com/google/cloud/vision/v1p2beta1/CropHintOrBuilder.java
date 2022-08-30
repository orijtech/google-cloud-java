/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

package com.google.cloud.vision.v1p2beta1;

public interface CropHintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.CropHint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_poly = 1;</code>
   *
   * @return Whether the boundingPoly field is set.
   */
  boolean hasBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_poly = 1;</code>
   *
   * @return The boundingPoly.
   */
  com.google.cloud.vision.v1p2beta1.BoundingPoly getBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_poly = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * Confidence of this being a salient region.  Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   *
   * @return The confidence.
   */
  float getConfidence();

  /**
   *
   *
   * <pre>
   * Fraction of importance of this salient region with respect to the original
   * image.
   * </pre>
   *
   * <code>float importance_fraction = 3;</code>
   *
   * @return The importanceFraction.
   */
  float getImportanceFraction();
}