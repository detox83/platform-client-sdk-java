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

public class DeleteIntegrationsActionRequest {
    
	private String actionId;
	public String getActionId() {
		return this.actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public DeleteIntegrationsActionRequest withActionId(String actionId) {
	    this.setActionId(actionId);
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

    public DeleteIntegrationsActionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'actionId' is set
        if (this.actionId == null) {
            throw new IllegalStateException("Missing the required parameter 'actionId' when building request for DeleteIntegrationsActionRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/integrations/actions/{actionId}")
                .withPathParameter("actionId", actionId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String actionId) {
	    return new Builder()
	            .withRequiredParams(actionId);
	}
	

	public static class Builder {
		private final DeleteIntegrationsActionRequest request;

		private Builder() {
			request = new DeleteIntegrationsActionRequest();
		}

		
		public Builder withActionId(String actionId) {
			request.setActionId(actionId);
			return this;
		}
		

		
		public Builder withRequiredParams(String actionId) {
			request.setActionId(actionId);
			
			return this;
		}
		


		public DeleteIntegrationsActionRequest build() {
            
            // verify the required parameter 'actionId' is set
            if (request.actionId == null) {
                throw new IllegalStateException("Missing the required parameter 'actionId' when building request for DeleteIntegrationsActionRequest.");
            }
            
			return request;
		}
	}
}
