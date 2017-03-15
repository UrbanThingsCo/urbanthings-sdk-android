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
 * A geographical location serviced by vehicles
 **/
public class TransitStop extends PlacePoint implements Serializable {

    @SerializedName("additionalCode")
    private String additionalCode = null;
    @SerializedName("smsCode")
    private String smsCode = null;
    @SerializedName("bearing")
    private Integer bearing = null;
    @SerializedName("directionName")
    private String directionName = null;
    @SerializedName("stopIndicator")
    private String stopIndicator = null;
    @SerializedName("isClosed")
    private Boolean isClosed = null;

    @SerializedName("stopMode")
    private VehicleType stopMode = null;

    @SerializedName("parentPrimaryCode")
    private String parentPrimaryCode = null;


    /**
     * A secondary code used to identify this TransitStop - whereas the PrimaryCode is often unique to this data ecosystem, a SecondaryCode a likely to be unique only within the agency or data system that supplied it. Not guaranteed to be globally unique and not implemented in all data sets.
     **/
    public String getAdditionalCode() {
        return additionalCode;
    }


    /**
     * A code used for the retrieval of real time data via SMS. Not implemented in all data sets.
     **/
    public String getSmsCode() {
        return smsCode;
    }


    /**
     * The compass bearing of vehicles leaving this stop. Not implemented in all data sets.
     **/
    public Integer getBearing() {
        return bearing;
    }


    /**
     * A generic direction name for vehicles leaving this stop, e.g. [towards] 'Marble Arch'
     **/
    public String getDirectionName() {
        return directionName;
    }


    /**
     * A short textual series of numbers of letters to identify this stop in the physical world, e.g. 'A1'. In general these letters will be publicly displayed on or near the stop.
     **/
    public String getStopIndicator() {
        return stopIndicator;
    }


    /**
     * Indicates permanent or temporary closure of the stop
     **/
    public Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * The GTFS mode of the routes that usually serve this stop.
     **/
    public VehicleType getStopMode() {
        return stopMode;
    }


    /**
     * Primary Code of this transit stop's parent, if one exists
     **/
    public String getParentPrimaryCode() {
        return parentPrimaryCode;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitStop {\n");

        sb.append("  additionalCode: ").append(additionalCode).append("\n");
        sb.append("  smsCode: ").append(smsCode).append("\n");
        sb.append("  bearing: ").append(bearing).append("\n");
        sb.append("  directionName: ").append(directionName).append("\n");
        sb.append("  stopIndicator: ").append(stopIndicator).append("\n");
        sb.append("  isClosed: ").append(isClosed).append("\n");
        sb.append("  stopMode: ").append(stopMode).append("\n");
        sb.append("  importSource: ").append(getImportSource()).append("\n");
        sb.append("  primaryCode: ").append(getPrimaryCode()).append("\n");
        sb.append("  placePointType: ").append(getPlacePointType()).append("\n");
        sb.append("  localityName: ").append(getLocalityName()).append("\n");
        sb.append("  country: ").append(getCountry()).append("\n");
        sb.append("  hasResourceStatus: ").append(getHasResourceStatus()).append("\n");
        sb.append("  name: ").append(getName()).append("\n");
        sb.append("  lat: ").append(getLat()).append("\n");
        sb.append("  lng: ").append(getLng()).append("\n");
        sb.append("  parentPrimaryCode: ").append(parentPrimaryCode).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TransitStop that = (TransitStop) o;

        if (additionalCode != null ? !additionalCode.equals(that.additionalCode) : that.additionalCode != null)
            return false;
        if (smsCode != null ? !smsCode.equals(that.smsCode) : that.smsCode != null) return false;
        if (bearing != null ? !bearing.equals(that.bearing) : that.bearing != null) return false;
        if (directionName != null ? !directionName.equals(that.directionName) : that.directionName != null)
            return false;
        if (stopIndicator != null ? !stopIndicator.equals(that.stopIndicator) : that.stopIndicator != null)
            return false;
        if (isClosed != null ? !isClosed.equals(that.isClosed) : that.isClosed != null)
            return false;
        if (stopMode != that.stopMode) return false;
        return parentPrimaryCode != null ? parentPrimaryCode.equals(that.parentPrimaryCode) : that.parentPrimaryCode == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (additionalCode != null ? additionalCode.hashCode() : 0);
        result = 31 * result + (smsCode != null ? smsCode.hashCode() : 0);
        result = 31 * result + (bearing != null ? bearing.hashCode() : 0);
        result = 31 * result + (directionName != null ? directionName.hashCode() : 0);
        result = 31 * result + (stopIndicator != null ? stopIndicator.hashCode() : 0);
        result = 31 * result + (isClosed != null ? isClosed.hashCode() : 0);
        result = 31 * result + (stopMode != null ? stopMode.hashCode() : 0);
        result = 31 * result + (parentPrimaryCode != null ? parentPrimaryCode.hashCode() : 0);
        return result;
    }
}
