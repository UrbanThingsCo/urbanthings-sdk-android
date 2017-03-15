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
import java.util.List;


public class TransitJourneyLeg extends JourneyLeg implements Serializable {

    @SerializedName("linkedTransitRouteInfo")
    private TransitRouteInfo linkedTransitRouteInfo = null;
    @SerializedName("linkedTransitTripInfo")
    private TransitTripInfo linkedTransitTripInfo = null;
    @SerializedName("scheduledStopCalls")
    private List<TransitStopScheduledCall> scheduledStopCalls = null;


    /**
     * An object containing details of the public transportation Route to which this leg's Trip (see LinkedTransitTripInfo) belongs, if known.\r\n For example the '326 bus service'.\r\n Note that not all fields of this object may be populated; particularly if the leg either does not form part of a scheduled Route, or if insufficient information is provided by a third-party planning engine\r\n to relate this TransitJourneyLeg back to a known scheduled Route.
     **/
    public TransitRouteInfo getLinkedTransitRouteInfo() {
        return linkedTransitRouteInfo;
    }


    /**
     * An object that contains details of the public transportation Trip that this leg forms part of, if known.\r\n Note that not all fields of this object may be populated; particularly if the leg either does not form part of a scheduled Trip, or if insufficient information is provided by a third-party planning engine\r\n to relate this TransitJourneyLeg back to a known scheduled trip.
     **/
    public TransitTripInfo getLinkedTransitTripInfo() {
        return linkedTransitTripInfo;
    }


    /**
     * A list of stops that will be called at en-route during the course of travelling along this leg (if known).\r\n Note that this information may not be provided by all third-party planning engines.
     **/
    public List<TransitStopScheduledCall> getScheduledStopCalls() {
        return scheduledStopCalls;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitJourneyLeg {\n");

        sb.append("  linkedTransitRouteInfo: ").append(linkedTransitRouteInfo).append("\n");
        sb.append("  linkedTransitTripInfo: ").append(linkedTransitTripInfo).append("\n");
        sb.append("  scheduledStopCalls: ").append(scheduledStopCalls).append("\n");
        sb.append("  summaryHTML: ").append(getSummaryHTML()).append("\n");
        sb.append("  originPlacePointID: ").append(getOriginPlacePointID()).append("\n");
        sb.append("  destinationPlacePointID: ").append(getDestinationPlacePointID()).append("\n");
        sb.append("  arrivalTime: ").append(getArrivalTime()).append("\n");
        sb.append("  departureTime: ").append(getDepartureTime()).append("\n");
        sb.append("  vehicleType: ").append(getVehicleType()).append("\n");
        sb.append("  duration: ").append(getDuration()).append("\n");
        sb.append("  distance: ").append(getDistance()).append("\n");
        sb.append("  polyline: ").append(getPolyline()).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TransitJourneyLeg that = (TransitJourneyLeg) o;

        if (linkedTransitRouteInfo != null ? !linkedTransitRouteInfo.equals(that.linkedTransitRouteInfo) : that.linkedTransitRouteInfo != null)
            return false;
        if (linkedTransitTripInfo != null ? !linkedTransitTripInfo.equals(that.linkedTransitTripInfo) : that.linkedTransitTripInfo != null)
            return false;
        return scheduledStopCalls != null ? scheduledStopCalls.equals(that.scheduledStopCalls) : that.scheduledStopCalls == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (linkedTransitRouteInfo != null ? linkedTransitRouteInfo.hashCode() : 0);
        result = 31 * result + (linkedTransitTripInfo != null ? linkedTransitTripInfo.hashCode() : 0);
        result = 31 * result + (scheduledStopCalls != null ? scheduledStopCalls.hashCode() : 0);
        return result;
    }
}
