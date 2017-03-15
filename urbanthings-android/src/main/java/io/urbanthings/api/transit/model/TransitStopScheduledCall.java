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
public class TransitStopScheduledCall implements Serializable {

    @SerializedName("stop")
    private TransitStop stop = null;
    @SerializedName("scheduledCall")
    private TransitScheduledCall scheduledCall = null;


    /**
     * The TransitStop at which the vehicle calls
     **/
    public TransitStop getStop() {
        return stop;
    }


    /**
     * The time(s) at which the vehicle is scheduled to call and the type of call
     **/
    public TransitScheduledCall getScheduledCall() {
        return scheduledCall;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitStopScheduledCall {\n");

        sb.append("  stop: ").append(stop).append("\n");
        sb.append("  scheduledCall: ").append(scheduledCall).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitStopScheduledCall that = (TransitStopScheduledCall) o;

        if (stop != null ? !stop.equals(that.stop) : that.stop != null) return false;
        return scheduledCall != null ? scheduledCall.equals(that.scheduledCall) : that.scheduledCall == null;

    }

    @Override
    public int hashCode() {
        int result = stop != null ? stop.hashCode() : 0;
        result = 31 * result + (scheduledCall != null ? scheduledCall.hashCode() : 0);
        return result;
    }
}
