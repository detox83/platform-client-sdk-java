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

public class GetExternalcontactsOrganizationContactsRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String externalOrganizationId;
	public String getExternalOrganizationId() {
		return this.externalOrganizationId;
	}

	public void setExternalOrganizationId(String externalOrganizationId) {
		this.externalOrganizationId = externalOrganizationId;
	}

	public GetExternalcontactsOrganizationContactsRequest withExternalOrganizationId(String externalOrganizationId) {
	    this.setExternalOrganizationId(externalOrganizationId);
	    return this;
	}

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetExternalcontactsOrganizationContactsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	}

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetExternalcontactsOrganizationContactsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	}

	private String q;
	public String getQ() {
		return this.q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public GetExternalcontactsOrganizationContactsRequest withQ(String q) {
	    this.setQ(q);
	    return this;
	}

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetExternalcontactsOrganizationContactsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	}

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetExternalcontactsOrganizationContactsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
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

    public GetExternalcontactsOrganizationContactsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'externalOrganizationId' is set
        if (this.externalOrganizationId == null) {
            throw new ApiException(400, "Missing the required parameter 'externalOrganizationId' when building request for GetExternalcontactsOrganizationContactsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/externalcontacts/organizations/{externalOrganizationId}/contacts")
                .withPathParameter("externalOrganizationId", externalOrganizationId)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("q", "", q)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("expand", "multi", expand)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String externalOrganizationId) {
	    return new Builder()
	            .withRequiredParams(externalOrganizationId);
	}

	public static class Builder {
		private final GetExternalcontactsOrganizationContactsRequest request;

		private Builder() {
			request = new GetExternalcontactsOrganizationContactsRequest();
		}

		public Builder withExternalOrganizationId(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		public Builder withQ(String q) {
			request.setQ(q);
			return this;
		}
		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withRequiredParams(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}


		public GetExternalcontactsOrganizationContactsRequest build() {
			return request;
		}
	}
}