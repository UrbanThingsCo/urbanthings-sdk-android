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

package io.urbanthings.api.transit.internal;

import java.util.Date;
import java.util.List;

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
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface RetrofitTransitApi {
    @GET("static/transitstops")
    Call<ApiResponse<List<TransitStop>>> getStops(@Query("minlat") double minLat, @Query("maxlat") double maxLat,
                                                            @Query("minlng") double minLng, @Query("maxlng") double maxLng,
                                                            @Query("stopModes") String stopMode,
                                                            @Query("stopName") String stopName,
                                                            @Query("stopIDs") String stopIds,
                                                            @Query("importSource") String importSource,
                                                            @Query("version") String version,
                                                            @Query("apikey") String apiKey);

    @GET("static/transitstops")
    Call<ApiResponse<List<TransitStop>>> getStops(@Query("centerLat") double minLat, @Query("centerLng") double maxLat,
                                                  @Query("radius") double radius,
                                                  @Query("stopModes") String stopMode,
                                                  @Query("stopName") String stopName,
                                                  @Query("stopIDs") String stopIds,
                                                  @Query("importSource") String importSource,
                                                  @Query("version") String version,
                                                  @Query("apikey") String apiKey);

    @GET("static/placepoints")
    Call<ApiResponse<PlacePointList>> getPlacePoints(@Query("minlat") double minLat, @Query("maxlat") double maxLat,
                                                               @Query("minlng") double minLng, @Query("maxlng") double maxLng,
                                                               @Query("placepointtypes") String placePointTypes,
                                                               @Query("maxResults") int maxResults,
                                                               @Query("version") String version,
                                                               @Query("apikey") String apiKey);

    @GET("static/placepoints")
    Call<ApiResponse<PlacePointList>> getPlacePoints(@Query("centerlat") double centerLat, @Query("centerlng") double centerLng,
                                                               @Query("radius") int radius,
                                                               @Query("placepointtypes") String placePointTypes,
                                                               @Query("maxResults") int maxResults,
                                                               @Query("version") String version,
                                                               @Query("apikey") String apiKey);


    @GET("static/places/List")
    Call<ApiResponse<PlacePointList>> searchPlacePoints(@Query("name") String name, @Query("lat") double lat, @Query("lng") double lng,
                                                                  @Query("countryCode") String countryCode,
                                                                  @Query("maxResultsPerType") Integer maxResultsPerType,
                                                                  @Query("version") String version, @Query("apikey") String apiKey);

    @GET("static/routes/info/LineName")
    Call<ApiResponse<List<TransitDetailedRouteInfo>>> searchRoutes(@Query("lineName") String lineName,
                                                                             @Query("exactMatch") Boolean exactMatch,
                                                                             @Query("importSource") String importSource,
                                                                             @Query("agencyID") String agencyId,
                                                                             @Query("agencyID") String agencyRegion,
                                                                             @Query("lat") Double lat, @Query("lng") Double lng,
                                                                             @Query("version") String version,
                                                                             @Query("apikey") String apiKey);

    @GET("static/routes/info/Source")
    Call<ApiResponse<List<TransitDetailedRouteInfo>>> getRoutes(@Query("agencyID") String agencyId,
                                                                          @Query("importSource") String importSource,
                                                                          @Query("version") String version,
                                                                          @Query("apikey") String apiKey);

    @GET("static/routes/info/CallingAtStop")
    Call<ApiResponse<List<TransitDetailedRouteInfo>>> getRoutesForStop(@Query("stopID") String stopId,
                                                                                 @Query("version") String version,
                                                                                 @Query("apikey") String apiKey);

    @GET("static/trips")
    Call<ApiResponse<List<TransitTrip>>> getTrips(@Query("routeID") String routeId,
                                                            @Query("tripID") String tripId,
                                                            @Query("originStopID") String originStopId,
                                                            @Query("destStopID") String destStopId,
                                                            @Query("includePolyLines") Boolean includePolyLines,
                                                            @Query("includeStopCoordinates") Boolean includeStopCoordinates,
                                                            @Query("version") String version,
                                                            @Query("apikey") String apiKey);



    @GET("static/tripgroups/bycalendar")
    Call<ApiResponse<List<TransitTripCalendarGroup>>> getTripsByCalendar(@Query("routeID") String routeId,
                                                                                   @Query("includePolyLines") Boolean includePolyLines,
                                                                                   @Query("includeStopCoordinates") Boolean includeStopCoordinates,
                                                                                   @Query("version") String version,
                                                                                   @Query("apikey") String apiKey);

    @GET("static/stopcalls")
    Call<ApiResponse<TransitStopScheduledCalls>> getStopCalls(@Query("stopID") String stopId,
                                                                        @Query("queryTime") Date queryTime,
                                                                        @Query("lookAheadMinutes") Integer lookAheadMinutes,
                                                                        @Query("version") String version,
                                                                        @Query("apikey") String apiKey);


    @GET("static/routes")
    Call<ApiResponse<DirectionsResponse>> getRoute(@Query("routeID") String routeId,
                                                             @Query("routeToken") String routeToken,
                                                             @Query("lineName") String lineName,
                                                             @Query("originstopid") String originStopId,
                                                             @Query("aimeddeparturetime") Date aimedDepartureTime,
                                                             @Query("expecteddeparturetime") Date expectedDepartureTime,
                                                             @Query("version") String version,
                                                             @Query("apikey") String apiKey);


    @GET("rti/report")
    Call<ApiResponse<TransitStopRTIResponse>> getStopReport(@Query("stopID") String stopId,
                                                                      @Query("maxItems") Integer maxItems,
                                                                      @Query("lookAheadMinutes") Integer lookAheadMinutes,
                                                                      @Query("version") String version,
                                                                      @Query("apikey") String apiKey);

    @GET("rti/stopboard")
    Call<ApiResponse<StopBoardResponse>> getStopboard(@Query("stopID") String stopId,
                                                                @Query("maxItems") Integer maxItems,
                                                                @Query("vehiclePassingType") VehiclePassingType vehiclePassingType,
                                                                @Query("use24clock") Boolean use24clock,
                                                                @Query("version") String version,
                                                                @Query("apikey") String apiKey);

    @GET("rti/resources/status")
    Call<ApiResponse<List<ResourceStatus>>> getResourceStatus(@Query("stopIDs") String stopId,
                                                                        @Query("version") String version,
                                                                        @Query("apikey") String apiKey);

    @POST("plan/directions")
    Call<ApiResponse<DirectionsResponse>> getDirections(@Body DirectionsRequest request,
                                                                  @Query("version") String version,
                                                                  @Query("apikey") String apiKey);



}