package com.mypurecloud.sdk.v2.api.request;

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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;

public class PatchVoicemailGroupPolicyRequest {
	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public PatchVoicemailGroupPolicyRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	}

	private VoicemailGroupPolicy body;
	public VoicemailGroupPolicy getBody() {
		return this.body;
	}

	public void setBody(VoicemailGroupPolicy body) {
		this.body = body;
	}

	public PatchVoicemailGroupPolicyRequest withBody(VoicemailGroupPolicy body) {
	    this.setBody(body);
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

    public PatchVoicemailGroupPolicyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<VoicemailGroupPolicy> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PatchVoicemailGroupPolicyRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchVoicemailGroupPolicyRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/voicemail/groups/{groupId}/policy")
                .withPathParameter("groupId", groupId)
        
                .withBody(body)
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String groupId, VoicemailGroupPolicy body) {
	    return new Builder()
	            .withRequiredParams(groupId, body);
	}

	public static class Builder {
		private final PatchVoicemailGroupPolicyRequest request;

		private Builder() {
			request = new PatchVoicemailGroupPolicyRequest();
		}

		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}
		public Builder withBody(VoicemailGroupPolicy body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String groupId, VoicemailGroupPolicy body) {
			request.setGroupId(groupId);
			request.setBody(body);
			return this;
		}


		public PatchVoicemailGroupPolicyRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PatchVoicemailGroupPolicyRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchVoicemailGroupPolicyRequest.");
            }
            
			return request;
		}
	}
}
