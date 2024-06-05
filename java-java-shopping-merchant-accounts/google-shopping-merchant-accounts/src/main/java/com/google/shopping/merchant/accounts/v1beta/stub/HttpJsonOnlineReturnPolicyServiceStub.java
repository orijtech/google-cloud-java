/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.shopping.merchant.accounts.v1beta.stub;

import static com.google.shopping.merchant.accounts.v1beta.OnlineReturnPolicyServiceClient.ListOnlineReturnPoliciesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.protobuf.TypeRegistry;
import com.google.shopping.merchant.accounts.v1beta.GetOnlineReturnPolicyRequest;
import com.google.shopping.merchant.accounts.v1beta.ListOnlineReturnPoliciesRequest;
import com.google.shopping.merchant.accounts.v1beta.ListOnlineReturnPoliciesResponse;
import com.google.shopping.merchant.accounts.v1beta.OnlineReturnPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the OnlineReturnPolicyService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonOnlineReturnPolicyServiceStub extends OnlineReturnPolicyServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<GetOnlineReturnPolicyRequest, OnlineReturnPolicy>
      getOnlineReturnPolicyMethodDescriptor =
          ApiMethodDescriptor.<GetOnlineReturnPolicyRequest, OnlineReturnPolicy>newBuilder()
              .setFullMethodName(
                  "google.shopping.merchant.accounts.v1beta.OnlineReturnPolicyService/GetOnlineReturnPolicy")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetOnlineReturnPolicyRequest>newBuilder()
                      .setPath(
                          "/accounts/v1beta/{name=accounts/*/onlineReturnPolicies/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetOnlineReturnPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetOnlineReturnPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<OnlineReturnPolicy>newBuilder()
                      .setDefaultInstance(OnlineReturnPolicy.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesResponse>
      listOnlineReturnPoliciesMethodDescriptor =
          ApiMethodDescriptor
              .<ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesResponse>newBuilder()
              .setFullMethodName(
                  "google.shopping.merchant.accounts.v1beta.OnlineReturnPolicyService/ListOnlineReturnPolicies")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListOnlineReturnPoliciesRequest>newBuilder()
                      .setPath(
                          "/accounts/v1beta/{parent=accounts/*}/onlineReturnPolicies",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListOnlineReturnPoliciesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListOnlineReturnPoliciesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListOnlineReturnPoliciesResponse>newBuilder()
                      .setDefaultInstance(ListOnlineReturnPoliciesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<GetOnlineReturnPolicyRequest, OnlineReturnPolicy>
      getOnlineReturnPolicyCallable;
  private final UnaryCallable<ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesResponse>
      listOnlineReturnPoliciesCallable;
  private final UnaryCallable<
          ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesPagedResponse>
      listOnlineReturnPoliciesPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonOnlineReturnPolicyServiceStub create(
      OnlineReturnPolicyServiceStubSettings settings) throws IOException {
    return new HttpJsonOnlineReturnPolicyServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonOnlineReturnPolicyServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonOnlineReturnPolicyServiceStub(
        OnlineReturnPolicyServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonOnlineReturnPolicyServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonOnlineReturnPolicyServiceStub(
        OnlineReturnPolicyServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonOnlineReturnPolicyServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonOnlineReturnPolicyServiceStub(
      OnlineReturnPolicyServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonOnlineReturnPolicyServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonOnlineReturnPolicyServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonOnlineReturnPolicyServiceStub(
      OnlineReturnPolicyServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetOnlineReturnPolicyRequest, OnlineReturnPolicy>
        getOnlineReturnPolicyTransportSettings =
            HttpJsonCallSettings.<GetOnlineReturnPolicyRequest, OnlineReturnPolicy>newBuilder()
                .setMethodDescriptor(getOnlineReturnPolicyMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesResponse>
        listOnlineReturnPoliciesTransportSettings =
            HttpJsonCallSettings
                .<ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesResponse>newBuilder()
                .setMethodDescriptor(listOnlineReturnPoliciesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();

    this.getOnlineReturnPolicyCallable =
        callableFactory.createUnaryCallable(
            getOnlineReturnPolicyTransportSettings,
            settings.getOnlineReturnPolicySettings(),
            clientContext);
    this.listOnlineReturnPoliciesCallable =
        callableFactory.createUnaryCallable(
            listOnlineReturnPoliciesTransportSettings,
            settings.listOnlineReturnPoliciesSettings(),
            clientContext);
    this.listOnlineReturnPoliciesPagedCallable =
        callableFactory.createPagedCallable(
            listOnlineReturnPoliciesTransportSettings,
            settings.listOnlineReturnPoliciesSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(getOnlineReturnPolicyMethodDescriptor);
    methodDescriptors.add(listOnlineReturnPoliciesMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<GetOnlineReturnPolicyRequest, OnlineReturnPolicy>
      getOnlineReturnPolicyCallable() {
    return getOnlineReturnPolicyCallable;
  }

  @Override
  public UnaryCallable<ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesResponse>
      listOnlineReturnPoliciesCallable() {
    return listOnlineReturnPoliciesCallable;
  }

  @Override
  public UnaryCallable<ListOnlineReturnPoliciesRequest, ListOnlineReturnPoliciesPagedResponse>
      listOnlineReturnPoliciesPagedCallable() {
    return listOnlineReturnPoliciesPagedCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
