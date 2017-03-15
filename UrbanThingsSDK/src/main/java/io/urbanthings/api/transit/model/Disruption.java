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


public class Disruption implements Serializable {

    @SerializedName("startDate")
    private Date startDate = null;
    @SerializedName("endDate")
    private Date endDate = null;
    @SerializedName("localizedSummary")
    private String localizedSummary = null;
    @SerializedName("localizedDescription")
    private String localizedDescription = null;
    @SerializedName("localizedAdditionalInfo")
    private String localizedAdditionalInfo = null;
    @SerializedName("severity")
    private Integer severity = null;


    /**
     * The date and time at which this disruption started, or will start. If NULL, the start date/time of the disruption is assumed to have passed
     **/
    public Date getStartDate() {
        return startDate;
    }


    /**
     * The date and time at which this disruption will end, or ended. If NULL, it is assumed that the end date/time of the disruption has not passed
     **/
    public Date getEndDate() {
        return endDate;
    }


    /**
     * A textual summary description of the nature of the disruption
     **/
    public String getLocalizedSummary() {
        return localizedSummary;
    }

    /**
     * A detailed description of the nature of the disruption
     **/
    public String getLocalizedDescription() {
        return localizedDescription;
    }


    /**
     * Additional information relating to the disruption
     **/
    public String getLocalizedAdditionalInfo() {
        return localizedAdditionalInfo;
    }

    /**
     * The severity of the disruption, on a scale of 1-10, with 10 being the most severe
     **/
    public Integer getSeverity() {
        return severity;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Disruption {\n");

        sb.append("  startDate: ").append(startDate).append("\n");
        sb.append("  endDate: ").append(endDate).append("\n");
        sb.append("  localizedSummary: ").append(localizedSummary).append("\n");
        sb.append("  localizedDescription: ").append(localizedDescription).append("\n");
        sb.append("  localizedAdditionalInfo: ").append(localizedAdditionalInfo).append("\n");
        sb.append("  severity: ").append(severity).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disruption that = (Disruption) o;

        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null)
            return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (localizedSummary != null ? !localizedSummary.equals(that.localizedSummary) : that.localizedSummary != null)
            return false;
        if (localizedDescription != null ? !localizedDescription.equals(that.localizedDescription) : that.localizedDescription != null)
            return false;
        if (localizedAdditionalInfo != null ? !localizedAdditionalInfo.equals(that.localizedAdditionalInfo) : that.localizedAdditionalInfo != null)
            return false;
        return severity != null ? severity.equals(that.severity) : that.severity == null;

    }

    @Override
    public int hashCode() {
        int result = startDate != null ? startDate.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (localizedSummary != null ? localizedSummary.hashCode() : 0);
        result = 31 * result + (localizedDescription != null ? localizedDescription.hashCode() : 0);
        result = 31 * result + (localizedAdditionalInfo != null ? localizedAdditionalInfo.hashCode() : 0);
        result = 31 * result + (severity != null ? severity.hashCode() : 0);
        return result;
    }
}
