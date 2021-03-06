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
 * TranscriptionSettings
 */

public class TranscriptionSettings  implements Serializable {
  

  /**
   * Setting to enable/disable transcription capability
   */
  public enum TranscriptionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DISABLED("Disabled"),
    ENABLEDGLOBALLY("EnabledGlobally"),
    ENABLEDQUEUEFLOW("EnabledQueueFlow");

    private String value;

    TranscriptionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TranscriptionEnum fromString(String key) {
      if (key == null) return null;

      for (TranscriptionEnum value : TranscriptionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TranscriptionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TranscriptionEnum transcription = null;
  private Integer transcriptionConfidenceThreshold = null;

  
  /**
   * Setting to enable/disable transcription capability
   **/
  public TranscriptionSettings transcription(TranscriptionEnum transcription) {
    this.transcription = transcription;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Setting to enable/disable transcription capability")
  @JsonProperty("transcription")
  public TranscriptionEnum getTranscription() {
    return transcription;
  }
  public void setTranscription(TranscriptionEnum transcription) {
    this.transcription = transcription;
  }

  
  /**
   * Configure confidence threshold. The possible values are from 1 to 100.
   **/
  public TranscriptionSettings transcriptionConfidenceThreshold(Integer transcriptionConfidenceThreshold) {
    this.transcriptionConfidenceThreshold = transcriptionConfidenceThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configure confidence threshold. The possible values are from 1 to 100.")
  @JsonProperty("transcriptionConfidenceThreshold")
  public Integer getTranscriptionConfidenceThreshold() {
    return transcriptionConfidenceThreshold;
  }
  public void setTranscriptionConfidenceThreshold(Integer transcriptionConfidenceThreshold) {
    this.transcriptionConfidenceThreshold = transcriptionConfidenceThreshold;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionSettings transcriptionSettings = (TranscriptionSettings) o;
    return Objects.equals(this.transcription, transcriptionSettings.transcription) &&
        Objects.equals(this.transcriptionConfidenceThreshold, transcriptionSettings.transcriptionConfidenceThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcription, transcriptionConfidenceThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionSettings {\n");
    
    sb.append("    transcription: ").append(toIndentedString(transcription)).append("\n");
    sb.append("    transcriptionConfidenceThreshold: ").append(toIndentedString(transcriptionConfidenceThreshold)).append("\n");
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

