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


public class MonitoredStopCall extends StopCall implements Serializable {

    @SerializedName("expectedArrivalTime")
    private Date expectedArrivalTime = null;
    @SerializedName("expectedDepartureTime")
    private Date expectedDepartureTime = null;
    @SerializedName("distanceMetres")
    private Integer distanceMetres = null;
    @SerializedName("masterDisplayFormat")
    private Integer masterDisplayFormat = null;
    @SerializedName("vehicleRTI")
    private VehicleRTI vehicleRTI = null;
    @SerializedName("platform")
    private String platform = null;
    @SerializedName("isCancelled")
    private Boolean isCancelled = null;


    /**
     * The real time estimate of when this vehicle is expected to arrive at the stop
     **/
    public Date getExpectedArrivalTime() {
        return expectedArrivalTime;
    }


    /**
     * The real time estimate of when this vehicle is expected to depart from the stop
     **/
    public Date getExpectedDepartureTime() {
        return expectedDepartureTime;
    }


    /**
     * The real time estimate of the distance from the stop, along the route, that the vehicle is presently located at
     **/
    public Integer getDistanceMetres() {
        return distanceMetres;
    }


    /**
     * A value to aid presentation; this indicates whether a time-based (0) or distance-based (1) display is most appropriate for this data
     **/
    public Integer getMasterDisplayFormat() {
        return masterDisplayFormat;
    }

    /**
     * Additional Real Time information for this vehicle - the delay field is not relevant in this context
     **/
    public VehicleRTI getVehicleRTI() {
        return vehicleRTI;
    }


    /**
     * Optional - a label representing the platform at which the vehicle is expected to call when it arrives at this stop
     **/
    public String getPlatform() {
        return platform;
    }


    /**
     * A flag to indicate if the vehicle's trip has been cancelled. If this is set to TRUE any conflicting real time information should be discarded
     **/
    public Boolean getIsCancelled() {
        return isCancelled;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonitoredStopCall {\n");

        sb.append("  expectedArrivalTime: ").append(expectedArrivalTime).append("\n");
        sb.append("  expectedDepartureTime: ").append(expectedDepartureTime).append("\n");
        sb.append("  distanceMetres: ").append(distanceMetres).append("\n");
        sb.append("  masterDisplayFormat: ").append(masterDisplayFormat).append("\n");
        sb.append("  vehicleRTI: ").append(vehicleRTI).append("\n");
        sb.append("  platform: ").append(platform).append("\n");
        sb.append("  isCancelled: ").append(isCancelled).append("\n");
        sb.append("  tripInfo: ").append(getTripInfo()).append("\n");
        sb.append("  routeInfo: ").append(getRouteInfo()).append("\n");
        sb.append("  scheduledCall: ").append(getScheduledCall()).append("\n");
        sb.append("}\n");
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonitoredStopCall that = (MonitoredStopCall) o;

        if (expectedArrivalTime != null ? !expectedArrivalTime.equals(that.expectedArrivalTime) : that.expectedArrivalTime != null)
            return false;
        if (expectedDepartureTime != null ? !expectedDepartureTime.equals(that.expectedDepartureTime) : that.expectedDepartureTime != null)
            return false;
        if (distanceMetres != null ? !distanceMetres.equals(that.distanceMetres) : that.distanceMetres != null)
            return false;
        if (masterDisplayFormat != null ? !masterDisplayFormat.equals(that.masterDisplayFormat) : that.masterDisplayFormat != null)
            return false;
        if (vehicleRTI != null ? !vehicleRTI.equals(that.vehicleRTI) : that.vehicleRTI != null)
            return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null)
            return false;
        return isCancelled != null ? isCancelled.equals(that.isCancelled) : that.isCancelled == null;

    }

    @Override
    public int hashCode() {
        int result = expectedArrivalTime != null ? expectedArrivalTime.hashCode() : 0;
        result = 31 * result + (expectedDepartureTime != null ? expectedDepartureTime.hashCode() : 0);
        result = 31 * result + (distanceMetres != null ? distanceMetres.hashCode() : 0);
        result = 31 * result + (masterDisplayFormat != null ? masterDisplayFormat.hashCode() : 0);
        result = 31 * result + (vehicleRTI != null ? vehicleRTI.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (isCancelled != null ? isCancelled.hashCode() : 0);
        return result;
    }
}
