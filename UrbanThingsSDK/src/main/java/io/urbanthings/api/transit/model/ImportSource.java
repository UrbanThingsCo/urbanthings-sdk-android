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
 * Information relating to an external dataset that has been imported into the system.
 **/
public class ImportSource implements Serializable {

    @SerializedName("name")
    private String name = null;
    @SerializedName("importSourceID")
    private String importSourceID = null;
    @SerializedName("attributionLabel")
    private String attributionLabel = null;
    @SerializedName("attributionImageURL")
    private String attributionImageURL = null;
    @SerializedName("attributionNotes")
    private String attributionNotes = null;
    @SerializedName("comments")
    private String comments = null;
    @SerializedName("sourceInfoURL")
    private String sourceInfoURL = null;
    @SerializedName("sourceDataURL")
    private String sourceDataURL = null;


    /**
     * The name of the dataset (where available)
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * The unique identifier representing the source of the data. Used as a foreign key in some objects, e.g. TransitAgency
     **/
    public String getImportSourceID() {
        return importSourceID;
    }

    /**
     **/
    public String getAttributionLabel() {
        return attributionLabel;
    }


    /**
     * An attribution graphic for the data - clients MUST display either this label or the string contained at AttributionLabel to \r\n conform with the Terms and Conditions of using the API
     **/
    public String getAttributionImageURL() {
        return attributionImageURL;
    }


    /**
     * Optional guidance explaining how the AttributionText and AttributionImageURL should be displayed
     **/
    public String getAttributionNotes() {
        return attributionNotes;
    }


    /**
     * Optional comments to clarify the source of the data or explain its origin
     **/
    public String getComments() {
        return comments;
    }


    /**
     * Optional URL to a web page describing the source of the data
     **/
    public String getSourceInfoURL() {
        return sourceInfoURL;
    }


    /**
     * Optional URL linking to the external data itself
     **/
    public String getSourceDataURL() {
        return sourceDataURL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportSource {\n");

        sb.append("  name: ").append(name).append("\n");
        sb.append("  importSourceID: ").append(importSourceID).append("\n");
        sb.append("  attributionLabel: ").append(attributionLabel).append("\n");
        sb.append("  attributionImageURL: ").append(attributionImageURL).append("\n");
        sb.append("  attributionNotes: ").append(attributionNotes).append("\n");
        sb.append("  comments: ").append(comments).append("\n");
        sb.append("  sourceInfoURL: ").append(sourceInfoURL).append("\n");
        sb.append("  sourceDataURL: ").append(sourceDataURL).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImportSource that = (ImportSource) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (importSourceID != null ? !importSourceID.equals(that.importSourceID) : that.importSourceID != null)
            return false;
        if (attributionLabel != null ? !attributionLabel.equals(that.attributionLabel) : that.attributionLabel != null)
            return false;
        if (attributionImageURL != null ? !attributionImageURL.equals(that.attributionImageURL) : that.attributionImageURL != null)
            return false;
        if (attributionNotes != null ? !attributionNotes.equals(that.attributionNotes) : that.attributionNotes != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null)
            return false;
        if (sourceInfoURL != null ? !sourceInfoURL.equals(that.sourceInfoURL) : that.sourceInfoURL != null)
            return false;
        return sourceDataURL != null ? sourceDataURL.equals(that.sourceDataURL) : that.sourceDataURL == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (importSourceID != null ? importSourceID.hashCode() : 0);
        result = 31 * result + (attributionLabel != null ? attributionLabel.hashCode() : 0);
        result = 31 * result + (attributionImageURL != null ? attributionImageURL.hashCode() : 0);
        result = 31 * result + (attributionNotes != null ? attributionNotes.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (sourceInfoURL != null ? sourceInfoURL.hashCode() : 0);
        result = 31 * result + (sourceDataURL != null ? sourceDataURL.hashCode() : 0);
        return result;
    }
}
