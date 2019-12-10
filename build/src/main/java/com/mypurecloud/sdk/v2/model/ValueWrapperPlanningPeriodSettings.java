package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.PlanningPeriodSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * An object to provide context to nullable fields in PATCH requests
 */
@ApiModel(description = "An object to provide context to nullable fields in PATCH requests")

public class ValueWrapperPlanningPeriodSettings  implements Serializable {
  
  private PlanningPeriodSettings value = null;

  
  /**
   * The value for the associated field
   **/
  public ValueWrapperPlanningPeriodSettings value(PlanningPeriodSettings value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for the associated field")
  @JsonProperty("value")
  public PlanningPeriodSettings getValue() {
    return value;
  }
  public void setValue(PlanningPeriodSettings value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueWrapperPlanningPeriodSettings valueWrapperPlanningPeriodSettings = (ValueWrapperPlanningPeriodSettings) o;
    return Objects.equals(this.value, valueWrapperPlanningPeriodSettings.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueWrapperPlanningPeriodSettings {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

