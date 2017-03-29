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
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.QualityAuditPage;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.KeywordSet;
import com.mypurecloud.sdk.v2.model.KeywordSetEntityListing;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;

public class PutQualityCalibrationRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String calibrationId;
	public String getCalibrationId() {
		return this.calibrationId;
	}

	public void setCalibrationId(String calibrationId) {
		this.calibrationId = calibrationId;
	}

	public PutQualityCalibrationRequest withCalibrationId(String calibrationId) {
	    this.setCalibrationId(calibrationId);
	    return this;
	}

	private Calibration body;
	public Calibration getBody() {
		return this.body;
	}

	public void setBody(Calibration body) {
		this.body = body;
	}

	public PutQualityCalibrationRequest withBody(Calibration body) {
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

    public PutQualityCalibrationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Calibration> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'calibrationId' is set
        if (this.calibrationId == null) {
            throw new ApiException(400, "Missing the required parameter 'calibrationId' when building request for PutQualityCalibrationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PutQualityCalibrationRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/quality/calibrations/{calibrationId}")
                .withPathParameter("calibrationId", calibrationId)
        
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

	public static Builder builder(String calibrationId, Calibration body) {
	    return new Builder()
	            .withRequiredParams(calibrationId, body);
	}

	public static class Builder {
		private final PutQualityCalibrationRequest request;

		private Builder() {
			request = new PutQualityCalibrationRequest();
		}

		public Builder withCalibrationId(String calibrationId) {
			request.setCalibrationId(calibrationId);
			return this;
		}
		public Builder withBody(Calibration body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String calibrationId, Calibration body) {
			request.setCalibrationId(calibrationId);
			request.setBody(body);
			return this;
		}


		public PutQualityCalibrationRequest build() {
			return request;
		}
	}
}