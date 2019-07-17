package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ConversationVideoEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationVideoEventTopicScoredAgent
 */

public class ConversationVideoEventTopicScoredAgent  implements Serializable {
  
  private ConversationVideoEventTopicUriReference agent = null;
  private Integer score = null;

  
  /**
   **/
  public ConversationVideoEventTopicScoredAgent agent(ConversationVideoEventTopicUriReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public ConversationVideoEventTopicUriReference getAgent() {
    return agent;
  }
  public void setAgent(ConversationVideoEventTopicUriReference agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public ConversationVideoEventTopicScoredAgent score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationVideoEventTopicScoredAgent conversationVideoEventTopicScoredAgent = (ConversationVideoEventTopicScoredAgent) o;
    return Objects.equals(this.agent, conversationVideoEventTopicScoredAgent.agent) &&
        Objects.equals(this.score, conversationVideoEventTopicScoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationVideoEventTopicScoredAgent {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

