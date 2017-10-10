package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Digits
 */

public class Digits  implements Serializable {
  
  private String digits = null;

  
  /**
   * A string representing the DTMF tones to play. Valid DTMF values: 1234567890#*ABCD
   **/
  public Digits digits(String digits) {
    this.digits = digits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A string representing the DTMF tones to play. Valid DTMF values: 1234567890#*ABCD")
  @JsonProperty("digits")
  public String getDigits() {
    return digits;
  }
  public void setDigits(String digits) {
    this.digits = digits;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Digits digits = (Digits) o;
    return Objects.equals(this.digits, digits.digits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Digits {\n");
    
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
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

