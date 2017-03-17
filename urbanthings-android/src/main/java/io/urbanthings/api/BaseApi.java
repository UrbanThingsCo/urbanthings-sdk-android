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

package io.urbanthings.api;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import io.urbanthings.api.transit.model.ApiResponse;
import io.urbanthings.api.transit.model.PlacePointType;
import io.urbanthings.api.transit.model.VehicleType;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;


public abstract class BaseApi {

    private HttpLoggingInterceptor loggingInterceptor;

    public BaseApi(HttpLoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }

    /*
     * Asynchronous handling
     */

    protected <T> Callback<ApiResponse<T>> wrapCallback(final ApiCallback<T> callback) {
        return new Callback<ApiResponse<T>>() {
            @Override
            public void onResponse(Call<ApiResponse<T>> call, Response<ApiResponse<T>> response) {
                if (callback != null) {
                    if (response.isSuccessful()) {
                        callback.onSuccess(response.body().data);
                    } else {
                        String errorMessage = null;
                        try {
                            if (response.errorBody() != null) {
                                errorMessage = response.errorBody().string();
                            }
                        } catch (IOException e) {
                            // ignore
                        }

                        callback.onError(new ApiException(new HttpException(response), errorMessage));
                    }
                }
            }

            @Override
            public void onFailure(Call<ApiResponse<T>> call, Throwable t) {
                if (callback != null) {
                    callback.onError(new ApiException(t));
                }
            }
        };
    }

    protected String placePointTypeListToCommaSeperatedList(List<PlacePointType> list) {
        if (list == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer();
        Iterator<PlacePointType> i = list.iterator();

        while (i.hasNext()) {
            buf.append(i.next().getValue());
            if (i.hasNext()) {
                buf.append(",");
            }
        }
        return buf.toString();
    }

    protected String vehicleTypeListToCommaSeperatedList(List<VehicleType> list) {
        if (list == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer();
        Iterator<VehicleType> i = list.iterator();

        while (i.hasNext()) {
            buf.append(i.next().getValue());
            if (i.hasNext()) {
                buf.append(",");
            }
        }
        return buf.toString();
    }


    public void enableLogging(boolean enable) {
        if (loggingInterceptor != null) {
            loggingInterceptor.setLevel(enable ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);
        }

    }


}
