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
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.AttemptLimits;
import com.mypurecloud.sdk.v2.model.AttemptLimitsEntityListing;
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignProgress;
import com.mypurecloud.sdk.v2.model.CampaignStats;
import com.mypurecloud.sdk.v2.model.CampaignRule;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.AuditSearchResult;
import com.mypurecloud.sdk.v2.model.DialerAuditRequest;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.Agent;

public class DeleteOutboundAttemptlimitRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String attemptLimitsId;
	public String getAttemptLimitsId() {
		return this.attemptLimitsId;
	}

	public void setAttemptLimitsId(String attemptLimitsId) {
		this.attemptLimitsId = attemptLimitsId;
	}

	public DeleteOutboundAttemptlimitRequest withAttemptLimitsId(String attemptLimitsId) {
	    this.setAttemptLimitsId(attemptLimitsId);
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

    public DeleteOutboundAttemptlimitRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'attemptLimitsId' is set
        if (this.attemptLimitsId == null) {
            throw new ApiException(400, "Missing the required parameter 'attemptLimitsId' when building request for DeleteOutboundAttemptlimitRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/outbound/attemptlimits/{attemptLimitsId}")
                .withPathParameter("attemptLimitsId", attemptLimitsId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String attemptLimitsId) {
	    return new Builder()
	            .withRequiredParams(attemptLimitsId);
	}

	public static class Builder {
		private final DeleteOutboundAttemptlimitRequest request;

		private Builder() {
			request = new DeleteOutboundAttemptlimitRequest();
		}

		public Builder withAttemptLimitsId(String attemptLimitsId) {
			request.setAttemptLimitsId(attemptLimitsId);
			return this;
		}

		public Builder withRequiredParams(String attemptLimitsId) {
			request.setAttemptLimitsId(attemptLimitsId);
			return this;
		}


		public DeleteOutboundAttemptlimitRequest build() {
			return request;
		}
	}
}