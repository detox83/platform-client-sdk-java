package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserPresenceNotificationPresenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserPresenceNotification
 */

public class UserPresenceNotification  implements Serializable {
  
  private String source = null;
  private UserPresenceNotificationPresenceDefinition presenceDefinition = null;
  private Boolean primary = null;
  private String message = null;

  
  /**
   **/
  public UserPresenceNotification source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public UserPresenceNotification presenceDefinition(UserPresenceNotificationPresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceDefinition")
  public UserPresenceNotificationPresenceDefinition getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(UserPresenceNotificationPresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }


  /**
   **/
  public UserPresenceNotification primary(Boolean primary) {
    this.primary = primary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  /**
   **/
  public UserPresenceNotification message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPresenceNotification userPresenceNotification = (UserPresenceNotification) o;
    return Objects.equals(this.source, userPresenceNotification.source) &&
        Objects.equals(this.presenceDefinition, userPresenceNotification.presenceDefinition) &&
        Objects.equals(this.primary, userPresenceNotification.primary) &&
        Objects.equals(this.message, userPresenceNotification.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, presenceDefinition, primary, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresenceNotification {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

