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
// source: google/cloud/dialogflow/v2beta1/answer_record.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface AgentAssistantFeedbackOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AgentAssistantFeedback)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Whether or not the suggested answer is relevant.
   *
   * For example:
   *
   * * Query: "Can I change my mailing address?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * [answer_relevance][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.answer_relevance]: [AnswerRelevance.IRRELEVANT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance.IRRELEVANT]
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance answer_relevance = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for answerRelevance.
   */
  int getAnswerRelevanceValue();
  /**
   *
   *
   * <pre>
   * Optional. Whether or not the suggested answer is relevant.
   *
   * For example:
   *
   * * Query: "Can I change my mailing address?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * [answer_relevance][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.answer_relevance]: [AnswerRelevance.IRRELEVANT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance.IRRELEVANT]
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance answer_relevance = 1;
   * </code>
   *
   * @return The answerRelevance.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance getAnswerRelevance();

  /**
   *
   *
   * <pre>
   * Optional. Whether or not the information in the document is correct.
   *
   * For example:
   *
   * * Query: "Can I return the package in 2 days once received?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * Ground truth: "No return or exchange is allowed."
   * * [document_correctness]: INCORRECT
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentCorrectness document_correctness = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for documentCorrectness.
   */
  int getDocumentCorrectnessValue();
  /**
   *
   *
   * <pre>
   * Optional. Whether or not the information in the document is correct.
   *
   * For example:
   *
   * * Query: "Can I return the package in 2 days once received?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * Ground truth: "No return or exchange is allowed."
   * * [document_correctness]: INCORRECT
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentCorrectness document_correctness = 2;
   * </code>
   *
   * @return The documentCorrectness.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentCorrectness
      getDocumentCorrectness();

  /**
   *
   *
   * <pre>
   * Optional. Whether or not the suggested document is efficient. For example,
   * if the document is poorly written, hard to understand, hard to use or
   * too long to find useful information,
   * [document_efficiency][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.document_efficiency]
   * is
   * [DocumentEfficiency.INEFFICIENT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency.INEFFICIENT].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency document_efficiency = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for documentEfficiency.
   */
  int getDocumentEfficiencyValue();
  /**
   *
   *
   * <pre>
   * Optional. Whether or not the suggested document is efficient. For example,
   * if the document is poorly written, hard to understand, hard to use or
   * too long to find useful information,
   * [document_efficiency][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.document_efficiency]
   * is
   * [DocumentEfficiency.INEFFICIENT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency.INEFFICIENT].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency document_efficiency = 3;
   * </code>
   *
   * @return The documentEfficiency.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency
      getDocumentEfficiency();

  /**
   *
   *
   * <pre>
   * Feedback for conversation summarization.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback summarization_feedback = 4;
   * </code>
   *
   * @return Whether the summarizationFeedback field is set.
   */
  boolean hasSummarizationFeedback();
  /**
   *
   *
   * <pre>
   * Feedback for conversation summarization.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback summarization_feedback = 4;
   * </code>
   *
   * @return The summarizationFeedback.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback
      getSummarizationFeedback();
  /**
   *
   *
   * <pre>
   * Feedback for conversation summarization.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback summarization_feedback = 4;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedbackOrBuilder
      getSummarizationFeedbackOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Feedback for knowledge search.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeSearchFeedback knowledge_search_feedback = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the knowledgeSearchFeedback field is set.
   */
  boolean hasKnowledgeSearchFeedback();
  /**
   *
   *
   * <pre>
   * Optional. Feedback for knowledge search.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeSearchFeedback knowledge_search_feedback = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The knowledgeSearchFeedback.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeSearchFeedback
      getKnowledgeSearchFeedback();
  /**
   *
   *
   * <pre>
   * Optional. Feedback for knowledge search.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeSearchFeedback knowledge_search_feedback = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeSearchFeedbackOrBuilder
      getKnowledgeSearchFeedbackOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Feedback for knowledge assist.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeAssistFeedback knowledge_assist_feedback = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the knowledgeAssistFeedback field is set.
   */
  boolean hasKnowledgeAssistFeedback();
  /**
   *
   *
   * <pre>
   * Optional. Feedback for knowledge assist.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeAssistFeedback knowledge_assist_feedback = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The knowledgeAssistFeedback.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeAssistFeedback
      getKnowledgeAssistFeedback();
  /**
   *
   *
   * <pre>
   * Optional. Feedback for knowledge assist.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeAssistFeedback knowledge_assist_feedback = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.KnowledgeAssistFeedbackOrBuilder
      getKnowledgeAssistFeedbackOrBuilder();
}
