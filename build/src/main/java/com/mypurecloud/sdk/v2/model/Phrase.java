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
 * Phrase
 */

public class Phrase  implements Serializable {
  
  private String text = null;

  /**
   * The phrase strictness
   */
  public enum StrictnessEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    _1("1"),
    _55("55"),
    _65("65"),
    _72("72"),
    _85("85"),
    _90("90");

    private String value;

    StrictnessEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StrictnessEnum fromString(String key) {
      if (key == null) return null;

      for (StrictnessEnum value : StrictnessEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StrictnessEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StrictnessEnum strictness = null;

  /**
   * The phrase sentiment
   */
  public enum SentimentEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNSPECIFIED("Unspecified"),
    POSITIVE("Positive"),
    NEUTRAL("Neutral"),
    NEGATIVE("Negative");

    private String value;

    SentimentEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SentimentEnum fromString(String key) {
      if (key == null) return null;

      for (SentimentEnum value : SentimentEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SentimentEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SentimentEnum sentiment = null;

  
  /**
   * The phrase text
   **/
  public Phrase text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phrase text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * The phrase strictness
   **/
  public Phrase strictness(StrictnessEnum strictness) {
    this.strictness = strictness;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phrase strictness")
  @JsonProperty("strictness")
  public StrictnessEnum getStrictness() {
    return strictness;
  }
  public void setStrictness(StrictnessEnum strictness) {
    this.strictness = strictness;
  }

  
  /**
   * The phrase sentiment
   **/
  public Phrase sentiment(SentimentEnum sentiment) {
    this.sentiment = sentiment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phrase sentiment")
  @JsonProperty("sentiment")
  public SentimentEnum getSentiment() {
    return sentiment;
  }
  public void setSentiment(SentimentEnum sentiment) {
    this.sentiment = sentiment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phrase phrase = (Phrase) o;
    return Objects.equals(this.text, phrase.text) &&
        Objects.equals(this.strictness, phrase.strictness) &&
        Objects.equals(this.sentiment, phrase.sentiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, strictness, sentiment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phrase {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    strictness: ").append(toIndentedString(strictness)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
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

