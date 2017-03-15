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

import java.util.Date;
import java.util.List;

import io.urbanthings.api.ApiCallback;
import io.urbanthings.api.BaseApi;
import io.urbanthings.api.transit.internal.RetrofitTransitApi;
import io.urbanthings.api.transit.model.ApiResponse;
import io.urbanthings.api.transit.model.DirectionsRequest;
import io.urbanthings.api.transit.model.DirectionsResponse;
import io.urbanthings.api.transit.model.PlacePointList;
import io.urbanthings.api.transit.model.ResourceStatus;
import io.urbanthings.api.transit.model.StopBoardResponse;
import io.urbanthings.api.transit.model.TransitDetailedRouteInfo;
import io.urbanthings.api.transit.model.TransitStop;
import io.urbanthings.api.transit.model.TransitStopRTIResponse;
import io.urbanthings.api.transit.model.TransitStopScheduledCalls;
import io.urbanthings.api.transit.model.TransitTrip;
import io.urbanthings.api.transit.model.TransitTripCalendarGroup;
import io.urbanthings.api.transit.model.VehiclePassingType;
import io.urbanthings.api.transit.model.VehicleType;
import retrofit2.Call;

/**
 * Created by ianmanders on 08/10/2016.
 */

public class TransitApi extends BaseApi {

    private static final String VERSION = "2.0";
    private RetrofitTransitApi api;
    private String key;

    protected TransitApi(RetrofitTransitApi retrofitApi, String apiKey) {
        this.api = retrofitApi;
        this.key = apiKey;
    }


    /**
     * Get a List of TransitStops for a given bounding region. The list can be filtered by matching
     * against the name of the transit stop, as well as 0 or more VehicleTypes
     *
     * Max size of the bounding box is 20km x 20km
     * @param minLat
     * @param maxLat
     * @param minLng
     * @param maxLng
     * @param stopModes List of VehicleTypes
     * @param callback
     */
    public void getStopsInRect(double minLat, double maxLat, double minLng, double maxLng, List<VehicleType> stopModes, ApiCallback<List<TransitStop>> callback) {
        Call<ApiResponse<List<TransitStop>>> call = api.getStops(minLat, maxLat, minLng, maxLng, vehicleTypeListToCommaSeperatedList(stopModes), null, null, null, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a List of TransitStops for a given radius. The list can be filtered by matching
     * against the name of the transit stop, as well as 0 or more VehicleTypes
     *
     * @param centerLat
     * @param centerLng
     * @param radius
     * @param stopModes List of VehicleTypes
     * @param callback
     */
    public void getStopsInRadius(double centerLat, double centerLng, double radius, List<VehicleType> stopModes, ApiCallback<List<TransitStop>> callback) {
        Call<ApiResponse<List<TransitStop>>> call = api.getStops(centerLat, centerLng, radius, vehicleTypeListToCommaSeperatedList(stopModes), null, null, null, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a list of PlacePoints for a given bounding region. The list can be filtered by matching
     * against the name of the PlacePoint, as well as 0 or more PlacePointTypes
     *
     * @param minLat
     * @param maxLat
     * @param minLng
     * @param maxLng
     * @param placePointTypes
     * @param maxResults
     * @param callback
     */
    public void getPlacePointsInRect(double minLat, double maxLat, double minLng, double maxLng, String placePointTypes, Integer maxResults, ApiCallback<PlacePointList> callback) {
        Call<ApiResponse<PlacePointList>> call = api.getPlacePoints(minLat, maxLat, minLng, maxLng, placePointTypes, maxResults, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a list of PlacePoints for a given radius. The list can be filtered by matching
     * against the name of the PlacePoint, as well as 0 or more PlacePointTypes
     *
     * @param lat
     * @param lng
     * @param radius
     * @param placePointTypes
     * @param maxResults
     * @param callback
     */
    public void getPlacePointsInRect(double lat, double lng, int radius, String placePointTypes, Integer maxResults, ApiCallback<PlacePointList> callback) {
        Call<ApiResponse<PlacePointList>> call = api.getPlacePoints(lat, lng, radius, placePointTypes, maxResults, VERSION, key);
    }

    /**
     * Get a list of Routes and associated info for a given transport agency matching the supplied query
     *
     * @param lineName
     * @param exactMatch
     * @param agencyId
     * @param agencyRegion
     * @param callback
     */
    public void searchRoutesByAgency(String lineName, Boolean exactMatch, String agencyId, String agencyRegion, ApiCallback<List<TransitDetailedRouteInfo>> callback) {
        Call<ApiResponse<List<TransitDetailedRouteInfo>>> call = api.searchRoutes(lineName, exactMatch, null, agencyId, agencyRegion, null, null, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a list of Routes and associated info near the supplied location matching the supplied query
     * @param lineName
     * @param exactMatch
     * @param lat
     * @param lng
     * @param callback
     */
    public void searchRoutesByLocation(String lineName, Boolean exactMatch, Double lat, Double lng, ApiCallback<List<TransitDetailedRouteInfo>> callback) {
        Call<ApiResponse<List<TransitDetailedRouteInfo>>> call = api.searchRoutes(lineName, exactMatch, null, null, null, lat, lng, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a list of Routes and associated info for a given transport agency
     *
     * @param agencyId
     * @param callback
     */
    public void getRoutesByAgency(String agencyId, ApiCallback<List<TransitDetailedRouteInfo>> callback) {
        Call<ApiResponse<List<TransitDetailedRouteInfo>>> call = api.getRoutes(agencyId, null, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a list of Routes and associated info for a given Stop
     * @param stopId
     * @param callback
     */
    public void getRoutesForStop(String stopId, ApiCallback<List<TransitDetailedRouteInfo>> callback) {
        Call<ApiResponse<List<TransitDetailedRouteInfo>>> call = api.getRoutesForStop(stopId, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a Trip for a given TripId
     * @param tripId
     * @param originStopId
     * @param destinationStopId
     * @param includePolyLines
     * @param includeStopCoordinates
     * @param callback
     */
    public void getTrip(String tripId, String originStopId, String destinationStopId, Boolean includePolyLines, Boolean includeStopCoordinates, ApiCallback<List<TransitTrip>> callback) {
        Call<ApiResponse<List<TransitTrip>>> call = api.getTrips(tripId, null, originStopId, destinationStopId, includePolyLines, includeStopCoordinates, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     *  Get a List of Trips for a given routeId
     * @param routeId
     * @param originStopId
     * @param destinationStopId
     * @param includePolyLines
     * @param includeStopCoordinates
     * @param callback
     */
    public void getTripsForRoute(String routeId, String originStopId, String destinationStopId, Boolean includePolyLines, Boolean includeStopCoordinates, ApiCallback<List<TransitTrip>> callback) {
        Call<ApiResponse<List<TransitTrip>>> call = api.getTrips(null, routeId, originStopId, destinationStopId, includePolyLines, includeStopCoordinates, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     *
     * @param routeId
     * @param includePolyLines
     * @param includeStopCoordinates
     * @param callback
     */
    public void getTripsByCalendarGroups(String routeId, Boolean includePolyLines, Boolean includeStopCoordinates, ApiCallback<List<TransitTripCalendarGroup>> callback) {
        Call<ApiResponse<List<TransitTripCalendarGroup>>> call = api.getTripsByCalendar(routeId, includePolyLines, includeStopCoordinates, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     *  Get a List of TransitStopScheduledCalls for a given stopId, with an optional query time and look ahead
     * @param stopId
     * @param queryTime
     * @param lookAheadMinutes
     * @param callback
     */
    public void getStopCalls(String stopId, Date queryTime, Integer lookAheadMinutes, ApiCallback<TransitStopScheduledCalls> callback) {
        Call<ApiResponse<TransitStopScheduledCalls>> call = api.getStopCalls(stopId, queryTime, lookAheadMinutes, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get the resource status of a stopId such as a car park or bike dock
     * @param stopId
     * @param callback
     */
    public void getResourceStatus(String stopId, ApiCallback<List<ResourceStatus>> callback) {
        Call<ApiResponse<List<ResourceStatus>>> call = api.getResourceStatus(stopId, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get the real time arrivals and departures information for a stop, formatted for data processing purposes.
     * @param stopId
     * @param maxItems
     * @param lookAheadMinutes
     * @param callback
     */
    public void getStopReport(String stopId, Integer maxItems, Integer lookAheadMinutes, ApiCallback<TransitStopRTIResponse> callback) {
        Call<ApiResponse<TransitStopRTIResponse>> call = api.getStopReport(stopId, maxItems, lookAheadMinutes, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get the real time arrivals and departures information for a stop, formatted for display purposes.
     * @param stopId
     * @param maxItems
     * @param vehiclePassingType
     * @param use24clock
     * @param callback
     */
    public void getStopBoard(String stopId, Integer maxItems, VehiclePassingType vehiclePassingType, Boolean use24clock, ApiCallback<StopBoardResponse> callback) {
        Call<ApiResponse<StopBoardResponse>> call = api.getStopboard(stopId, maxItems, vehiclePassingType, use24clock, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get Journey options for the provided DirectionsRequest object
     * @param request
     * @param callback
     */
    public void getDirections(DirectionsRequest request, ApiCallback<DirectionsResponse> callback) {
        Call<ApiResponse<DirectionsResponse>> call = api.getDirections(request, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get details of a route for a given routeId
     *
     * @param routeId
     * @param routeToken
     * @param lineName
     * @param originStopId
     * @param aimedDepartureTime
     * @param expectedDepartureTime
     * @param callback
     */
    public void getRoute(String routeId, String routeToken, String lineName, String originStopId, Date aimedDepartureTime, Date expectedDepartureTime, ApiCallback<DirectionsResponse> callback) {
        Call<ApiResponse<DirectionsResponse>> call = api.getRoute(routeId, routeToken, lineName, originStopId, aimedDepartureTime, expectedDepartureTime, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }

    /**
     * Get a list of PlacePoints based on the query and supplied location
     * @param name - mandatory
     * @param lat
     * @param lng
     * @param maxResultsPerType
     * @param callback
     */
    public void searchPlacePoints(String name, double lat, double lng, Integer maxResultsPerType, ApiCallback<PlacePointList> callback) {
        Call<ApiResponse<PlacePointList>> call = api.searchPlacePoints(name, lat, lng, null, maxResultsPerType, VERSION, key);
        call.enqueue(wrapCallback(callback));
    }



}
