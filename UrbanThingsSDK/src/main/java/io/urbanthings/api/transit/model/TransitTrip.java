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


/**
 * Represents a transit trip - i.e. a specific vehicle journey along a known route
 **/
public class TransitTrip implements Serializable {

    @SerializedName("info")
    private TransitTripInfo info = null;
    @SerializedName("calendar")
    private TransitCalendar calendar = null;
    @SerializedName("stopCalls")
    private List<TransitStopScheduledCallSummary> stopCalls = null;
    @SerializedName("polyline")
    private String polyline = null;


    /**
     * Basic information about this trip - agency code, vehicle Headsign, etc
     **/
    public TransitTripInfo getInfo() {
        return info;
    }


    /**
     * The dates on which this trip operates. .
     **/
    public TransitCalendar getCalendar() {
        return calendar;
    }


    /**
     * The stops that the vehicle calls at on this trip, and the times at which it does so.
     **/
    public List<TransitStopScheduledCallSummary> getStopCalls() {
        return stopCalls;
    }


    /**
     * The route topology of the trip, i.e. the geographical coordinates taken by the vehicle. Represented in Encoded Polyline format - see https://developers.google.com/maps/documentation/utilities/polylinealgorithm?hl=en
     **/
    public String getPolyline() {
        return polyline;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitTrip {\n");

        sb.append("  info: ").append(info).append("\n");
        sb.append("  calendar: ").append(calendar).append("\n");
        sb.append("  stopCalls: ").append(stopCalls).append("\n");
        sb.append("  polyline: ").append(polyline).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitTrip that = (TransitTrip) o;

        if (info != null ? !info.equals(that.info) : that.info != null) return false;
        if (calendar != null ? !calendar.equals(that.calendar) : that.calendar != null)
            return false;
        if (stopCalls != null ? !stopCalls.equals(that.stopCalls) : that.stopCalls != null)
            return false;
        return polyline != null ? polyline.equals(that.polyline) : that.polyline == null;

    }

    @Override
    public int hashCode() {
        int result = info != null ? info.hashCode() : 0;
        result = 31 * result + (calendar != null ? calendar.hashCode() : 0);
        result = 31 * result + (stopCalls != null ? stopCalls.hashCode() : 0);
        result = 31 * result + (polyline != null ? polyline.hashCode() : 0);
        return result;
    }
}
