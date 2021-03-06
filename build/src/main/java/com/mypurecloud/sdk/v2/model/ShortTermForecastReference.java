package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A pointer to a short term forecast
 */
@ApiModel(description = "A pointer to a short term forecast")

public class ShortTermForecastReference  implements Serializable {
  
  private String id = null;
  private String weekDate = null;
  private String description = null;
  private String selfUri = null;

  
  /**
   * The id of the short term forecast
   **/
  public ShortTermForecastReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the short term forecast")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The weekDate of the short term forecast in yyyy-MM-dd format
   **/
  public ShortTermForecastReference weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekDate of the short term forecast in yyyy-MM-dd format")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * The description of the short term forecast
   **/
  public ShortTermForecastReference description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the short term forecast")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortTermForecastReference shortTermForecastReference = (ShortTermForecastReference) o;
    return Objects.equals(this.id, shortTermForecastReference.id) &&
        Objects.equals(this.weekDate, shortTermForecastReference.weekDate) &&
        Objects.equals(this.description, shortTermForecastReference.description) &&
        Objects.equals(this.selfUri, shortTermForecastReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, description, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortTermForecastReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

