// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/queue.proto

package com.google.cloud.tasks.v2;

public interface QueueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.Queue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Caller-specified and required in [CreateQueue][google.cloud.tasks.v2.CloudTasks.CreateQueue],
   * after which it becomes output only.
   * The queue name.
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the queue's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Caller-specified and required in [CreateQueue][google.cloud.tasks.v2.CloudTasks.CreateQueue],
   * after which it becomes output only.
   * The queue name.
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the queue's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Overrides for
   * [task-level app_engine_routing][google.cloud.tasks.v2.AppEngineHttpRequest.app_engine_routing].
   * These settings apply only to
   * [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest] in this queue.
   * [Http tasks][google.cloud.tasks.v2.HttpRequest] are not affected.
   * If set, `app_engine_routing_override` is used for all
   * [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest] in the queue, no matter what the
   * setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineRouting app_engine_routing_override = 2;</code>
   * @return Whether the appEngineRoutingOverride field is set.
   */
  boolean hasAppEngineRoutingOverride();
  /**
   * <pre>
   * Overrides for
   * [task-level app_engine_routing][google.cloud.tasks.v2.AppEngineHttpRequest.app_engine_routing].
   * These settings apply only to
   * [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest] in this queue.
   * [Http tasks][google.cloud.tasks.v2.HttpRequest] are not affected.
   * If set, `app_engine_routing_override` is used for all
   * [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest] in the queue, no matter what the
   * setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineRouting app_engine_routing_override = 2;</code>
   * @return The appEngineRoutingOverride.
   */
  com.google.cloud.tasks.v2.AppEngineRouting getAppEngineRoutingOverride();
  /**
   * <pre>
   * Overrides for
   * [task-level app_engine_routing][google.cloud.tasks.v2.AppEngineHttpRequest.app_engine_routing].
   * These settings apply only to
   * [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest] in this queue.
   * [Http tasks][google.cloud.tasks.v2.HttpRequest] are not affected.
   * If set, `app_engine_routing_override` is used for all
   * [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest] in the queue, no matter what the
   * setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineRouting app_engine_routing_override = 2;</code>
   */
  com.google.cloud.tasks.v2.AppEngineRoutingOrBuilder getAppEngineRoutingOverrideOrBuilder();

  /**
   * <pre>
   * Rate limits for task dispatches.
   * [rate_limits][google.cloud.tasks.v2.Queue.rate_limits] and [retry_config][google.cloud.tasks.v2.Queue.retry_config] are
   * related because they both control task attempts. However they control task
   * attempts in different ways:
   * * [rate_limits][google.cloud.tasks.v2.Queue.rate_limits] controls the total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2.Queue.retry_config] controls what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2.Queue.retry_config] controls task retries (the
   *   second attempt, third attempt, etc).
   * The queue's actual dispatch rate is the result of:
   * * Number of tasks in the queue
   * * User-specified throttling: [rate_limits][google.cloud.tasks.v2.Queue.rate_limits],
   *   [retry_config][google.cloud.tasks.v2.Queue.retry_config], and the
   *   [queue's state][google.cloud.tasks.v2.Queue.state].
   * * System throttling due to `429` (Too Many Requests) or `503` (Service
   *   Unavailable) responses from the worker, high error rates, or to smooth
   *   sudden large traffic spikes.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.RateLimits rate_limits = 3;</code>
   * @return Whether the rateLimits field is set.
   */
  boolean hasRateLimits();
  /**
   * <pre>
   * Rate limits for task dispatches.
   * [rate_limits][google.cloud.tasks.v2.Queue.rate_limits] and [retry_config][google.cloud.tasks.v2.Queue.retry_config] are
   * related because they both control task attempts. However they control task
   * attempts in different ways:
   * * [rate_limits][google.cloud.tasks.v2.Queue.rate_limits] controls the total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2.Queue.retry_config] controls what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2.Queue.retry_config] controls task retries (the
   *   second attempt, third attempt, etc).
   * The queue's actual dispatch rate is the result of:
   * * Number of tasks in the queue
   * * User-specified throttling: [rate_limits][google.cloud.tasks.v2.Queue.rate_limits],
   *   [retry_config][google.cloud.tasks.v2.Queue.retry_config], and the
   *   [queue's state][google.cloud.tasks.v2.Queue.state].
   * * System throttling due to `429` (Too Many Requests) or `503` (Service
   *   Unavailable) responses from the worker, high error rates, or to smooth
   *   sudden large traffic spikes.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.RateLimits rate_limits = 3;</code>
   * @return The rateLimits.
   */
  com.google.cloud.tasks.v2.RateLimits getRateLimits();
  /**
   * <pre>
   * Rate limits for task dispatches.
   * [rate_limits][google.cloud.tasks.v2.Queue.rate_limits] and [retry_config][google.cloud.tasks.v2.Queue.retry_config] are
   * related because they both control task attempts. However they control task
   * attempts in different ways:
   * * [rate_limits][google.cloud.tasks.v2.Queue.rate_limits] controls the total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2.Queue.retry_config] controls what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2.Queue.retry_config] controls task retries (the
   *   second attempt, third attempt, etc).
   * The queue's actual dispatch rate is the result of:
   * * Number of tasks in the queue
   * * User-specified throttling: [rate_limits][google.cloud.tasks.v2.Queue.rate_limits],
   *   [retry_config][google.cloud.tasks.v2.Queue.retry_config], and the
   *   [queue's state][google.cloud.tasks.v2.Queue.state].
   * * System throttling due to `429` (Too Many Requests) or `503` (Service
   *   Unavailable) responses from the worker, high error rates, or to smooth
   *   sudden large traffic spikes.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.RateLimits rate_limits = 3;</code>
   */
  com.google.cloud.tasks.v2.RateLimitsOrBuilder getRateLimitsOrBuilder();

  /**
   * <pre>
   * Settings that determine the retry behavior.
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.RetryConfig retry_config = 4;</code>
   * @return Whether the retryConfig field is set.
   */
  boolean hasRetryConfig();
  /**
   * <pre>
   * Settings that determine the retry behavior.
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.RetryConfig retry_config = 4;</code>
   * @return The retryConfig.
   */
  com.google.cloud.tasks.v2.RetryConfig getRetryConfig();
  /**
   * <pre>
   * Settings that determine the retry behavior.
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.RetryConfig retry_config = 4;</code>
   */
  com.google.cloud.tasks.v2.RetryConfigOrBuilder getRetryConfigOrBuilder();

  /**
   * <pre>
   * Output only. The state of the queue.
   * `state` can only be changed by called
   * [PauseQueue][google.cloud.tasks.v2.CloudTasks.PauseQueue],
   * [ResumeQueue][google.cloud.tasks.v2.CloudTasks.ResumeQueue], or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref).
   * [UpdateQueue][google.cloud.tasks.v2.CloudTasks.UpdateQueue] cannot be used to change `state`.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue.State state = 5;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The state of the queue.
   * `state` can only be changed by called
   * [PauseQueue][google.cloud.tasks.v2.CloudTasks.PauseQueue],
   * [ResumeQueue][google.cloud.tasks.v2.CloudTasks.ResumeQueue], or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref).
   * [UpdateQueue][google.cloud.tasks.v2.CloudTasks.UpdateQueue] cannot be used to change `state`.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue.State state = 5;</code>
   * @return The state.
   */
  com.google.cloud.tasks.v2.Queue.State getState();

  /**
   * <pre>
   * Output only. The last time this queue was purged.
   * All tasks that were [created][google.cloud.tasks.v2.Task.create_time] before this time
   * were purged.
   * A queue can be purged using [PurgeQueue][google.cloud.tasks.v2.CloudTasks.PurgeQueue], the
   * [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 6;</code>
   * @return Whether the purgeTime field is set.
   */
  boolean hasPurgeTime();
  /**
   * <pre>
   * Output only. The last time this queue was purged.
   * All tasks that were [created][google.cloud.tasks.v2.Task.create_time] before this time
   * were purged.
   * A queue can be purged using [PurgeQueue][google.cloud.tasks.v2.CloudTasks.PurgeQueue], the
   * [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 6;</code>
   * @return The purgeTime.
   */
  com.google.protobuf.Timestamp getPurgeTime();
  /**
   * <pre>
   * Output only. The last time this queue was purged.
   * All tasks that were [created][google.cloud.tasks.v2.Task.create_time] before this time
   * were purged.
   * A queue can be purged using [PurgeQueue][google.cloud.tasks.v2.CloudTasks.PurgeQueue], the
   * [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPurgeTimeOrBuilder();

  /**
   * <pre>
   * Configuration options for writing logs to
   * [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this
   * field is unset, then no logs are written.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.StackdriverLoggingConfig stackdriver_logging_config = 9;</code>
   * @return Whether the stackdriverLoggingConfig field is set.
   */
  boolean hasStackdriverLoggingConfig();
  /**
   * <pre>
   * Configuration options for writing logs to
   * [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this
   * field is unset, then no logs are written.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.StackdriverLoggingConfig stackdriver_logging_config = 9;</code>
   * @return The stackdriverLoggingConfig.
   */
  com.google.cloud.tasks.v2.StackdriverLoggingConfig getStackdriverLoggingConfig();
  /**
   * <pre>
   * Configuration options for writing logs to
   * [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this
   * field is unset, then no logs are written.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.StackdriverLoggingConfig stackdriver_logging_config = 9;</code>
   */
  com.google.cloud.tasks.v2.StackdriverLoggingConfigOrBuilder getStackdriverLoggingConfigOrBuilder();
}