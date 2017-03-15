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
import java.util.List;


public class TransitStopScheduledCalls implements Serializable {

    @SerializedName("stopID")
    private String stopID = null;
    @SerializedName("queryStartTime")
    private Date queryStartTime = null;
    @SerializedName("queryEndTime")
    private Date queryEndTime = null;
    @SerializedName("scheduledCalls")
    private List<StopCall> scheduledCalls = null;


    /**
     * The primary code of the TransitStop that this list relates to
     **/
    public String getStopID() {
        return stopID;
    }


    /**
     * The beginning of the time period to which this list of stop calls relates
     **/
    public Date getQueryStartTime() {
        return queryStartTime;
    }


    /**
     * The end of the time period to which this list of stop calls relates
     **/
    public Date getQueryEndTime() {
        return queryEndTime;
    }


    /**
     * A list of vehicles calling at this TransitStop within the specified time period
     **/
    public List<StopCall> getScheduledCalls() {
        return scheduledCalls;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitStopScheduledCalls {\n");

        sb.append("  stopID: ").append(stopID).append("\n");
        sb.append("  queryStartTime: ").append(queryStartTime).append("\n");
        sb.append("  queryEndTime: ").append(queryEndTime).append("\n");
        sb.append("  scheduledCalls: ").append(scheduledCalls).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitStopScheduledCalls that = (TransitStopScheduledCalls) o;

        if (stopID != null ? !stopID.equals(that.stopID) : that.stopID != null) return false;
        if (queryStartTime != null ? !queryStartTime.equals(that.queryStartTime) : that.queryStartTime != null)
            return false;
        if (queryEndTime != null ? !queryEndTime.equals(that.queryEndTime) : that.queryEndTime != null)
            return false;
        return scheduledCalls != null ? scheduledCalls.equals(that.scheduledCalls) : that.scheduledCalls == null;

    }

    @Override
    public int hashCode() {
        int result = stopID != null ? stopID.hashCode() : 0;
        result = 31 * result + (queryStartTime != null ? queryStartTime.hashCode() : 0);
        result = 31 * result + (queryEndTime != null ? queryEndTime.hashCode() : 0);
        result = 31 * result + (scheduledCalls != null ? scheduledCalls.hashCode() : 0);
        return result;
    }
}
