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


public class StopCall implements Serializable {

    @SerializedName("tripInfo")
    private TransitTripInfo tripInfo = null;
    @SerializedName("routeInfo")
    private TransitRouteInfo routeInfo = null;
    @SerializedName("scheduledCall")
    private TransitScheduledCall scheduledCall = null;


    /**
     * This provides information about the destination (headsign), origin, vehicle registration, etc.
     **/
    public TransitTripInfo getTripInfo() {
        return tripInfo;
    }


    /**
     * This provides information about the line name, vehicle mode, operator name, etc.
     **/
    public TransitRouteInfo getRouteInfo() {
        return routeInfo;
    }


    /**
     * This provides information about the scheduled arrival/departure time
     **/
    public TransitScheduledCall getScheduledCall() {
        return scheduledCall;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopCall {\n");

        sb.append("  tripInfo: ").append(tripInfo).append("\n");
        sb.append("  routeInfo: ").append(routeInfo).append("\n");
        sb.append("  scheduledCall: ").append(scheduledCall).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopCall stopCall = (StopCall) o;

        if (tripInfo != null ? !tripInfo.equals(stopCall.tripInfo) : stopCall.tripInfo != null)
            return false;
        if (routeInfo != null ? !routeInfo.equals(stopCall.routeInfo) : stopCall.routeInfo != null)
            return false;
        return scheduledCall != null ? scheduledCall.equals(stopCall.scheduledCall) : stopCall.scheduledCall == null;

    }

    @Override
    public int hashCode() {
        int result = tripInfo != null ? tripInfo.hashCode() : 0;
        result = 31 * result + (routeInfo != null ? routeInfo.hashCode() : 0);
        result = 31 * result + (scheduledCall != null ? scheduledCall.hashCode() : 0);
        return result;
    }
}
