package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CallRecord
 */

public class CallRecord  implements Serializable {
  
  private Date lastAttempt = null;
  private String lastResult = null;

  
  @ApiModelProperty(example = "null", value = "Timestamp of the last attempt to reach this number. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("lastAttempt")
  public Date getLastAttempt() {
    return lastAttempt;
  }


  @ApiModelProperty(example = "null", value = "Result of the last attempt to reach this number")
  @JsonProperty("lastResult")
  public String getLastResult() {
    return lastResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallRecord callRecord = (CallRecord) o;
    return Objects.equals(this.lastAttempt, callRecord.lastAttempt) &&
        Objects.equals(this.lastResult, callRecord.lastResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastAttempt, lastResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallRecord {\n");
    
    sb.append("    lastAttempt: ").append(toIndentedString(lastAttempt)).append("\n");
    sb.append("    lastResult: ").append(toIndentedString(lastResult)).append("\n");
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

