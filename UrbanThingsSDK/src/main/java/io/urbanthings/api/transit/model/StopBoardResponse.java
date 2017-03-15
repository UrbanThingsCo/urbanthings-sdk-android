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
 * An object that contains one or more StopBoards representing live arrival/departure information for vehicles to/from a TransitStop
 **/
public class StopBoardResponse implements Serializable {

    @SerializedName("stopID")
    private String stopID = null;
    @SerializedName("timeStamp")
    private Long timeStamp = null;
    @SerializedName("sourceName")
    private String sourceName = null;
    @SerializedName("stopBoards")
    private List<StopBoard> stopBoards = null;
    @SerializedName("enableAutoRefresh")
    private Boolean enableAutoRefresh = null;
    @SerializedName("noDataLabel")
    private String noDataLabel = null;

    // UT only fields?
//    private int autoRefreshDuration;


    /**
     * The PrimaryCode of the TransitStop to which this StopBoardResponse relates
     **/
    public String getStopID() {
        return stopID;
    }


    /**
     * The Utc time at which this data was generated. Represented in ticks, i.e. the number of 100-nanosecond intervals that have elapsed since 12:00:00 midnight, January 1, 0001
     **/
    public Long getTimeStamp() {
        return timeStamp;
    }


    /**
     * The name of the data provider from which this information is sourced - this may be publicly displayed but is not required to do so.\r\n For required attribution strings, see the AttributionLabel and AttributionImageURL fields of the StopBoard object
     **/
    public String getSourceName() {
        return sourceName;
    }


    /**
     * One or more StopBoard objects that make up the main data contained within this StopBoardResponse
     **/
    public List<StopBoard> getStopBoards() {
        return stopBoards;
    }


    /**
     * If this is TRUE, a client may wish to re-request the information contained within this StopBoardResponse at an interval described in the AutoRefreshDuration field.\r\n Note that if this is FALSE, the information contained within this response is not Real Time Information, and thus a client has nothing to gain from\r\n re-requesting the information at regular intervals
     **/
    public Boolean getEnableAutoRefresh() {
        return enableAutoRefresh;
    }


    /**
     * A string that indicates the reason why no StopBoards have been returned in this StopBoard.\r\n In cases where StopBoards exist, this will be NULL
     **/
    public String getNoDataLabel() {
        return noDataLabel;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopBoardResponse {\n");

        sb.append("  stopID: ").append(stopID).append("\n");
        sb.append("  timeStamp: ").append(timeStamp).append("\n");
        sb.append("  sourceName: ").append(sourceName).append("\n");
        sb.append("  stopBoards: ").append(stopBoards).append("\n");
        sb.append("  enableAutoRefresh: ").append(enableAutoRefresh).append("\n");
        sb.append("  noDataLabel: ").append(noDataLabel).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopBoardResponse that = (StopBoardResponse) o;

        if (stopID != null ? !stopID.equals(that.stopID) : that.stopID != null) return false;
        if (timeStamp != null ? !timeStamp.equals(that.timeStamp) : that.timeStamp != null)
            return false;
        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null)
            return false;
        if (stopBoards != null ? !stopBoards.equals(that.stopBoards) : that.stopBoards != null)
            return false;
        if (enableAutoRefresh != null ? !enableAutoRefresh.equals(that.enableAutoRefresh) : that.enableAutoRefresh != null)
            return false;
        return noDataLabel != null ? noDataLabel.equals(that.noDataLabel) : that.noDataLabel == null;

    }

    @Override
    public int hashCode() {
        int result = stopID != null ? stopID.hashCode() : 0;
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0);
        result = 31 * result + (stopBoards != null ? stopBoards.hashCode() : 0);
        result = 31 * result + (enableAutoRefresh != null ? enableAutoRefresh.hashCode() : 0);
        result = 31 * result + (noDataLabel != null ? noDataLabel.hashCode() : 0);
        return result;
    }
}
