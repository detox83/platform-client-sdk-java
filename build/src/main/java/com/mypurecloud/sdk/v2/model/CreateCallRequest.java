package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Destination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateCallRequest
 */

public class CreateCallRequest  implements Serializable {
  
  private String phoneNumber = null;
  private String callFromQueueId = null;
  private String callQueueId = null;
  private String callUserId = null;
  private Integer priority = null;
  private String languageId = null;
  private List<String> routingSkillsIds = new ArrayList<String>();
  private List<String> conversationIds = new ArrayList<String>();
  private List<Destination> participants = new ArrayList<Destination>();

  
  /**
   * The phone number to dial.
   **/
  public CreateCallRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number to dial.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * The queue ID to call on behalf of.
   **/
  public CreateCallRequest callFromQueueId(String callFromQueueId) {
    this.callFromQueueId = callFromQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ID to call on behalf of.")
  @JsonProperty("callFromQueueId")
  public String getCallFromQueueId() {
    return callFromQueueId;
  }
  public void setCallFromQueueId(String callFromQueueId) {
    this.callFromQueueId = callFromQueueId;
  }


  /**
   * The queue ID to call.
   **/
  public CreateCallRequest callQueueId(String callQueueId) {
    this.callQueueId = callQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ID to call.")
  @JsonProperty("callQueueId")
  public String getCallQueueId() {
    return callQueueId;
  }
  public void setCallQueueId(String callQueueId) {
    this.callQueueId = callQueueId;
  }


  /**
   * The user ID to call.
   **/
  public CreateCallRequest callUserId(String callUserId) {
    this.callUserId = callUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID to call.")
  @JsonProperty("callUserId")
  public String getCallUserId() {
    return callUserId;
  }
  public void setCallUserId(String callUserId) {
    this.callUserId = callUserId;
  }


  /**
   * The priority to assign to this call (if calling a queue).
   **/
  public CreateCallRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to assign to this call (if calling a queue).")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * The language skill ID to use for routing this call (if calling a queue).
   **/
  public CreateCallRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language skill ID to use for routing this call (if calling a queue).")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  /**
   * The skill ID's to use for routing this call (if calling a queue).
   **/
  public CreateCallRequest routingSkillsIds(List<String> routingSkillsIds) {
    this.routingSkillsIds = routingSkillsIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill ID's to use for routing this call (if calling a queue).")
  @JsonProperty("routingSkillsIds")
  public List<String> getRoutingSkillsIds() {
    return routingSkillsIds;
  }
  public void setRoutingSkillsIds(List<String> routingSkillsIds) {
    this.routingSkillsIds = routingSkillsIds;
  }


  /**
   * The list of existing call conversations to merge into a new ad-hoc conference.
   **/
  public CreateCallRequest conversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of existing call conversations to merge into a new ad-hoc conference.")
  @JsonProperty("conversationIds")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }


  /**
   * The list of participants to call to create a new ad-hoc conference.
   **/
  public CreateCallRequest participants(List<Destination> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of participants to call to create a new ad-hoc conference.")
  @JsonProperty("participants")
  public List<Destination> getParticipants() {
    return participants;
  }
  public void setParticipants(List<Destination> participants) {
    this.participants = participants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallRequest createCallRequest = (CreateCallRequest) o;
    return Objects.equals(this.phoneNumber, createCallRequest.phoneNumber) &&
        Objects.equals(this.callFromQueueId, createCallRequest.callFromQueueId) &&
        Objects.equals(this.callQueueId, createCallRequest.callQueueId) &&
        Objects.equals(this.callUserId, createCallRequest.callUserId) &&
        Objects.equals(this.priority, createCallRequest.priority) &&
        Objects.equals(this.languageId, createCallRequest.languageId) &&
        Objects.equals(this.routingSkillsIds, createCallRequest.routingSkillsIds) &&
        Objects.equals(this.conversationIds, createCallRequest.conversationIds) &&
        Objects.equals(this.participants, createCallRequest.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, callFromQueueId, callQueueId, callUserId, priority, languageId, routingSkillsIds, conversationIds, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallRequest {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    callFromQueueId: ").append(toIndentedString(callFromQueueId)).append("\n");
    sb.append("    callQueueId: ").append(toIndentedString(callQueueId)).append("\n");
    sb.append("    callUserId: ").append(toIndentedString(callUserId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    routingSkillsIds: ").append(toIndentedString(routingSkillsIds)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

