package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactCenterSettings
 */

public class ContactCenterSettings  implements Serializable {
  
  private Boolean removeSkillsFromBlindTransfer = null;

  
  /**
   * Strip skills from transfer
   **/
  public ContactCenterSettings removeSkillsFromBlindTransfer(Boolean removeSkillsFromBlindTransfer) {
    this.removeSkillsFromBlindTransfer = removeSkillsFromBlindTransfer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Strip skills from transfer")
  @JsonProperty("removeSkillsFromBlindTransfer")
  public Boolean getRemoveSkillsFromBlindTransfer() {
    return removeSkillsFromBlindTransfer;
  }
  public void setRemoveSkillsFromBlindTransfer(Boolean removeSkillsFromBlindTransfer) {
    this.removeSkillsFromBlindTransfer = removeSkillsFromBlindTransfer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactCenterSettings contactCenterSettings = (ContactCenterSettings) o;
    return Objects.equals(this.removeSkillsFromBlindTransfer, contactCenterSettings.removeSkillsFromBlindTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removeSkillsFromBlindTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactCenterSettings {\n");
    
    sb.append("    removeSkillsFromBlindTransfer: ").append(toIndentedString(removeSkillsFromBlindTransfer)).append("\n");
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

