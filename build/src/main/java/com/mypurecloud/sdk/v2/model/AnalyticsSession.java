package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsSession
 */

public class AnalyticsSession  implements Serializable {
  

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("voice"),
    CHAT("chat"),
    EMAIL("email"),
    CALLBACK("callback"),
    COBROWSE("cobrowse"),
    VIDEO("video"),
    SCREENSHARE("screenshare");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String sessionId = null;
  private String addressOther = null;
  private String addressSelf = null;
  private String ani = null;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;
  private String dnis = null;
  private String outboundCampaignId = null;
  private String outboundContactId = null;
  private String outboundContactListId = null;
  private String dispositionAnalyzer = null;
  private String dispositionName = null;
  private String edgeId = null;
  private String remoteNameDisplayable = null;
  private String roomId = null;
  private String monitoredSessionId = null;
  private String monitoredParticipantId = null;
  private String callbackUserName = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private Date callbackScheduledTime = null;
  private String scriptId = null;
  private Boolean skipEnabled = null;
  private Integer timeoutSeconds = null;
  private String cobrowseRole = null;
  private String cobrowseRoomId = null;
  private String mediaBridgeId = null;
  private String screenShareAddressSelf = null;
  private Boolean sharingScreen = null;
  private String screenShareRoomId = null;
  private String videoRoomId = null;
  private String videoAddressSelf = null;
  private List<AnalyticsConversationSegment> segments = new ArrayList<AnalyticsConversationSegment>();

  
  /**
   **/
  public AnalyticsSession mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public AnalyticsSession sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   **/
  public AnalyticsSession addressOther(String addressOther) {
    this.addressOther = addressOther;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressOther")
  public String getAddressOther() {
    return addressOther;
  }
  public void setAddressOther(String addressOther) {
    this.addressOther = addressOther;
  }


  /**
   **/
  public AnalyticsSession addressSelf(String addressSelf) {
    this.addressSelf = addressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressSelf")
  public String getAddressSelf() {
    return addressSelf;
  }
  public void setAddressSelf(String addressSelf) {
    this.addressSelf = addressSelf;
  }


  /**
   **/
  public AnalyticsSession ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }


  /**
   **/
  public AnalyticsSession direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   **/
  public AnalyticsSession dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }


  /**
   **/
  public AnalyticsSession outboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundCampaignId")
  public String getOutboundCampaignId() {
    return outboundCampaignId;
  }
  public void setOutboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
  }


  /**
   **/
  public AnalyticsSession outboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundContactId")
  public String getOutboundContactId() {
    return outboundContactId;
  }
  public void setOutboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
  }


  /**
   **/
  public AnalyticsSession outboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundContactListId")
  public String getOutboundContactListId() {
    return outboundContactListId;
  }
  public void setOutboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
  }


  /**
   **/
  public AnalyticsSession dispositionAnalyzer(String dispositionAnalyzer) {
    this.dispositionAnalyzer = dispositionAnalyzer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dispositionAnalyzer")
  public String getDispositionAnalyzer() {
    return dispositionAnalyzer;
  }
  public void setDispositionAnalyzer(String dispositionAnalyzer) {
    this.dispositionAnalyzer = dispositionAnalyzer;
  }


  /**
   **/
  public AnalyticsSession dispositionName(String dispositionName) {
    this.dispositionName = dispositionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dispositionName")
  public String getDispositionName() {
    return dispositionName;
  }
  public void setDispositionName(String dispositionName) {
    this.dispositionName = dispositionName;
  }


  /**
   **/
  public AnalyticsSession edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeId")
  public String getEdgeId() {
    return edgeId;
  }
  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }


  /**
   **/
  public AnalyticsSession remoteNameDisplayable(String remoteNameDisplayable) {
    this.remoteNameDisplayable = remoteNameDisplayable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remoteNameDisplayable")
  public String getRemoteNameDisplayable() {
    return remoteNameDisplayable;
  }
  public void setRemoteNameDisplayable(String remoteNameDisplayable) {
    this.remoteNameDisplayable = remoteNameDisplayable;
  }


  /**
   **/
  public AnalyticsSession roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  /**
   **/
  public AnalyticsSession monitoredSessionId(String monitoredSessionId) {
    this.monitoredSessionId = monitoredSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("monitoredSessionId")
  public String getMonitoredSessionId() {
    return monitoredSessionId;
  }
  public void setMonitoredSessionId(String monitoredSessionId) {
    this.monitoredSessionId = monitoredSessionId;
  }


  /**
   **/
  public AnalyticsSession monitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("monitoredParticipantId")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }


  /**
   **/
  public AnalyticsSession callbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackUserName")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }


  /**
   **/
  public AnalyticsSession callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsSession callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }


  /**
   **/
  public AnalyticsSession scriptId(String scriptId) {
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
  public AnalyticsSession skipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skipEnabled")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }


  /**
   **/
  public AnalyticsSession timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  /**
   **/
  public AnalyticsSession cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }


  /**
   **/
  public AnalyticsSession cobrowseRoomId(String cobrowseRoomId) {
    this.cobrowseRoomId = cobrowseRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseRoomId")
  public String getCobrowseRoomId() {
    return cobrowseRoomId;
  }
  public void setCobrowseRoomId(String cobrowseRoomId) {
    this.cobrowseRoomId = cobrowseRoomId;
  }


  /**
   **/
  public AnalyticsSession mediaBridgeId(String mediaBridgeId) {
    this.mediaBridgeId = mediaBridgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaBridgeId")
  public String getMediaBridgeId() {
    return mediaBridgeId;
  }
  public void setMediaBridgeId(String mediaBridgeId) {
    this.mediaBridgeId = mediaBridgeId;
  }


  /**
   **/
  public AnalyticsSession screenShareAddressSelf(String screenShareAddressSelf) {
    this.screenShareAddressSelf = screenShareAddressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenShareAddressSelf")
  public String getScreenShareAddressSelf() {
    return screenShareAddressSelf;
  }
  public void setScreenShareAddressSelf(String screenShareAddressSelf) {
    this.screenShareAddressSelf = screenShareAddressSelf;
  }


  /**
   **/
  public AnalyticsSession sharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharingScreen")
  public Boolean getSharingScreen() {
    return sharingScreen;
  }
  public void setSharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
  }


  /**
   **/
  public AnalyticsSession screenShareRoomId(String screenShareRoomId) {
    this.screenShareRoomId = screenShareRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenShareRoomId")
  public String getScreenShareRoomId() {
    return screenShareRoomId;
  }
  public void setScreenShareRoomId(String screenShareRoomId) {
    this.screenShareRoomId = screenShareRoomId;
  }


  /**
   **/
  public AnalyticsSession videoRoomId(String videoRoomId) {
    this.videoRoomId = videoRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videoRoomId")
  public String getVideoRoomId() {
    return videoRoomId;
  }
  public void setVideoRoomId(String videoRoomId) {
    this.videoRoomId = videoRoomId;
  }


  /**
   **/
  public AnalyticsSession videoAddressSelf(String videoAddressSelf) {
    this.videoAddressSelf = videoAddressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videoAddressSelf")
  public String getVideoAddressSelf() {
    return videoAddressSelf;
  }
  public void setVideoAddressSelf(String videoAddressSelf) {
    this.videoAddressSelf = videoAddressSelf;
  }


  /**
   **/
  public AnalyticsSession segments(List<AnalyticsConversationSegment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segments")
  public List<AnalyticsConversationSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<AnalyticsConversationSegment> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSession analyticsSession = (AnalyticsSession) o;
    return Objects.equals(this.mediaType, analyticsSession.mediaType) &&
        Objects.equals(this.sessionId, analyticsSession.sessionId) &&
        Objects.equals(this.addressOther, analyticsSession.addressOther) &&
        Objects.equals(this.addressSelf, analyticsSession.addressSelf) &&
        Objects.equals(this.ani, analyticsSession.ani) &&
        Objects.equals(this.direction, analyticsSession.direction) &&
        Objects.equals(this.dnis, analyticsSession.dnis) &&
        Objects.equals(this.outboundCampaignId, analyticsSession.outboundCampaignId) &&
        Objects.equals(this.outboundContactId, analyticsSession.outboundContactId) &&
        Objects.equals(this.outboundContactListId, analyticsSession.outboundContactListId) &&
        Objects.equals(this.dispositionAnalyzer, analyticsSession.dispositionAnalyzer) &&
        Objects.equals(this.dispositionName, analyticsSession.dispositionName) &&
        Objects.equals(this.edgeId, analyticsSession.edgeId) &&
        Objects.equals(this.remoteNameDisplayable, analyticsSession.remoteNameDisplayable) &&
        Objects.equals(this.roomId, analyticsSession.roomId) &&
        Objects.equals(this.monitoredSessionId, analyticsSession.monitoredSessionId) &&
        Objects.equals(this.monitoredParticipantId, analyticsSession.monitoredParticipantId) &&
        Objects.equals(this.callbackUserName, analyticsSession.callbackUserName) &&
        Objects.equals(this.callbackNumbers, analyticsSession.callbackNumbers) &&
        Objects.equals(this.callbackScheduledTime, analyticsSession.callbackScheduledTime) &&
        Objects.equals(this.scriptId, analyticsSession.scriptId) &&
        Objects.equals(this.skipEnabled, analyticsSession.skipEnabled) &&
        Objects.equals(this.timeoutSeconds, analyticsSession.timeoutSeconds) &&
        Objects.equals(this.cobrowseRole, analyticsSession.cobrowseRole) &&
        Objects.equals(this.cobrowseRoomId, analyticsSession.cobrowseRoomId) &&
        Objects.equals(this.mediaBridgeId, analyticsSession.mediaBridgeId) &&
        Objects.equals(this.screenShareAddressSelf, analyticsSession.screenShareAddressSelf) &&
        Objects.equals(this.sharingScreen, analyticsSession.sharingScreen) &&
        Objects.equals(this.screenShareRoomId, analyticsSession.screenShareRoomId) &&
        Objects.equals(this.videoRoomId, analyticsSession.videoRoomId) &&
        Objects.equals(this.videoAddressSelf, analyticsSession.videoAddressSelf) &&
        Objects.equals(this.segments, analyticsSession.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, sessionId, addressOther, addressSelf, ani, direction, dnis, outboundCampaignId, outboundContactId, outboundContactListId, dispositionAnalyzer, dispositionName, edgeId, remoteNameDisplayable, roomId, monitoredSessionId, monitoredParticipantId, callbackUserName, callbackNumbers, callbackScheduledTime, scriptId, skipEnabled, timeoutSeconds, cobrowseRole, cobrowseRoomId, mediaBridgeId, screenShareAddressSelf, sharingScreen, screenShareRoomId, videoRoomId, videoAddressSelf, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSession {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    addressOther: ").append(toIndentedString(addressOther)).append("\n");
    sb.append("    addressSelf: ").append(toIndentedString(addressSelf)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    outboundCampaignId: ").append(toIndentedString(outboundCampaignId)).append("\n");
    sb.append("    outboundContactId: ").append(toIndentedString(outboundContactId)).append("\n");
    sb.append("    outboundContactListId: ").append(toIndentedString(outboundContactListId)).append("\n");
    sb.append("    dispositionAnalyzer: ").append(toIndentedString(dispositionAnalyzer)).append("\n");
    sb.append("    dispositionName: ").append(toIndentedString(dispositionName)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    remoteNameDisplayable: ").append(toIndentedString(remoteNameDisplayable)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    monitoredSessionId: ").append(toIndentedString(monitoredSessionId)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    cobrowseRole: ").append(toIndentedString(cobrowseRole)).append("\n");
    sb.append("    cobrowseRoomId: ").append(toIndentedString(cobrowseRoomId)).append("\n");
    sb.append("    mediaBridgeId: ").append(toIndentedString(mediaBridgeId)).append("\n");
    sb.append("    screenShareAddressSelf: ").append(toIndentedString(screenShareAddressSelf)).append("\n");
    sb.append("    sharingScreen: ").append(toIndentedString(sharingScreen)).append("\n");
    sb.append("    screenShareRoomId: ").append(toIndentedString(screenShareRoomId)).append("\n");
    sb.append("    videoRoomId: ").append(toIndentedString(videoRoomId)).append("\n");
    sb.append("    videoAddressSelf: ").append(toIndentedString(videoAddressSelf)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
