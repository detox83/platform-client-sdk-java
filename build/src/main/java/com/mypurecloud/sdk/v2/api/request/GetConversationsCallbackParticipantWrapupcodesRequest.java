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
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.ConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversation;
import com.mypurecloud.sdk.v2.model.Wrapup;
import com.mypurecloud.sdk.v2.model.CallbackConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MaxParticipants;
import com.mypurecloud.sdk.v2.model.ChatConversation;
import com.mypurecloud.sdk.v2.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CobrowseConversation;
import com.mypurecloud.sdk.v2.model.CobrowseConversationEntityListing;
import com.mypurecloud.sdk.v2.model.EmailConversation;
import com.mypurecloud.sdk.v2.model.EmailMessage;
import com.mypurecloud.sdk.v2.model.EmailMessageListing;
import com.mypurecloud.sdk.v2.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MediaParticipantRequest;
import com.mypurecloud.sdk.v2.model.ParticipantAttributes;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ConsultTransferUpdate;
import com.mypurecloud.sdk.v2.model.ConsultTransferResponse;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.CreateCallbackCommand;
import com.mypurecloud.sdk.v2.model.TransferRequest;
import com.mypurecloud.sdk.v2.model.CallCommand;
import com.mypurecloud.sdk.v2.model.ConsultTransfer;
import com.mypurecloud.sdk.v2.model.CreateCallbackResponse;
import com.mypurecloud.sdk.v2.model.CreateCallRequest;
import com.mypurecloud.sdk.v2.model.CreateCallResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatRequest;
import com.mypurecloud.sdk.v2.model.CreateEmailRequest;
import com.mypurecloud.sdk.v2.model.FaxSendResponse;
import com.mypurecloud.sdk.v2.model.FaxSendRequest;

public class GetConversationsCallbackParticipantWrapupcodesRequest {
	private String callbackId;
	public String getCallbackId() {
		return this.callbackId;
	}

	public void setCallbackId(String callbackId) {
		this.callbackId = callbackId;
	}

	public GetConversationsCallbackParticipantWrapupcodesRequest withCallbackId(String callbackId) {
	    this.setCallbackId(callbackId);
	    return this;
	}

	private String participantId;
	public String getParticipantId() {
		return this.participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public GetConversationsCallbackParticipantWrapupcodesRequest withParticipantId(String participantId) {
	    this.setParticipantId(participantId);
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

    public GetConversationsCallbackParticipantWrapupcodesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'callbackId' is set
        if (this.callbackId == null) {
            throw new IllegalStateException("Missing the required parameter 'callbackId' when building request for GetConversationsCallbackParticipantWrapupcodesRequest.");
        }
        
        // verify the required parameter 'participantId' is set
        if (this.participantId == null) {
            throw new IllegalStateException("Missing the required parameter 'participantId' when building request for GetConversationsCallbackParticipantWrapupcodesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapupcodes")
                .withPathParameter("callbackId", callbackId)
        
                .withPathParameter("participantId", participantId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String callbackId, String participantId) {
	    return new Builder()
	            .withRequiredParams(callbackId, participantId);
	}

	public static class Builder {
		private final GetConversationsCallbackParticipantWrapupcodesRequest request;

		private Builder() {
			request = new GetConversationsCallbackParticipantWrapupcodesRequest();
		}

		public Builder withCallbackId(String callbackId) {
			request.setCallbackId(callbackId);
			return this;
		}
		public Builder withParticipantId(String participantId) {
			request.setParticipantId(participantId);
			return this;
		}

		public Builder withRequiredParams(String callbackId, String participantId) {
			request.setCallbackId(callbackId);
			request.setParticipantId(participantId);
			return this;
		}


		public GetConversationsCallbackParticipantWrapupcodesRequest build() {
            
            // verify the required parameter 'callbackId' is set
            if (request.callbackId == null) {
                throw new IllegalStateException("Missing the required parameter 'callbackId' when building request for GetConversationsCallbackParticipantWrapupcodesRequest.");
            }
            
            // verify the required parameter 'participantId' is set
            if (request.participantId == null) {
                throw new IllegalStateException("Missing the required parameter 'participantId' when building request for GetConversationsCallbackParticipantWrapupcodesRequest.");
            }
            
			return request;
		}
	}
}
