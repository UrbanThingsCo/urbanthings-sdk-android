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

import java.util.List;


public class DirectionsResponse {

    @SerializedName("responseID")
    private String responseID = null;
    @SerializedName("status")
    private DirectionsResponseStatus status = null;
    @SerializedName("journeys")
    private List<Journey> journeys = null;
    @SerializedName("placePoints")
    private List<PlacePoint> placePoints = null;
    @SerializedName("sourceName")
    private String sourceName = null;
    @SerializedName("attributionsHTML")
    private String attributionsHTML = null;
    @SerializedName("warningsHTML")
    private String warningsHTML = null;


    /**
     **/
    public String getResponseID() {
        return responseID;
    }


    /**
     **/
    public DirectionsResponseStatus getStatus() {
        return status;
    }

    /**
     **/
    public List<Journey> getJourneys() {
        return journeys;
    }


    /**
     **/
    public List<PlacePoint> getPlacePoints() {
        return placePoints;
    }


    /**
     **/
    public String getSourceName() {
        return sourceName;
    }

    /**
     **/
    public String getAttributionsHTML() {
        return attributionsHTML;
    }

    /**
     **/
    public String getWarningsHTML() {
        return warningsHTML;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectionsResponse {\n");

        sb.append("  responseID: ").append(responseID).append("\n");
        sb.append("  status: ").append(status).append("\n");
        sb.append("  journeys: ").append(journeys).append("\n");
        sb.append("  placePoints: ").append(placePoints).append("\n");
        sb.append("  sourceName: ").append(sourceName).append("\n");
        sb.append("  attributionsHTML: ").append(attributionsHTML).append("\n");
        sb.append("  warningsHTML: ").append(warningsHTML).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionsResponse that = (DirectionsResponse) o;

        if (responseID != null ? !responseID.equals(that.responseID) : that.responseID != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (journeys != null ? !journeys.equals(that.journeys) : that.journeys != null)
            return false;
        if (placePoints != null ? !placePoints.equals(that.placePoints) : that.placePoints != null)
            return false;
        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null)
            return false;
        if (attributionsHTML != null ? !attributionsHTML.equals(that.attributionsHTML) : that.attributionsHTML != null)
            return false;
        return warningsHTML != null ? warningsHTML.equals(that.warningsHTML) : that.warningsHTML == null;

    }

    @Override
    public int hashCode() {
        int result = responseID != null ? responseID.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (journeys != null ? journeys.hashCode() : 0);
        result = 31 * result + (placePoints != null ? placePoints.hashCode() : 0);
        result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0);
        result = 31 * result + (attributionsHTML != null ? attributionsHTML.hashCode() : 0);
        result = 31 * result + (warningsHTML != null ? warningsHTML.hashCode() : 0);
        return result;
    }
}
