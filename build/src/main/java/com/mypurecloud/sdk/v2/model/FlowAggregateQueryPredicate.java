package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.NumericRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowAggregateQueryPredicate
 */

public class FlowAggregateQueryPredicate  implements Serializable {
  

  /**
   * Optional type, can usually be inferred
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIMENSION("dimension"),
    PROPERTY("property"),
    METRIC("metric");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  /**
   * Left hand side for dimension predicates
   */
  public enum DimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDRESSFROM("addressFrom"),
    ADDRESSTO("addressTo"),
    AGENTSCORE("agentScore"),
    ANI("ani"),
    CONVERSATIONID("conversationId"),
    CONVERTEDFROM("convertedFrom"),
    CONVERTEDTO("convertedTo"),
    DIRECTION("direction"),
    DISCONNECTTYPE("disconnectType"),
    DIVISIONID("divisionId"),
    DNIS("dnis"),
    EDGEID("edgeId"),
    ENDINGLANGUAGE("endingLanguage"),
    ENTRYREASON("entryReason"),
    ENTRYTYPE("entryType"),
    EXITREASON("exitReason"),
    EXTERNALORGANIZATIONID("externalOrganizationId"),
    FLAGGEDREASON("flaggedReason"),
    FLOWID("flowId"),
    FLOWNAME("flowName"),
    FLOWOUTTYPE("flowOutType"),
    FLOWOUTCOME("flowOutcome"),
    FLOWOUTCOMEID("flowOutcomeId"),
    FLOWOUTCOMEVALUE("flowOutcomeValue"),
    FLOWTYPE("flowType"),
    FLOWVERSION("flowVersion"),
    GROUPID("groupId"),
    INTERACTIONTYPE("interactionType"),
    JOURNEYACTIONID("journeyActionId"),
    JOURNEYACTIONMAPID("journeyActionMapId"),
    JOURNEYACTIONMAPVERSION("journeyActionMapVersion"),
    JOURNEYCUSTOMERID("journeyCustomerId"),
    JOURNEYCUSTOMERIDTYPE("journeyCustomerIdType"),
    JOURNEYCUSTOMERSESSIONID("journeyCustomerSessionId"),
    JOURNEYCUSTOMERSESSIONIDTYPE("journeyCustomerSessionIdType"),
    MEDIATYPE("mediaType"),
    MESSAGETYPE("messageType"),
    ORIGINATINGDIRECTION("originatingDirection"),
    OUTBOUNDCAMPAIGNID("outboundCampaignId"),
    OUTBOUNDCONTACTID("outboundContactId"),
    OUTBOUNDCONTACTLISTID("outboundContactListId"),
    PARTICIPANTNAME("participantName"),
    PEERID("peerId"),
    PROVIDER("provider"),
    PURPOSE("purpose"),
    QUEUEID("queueId"),
    REMOTE("remote"),
    REQUESTEDLANGUAGEID("requestedLanguageId"),
    REQUESTEDROUTINGSKILLID("requestedRoutingSkillId"),
    ROOMID("roomId"),
    ROUTINGPRIORITY("routingPriority"),
    SCOREDAGENTID("scoredAgentId"),
    SESSIONDNIS("sessionDnis"),
    SESSIONID("sessionId"),
    STARTINGLANGUAGE("startingLanguage"),
    STATIONID("stationId"),
    TRANSFERTARGETADDRESS("transferTargetAddress"),
    TRANSFERTARGETNAME("transferTargetName"),
    TRANSFERTYPE("transferType"),
    USERID("userId"),
    WRAPUPCODE("wrapUpCode");

    private String value;

    DimensionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DimensionEnum fromString(String key) {
      if (key == null) return null;

      for (DimensionEnum value : DimensionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DimensionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DimensionEnum dimension = null;

  /**
   * Optional operator, default is matches
   */
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MATCHES("matches"),
    EXISTS("exists"),
    NOTEXISTS("notExists");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;
  private NumericRange range = null;

  
  /**
   * Optional type, can usually be inferred
   **/
  public FlowAggregateQueryPredicate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional type, can usually be inferred")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Left hand side for dimension predicates
   **/
  public FlowAggregateQueryPredicate dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left hand side for dimension predicates")
  @JsonProperty("dimension")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  
  /**
   * Optional operator, default is matches
   **/
  public FlowAggregateQueryPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional operator, default is matches")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * Right hand side for dimension predicates
   **/
  public FlowAggregateQueryPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension predicates")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * Right hand side for dimension predicates
   **/
  public FlowAggregateQueryPredicate range(NumericRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension predicates")
  @JsonProperty("range")
  public NumericRange getRange() {
    return range;
  }
  public void setRange(NumericRange range) {
    this.range = range;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowAggregateQueryPredicate flowAggregateQueryPredicate = (FlowAggregateQueryPredicate) o;
    return Objects.equals(this.type, flowAggregateQueryPredicate.type) &&
        Objects.equals(this.dimension, flowAggregateQueryPredicate.dimension) &&
        Objects.equals(this.operator, flowAggregateQueryPredicate.operator) &&
        Objects.equals(this.value, flowAggregateQueryPredicate.value) &&
        Objects.equals(this.range, flowAggregateQueryPredicate.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, operator, value, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowAggregateQueryPredicate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

