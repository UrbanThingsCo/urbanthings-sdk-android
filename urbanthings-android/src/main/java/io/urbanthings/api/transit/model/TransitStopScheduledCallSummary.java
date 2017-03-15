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
 * Represents a scheduled call of a vehicle at a transit stop
 **/
public class TransitStopScheduledCallSummary implements Serializable {

    @SerializedName("transitStopPrimaryCode")
    private String transitStopPrimaryCode = null;
    @SerializedName("transitStopName")
    private String transitStopName = null;
    @SerializedName("transitStopLocalityName")
    private String transitStopLocalityName = null;
    @SerializedName("scheduledCall")
    private TransitScheduledCall scheduledCall = null;
    @SerializedName("transitStopLatitude")
    private Double transitStopLatitude = null;
    @SerializedName("transitStopLongitude")
    private Double transitStopLongitude = null;


    /**
     * The Primary Code of the TransitStop at which the vehicle calls
     **/
    public String getTransitStopPrimaryCode() {
        return transitStopPrimaryCode;
    }

    /**
     * The name of the TransitStop at which the vehicle calls
     **/
    public String getTransitStopName() {
        return transitStopName;
    }


    /**
     * The locality Name of the TransitStop at which the vehicle calls
     **/
    public String getTransitStopLocalityName() {
        return transitStopLocalityName;
    }


    /**
     * The time(s) at which the vehicle is scheduled to call and the type of call
     **/
    public TransitScheduledCall getScheduledCall() {
        return scheduledCall;
    }


    /**
     * The latitude of this TransitStop
     **/
    public Double getTransitStopLatitude() {
        return transitStopLatitude;
    }


    /**
     * The longitude of this TransitStop
     **/
    public Double getTransitStopLongitude() {
        return transitStopLongitude;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitStopScheduledCallSummary {\n");

        sb.append("  transitStopPrimaryCode: ").append(transitStopPrimaryCode).append("\n");
        sb.append("  transitStopName: ").append(transitStopName).append("\n");
        sb.append("  transitStopLocalityName: ").append(transitStopLocalityName).append("\n");
        sb.append("  scheduledCall: ").append(scheduledCall).append("\n");
        sb.append("  transitStopLatitude: ").append(transitStopLatitude).append("\n");
        sb.append("  transitStopLongitude: ").append(transitStopLongitude).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitStopScheduledCallSummary that = (TransitStopScheduledCallSummary) o;

        if (transitStopPrimaryCode != null ? !transitStopPrimaryCode.equals(that.transitStopPrimaryCode) : that.transitStopPrimaryCode != null)
            return false;
        if (transitStopName != null ? !transitStopName.equals(that.transitStopName) : that.transitStopName != null)
            return false;
        if (transitStopLocalityName != null ? !transitStopLocalityName.equals(that.transitStopLocalityName) : that.transitStopLocalityName != null)
            return false;
        if (scheduledCall != null ? !scheduledCall.equals(that.scheduledCall) : that.scheduledCall != null)
            return false;
        if (transitStopLatitude != null ? !transitStopLatitude.equals(that.transitStopLatitude) : that.transitStopLatitude != null)
            return false;
        return transitStopLongitude != null ? transitStopLongitude.equals(that.transitStopLongitude) : that.transitStopLongitude == null;

    }

    @Override
    public int hashCode() {
        int result = transitStopPrimaryCode != null ? transitStopPrimaryCode.hashCode() : 0;
        result = 31 * result + (transitStopName != null ? transitStopName.hashCode() : 0);
        result = 31 * result + (transitStopLocalityName != null ? transitStopLocalityName.hashCode() : 0);
        result = 31 * result + (scheduledCall != null ? scheduledCall.hashCode() : 0);
        result = 31 * result + (transitStopLatitude != null ? transitStopLatitude.hashCode() : 0);
        result = 31 * result + (transitStopLongitude != null ? transitStopLongitude.hashCode() : 0);
        return result;
    }
}
