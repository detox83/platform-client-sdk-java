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
import com.mypurecloud.sdk.v2.model.TranscriptProperty;

public class GetConversationTranscriptpropertyRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetConversationTranscriptpropertyRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 
	
	private String communicationId;
	public String getCommunicationId() {
		return this.communicationId;
	}

	public void setCommunicationId(String communicationId) {
		this.communicationId = communicationId;
	}

	public GetConversationTranscriptpropertyRequest withCommunicationId(String communicationId) {
	    this.setCommunicationId(communicationId);
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

    public GetConversationTranscriptpropertyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetConversationTranscriptpropertyRequest.");
        }
        
        // verify the required parameter 'communicationId' is set
        if (this.communicationId == null) {
            throw new IllegalStateException("Missing the required parameter 'communicationId' when building request for GetConversationTranscriptpropertyRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/conversations/{conversationId}/transcriptproperties/{communicationId}")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("communicationId", communicationId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String conversationId, String communicationId) {
	    return new Builder()
	            .withRequiredParams(conversationId, communicationId);
	}
	

	public static class Builder {
		private final GetConversationTranscriptpropertyRequest request;

		private Builder() {
			request = new GetConversationTranscriptpropertyRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withCommunicationId(String communicationId) {
			request.setCommunicationId(communicationId);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId, String communicationId) {
			request.setConversationId(conversationId);
						request.setCommunicationId(communicationId);
			
			return this;
		}
		

		public GetConversationTranscriptpropertyRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetConversationTranscriptpropertyRequest.");
            }
            
            // verify the required parameter 'communicationId' is set
            if (request.communicationId == null) {
                throw new IllegalStateException("Missing the required parameter 'communicationId' when building request for GetConversationTranscriptpropertyRequest.");
            }
            
			return request;
		}
	}
}
