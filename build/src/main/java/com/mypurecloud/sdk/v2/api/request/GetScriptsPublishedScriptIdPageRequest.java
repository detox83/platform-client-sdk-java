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

import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Page;
import com.mypurecloud.sdk.v2.model.ScriptEntityListing;

public class GetScriptsPublishedScriptIdPageRequest {
	private String scriptId;
	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}

	public GetScriptsPublishedScriptIdPageRequest withScriptId(String scriptId) {
	    this.setScriptId(scriptId);
	    return this;
	}

	private String pageId;
	public String getPageId() {
		return this.pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public GetScriptsPublishedScriptIdPageRequest withPageId(String pageId) {
	    this.setPageId(pageId);
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

    public GetScriptsPublishedScriptIdPageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scriptId' is set
        if (this.scriptId == null) {
            throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptsPublishedScriptIdPageRequest.");
        }
        
        // verify the required parameter 'pageId' is set
        if (this.pageId == null) {
            throw new IllegalStateException("Missing the required parameter 'pageId' when building request for GetScriptsPublishedScriptIdPageRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scripts/published/{scriptId}/pages/{pageId}")
                .withPathParameter("scriptId", scriptId)
        
                .withPathParameter("pageId", pageId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String scriptId, String pageId) {
	    return new Builder()
	            .withRequiredParams(scriptId, pageId);
	}

	public static class Builder {
		private final GetScriptsPublishedScriptIdPageRequest request;

		private Builder() {
			request = new GetScriptsPublishedScriptIdPageRequest();
		}

		public Builder withScriptId(String scriptId) {
			request.setScriptId(scriptId);
			return this;
		}
		public Builder withPageId(String pageId) {
			request.setPageId(pageId);
			return this;
		}

		public Builder withRequiredParams(String scriptId, String pageId) {
			request.setScriptId(scriptId);
			request.setPageId(pageId);
			return this;
		}


		public GetScriptsPublishedScriptIdPageRequest build() {
            
            // verify the required parameter 'scriptId' is set
            if (request.scriptId == null) {
                throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptsPublishedScriptIdPageRequest.");
            }
            
            // verify the required parameter 'pageId' is set
            if (request.pageId == null) {
                throw new IllegalStateException("Missing the required parameter 'pageId' when building request for GetScriptsPublishedScriptIdPageRequest.");
            }
            
			return request;
		}
	}
}
