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


public enum VehicleType implements Serializable {
    @SerializedName("0")
    TRAM(0),
    @SerializedName("1")
    SUBWAY(1),
    @SerializedName("2")
    RAIL(2),
    @SerializedName("3")
    BUS(3),
    @SerializedName("4")
    FERRY(4),
    @SerializedName("5")
    CABLECAR(5),
    @SerializedName("6")
    GONDOLA(6),
    @SerializedName("7")
    FUNICULAR(7),
    @SerializedName("8")
    AIR(8),
    @SerializedName("9")
    WALKING(9),
    @SerializedName("10")
    CYCLEOWNED(10),
    @SerializedName("11")
    CYCLEHIRED(11),
    @SerializedName("12")
    CAR(12),
    @SerializedName("13")
    COACH(13),
    @SerializedName("14")
    ELICTRICVEHICLE(14),
    @SerializedName("9000")
    MULTIPLE(9000),
    @SerializedName("9999")
    UNSET(9999);


    private final int value;

    private VehicleType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}