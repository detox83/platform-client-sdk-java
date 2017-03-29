package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Request body for fetching the schedule for a group of users over a given time range
 */
@ApiModel(description = "Request body for fetching the schedule for a group of users over a given time range")

public class UserListScheduleRequestBody  implements Serializable {
  
  private List<String> userIds = new ArrayList<String>();
  private Date startDate = null;
  private Date endDate = null;

  
  /**
   * The user ids for which to fetch schedules
   **/
  public UserListScheduleRequestBody userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user ids for which to fetch schedules")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * Beginning of the range of schedules to fetch, in ISO-8601 format
   **/
  public UserListScheduleRequestBody startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Beginning of the range of schedules to fetch, in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * End of the range of schedules to fetch, in ISO-8601 format
   **/
  public UserListScheduleRequestBody endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End of the range of schedules to fetch, in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserListScheduleRequestBody userListScheduleRequestBody = (UserListScheduleRequestBody) o;
    return Objects.equals(this.userIds, userListScheduleRequestBody.userIds) &&
        Objects.equals(this.startDate, userListScheduleRequestBody.startDate) &&
        Objects.equals(this.endDate, userListScheduleRequestBody.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserListScheduleRequestBody {\n");
    
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

