package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationSocialExpressionEventTopicScoredAgent
 */

public class ConversationSocialExpressionEventTopicScoredAgent  implements Serializable {
  
  private ConversationSocialExpressionEventTopicUriReference agent = null;
  private Integer score = null;

  
  /**
   **/
  public ConversationSocialExpressionEventTopicScoredAgent agent(ConversationSocialExpressionEventTopicUriReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public ConversationSocialExpressionEventTopicUriReference getAgent() {
    return agent;
  }
  public void setAgent(ConversationSocialExpressionEventTopicUriReference agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public ConversationSocialExpressionEventTopicScoredAgent score(Integer score) {
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
    ConversationSocialExpressionEventTopicScoredAgent conversationSocialExpressionEventTopicScoredAgent = (ConversationSocialExpressionEventTopicScoredAgent) o;
    return Objects.equals(this.agent, conversationSocialExpressionEventTopicScoredAgent.agent) &&
        Objects.equals(this.score, conversationSocialExpressionEventTopicScoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSocialExpressionEventTopicScoredAgent {\n");
    
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

