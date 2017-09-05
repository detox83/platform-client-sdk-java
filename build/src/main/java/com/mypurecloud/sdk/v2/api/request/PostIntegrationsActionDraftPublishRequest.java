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
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;

public class PostIntegrationsActionDraftPublishRequest {
    
	private String actionId;
	public String getActionId() {
		return this.actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public PostIntegrationsActionDraftPublishRequest withActionId(String actionId) {
	    this.setActionId(actionId);
	    return this;
	}

	
	private PublishDraftInput body;
	public PublishDraftInput getBody() {
		return this.body;
	}

	public void setBody(PublishDraftInput body) {
		this.body = body;
	}

	public PostIntegrationsActionDraftPublishRequest withBody(PublishDraftInput body) {
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

    public PostIntegrationsActionDraftPublishRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PublishDraftInput> withHttpInfo() {
        
        // verify the required parameter 'actionId' is set
        if (this.actionId == null) {
            throw new IllegalStateException("Missing the required parameter 'actionId' when building request for PostIntegrationsActionDraftPublishRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostIntegrationsActionDraftPublishRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/integrations/actions/{actionId}/draft/publish")
                .withPathParameter("actionId", actionId)
        
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

	
	public static Builder builder(String actionId, PublishDraftInput body) {
	    return new Builder()
	            .withRequiredParams(actionId, body);
	}
	

	public static class Builder {
		private final PostIntegrationsActionDraftPublishRequest request;

		private Builder() {
			request = new PostIntegrationsActionDraftPublishRequest();
		}

		
		public Builder withActionId(String actionId) {
			request.setActionId(actionId);
			return this;
		}
		
		public Builder withBody(PublishDraftInput body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String actionId, PublishDraftInput body) {
			request.setActionId(actionId);
						request.setBody(body);
			
			return this;
		}
		


		public PostIntegrationsActionDraftPublishRequest build() {
            
            // verify the required parameter 'actionId' is set
            if (request.actionId == null) {
                throw new IllegalStateException("Missing the required parameter 'actionId' when building request for PostIntegrationsActionDraftPublishRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostIntegrationsActionDraftPublishRequest.");
            }
            
			return request;
		}
	}
}
