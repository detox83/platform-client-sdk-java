package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.ScimError;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypesListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;

public class GetScimUserRequest {
    
	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetScimUserRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 
	
	private List<String> attributes;
	public List<String> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	public GetScimUserRequest withAttributes(List<String> attributes) {
	    this.setAttributes(attributes);
	    return this;
	} 

	public enum attributesValues { 
		ID("id"), 
		USERNAME("userName"), 
		DISPLAYNAME("displayName"), 
		TITLE("title"), 
		ACTIVE("active"), 
		EXTERNALID("externalId"), 
		PHONENUMBERS("phoneNumbers"), 
		EMAILS("emails"), 
		PHOTOS("photos"), 
		GROUPS("groups"), 
		ROLESURN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_ID("rolesurn:ietf:params:scim:schemas:core:2.0:User:id"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_USERNAME("urn:ietf:params:scim:schemas:core:2.0:User:userName"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_DISPLAYNAME("urn:ietf:params:scim:schemas:core:2.0:User:displayName"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_TITLE("urn:ietf:params:scim:schemas:core:2.0:User:title"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_ACTIVE("urn:ietf:params:scim:schemas:core:2.0:User:active"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_EXTERNALID("urn:ietf:params:scim:schemas:core:2.0:User:externalId"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_PHONENUMBERS("urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_EMAILS("urn:ietf:params:scim:schemas:core:2.0:User:emails"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_PHOTOS("urn:ietf:params:scim:schemas:core:2.0:User:photos"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_GROUPS("urn:ietf:params:scim:schemas:core:2.0:User:groups"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_ROLES("urn:ietf:params:scim:schemas:core:2.0:User:roles"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_DIVISION("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_DEPARTMENT("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_MANAGER("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_MANAGER_VALUE("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value");

		private String value;

		attributesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static attributesValues fromString(String key) {
			if (key == null) return null;

			for (attributesValues value : attributesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return attributesValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> excludedAttributes;
	public List<String> getExcludedAttributes() {
		return this.excludedAttributes;
	}

	public void setExcludedAttributes(List<String> excludedAttributes) {
		this.excludedAttributes = excludedAttributes;
	}

	public GetScimUserRequest withExcludedAttributes(List<String> excludedAttributes) {
	    this.setExcludedAttributes(excludedAttributes);
	    return this;
	} 

	public enum excludedAttributesValues { 
		ID("id"), 
		USERNAME("userName"), 
		DISPLAYNAME("displayName"), 
		TITLE("title"), 
		ACTIVE("active"), 
		EXTERNALID("externalId"), 
		PHONENUMBERS("phoneNumbers"), 
		EMAILS("emails"), 
		PHOTOS("photos"), 
		GROUPS("groups"), 
		ROLESURN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_ID("rolesurn:ietf:params:scim:schemas:core:2.0:User:id"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_USERNAME("urn:ietf:params:scim:schemas:core:2.0:User:userName"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_DISPLAYNAME("urn:ietf:params:scim:schemas:core:2.0:User:displayName"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_TITLE("urn:ietf:params:scim:schemas:core:2.0:User:title"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_ACTIVE("urn:ietf:params:scim:schemas:core:2.0:User:active"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_EXTERNALID("urn:ietf:params:scim:schemas:core:2.0:User:externalId"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_PHONENUMBERS("urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_EMAILS("urn:ietf:params:scim:schemas:core:2.0:User:emails"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_PHOTOS("urn:ietf:params:scim:schemas:core:2.0:User:photos"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_GROUPS("urn:ietf:params:scim:schemas:core:2.0:User:groups"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER_ROLES("urn:ietf:params:scim:schemas:core:2.0:User:roles"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_DIVISION("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_DEPARTMENT("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_MANAGER("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER_MANAGER_VALUE("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value");

		private String value;

		excludedAttributesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static excludedAttributesValues fromString(String key) {
			if (key == null) return null;

			for (excludedAttributesValues value : excludedAttributesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return excludedAttributesValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String ifNoneMatch;
	public String getIfNoneMatch() {
		return this.ifNoneMatch;
	}

	public void setIfNoneMatch(String ifNoneMatch) {
		this.ifNoneMatch = ifNoneMatch;
	}

	public GetScimUserRequest withIfNoneMatch(String ifNoneMatch) {
	    this.setIfNoneMatch(ifNoneMatch);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public GetScimUserRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetScimUserRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scim/users/{userId}")
                .withPathParameter("userId", userId)
        
                .withQueryParameters("attributes", "multi", attributes)
        
                .withQueryParameters("excludedAttributes", "multi", excludedAttributes)
        
                .withHeaderParameter("If-None-Match", ifNoneMatch)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json", "application/scim+json")
                .withAccepts("application/json", "application/scim+json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String userId) {
	    return new Builder()
	            .withRequiredParams(userId);
	}
	

	public static class Builder {
		private final GetScimUserRequest request;

		private Builder() {
			request = new GetScimUserRequest();
		}

		
		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		
		public Builder withAttributes(List<String> attributes) {
			request.setAttributes(attributes);
			return this;
		}

		public Builder withAttributesEnumValues(List<attributesValues> attributes) {
		    List<String> stringList = new ArrayList<>();
	      for (attributesValues e : attributes) {
	        stringList.add(e.toString());
	      }
	      request.setAttributes(stringList);
		    return this;
		}
		
		public Builder withExcludedAttributes(List<String> excludedAttributes) {
			request.setExcludedAttributes(excludedAttributes);
			return this;
		}

		public Builder withExcludedAttributesEnumValues(List<excludedAttributesValues> excludedAttributes) {
		    List<String> stringList = new ArrayList<>();
	      for (excludedAttributesValues e : excludedAttributes) {
	        stringList.add(e.toString());
	      }
	      request.setExcludedAttributes(stringList);
		    return this;
		}
		
		public Builder withIfNoneMatch(String ifNoneMatch) {
			request.setIfNoneMatch(ifNoneMatch);
			return this;
		}
		

		
		public Builder withRequiredParams(String userId) {
			request.setUserId(userId);
			
			return this;
		}
		

		public GetScimUserRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetScimUserRequest.");
            }
            
			return request;
		}
	}
}
