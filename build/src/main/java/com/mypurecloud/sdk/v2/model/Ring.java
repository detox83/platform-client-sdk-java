package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Actions;
import com.mypurecloud.sdk.v2.model.ExpansionCriterium;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Ring
 */

public class Ring  implements Serializable {
  
  private List<ExpansionCriterium> expansionCriteria = new ArrayList<ExpansionCriterium>();
  private Actions actions = null;

  
  /**
   **/
  public Ring expansionCriteria(List<ExpansionCriterium> expansionCriteria) {
    this.expansionCriteria = expansionCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expansionCriteria")
  public List<ExpansionCriterium> getExpansionCriteria() {
    return expansionCriteria;
  }
  public void setExpansionCriteria(List<ExpansionCriterium> expansionCriteria) {
    this.expansionCriteria = expansionCriteria;
  }


  /**
   **/
  public Ring actions(Actions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actions")
  public Actions getActions() {
    return actions;
  }
  public void setActions(Actions actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ring ring = (Ring) o;
    return Objects.equals(this.expansionCriteria, ring.expansionCriteria) &&
        Objects.equals(this.actions, ring.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expansionCriteria, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ring {\n");
    
    sb.append("    expansionCriteria: ").append(toIndentedString(expansionCriteria)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

