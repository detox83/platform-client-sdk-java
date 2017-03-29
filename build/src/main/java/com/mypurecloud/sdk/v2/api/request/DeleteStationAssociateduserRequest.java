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
import com.mypurecloud.sdk.v2.model.Station;
import com.mypurecloud.sdk.v2.model.StationEntityListing;

public class DeleteStationAssociateduserRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String stationId;
	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public DeleteStationAssociateduserRequest withStationId(String stationId) {
	    this.setStationId(stationId);
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

    public DeleteStationAssociateduserRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'stationId' is set
        if (this.stationId == null) {
            throw new ApiException(400, "Missing the required parameter 'stationId' when building request for DeleteStationAssociateduserRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/stations/{stationId}/associateduser")
                .withPathParameter("stationId", stationId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String stationId) {
	    return new Builder()
	            .withRequiredParams(stationId);
	}

	public static class Builder {
		private final DeleteStationAssociateduserRequest request;

		private Builder() {
			request = new DeleteStationAssociateduserRequest();
		}

		public Builder withStationId(String stationId) {
			request.setStationId(stationId);
			return this;
		}

		public Builder withRequiredParams(String stationId) {
			request.setStationId(stationId);
			return this;
		}


		public DeleteStationAssociateduserRequest build() {
			return request;
		}
	}
}
