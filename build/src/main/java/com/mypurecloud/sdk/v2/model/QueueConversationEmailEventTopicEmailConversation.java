package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.QueueConversationEmailEventTopicEmailMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEmailEventTopicEmailConversation
 */

public class QueueConversationEmailEventTopicEmailConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<QueueConversationEmailEventTopicEmailMediaParticipant> participants = new ArrayList<QueueConversationEmailEventTopicEmailMediaParticipant>();
  private List<String> otherMediaUris = new ArrayList<String>();

  
  /**
   **/
  public QueueConversationEmailEventTopicEmailConversation id(String id) {
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
  public QueueConversationEmailEventTopicEmailConversation name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public QueueConversationEmailEventTopicEmailConversation participants(List<QueueConversationEmailEventTopicEmailMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<QueueConversationEmailEventTopicEmailMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<QueueConversationEmailEventTopicEmailMediaParticipant> participants) {
    this.participants = participants;
  }

  
  /**
   **/
  public QueueConversationEmailEventTopicEmailConversation otherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherMediaUris")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEmailEventTopicEmailConversation queueConversationEmailEventTopicEmailConversation = (QueueConversationEmailEventTopicEmailConversation) o;
    return Objects.equals(this.id, queueConversationEmailEventTopicEmailConversation.id) &&
        Objects.equals(this.name, queueConversationEmailEventTopicEmailConversation.name) &&
        Objects.equals(this.participants, queueConversationEmailEventTopicEmailConversation.participants) &&
        Objects.equals(this.otherMediaUris, queueConversationEmailEventTopicEmailConversation.otherMediaUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEmailEventTopicEmailConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
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
