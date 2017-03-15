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

package io.urbanthings.api.transit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.urbanthings.api.transit.internal.RetrofitTransitApi;
import io.urbanthings.api.transit.model.JourneyLeg;
import io.urbanthings.api.transit.model.MonitoredStopCall;
import io.urbanthings.api.transit.model.PlacePoint;
import io.urbanthings.api.transit.model.StopCall;
import io.urbanthings.api.transit.model.TransitJourneyLeg;
import io.urbanthings.api.transit.model.TransitStop;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import static io.urbanthings.internal.CheckHelpers.checkNotNull;

/**
 * Created by ianmanders on 26/09/2016.
 */

public class TransitApiManager {

    public final static TransitApi transitApi(String baseUrl, String key) {
        checkNotNull(baseUrl, "baseUrl cannot be null");
        checkNotNull(key, "key cannot be null");
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addNetworkInterceptor(interceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(getGson()))
                .build();

        RetrofitTransitApi retrofitApi = retrofit.create(RetrofitTransitApi.class);
        return new TransitApi(retrofitApi, key);
    }

    private static Gson gson;
    protected final static Gson getGson() {
        if (gson == null) {
            GsonBuilder builder = new GsonBuilder();

            builder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss");

            RuntimeTypeAdapterFactory<JourneyLeg> journeyLegAdapterFactory = RuntimeTypeAdapterFactory.of(JourneyLeg.class, "type");
            journeyLegAdapterFactory.registerSubtype(TransitJourneyLeg.class, "TransitJourneyLeg");
            builder.registerTypeAdapterFactory(journeyLegAdapterFactory);

            RuntimeTypeAdapterFactory<PlacePoint> placePointAdapterFactory = RuntimeTypeAdapterFactory.of(PlacePoint.class, "subClassType");
            placePointAdapterFactory.registerSubtype(TransitStop.class, "TransitStop");
            builder.registerTypeAdapterFactory(placePointAdapterFactory);

            RuntimeTypeAdapterFactory<StopCall> stopCallAdapterFactory = RuntimeTypeAdapterFactory.of(StopCall.class, "subClassType");
            stopCallAdapterFactory.registerSubtype(MonitoredStopCall.class, "MonitoredStopCall");
            builder.registerTypeAdapterFactory(stopCallAdapterFactory);

            gson = builder.create();
        }
        return gson;
    }



}
