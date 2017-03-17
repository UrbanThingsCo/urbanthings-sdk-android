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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import io.urbanthings.api.ApiException;
import io.urbanthings.api.rx.transit.RxTransitApi;
import io.urbanthings.api.rx.transit.RxTransitApiManager;
import io.urbanthings.api.transit.model.DirectionsRequest;
import io.urbanthings.api.transit.model.DirectionsResponse;
import io.urbanthings.api.transit.model.PlacePoint;
import io.urbanthings.api.transit.model.PlacePointList;
import io.urbanthings.api.transit.model.ResourceStatus;
import io.urbanthings.api.transit.model.StopBoardResponse;
import io.urbanthings.api.transit.model.TransitDetailedRouteInfo;
import io.urbanthings.api.transit.model.TransitStop;
import io.urbanthings.api.transit.model.TransitStopRTIResponse;
import io.urbanthings.api.transit.model.TransitStopScheduledCalls;
import io.urbanthings.api.transit.model.TransitTrip;
import io.urbanthings.api.transit.model.TransitTripCalendarGroup;
import io.urbanthings.api.transit.model.VehicleType;
import rx.singles.BlockingSingle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class RxTransitApiTests {

    // Base URL for all Bristol API calls
    private static final String BASE_URL = "https://bristol.api.urbanthings.io/api/1.0/";

    // You will need to register to use the API and put your own API key here...!
    // Please visit: https://portal-bristol.api.urbanthings.io
    public static final String API_KEY = null;

    public static final String AGENCY_ID = "UK_TNDS_NOC_CTLT";
    public static final String STOP_ID = "017000009";
    public static final String TRIP_ID = "T9801982";
    public static final String ROUTE_ID = "UK_TNDS_NOC_AMNO-785-4-785-B-y11-1";

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

    private RxTransitApi rxTransitApi;

    @Before
    public void setup() {
        rxTransitApi = RxTransitApiManager.rxTransitApi(BASE_URL,API_KEY);
    }


    @Test
    public void testGetStops() {
        BlockingSingle<List<TransitStop>> single = rxTransitApi.getStopsInRect(MIN_LAT, MAX_LAT, MIN_LNG, MAX_LNG, Arrays.asList(VehicleType.CAR)).toBlocking();
        assertEquals(2, single.value().size());
    }


    @Test
    public void testGetStopCalls() {
        BlockingSingle<TransitStopScheduledCalls> single = rxTransitApi.getStopCalls(STOP_ID, null, null).toBlocking();
        assertNotNull(single.value());
    }

    @Test
    public void testGetStopBoard() {
        BlockingSingle<StopBoardResponse> single = rxTransitApi.getStopBoard(STOP_ID, null, null, true).toBlocking();
        assertNotNull(single.value());
    }

    @Test
    public void testGetReport() {
        BlockingSingle<TransitStopRTIResponse> single = rxTransitApi.getStopReport(STOP_ID, null, null).toBlocking();
        assertNotNull(single.value());
    }


    @Test
    public void testGetDirections() {
        PlacePoint origin = new PlacePoint("Origin", 51.472638, -2.610538);
        PlacePoint dest = new PlacePoint("Destination", 51.4685749, -2.6609205);
        DirectionsRequest directionsRequest = new DirectionsRequest();
        directionsRequest.setOrigin(origin);
        directionsRequest.setDestination(dest);
        directionsRequest.setDepartureTime(new Date());

        BlockingSingle<DirectionsResponse> single = rxTransitApi.getDirections(directionsRequest).toBlocking();
        assertTrue(single.value().getJourneys().size() > 0);
    }

    @Test
    public void testGetRoute() {
        BlockingSingle<DirectionsResponse> single = rxTransitApi.getRoute(ROUTE_ID, null, null, null, null, null).toBlocking();
        assertTrue(single.value().getJourneys().size() > 0);
    }

    @Test
    public void testSearchPlacePoints() {
        BlockingSingle<PlacePointList> single = rxTransitApi.searchPlacePoints("London", 51.525493, -0.0822173, 10).toBlocking();
        assert(single.value().getPlacePoints().size() > 0);
    }


    @Test
    public void testGetResourceStatus() {
        BlockingSingle<List<TransitStop>> single = rxTransitApi.getStopsInRect(MIN_LAT, MAX_LAT, MIN_LNG, MAX_LNG, Arrays.asList(VehicleType.CAR)).toBlocking();
        assertEquals(2, single.value().size());

        BlockingSingle<List<ResourceStatus>> single2 = rxTransitApi.getResourceStatus(single.value().get(0).getPrimaryCode()).toBlocking();
        assertEquals(1, single2.value().size());
        assertEquals(VehicleType.CAR, single2.value().get(0).getVehicleType());

    }

    @Test
    public void testGetPlacePointsError() {
        BlockingSingle<List<TransitStop>> single = rxTransitApi.getStopsInRect(BAD_MIN_LAT, BAD_MAX_LAT, BAD_MIN_LNG, BAD_MAX_LNG, Arrays.asList(VehicleType.CAR)).toBlocking();
        try {
            single.value();
        } catch (ApiException e) {
            // expected
            assertNotNull(e.getMessage() != null);
            assertTrue(e.getCause() instanceof Exception);
            assertEquals("\"A lat/lng boundary box Must be smaller than 20km x 20km.\"", e.getLocalisedErrorMessage());
            return;
        }
        fail();
    }

    @Test
    public void testSearchRoutes() {
        BlockingSingle<List<TransitDetailedRouteInfo>> single = rxTransitApi.searchRoutesByLocation("100", Boolean.FALSE, CENTRE_LAT, CENTRE_LNG).toBlocking();
        assertTrue(single.value().size() > 0);
    }

    @Test
    public void testGetRoutesByAgency() {
        BlockingSingle<List<TransitDetailedRouteInfo>> single = rxTransitApi.getRoutesByAgency(AGENCY_ID).toBlocking();
        assertTrue(single.value().size() > 0);
    }

    @Test
    public void testGetRoutesForStop() {
        BlockingSingle<List<TransitDetailedRouteInfo>> single = rxTransitApi.getRoutesForStop(STOP_ID).toBlocking();
        assertTrue(single.value().size() > 0);
    }

    @Test
    public void testGetTrip() {
        BlockingSingle<TransitTrip> single = rxTransitApi.getTrip(TRIP_ID, null, null, true, true).toBlocking();
        assertNotNull(single.value());
    }

    @Test
    public void testGetTripsForRoute() {
        BlockingSingle<List<TransitTrip>> single = rxTransitApi.getTripsForRoute(ROUTE_ID, null, null, true, true).toBlocking();
        assertTrue(single.value().size() > 0);
    }

    @Test
    public void testGetTripsByCalendarGroup() {
        BlockingSingle<List<TransitTripCalendarGroup>> single = rxTransitApi.getTripsByCalendarGroups(ROUTE_ID, true, true).toBlocking();
        assertTrue(single.value().size() > 0);
    }

}