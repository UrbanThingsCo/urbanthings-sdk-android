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


public class TransitTripInfo implements Serializable {

    @SerializedName("agencyCode")
    private String agencyCode = null;
    @SerializedName("tripID")
    private String tripID = null;
    @SerializedName("originName")
    private String originName = null;
    @SerializedName("originPrimaryCode")
    private String originPrimaryCode = null;
    @SerializedName("headsign")
    private String headsign = null;
    @SerializedName("directionName")
    private String directionName = null;
    @SerializedName("directionID")
    private Integer directionID = null;
    @SerializedName("vehicleID")
    private String vehicleID = null;
    @SerializedName("isWheelchairAccessible")
    private Boolean isWheelchairAccessible = null;


    /**
     * A unique identifier representing the agency that operates this trip.
     **/
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * A unique code that represents this trip. Note that IDs in some regions may change periodically and thus should not be stored on the client.
     **/
    public String getTripID() {
        return tripID;
    }


    /**
     * The name of the origin stop on this trip.
     **/
    public String getOriginName() {
        return originName;
    }


    /**
     * The primary code of the origin stop on this trip.
     **/
    public String getOriginPrimaryCode() {
        return originPrimaryCode;
    }


    /**
     * The name of the ultimate destination on this trip.
     **/
    public String getHeadsign() {
        return headsign;
    }


    /**
     * A descriptive name for the direction travelled on this trip, with relation to the route - e.g. 'Outbound'. Does not apply to all transit modes.
     **/
    public String getDirectionName() {
        return directionName;
    }


    /**
     * A numeric identifier for the direction travelled on this trip, with relation to the route. e.g. A bus route may designate one direction as 'outbound' (1) and another direction as 'inbound' (2). Does not apply to all transit modes.
     **/
    public Integer getDirectionID() {
        return directionID;
    }


    /**
     * The ID of the vehicle scheduled to make the trip. This may or may not be the same as the VehicleID that is assigned when the vehicle actually runs (see VehicleRTI)
     **/
    public String getVehicleID() {
        return vehicleID;
    }


    /**
     * Whether this trip is accessible to wheelchair users. This information may not be available in some data sets.
     **/
    public Boolean getIsWheelchairAccessible() {
        return isWheelchairAccessible;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitTripInfo {\n");

        sb.append("  agencyCode: ").append(agencyCode).append("\n");
        sb.append("  tripID: ").append(tripID).append("\n");
        sb.append("  originName: ").append(originName).append("\n");
        sb.append("  originPrimaryCode: ").append(originPrimaryCode).append("\n");
        sb.append("  headsign: ").append(headsign).append("\n");
        sb.append("  directionName: ").append(directionName).append("\n");
        sb.append("  directionID: ").append(directionID).append("\n");
        sb.append("  vehicleID: ").append(vehicleID).append("\n");
        sb.append("  isWheelchairAccessible: ").append(isWheelchairAccessible).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitTripInfo that = (TransitTripInfo) o;

        if (agencyCode != null ? !agencyCode.equals(that.agencyCode) : that.agencyCode != null)
            return false;
        if (tripID != null ? !tripID.equals(that.tripID) : that.tripID != null) return false;
        if (originName != null ? !originName.equals(that.originName) : that.originName != null)
            return false;
        if (originPrimaryCode != null ? !originPrimaryCode.equals(that.originPrimaryCode) : that.originPrimaryCode != null)
            return false;
        if (headsign != null ? !headsign.equals(that.headsign) : that.headsign != null)
            return false;
        if (directionName != null ? !directionName.equals(that.directionName) : that.directionName != null)
            return false;
        if (directionID != null ? !directionID.equals(that.directionID) : that.directionID != null)
            return false;
        if (vehicleID != null ? !vehicleID.equals(that.vehicleID) : that.vehicleID != null)
            return false;
        return isWheelchairAccessible != null ? isWheelchairAccessible.equals(that.isWheelchairAccessible) : that.isWheelchairAccessible == null;

    }

    @Override
    public int hashCode() {
        int result = agencyCode != null ? agencyCode.hashCode() : 0;
        result = 31 * result + (tripID != null ? tripID.hashCode() : 0);
        result = 31 * result + (originName != null ? originName.hashCode() : 0);
        result = 31 * result + (originPrimaryCode != null ? originPrimaryCode.hashCode() : 0);
        result = 31 * result + (headsign != null ? headsign.hashCode() : 0);
        result = 31 * result + (directionName != null ? directionName.hashCode() : 0);
        result = 31 * result + (directionID != null ? directionID.hashCode() : 0);
        result = 31 * result + (vehicleID != null ? vehicleID.hashCode() : 0);
        result = 31 * result + (isWheelchairAccessible != null ? isWheelchairAccessible.hashCode() : 0);
        return result;
    }
}
