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

package io.urbanthings.api.rx.transit;

import io.urbanthings.api.rx.transit.internal.RetrofitRxTransitApi;
import io.urbanthings.api.transit.TransitApiManager;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static io.urbanthings.internal.CheckHelpers.checkNotNull;


public class RxTransitApiManager extends TransitApiManager {

    public final static RxTransitApi rxTransitApi(String baseUrl, String key) {
        checkNotNull(baseUrl, "baseUrl cannot be null");
        checkNotNull(key, "key cannot be null");
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient client = new OkHttpClient.Builder().addNetworkInterceptor(interceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(getGson()))
                .build();

        RetrofitRxTransitApi rxRetrofitApi = retrofit.create(RetrofitRxTransitApi.class);
        return new RxTransitApi(rxRetrofitApi, key, interceptor);
    }

}
