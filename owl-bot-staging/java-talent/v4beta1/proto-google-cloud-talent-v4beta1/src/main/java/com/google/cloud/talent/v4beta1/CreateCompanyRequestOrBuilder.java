// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

package com.google.cloud.talent.v4beta1;

public interface CreateCompanyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CreateCompanyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created, for example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created, for example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the company field is set.
   */
  boolean hasCompany();
  /**
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The company.
   */
  com.google.cloud.talent.v4beta1.Company getCompany();
  /**
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.talent.v4beta1.CompanyOrBuilder getCompanyOrBuilder();
}