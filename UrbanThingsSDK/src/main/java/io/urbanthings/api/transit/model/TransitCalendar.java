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


/**
 * A calendar that represents when a particular TransitTrip runs.
 **/
public class TransitCalendar implements Serializable {

    @SerializedName("id")
    private String id = null;
    @SerializedName("startDate")
    private Date startDate = null;
    @SerializedName("endDate")
    private Date endDate = null;
    @SerializedName("runsSunday")
    private Boolean runsSunday = null;
    @SerializedName("runsMonday")
    private Boolean runsMonday = null;
    @SerializedName("runsTuesday")
    private Boolean runsTuesday = null;
    @SerializedName("runsWednesday")
    private Boolean runsWednesday = null;
    @SerializedName("runsThursday")
    private Boolean runsThursday = null;
    @SerializedName("runsFriday")
    private Boolean runsFriday = null;
    @SerializedName("runsSaturday")
    private Boolean runsSaturday = null;
    @SerializedName("additionalRunningDates")
    private List<Date> additionalRunningDates = null;
    @SerializedName("excludedRunningDates")
    private List<Date> excludedRunningDates = null;


    /**
     * The internal unique ID representing this calendar. Multiple trips may share a single calendar.\r\n This ID is synonymous with a GTFS 'service ID'
     **/
    public String getId() {
        return id;
    }


    /**
     * The date that the corresponding TransitTrip begins operating from, inclusive.
     **/
    public Date getStartDate() {
        return startDate;
    }


    /**
     * The date that the corresponding TransitTrip ends operating on, inclusive.
     **/
    public Date getEndDate() {
        return endDate;
    }


    /**
     * Set to TRUE if the TransitRoute runs on this day
     **/
    public Boolean getRunsSunday() {
        return runsSunday;
    }


    /**
     * Set to TRUE if the TransitRoute runs on this day
     **/
    public Boolean getRunsMonday() {
        return runsMonday;
    }


    /**
     * Set to TRUE if the TransitRoute runs on this day
     **/
    public Boolean getRunsTuesday() {
        return runsTuesday;
    }


    /**
     * Set to TRUE if the TransitRoute runs on this day
     **/
    public Boolean getRunsWednesday() {
        return runsWednesday;
    }


    /**
     * Set to TRUE if the TransitRoute runs on this day
     **/
    public Boolean getRunsThursday() {
        return runsThursday;
    }


    /**
     * Set to TRUE if the TransitRoute runs on this day
     **/
    public Boolean getRunsFriday() {
        return runsFriday;
    }


    /**
     * Set to TRUE if the TransitRoute runs on this day
     **/
    public Boolean getRunsSaturday() {
        return runsSaturday;
    }


    /**
     * A list of additional dates that this TransitRoute operates on, in addition\r\n to the regular day-based services indicated by the RunsSunday,RunsMonday,etc. booleans. Note\r\n that these dates do not have to conform to any particular day of the week, e.g. a service\r\n could contain a RunsMonday=False, but also contain an Additional Date that happened to fall\r\n on a Monday.
     **/
    public List<Date> getAdditionalRunningDates() {
        return additionalRunningDates;
    }


    /**
     * A list of dates that this TransitRoute does not operate on, overriding any\r\n dates implied by the RunsSunday,RunsMonday, etc. booleans.
     **/
    public List<Date> getExcludedRunningDates() {
        return excludedRunningDates;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitCalendar {\n");

        sb.append("  id: ").append(id).append("\n");
        sb.append("  startDate: ").append(startDate).append("\n");
        sb.append("  endDate: ").append(endDate).append("\n");
        sb.append("  runsSunday: ").append(runsSunday).append("\n");
        sb.append("  runsMonday: ").append(runsMonday).append("\n");
        sb.append("  runsTuesday: ").append(runsTuesday).append("\n");
        sb.append("  runsWednesday: ").append(runsWednesday).append("\n");
        sb.append("  runsThursday: ").append(runsThursday).append("\n");
        sb.append("  runsFriday: ").append(runsFriday).append("\n");
        sb.append("  runsSaturday: ").append(runsSaturday).append("\n");
        sb.append("  additionalRunningDates: ").append(additionalRunningDates).append("\n");
        sb.append("  excludedRunningDates: ").append(excludedRunningDates).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitCalendar that = (TransitCalendar) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null)
            return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (runsSunday != null ? !runsSunday.equals(that.runsSunday) : that.runsSunday != null)
            return false;
        if (runsMonday != null ? !runsMonday.equals(that.runsMonday) : that.runsMonday != null)
            return false;
        if (runsTuesday != null ? !runsTuesday.equals(that.runsTuesday) : that.runsTuesday != null)
            return false;
        if (runsWednesday != null ? !runsWednesday.equals(that.runsWednesday) : that.runsWednesday != null)
            return false;
        if (runsThursday != null ? !runsThursday.equals(that.runsThursday) : that.runsThursday != null)
            return false;
        if (runsFriday != null ? !runsFriday.equals(that.runsFriday) : that.runsFriday != null)
            return false;
        if (runsSaturday != null ? !runsSaturday.equals(that.runsSaturday) : that.runsSaturday != null)
            return false;
        if (additionalRunningDates != null ? !additionalRunningDates.equals(that.additionalRunningDates) : that.additionalRunningDates != null)
            return false;
        return excludedRunningDates != null ? excludedRunningDates.equals(that.excludedRunningDates) : that.excludedRunningDates == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (runsSunday != null ? runsSunday.hashCode() : 0);
        result = 31 * result + (runsMonday != null ? runsMonday.hashCode() : 0);
        result = 31 * result + (runsTuesday != null ? runsTuesday.hashCode() : 0);
        result = 31 * result + (runsWednesday != null ? runsWednesday.hashCode() : 0);
        result = 31 * result + (runsThursday != null ? runsThursday.hashCode() : 0);
        result = 31 * result + (runsFriday != null ? runsFriday.hashCode() : 0);
        result = 31 * result + (runsSaturday != null ? runsSaturday.hashCode() : 0);
        result = 31 * result + (additionalRunningDates != null ? additionalRunningDates.hashCode() : 0);
        result = 31 * result + (excludedRunningDates != null ? excludedRunningDates.hashCode() : 0);
        return result;
    }
}
