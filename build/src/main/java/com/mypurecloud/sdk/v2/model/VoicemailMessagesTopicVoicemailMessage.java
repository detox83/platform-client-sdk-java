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
 * VoicemailMessagesTopicVoicemailMessage
 */

public class VoicemailMessagesTopicVoicemailMessage  implements Serializable {
  
  private String id = null;
  private Boolean read = null;
  private Integer audioRecordingDurationSeconds = null;
  private Integer audioRecordingSizeBytes = null;
  private Date createdDate = null;
  private Date modifiedDate = null;
  private String callerAddress = null;
  private String callerName = null;
  private String action = null;
  private String note = null;
  private Boolean deleted = null;
  private String modifiedByUserId = null;

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage audioRecordingDurationSeconds(Integer audioRecordingDurationSeconds) {
    this.audioRecordingDurationSeconds = audioRecordingDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("audioRecordingDurationSeconds")
  public Integer getAudioRecordingDurationSeconds() {
    return audioRecordingDurationSeconds;
  }
  public void setAudioRecordingDurationSeconds(Integer audioRecordingDurationSeconds) {
    this.audioRecordingDurationSeconds = audioRecordingDurationSeconds;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage audioRecordingSizeBytes(Integer audioRecordingSizeBytes) {
    this.audioRecordingSizeBytes = audioRecordingSizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("audioRecordingSizeBytes")
  public Integer getAudioRecordingSizeBytes() {
    return audioRecordingSizeBytes;
  }
  public void setAudioRecordingSizeBytes(Integer audioRecordingSizeBytes) {
    this.audioRecordingSizeBytes = audioRecordingSizeBytes;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage callerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callerAddress")
  public String getCallerAddress() {
    return callerAddress;
  }
  public void setCallerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callerName")
  public String getCallerName() {
    return callerName;
  }
  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage action(String action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailMessage modifiedByUserId(String modifiedByUserId) {
    this.modifiedByUserId = modifiedByUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedByUserId")
  public String getModifiedByUserId() {
    return modifiedByUserId;
  }
  public void setModifiedByUserId(String modifiedByUserId) {
    this.modifiedByUserId = modifiedByUserId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailMessagesTopicVoicemailMessage voicemailMessagesTopicVoicemailMessage = (VoicemailMessagesTopicVoicemailMessage) o;
    return Objects.equals(this.id, voicemailMessagesTopicVoicemailMessage.id) &&
        Objects.equals(this.read, voicemailMessagesTopicVoicemailMessage.read) &&
        Objects.equals(this.audioRecordingDurationSeconds, voicemailMessagesTopicVoicemailMessage.audioRecordingDurationSeconds) &&
        Objects.equals(this.audioRecordingSizeBytes, voicemailMessagesTopicVoicemailMessage.audioRecordingSizeBytes) &&
        Objects.equals(this.createdDate, voicemailMessagesTopicVoicemailMessage.createdDate) &&
        Objects.equals(this.modifiedDate, voicemailMessagesTopicVoicemailMessage.modifiedDate) &&
        Objects.equals(this.callerAddress, voicemailMessagesTopicVoicemailMessage.callerAddress) &&
        Objects.equals(this.callerName, voicemailMessagesTopicVoicemailMessage.callerName) &&
        Objects.equals(this.action, voicemailMessagesTopicVoicemailMessage.action) &&
        Objects.equals(this.note, voicemailMessagesTopicVoicemailMessage.note) &&
        Objects.equals(this.deleted, voicemailMessagesTopicVoicemailMessage.deleted) &&
        Objects.equals(this.modifiedByUserId, voicemailMessagesTopicVoicemailMessage.modifiedByUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, read, audioRecordingDurationSeconds, audioRecordingSizeBytes, createdDate, modifiedDate, callerAddress, callerName, action, note, deleted, modifiedByUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMessagesTopicVoicemailMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    audioRecordingDurationSeconds: ").append(toIndentedString(audioRecordingDurationSeconds)).append("\n");
    sb.append("    audioRecordingSizeBytes: ").append(toIndentedString(audioRecordingSizeBytes)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    modifiedByUserId: ").append(toIndentedString(modifiedByUserId)).append("\n");
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

