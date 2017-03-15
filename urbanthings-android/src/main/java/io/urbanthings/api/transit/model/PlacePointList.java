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


public class PlacePointList implements Serializable {

    @SerializedName("placePoints")
    private List<PlacePoint> placePoints = null;
    @SerializedName("sourceName")
    private String sourceName = null;
    @SerializedName("sourceIconURL")
    private String sourceIconURL = null;


    /**
     **/
    public List<PlacePoint> getPlacePoints() {
        return placePoints;
    }

    /**
     * The source of the location lookup - this should be displayed to end-users
     **/
    public String getSourceName() {
        return sourceName;
    }


    /**
     * A URL to a graphic representing the source of the location lookup - this should be displayed to end-users
     **/
    public String getSourceIconURL() {
        return sourceIconURL;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlacePointList {\n");

        sb.append("  placePoints: ").append(placePoints).append("\n");
        sb.append("  sourceName: ").append(sourceName).append("\n");
        sb.append("  sourceIconURL: ").append(sourceIconURL).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlacePointList that = (PlacePointList) o;

        if (placePoints != null ? !placePoints.equals(that.placePoints) : that.placePoints != null)
            return false;
        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null)
            return false;
        return sourceIconURL != null ? sourceIconURL.equals(that.sourceIconURL) : that.sourceIconURL == null;

    }

    @Override
    public int hashCode() {
        int result = placePoints != null ? placePoints.hashCode() : 0;
        result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0);
        result = 31 * result + (sourceIconURL != null ? sourceIconURL.hashCode() : 0);
        return result;
    }
}
