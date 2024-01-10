/*
 * Copyright 2023 Google LLC
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
// source: google/shopping/css/v1/css_product_inputs.proto

package com.google.shopping.css.v1;

public interface CssProductInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.CssProductInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the CSS Product input.
   * Format:
   * `accounts/{account}/cssProductInputs/{css_product_input}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the CSS Product input.
   * Format:
   * `accounts/{account}/cssProductInputs/{css_product_input}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the processed CSS Product.
   * Format:
   * `accounts/{account}/cssProducts/{css_product}`
   * "
   * </pre>
   *
   * <code>string final_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The finalName.
   */
  java.lang.String getFinalName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the processed CSS Product.
   * Format:
   * `accounts/{account}/cssProducts/{css_product}`
   * "
   * </pre>
   *
   * <code>string final_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for finalName.
   */
  com.google.protobuf.ByteString getFinalNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Your unique identifier for the CSS Product. This is the same for
   * the CSS Product input and processed CSS Product. We only allow ids with
   * alphanumerics, underscores and dashes. See the [products feed
   * specification](https://support.google.com/merchants/answer/188494#id) for
   * details.
   * </pre>
   *
   * <code>string raw_provided_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The rawProvidedId.
   */
  java.lang.String getRawProvidedId();
  /**
   *
   *
   * <pre>
   * Required. Your unique identifier for the CSS Product. This is the same for
   * the CSS Product input and processed CSS Product. We only allow ids with
   * alphanumerics, underscores and dashes. See the [products feed
   * specification](https://support.google.com/merchants/answer/188494#id) for
   * details.
   * </pre>
   *
   * <code>string raw_provided_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for rawProvidedId.
   */
  com.google.protobuf.ByteString getRawProvidedIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The two-letter [ISO
   * 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code for the CSS
   * Product.
   * </pre>
   *
   * <code>string content_language = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The contentLanguage.
   */
  java.lang.String getContentLanguage();
  /**
   *
   *
   * <pre>
   * Required. The two-letter [ISO
   * 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code for the CSS
   * Product.
   * </pre>
   *
   * <code>string content_language = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for contentLanguage.
   */
  com.google.protobuf.ByteString getContentLanguageBytes();

  /**
   *
   *
   * <pre>
   * Required. The [feed
   * label](https://developers.google.com/shopping-content/guides/products/feed-labels)
   * for the CSS Product.
   * Feed Label is synonymous to "target country" and hence should always be a
   * valid region code. For example: 'DE' for Germany, 'FR' for France.
   * </pre>
   *
   * <code>string feed_label = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The feedLabel.
   */
  java.lang.String getFeedLabel();
  /**
   *
   *
   * <pre>
   * Required. The [feed
   * label](https://developers.google.com/shopping-content/guides/products/feed-labels)
   * for the CSS Product.
   * Feed Label is synonymous to "target country" and hence should always be a
   * valid region code. For example: 'DE' for Germany, 'FR' for France.
   * </pre>
   *
   * <code>string feed_label = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for feedLabel.
   */
  com.google.protobuf.ByteString getFeedLabelBytes();

  /**
   *
   *
   * <pre>
   * Represents the existing version (freshness) of the CSS Product, which
   * can be used to preserve the right order when multiple updates are done at
   * the same time.
   *
   * This field must not be set to the future time.
   *
   * If set, the update is prevented if a newer version of the item already
   * exists in our system (that is the last update time of the existing
   * CSS products is later than the freshness time set in the update). If
   * the update happens, the last update time is then set to this freshness
   * time.
   *
   * If not set, the update will not be prevented and the last update time will
   * default to when this request was received by the CSS API.
   *
   * If the operation is prevented, the aborted exception will be
   * thrown.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp freshness_time = 6;</code>
   *
   * @return Whether the freshnessTime field is set.
   */
  boolean hasFreshnessTime();
  /**
   *
   *
   * <pre>
   * Represents the existing version (freshness) of the CSS Product, which
   * can be used to preserve the right order when multiple updates are done at
   * the same time.
   *
   * This field must not be set to the future time.
   *
   * If set, the update is prevented if a newer version of the item already
   * exists in our system (that is the last update time of the existing
   * CSS products is later than the freshness time set in the update). If
   * the update happens, the last update time is then set to this freshness
   * time.
   *
   * If not set, the update will not be prevented and the last update time will
   * default to when this request was received by the CSS API.
   *
   * If the operation is prevented, the aborted exception will be
   * thrown.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp freshness_time = 6;</code>
   *
   * @return The freshnessTime.
   */
  com.google.protobuf.Timestamp getFreshnessTime();
  /**
   *
   *
   * <pre>
   * Represents the existing version (freshness) of the CSS Product, which
   * can be used to preserve the right order when multiple updates are done at
   * the same time.
   *
   * This field must not be set to the future time.
   *
   * If set, the update is prevented if a newer version of the item already
   * exists in our system (that is the last update time of the existing
   * CSS products is later than the freshness time set in the update). If
   * the update happens, the last update time is then set to this freshness
   * time.
   *
   * If not set, the update will not be prevented and the last update time will
   * default to when this request was received by the CSS API.
   *
   * If the operation is prevented, the aborted exception will be
   * thrown.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp freshness_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFreshnessTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of CSS Product attributes.
   * </pre>
   *
   * <code>.google.shopping.css.v1.Attributes attributes = 7;</code>
   *
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();
  /**
   *
   *
   * <pre>
   * A list of CSS Product attributes.
   * </pre>
   *
   * <code>.google.shopping.css.v1.Attributes attributes = 7;</code>
   *
   * @return The attributes.
   */
  com.google.shopping.css.v1.Attributes getAttributes();
  /**
   *
   *
   * <pre>
   * A list of CSS Product attributes.
   * </pre>
   *
   * <code>.google.shopping.css.v1.Attributes attributes = 7;</code>
   */
  com.google.shopping.css.v1.AttributesOrBuilder getAttributesOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of custom (CSS-provided) attributes. It can also be used for
   * submitting any attribute of the feed specification in its generic
   * form (for example:
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 8;</code>
   */
  java.util.List<com.google.shopping.type.CustomAttribute> getCustomAttributesList();
  /**
   *
   *
   * <pre>
   * A list of custom (CSS-provided) attributes. It can also be used for
   * submitting any attribute of the feed specification in its generic
   * form (for example:
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 8;</code>
   */
  com.google.shopping.type.CustomAttribute getCustomAttributes(int index);
  /**
   *
   *
   * <pre>
   * A list of custom (CSS-provided) attributes. It can also be used for
   * submitting any attribute of the feed specification in its generic
   * form (for example:
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 8;</code>
   */
  int getCustomAttributesCount();
  /**
   *
   *
   * <pre>
   * A list of custom (CSS-provided) attributes. It can also be used for
   * submitting any attribute of the feed specification in its generic
   * form (for example:
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 8;</code>
   */
  java.util.List<? extends com.google.shopping.type.CustomAttributeOrBuilder>
      getCustomAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of custom (CSS-provided) attributes. It can also be used for
   * submitting any attribute of the feed specification in its generic
   * form (for example:
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 8;</code>
   */
  com.google.shopping.type.CustomAttributeOrBuilder getCustomAttributesOrBuilder(int index);
}
