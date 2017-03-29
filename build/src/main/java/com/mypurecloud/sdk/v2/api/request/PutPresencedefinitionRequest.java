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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;

public class PutPresencedefinitionRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String presenceId;
	public String getPresenceId() {
		return this.presenceId;
	}

	public void setPresenceId(String presenceId) {
		this.presenceId = presenceId;
	}

	public PutPresencedefinitionRequest withPresenceId(String presenceId) {
	    this.setPresenceId(presenceId);
	    return this;
	}

	private OrganizationPresence body;
	public OrganizationPresence getBody() {
		return this.body;
	}

	public void setBody(OrganizationPresence body) {
		this.body = body;
	}

	public PutPresencedefinitionRequest withBody(OrganizationPresence body) {
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

    public PutPresencedefinitionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<OrganizationPresence> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'presenceId' is set
        if (this.presenceId == null) {
            throw new ApiException(400, "Missing the required parameter 'presenceId' when building request for PutPresencedefinitionRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PutPresencedefinitionRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/presencedefinitions/{presenceId}")
                .withPathParameter("presenceId", presenceId)
        
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

	public static Builder builder(String presenceId, OrganizationPresence body) {
	    return new Builder()
	            .withRequiredParams(presenceId, body);
	}

	public static class Builder {
		private final PutPresencedefinitionRequest request;

		private Builder() {
			request = new PutPresencedefinitionRequest();
		}

		public Builder withPresenceId(String presenceId) {
			request.setPresenceId(presenceId);
			return this;
		}
		public Builder withBody(OrganizationPresence body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String presenceId, OrganizationPresence body) {
			request.setPresenceId(presenceId);
			request.setBody(body);
			return this;
		}


		public PutPresencedefinitionRequest build() {
			return request;
		}
	}
}
