package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import com.mypurecloud.sdk.v2.model.CampaignDivisionView;
import com.mypurecloud.sdk.v2.model.CampaignDivisionViewListing;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.ContactListFilter;
import com.mypurecloud.sdk.v2.model.ContactListFilterEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.EventLog;
import com.mypurecloud.sdk.v2.model.DialerEventEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundSettings;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.AuditSearchResult;
import com.mypurecloud.sdk.v2.model.DialerAuditRequest;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.WritableDialerContact;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.FilterPreviewResponse;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.Agent;

public class GetOutboundDnclistRequest {
    
	private String dncListId;
	public String getDncListId() {
		return this.dncListId;
	}

	public void setDncListId(String dncListId) {
		this.dncListId = dncListId;
	}

	public GetOutboundDnclistRequest withDncListId(String dncListId) {
	    this.setDncListId(dncListId);
	    return this;
	} 
	
	private Boolean includeImportStatus;
	public Boolean getIncludeImportStatus() {
		return this.includeImportStatus;
	}

	public void setIncludeImportStatus(Boolean includeImportStatus) {
		this.includeImportStatus = includeImportStatus;
	}

	public GetOutboundDnclistRequest withIncludeImportStatus(Boolean includeImportStatus) {
	    this.setIncludeImportStatus(includeImportStatus);
	    return this;
	} 
	
	private Boolean includeSize;
	public Boolean getIncludeSize() {
		return this.includeSize;
	}

	public void setIncludeSize(Boolean includeSize) {
		this.includeSize = includeSize;
	}

	public GetOutboundDnclistRequest withIncludeSize(Boolean includeSize) {
	    this.setIncludeSize(includeSize);
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

    public GetOutboundDnclistRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'dncListId' is set
        if (this.dncListId == null) {
            throw new IllegalStateException("Missing the required parameter 'dncListId' when building request for GetOutboundDnclistRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/outbound/dnclists/{dncListId}")
                .withPathParameter("dncListId", dncListId)
        
                .withQueryParameters("includeImportStatus", "", includeImportStatus)
        
                .withQueryParameters("includeSize", "", includeSize)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String dncListId) {
	    return new Builder()
	            .withRequiredParams(dncListId);
	}
	

	public static class Builder {
		private final GetOutboundDnclistRequest request;

		private Builder() {
			request = new GetOutboundDnclistRequest();
		}

		
		public Builder withDncListId(String dncListId) {
			request.setDncListId(dncListId);
			return this;
		}
		
		public Builder withIncludeImportStatus(Boolean includeImportStatus) {
			request.setIncludeImportStatus(includeImportStatus);
			return this;
		}
		
		public Builder withIncludeSize(Boolean includeSize) {
			request.setIncludeSize(includeSize);
			return this;
		}
		

		
		public Builder withRequiredParams(String dncListId) {
			request.setDncListId(dncListId);
			
			return this;
		}
		

		public GetOutboundDnclistRequest build() {
            
            // verify the required parameter 'dncListId' is set
            if (request.dncListId == null) {
                throw new IllegalStateException("Missing the required parameter 'dncListId' when building request for GetOutboundDnclistRequest.");
            }
            
			return request;
		}
	}
}
