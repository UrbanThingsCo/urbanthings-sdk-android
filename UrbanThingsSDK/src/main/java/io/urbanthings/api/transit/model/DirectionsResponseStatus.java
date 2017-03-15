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


public class DirectionsResponseStatus implements Serializable {

    @SerializedName("statusCode")
    private StatusCodeEnum statusCode = null;
    @SerializedName("errorCode")
    private ErrorCodeEnum errorCode = null;
    @SerializedName("errorMessage")
    private String errorMessage = null;

    /**
     **/
    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    /**
     **/
    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }

    /**
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectionsResponseStatus {\n");

        sb.append("  statusCode: ").append(statusCode).append("\n");
        sb.append("  errorCode: ").append(errorCode).append("\n");
        sb.append("  errorMessage: ").append(errorMessage).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionsResponseStatus that = (DirectionsResponseStatus) o;

        if (statusCode != that.statusCode) return false;
        if (errorCode != that.errorCode) return false;
        return errorMessage != null ? errorMessage.equals(that.errorMessage) : that.errorMessage == null;

    }

    @Override
    public int hashCode() {
        int result = statusCode != null ? statusCode.hashCode() : 0;
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (errorMessage != null ? errorMessage.hashCode() : 0);
        return result;
    }

    public enum StatusCodeEnum {
        ZERO, ONE, TWO, THREE
//                1, 2, 3
    }

    public enum ErrorCodeEnum {
        ZERO, ONE, TWO
//        0,1,2,
    }
}
