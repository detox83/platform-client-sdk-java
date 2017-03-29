package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.TimeOffRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffRequestList
 */

public class TimeOffRequestList  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<TimeOffRequest> timeOffRequests = new ArrayList<TimeOffRequest>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public TimeOffRequestList name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public TimeOffRequestList timeOffRequests(List<TimeOffRequest> timeOffRequests) {
    this.timeOffRequests = timeOffRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeOffRequests")
  public List<TimeOffRequest> getTimeOffRequests() {
    return timeOffRequests;
  }
  public void setTimeOffRequests(List<TimeOffRequest> timeOffRequests) {
    this.timeOffRequests = timeOffRequests;
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
    TimeOffRequestList timeOffRequestList = (TimeOffRequestList) o;
    return Objects.equals(this.id, timeOffRequestList.id) &&
        Objects.equals(this.name, timeOffRequestList.name) &&
        Objects.equals(this.timeOffRequests, timeOffRequestList.timeOffRequests) &&
        Objects.equals(this.selfUri, timeOffRequestList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, timeOffRequests, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeOffRequests: ").append(toIndentedString(timeOffRequests)).append("\n");
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

