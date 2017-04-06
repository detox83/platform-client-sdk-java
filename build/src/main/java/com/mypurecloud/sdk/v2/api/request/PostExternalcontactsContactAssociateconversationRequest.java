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

public class PostExternalcontactsContactAssociateconversationRequest {
	private String contactId;
	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public PostExternalcontactsContactAssociateconversationRequest withContactId(String contactId) {
	    this.setContactId(contactId);
	    return this;
	}

	private ConversationAssociation body;
	public ConversationAssociation getBody() {
		return this.body;
	}

	public void setBody(ConversationAssociation body) {
		this.body = body;
	}

	public PostExternalcontactsContactAssociateconversationRequest withBody(ConversationAssociation body) {
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

    public PostExternalcontactsContactAssociateconversationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ConversationAssociation> withHttpInfo() {
        
        // verify the required parameter 'contactId' is set
        if (this.contactId == null) {
            throw new IllegalStateException("Missing the required parameter 'contactId' when building request for PostExternalcontactsContactAssociateconversationRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/externalcontacts/contacts/{contactId}/associateconversation")
                .withPathParameter("contactId", contactId)
        
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

	public static Builder builder(String contactId) {
	    return new Builder()
	            .withRequiredParams(contactId);
	}

	public static class Builder {
		private final PostExternalcontactsContactAssociateconversationRequest request;

		private Builder() {
			request = new PostExternalcontactsContactAssociateconversationRequest();
		}

		public Builder withContactId(String contactId) {
			request.setContactId(contactId);
			return this;
		}
		public Builder withBody(ConversationAssociation body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String contactId) {
			request.setContactId(contactId);
			return this;
		}


		public PostExternalcontactsContactAssociateconversationRequest build() {
            
            // verify the required parameter 'contactId' is set
            if (request.contactId == null) {
                throw new IllegalStateException("Missing the required parameter 'contactId' when building request for PostExternalcontactsContactAssociateconversationRequest.");
            }
            
			return request;
		}
	}
}
