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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface ScoreMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.ScoreMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Aggregated score metrics for all traffic.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
   *
   * @return Whether the overallMetrics field is set.
   */
  boolean hasOverallMetrics();
  /**
   *
   *
   * <pre>
   * Aggregated score metrics for all traffic.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
   *
   * @return The overallMetrics.
   */
  com.google.recaptchaenterprise.v1.ScoreDistribution getOverallMetrics();
  /**
   *
   *
   * <pre>
   * Aggregated score metrics for all traffic.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
   */
  com.google.recaptchaenterprise.v1.ScoreDistributionOrBuilder getOverallMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  int getActionMetricsCount();
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  boolean containsActionMetrics(java.lang.String key);
  /** Use {@link #getActionMetricsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
      getActionMetrics();
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
      getActionMetricsMap();
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  /* nullable */
  com.google.recaptchaenterprise.v1.ScoreDistribution getActionMetricsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.recaptchaenterprise.v1.ScoreDistribution defaultValue);
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  com.google.recaptchaenterprise.v1.ScoreDistribution getActionMetricsOrThrow(java.lang.String key);
}
