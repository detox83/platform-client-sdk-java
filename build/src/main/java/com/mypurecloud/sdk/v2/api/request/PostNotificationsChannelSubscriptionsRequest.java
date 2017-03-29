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
import com.mypurecloud.sdk.v2.model.AvailableTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopic;
import com.mypurecloud.sdk.v2.model.Channel;

public class PostNotificationsChannelSubscriptionsRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String channelId;
	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public PostNotificationsChannelSubscriptionsRequest withChannelId(String channelId) {
	    this.setChannelId(channelId);
	    return this;
	}

	private List<ChannelTopic> body;
	public List<ChannelTopic> getBody() {
		return this.body;
	}

	public void setBody(List<ChannelTopic> body) {
		this.body = body;
	}

	public PostNotificationsChannelSubscriptionsRequest withBody(List<ChannelTopic> body) {
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

    public PostNotificationsChannelSubscriptionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<List<ChannelTopic>> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'channelId' is set
        if (this.channelId == null) {
            throw new ApiException(400, "Missing the required parameter 'channelId' when building request for PostNotificationsChannelSubscriptionsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PostNotificationsChannelSubscriptionsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/notifications/channels/{channelId}/subscriptions")
                .withPathParameter("channelId", channelId)
        
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

	public static Builder builder(String channelId, List<ChannelTopic> body) {
	    return new Builder()
	            .withRequiredParams(channelId, body);
	}

	public static class Builder {
		private final PostNotificationsChannelSubscriptionsRequest request;

		private Builder() {
			request = new PostNotificationsChannelSubscriptionsRequest();
		}

		public Builder withChannelId(String channelId) {
			request.setChannelId(channelId);
			return this;
		}
		public Builder withBody(List<ChannelTopic> body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String channelId, List<ChannelTopic> body) {
			request.setChannelId(channelId);
			request.setBody(body);
			return this;
		}


		public PostNotificationsChannelSubscriptionsRequest build() {
			return request;
		}
	}
}
