package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Represents an organization langauge assigned to a user. When assigning to a user specify the organization language id as the id.
 */
@ApiModel(description = "Represents an organization langauge assigned to a user. When assigning to a user specify the organization language id as the id.")

public class UserRoutingLanguage  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Double proficiency = null;

  /**
   * Activate or deactivate this routing langauge.
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String languageUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserRoutingLanguage name(String name) {
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
   * Proficiency is a rating from 0.0 to 5.0 on how competent an agent is for a particular language. It is used when a queue is set to \"Best available language\" mode to allow acd interactions to target agents with higher proficiency ratings.
   **/
  public UserRoutingLanguage proficiency(Double proficiency) {
    this.proficiency = proficiency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proficiency is a rating from 0.0 to 5.0 on how competent an agent is for a particular language. It is used when a queue is set to \"Best available language\" mode to allow acd interactions to target agents with higher proficiency ratings.")
  @JsonProperty("proficiency")
  public Double getProficiency() {
    return proficiency;
  }
  public void setProficiency(Double proficiency) {
    this.proficiency = proficiency;
  }

  
  /**
   * Activate or deactivate this routing langauge.
   **/
  public UserRoutingLanguage state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activate or deactivate this routing langauge.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  @ApiModelProperty(example = "null", value = "URI to the organization language used by this user langauge.")
  @JsonProperty("languageUri")
  public String getLanguageUri() {
    return languageUri;
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
    UserRoutingLanguage userRoutingLanguage = (UserRoutingLanguage) o;
    return Objects.equals(this.id, userRoutingLanguage.id) &&
        Objects.equals(this.name, userRoutingLanguage.name) &&
        Objects.equals(this.proficiency, userRoutingLanguage.proficiency) &&
        Objects.equals(this.state, userRoutingLanguage.state) &&
        Objects.equals(this.languageUri, userRoutingLanguage.languageUri) &&
        Objects.equals(this.selfUri, userRoutingLanguage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, proficiency, state, languageUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoutingLanguage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    languageUri: ").append(toIndentedString(languageUri)).append("\n");
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

