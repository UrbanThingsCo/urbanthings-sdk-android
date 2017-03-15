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


public class TransitScheduledCall implements Serializable {

    @SerializedName("scheduledArrivalTime")
    private Date scheduledArrivalTime = null;
    @SerializedName("scheduledDepartureTime")
    private Date scheduledDepartureTime = null;
    @SerializedName("pickUpType")
    private Integer pickUpType = null;
    @SerializedName("dropOffType")
    private Integer dropOffType = null;


    /**
     * The scheduled arrival time of the vehicle
     **/
    public Date getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }


    /**
     * The scheduled departure time of the vehicle
     **/
    public Date getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }


    /**
     * How the vehicle picks up passengers at this stop, if at all. See GTFS specification.\r\n Note - if this value is omitted, the default value of 0 should be assumed
     **/
    public Integer getPickUpType() {
        return pickUpType;
    }


    /**
     * How the vehicle drops off passengers at this stop, if at all. See GTFS specification.\r\n Note - if this value is omitted, the default value of 0 should be assumed
     **/
    public Integer getDropOffType() {
        return dropOffType;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitScheduledCall {\n");

        sb.append("  scheduledArrivalTime: ").append(scheduledArrivalTime).append("\n");
        sb.append("  scheduledDepartureTime: ").append(scheduledDepartureTime).append("\n");
        sb.append("  pickUpType: ").append(pickUpType).append("\n");
        sb.append("  dropOffType: ").append(dropOffType).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitScheduledCall that = (TransitScheduledCall) o;

        if (scheduledArrivalTime != null ? !scheduledArrivalTime.equals(that.scheduledArrivalTime) : that.scheduledArrivalTime != null)
            return false;
        if (scheduledDepartureTime != null ? !scheduledDepartureTime.equals(that.scheduledDepartureTime) : that.scheduledDepartureTime != null)
            return false;
        if (pickUpType != null ? !pickUpType.equals(that.pickUpType) : that.pickUpType != null)
            return false;
        return dropOffType != null ? dropOffType.equals(that.dropOffType) : that.dropOffType == null;

    }

    @Override
    public int hashCode() {
        int result = scheduledArrivalTime != null ? scheduledArrivalTime.hashCode() : 0;
        result = 31 * result + (scheduledDepartureTime != null ? scheduledDepartureTime.hashCode() : 0);
        result = 31 * result + (pickUpType != null ? pickUpType.hashCode() : 0);
        result = 31 * result + (dropOffType != null ? dropOffType.hashCode() : 0);
        return result;
    }
}
