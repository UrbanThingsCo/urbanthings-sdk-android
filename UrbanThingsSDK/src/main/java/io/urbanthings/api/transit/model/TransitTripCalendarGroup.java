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
 * A collection of TransitTripGroup objects, grouped by the days on which they operate
 **/
public class TransitTripCalendarGroup implements Serializable {

    @SerializedName("calendar")
    private TransitCalendar calendar = null;
    @SerializedName("trips")
    private List<TransitTrip> trips = null;


    /**
     * The calendar for all Trips in this grouping, i.e. which days/dates do these trips run on.
     **/
    public TransitCalendar getCalendar() {
        return calendar;
    }


    /**
     * A list of the TransitTrip objects that form this particular group
     **/
    public List<TransitTrip> getTrips() {
        return trips;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitTripCalendarGroup {\n");

        sb.append("  calendar: ").append(calendar).append("\n");
        sb.append("  trips: ").append(trips).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitTripCalendarGroup that = (TransitTripCalendarGroup) o;

        if (calendar != null ? !calendar.equals(that.calendar) : that.calendar != null)
            return false;
        return trips != null ? trips.equals(that.trips) : that.trips == null;

    }

    @Override
    public int hashCode() {
        int result = calendar != null ? calendar.hashCode() : 0;
        result = 31 * result + (trips != null ? trips.hashCode() : 0);
        return result;
    }
}
