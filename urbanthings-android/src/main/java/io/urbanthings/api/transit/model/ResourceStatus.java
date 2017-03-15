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


/**
 * This represents a report relating to the availability of a resource, e.g. a car park with\r\n spaces, a set of bicycle docking stations, etc.
 **/
public class ResourceStatus implements Serializable {

    @SerializedName("primaryCode")
    private String primaryCode = null;
    @SerializedName("importSourceID")
    private String importSourceID = null;
    @SerializedName("timeStamp")
    private Date timeStamp = null;
    @SerializedName("statusText")
    private String statusText = null;
    @SerializedName("availablePlaces")
    private Integer availablePlaces = null;
    @SerializedName("takenPlaces")
    private Integer takenPlaces = null;
    @SerializedName("isClosed")
    private Boolean isClosed = null;

    @SerializedName("trend")
    private ResourceTrendType trend = null;
    @SerializedName("customStatusCode")
    private Integer customStatusCode = null;
    @SerializedName("attributionLabel")
    private String attributionLabel = null;
    @SerializedName("attributionImageURL")
    private String attributionImageURL = null;


    @SerializedName("vehicleType")
    private VehicleType vehicleType = null;


    /**
     * A unique value representing the corresponding PlacePoint
     **/
    public String getPrimaryCode() {
        return primaryCode;
    }


    /**
     * The unique ID of the ImportSource of this data.
     **/
    public String getImportSourceID() {
        return importSourceID;
    }


    /**
     * The time that the data was last updated.
     **/
    public Date getTimeStamp() {
        return timeStamp;
    }


    /**
     * A textual description of the resource status, for presentational purposes.
     **/
    public String getStatusText() {
        return statusText;
    }


    /**
     * The number of unoccupied available 'places' in the resource. This might represent free car-parking spaces, or unoccupied bicycle docks depending upon the type of the resource.
     **/
    public Integer getAvailablePlaces() {
        return availablePlaces;
    }


    /**
     * The number of occupied 'places' in the resource. This might represent occupied car-parking spaces, or bicycles available for hire, depending upon the type of the resource.
     **/
    public Integer getTakenPlaces() {
        return takenPlaces;
    }


    /**
     * A flag indicating the temporary closure of the entire resource
     **/
    public Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * An enumeration that indicates the trend of this resource at the present time, if known. e.g. a car-park might be filling up in the morning and emptying out in the evening.
     **/
    public ResourceTrendType getTrend() {
        return trend;
    }


    /**
     * A custom status code that can be set to indicate a localized state, specific to this resource. Not currently used.
     **/
    public Integer getCustomStatusCode() {
        return customStatusCode;
    }


    /**
     * An attribution label for the data - clients MUST display either this label or the image contained at AttributionImageURL (where present) to \r\n conform with the Terms and Conditions of using the API
     **/
    public String getAttributionLabel() {
        return attributionLabel;
    }


    /**
     * An attribution graphic for the data - clients MUST display either this label or the string contained at AttributionLabel (where present) to \r\n conform with the Terms and Conditions of using the API
     **/
    public String getAttributionImageURL() {
        return attributionImageURL;
    }


    /**
     * The vehicle type most closely corresponding to this resource (bike, car, etc.)
     **/
    public VehicleType getVehicleType() {
        return vehicleType;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceStatus {\n");

        sb.append("  primaryCode: ").append(primaryCode).append("\n");
        sb.append("  importSourceID: ").append(importSourceID).append("\n");
        sb.append("  timeStamp: ").append(timeStamp).append("\n");
        sb.append("  statusText: ").append(statusText).append("\n");
        sb.append("  availablePlaces: ").append(availablePlaces).append("\n");
        sb.append("  takenPlaces: ").append(takenPlaces).append("\n");
        sb.append("  isClosed: ").append(isClosed).append("\n");
        sb.append("  trend: ").append(trend).append("\n");
        sb.append("  customStatusCode: ").append(customStatusCode).append("\n");
        sb.append("  attributionLabel: ").append(attributionLabel).append("\n");
        sb.append("  attributionImageURL: ").append(attributionImageURL).append("\n");
        sb.append("  vehicleType: ").append(vehicleType).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceStatus that = (ResourceStatus) o;

        if (primaryCode != null ? !primaryCode.equals(that.primaryCode) : that.primaryCode != null)
            return false;
        if (importSourceID != null ? !importSourceID.equals(that.importSourceID) : that.importSourceID != null)
            return false;
        if (timeStamp != null ? !timeStamp.equals(that.timeStamp) : that.timeStamp != null)
            return false;
        if (statusText != null ? !statusText.equals(that.statusText) : that.statusText != null)
            return false;
        if (availablePlaces != null ? !availablePlaces.equals(that.availablePlaces) : that.availablePlaces != null)
            return false;
        if (takenPlaces != null ? !takenPlaces.equals(that.takenPlaces) : that.takenPlaces != null)
            return false;
        if (isClosed != null ? !isClosed.equals(that.isClosed) : that.isClosed != null)
            return false;
        if (trend != that.trend) return false;
        if (customStatusCode != null ? !customStatusCode.equals(that.customStatusCode) : that.customStatusCode != null)
            return false;
        if (attributionLabel != null ? !attributionLabel.equals(that.attributionLabel) : that.attributionLabel != null)
            return false;
        if (attributionImageURL != null ? !attributionImageURL.equals(that.attributionImageURL) : that.attributionImageURL != null)
            return false;
        return vehicleType == that.vehicleType;

    }

    @Override
    public int hashCode() {
        int result = primaryCode != null ? primaryCode.hashCode() : 0;
        result = 31 * result + (importSourceID != null ? importSourceID.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        result = 31 * result + (statusText != null ? statusText.hashCode() : 0);
        result = 31 * result + (availablePlaces != null ? availablePlaces.hashCode() : 0);
        result = 31 * result + (takenPlaces != null ? takenPlaces.hashCode() : 0);
        result = 31 * result + (isClosed != null ? isClosed.hashCode() : 0);
        result = 31 * result + (trend != null ? trend.hashCode() : 0);
        result = 31 * result + (customStatusCode != null ? customStatusCode.hashCode() : 0);
        result = 31 * result + (attributionLabel != null ? attributionLabel.hashCode() : 0);
        result = 31 * result + (attributionImageURL != null ? attributionImageURL.hashCode() : 0);
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        return result;
    }

    public enum ResourceTrendType {
        @SerializedName("0")
        STATIC(0),
        @SerializedName("1")
        FILLING(1),
        @SerializedName("2")
        EMPTYING(2);

        private final int value;

        private ResourceTrendType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
