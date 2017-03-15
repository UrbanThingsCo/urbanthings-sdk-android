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
 * A place, i.e. a geographical entity
 **/
public class PlacePoint implements Serializable {

    @SerializedName("importSource")
    private String importSource = null;
    @SerializedName("primaryCode")
    private String primaryCode = null;

    @SerializedName("placePointType")
    private transient PlacePointType placePointType = null;
    @SerializedName("localityName")
    private String localityName = null;
    @SerializedName("country")
    private String country = null;
    @SerializedName("hasResourceStatus")
    private Boolean hasResourceStatus = null;
    @SerializedName("name")
    private String name = null;
    @SerializedName("lat")
    private Double lat = null;
    @SerializedName("lng")
    private Double lng = null;

    public PlacePoint() {

    }

    public PlacePoint(String name, double lat, double lng) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }

    /**
     * The import source (DataSet) that this object was originally sourced from
     **/
    public String getImportSource() {
        return importSource;
    }

    /**
     * A globally unique identifier representing this object
     **/
    public String getPrimaryCode() {
        return primaryCode;
    }


    /**
     * The type of placepoint - e.g. a transit stop, road, POI, Lat/Lng coordinate, etc.\r\n In some cases, this can be useful to determine the type of a Transit Stop when the fuller derived class (TransitStop) is\r\n not returned from the server
     **/
    public PlacePointType getPlacePointType() {
        return placePointType;
    }


    /**
     * The locality where this item is located. Can be blank.
     **/
    public String getLocalityName() {
        return localityName;
    }


    /**
     * The country where this item is located, in ISO 3166-1 alpha-2 format.
     **/
    public String getCountry() {
        return country;
    }


    /**
     * If this is set to TRUE, the PlacePoint represents a resource such as a car park or bicycle dock.\r\n Further information as to the current status of the resource can be obtained by making an additional call to the API to obtain \r\n the current ResourceStatus for this PlacePoint
     **/
    public Boolean getHasResourceStatus() {
        return hasResourceStatus;
    }


    /**
     * The item's name, in its native Locale
     **/
    public String getName() {
        return name;
    }

    /**
     * The latitudinal component of the location of this item
     **/
    public Double getLat() {
        return lat;
    }


    /**
     * The longitudinal component of the location of this item
     **/
    public Double getLng() {
        return lng;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlacePoint {\n");

        sb.append("  importSource: ").append(importSource).append("\n");
        sb.append("  primaryCode: ").append(primaryCode).append("\n");
        sb.append("  placePointType: ").append(placePointType).append("\n");
        sb.append("  localityName: ").append(localityName).append("\n");
        sb.append("  country: ").append(country).append("\n");
        sb.append("  hasResourceStatus: ").append(hasResourceStatus).append("\n");
        sb.append("  name: ").append(name).append("\n");
        sb.append("  lat: ").append(lat).append("\n");
        sb.append("  lng: ").append(lng).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlacePoint that = (PlacePoint) o;

        if (importSource != null ? !importSource.equals(that.importSource) : that.importSource != null)
            return false;
        if (primaryCode != null ? !primaryCode.equals(that.primaryCode) : that.primaryCode != null)
            return false;
        if (placePointType != that.placePointType) return false;
        if (localityName != null ? !localityName.equals(that.localityName) : that.localityName != null)
            return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (hasResourceStatus != null ? !hasResourceStatus.equals(that.hasResourceStatus) : that.hasResourceStatus != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        return lng != null ? lng.equals(that.lng) : that.lng == null;

    }

    @Override
    public int hashCode() {
        int result = importSource != null ? importSource.hashCode() : 0;
        result = 31 * result + (primaryCode != null ? primaryCode.hashCode() : 0);
        result = 31 * result + (placePointType != null ? placePointType.hashCode() : 0);
        result = 31 * result + (localityName != null ? localityName.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (hasResourceStatus != null ? hasResourceStatus.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        return result;
    }
}
