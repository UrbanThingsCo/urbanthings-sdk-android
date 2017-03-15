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
 * A group that can be used to define a logical grouping of various StopBoardRow objects
 **/
public class StopBoardGroup implements Serializable {

    @SerializedName("groupID")
    private String groupID = null;
    @SerializedName("label")
    private String label = null;
    @SerializedName("color")
    private String color = null;
    @SerializedName("colorCompliment")
    private String colorCompliment = null;


    /**
     * An identifier for this group, unique to the parent StopBoard object
     **/
    public String getGroupID() {
        return groupID;
    }


    /**
     * A label describing the nature of this group, suitable for public display. \r\n The nature of groups is varied so examples might include: 'Arrivals', '326' or 'Platform 7'
     **/
    public String getLabel() {
        return label;
    }


    /**
     * The hex color code of a color that represents this group.
     **/
    public String getColor() {
        return color;
    }


    /**
     * The hex color code of a color in which text might be legibly displayed against a background coloured using the Color field
     **/
    public String getColorCompliment() {
        return colorCompliment;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopBoardGroup {\n");

        sb.append("  groupID: ").append(groupID).append("\n");
        sb.append("  label: ").append(label).append("\n");
        sb.append("  color: ").append(color).append("\n");
        sb.append("  colorCompliment: ").append(colorCompliment).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopBoardGroup that = (StopBoardGroup) o;

        if (groupID != null ? !groupID.equals(that.groupID) : that.groupID != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        return colorCompliment != null ? colorCompliment.equals(that.colorCompliment) : that.colorCompliment == null;

    }

    @Override
    public int hashCode() {
        int result = groupID != null ? groupID.hashCode() : 0;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (colorCompliment != null ? colorCompliment.hashCode() : 0);
        return result;
    }
}
