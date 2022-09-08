/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_modelserviceclient_listmodels_sync]
import com.google.cloud.retail.v2beta.CatalogName;
import com.google.cloud.retail.v2beta.ListModelsRequest;
import com.google.cloud.retail.v2beta.Model;
import com.google.cloud.retail.v2beta.ModelServiceClient;

public class SyncListModels {

  public static void main(String[] args) throws Exception {
    syncListModels();
  }

  public static void syncListModels() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ModelServiceClient modelServiceClient = ModelServiceClient.create()) {
      ListModelsRequest request =
          ListModelsRequest.newBuilder()
              .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (Model element : modelServiceClient.listModels(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END retail_v2beta_generated_modelserviceclient_listmodels_sync]