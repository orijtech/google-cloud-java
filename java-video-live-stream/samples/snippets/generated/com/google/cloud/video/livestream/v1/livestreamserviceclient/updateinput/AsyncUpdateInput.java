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

package com.google.cloud.video.livestream.v1.samples;

// [START livestream_v1_generated_livestreamserviceclient_updateinput_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.video.livestream.v1.Input;
import com.google.cloud.video.livestream.v1.LivestreamServiceClient;
import com.google.cloud.video.livestream.v1.UpdateInputRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateInput {

  public static void main(String[] args) throws Exception {
    asyncUpdateInput();
  }

  public static void asyncUpdateInput() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (LivestreamServiceClient livestreamServiceClient = LivestreamServiceClient.create()) {
      UpdateInputRequest request =
          UpdateInputRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setInput(Input.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          livestreamServiceClient.updateInputCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END livestream_v1_generated_livestreamserviceclient_updateinput_async]