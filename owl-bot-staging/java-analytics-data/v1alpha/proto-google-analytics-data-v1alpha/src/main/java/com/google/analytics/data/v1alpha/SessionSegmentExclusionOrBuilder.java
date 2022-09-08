// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface SessionSegmentExclusionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.SessionSegmentExclusion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies how long an exclusion will last if a session matches the
   * `sessionExclusionCriteria`.
   * Optional. If unspecified, a `sessionExclusionDuration` of
   * `SESSION_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;</code>
   * @return The enum numeric value on the wire for sessionExclusionDuration.
   */
  int getSessionExclusionDurationValue();
  /**
   * <pre>
   * Specifies how long an exclusion will last if a session matches the
   * `sessionExclusionCriteria`.
   * Optional. If unspecified, a `sessionExclusionDuration` of
   * `SESSION_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;</code>
   * @return The sessionExclusionDuration.
   */
  com.google.analytics.data.v1alpha.SessionExclusionDuration getSessionExclusionDuration();

  /**
   * <pre>
   * If a session meets this condition, the session is excluded from
   * membership in the segment for the `sessionExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;</code>
   * @return Whether the sessionExclusionCriteria field is set.
   */
  boolean hasSessionExclusionCriteria();
  /**
   * <pre>
   * If a session meets this condition, the session is excluded from
   * membership in the segment for the `sessionExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;</code>
   * @return The sessionExclusionCriteria.
   */
  com.google.analytics.data.v1alpha.SessionSegmentCriteria getSessionExclusionCriteria();
  /**
   * <pre>
   * If a session meets this condition, the session is excluded from
   * membership in the segment for the `sessionExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;</code>
   */
  com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder getSessionExclusionCriteriaOrBuilder();
}