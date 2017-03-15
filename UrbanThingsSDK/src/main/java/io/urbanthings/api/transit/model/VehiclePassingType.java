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

public enum VehiclePassingType implements Serializable {
    @SerializedName("AllVehicles")
    ALL_VEHICLES("AllVehicles"),
    @SerializedName("TerminatingHereOnly")
    TERMINATING_HERE_ONLY("TerminatingHereOnly"),
    @SerializedName("AllExceptTerminatingHere")
    ALL_EXCEPT_TERMINATING_HERE("AllExceptTerminatingHere"),
    @SerializedName("StartingHereOnly")
    STARTING_HERE_ONLY("StartingHereOnly");

    private final String value;

    private VehiclePassingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return getValue();
    }
}