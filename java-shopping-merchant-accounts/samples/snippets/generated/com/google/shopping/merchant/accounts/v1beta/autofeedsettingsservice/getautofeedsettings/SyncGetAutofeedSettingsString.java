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

package com.google.shopping.merchant.accounts.v1beta.samples;

// [START merchantapi_v1beta_generated_AutofeedSettingsService_GetAutofeedSettings_String_sync]
import com.google.shopping.merchant.accounts.v1beta.AutofeedSettings;
import com.google.shopping.merchant.accounts.v1beta.AutofeedSettingsName;
import com.google.shopping.merchant.accounts.v1beta.AutofeedSettingsServiceClient;

public class SyncGetAutofeedSettingsString {

  public static void main(String[] args) throws Exception {
    syncGetAutofeedSettingsString();
  }

  public static void syncGetAutofeedSettingsString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AutofeedSettingsServiceClient autofeedSettingsServiceClient =
        AutofeedSettingsServiceClient.create()) {
      String name = AutofeedSettingsName.of("[ACCOUNT]").toString();
      AutofeedSettings response = autofeedSettingsServiceClient.getAutofeedSettings(name);
    }
  }
}
// [END merchantapi_v1beta_generated_AutofeedSettingsService_GetAutofeedSettings_String_sync]
