package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * VoicemailCopyRecord
 */

public class VoicemailCopyRecord  implements Serializable {
  
  private User user = null;
  private Group group = null;
  private Date date = null;

  
  /**
   * The user that the voicemail message was copied to/from
   **/
  public VoicemailCopyRecord user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that the voicemail message was copied to/from")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }


  /**
   * The group that the voicemail message was copied to/from
   **/
  public VoicemailCopyRecord group(Group group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The group that the voicemail message was copied to/from")
  @JsonProperty("group")
  public Group getGroup() {
    return group;
  }
  public void setGroup(Group group) {
    this.group = group;
  }


  @ApiModelProperty(example = "null", value = "The date when the voicemail was copied. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailCopyRecord voicemailCopyRecord = (VoicemailCopyRecord) o;
    return Objects.equals(this.user, voicemailCopyRecord.user) &&
        Objects.equals(this.group, voicemailCopyRecord.group) &&
        Objects.equals(this.date, voicemailCopyRecord.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailCopyRecord {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

