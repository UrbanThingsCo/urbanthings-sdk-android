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
 * An object that represents a row to be displayed on a StopBoard object. Usually corresponds to the arrival/departure of a vehicle at a TransitStop.
 **/
public class StopBoardRow implements Serializable {

    @SerializedName("noteText")
    private String noteText = null;
    @SerializedName("isrti")
    private Boolean isrti = null;
    @SerializedName("groupID")
    private String groupID = null;
    @SerializedName("vehicleMode")
    private VehicleType vehicleMode = null;
    @SerializedName("vehicleRegistrationText")
    private String vehicleRegistrationText = null;
    @SerializedName("trackingID")
    private String trackingID = null;
    @SerializedName("idLabel")
    private String idLabel = null;
    @SerializedName("mainLabel")
    private String mainLabel = null;
    @SerializedName("secondaryLabel")
    private String secondaryLabel = null;
    @SerializedName("platformLabel")
    private String platformLabel = null;
    @SerializedName("timeLabel")
    private String timeLabel = null;
    @SerializedName("timeMajorLabel")
    private String timeMajorLabel = null;
    @SerializedName("timeMinorLabel")
    private String timeMinorLabel = null;

    // UT only fields?
//    private String serverRouteToken;


    /**
     * An additional, longer-form piece of text that provides further information about this vehicle.
     **/
    public String getNoteText() {
        return noteText;
    }


    /**
     * A boolean indicating whether the information provided about this vehicle is based on Real Time Information
     **/
    public Boolean getIsrti() {
        return isrti;
    }


    /**
     * This field identifies the StopBoardRow as belong to one of the StopBoardGroupings described in the parent StopBoard object.\r\n Depending upon the data source, rows might be grouped according to criteria such as published line name or destination\r\n A client might wish to look up the StopBoardGrouping using this ID in order to perform tasks such as group-based display or filtering
     **/
    public String getGroupID() {
        return groupID;
    }


    /**
     **/
    public VehicleType getVehicleMode() {
        return vehicleMode;
    }


    /**
     * If available, the publicly displayed identifying information for this vehicle - for example a license plate, or vehicle number
     **/
    public String getVehicleRegistrationText() {
        return vehicleRegistrationText;
    }


    /**
     * A persistent ID that a client can use as a hint for visual display of changing vehicle times - this ID, if available, can persist between refreshes of the stop board
     **/
    public String getTrackingID() {
        return trackingID;
    }


    /**
     * A label identifying the vehicle. For buses, this might be a Line name, for trains this might be a published time. \r\n The meaning of this label may be clarified via the IDHeader property of the parent StopBoard object
     **/
    public String getIdLabel() {
        return idLabel;
    }


    /**
     * A label providing secondary identification information for the vehicle. This is often a destination or terminating stop.\r\n The meaning of this label may be clarified via the MainHeader property of the parent StopBoard object
     **/
    public String getMainLabel() {
        return mainLabel;
    }


    /**
     * A label providing additional identification information for the vehicle (optional)\r\n The meaning of this label may be clarified via the SecondaryHeader property of the parent StopBoard object
     **/
    public String getSecondaryLabel() {
        return secondaryLabel;
    }


    /**
     * A label identifying the platform at which this vehicle will stop
     **/
    public String getPlatformLabel() {
        return platformLabel;
    }


    /**
     * Deprecated - please use TimeMajorLabel and TimeMinorLabel
     **/
    public String getTimeLabel() {
        return timeLabel;
    }


    /**
     * The first of two labels identifying the time at which the vehicle will stop. \r\n For example, TimeMajorLabel might contain the value '12', while TimeMinorLabel might contain the value 'minutes'
     **/
    public String getTimeMajorLabel() {
        return timeMajorLabel;
    }


    /**
     * The second of two labels identifying the time at which the vehicle will stop\r\n For example, TimeMajorLabel might contain the value '12', while TimeMinorLabel might contain the value 'minutes'
     **/
    public String getTimeMinorLabel() {
        return timeMinorLabel;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopBoardRow {\n");

        sb.append("  noteText: ").append(noteText).append("\n");
        sb.append("  isrti: ").append(isrti).append("\n");
        sb.append("  groupID: ").append(groupID).append("\n");
        sb.append("  vehicleMode: ").append(vehicleMode).append("\n");
        sb.append("  vehicleRegistrationText: ").append(vehicleRegistrationText).append("\n");
        sb.append("  trackingID: ").append(trackingID).append("\n");
        sb.append("  idLabel: ").append(idLabel).append("\n");
        sb.append("  mainLabel: ").append(mainLabel).append("\n");
        sb.append("  secondaryLabel: ").append(secondaryLabel).append("\n");
        sb.append("  platformLabel: ").append(platformLabel).append("\n");
        sb.append("  timeLabel: ").append(timeLabel).append("\n");
        sb.append("  timeMajorLabel: ").append(timeMajorLabel).append("\n");
        sb.append("  timeMinorLabel: ").append(timeMinorLabel).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopBoardRow that = (StopBoardRow) o;

        if (noteText != null ? !noteText.equals(that.noteText) : that.noteText != null)
            return false;
        if (isrti != null ? !isrti.equals(that.isrti) : that.isrti != null) return false;
        if (groupID != null ? !groupID.equals(that.groupID) : that.groupID != null) return false;
        if (vehicleMode != that.vehicleMode) return false;
        if (vehicleRegistrationText != null ? !vehicleRegistrationText.equals(that.vehicleRegistrationText) : that.vehicleRegistrationText != null)
            return false;
        if (trackingID != null ? !trackingID.equals(that.trackingID) : that.trackingID != null)
            return false;
        if (idLabel != null ? !idLabel.equals(that.idLabel) : that.idLabel != null) return false;
        if (mainLabel != null ? !mainLabel.equals(that.mainLabel) : that.mainLabel != null)
            return false;
        if (secondaryLabel != null ? !secondaryLabel.equals(that.secondaryLabel) : that.secondaryLabel != null)
            return false;
        if (platformLabel != null ? !platformLabel.equals(that.platformLabel) : that.platformLabel != null)
            return false;
        if (timeLabel != null ? !timeLabel.equals(that.timeLabel) : that.timeLabel != null)
            return false;
        if (timeMajorLabel != null ? !timeMajorLabel.equals(that.timeMajorLabel) : that.timeMajorLabel != null)
            return false;
        return timeMinorLabel != null ? timeMinorLabel.equals(that.timeMinorLabel) : that.timeMinorLabel == null;

    }

    @Override
    public int hashCode() {
        int result = noteText != null ? noteText.hashCode() : 0;
        result = 31 * result + (isrti != null ? isrti.hashCode() : 0);
        result = 31 * result + (groupID != null ? groupID.hashCode() : 0);
        result = 31 * result + (vehicleMode != null ? vehicleMode.hashCode() : 0);
        result = 31 * result + (vehicleRegistrationText != null ? vehicleRegistrationText.hashCode() : 0);
        result = 31 * result + (trackingID != null ? trackingID.hashCode() : 0);
        result = 31 * result + (idLabel != null ? idLabel.hashCode() : 0);
        result = 31 * result + (mainLabel != null ? mainLabel.hashCode() : 0);
        result = 31 * result + (secondaryLabel != null ? secondaryLabel.hashCode() : 0);
        result = 31 * result + (platformLabel != null ? platformLabel.hashCode() : 0);
        result = 31 * result + (timeLabel != null ? timeLabel.hashCode() : 0);
        result = 31 * result + (timeMajorLabel != null ? timeMajorLabel.hashCode() : 0);
        result = 31 * result + (timeMinorLabel != null ? timeMinorLabel.hashCode() : 0);
        return result;
    }
}
