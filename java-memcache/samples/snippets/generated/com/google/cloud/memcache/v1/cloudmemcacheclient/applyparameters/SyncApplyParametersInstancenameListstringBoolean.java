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

package com.google.cloud.memcache.v1.samples;

// [START memcache_v1_generated_cloudmemcacheclient_applyparameters_instancenameliststringboolean_sync]
import com.google.cloud.memcache.v1.CloudMemcacheClient;
import com.google.cloud.memcache.v1.Instance;
import com.google.cloud.memcache.v1.InstanceName;
import java.util.ArrayList;
import java.util.List;

public class SyncApplyParametersInstancenameListstringBoolean {

  public static void main(String[] args) throws Exception {
    syncApplyParametersInstancenameListstringBoolean();
  }

  public static void syncApplyParametersInstancenameListstringBoolean() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
      InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
      List<String> nodeIds = new ArrayList<>();
      boolean applyAll = true;
      Instance response = cloudMemcacheClient.applyParametersAsync(name, nodeIds, applyAll).get();
    }
  }
}
// [END memcache_v1_generated_cloudmemcacheclient_applyparameters_instancenameliststringboolean_sync]