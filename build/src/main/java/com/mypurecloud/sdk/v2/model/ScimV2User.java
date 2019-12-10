package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Photo;
import com.mypurecloud.sdk.v2.model.ScimEmail;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import com.mypurecloud.sdk.v2.model.ScimPhoneNumber;
import com.mypurecloud.sdk.v2.model.ScimV2EnterpriseUser;
import com.mypurecloud.sdk.v2.model.ScimV2GroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines a SCIM user.
 */
@ApiModel(description = "Defines a SCIM user.")

public class ScimV2User  implements Serializable {
  
  private String id = null;
  private List<String> schemas = new ArrayList<String>();
  private Boolean active = null;
  private String userName = null;
  private String displayName = null;
  private String password = null;
  private String title = null;
  private List<ScimPhoneNumber> phoneNumbers = new ArrayList<ScimPhoneNumber>();
  private List<ScimEmail> emails = new ArrayList<ScimEmail>();
  private List<Photo> photos = new ArrayList<Photo>();
  private String externalId = null;
  private List<ScimV2GroupReference> groups = new ArrayList<ScimV2GroupReference>();
  private List<String> roles = new ArrayList<String>();
  private ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User = null;
  private ScimMetadata meta = null;

  
  @ApiModelProperty(example = "null", value = "The ID of the SCIM resource. Set by the service provider. \"caseExact\" is set to \"true\". \"Mutability\" is set to \"readOnly\". \"Returned\" is set to \"always\".")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The list of supported schemas.
   **/
  public ScimV2User schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported schemas.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  /**
   * Indicates whether the user's administrative status is active.
   **/
  public ScimV2User active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the user's administrative status is active.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * The user's PureCloud email address. Must be unique.
   **/
  public ScimV2User userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's PureCloud email address. Must be unique.")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * The display name of the user.
   **/
  public ScimV2User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display name of the user.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * The new password for the PureCloud user. Does not return an existing password.
   **/
  public ScimV2User password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new password for the PureCloud user. Does not return an existing password.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The user's title.
   **/
  public ScimV2User title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The list of the user's phone numbers.
   **/
  public ScimV2User phoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of the user's phone numbers.")
  @JsonProperty("phoneNumbers")
  public List<ScimPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   * The list of the user's email addresses.
   **/
  public ScimV2User emails(List<ScimEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of the user's email addresses.")
  @JsonProperty("emails")
  public List<ScimEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<ScimEmail> emails) {
    this.emails = emails;
  }

  
  /**
   * The list of the user's photos.
   **/
  public ScimV2User photos(List<Photo> photos) {
    this.photos = photos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of the user's photos.")
  @JsonProperty("photos")
  public List<Photo> getPhotos() {
    return photos;
  }
  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  
  /**
   * The external ID of the user. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\".
   **/
  public ScimV2User externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external ID of the user. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\".")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   * The list of groups that the user is a member of.
   **/
  public ScimV2User groups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of groups that the user is a member of.")
  @JsonProperty("groups")
  public List<ScimV2GroupReference> getGroups() {
    return groups;
  }
  public void setGroups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
  }

  
  /**
   * The list of roles assigned to the user.
   **/
  public ScimV2User roles(List<String> roles) {
    this.roles = roles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of roles assigned to the user.")
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  
  /**
   * The URI of the schema for the enterprise user.
   **/
  public ScimV2User urnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the schema for the enterprise user.")
  @JsonProperty("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
  public ScimV2EnterpriseUser getUrnietfparamsscimschemasextensionenterprise20User() {
    return urnietfparamsscimschemasextensionenterprise20User;
  }
  public void setUrnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
  }

  
  /**
   * The metadata of the SCIM resource.
   **/
  public ScimV2User meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metadata of the SCIM resource.")
  @JsonProperty("meta")
  public ScimMetadata getMeta() {
    return meta;
  }
  public void setMeta(ScimMetadata meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2User scimV2User = (ScimV2User) o;
    return Objects.equals(this.id, scimV2User.id) &&
        Objects.equals(this.schemas, scimV2User.schemas) &&
        Objects.equals(this.active, scimV2User.active) &&
        Objects.equals(this.userName, scimV2User.userName) &&
        Objects.equals(this.displayName, scimV2User.displayName) &&
        Objects.equals(this.password, scimV2User.password) &&
        Objects.equals(this.title, scimV2User.title) &&
        Objects.equals(this.phoneNumbers, scimV2User.phoneNumbers) &&
        Objects.equals(this.emails, scimV2User.emails) &&
        Objects.equals(this.photos, scimV2User.photos) &&
        Objects.equals(this.externalId, scimV2User.externalId) &&
        Objects.equals(this.groups, scimV2User.groups) &&
        Objects.equals(this.roles, scimV2User.roles) &&
        Objects.equals(this.urnietfparamsscimschemasextensionenterprise20User, scimV2User.urnietfparamsscimschemasextensionenterprise20User) &&
        Objects.equals(this.meta, scimV2User.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemas, active, userName, displayName, password, title, phoneNumbers, emails, photos, externalId, groups, roles, urnietfparamsscimschemasextensionenterprise20User, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    urnietfparamsscimschemasextensionenterprise20User: ").append(toIndentedString(urnietfparamsscimschemasextensionenterprise20User)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

