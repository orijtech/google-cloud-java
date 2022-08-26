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

package com.google.cloud.iot.v1.samples;

// [START iot_v1_generated_devicemanagerclient_binddevicetogateway_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.iot.v1.BindDeviceToGatewayRequest;
import com.google.cloud.iot.v1.BindDeviceToGatewayResponse;
import com.google.cloud.iot.v1.DeviceManagerClient;
import com.google.cloud.iot.v1.RegistryName;

public class AsyncBindDeviceToGateway {

  public static void main(String[] args) throws Exception {
    asyncBindDeviceToGateway();
  }

  public static void asyncBindDeviceToGateway() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
      BindDeviceToGatewayRequest request =
          BindDeviceToGatewayRequest.newBuilder()
              .setParent(RegistryName.of("[PROJECT]", "[LOCATION]", "[REGISTRY]").toString())
              .setGatewayId("gatewayId-1354641793")
              .setDeviceId("deviceId1109191185")
              .build();
      ApiFuture<BindDeviceToGatewayResponse> future =
          deviceManagerClient.bindDeviceToGatewayCallable().futureCall(request);
      // Do something.
      BindDeviceToGatewayResponse response = future.get();
    }
  }
}
// [END iot_v1_generated_devicemanagerclient_binddevicetogateway_async]