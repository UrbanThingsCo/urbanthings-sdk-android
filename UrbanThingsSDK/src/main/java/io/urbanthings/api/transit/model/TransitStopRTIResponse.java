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


public class TransitStopRTIResponse implements Serializable {

    @SerializedName("stopID")
    private String stopID = null;
    @SerializedName("rtiReports")
    private List<TransitStopRTIReport> rtiReports = null;
    @SerializedName("noDataLabel")
    private String noDataLabel = null;
    @SerializedName("sourceName")
    private String sourceName = null;


    /**
     * The PrimaryCode of the stop that this RTI Report has been generated for
     **/
    public String getStopID() {
        return stopID;
    }


    /**
     * One or more RTIReport objects making up the main part of this response
     **/
    public List<TransitStopRTIReport> getRtiReports() {
        return rtiReports;
    }


    /**
     * A string that indicates the reason why no RTIReport objecta have been returned in this report.\r\n In cases where RTIReports exist, this will be NULL
     **/
    public String getNoDataLabel() {
        return noDataLabel;
    }


    /**
     * The data source for this report - may optionally be displayed by the client
     **/
    public String getSourceName() {
        return sourceName;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitStopRTIResponse {\n");

        sb.append("  stopID: ").append(stopID).append("\n");
        sb.append("  rtiReports: ").append(rtiReports).append("\n");
        sb.append("  noDataLabel: ").append(noDataLabel).append("\n");
        sb.append("  sourceName: ").append(sourceName).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitStopRTIResponse that = (TransitStopRTIResponse) o;

        if (stopID != null ? !stopID.equals(that.stopID) : that.stopID != null) return false;
        if (rtiReports != null ? !rtiReports.equals(that.rtiReports) : that.rtiReports != null)
            return false;
        if (noDataLabel != null ? !noDataLabel.equals(that.noDataLabel) : that.noDataLabel != null)
            return false;
        return sourceName != null ? sourceName.equals(that.sourceName) : that.sourceName == null;

    }

    @Override
    public int hashCode() {
        int result = stopID != null ? stopID.hashCode() : 0;
        result = 31 * result + (rtiReports != null ? rtiReports.hashCode() : 0);
        result = 31 * result + (noDataLabel != null ? noDataLabel.hashCode() : 0);
        result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0);
        return result;
    }
}
