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
import com.mypurecloud.sdk.v2.model.DocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.DocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;
import com.mypurecloud.sdk.v2.model.SearchRequest;
import com.mypurecloud.sdk.v2.model.SuggestSearchRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;

public class PostLocationsSearchRequest {
	private LocationSearchRequest body;
	public LocationSearchRequest getBody() {
		return this.body;
	}

	public void setBody(LocationSearchRequest body) {
		this.body = body;
	}

	public PostLocationsSearchRequest withBody(LocationSearchRequest body) {
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

    public PostLocationsSearchRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LocationSearchRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLocationsSearchRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/locations/search")
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

	public static Builder builder(LocationSearchRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}

	public static class Builder {
		private final PostLocationsSearchRequest request;

		private Builder() {
			request = new PostLocationsSearchRequest();
		}

		public Builder withBody(LocationSearchRequest body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(LocationSearchRequest body) {
			request.setBody(body);
			return this;
		}


		public PostLocationsSearchRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLocationsSearchRequest.");
            }
            
			return request;
		}
	}
}
