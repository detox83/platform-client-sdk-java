package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.TrunkBase;
import com.mypurecloud.sdk.v2.model.TrunkBaseAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EdgeGroup
 */

public class EdgeGroup  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String modifiedBy = null;
  private String createdBy = null;

  /**
   * Gets or Sets state
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
  private String modifiedByApp = null;
  private String createdByApp = null;
  private Boolean managed = null;
  private TrunkBaseAssignment edgeTrunkBaseAssignment = null;
  private List<TrunkBase> phoneTrunkBases = new ArrayList<TrunkBase>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the entity.
   **/
  public EdgeGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the entity.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public EdgeGroup description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public EdgeGroup version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EdgeGroup dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EdgeGroup dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public EdgeGroup modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public EdgeGroup createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  /**
   **/
  public EdgeGroup state(StateEnum state) {
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
  public EdgeGroup modifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedByApp")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }


  /**
   **/
  public EdgeGroup createdByApp(String createdByApp) {
    this.createdByApp = createdByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdByApp")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
  }


  /**
   * Is this edge group being managed remotely.
   **/
  public EdgeGroup managed(Boolean managed) {
    this.managed = managed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this edge group being managed remotely.")
  @JsonProperty("managed")
  public Boolean getManaged() {
    return managed;
  }
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  /**
   * A trunk base settings assignment of trunkType \"EDGE\" to use for edge-to-edge communication.
   **/
  public EdgeGroup edgeTrunkBaseAssignment(TrunkBaseAssignment edgeTrunkBaseAssignment) {
    this.edgeTrunkBaseAssignment = edgeTrunkBaseAssignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A trunk base settings assignment of trunkType \"EDGE\" to use for edge-to-edge communication.")
  @JsonProperty("edgeTrunkBaseAssignment")
  public TrunkBaseAssignment getEdgeTrunkBaseAssignment() {
    return edgeTrunkBaseAssignment;
  }
  public void setEdgeTrunkBaseAssignment(TrunkBaseAssignment edgeTrunkBaseAssignment) {
    this.edgeTrunkBaseAssignment = edgeTrunkBaseAssignment;
  }


  /**
   * Trunk base settings of trunkType \"PHONE\" to inherit to edge logical interface for phone communication.
   **/
  public EdgeGroup phoneTrunkBases(List<TrunkBase> phoneTrunkBases) {
    this.phoneTrunkBases = phoneTrunkBases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Trunk base settings of trunkType \"PHONE\" to inherit to edge logical interface for phone communication.")
  @JsonProperty("phoneTrunkBases")
  public List<TrunkBase> getPhoneTrunkBases() {
    return phoneTrunkBases;
  }
  public void setPhoneTrunkBases(List<TrunkBase> phoneTrunkBases) {
    this.phoneTrunkBases = phoneTrunkBases;
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
    EdgeGroup edgeGroup = (EdgeGroup) o;
    return Objects.equals(this.id, edgeGroup.id) &&
        Objects.equals(this.name, edgeGroup.name) &&
        Objects.equals(this.description, edgeGroup.description) &&
        Objects.equals(this.version, edgeGroup.version) &&
        Objects.equals(this.dateCreated, edgeGroup.dateCreated) &&
        Objects.equals(this.dateModified, edgeGroup.dateModified) &&
        Objects.equals(this.modifiedBy, edgeGroup.modifiedBy) &&
        Objects.equals(this.createdBy, edgeGroup.createdBy) &&
        Objects.equals(this.state, edgeGroup.state) &&
        Objects.equals(this.modifiedByApp, edgeGroup.modifiedByApp) &&
        Objects.equals(this.createdByApp, edgeGroup.createdByApp) &&
        Objects.equals(this.managed, edgeGroup.managed) &&
        Objects.equals(this.edgeTrunkBaseAssignment, edgeGroup.edgeTrunkBaseAssignment) &&
        Objects.equals(this.phoneTrunkBases, edgeGroup.phoneTrunkBases) &&
        Objects.equals(this.selfUri, edgeGroup.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, managed, edgeTrunkBaseAssignment, phoneTrunkBases, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    edgeTrunkBaseAssignment: ").append(toIndentedString(edgeTrunkBaseAssignment)).append("\n");
    sb.append("    phoneTrunkBases: ").append(toIndentedString(phoneTrunkBases)).append("\n");
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
