package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RecordingDataV2NotificationUserData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * RecordingDataV2NotificationLockData
 */

public class RecordingDataV2NotificationLockData  implements Serializable {
  
  private RecordingDataV2NotificationUserData lockedBy = null;
  private Date dateCreated = null;
  private Date dateExpires = null;

  
  /**
   **/
  public RecordingDataV2NotificationLockData lockedBy(RecordingDataV2NotificationUserData lockedBy) {
    this.lockedBy = lockedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockedBy")
  public RecordingDataV2NotificationUserData getLockedBy() {
    return lockedBy;
  }
  public void setLockedBy(RecordingDataV2NotificationUserData lockedBy) {
    this.lockedBy = lockedBy;
  }


  /**
   **/
  public RecordingDataV2NotificationLockData dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public RecordingDataV2NotificationLockData dateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingDataV2NotificationLockData recordingDataV2NotificationLockData = (RecordingDataV2NotificationLockData) o;
    return Objects.equals(this.lockedBy, recordingDataV2NotificationLockData.lockedBy) &&
        Objects.equals(this.dateCreated, recordingDataV2NotificationLockData.dateCreated) &&
        Objects.equals(this.dateExpires, recordingDataV2NotificationLockData.dateExpires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockedBy, dateCreated, dateExpires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingDataV2NotificationLockData {\n");
    
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
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

