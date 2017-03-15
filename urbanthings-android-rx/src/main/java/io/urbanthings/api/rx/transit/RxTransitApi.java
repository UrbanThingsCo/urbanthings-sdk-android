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

import java.util.Date;
import java.util.List;

import io.urbanthings.api.rx.BaseRxApi;
import io.urbanthings.api.rx.transit.internal.RetrofitRxTransitApi;
import io.urbanthings.api.transit.model.ApiResponse;
import io.urbanthings.api.transit.model.DirectionsRequest;
import io.urbanthings.api.transit.model.DirectionsResponse;
import io.urbanthings.api.transit.model.PlacePointList;
import io.urbanthings.api.transit.model.PlacePointType;
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

import retrofit2.adapter.rxjava.Result;
import rx.Single;
import rx.functions.Func1;

public class RxTransitApi extends BaseRxApi {

    private static final String VERSION = "2.0";
    private RetrofitRxTransitApi api;
    private String key;
    protected RxTransitApi(RetrofitRxTransitApi api, String key) {
        this.api = api;
        this.key = key;
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
     * @return
     */
    public Single<List<TransitStop>> getStopsInRect(double minLat, double maxLat, double minLng, double maxLng, List<VehicleType> stopModes) {
        return api.getStops(minLat, maxLat, minLng, maxLng, vehicleTypeListToCommaSeperatedList(stopModes), null, null, null, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitStop>>>, List<TransitStop>>() {
            @Override
            public List<TransitStop> call(Result<ApiResponse<List<TransitStop>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get a List of TransitStops for a given radius. The list can be filtered by matching
     * against the name of the transit stop, as well as 0 or more VehicleTypes
     *
     * @param centerLat
     * @param centerLng
     * @param radius
     * @param stopModes List of VehicleTypes
     * @return
     */
    public Single<List<TransitStop>> getStopsInRadius(double centerLat, double centerLng, double radius, List<VehicleType> stopModes) {
        return api.getStops(centerLat, centerLng, radius, vehicleTypeListToCommaSeperatedList(stopModes), null, null, null, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitStop>>>, List<TransitStop>>() {
            @Override
            public List<TransitStop> call(Result<ApiResponse<List<TransitStop>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
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
     * @return
     */
    public Single<PlacePointList> getPlacePointsInRect(double minLat, double maxLat, double minLng, double maxLng, List<PlacePointType> placePointTypes, Integer maxResults) {
        return api.getPlacePoints(minLat, maxLat, minLng, maxLng, placePointTypeListToCommaSeperatedList(placePointTypes), maxResults, VERSION, key).map(new Func1<Result<ApiResponse<PlacePointList>>, PlacePointList>() {
            @Override
            public PlacePointList call(Result<ApiResponse<PlacePointList>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
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
     * @return
     */
    public Single<PlacePointList> getPlacePointsInRadius(double lat, double lng, int radius, List<PlacePointType> placePointTypes, Integer maxResults) {
        return api.getPlacePoints(lat, lng, radius,  placePointTypeListToCommaSeperatedList(placePointTypes), maxResults, VERSION, key).map(new Func1<Result<ApiResponse<PlacePointList>>, PlacePointList>() {
            @Override
            public PlacePointList call(Result<ApiResponse<PlacePointList>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get a list of Routes and associated info for a given transport agency matching the supplied query
     *
     * @param lineName
     * @param exactMatch
     * @param agencyId
     * @param agencyRegion
     * @return
     */
    public Single<List<TransitDetailedRouteInfo>> searchRoutesByAgency(String lineName, Boolean exactMatch, String agencyId, String agencyRegion) {
        return api.searchRoutes(lineName, exactMatch, null, agencyId, agencyRegion, null, null, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitDetailedRouteInfo>>>, List<TransitDetailedRouteInfo>>() {
            @Override
            public List<TransitDetailedRouteInfo> call(Result<ApiResponse<List<TransitDetailedRouteInfo>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get a list of Routes and associated info near the supplied location matching the supplied query
     * @param lineName
     * @param exactMatch
     * @param lat
     * @param lng
     * @return
     */
    public Single<List<TransitDetailedRouteInfo>> searchRoutesByLocation(String lineName, Boolean exactMatch, Double lat, Double lng) {
        return api.searchRoutes(lineName, exactMatch, null, null, null, lat, lng, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitDetailedRouteInfo>>>, List<TransitDetailedRouteInfo>>() {
            @Override
            public List<TransitDetailedRouteInfo> call(Result<ApiResponse<List<TransitDetailedRouteInfo>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get a list of Routes and associated info for a given transport agency
     *
     * @param agencyId
     * @return
     */
    public Single<List<TransitDetailedRouteInfo>> getRoutesByAgency(String agencyId) {
        return api.getRoutes(agencyId, null, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitDetailedRouteInfo>>>, List<TransitDetailedRouteInfo>>() {
            @Override
            public List<TransitDetailedRouteInfo> call(Result<ApiResponse<List<TransitDetailedRouteInfo>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get a list of Routes and associated info for a given Stop
     * @param stopId
     * @return
     */
    public Single<List<TransitDetailedRouteInfo>> getRoutesForStop(String stopId) {
        return api.getRoutesForStop(stopId, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitDetailedRouteInfo>>>, List<TransitDetailedRouteInfo>>() {
            @Override
            public List<TransitDetailedRouteInfo> call(Result<ApiResponse<List<TransitDetailedRouteInfo>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get a Trip for a given TripId
     * @param tripId
     * @param originStopId
     * @param destinationStopId
     * @param includePolyLines
     * @param includeStopCoordinates
     * @return
     */
    public Single<TransitTrip> getTrip(String tripId, String originStopId, String destinationStopId, Boolean includePolyLines, Boolean includeStopCoordinates) {
        return api.getTrips(null, tripId, originStopId, destinationStopId, includePolyLines, includeStopCoordinates, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitTrip>>>, TransitTrip>() {
            @Override
            public TransitTrip call(Result<ApiResponse<List<TransitTrip>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data.size() > 0 ? apiResponseResult.response().body().data.get(0) : new TransitTrip();
            }
        });
    }

    /**
     *  Get a List of Trips for a given routeId
     * @param routeId
     * @param originStopId
     * @param destinationStopId
     * @param includePolyLines
     * @param includeStopCoordinates
     * @return
     */
    public Single<List<TransitTrip>> getTripsForRoute(String routeId, String originStopId, String destinationStopId, Boolean includePolyLines, Boolean includeStopCoordinates) {
        return api.getTrips(routeId, null, originStopId, destinationStopId, includePolyLines, includeStopCoordinates, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitTrip>>>, List<TransitTrip>>() {
            @Override
            public List<TransitTrip> call(Result<ApiResponse<List<TransitTrip>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     *
     * @param routeId
     * @param includePolyLines
     * @param includeStopCoordinates
     * @return
     */
    public Single<List<TransitTripCalendarGroup>> getTripsByCalendarGroups(String routeId, Boolean includePolyLines, Boolean includeStopCoordinates) {
        return api.getTripsByCalendar(routeId, includePolyLines, includeStopCoordinates, VERSION, key).map(new Func1<Result<ApiResponse<List<TransitTripCalendarGroup>>>, List<TransitTripCalendarGroup>>() {
            @Override
            public List<TransitTripCalendarGroup> call(Result<ApiResponse<List<TransitTripCalendarGroup>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     *  Get a List of TransitStopScheduledCalls for a given stopId, with an optional query time and look ahead
     * @param stopId
     * @param queryTime
     * @param lookAheadMinutes
     * @return
     */
    public Single<TransitStopScheduledCalls> getStopCalls(String stopId, Date queryTime, Integer lookAheadMinutes) {
        return api.getStopCalls(stopId, queryTime, lookAheadMinutes, VERSION, key).map(new Func1<Result<ApiResponse<TransitStopScheduledCalls>>, TransitStopScheduledCalls>() {
            @Override
            public TransitStopScheduledCalls call(Result<ApiResponse<TransitStopScheduledCalls>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get the resource status of a stopId such as a car park or bike dock
     * @param stopId
     * @return
     */
    public Single<List<ResourceStatus>> getResourceStatus(String stopId) {
        return api.getResourceStatus(stopId, VERSION, key).map(new Func1<Result<ApiResponse<List<ResourceStatus>>>, List<ResourceStatus>>() {
            @Override
            public List<ResourceStatus> call(Result<ApiResponse<List<ResourceStatus>>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get the real time arrivals and departures information for a stop, formatted for data processing purposes.
     * @param stopId
     * @param maxItems
     * @param lookAheadMinutes
     * @return
     */
    public Single<TransitStopRTIResponse> getStopReport(String stopId, Integer maxItems, Integer lookAheadMinutes) {
        return api.getStopReport(stopId, maxItems, lookAheadMinutes, VERSION, key).map(new Func1<Result<ApiResponse<TransitStopRTIResponse>>, TransitStopRTIResponse>() {
            @Override
            public TransitStopRTIResponse call(Result<ApiResponse<TransitStopRTIResponse>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get the real time arrivals and departures information for a stop, formatted for display purposes.
     * @param stopId
     * @param maxItems
     * @param vehiclePassingType
     * @param use24clock
     * @return
     */
    public Single<StopBoardResponse> getStopBoard(String stopId, Integer maxItems, VehiclePassingType vehiclePassingType, Boolean use24clock) {
        return api.getStopboard(stopId, maxItems, vehiclePassingType, use24clock, VERSION, key).map(new Func1<Result<ApiResponse<StopBoardResponse>>, StopBoardResponse>() {
            @Override
            public StopBoardResponse call(Result<ApiResponse<StopBoardResponse>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get Journey options for the provided DirectionsRequest object
     * @param request
     * @return
     */
    public Single<DirectionsResponse> getDirections(DirectionsRequest request) {
        return api.getDirections(request, VERSION, key).map(new Func1<Result<ApiResponse<DirectionsResponse>>, DirectionsResponse>() {
            @Override
            public DirectionsResponse call(Result<ApiResponse<DirectionsResponse>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
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
     * @return
     */
    public Single<DirectionsResponse> getRoute(String routeId, String routeToken, String lineName, String originStopId, Date aimedDepartureTime, Date expectedDepartureTime) {
        return api.getRoute(routeId, routeToken, lineName, originStopId, aimedDepartureTime, expectedDepartureTime, VERSION, key).map(new Func1<Result<ApiResponse<DirectionsResponse>>, DirectionsResponse>() {
            @Override
            public DirectionsResponse call(Result<ApiResponse<DirectionsResponse>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }

    /**
     * Get a list of PlacePoints based on the query and supplied location
     * @param name
     * @param lat
     * @param lng
     * @param maxResultsPerType
     * @return
     */
    public Single<PlacePointList> searchPlacePoints(String name, double lat, double lng, Integer maxResultsPerType) {
        return api.searchPlacePoints(name, lat, lng, null, maxResultsPerType, VERSION, key).map(new Func1<Result<ApiResponse<PlacePointList>>, PlacePointList>() {
            @Override
            public PlacePointList call(Result<ApiResponse<PlacePointList>> apiResponseResult) {
                handleResult(apiResponseResult);
                return apiResponseResult.response().body().data;
            }
        });
    }


}
