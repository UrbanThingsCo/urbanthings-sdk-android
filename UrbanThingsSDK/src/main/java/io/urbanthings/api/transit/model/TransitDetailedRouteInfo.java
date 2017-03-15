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


public class TransitDetailedRouteInfo implements Serializable {

    @SerializedName("routeDescription")
    private String routeDescription = null;
    @SerializedName("agencyCode")
    private String agencyCode = null;
    @SerializedName("routeID")
    private String routeID = null;
    @SerializedName("lineName")
    private String lineName = null;
    @SerializedName("lineColor")
    private String lineColor = null;
    @SerializedName("lineTextColor")
    private String lineTextColor = null;
    @SerializedName("operatorName")
    private String operatorName = null;
    @SerializedName("operatorID")
    private String operatorID = null;
    @SerializedName("operatorRegion")
    private String operatorRegion = null;
    @SerializedName("routeType")
    private VehicleType routeType = null;
    @SerializedName("centrePointLat")
    private Double centrePointLat = null;
    @SerializedName("centrePointLng")
    private Double centrePointLng = null;


    /**
     **/
    public String getRouteDescription() {
        return routeDescription;
    }


    /**
     * A unique code that represents the agency operating this particular route
     **/
    public String getAgencyCode() {
        return agencyCode;
    }


    /**
     * A unique code that represents this route. Note that IDs in some regions may change periodically and thus should not be stored on the client.
     **/
    public String getRouteID() {
        return routeID;
    }


    /**
     * The public-facing line name, e.g. '324' for a 324 bus.
     **/
    public String getLineName() {
        return lineName;
    }


    /**
     * The display color of the route
     **/
    public String getLineColor() {
        return lineColor;
    }


    /**
     * The display color for text to be overlaid onto the LineColor
     **/
    public String getLineTextColor() {
        return lineTextColor;
    }


    /**
     * The name of the operator that runs this route
     **/
    public String getOperatorName() {
        return operatorName;
    }


    /**
     * A unique identifier representing the operator that runs this route
     **/
    public String getOperatorID() {
        return operatorID;
    }


    /**
     * The region, within the agency, of this operator. Not used in most agencies. Used in the UK.
     **/
    public String getOperatorRegion() {
        return operatorRegion;
    }


    /**
     * The mode of transport that runs along this route.
     **/
    public VehicleType getRouteType() {
        return routeType;
    }


    /**
     * The latitude of the geographical centre point of this route. (based on analysing the route's longest trips in each direction) This may be used to aid in sorting routes by proximity
     **/
    public Double getCentrePointLat() {
        return centrePointLat;
    }


    /**
     * The longitude of the geographical centre point of this route. (based on analysing the route's longest trips in each direction) This may be used to aid in sorting routes by proximity
     **/
    public Double getCentrePointLng() {
        return centrePointLng;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitDetailedRouteInfo {\n");

        sb.append("  routeDescription: ").append(routeDescription).append("\n");
        sb.append("  agencyCode: ").append(agencyCode).append("\n");
        sb.append("  routeID: ").append(routeID).append("\n");
        sb.append("  lineName: ").append(lineName).append("\n");
        sb.append("  lineColor: ").append(lineColor).append("\n");
        sb.append("  lineTextColor: ").append(lineTextColor).append("\n");
        sb.append("  operatorName: ").append(operatorName).append("\n");
        sb.append("  operatorID: ").append(operatorID).append("\n");
        sb.append("  operatorRegion: ").append(operatorRegion).append("\n");
        sb.append("  routeType: ").append(routeType).append("\n");
        sb.append("  centrePointLat: ").append(centrePointLat).append("\n");
        sb.append("  centrePointLng: ").append(centrePointLng).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitDetailedRouteInfo that = (TransitDetailedRouteInfo) o;

        if (routeDescription != null ? !routeDescription.equals(that.routeDescription) : that.routeDescription != null)
            return false;
        if (agencyCode != null ? !agencyCode.equals(that.agencyCode) : that.agencyCode != null)
            return false;
        if (routeID != null ? !routeID.equals(that.routeID) : that.routeID != null) return false;
        if (lineName != null ? !lineName.equals(that.lineName) : that.lineName != null)
            return false;
        if (lineColor != null ? !lineColor.equals(that.lineColor) : that.lineColor != null)
            return false;
        if (lineTextColor != null ? !lineTextColor.equals(that.lineTextColor) : that.lineTextColor != null)
            return false;
        if (operatorName != null ? !operatorName.equals(that.operatorName) : that.operatorName != null)
            return false;
        if (operatorID != null ? !operatorID.equals(that.operatorID) : that.operatorID != null)
            return false;
        if (operatorRegion != null ? !operatorRegion.equals(that.operatorRegion) : that.operatorRegion != null)
            return false;
        if (routeType != that.routeType) return false;
        if (centrePointLat != null ? !centrePointLat.equals(that.centrePointLat) : that.centrePointLat != null)
            return false;
        return centrePointLng != null ? centrePointLng.equals(that.centrePointLng) : that.centrePointLng == null;

    }

    @Override
    public int hashCode() {
        int result = routeDescription != null ? routeDescription.hashCode() : 0;
        result = 31 * result + (agencyCode != null ? agencyCode.hashCode() : 0);
        result = 31 * result + (routeID != null ? routeID.hashCode() : 0);
        result = 31 * result + (lineName != null ? lineName.hashCode() : 0);
        result = 31 * result + (lineColor != null ? lineColor.hashCode() : 0);
        result = 31 * result + (lineTextColor != null ? lineTextColor.hashCode() : 0);
        result = 31 * result + (operatorName != null ? operatorName.hashCode() : 0);
        result = 31 * result + (operatorID != null ? operatorID.hashCode() : 0);
        result = 31 * result + (operatorRegion != null ? operatorRegion.hashCode() : 0);
        result = 31 * result + (routeType != null ? routeType.hashCode() : 0);
        result = 31 * result + (centrePointLat != null ? centrePointLat.hashCode() : 0);
        result = 31 * result + (centrePointLng != null ? centrePointLng.hashCode() : 0);
        return result;
    }
}
