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

package io.urbanthings.api.transit.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;


/**
 * An object representing a journey planning request
 **/
public class DirectionsRequest implements Serializable {

    @SerializedName("agencyCode")
    private String agencyCode = null;
    @SerializedName("origin")
    private PlacePoint origin = null;
    @SerializedName("destination")
    private PlacePoint destination = null;
    @SerializedName("travelContext")
    private TravelContextType travelContext = null;
    @SerializedName("departureTime")
    private Date departureTime = null;
    @SerializedName("arrivalTime")
    private Date arrivalTime = null;

    @SerializedName("journeyTimeMode")
    private JourneyTimeModeEnum journeyTimeMode = null;
    @SerializedName("maximumJourneys")
    private Integer maximumJourneys = null;
    @SerializedName("options")
    private DirectionsRequestOptions options = null;
    @SerializedName("customOptions")
    private DirectionsRequestCustomOptions customOptions = null;
    @SerializedName("enableRouteGeometry")
    private Boolean enableRouteGeometry = null;
    @SerializedName("enableRealtimeResults")
    private Boolean enableRealtimeResults = null;
    @SerializedName("enableFareResults")
    private Boolean enableFareResults = null;


    /**
     **/
    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }


    /**
     * The origin location where a planned journey should commence. Note that most fields in this PlacePoint object need not be populated - a client need only specify the Origin's Name, Lat and Lng
     **/
    public PlacePoint getOrigin() {
        return origin;
    }

    public void setOrigin(PlacePoint origin) {
        this.origin = origin;
    }


    /**
     * The destination location where a planned journey should end. Note that most fields in this PlacePoint object need not be populated - a client need only specify the Destination's Name, Lat and Lng
     **/
    public PlacePoint getDestination() {
        return destination;
    }

    public void setDestination(PlacePoint destination) {
        this.destination = destination;
    }


    /**
     * The type of journey planning required. Specify 'transit' (default), 'cycling' or 'driving'\r\n Some journey planners also support the context 'walking'
     **/
    public TravelContextType getTravelContext() {
        return travelContext;
    }

    public void setTravelContext(TravelContextType travelContext) {
        this.travelContext = travelContext;
    }


    /**
     * The time at which the user wishes to depart from the Origin point. Optional - defaults to the current time.
     **/
    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * The time at which the user wishes to arrive at the Destination point. This parameter is mutually exclusive to the DepartureTime parameter - i.e. both should not be specified.
     **/
    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     **/
    public JourneyTimeModeEnum getJourneyTimeMode() {
        return journeyTimeMode;
    }

    public void setJourneyTimeMode(JourneyTimeModeEnum journeyTimeMode) {
        this.journeyTimeMode = journeyTimeMode;
    }


    /**
     * The maximum number of suggested journeys to be returned by the planner. This option may not be respected by all planning engines.
     **/
    public Integer getMaximumJourneys() {
        return maximumJourneys;
    }

    public void setMaximumJourneys(Integer maximumJourneys) {
        this.maximumJourneys = maximumJourneys;
    }


    /**
     * Advanced options relating to the journey plan - walking speed, number of changes, etc.
     **/
    public DirectionsRequestOptions getOptions() {
        return options;
    }

    public void setOptions(DirectionsRequestOptions options) {
        this.options = options;
    }


    /**
     * Additional custom options that relate to a specific journey planning engine
     **/
    public DirectionsRequestCustomOptions getCustomOptions() {
        return customOptions;
    }

    public void setCustomOptions(DirectionsRequestCustomOptions customOptions) {
        this.customOptions = customOptions;
    }


    /**
     * Set to TRUE to return polylines representing the geographical coordinates travelled along.
     **/
    public Boolean getEnableRouteGeometry() {
        return enableRouteGeometry;
    }

    public void setEnableRouteGeometry(Boolean enableRouteGeometry) {
        this.enableRouteGeometry = enableRouteGeometry;
    }


    /**
     * Set to TRUE to attempt to return additional real time plannign and route information. This option may not be respected by all planning engines.
     **/
    public Boolean getEnableRealtimeResults() {
        return enableRealtimeResults;
    }

    public void setEnableRealtimeResults(Boolean enableRealtimeResults) {
        this.enableRealtimeResults = enableRealtimeResults;
    }


    /**
     * Set to TRUE to attempt to return any available information regarding fares and ticketing. This option may not be respected by all planning engines.
     **/
    public Boolean getEnableFareResults() {
        return enableFareResults;
    }

    public void setEnableFareResults(Boolean enableFareResults) {
        this.enableFareResults = enableFareResults;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectionsRequest {\n");

        sb.append("  agencyCode: ").append(agencyCode).append("\n");
        sb.append("  origin: ").append(origin).append("\n");
        sb.append("  destination: ").append(destination).append("\n");
        sb.append("  travelContext: ").append(travelContext).append("\n");
        sb.append("  departureTime: ").append(departureTime).append("\n");
        sb.append("  arrivalTime: ").append(arrivalTime).append("\n");
        sb.append("  journeyTimeMode: ").append(journeyTimeMode).append("\n");
        sb.append("  maximumJourneys: ").append(maximumJourneys).append("\n");
        sb.append("  options: ").append(options).append("\n");
        sb.append("  customOptions: ").append(customOptions).append("\n");
        sb.append("  enableRouteGeometry: ").append(enableRouteGeometry).append("\n");
        sb.append("  enableRealtimeResults: ").append(enableRealtimeResults).append("\n");
        sb.append("  enableFareResults: ").append(enableFareResults).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionsRequest that = (DirectionsRequest) o;

        if (agencyCode != null ? !agencyCode.equals(that.agencyCode) : that.agencyCode != null)
            return false;
        if (origin != null ? !origin.equals(that.origin) : that.origin != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null)
            return false;
        if (travelContext != that.travelContext) return false;
        if (departureTime != null ? !departureTime.equals(that.departureTime) : that.departureTime != null)
            return false;
        if (arrivalTime != null ? !arrivalTime.equals(that.arrivalTime) : that.arrivalTime != null)
            return false;
        if (journeyTimeMode != that.journeyTimeMode) return false;
        if (maximumJourneys != null ? !maximumJourneys.equals(that.maximumJourneys) : that.maximumJourneys != null)
            return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (customOptions != null ? !customOptions.equals(that.customOptions) : that.customOptions != null)
            return false;
        if (enableRouteGeometry != null ? !enableRouteGeometry.equals(that.enableRouteGeometry) : that.enableRouteGeometry != null)
            return false;
        if (enableRealtimeResults != null ? !enableRealtimeResults.equals(that.enableRealtimeResults) : that.enableRealtimeResults != null)
            return false;
        return enableFareResults != null ? enableFareResults.equals(that.enableFareResults) : that.enableFareResults == null;

    }

    @Override
    public int hashCode() {
        int result = agencyCode != null ? agencyCode.hashCode() : 0;
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (travelContext != null ? travelContext.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        result = 31 * result + (journeyTimeMode != null ? journeyTimeMode.hashCode() : 0);
        result = 31 * result + (maximumJourneys != null ? maximumJourneys.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (customOptions != null ? customOptions.hashCode() : 0);
        result = 31 * result + (enableRouteGeometry != null ? enableRouteGeometry.hashCode() : 0);
        result = 31 * result + (enableRealtimeResults != null ? enableRealtimeResults.hashCode() : 0);
        result = 31 * result + (enableFareResults != null ? enableFareResults.hashCode() : 0);
        return result;
    }


    public enum TravelContextType {
        @SerializedName("0")
        TRANSIT(0),
        @SerializedName("1")
        CYCLING(1),
        @SerializedName("2")
        DRIVING(2),
        @SerializedName("3")
        WALKING(3);

        private final int value;

        private TravelContextType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum JourneyTimeModeEnum {
        ZERO, ONE
        //0,1,
    }

}
