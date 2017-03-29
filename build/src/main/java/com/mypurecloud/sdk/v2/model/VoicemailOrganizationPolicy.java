package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.PINConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * VoicemailOrganizationPolicy
 */

public class VoicemailOrganizationPolicy  implements Serializable {
  
  private Boolean enabled = null;
  private Integer alertTimeoutSeconds = null;
  private PINConfiguration pinConfiguration = null;
  private String voicemailExtension = null;
  private Boolean pinRequired = null;
  private Boolean sendEmailNotifications = null;
  private Date modifiedDate = null;

  
  @ApiModelProperty(example = "null", value = "Whether voicemail is enable for this organization")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }


  /**
   * The organization's default number of seconds to ring a user's phone before a call is transfered to voicemail
   **/
  public VoicemailOrganizationPolicy alertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The organization's default number of seconds to ring a user's phone before a call is transfered to voicemail")
  @JsonProperty("alertTimeoutSeconds")
  public Integer getAlertTimeoutSeconds() {
    return alertTimeoutSeconds;
  }
  public void setAlertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
  }


  /**
   * The configuration for user PINs to access their voicemail from a phone
   **/
  public VoicemailOrganizationPolicy pinConfiguration(PINConfiguration pinConfiguration) {
    this.pinConfiguration = pinConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration for user PINs to access their voicemail from a phone")
  @JsonProperty("pinConfiguration")
  public PINConfiguration getPinConfiguration() {
    return pinConfiguration;
  }
  public void setPinConfiguration(PINConfiguration pinConfiguration) {
    this.pinConfiguration = pinConfiguration;
  }


  /**
   * The extension for voicemail retrieval.  The default value is *86.
   **/
  public VoicemailOrganizationPolicy voicemailExtension(String voicemailExtension) {
    this.voicemailExtension = voicemailExtension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The extension for voicemail retrieval.  The default value is *86.")
  @JsonProperty("voicemailExtension")
  public String getVoicemailExtension() {
    return voicemailExtension;
  }
  public void setVoicemailExtension(String voicemailExtension) {
    this.voicemailExtension = voicemailExtension;
  }


  /**
   * If this is true, a PIN is required when accessing a user's voicemail from a phone.
   **/
  public VoicemailOrganizationPolicy pinRequired(Boolean pinRequired) {
    this.pinRequired = pinRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this is true, a PIN is required when accessing a user's voicemail from a phone.")
  @JsonProperty("pinRequired")
  public Boolean getPinRequired() {
    return pinRequired;
  }
  public void setPinRequired(Boolean pinRequired) {
    this.pinRequired = pinRequired;
  }


  /**
   * Whether email notifications are sent for new voicemails in the organization. If false, new voicemail email notifications are not be sent for the organization overriding any user or group setting.
   **/
  public VoicemailOrganizationPolicy sendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether email notifications are sent for new voicemails in the organization. If false, new voicemail email notifications are not be sent for the organization overriding any user or group setting.")
  @JsonProperty("sendEmailNotifications")
  public Boolean getSendEmailNotifications() {
    return sendEmailNotifications;
  }
  public void setSendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
  }


  @ApiModelProperty(example = "null", value = "The date the policy was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailOrganizationPolicy voicemailOrganizationPolicy = (VoicemailOrganizationPolicy) o;
    return Objects.equals(this.enabled, voicemailOrganizationPolicy.enabled) &&
        Objects.equals(this.alertTimeoutSeconds, voicemailOrganizationPolicy.alertTimeoutSeconds) &&
        Objects.equals(this.pinConfiguration, voicemailOrganizationPolicy.pinConfiguration) &&
        Objects.equals(this.voicemailExtension, voicemailOrganizationPolicy.voicemailExtension) &&
        Objects.equals(this.pinRequired, voicemailOrganizationPolicy.pinRequired) &&
        Objects.equals(this.sendEmailNotifications, voicemailOrganizationPolicy.sendEmailNotifications) &&
        Objects.equals(this.modifiedDate, voicemailOrganizationPolicy.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, alertTimeoutSeconds, pinConfiguration, voicemailExtension, pinRequired, sendEmailNotifications, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailOrganizationPolicy {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertTimeoutSeconds: ").append(toIndentedString(alertTimeoutSeconds)).append("\n");
    sb.append("    pinConfiguration: ").append(toIndentedString(pinConfiguration)).append("\n");
    sb.append("    voicemailExtension: ").append(toIndentedString(voicemailExtension)).append("\n");
    sb.append("    pinRequired: ").append(toIndentedString(pinRequired)).append("\n");
    sb.append("    sendEmailNotifications: ").append(toIndentedString(sendEmailNotifications)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

