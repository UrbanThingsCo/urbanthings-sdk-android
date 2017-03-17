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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import io.urbanthings.api.transit.TransitApi;
import io.urbanthings.api.transit.TransitApiManager;
import io.urbanthings.api.transit.model.PlacePoint;
import io.urbanthings.api.transit.model.TransitStop;
import io.urbanthings.api.transit.model.VehicleType;
import retrofit2.HttpException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class TransitApiTests {

    // Base URL for all Bristol API calls
    private static final String BASE_URL = "https://bristol.api.urbanthings.io/api/1.0/";

    // You will need to register to use the API and put your own API key here...!
    // Please visit: https://portal-bristol.api.urbanthings.io
    public static final String API_KEY = null;
    
    private static final double CENTRE_LAT = 51.4575586;
    private static final double CENTRE_LNG = -2.5982637;
    private static final double BOUND_BOX_SIZE = 0.21;
    private static final double BIG_BOUND_BOX_SIZE = 1.0;

    private static final double MIN_LAT = CENTRE_LAT - (BOUND_BOX_SIZE / 2);
    private static final double MAX_LAT = CENTRE_LAT + (BOUND_BOX_SIZE / 2);
    private static final double MIN_LNG = CENTRE_LNG - (BOUND_BOX_SIZE / 2);
    private static final double MAX_LNG = CENTRE_LNG + (BOUND_BOX_SIZE / 2);


    private static final double BAD_MIN_LAT = CENTRE_LAT - (BIG_BOUND_BOX_SIZE / 2);
    private static final double BAD_MAX_LAT = CENTRE_LAT + (BIG_BOUND_BOX_SIZE / 2);
    private static final double BAD_MIN_LNG = CENTRE_LNG - (BIG_BOUND_BOX_SIZE / 2);
    private static final double BAD_MAX_LNG = CENTRE_LNG + (BIG_BOUND_BOX_SIZE / 2);

    private TransitApi transitApi;
    
    @Before
    public void setup() {
        transitApi = TransitApiManager.transitApi(BASE_URL, API_KEY);
    }
    
    @Test
    public void testGetStops() {
        final ArrayList<List<TransitStop>> result = new ArrayList<>();
        final CountDownLatch latch = new CountDownLatch(1);

        transitApi.getStopsInRect(MIN_LAT, MAX_LAT, MIN_LNG, MAX_LNG, Arrays.asList(VehicleType.CAR), new ApiCallback<List<TransitStop>>() {
            @Override
            public void onSuccess(List<TransitStop> object) {
                result.add(object);
                latch.countDown();
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }
        });


        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals(1, result.size());
        assertEquals(2, result.get(0).size());
    }


    @Test
    public void testGetPlacePointsError() {
        final ArrayList<Throwable> throwables = new ArrayList<>();
        final CountDownLatch latch = new CountDownLatch(1);

        transitApi.getStopsInRect(BAD_MIN_LAT, BAD_MAX_LAT, BAD_MIN_LNG, BAD_MAX_LNG, Arrays.asList(VehicleType.CAR), new ApiCallback<List<TransitStop>>() {
            @Override
            public void onSuccess(List<TransitStop> object) {
                latch.countDown();
            }

            @Override
            public void onError(Throwable t) {
                throwables.add(t);
                latch.countDown();
            }
        });

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals(1, throwables.size());
        assertTrue(throwables.get(0) instanceof ApiException);
        assertNotNull(throwables.get(0).getMessage() != null);
        assertTrue(throwables.get(0).getCause() instanceof HttpException);
        assertEquals("\"A lat/lng boundary box Must be smaller than 20km x 20km.\"", ((ApiException)throwables.get(0)).getLocalisedErrorMessage());

    }
}
