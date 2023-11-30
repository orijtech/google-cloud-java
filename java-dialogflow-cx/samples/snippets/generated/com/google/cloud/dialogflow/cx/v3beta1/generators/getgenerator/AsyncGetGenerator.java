/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.dialogflow.cx.v3beta1.samples;

// [START dialogflow_v3beta1_generated_Generators_GetGenerator_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.cx.v3beta1.Generator;
import com.google.cloud.dialogflow.cx.v3beta1.GeneratorName;
import com.google.cloud.dialogflow.cx.v3beta1.GeneratorsClient;
import com.google.cloud.dialogflow.cx.v3beta1.GetGeneratorRequest;

public class AsyncGetGenerator {

  public static void main(String[] args) throws Exception {
    asyncGetGenerator();
  }

  public static void asyncGetGenerator() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GeneratorsClient generatorsClient = GeneratorsClient.create()) {
      GetGeneratorRequest request =
          GetGeneratorRequest.newBuilder()
              .setName(
                  GeneratorName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[GENERATOR]").toString())
              .setLanguageCode("languageCode-2092349083")
              .build();
      ApiFuture<Generator> future = generatorsClient.getGeneratorCallable().futureCall(request);
      // Do something.
      Generator response = future.get();
    }
  }
}
// [END dialogflow_v3beta1_generated_Generators_GetGenerator_async]
