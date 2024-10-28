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

package com.google.cloud.alloydb.v1.samples;

// [START alloydb_v1_generated_AlloyDBAdmin_ExecuteSql_sync]
import com.google.cloud.alloydb.v1.AlloyDBAdminClient;
import com.google.cloud.alloydb.v1.ExecuteSqlRequest;
import com.google.cloud.alloydb.v1.ExecuteSqlResponse;
import com.google.cloud.alloydb.v1.InstanceName;

public class SyncExecuteSql {

  public static void main(String[] args) throws Exception {
    syncExecuteSql();
  }

  public static void syncExecuteSql() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AlloyDBAdminClient alloyDBAdminClient = AlloyDBAdminClient.create()) {
      ExecuteSqlRequest request =
          ExecuteSqlRequest.newBuilder()
              .setInstance(
                  InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
              .setDatabase("database1789464955")
              .setUser("user3599307")
              .setSqlStatement("sqlStatement937767745")
              .build();
      ExecuteSqlResponse response = alloyDBAdminClient.executeSql(request);
    }
  }
}
// [END alloydb_v1_generated_AlloyDBAdmin_ExecuteSql_sync]
