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
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;

public class GetConversationRecordingRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetConversationRecordingRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	}

	private String recordingId;
	public String getRecordingId() {
		return this.recordingId;
	}

	public void setRecordingId(String recordingId) {
		this.recordingId = recordingId;
	}

	public GetConversationRecordingRequest withRecordingId(String recordingId) {
	    this.setRecordingId(recordingId);
	    return this;
	}

	private String formatId;
	public String getFormatId() {
		return this.formatId;
	}

	public void setFormatId(String formatId) {
		this.formatId = formatId;
	}

	public GetConversationRecordingRequest withFormatId(String formatId) {
	    this.setFormatId(formatId);
	    return this;
	}

	private Boolean download;
	public Boolean getDownload() {
		return this.download;
	}

	public void setDownload(Boolean download) {
		this.download = download;
	}

	public GetConversationRecordingRequest withDownload(Boolean download) {
	    this.setDownload(download);
	    return this;
	}

	private String fileName;
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public GetConversationRecordingRequest withFileName(String fileName) {
	    this.setFileName(fileName);
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

    public GetConversationRecordingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new ApiException(400, "Missing the required parameter 'conversationId' when building request for GetConversationRecordingRequest.");
        }
        
        // verify the required parameter 'recordingId' is set
        if (this.recordingId == null) {
            throw new ApiException(400, "Missing the required parameter 'recordingId' when building request for GetConversationRecordingRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/conversations/{conversationId}/recordings/{recordingId}")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("recordingId", recordingId)
        
                .withQueryParameters("formatId", "", formatId)
        
                .withQueryParameters("download", "", download)
        
                .withQueryParameters("fileName", "", fileName)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String conversationId, String recordingId) {
	    return new Builder()
	            .withRequiredParams(conversationId, recordingId);
	}

	public static class Builder {
		private final GetConversationRecordingRequest request;

		private Builder() {
			request = new GetConversationRecordingRequest();
		}

		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		public Builder withRecordingId(String recordingId) {
			request.setRecordingId(recordingId);
			return this;
		}
		public Builder withFormatId(String formatId) {
			request.setFormatId(formatId);
			return this;
		}
		public Builder withDownload(Boolean download) {
			request.setDownload(download);
			return this;
		}
		public Builder withFileName(String fileName) {
			request.setFileName(fileName);
			return this;
		}

		public Builder withRequiredParams(String conversationId, String recordingId) {
			request.setConversationId(conversationId);
			request.setRecordingId(recordingId);
			return this;
		}


		public GetConversationRecordingRequest build() {
			return request;
		}
	}
}
