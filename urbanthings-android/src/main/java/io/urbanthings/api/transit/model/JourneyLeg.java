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

public class JourneyLeg implements Serializable {

    @SerializedName("summaryHTML")
    private String summaryHTML = null;
    @SerializedName("originPlacePointID")
    private String originPlacePointID = null;
    @SerializedName("destinationPlacePointID")
    private String destinationPlacePointID = null;
    @SerializedName("arrivalTime")
    private Date arrivalTime = null;
    @SerializedName("departureTime")
    private Date departureTime = null;
    @SerializedName("vehicleType")
    private VehicleType vehicleType = null;
    @SerializedName("duration")
    private Long duration = null;
    @SerializedName("distance")
    private Long distance = null;
    @SerializedName("polyline")
    private String polyline = null;


    /**
     * A localized instruction, displayed to the user in journey planning results, e.g. '&lt;p&gt;Take the 126 bus towards Heathrow&lt;/p&gt;'
     **/
    public String getSummaryHTML() {
        return summaryHTML;
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

    /**
     * The arrival time, in Local Time. i.e. includes a time zone offset to allow for correct presentation of the time as text
     **/
    public Date getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Stores the departure time, in Local Time. i.e. includes a time zone offset to allow for correct presentation of the time as text
     **/
    public Date getDepartureTime() {
        return departureTime;
    }


    /**
     **/
    public VehicleType getVehicleType() {
        return vehicleType;
    }


    /**
     * Duration of this journey leg, measured in seconds.
     **/
    public Long getDuration() {
        return duration;
    }


    /**
     * The distance covered by this journey leg, measured in metres. Where possible, this distance will represent the actual distance travelled, not a direct span between origin and destination, i.e. not 'as the crow flies'.
     **/
    public Long getDistance() {
        return distance;
    }


    /**
     * A representation of the geographical co-ordinates travelled as a passenger moves along this leg; can be used to overlay a polyline onto a map to represent the leg. The polyline coordinates are represented in Encoded Polyline Algorithm format, see https://developers.google.com/maps/documentation/utilities/polylinealgorithm for additional information on decoding / encoding
     **/
    public String getPolyline() {
        return polyline;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JourneyLeg {\n");

        sb.append("  summaryHTML: ").append(summaryHTML).append("\n");
        sb.append("  originPlacePointID: ").append(originPlacePointID).append("\n");
        sb.append("  destinationPlacePointID: ").append(destinationPlacePointID).append("\n");
        sb.append("  arrivalTime: ").append(arrivalTime).append("\n");
        sb.append("  departureTime: ").append(departureTime).append("\n");
        sb.append("  vehicleType: ").append(vehicleType).append("\n");
        sb.append("  duration: ").append(duration).append("\n");
        sb.append("  distance: ").append(distance).append("\n");
        sb.append("  polyline: ").append(polyline).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JourneyLeg that = (JourneyLeg) o;

        if (summaryHTML != null ? !summaryHTML.equals(that.summaryHTML) : that.summaryHTML != null)
            return false;
        if (originPlacePointID != null ? !originPlacePointID.equals(that.originPlacePointID) : that.originPlacePointID != null)
            return false;
        if (destinationPlacePointID != null ? !destinationPlacePointID.equals(that.destinationPlacePointID) : that.destinationPlacePointID != null)
            return false;
        if (arrivalTime != null ? !arrivalTime.equals(that.arrivalTime) : that.arrivalTime != null)
            return false;
        if (departureTime != null ? !departureTime.equals(that.departureTime) : that.departureTime != null)
            return false;
        if (vehicleType != that.vehicleType) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null)
            return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null)
            return false;
        return polyline != null ? polyline.equals(that.polyline) : that.polyline == null;

    }

    @Override
    public int hashCode() {
        int result = summaryHTML != null ? summaryHTML.hashCode() : 0;
        result = 31 * result + (originPlacePointID != null ? originPlacePointID.hashCode() : 0);
        result = 31 * result + (destinationPlacePointID != null ? destinationPlacePointID.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (polyline != null ? polyline.hashCode() : 0);
        return result;
    }
}
