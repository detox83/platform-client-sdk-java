package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SendAgentlessOutboundMessageResponse
 */

public class SendAgentlessOutboundMessageResponse  implements Serializable {
  
  private String id = null;
  private String conversationId = null;
  private String fromAddress = null;
  private String toAddress = null;

  /**
   * Type of text messenger.
   */
  public enum MessengerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    LINE("line"),
    WHATSAPP("whatsapp");

    private String value;

    MessengerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessengerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessengerTypeEnum value : MessengerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessengerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessengerTypeEnum messengerType = null;
  private String textBody = null;
  private Date timestamp = null;
  private String selfUri = null;
  private AddressableEntityRef user = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The identifier of the conversation.
   **/
  public SendAgentlessOutboundMessageResponse conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the conversation.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * The sender of the text message.
   **/
  public SendAgentlessOutboundMessageResponse fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sender of the text message.")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   * The recipient of the text message.
   **/
  public SendAgentlessOutboundMessageResponse toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient of the text message.")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   * Type of text messenger.
   **/
  public SendAgentlessOutboundMessageResponse messengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of text messenger.")
  @JsonProperty("messengerType")
  public MessengerTypeEnum getMessengerType() {
    return messengerType;
  }
  public void setMessengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
  }

  
  /**
   * The body of the text message.
   **/
  public SendAgentlessOutboundMessageResponse textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The body of the text message.")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  
  /**
   * The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public SendAgentlessOutboundMessageResponse timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * Details of the user created the job
   **/
  public SendAgentlessOutboundMessageResponse user(AddressableEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the user created the job")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }
  public void setUser(AddressableEntityRef user) {
    this.user = user;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendAgentlessOutboundMessageResponse sendAgentlessOutboundMessageResponse = (SendAgentlessOutboundMessageResponse) o;
    return Objects.equals(this.id, sendAgentlessOutboundMessageResponse.id) &&
        Objects.equals(this.conversationId, sendAgentlessOutboundMessageResponse.conversationId) &&
        Objects.equals(this.fromAddress, sendAgentlessOutboundMessageResponse.fromAddress) &&
        Objects.equals(this.toAddress, sendAgentlessOutboundMessageResponse.toAddress) &&
        Objects.equals(this.messengerType, sendAgentlessOutboundMessageResponse.messengerType) &&
        Objects.equals(this.textBody, sendAgentlessOutboundMessageResponse.textBody) &&
        Objects.equals(this.timestamp, sendAgentlessOutboundMessageResponse.timestamp) &&
        Objects.equals(this.selfUri, sendAgentlessOutboundMessageResponse.selfUri) &&
        Objects.equals(this.user, sendAgentlessOutboundMessageResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, fromAddress, toAddress, messengerType, textBody, timestamp, selfUri, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendAgentlessOutboundMessageResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    messengerType: ").append(toIndentedString(messengerType)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

