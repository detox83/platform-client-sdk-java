package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CampaignRuleActionEntities;
import com.mypurecloud.sdk.v2.model.CampaignRuleParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleAction
 */

public class CampaignRuleAction  implements Serializable {
  
  private String id = null;
  private CampaignRuleParameters parameters = null;

  /**
   * Gets or Sets actionType
   */
  public enum ActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TURNONCAMPAIGN("turnOnCampaign"),
    TURNOFFCAMPAIGN("turnOffCampaign"),
    TURNONSEQUENCE("turnOnSequence"),
    TURNOFFSEQUENCE("turnOffSequence"),
    SETCAMPAIGNPRIORITY("setCampaignPriority"),
    RECYCLECAMPAIGN("recycleCampaign"),
    SETCAMPAIGNDIALINGMODE("setCampaignDialingMode");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActionTypeEnum value : ActionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionTypeEnum actionType = null;
  private CampaignRuleActionEntities campaignRuleActionEntities = null;

  
  /**
   **/
  public CampaignRuleAction id(String id) {
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
  public CampaignRuleAction parameters(CampaignRuleParameters parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameters")
  public CampaignRuleParameters getParameters() {
    return parameters;
  }
  public void setParameters(CampaignRuleParameters parameters) {
    this.parameters = parameters;
  }


  /**
   **/
  public CampaignRuleAction actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }


  /**
   **/
  public CampaignRuleAction campaignRuleActionEntities(CampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleActionEntities")
  public CampaignRuleActionEntities getCampaignRuleActionEntities() {
    return campaignRuleActionEntities;
  }
  public void setCampaignRuleActionEntities(CampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleAction campaignRuleAction = (CampaignRuleAction) o;
    return Objects.equals(this.id, campaignRuleAction.id) &&
        Objects.equals(this.parameters, campaignRuleAction.parameters) &&
        Objects.equals(this.actionType, campaignRuleAction.actionType) &&
        Objects.equals(this.campaignRuleActionEntities, campaignRuleAction.campaignRuleActionEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, actionType, campaignRuleActionEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    campaignRuleActionEntities: ").append(toIndentedString(campaignRuleActionEntities)).append("\n");
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

