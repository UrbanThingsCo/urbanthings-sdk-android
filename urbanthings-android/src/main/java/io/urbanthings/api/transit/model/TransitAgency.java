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
 * A calendar that represents when a particular TransitTrip runs.
 **/
public class TransitAgency implements Serializable {

    @SerializedName("agencyID")
    private String agencyID = null;
    @SerializedName("agencyName")
    private String agencyName = null;
    @SerializedName("agencyURL")
    private String agencyURL = null;
    @SerializedName("agencyTimeZone")
    private String agencyTimeZone = null;
    @SerializedName("agencyLanguage")
    private String agencyLanguage = null;
    @SerializedName("agencyPhone")
    private String agencyPhone = null;
    @SerializedName("agencyFareURL")
    private String agencyFareURL = null;
    @SerializedName("agencyRegion")
    private String agencyRegion = null;
    @SerializedName("agencyImportSource")
    private String agencyImportSource = null;


    /**
     * The unique identifier representing the agency
     **/
    public String getAgencyID() {
        return agencyID;
    }


    /**
     * The name of the transit agency
     **/
    public String getAgencyName() {
        return agencyName;
    }


    /**
     * The main website for the agency
     **/
    public String getAgencyURL() {
        return agencyURL;
    }


    /**
     * The time zone in which the agency's head office is based
     **/
    public String getAgencyTimeZone() {
        return agencyTimeZone;
    }


    /**
     * An ISO language code representing the agency's main operating language
     **/
    public String getAgencyLanguage() {
        return agencyLanguage;
    }


    /**
     * An International phone number for the agency's transit-related customer service department
     **/
    public String getAgencyPhone() {
        return agencyPhone;
    }


    /**
     * The URL of a page detailing the agency's fares
     **/
    public String getAgencyFareURL() {
        return agencyFareURL;
    }


    /**
     * The location of the agency
     **/
    public String getAgencyRegion() {
        return agencyRegion;
    }


    /**
     * The data import source for this agency
     **/
    public String getAgencyImportSource() {
        return agencyImportSource;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransitAgency {\n");

        sb.append("  agencyID: ").append(agencyID).append("\n");
        sb.append("  agencyName: ").append(agencyName).append("\n");
        sb.append("  agencyURL: ").append(agencyURL).append("\n");
        sb.append("  agencyTimeZone: ").append(agencyTimeZone).append("\n");
        sb.append("  agencyLanguage: ").append(agencyLanguage).append("\n");
        sb.append("  agencyPhone: ").append(agencyPhone).append("\n");
        sb.append("  agencyFareURL: ").append(agencyFareURL).append("\n");
        sb.append("  agencyRegion: ").append(agencyRegion).append("\n");
        sb.append("  agencyImportSource: ").append(agencyImportSource).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitAgency that = (TransitAgency) o;

        if (agencyID != null ? !agencyID.equals(that.agencyID) : that.agencyID != null)
            return false;
        if (agencyName != null ? !agencyName.equals(that.agencyName) : that.agencyName != null)
            return false;
        if (agencyURL != null ? !agencyURL.equals(that.agencyURL) : that.agencyURL != null)
            return false;
        if (agencyTimeZone != null ? !agencyTimeZone.equals(that.agencyTimeZone) : that.agencyTimeZone != null)
            return false;
        if (agencyLanguage != null ? !agencyLanguage.equals(that.agencyLanguage) : that.agencyLanguage != null)
            return false;
        if (agencyPhone != null ? !agencyPhone.equals(that.agencyPhone) : that.agencyPhone != null)
            return false;
        if (agencyFareURL != null ? !agencyFareURL.equals(that.agencyFareURL) : that.agencyFareURL != null)
            return false;
        if (agencyRegion != null ? !agencyRegion.equals(that.agencyRegion) : that.agencyRegion != null)
            return false;
        return agencyImportSource != null ? agencyImportSource.equals(that.agencyImportSource) : that.agencyImportSource == null;

    }

    @Override
    public int hashCode() {
        int result = agencyID != null ? agencyID.hashCode() : 0;
        result = 31 * result + (agencyName != null ? agencyName.hashCode() : 0);
        result = 31 * result + (agencyURL != null ? agencyURL.hashCode() : 0);
        result = 31 * result + (agencyTimeZone != null ? agencyTimeZone.hashCode() : 0);
        result = 31 * result + (agencyLanguage != null ? agencyLanguage.hashCode() : 0);
        result = 31 * result + (agencyPhone != null ? agencyPhone.hashCode() : 0);
        result = 31 * result + (agencyFareURL != null ? agencyFareURL.hashCode() : 0);
        result = 31 * result + (agencyRegion != null ? agencyRegion.hashCode() : 0);
        result = 31 * result + (agencyImportSource != null ? agencyImportSource.hashCode() : 0);
        return result;
    }
}
