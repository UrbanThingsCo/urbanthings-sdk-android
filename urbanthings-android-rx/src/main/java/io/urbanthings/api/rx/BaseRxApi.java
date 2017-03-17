/*
 * Copyright (C) 2017 UrbanThings.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * UrbanThings is a trading name of FatAttitude Limited
 */

package io.urbanthings.api.rx;

import java.io.IOException;

import io.urbanthings.api.ApiException;
import io.urbanthings.api.BaseApi;
import io.urbanthings.api.transit.model.ApiResponse;
import retrofit2.HttpException;
import retrofit2.adapter.rxjava.Result;

public abstract class BaseRxApi extends BaseApi {

    /*
     * Synchronous handling
     */

    protected <T> void handleResult(Result<ApiResponse<T>> result) {
        if (result.isError()) {
            throw new ApiException(result.error());
        } else if (!result.response().isSuccessful()) {
            String errorMessage = null;
            try {
                if (result.response().errorBody() != null) {
                    errorMessage = result.response().errorBody().string();
                }
            } catch (IOException e) {
                // ignore
            }

            throw new ApiException(new HttpException(result.response()), errorMessage);
        }
    }

}
