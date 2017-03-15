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
 * A Color and Color Compliment to represent a Color on a StopBoard
 **/
public class StopBoardColor implements Serializable {

    @SerializedName("color")
    private String color = null;
    @SerializedName("colorCompliment")
    private String colorCompliment = null;


    /**
     * The Hex Color code of a color that represents this StopBoard - this may be used to add branding-specific colors\r\n to stops that relate to public transportation lines with a published brand color. For example, London Underground\r\n lines have distinct branding colors per-line in the United Kingdom.
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopBoardColor {\n");

        sb.append("  color: ").append(color).append("\n");
        sb.append("  colorCompliment: ").append(colorCompliment).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopBoardColor that = (StopBoardColor) o;

        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        return colorCompliment != null ? colorCompliment.equals(that.colorCompliment) : that.colorCompliment == null;

    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (colorCompliment != null ? colorCompliment.hashCode() : 0);
        return result;
    }
}
