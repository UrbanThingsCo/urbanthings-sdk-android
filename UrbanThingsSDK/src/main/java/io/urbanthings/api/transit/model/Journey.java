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
import java.util.List;


public class Journey implements Serializable {

    @SerializedName("arrivalTime")
    private Date arrivalTime = null;
    @SerializedName("departureTime")
    private Date departureTime = null;
    @SerializedName("summaryHTML")
    private String summaryHTML = null;
    @SerializedName("duration")
    private Long duration = null;
    @SerializedName("legs")
    private List<JourneyLeg> legs = null;
    @SerializedName("originPlacePointID")
    private String originPlacePointID = null;
    @SerializedName("destinationPlacePointID")
    private String destinationPlacePointID = null;


    /**
     * Stores the arrival time, in Local Time. i.e. include an Offset to allow correct server-side formatting of the time as text
     **/
    public Date getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Stores the departure time, in Local Time. i.e. include an Offset to allow correct server-side formatting of the time as text
     **/
    public Date getDepartureTime() {
        return departureTime;
    }


    /**
     * A localized instruction, displayed to the user in journey planning results, e.g. '<p>Barons Park to Hay Lane</p>'
     **/
    public String getSummaryHTML() {
        return summaryHTML;
    }


    /**
     **/
    public Long getDuration() {
        return duration;
    }


    /**
     **/
    public List<JourneyLeg> getLegs() {
        return legs;
    }


    /**
     **/
    public String getOriginPlacePointID() {
        return originPlacePointID;
    }


    /**
     **/
    public String getDestinationPlacePointID() {
        return destinationPlacePointID;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Journey {\n");

        sb.append("  arrivalTime: ").append(arrivalTime).append("\n");
        sb.append("  departureTime: ").append(departureTime).append("\n");
        sb.append("  summaryHTML: ").append(summaryHTML).append("\n");
        sb.append("  duration: ").append(duration).append("\n");
        sb.append("  legs: ").append(legs).append("\n");
        sb.append("  originPlacePointID: ").append(originPlacePointID).append("\n");
        sb.append("  destinationPlacePointID: ").append(destinationPlacePointID).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journey journey = (Journey) o;

        if (arrivalTime != null ? !arrivalTime.equals(journey.arrivalTime) : journey.arrivalTime != null)
            return false;
        if (departureTime != null ? !departureTime.equals(journey.departureTime) : journey.departureTime != null)
            return false;
        if (summaryHTML != null ? !summaryHTML.equals(journey.summaryHTML) : journey.summaryHTML != null)
            return false;
        if (duration != null ? !duration.equals(journey.duration) : journey.duration != null)
            return false;
        if (legs != null ? !legs.equals(journey.legs) : journey.legs != null) return false;
        if (originPlacePointID != null ? !originPlacePointID.equals(journey.originPlacePointID) : journey.originPlacePointID != null)
            return false;
        return destinationPlacePointID != null ? destinationPlacePointID.equals(journey.destinationPlacePointID) : journey.destinationPlacePointID == null;

    }

    @Override
    public int hashCode() {
        int result = arrivalTime != null ? arrivalTime.hashCode() : 0;
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (summaryHTML != null ? summaryHTML.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (legs != null ? legs.hashCode() : 0);
        result = 31 * result + (originPlacePointID != null ? originPlacePointID.hashCode() : 0);
        result = 31 * result + (destinationPlacePointID != null ? destinationPlacePointID.hashCode() : 0);
        return result;
    }
}
