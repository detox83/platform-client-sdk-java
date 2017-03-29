package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.VoicemailCopyRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * VoicemailMessage
 */

public class VoicemailMessage  implements Serializable {
  
  private String id = null;
  private Conversation conversation = null;
  private Boolean read = null;
  private Integer audioRecordingDurationSeconds = null;
  private Long audioRecordingSizeBytes = null;
  private Date createdDate = null;
  private Date modifiedDate = null;
  private String callerAddress = null;
  private String callerName = null;
  private User callerUser = null;
  private Boolean deleted = null;
  private String note = null;
  private User user = null;
  private Group group = null;
  private VoicemailCopyRecord copiedFrom = null;
  private List<VoicemailCopyRecord> copiedTo = new ArrayList<VoicemailCopyRecord>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The conversation that the voicemail message is associated with
   **/
  public VoicemailMessage conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation that the voicemail message is associated with")
  @JsonProperty("conversation")
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }


  /**
   * Whether the voicemail message is marked as read
   **/
  public VoicemailMessage read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the voicemail message is marked as read")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }


  @ApiModelProperty(example = "null", value = "The voicemail message's audio recording duration in seconds")
  @JsonProperty("audioRecordingDurationSeconds")
  public Integer getAudioRecordingDurationSeconds() {
    return audioRecordingDurationSeconds;
  }


  @ApiModelProperty(example = "null", value = "The voicemail message's audio recording size in bytes")
  @JsonProperty("audioRecordingSizeBytes")
  public Long getAudioRecordingSizeBytes() {
    return audioRecordingSizeBytes;
  }


  @ApiModelProperty(example = "null", value = "The date the voicemail message was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }


  @ApiModelProperty(example = "null", value = "The date the voicemail message was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }


  @ApiModelProperty(example = "null", value = "The caller address")
  @JsonProperty("callerAddress")
  public String getCallerAddress() {
    return callerAddress;
  }


  @ApiModelProperty(example = "null", value = "Optionally the name of the caller that left the voicemail message if the caller was a known user")
  @JsonProperty("callerName")
  public String getCallerName() {
    return callerName;
  }


  /**
   * Optionally the user that left the voicemail message if the caller was a known user
   **/
  public VoicemailMessage callerUser(User callerUser) {
    this.callerUser = callerUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optionally the user that left the voicemail message if the caller was a known user")
  @JsonProperty("callerUser")
  public User getCallerUser() {
    return callerUser;
  }
  public void setCallerUser(User callerUser) {
    this.callerUser = callerUser;
  }


  /**
   * Whether the voicemail message has been marked as deleted
   **/
  public VoicemailMessage deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the voicemail message has been marked as deleted")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  /**
   * An optional note
   **/
  public VoicemailMessage note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional note")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  /**
   * The user that the voicemail message belongs to or null which means the voicemail message belongs to a group
   **/
  public VoicemailMessage user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that the voicemail message belongs to or null which means the voicemail message belongs to a group")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }


  /**
   * The group that the voicemail message belongs to or null which means the voicemail message belongs to a user
   **/
  public VoicemailMessage group(Group group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The group that the voicemail message belongs to or null which means the voicemail message belongs to a user")
  @JsonProperty("group")
  public Group getGroup() {
    return group;
  }
  public void setGroup(Group group) {
    this.group = group;
  }


  /**
   * Represents where this voicemail message was copied from
   **/
  public VoicemailMessage copiedFrom(VoicemailCopyRecord copiedFrom) {
    this.copiedFrom = copiedFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents where this voicemail message was copied from")
  @JsonProperty("copiedFrom")
  public VoicemailCopyRecord getCopiedFrom() {
    return copiedFrom;
  }
  public void setCopiedFrom(VoicemailCopyRecord copiedFrom) {
    this.copiedFrom = copiedFrom;
  }


  /**
   * Represents where this voicemail has been copied to
   **/
  public VoicemailMessage copiedTo(List<VoicemailCopyRecord> copiedTo) {
    this.copiedTo = copiedTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents where this voicemail has been copied to")
  @JsonProperty("copiedTo")
  public List<VoicemailCopyRecord> getCopiedTo() {
    return copiedTo;
  }
  public void setCopiedTo(List<VoicemailCopyRecord> copiedTo) {
    this.copiedTo = copiedTo;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailMessage voicemailMessage = (VoicemailMessage) o;
    return Objects.equals(this.id, voicemailMessage.id) &&
        Objects.equals(this.conversation, voicemailMessage.conversation) &&
        Objects.equals(this.read, voicemailMessage.read) &&
        Objects.equals(this.audioRecordingDurationSeconds, voicemailMessage.audioRecordingDurationSeconds) &&
        Objects.equals(this.audioRecordingSizeBytes, voicemailMessage.audioRecordingSizeBytes) &&
        Objects.equals(this.createdDate, voicemailMessage.createdDate) &&
        Objects.equals(this.modifiedDate, voicemailMessage.modifiedDate) &&
        Objects.equals(this.callerAddress, voicemailMessage.callerAddress) &&
        Objects.equals(this.callerName, voicemailMessage.callerName) &&
        Objects.equals(this.callerUser, voicemailMessage.callerUser) &&
        Objects.equals(this.deleted, voicemailMessage.deleted) &&
        Objects.equals(this.note, voicemailMessage.note) &&
        Objects.equals(this.user, voicemailMessage.user) &&
        Objects.equals(this.group, voicemailMessage.group) &&
        Objects.equals(this.copiedFrom, voicemailMessage.copiedFrom) &&
        Objects.equals(this.copiedTo, voicemailMessage.copiedTo) &&
        Objects.equals(this.selfUri, voicemailMessage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversation, read, audioRecordingDurationSeconds, audioRecordingSizeBytes, createdDate, modifiedDate, callerAddress, callerName, callerUser, deleted, note, user, group, copiedFrom, copiedTo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    audioRecordingDurationSeconds: ").append(toIndentedString(audioRecordingDurationSeconds)).append("\n");
    sb.append("    audioRecordingSizeBytes: ").append(toIndentedString(audioRecordingSizeBytes)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerUser: ").append(toIndentedString(callerUser)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    copiedFrom: ").append(toIndentedString(copiedFrom)).append("\n");
    sb.append("    copiedTo: ").append(toIndentedString(copiedTo)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

