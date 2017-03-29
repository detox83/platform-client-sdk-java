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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;

public class PutExternalcontactsOrganizationRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String externalOrganizationId;
	public String getExternalOrganizationId() {
		return this.externalOrganizationId;
	}

	public void setExternalOrganizationId(String externalOrganizationId) {
		this.externalOrganizationId = externalOrganizationId;
	}

	public PutExternalcontactsOrganizationRequest withExternalOrganizationId(String externalOrganizationId) {
	    this.setExternalOrganizationId(externalOrganizationId);
	    return this;
	}

	private ExternalOrganization body;
	public ExternalOrganization getBody() {
		return this.body;
	}

	public void setBody(ExternalOrganization body) {
		this.body = body;
	}

	public PutExternalcontactsOrganizationRequest withBody(ExternalOrganization body) {
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

    public PutExternalcontactsOrganizationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ExternalOrganization> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'externalOrganizationId' is set
        if (this.externalOrganizationId == null) {
            throw new ApiException(400, "Missing the required parameter 'externalOrganizationId' when building request for PutExternalcontactsOrganizationRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/externalcontacts/organizations/{externalOrganizationId}")
                .withPathParameter("externalOrganizationId", externalOrganizationId)
        
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

	public static Builder builder(String externalOrganizationId) {
	    return new Builder()
	            .withRequiredParams(externalOrganizationId);
	}

	public static class Builder {
		private final PutExternalcontactsOrganizationRequest request;

		private Builder() {
			request = new PutExternalcontactsOrganizationRequest();
		}

		public Builder withExternalOrganizationId(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}
		public Builder withBody(ExternalOrganization body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}


		public PutExternalcontactsOrganizationRequest build() {
			return request;
		}
	}
}
