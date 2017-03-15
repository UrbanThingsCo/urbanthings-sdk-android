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


/**
 * Real-time information relating to a vehicle
 **/
public class VehicleRTI implements Serializable {

    @SerializedName("agencyCode")
    private String agencyCode = null;
    @SerializedName("vehicleID")
    private String vehicleID = null;
    @SerializedName("delayOffsetMinutes")
    private Double delayOffsetMinutes = null;
    @SerializedName("vehicleRegistrationCode")
    private String vehicleRegistrationCode = null;
    @SerializedName("vehicleCapacityTotalPassengers")
    private Integer vehicleCapacityTotalPassengers = null;
    @SerializedName("vehicleOccupancyPassengers")
    private Integer vehicleOccupancyPassengers = null;
    @SerializedName("isCancelled")
    private Boolean isCancelled = null;


    /**
     * The unique identifier of the Agency operating this vehicle. If the information comes from our systems, a corresponding TransitAgency object will exist with this ID
     **/
    public String getAgencyCode() {
        return agencyCode;
    }


    /**
     * In some systems this ID allows the vehicle to be uniquely identified
     **/
    public String getVehicleID() {
        return vehicleID;
    }


    /**
     * Inidcates how late, or early, the vehicle is presently running. A value of NULL indicates no available data
     **/
    public Double getDelayOffsetMinutes() {
        return delayOffsetMinutes;
    }


    /**
     * The vehicle registration number, as publicly displayed
     **/
    public String getVehicleRegistrationCode() {
        return vehicleRegistrationCode;
    }


    /**
     * The number of passengers that this vehicle is able to carry
     **/
    public Integer getVehicleCapacityTotalPassengers() {
        return vehicleCapacityTotalPassengers;
    }


    /**
     * The number of passengers presently on board this vehicle
     **/
    public Integer getVehicleOccupancyPassengers() {
        return vehicleOccupancyPassengers;
    }


    /**
     * Indicates whether the vehicle been cancelled (either in advance, or en-route)
     **/
    public Boolean getIsCancelled() {
        return isCancelled;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VehicleRTI {\n");

        sb.append("  agencyCode: ").append(agencyCode).append("\n");
        sb.append("  vehicleID: ").append(vehicleID).append("\n");
        sb.append("  delayOffsetMinutes: ").append(delayOffsetMinutes).append("\n");
        sb.append("  vehicleRegistrationCode: ").append(vehicleRegistrationCode).append("\n");
        sb.append("  vehicleCapacityTotalPassengers: ").append(vehicleCapacityTotalPassengers).append("\n");
        sb.append("  vehicleOccupancyPassengers: ").append(vehicleOccupancyPassengers).append("\n");
        sb.append("  isCancelled: ").append(isCancelled).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleRTI that = (VehicleRTI) o;

        if (agencyCode != null ? !agencyCode.equals(that.agencyCode) : that.agencyCode != null)
            return false;
        if (vehicleID != null ? !vehicleID.equals(that.vehicleID) : that.vehicleID != null)
            return false;
        if (delayOffsetMinutes != null ? !delayOffsetMinutes.equals(that.delayOffsetMinutes) : that.delayOffsetMinutes != null)
            return false;
        if (vehicleRegistrationCode != null ? !vehicleRegistrationCode.equals(that.vehicleRegistrationCode) : that.vehicleRegistrationCode != null)
            return false;
        if (vehicleCapacityTotalPassengers != null ? !vehicleCapacityTotalPassengers.equals(that.vehicleCapacityTotalPassengers) : that.vehicleCapacityTotalPassengers != null)
            return false;
        if (vehicleOccupancyPassengers != null ? !vehicleOccupancyPassengers.equals(that.vehicleOccupancyPassengers) : that.vehicleOccupancyPassengers != null)
            return false;
        return isCancelled != null ? isCancelled.equals(that.isCancelled) : that.isCancelled == null;

    }

    @Override
    public int hashCode() {
        int result = agencyCode != null ? agencyCode.hashCode() : 0;
        result = 31 * result + (vehicleID != null ? vehicleID.hashCode() : 0);
        result = 31 * result + (delayOffsetMinutes != null ? delayOffsetMinutes.hashCode() : 0);
        result = 31 * result + (vehicleRegistrationCode != null ? vehicleRegistrationCode.hashCode() : 0);
        result = 31 * result + (vehicleCapacityTotalPassengers != null ? vehicleCapacityTotalPassengers.hashCode() : 0);
        result = 31 * result + (vehicleOccupancyPassengers != null ? vehicleOccupancyPassengers.hashCode() : 0);
        result = 31 * result + (isCancelled != null ? isCancelled.hashCode() : 0);
        return result;
    }
}
