package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Site;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OutboundRoute
 */

public class OutboundRoute  implements Serializable {
  
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
  private List<String> classificationTypes = new ArrayList<String>();
  private Boolean enabled = null;

  /**
   * Gets or Sets distribution
   */
  public enum DistributionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SEQUENTIAL("SEQUENTIAL"),
    RANDOM("RANDOM");

    private String value;

    DistributionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DistributionEnum fromString(String key) {
      if (key == null) return null;

      for (DistributionEnum value : DistributionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DistributionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DistributionEnum distribution = null;
  private List<UriReference> externalTrunkBases = new ArrayList<UriReference>();
  private Site site = null;
  private Boolean managed = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the entity.
   **/
  public OutboundRoute name(String name) {
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
  public OutboundRoute description(String description) {
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
  public OutboundRoute version(Integer version) {
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
  public OutboundRoute dateCreated(Date dateCreated) {
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
  public OutboundRoute dateModified(Date dateModified) {
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
  public OutboundRoute modifiedBy(String modifiedBy) {
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
  public OutboundRoute createdBy(String createdBy) {
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
  public OutboundRoute state(StateEnum state) {
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
  public OutboundRoute modifiedByApp(String modifiedByApp) {
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
  public OutboundRoute createdByApp(String createdByApp) {
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
   * The site associated to the outbound route.
   **/
  public OutboundRoute classificationTypes(List<String> classificationTypes) {
    this.classificationTypes = classificationTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The site associated to the outbound route.")
  @JsonProperty("classificationTypes")
  public List<String> getClassificationTypes() {
    return classificationTypes;
  }
  public void setClassificationTypes(List<String> classificationTypes) {
    this.classificationTypes = classificationTypes;
  }


  /**
   **/
  public OutboundRoute enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public OutboundRoute distribution(DistributionEnum distribution) {
    this.distribution = distribution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distribution")
  public DistributionEnum getDistribution() {
    return distribution;
  }
  public void setDistribution(DistributionEnum distribution) {
    this.distribution = distribution;
  }


  /**
   * Trunk base settings of trunkType \"EXTERNAL\".  This base must also be set on an edge logical interface for correct routing.
   **/
  public OutboundRoute externalTrunkBases(List<UriReference> externalTrunkBases) {
    this.externalTrunkBases = externalTrunkBases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trunk base settings of trunkType \"EXTERNAL\".  This base must also be set on an edge logical interface for correct routing.")
  @JsonProperty("externalTrunkBases")
  public List<UriReference> getExternalTrunkBases() {
    return externalTrunkBases;
  }
  public void setExternalTrunkBases(List<UriReference> externalTrunkBases) {
    this.externalTrunkBases = externalTrunkBases;
  }


  /**
   * The site associated to the outbound route.
   **/
  public OutboundRoute site(Site site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The site associated to the outbound route.")
  @JsonProperty("site")
  public Site getSite() {
    return site;
  }
  public void setSite(Site site) {
    this.site = site;
  }


  @ApiModelProperty(example = "null", value = "Is this outbound route being managed remotely.")
  @JsonProperty("managed")
  public Boolean getManaged() {
    return managed;
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
    OutboundRoute outboundRoute = (OutboundRoute) o;
    return Objects.equals(this.id, outboundRoute.id) &&
        Objects.equals(this.name, outboundRoute.name) &&
        Objects.equals(this.description, outboundRoute.description) &&
        Objects.equals(this.version, outboundRoute.version) &&
        Objects.equals(this.dateCreated, outboundRoute.dateCreated) &&
        Objects.equals(this.dateModified, outboundRoute.dateModified) &&
        Objects.equals(this.modifiedBy, outboundRoute.modifiedBy) &&
        Objects.equals(this.createdBy, outboundRoute.createdBy) &&
        Objects.equals(this.state, outboundRoute.state) &&
        Objects.equals(this.modifiedByApp, outboundRoute.modifiedByApp) &&
        Objects.equals(this.createdByApp, outboundRoute.createdByApp) &&
        Objects.equals(this.classificationTypes, outboundRoute.classificationTypes) &&
        Objects.equals(this.enabled, outboundRoute.enabled) &&
        Objects.equals(this.distribution, outboundRoute.distribution) &&
        Objects.equals(this.externalTrunkBases, outboundRoute.externalTrunkBases) &&
        Objects.equals(this.site, outboundRoute.site) &&
        Objects.equals(this.managed, outboundRoute.managed) &&
        Objects.equals(this.selfUri, outboundRoute.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, classificationTypes, enabled, distribution, externalTrunkBases, site, managed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundRoute {\n");
    
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
    sb.append("    classificationTypes: ").append(toIndentedString(classificationTypes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    externalTrunkBases: ").append(toIndentedString(externalTrunkBases)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
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

