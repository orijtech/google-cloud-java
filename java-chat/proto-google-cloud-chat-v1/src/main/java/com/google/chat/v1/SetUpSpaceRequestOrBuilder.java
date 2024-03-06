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
// source: google/chat/v1/space_setup.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public interface SetUpSpaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.SetUpSpaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `Space.spaceType` field is required.
   *
   * To create a space, set `Space.spaceType` to `SPACE` and set
   * `Space.displayName`. If you receive the error message `ALREADY_EXISTS` when
   * setting up a space, try a different `displayName`. An existing space
   * within the Google Workspace organization might already use this display
   * name.
   *
   * To create a group chat, set `Space.spaceType` to
   * `GROUP_CHAT`. Don't set `Space.displayName`.
   *
   * To create a 1:1 conversation between humans,
   * set `Space.spaceType` to `DIRECT_MESSAGE` and set
   * `Space.singleUserBotDm` to `false`. Don't set `Space.displayName` or
   * `Space.spaceDetails`.
   *
   * To create an 1:1 conversation between a human and the calling Chat app, set
   * `Space.spaceType` to `DIRECT_MESSAGE` and
   * `Space.singleUserBotDm` to `true`. Don't set `Space.displayName` or
   * `Space.spaceDetails`.
   *
   * If a `DIRECT_MESSAGE` space already exists, that space is returned instead
   * of creating a new space.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the space field is set.
   */
  boolean hasSpace();
  /**
   *
   *
   * <pre>
   * Required. The `Space.spaceType` field is required.
   *
   * To create a space, set `Space.spaceType` to `SPACE` and set
   * `Space.displayName`. If you receive the error message `ALREADY_EXISTS` when
   * setting up a space, try a different `displayName`. An existing space
   * within the Google Workspace organization might already use this display
   * name.
   *
   * To create a group chat, set `Space.spaceType` to
   * `GROUP_CHAT`. Don't set `Space.displayName`.
   *
   * To create a 1:1 conversation between humans,
   * set `Space.spaceType` to `DIRECT_MESSAGE` and set
   * `Space.singleUserBotDm` to `false`. Don't set `Space.displayName` or
   * `Space.spaceDetails`.
   *
   * To create an 1:1 conversation between a human and the calling Chat app, set
   * `Space.spaceType` to `DIRECT_MESSAGE` and
   * `Space.singleUserBotDm` to `true`. Don't set `Space.displayName` or
   * `Space.spaceDetails`.
   *
   * If a `DIRECT_MESSAGE` space already exists, that space is returned instead
   * of creating a new space.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The space.
   */
  com.google.chat.v1.Space getSpace();
  /**
   *
   *
   * <pre>
   * Required. The `Space.spaceType` field is required.
   *
   * To create a space, set `Space.spaceType` to `SPACE` and set
   * `Space.displayName`. If you receive the error message `ALREADY_EXISTS` when
   * setting up a space, try a different `displayName`. An existing space
   * within the Google Workspace organization might already use this display
   * name.
   *
   * To create a group chat, set `Space.spaceType` to
   * `GROUP_CHAT`. Don't set `Space.displayName`.
   *
   * To create a 1:1 conversation between humans,
   * set `Space.spaceType` to `DIRECT_MESSAGE` and set
   * `Space.singleUserBotDm` to `false`. Don't set `Space.displayName` or
   * `Space.spaceDetails`.
   *
   * To create an 1:1 conversation between a human and the calling Chat app, set
   * `Space.spaceType` to `DIRECT_MESSAGE` and
   * `Space.singleUserBotDm` to `true`. Don't set `Space.displayName` or
   * `Space.spaceDetails`.
   *
   * If a `DIRECT_MESSAGE` space already exists, that space is returned instead
   * of creating a new space.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.chat.v1.SpaceOrBuilder getSpaceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for this request.
   * A random UUID is recommended.
   * Specifying an existing request ID returns the space created with that ID
   * instead of creating a new space.
   * Specifying an existing request ID from the same Chat app with a different
   * authenticated user returns an error.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for this request.
   * A random UUID is recommended.
   * Specifying an existing request ID returns the space created with that ID
   * instead of creating a new space.
   * Specifying an existing request ID from the same Chat app with a different
   * authenticated user returns an error.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Google Chat users to invite to join the space. Omit the
   * calling user, as they are added automatically.
   *
   * The set currently allows up to 20 memberships (in addition to the caller).
   *
   * The `Membership.member` field must contain a `user` with `name` populated
   * (format: `users/{user}`) and `type` set to `User.Type.HUMAN`. You can only
   * add human users when setting up a space (adding Chat apps is only supported
   * for direct message setup with the calling app). You can also add members
   * using the user's email as an alias for {user}. For example, the `user.name`
   * can be `users/example&#64;gmail.com`." To invite Gmail users or users from
   * external Google Workspace domains, user's email must be used for
   * `{user}`.
   *
   * Optional when setting `Space.spaceType` to `SPACE`.
   *
   * Required when setting `Space.spaceType` to `GROUP_CHAT`, along with at
   * least two memberships.
   *
   * Required when setting `Space.spaceType` to `DIRECT_MESSAGE` with a human
   * user, along with exactly one membership.
   *
   * Must be empty when creating a 1:1 conversation between a human and the
   * calling Chat app (when setting `Space.spaceType` to
   * `DIRECT_MESSAGE` and `Space.singleUserBotDm` to `true`).
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.chat.v1.Membership> getMembershipsList();
  /**
   *
   *
   * <pre>
   * Optional. The Google Chat users to invite to join the space. Omit the
   * calling user, as they are added automatically.
   *
   * The set currently allows up to 20 memberships (in addition to the caller).
   *
   * The `Membership.member` field must contain a `user` with `name` populated
   * (format: `users/{user}`) and `type` set to `User.Type.HUMAN`. You can only
   * add human users when setting up a space (adding Chat apps is only supported
   * for direct message setup with the calling app). You can also add members
   * using the user's email as an alias for {user}. For example, the `user.name`
   * can be `users/example&#64;gmail.com`." To invite Gmail users or users from
   * external Google Workspace domains, user's email must be used for
   * `{user}`.
   *
   * Optional when setting `Space.spaceType` to `SPACE`.
   *
   * Required when setting `Space.spaceType` to `GROUP_CHAT`, along with at
   * least two memberships.
   *
   * Required when setting `Space.spaceType` to `DIRECT_MESSAGE` with a human
   * user, along with exactly one membership.
   *
   * Must be empty when creating a 1:1 conversation between a human and the
   * calling Chat app (when setting `Space.spaceType` to
   * `DIRECT_MESSAGE` and `Space.singleUserBotDm` to `true`).
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.chat.v1.Membership getMemberships(int index);
  /**
   *
   *
   * <pre>
   * Optional. The Google Chat users to invite to join the space. Omit the
   * calling user, as they are added automatically.
   *
   * The set currently allows up to 20 memberships (in addition to the caller).
   *
   * The `Membership.member` field must contain a `user` with `name` populated
   * (format: `users/{user}`) and `type` set to `User.Type.HUMAN`. You can only
   * add human users when setting up a space (adding Chat apps is only supported
   * for direct message setup with the calling app). You can also add members
   * using the user's email as an alias for {user}. For example, the `user.name`
   * can be `users/example&#64;gmail.com`." To invite Gmail users or users from
   * external Google Workspace domains, user's email must be used for
   * `{user}`.
   *
   * Optional when setting `Space.spaceType` to `SPACE`.
   *
   * Required when setting `Space.spaceType` to `GROUP_CHAT`, along with at
   * least two memberships.
   *
   * Required when setting `Space.spaceType` to `DIRECT_MESSAGE` with a human
   * user, along with exactly one membership.
   *
   * Must be empty when creating a 1:1 conversation between a human and the
   * calling Chat app (when setting `Space.spaceType` to
   * `DIRECT_MESSAGE` and `Space.singleUserBotDm` to `true`).
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getMembershipsCount();
  /**
   *
   *
   * <pre>
   * Optional. The Google Chat users to invite to join the space. Omit the
   * calling user, as they are added automatically.
   *
   * The set currently allows up to 20 memberships (in addition to the caller).
   *
   * The `Membership.member` field must contain a `user` with `name` populated
   * (format: `users/{user}`) and `type` set to `User.Type.HUMAN`. You can only
   * add human users when setting up a space (adding Chat apps is only supported
   * for direct message setup with the calling app). You can also add members
   * using the user's email as an alias for {user}. For example, the `user.name`
   * can be `users/example&#64;gmail.com`." To invite Gmail users or users from
   * external Google Workspace domains, user's email must be used for
   * `{user}`.
   *
   * Optional when setting `Space.spaceType` to `SPACE`.
   *
   * Required when setting `Space.spaceType` to `GROUP_CHAT`, along with at
   * least two memberships.
   *
   * Required when setting `Space.spaceType` to `DIRECT_MESSAGE` with a human
   * user, along with exactly one membership.
   *
   * Must be empty when creating a 1:1 conversation between a human and the
   * calling Chat app (when setting `Space.spaceType` to
   * `DIRECT_MESSAGE` and `Space.singleUserBotDm` to `true`).
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.chat.v1.MembershipOrBuilder> getMembershipsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The Google Chat users to invite to join the space. Omit the
   * calling user, as they are added automatically.
   *
   * The set currently allows up to 20 memberships (in addition to the caller).
   *
   * The `Membership.member` field must contain a `user` with `name` populated
   * (format: `users/{user}`) and `type` set to `User.Type.HUMAN`. You can only
   * add human users when setting up a space (adding Chat apps is only supported
   * for direct message setup with the calling app). You can also add members
   * using the user's email as an alias for {user}. For example, the `user.name`
   * can be `users/example&#64;gmail.com`." To invite Gmail users or users from
   * external Google Workspace domains, user's email must be used for
   * `{user}`.
   *
   * Optional when setting `Space.spaceType` to `SPACE`.
   *
   * Required when setting `Space.spaceType` to `GROUP_CHAT`, along with at
   * least two memberships.
   *
   * Required when setting `Space.spaceType` to `DIRECT_MESSAGE` with a human
   * user, along with exactly one membership.
   *
   * Must be empty when creating a 1:1 conversation between a human and the
   * calling Chat app (when setting `Space.spaceType` to
   * `DIRECT_MESSAGE` and `Space.singleUserBotDm` to `true`).
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.chat.v1.MembershipOrBuilder getMembershipsOrBuilder(int index);
}
