package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmMoveManagementUnitTopicBusinessUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmMoveManagementUnitTopicMoveManagementUnitNotification
 */

public class WfmMoveManagementUnitTopicMoveManagementUnitNotification  implements Serializable {
  
  private WfmMoveManagementUnitTopicBusinessUnit businessUnit = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    CANCELED("Canceled"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  
  /**
   **/
  public WfmMoveManagementUnitTopicMoveManagementUnitNotification businessUnit(WfmMoveManagementUnitTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnit")
  public WfmMoveManagementUnitTopicBusinessUnit getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(WfmMoveManagementUnitTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
  }

  
  /**
   **/
  public WfmMoveManagementUnitTopicMoveManagementUnitNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmMoveManagementUnitTopicMoveManagementUnitNotification wfmMoveManagementUnitTopicMoveManagementUnitNotification = (WfmMoveManagementUnitTopicMoveManagementUnitNotification) o;
    return Objects.equals(this.businessUnit, wfmMoveManagementUnitTopicMoveManagementUnitNotification.businessUnit) &&
        Objects.equals(this.status, wfmMoveManagementUnitTopicMoveManagementUnitNotification.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnit, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmMoveManagementUnitTopicMoveManagementUnitNotification {\n");
    
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

