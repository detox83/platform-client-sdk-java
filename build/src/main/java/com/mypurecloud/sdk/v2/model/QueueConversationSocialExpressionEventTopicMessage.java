package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicAddress;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicMessageDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicMessage
 */

public class QueueConversationSocialExpressionEventTopicMessage  implements Serializable {
  
  private String id = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("ALERTING"),
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED");

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
  private Boolean held = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;

  /**
   * Gets or Sets disconnectType
   */
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("ENDPOINT"),
    CLIENT("CLIENT"),
    SYSTEM("SYSTEM"),
    TIMEOUT("TIMEOUT"),
    TRANSFER("TRANSFER"),
    TRANSFER_CONFERENCE("TRANSFER_CONFERENCE"),
    TRANSFER_CONSULT("TRANSFER_CONSULT"),
    TRANSFER_FORWARD("TRANSFER_FORWARD"),
    TRANSFER_NOANSWER("TRANSFER_NOANSWER"),
    TRANSFER_NOTAVAILABLE("TRANSFER_NOTAVAILABLE"),
    TRANSPORT_FAILURE("TRANSPORT_FAILURE"),
    ERROR("ERROR"),
    PEER("PEER"),
    OTHER("OTHER"),
    SPAM("SPAM"),
    UNCALLABLE("UNCALLABLE");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DisconnectTypeEnum value : DisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisconnectTypeEnum disconnectType = null;
  private Date startHoldTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private QueueConversationSocialExpressionEventTopicAddress toAddress = null;
  private QueueConversationSocialExpressionEventTopicAddress fromAddress = null;
  private List<QueueConversationSocialExpressionEventTopicMessageDetails> messages = new ArrayList<QueueConversationSocialExpressionEventTopicMessageDetails>();
  private String messagesTranscriptUri = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("SMS"),
    TWITTER("TWITTER"),
    FACEBOOK("FACEBOOK"),
    LINE("LINE"),
    VIBER("VIBER"),
    WECHAT("WECHAT"),
    WHATSAPP("WHATSAPP"),
    TELEGRAM("TELEGRAM"),
    KAKAO("KAKAO");

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
  private String recipientCountry = null;
  private String recipientType = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage id(String id) {
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
  public QueueConversationSocialExpressionEventTopicMessage state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage disconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disconnectedTime")
  public Date getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage toAddress(QueueConversationSocialExpressionEventTopicAddress toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("toAddress")
  public QueueConversationSocialExpressionEventTopicAddress getToAddress() {
    return toAddress;
  }
  public void setToAddress(QueueConversationSocialExpressionEventTopicAddress toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage fromAddress(QueueConversationSocialExpressionEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromAddress")
  public QueueConversationSocialExpressionEventTopicAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(QueueConversationSocialExpressionEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage messages(List<QueueConversationSocialExpressionEventTopicMessageDetails> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<QueueConversationSocialExpressionEventTopicMessageDetails> getMessages() {
    return messages;
  }
  public void setMessages(List<QueueConversationSocialExpressionEventTopicMessageDetails> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage messagesTranscriptUri(String messagesTranscriptUri) {
    this.messagesTranscriptUri = messagesTranscriptUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messagesTranscriptUri")
  public String getMessagesTranscriptUri() {
    return messagesTranscriptUri;
  }
  public void setMessagesTranscriptUri(String messagesTranscriptUri) {
    this.messagesTranscriptUri = messagesTranscriptUri;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage recipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientCountry")
  public String getRecipientCountry() {
    return recipientCountry;
  }
  public void setRecipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientType")
  public String getRecipientType() {
    return recipientType;
  }
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessage additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicMessage queueConversationSocialExpressionEventTopicMessage = (QueueConversationSocialExpressionEventTopicMessage) o;
    return Objects.equals(this.id, queueConversationSocialExpressionEventTopicMessage.id) &&
        Objects.equals(this.state, queueConversationSocialExpressionEventTopicMessage.state) &&
        Objects.equals(this.held, queueConversationSocialExpressionEventTopicMessage.held) &&
        Objects.equals(this.provider, queueConversationSocialExpressionEventTopicMessage.provider) &&
        Objects.equals(this.scriptId, queueConversationSocialExpressionEventTopicMessage.scriptId) &&
        Objects.equals(this.peerId, queueConversationSocialExpressionEventTopicMessage.peerId) &&
        Objects.equals(this.disconnectType, queueConversationSocialExpressionEventTopicMessage.disconnectType) &&
        Objects.equals(this.startHoldTime, queueConversationSocialExpressionEventTopicMessage.startHoldTime) &&
        Objects.equals(this.connectedTime, queueConversationSocialExpressionEventTopicMessage.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationSocialExpressionEventTopicMessage.disconnectedTime) &&
        Objects.equals(this.toAddress, queueConversationSocialExpressionEventTopicMessage.toAddress) &&
        Objects.equals(this.fromAddress, queueConversationSocialExpressionEventTopicMessage.fromAddress) &&
        Objects.equals(this.messages, queueConversationSocialExpressionEventTopicMessage.messages) &&
        Objects.equals(this.messagesTranscriptUri, queueConversationSocialExpressionEventTopicMessage.messagesTranscriptUri) &&
        Objects.equals(this.type, queueConversationSocialExpressionEventTopicMessage.type) &&
        Objects.equals(this.recipientCountry, queueConversationSocialExpressionEventTopicMessage.recipientCountry) &&
        Objects.equals(this.recipientType, queueConversationSocialExpressionEventTopicMessage.recipientType) &&
        Objects.equals(this.additionalProperties, queueConversationSocialExpressionEventTopicMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, held, provider, scriptId, peerId, disconnectType, startHoldTime, connectedTime, disconnectedTime, toAddress, fromAddress, messages, messagesTranscriptUri, type, recipientCountry, recipientType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    messagesTranscriptUri: ").append(toIndentedString(messagesTranscriptUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

