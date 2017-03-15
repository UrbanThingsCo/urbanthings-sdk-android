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

public enum PlacePointType implements Serializable {
    @SerializedName("0")
    PLACE(0),
    @SerializedName("1")
    ROAD(1),
    @SerializedName("2")
    TRANSITSTOP(2),
    @SerializedName("3")
    POSTCODE(3),
    @SerializedName("4")
    LATLNG(4),
    @SerializedName("5")
    LOCALITY(5),
    @SerializedName("6")
    POI(6),
    @SerializedName("100")
    TRANSITSTOPTRAM(100),
    @SerializedName("101")
    TRANSITSTOPSUBWAY(101),
    @SerializedName("102")
    TRANSITSTOPRAIL(102),
    @SerializedName("103")
    TRANSITSTOPBUS(103),
    @SerializedName("104")
    TRANSITSTOPFERRY(104),
    @SerializedName("105")
    TRANSITSTOPCABLECAR(105),
    @SerializedName("106")
    TRANSITSTOPGONDOLA(106),
    @SerializedName("107")
    TRANSITSTOPFUNICULAR(107),
    @SerializedName("108")
    TRANSITSTOPAIR(108),
    @SerializedName("111")
    CYCLEHIREDOCK(111),
    @SerializedName("112")
    CARPARKINGSPACE(112);

    private final int value;

    private PlacePointType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}