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


public class DirectionsRequestOptions implements Serializable {

    @SerializedName("maximumLegs")
    private Integer maximumLegs = null;
    @SerializedName("walkSpeed")
    private Double walkSpeed = null;
    @SerializedName("maximumWalkingTimeBetweenLegs")
    private Integer maximumWalkingTimeBetweenLegs = null;
    @SerializedName("maximumWalkingLegTime")
    private Integer maximumWalkingLegTime = null;
    @SerializedName("maximumTotalWalkingTime")
    private Integer maximumTotalWalkingTime = null;
    @SerializedName("acceptableVehicleTypes")
    private List<VehicleType> acceptableVehicleTypes = null;
    @SerializedName("planningPrioritization")
    private PlanningPrioritizationEnum planningPrioritization = null;
    @SerializedName("accessibilityNoStairs")
    private Boolean accessibilityNoStairs = null;
    @SerializedName("accessibilityNoEscalators")
    private Boolean accessibilityNoEscalators = null;
    @SerializedName("accessibilityNoElevators")
    private Boolean accessibilityNoElevators = null;
    @SerializedName("accessibilityNoStepsToVehicle")
    private Boolean accessibilityNoStepsToVehicle = null;
    @SerializedName("accessibilityNoStepsToPlatform")
    private Boolean accessibilityNoStepsToPlatform = null;
    @SerializedName("avoidedLineTypes")
    private List<AvoidedLineTypesEnum> avoidedLineTypes = null;

    /**
     * The maximum acceptable number of journey legs to be returned, i.e. the maximum acceptable number of changes minus one.
     **/
    public Integer getMaximumLegs() {
        return maximumLegs;
    }

    public void setMaximumLegs(Integer maximumLegs) {
        this.maximumLegs = maximumLegs;
    }

    /**
     * The user's walking speed, in kilometers per hour. Note that an average walking speed is around 5kph. \r\n For the purposes of certain planning engines, anything above 5.2kph will be considered 'fast', anything below 4.5kph will be considered 'slow'
     **/
    public Double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(Double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    /**
     * The maximum acceptable walking time to connect between legs, in minutes
     **/
    public Integer getMaximumWalkingTimeBetweenLegs() {
        return maximumWalkingTimeBetweenLegs;
    }

    public void setMaximumWalkingTimeBetweenLegs(Integer maximumWalkingTimeBetweenLegs) {
        this.maximumWalkingTimeBetweenLegs = maximumWalkingTimeBetweenLegs;
    }

    /**
     * The Maximum acceptable walking time for an individual walking leg, in minutes
     **/
    public Integer getMaximumWalkingLegTime() {
        return maximumWalkingLegTime;
    }

    public void setMaximumWalkingLegTime(Integer maximumWalkingLegTime) {
        this.maximumWalkingLegTime = maximumWalkingLegTime;
    }

    /**
     * The Maximum total walking time that is acceptable\r\n This is currently only supported by the MDV journey planner.
     **/
    public Integer getMaximumTotalWalkingTime() {
        return maximumTotalWalkingTime;
    }

    public void setMaximumTotalWalkingTime(Integer maximumTotalWalkingTime) {
        this.maximumTotalWalkingTime = maximumTotalWalkingTime;
    }

    /**
     **/
    public List<VehicleType> getAcceptableVehicleTypes() {
        return acceptableVehicleTypes;
    }

    public void setAcceptableVehicleTypes(List<VehicleType> acceptableVehicleTypes) {
        this.acceptableVehicleTypes = acceptableVehicleTypes;
    }

    /**
     **/
    public PlanningPrioritizationEnum getPlanningPrioritization() {
        return planningPrioritization;
    }

    public void setPlanningPrioritization(PlanningPrioritizationEnum planningPrioritization) {
        this.planningPrioritization = planningPrioritization;
    }

    /**
     * Prefer a journey plan that avoids using stairs
     **/
    public Boolean getAccessibilityNoStairs() {
        return accessibilityNoStairs;
    }

    public void setAccessibilityNoStairs(Boolean accessibilityNoStairs) {
        this.accessibilityNoStairs = accessibilityNoStairs;
    }

    /**
     * Prefer a journey plan that avoids taking escalators
     **/
    public Boolean getAccessibilityNoEscalators() {
        return accessibilityNoEscalators;
    }

    public void setAccessibilityNoEscalators(Boolean accessibilityNoEscalators) {
        this.accessibilityNoEscalators = accessibilityNoEscalators;
    }

    /**
     * Prefer a journey plan that avoids taking elevators (lifts)
     **/
    public Boolean getAccessibilityNoElevators() {
        return accessibilityNoElevators;
    }

    public void setAccessibilityNoElevators(Boolean accessibilityNoElevators) {
        this.accessibilityNoElevators = accessibilityNoElevators;
    }

    /**
     * Prefer a journey plan that does not involve using steps to get on or off a vehicle
     **/
    public Boolean getAccessibilityNoStepsToVehicle() {
        return accessibilityNoStepsToVehicle;
    }

    public void setAccessibilityNoStepsToVehicle(Boolean accessibilityNoStepsToVehicle) {
        this.accessibilityNoStepsToVehicle = accessibilityNoStepsToVehicle;
    }

    /**
     * Prefer a journey plan that does not involve using steps to get to the platform
     **/
    public Boolean getAccessibilityNoStepsToPlatform() {
        return accessibilityNoStepsToPlatform;
    }

    public void setAccessibilityNoStepsToPlatform(Boolean accessibilityNoStepsToPlatform) {
        this.accessibilityNoStepsToPlatform = accessibilityNoStepsToPlatform;
    }

    /**
     * Avoid certain types of line - this is mainly used in road planning, e.g. to avoid Toll Roads
     **/
    public List<AvoidedLineTypesEnum> getAvoidedLineTypes() {
        return avoidedLineTypes;
    }

    public void setAvoidedLineTypes(List<AvoidedLineTypesEnum> avoidedLineTypes) {
        this.avoidedLineTypes = avoidedLineTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectionsRequestOptions {\n");

        sb.append("  maximumLegs: ").append(maximumLegs).append("\n");
        sb.append("  walkSpeed: ").append(walkSpeed).append("\n");
        sb.append("  maximumWalkingTimeBetweenLegs: ").append(maximumWalkingTimeBetweenLegs).append("\n");
        sb.append("  maximumWalkingLegTime: ").append(maximumWalkingLegTime).append("\n");
        sb.append("  maximumTotalWalkingTime: ").append(maximumTotalWalkingTime).append("\n");
        sb.append("  acceptableVehicleTypes: ").append(acceptableVehicleTypes).append("\n");
        sb.append("  planningPrioritization: ").append(planningPrioritization).append("\n");
        sb.append("  accessibilityNoStairs: ").append(accessibilityNoStairs).append("\n");
        sb.append("  accessibilityNoEscalators: ").append(accessibilityNoEscalators).append("\n");
        sb.append("  accessibilityNoElevators: ").append(accessibilityNoElevators).append("\n");
        sb.append("  accessibilityNoStepsToVehicle: ").append(accessibilityNoStepsToVehicle).append("\n");
        sb.append("  accessibilityNoStepsToPlatform: ").append(accessibilityNoStepsToPlatform).append("\n");
        sb.append("  avoidedLineTypes: ").append(avoidedLineTypes).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionsRequestOptions that = (DirectionsRequestOptions) o;

        if (maximumLegs != null ? !maximumLegs.equals(that.maximumLegs) : that.maximumLegs != null)
            return false;
        if (walkSpeed != null ? !walkSpeed.equals(that.walkSpeed) : that.walkSpeed != null)
            return false;
        if (maximumWalkingTimeBetweenLegs != null ? !maximumWalkingTimeBetweenLegs.equals(that.maximumWalkingTimeBetweenLegs) : that.maximumWalkingTimeBetweenLegs != null)
            return false;
        if (maximumWalkingLegTime != null ? !maximumWalkingLegTime.equals(that.maximumWalkingLegTime) : that.maximumWalkingLegTime != null)
            return false;
        if (maximumTotalWalkingTime != null ? !maximumTotalWalkingTime.equals(that.maximumTotalWalkingTime) : that.maximumTotalWalkingTime != null)
            return false;
        if (acceptableVehicleTypes != null ? !acceptableVehicleTypes.equals(that.acceptableVehicleTypes) : that.acceptableVehicleTypes != null)
            return false;
        if (planningPrioritization != that.planningPrioritization) return false;
        if (accessibilityNoStairs != null ? !accessibilityNoStairs.equals(that.accessibilityNoStairs) : that.accessibilityNoStairs != null)
            return false;
        if (accessibilityNoEscalators != null ? !accessibilityNoEscalators.equals(that.accessibilityNoEscalators) : that.accessibilityNoEscalators != null)
            return false;
        if (accessibilityNoElevators != null ? !accessibilityNoElevators.equals(that.accessibilityNoElevators) : that.accessibilityNoElevators != null)
            return false;
        if (accessibilityNoStepsToVehicle != null ? !accessibilityNoStepsToVehicle.equals(that.accessibilityNoStepsToVehicle) : that.accessibilityNoStepsToVehicle != null)
            return false;
        if (accessibilityNoStepsToPlatform != null ? !accessibilityNoStepsToPlatform.equals(that.accessibilityNoStepsToPlatform) : that.accessibilityNoStepsToPlatform != null)
            return false;
        return avoidedLineTypes != null ? avoidedLineTypes.equals(that.avoidedLineTypes) : that.avoidedLineTypes == null;

    }

    @Override
    public int hashCode() {
        int result = maximumLegs != null ? maximumLegs.hashCode() : 0;
        result = 31 * result + (walkSpeed != null ? walkSpeed.hashCode() : 0);
        result = 31 * result + (maximumWalkingTimeBetweenLegs != null ? maximumWalkingTimeBetweenLegs.hashCode() : 0);
        result = 31 * result + (maximumWalkingLegTime != null ? maximumWalkingLegTime.hashCode() : 0);
        result = 31 * result + (maximumTotalWalkingTime != null ? maximumTotalWalkingTime.hashCode() : 0);
        result = 31 * result + (acceptableVehicleTypes != null ? acceptableVehicleTypes.hashCode() : 0);
        result = 31 * result + (planningPrioritization != null ? planningPrioritization.hashCode() : 0);
        result = 31 * result + (accessibilityNoStairs != null ? accessibilityNoStairs.hashCode() : 0);
        result = 31 * result + (accessibilityNoEscalators != null ? accessibilityNoEscalators.hashCode() : 0);
        result = 31 * result + (accessibilityNoElevators != null ? accessibilityNoElevators.hashCode() : 0);
        result = 31 * result + (accessibilityNoStepsToVehicle != null ? accessibilityNoStepsToVehicle.hashCode() : 0);
        result = 31 * result + (accessibilityNoStepsToPlatform != null ? accessibilityNoStepsToPlatform.hashCode() : 0);
        result = 31 * result + (avoidedLineTypes != null ? avoidedLineTypes.hashCode() : 0);
        return result;
    }

    public enum PlanningPrioritizationEnum {
        //0,1,2,3,
        ZERO, ONE, TWO, THREE
    }

    public enum AvoidedLineTypesEnum {
        ZERO
    }
}
