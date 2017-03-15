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

import java.util.Date;
import java.util.List;


public class TransitStopRTIReport {

    @SerializedName("reportName")
    private String reportName = null;
    @SerializedName("platformID")
    private String platformID = null;
    @SerializedName("upcomingCalls")
    private List<MonitoredStopCall> upcomingCalls = null;
    @SerializedName("disruptions")
    private List<Disruption> disruptions = null;
    @SerializedName("attributionLabel")
    private String attributionLabel = null;
    @SerializedName("attributionImageURL")
    private String attributionImageURL = null;
    @SerializedName("noDataLabel")
    private String noDataLabel = null;
    @SerializedName("sourceName")
    private String sourceName = null;
    @SerializedName("timeStamp")
    private Date timeStamp = null;


    /**
     * An optional descriptive title for this report - may be used to distinguish between multiple TransitStopRTIReport\r\n objects in a TransitStopRTIResponse
     **/
    public String getReportName() {
        return reportName;
    }


    /**
     * The platform that this report relates to - optional. Note that the StopID that this report relates to is \r\n held in the parent TransitStopRTIResponse object
     **/
    public String getPlatformID() {
        return platformID;
    }


    /**
     * Upcoming vehicle calls at this stop, and metadata relating to each vehicle
     **/
    public List<MonitoredStopCall> getUpcomingCalls() {
        return upcomingCalls;
    }


    /**
     * A list of disruptions information relating to this stop
     **/
    public List<Disruption> getDisruptions() {
        return disruptions;
    }


    /**
     * An attribution label for the data - clients MUST display either this label or the image contained at AttributionImageURL to \r\n conform with the Terms and Conditions of using the API
     **/
    public String getAttributionLabel() {
        return attributionLabel;
    }


    /**
     * An attribution graphic for the data - clients MUST display either this label or the string contained at AttributionLabel to \r\n conform with the Terms and Conditions of using the API
     **/
    public String getAttributionImageURL() {
        return attributionImageURL;
    }


    /**
     * A string that indicates the reason why no data has been returned in this report.\r\n In cases where UpcomingCalls exist, this will be NULL
     **/
    public String getNoDataLabel() {
        return noDataLabel;
    }


    /**
     * A descriptive, customer-facing name for the source of this information
     **/
    public String getSourceName() {
        return sourceName;
    }


    /**
     * The time at which this report was generated. Mandatory.\r\n Can be used to generate a more accurate 'waiting time until vehicle comes' since we know what the server THOUGHT the time was when it generated the expected time
     **/
    public Date getTimeStamp() {
        return timeStamp;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitStopRTIReport {\n");

        sb.append("  reportName: ").append(reportName).append("\n");
        sb.append("  platformID: ").append(platformID).append("\n");
        sb.append("  upcomingCalls: ").append(upcomingCalls).append("\n");
        sb.append("  disruptions: ").append(disruptions).append("\n");
        sb.append("  attributionLabel: ").append(attributionLabel).append("\n");
        sb.append("  attributionImageURL: ").append(attributionImageURL).append("\n");
        sb.append("  noDataLabel: ").append(noDataLabel).append("\n");
        sb.append("  sourceName: ").append(sourceName).append("\n");
        sb.append("  timeStamp: ").append(timeStamp).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitStopRTIReport that = (TransitStopRTIReport) o;

        if (reportName != null ? !reportName.equals(that.reportName) : that.reportName != null)
            return false;
        if (platformID != null ? !platformID.equals(that.platformID) : that.platformID != null)
            return false;
        if (upcomingCalls != null ? !upcomingCalls.equals(that.upcomingCalls) : that.upcomingCalls != null)
            return false;
        if (disruptions != null ? !disruptions.equals(that.disruptions) : that.disruptions != null)
            return false;
        if (attributionLabel != null ? !attributionLabel.equals(that.attributionLabel) : that.attributionLabel != null)
            return false;
        if (attributionImageURL != null ? !attributionImageURL.equals(that.attributionImageURL) : that.attributionImageURL != null)
            return false;
        if (noDataLabel != null ? !noDataLabel.equals(that.noDataLabel) : that.noDataLabel != null)
            return false;
        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null)
            return false;
        return timeStamp != null ? timeStamp.equals(that.timeStamp) : that.timeStamp == null;

    }

    @Override
    public int hashCode() {
        int result = reportName != null ? reportName.hashCode() : 0;
        result = 31 * result + (platformID != null ? platformID.hashCode() : 0);
        result = 31 * result + (upcomingCalls != null ? upcomingCalls.hashCode() : 0);
        result = 31 * result + (disruptions != null ? disruptions.hashCode() : 0);
        result = 31 * result + (attributionLabel != null ? attributionLabel.hashCode() : 0);
        result = 31 * result + (attributionImageURL != null ? attributionImageURL.hashCode() : 0);
        result = 31 * result + (noDataLabel != null ? noDataLabel.hashCode() : 0);
        result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        return result;
    }
}
