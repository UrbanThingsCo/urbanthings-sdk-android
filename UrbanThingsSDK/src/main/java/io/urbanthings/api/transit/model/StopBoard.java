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


/**
 * An object that represents an arrivals/departure board relating to whole or part of a TransitStop
 **/
public class StopBoard implements Serializable {

    @SerializedName("headerLabel")
    private String headerLabel = null;
    @SerializedName("rows")
    private List<StopBoardRow> rows = null;
    @SerializedName("groups")
    private List<StopBoardGroup> groups = null;
    @SerializedName("messages")
    private List<StopBoardMessage> messages = null;
    @SerializedName("hideSecondary")
    private Boolean hideSecondary = null;
    @SerializedName("hidePlatform")
    private Boolean hidePlatform = null;
    @SerializedName("enableGroupFiltering")
    private Boolean enableGroupFiltering = null;
    @SerializedName("idHeader")
    private String idHeader = null;
    @SerializedName("mainHeader")
    private String mainHeader = null;
    @SerializedName("secondaryHeader")
    private String secondaryHeader = null;
    @SerializedName("platformHeader")
    private String platformHeader = null;
    @SerializedName("timeHeader")
    private String timeHeader = null;
    @SerializedName("noDataLabel")
    private String noDataLabel = null;
    @SerializedName("attributionLabel")
    private String attributionLabel = null;
    @SerializedName("attributionImageURL")
    private String attributionImageURL = null;
    @SerializedName("color")
    private String color = null;
    @SerializedName("colorCompliment")
    private String colorCompliment = null;
    @SerializedName("colors")
    private List<StopBoardColor> colors = null;

    /**
     * A piece of text that describes the StopBoard, unique to a particular StopBoardResponse.\r\n In cases where the StopBoardResponse contains only a single StopBoard, this may be blank or set to the value 'STOPBOARD'
     **/
    public String getHeaderLabel() {
        return headerLabel;
    }


    /**
     * The StopBoardRow objects that make up this StopBoard, each corresponding to a vehicle that will call at this stop
     **/
    public List<StopBoardRow> getRows() {
        return rows;
    }


    /**
     * A list of StopBoardGroup objects, each with a unique ID. \r\n Each StopBoardRow object may be identified with one of these groups by means of its GroupID field
     **/
    public List<StopBoardGroup> getGroups() {
        return groups;
    }


    /**
     * A list of service/disruption messages that relate to this particular StopBoard
     **/
    public List<StopBoardMessage> getMessages() {
        return messages;
    }


    /**
     * If this is set to TRUE, no StopBoardRows (as contained in the Rows property) contain a SecondaryLabel string
     **/
    public Boolean getHideSecondary() {
        return hideSecondary;
    }


    /**
     * If this is set to TRUE, no StopBoardRows (as contained in the Rows property) contain a PlatformLabel string
     **/
    public Boolean getHidePlatform() {
        return hidePlatform;
    }


    /**
     * If this is set to FALSE, a client should consider that each group of StopBoardRows represents a distinct dataset.\r\n For example, one group might represent 'Arrivals' and another group might represent 'Departures'
     **/
    public Boolean getEnableGroupFiltering() {
        return enableGroupFiltering;
    }


    /**
     * A string that describes the purpose of the IDLabel string contained in each StopBoardRow\r\n Clients may wish to display this string as a 'column header' in a presented stop board.
     **/
    public String getIdHeader() {
        return idHeader;
    }


    /**
     * A string that describes the purpose of the MainLabel string contained in each StopBoardRow.\r\n Clients may wish to display this string as a 'column header' in a presented stop board.
     **/
    public String getMainHeader() {
        return mainHeader;
    }


    /**
     * A string that describes the purpose of the SecondaryLabel string contained in each StopBoardRow\r\n Clients may wish to display this string as a 'column header' in a presented stop board.
     **/
    public String getSecondaryHeader() {
        return secondaryHeader;
    }


    /**
     * A string that describes the purpose of the PlatformLabel string contained in each StopBoardRow\r\n Clients may wish to display this string as a 'column header' in a presented stop board.
     **/
    public String getPlatformHeader() {
        return platformHeader;
    }


    /**
     * A string that describes the purpose of the TimeLabel string contained in each StopBoardRow\r\n Clients may wish to display this string as a 'column header' in a presented stop board.
     **/
    public String getTimeHeader() {
        return timeHeader;
    }


    /**
     * A string that indicates the reason why no data has been returned in this StopBoard.\r\n In cases where StopBoardRows exist, this will be NULL
     **/
    public String getNoDataLabel() {
        return noDataLabel;
    }


    /**
     * An attribution label for the data - clients MUST display either this label or the image contained at AttributionImageURL to \r\n conform with the Terms and Conditions of using the API
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
     * The Hex Color code of a color that represents this StopBoard - this may be used to add branding-specific colors\r\n to stops that relate to public transportation lines with a published brand color. For example, London Underground\r\n lines have distinct branding colors per-line in the United Kingdom.
     **/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    /**
     * The Hex Color code of text that can be legibly displayed against backgrounds of the color contained within the 'Color' field.
     **/
    public String getColorCompliment() {
        return colorCompliment;
    }


    /**
     * A list of Colors that are representative of this StopBoard; similar to the Color and ColorCompliment fields, this is used\r\n where the StopBoard may represent a platform with multiple lines of different colors and/or branding
     **/
    public List<StopBoardColor> getColors() {
        return colors;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StopBoard{");
        sb.append("headerLabel='").append(headerLabel).append('\'');
        sb.append(", rows=").append(rows);
        sb.append(", groups=").append(groups);
        sb.append(", messages=").append(messages);
        sb.append(", hideSecondary=").append(hideSecondary);
        sb.append(", hidePlatform=").append(hidePlatform);
        sb.append(", enableGroupFiltering=").append(enableGroupFiltering);
        sb.append(", idHeader='").append(idHeader).append('\'');
        sb.append(", mainHeader='").append(mainHeader).append('\'');
        sb.append(", secondaryHeader='").append(secondaryHeader).append('\'');
        sb.append(", platformHeader='").append(platformHeader).append('\'');
        sb.append(", timeHeader='").append(timeHeader).append('\'');
        sb.append(", noDataLabel='").append(noDataLabel).append('\'');
        sb.append(", attributionLabel='").append(attributionLabel).append('\'');
        sb.append(", attributionImageURL='").append(attributionImageURL).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", colorCompliment='").append(colorCompliment).append('\'');
        sb.append(", colors=").append(colors);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopBoard stopBoard = (StopBoard) o;

        if (headerLabel != null ? !headerLabel.equals(stopBoard.headerLabel) : stopBoard.headerLabel != null)
            return false;
        if (rows != null ? !rows.equals(stopBoard.rows) : stopBoard.rows != null) return false;
        if (groups != null ? !groups.equals(stopBoard.groups) : stopBoard.groups != null)
            return false;
        if (messages != null ? !messages.equals(stopBoard.messages) : stopBoard.messages != null)
            return false;
        if (hideSecondary != null ? !hideSecondary.equals(stopBoard.hideSecondary) : stopBoard.hideSecondary != null)
            return false;
        if (hidePlatform != null ? !hidePlatform.equals(stopBoard.hidePlatform) : stopBoard.hidePlatform != null)
            return false;
        if (enableGroupFiltering != null ? !enableGroupFiltering.equals(stopBoard.enableGroupFiltering) : stopBoard.enableGroupFiltering != null)
            return false;
        if (idHeader != null ? !idHeader.equals(stopBoard.idHeader) : stopBoard.idHeader != null)
            return false;
        if (mainHeader != null ? !mainHeader.equals(stopBoard.mainHeader) : stopBoard.mainHeader != null)
            return false;
        if (secondaryHeader != null ? !secondaryHeader.equals(stopBoard.secondaryHeader) : stopBoard.secondaryHeader != null)
            return false;
        if (platformHeader != null ? !platformHeader.equals(stopBoard.platformHeader) : stopBoard.platformHeader != null)
            return false;
        if (timeHeader != null ? !timeHeader.equals(stopBoard.timeHeader) : stopBoard.timeHeader != null)
            return false;
        if (noDataLabel != null ? !noDataLabel.equals(stopBoard.noDataLabel) : stopBoard.noDataLabel != null)
            return false;
        if (attributionLabel != null ? !attributionLabel.equals(stopBoard.attributionLabel) : stopBoard.attributionLabel != null)
            return false;
        if (attributionImageURL != null ? !attributionImageURL.equals(stopBoard.attributionImageURL) : stopBoard.attributionImageURL != null)
            return false;
        if (color != null ? !color.equals(stopBoard.color) : stopBoard.color != null) return false;
        if (colorCompliment != null ? !colorCompliment.equals(stopBoard.colorCompliment) : stopBoard.colorCompliment != null)
            return false;
        return colors != null ? colors.equals(stopBoard.colors) : stopBoard.colors == null;

    }

    @Override
    public int hashCode() {
        int result = headerLabel != null ? headerLabel.hashCode() : 0;
        result = 31 * result + (rows != null ? rows.hashCode() : 0);
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        result = 31 * result + (messages != null ? messages.hashCode() : 0);
        result = 31 * result + (hideSecondary != null ? hideSecondary.hashCode() : 0);
        result = 31 * result + (hidePlatform != null ? hidePlatform.hashCode() : 0);
        result = 31 * result + (enableGroupFiltering != null ? enableGroupFiltering.hashCode() : 0);
        result = 31 * result + (idHeader != null ? idHeader.hashCode() : 0);
        result = 31 * result + (mainHeader != null ? mainHeader.hashCode() : 0);
        result = 31 * result + (secondaryHeader != null ? secondaryHeader.hashCode() : 0);
        result = 31 * result + (platformHeader != null ? platformHeader.hashCode() : 0);
        result = 31 * result + (timeHeader != null ? timeHeader.hashCode() : 0);
        result = 31 * result + (noDataLabel != null ? noDataLabel.hashCode() : 0);
        result = 31 * result + (attributionLabel != null ? attributionLabel.hashCode() : 0);
        result = 31 * result + (attributionImageURL != null ? attributionImageURL.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (colorCompliment != null ? colorCompliment.hashCode() : 0);
        result = 31 * result + (colors != null ? colors.hashCode() : 0);
        return result;
    }
}
