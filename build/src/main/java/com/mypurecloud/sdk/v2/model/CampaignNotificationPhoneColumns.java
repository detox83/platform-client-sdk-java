package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignNotificationPhoneColumns
 */

public class CampaignNotificationPhoneColumns  implements Serializable {
  
  private String columnName = null;
  private String type = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CampaignNotificationPhoneColumns columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   **/
  public CampaignNotificationPhoneColumns type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public CampaignNotificationPhoneColumns additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignNotificationPhoneColumns campaignNotificationPhoneColumns = (CampaignNotificationPhoneColumns) o;
    return Objects.equals(this.columnName, campaignNotificationPhoneColumns.columnName) &&
        Objects.equals(this.type, campaignNotificationPhoneColumns.type) &&
        Objects.equals(this.additionalProperties, campaignNotificationPhoneColumns.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignNotificationPhoneColumns {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

