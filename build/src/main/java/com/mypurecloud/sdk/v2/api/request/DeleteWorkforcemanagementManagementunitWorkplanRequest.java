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
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ModelingStatusResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.WfmAgent;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.SchedulingRunResponse;
import com.mypurecloud.sdk.v2.model.RescheduleResult;
import com.mypurecloud.sdk.v2.model.SchedulingRunListResponse;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroup;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroupList;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettings;
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchesSummaryResponse;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.WeekScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.WeekScheduleListResponse;
import com.mypurecloud.sdk.v2.model.ForecastResultResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlan;
import com.mypurecloud.sdk.v2.model.WorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.NotificationsResponse;
import com.mypurecloud.sdk.v2.model.SchedulingStatusResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.UpdateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.UpdateSchedulingRunRequest;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.UpdateWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.AsyncWeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.AgentTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQueryForUsers;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateServiceGoalGroupRequest;
import com.mypurecloud.sdk.v2.model.CreateAdminTimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestEntityList;
import com.mypurecloud.sdk.v2.model.TimeOffRequestLookupList;
import com.mypurecloud.sdk.v2.model.TimeOffRequestQueryBody;
import com.mypurecloud.sdk.v2.model.CopyWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.RescheduleRequest;
import com.mypurecloud.sdk.v2.model.ImportWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.GenerateWeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.GenerateWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.UserSchedulesPartialUploadRequest;
import com.mypurecloud.sdk.v2.model.PartialUploadResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastResponse;
import com.mypurecloud.sdk.v2.model.CopyShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.ImportShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.GenerateShortTermForecastResponse;
import com.mypurecloud.sdk.v2.model.GenerateShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.RouteGroupList;
import com.mypurecloud.sdk.v2.model.CopyWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateManagementUnitApiRequest;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsResponse;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateAgentTimeOffRequest;

public class DeleteWorkforcemanagementManagementunitWorkplanRequest {
    
	private String managementUnitId;
	public String getManagementUnitId() {
		return this.managementUnitId;
	}

	public void setManagementUnitId(String managementUnitId) {
		this.managementUnitId = managementUnitId;
	}

	public DeleteWorkforcemanagementManagementunitWorkplanRequest withManagementUnitId(String managementUnitId) {
	    this.setManagementUnitId(managementUnitId);
	    return this;
	} 
	
	private String workPlanId;
	public String getWorkPlanId() {
		return this.workPlanId;
	}

	public void setWorkPlanId(String workPlanId) {
		this.workPlanId = workPlanId;
	}

	public DeleteWorkforcemanagementManagementunitWorkplanRequest withWorkPlanId(String workPlanId) {
	    this.setWorkPlanId(workPlanId);
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

    public DeleteWorkforcemanagementManagementunitWorkplanRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'managementUnitId' is set
        if (this.managementUnitId == null) {
            throw new IllegalStateException("Missing the required parameter 'managementUnitId' when building request for DeleteWorkforcemanagementManagementunitWorkplanRequest.");
        }
        
        // verify the required parameter 'workPlanId' is set
        if (this.workPlanId == null) {
            throw new IllegalStateException("Missing the required parameter 'workPlanId' when building request for DeleteWorkforcemanagementManagementunitWorkplanRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans/{workPlanId}")
                .withPathParameter("managementUnitId", managementUnitId)
        
                .withPathParameter("workPlanId", workPlanId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String managementUnitId, String workPlanId) {
	    return new Builder()
	            .withRequiredParams(managementUnitId, workPlanId);
	}
	

	public static class Builder {
		private final DeleteWorkforcemanagementManagementunitWorkplanRequest request;

		private Builder() {
			request = new DeleteWorkforcemanagementManagementunitWorkplanRequest();
		}

		
		public Builder withManagementUnitId(String managementUnitId) {
			request.setManagementUnitId(managementUnitId);
			return this;
		}
		
		public Builder withWorkPlanId(String workPlanId) {
			request.setWorkPlanId(workPlanId);
			return this;
		}
		

		
		public Builder withRequiredParams(String managementUnitId, String workPlanId) {
			request.setManagementUnitId(managementUnitId);
						request.setWorkPlanId(workPlanId);
			
			return this;
		}
		

		public DeleteWorkforcemanagementManagementunitWorkplanRequest build() {
            
            // verify the required parameter 'managementUnitId' is set
            if (request.managementUnitId == null) {
                throw new IllegalStateException("Missing the required parameter 'managementUnitId' when building request for DeleteWorkforcemanagementManagementunitWorkplanRequest.");
            }
            
            // verify the required parameter 'workPlanId' is set
            if (request.workPlanId == null) {
                throw new IllegalStateException("Missing the required parameter 'workPlanId' when building request for DeleteWorkforcemanagementManagementunitWorkplanRequest.");
            }
            
			return request;
		}
	}
}
