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
 * An object that represents service/disruption information relating to a particular StopBoard
 **/
public class StopBoardMessage implements Serializable {

    @SerializedName("headerText")
    private String headerText = null;
    @SerializedName("mainText")
    private String mainText = null;
    @SerializedName("iconURL")
    private String iconURL = null;
    @SerializedName("color")
    private String color = null;
    @SerializedName("colorCompliment")
    private String colorCompliment = null;
    @SerializedName("linkURL")
    private String linkURL = null;
    @SerializedName("linkText")
    private String linkText = null;
    @SerializedName("severity")
    private Integer severity = null;


    /**
     * A brief, one-line summary of the message
     **/
    public String getHeaderText() {
        return headerText;
    }


    /**
     * The main text of the message.
     **/
    public String getMainText() {
        return mainText;
    }


    /**
     * The URL of an graphic that represents this message - optional.
     **/
    public String getIconURL() {
        return iconURL;
    }

    /**
     * A Hex color code of a color that relates to this message. Clients may wish to use this as a background colour for displayed text.
     **/
    public String getColor() {
        return color;
    }


    /**
     * The Hex Color code of text that can be legibly displayed against backgrounds of the color contained within the 'Color' field.
     **/
    public String getColorCompliment() {
        return colorCompliment;
    }


    /**
     * The URL of a web page with further information relating to this message - optional.
     **/
    public String getLinkURL() {
        return linkURL;
    }


    /**
     * A piece of text that describes the content of the web page referred to in the LinkURL field - optional.
     **/
    public String getLinkText() {
        return linkText;
    }


    /**
     * The severity of the situation, from 1-3, 1 being the least severe
     **/
    public Integer getSeverity() {
        return severity;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopBoardMessage {\n");

        sb.append("  headerText: ").append(headerText).append("\n");
        sb.append("  mainText: ").append(mainText).append("\n");
        sb.append("  iconURL: ").append(iconURL).append("\n");
        sb.append("  color: ").append(color).append("\n");
        sb.append("  colorCompliment: ").append(colorCompliment).append("\n");
        sb.append("  linkURL: ").append(linkURL).append("\n");
        sb.append("  linkText: ").append(linkText).append("\n");
        sb.append("  severity: ").append(severity).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopBoardMessage that = (StopBoardMessage) o;

        if (headerText != null ? !headerText.equals(that.headerText) : that.headerText != null)
            return false;
        if (mainText != null ? !mainText.equals(that.mainText) : that.mainText != null)
            return false;
        if (iconURL != null ? !iconURL.equals(that.iconURL) : that.iconURL != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (colorCompliment != null ? !colorCompliment.equals(that.colorCompliment) : that.colorCompliment != null)
            return false;
        if (linkURL != null ? !linkURL.equals(that.linkURL) : that.linkURL != null) return false;
        if (linkText != null ? !linkText.equals(that.linkText) : that.linkText != null)
            return false;
        return severity != null ? severity.equals(that.severity) : that.severity == null;

    }

    @Override
    public int hashCode() {
        int result = headerText != null ? headerText.hashCode() : 0;
        result = 31 * result + (mainText != null ? mainText.hashCode() : 0);
        result = 31 * result + (iconURL != null ? iconURL.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (colorCompliment != null ? colorCompliment.hashCode() : 0);
        result = 31 * result + (linkURL != null ? linkURL.hashCode() : 0);
        result = 31 * result + (linkText != null ? linkText.hashCode() : 0);
        result = 31 * result + (severity != null ? severity.hashCode() : 0);
        return result;
    }
}
