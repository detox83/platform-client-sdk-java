package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ConversationCallEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationCallEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationCallEventTopicConversationRoutingData
 */

public class ConversationCallEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationCallEventTopicUriReference queue = null;
  private ConversationCallEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationCallEventTopicUriReference> skills = new ArrayList<ConversationCallEventTopicUriReference>();
  private List<ConversationCallEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationCallEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationCallEventTopicConversationRoutingData queue(ConversationCallEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationCallEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationCallEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationCallEventTopicConversationRoutingData language(ConversationCallEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationCallEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationCallEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationCallEventTopicConversationRoutingData priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   **/
  public ConversationCallEventTopicConversationRoutingData skills(List<ConversationCallEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationCallEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationCallEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationCallEventTopicConversationRoutingData scoredAgents(List<ConversationCallEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationCallEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationCallEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCallEventTopicConversationRoutingData conversationCallEventTopicConversationRoutingData = (ConversationCallEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationCallEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationCallEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationCallEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationCallEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationCallEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCallEventTopicConversationRoutingData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
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

