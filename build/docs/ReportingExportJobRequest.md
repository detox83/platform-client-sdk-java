---
title: ReportingExportJobRequest
---
## ReportingExportJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The user supplied name of the export request |  |
| **timeZone** | <!----><!---->**String**<!----> | The requested timezone of the exported data. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  |
| **exportFormat** | [**ExportFormatEnum**](#ExportFormatEnum)<!----> | The requested format of the exported data |  |
| **interval** | <!----><!---->**String**<!----> | The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **period** | <!----><!---->**String**<!----> | The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  |
| **viewType** | [**ViewTypeEnum**](#ViewTypeEnum)<!----> | The type of view export job to be created |  |
| **filter** | <!----><!---->[**ViewFilter**](ViewFilter.html)<!----> | Filters to apply to create the view |  |
| **read** | <!----><!---->**Boolean**<!----> | Indicates if the request has been marked as read |  [optional] |
| **locale** | <!----><!---->**String**<!----> | The locale use for localization of the exported data, i.e. en-us, es-mx   |  |
| **hasFormatDurations** | <!----><!---->**Boolean**<!----> | Indicates if durations are formatted in hh:mm:ss format instead of ms |  [optional] |
| **hasSplitFilters** | <!----><!---->**Boolean**<!----> | Indicates if filters will be split in aggregate detail exports |  [optional] |
| **selectedColumns** | <!----><!---->[**List&lt;SelectedColumns&gt;**](SelectedColumns.html)<!----> | The list of ordered selected columns from the export view by the user |  [optional] |
| **hasCustomParticipantAttributes** | <!----><!---->**Boolean**<!----> | Indicates if custom participant attributes will be exported |  [optional] |
{: class="table table-striped"}


<a name="ExportFormatEnum"></a>

## Enum: ExportFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CSV | &quot;CSV&quot; |
| PDF | &quot;PDF&quot; |
{: class="table table-striped"}


<a name="ViewTypeEnum"></a>

## Enum: ViewTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUE_PERFORMANCE_SUMMARY_VIEW | &quot;QUEUE_PERFORMANCE_SUMMARY_VIEW&quot; |
| QUEUE_PERFORMANCE_DETAIL_VIEW | &quot;QUEUE_PERFORMANCE_DETAIL_VIEW&quot; |
| INTERACTION_SEARCH_VIEW | &quot;INTERACTION_SEARCH_VIEW&quot; |
| AGENT_PERFORMANCE_SUMMARY_VIEW | &quot;AGENT_PERFORMANCE_SUMMARY_VIEW&quot; |
| AGENT_PERFORMANCE_DETAIL_VIEW | &quot;AGENT_PERFORMANCE_DETAIL_VIEW&quot; |
| AGENT_STATUS_SUMMARY_VIEW | &quot;AGENT_STATUS_SUMMARY_VIEW&quot; |
| AGENT_STATUS_DETAIL_VIEW | &quot;AGENT_STATUS_DETAIL_VIEW&quot; |
| AGENT_EVALUATION_SUMMARY_VIEW | &quot;AGENT_EVALUATION_SUMMARY_VIEW&quot; |
| AGENT_EVALUATION_DETAIL_VIEW | &quot;AGENT_EVALUATION_DETAIL_VIEW&quot; |
| AGENT_QUEUE_DETAIL_VIEW | &quot;AGENT_QUEUE_DETAIL_VIEW&quot; |
| AGENT_INTERACTION_DETAIL_VIEW | &quot;AGENT_INTERACTION_DETAIL_VIEW&quot; |
| ABANDON_INSIGHTS_VIEW | &quot;ABANDON_INSIGHTS_VIEW&quot; |
| SKILLS_PERFORMANCE_VIEW | &quot;SKILLS_PERFORMANCE_VIEW&quot; |
| SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW | &quot;SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW&quot; |
| SURVEY_FORM_PERFORMANCE_DETAIL_VIEW | &quot;SURVEY_FORM_PERFORMANCE_DETAIL_VIEW&quot; |
| DNIS_PERFORMANCE_SUMMARY_VIEW | &quot;DNIS_PERFORMANCE_SUMMARY_VIEW&quot; |
| DNIS_PERFORMANCE_DETAIL_VIEW | &quot;DNIS_PERFORMANCE_DETAIL_VIEW&quot; |
| WRAP_UP_PERFORMANCE_SUMMARY_VIEW | &quot;WRAP_UP_PERFORMANCE_SUMMARY_VIEW&quot; |
| AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW | &quot;AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW&quot; |
| QUEUE_ACTIVITY_SUMMARY_VIEW | &quot;QUEUE_ACTIVITY_SUMMARY_VIEW&quot; |
| QUEUE_ACTIVITY_DETAIL_VIEW | &quot;QUEUE_ACTIVITY_DETAIL_VIEW&quot; |
| AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW | &quot;AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW&quot; |
| QUEUE_AGENT_DETAIL_VIEW | &quot;QUEUE_AGENT_DETAIL_VIEW&quot; |
| QUEUE_INTERACTION_DETAIL_VIEW | &quot;QUEUE_INTERACTION_DETAIL_VIEW&quot; |
| AGENT_SCHEDULE_DETAIL_VIEW | &quot;AGENT_SCHEDULE_DETAIL_VIEW&quot; |
| IVR_PERFORMANCE_SUMMARY_VIEW | &quot;IVR_PERFORMANCE_SUMMARY_VIEW&quot; |
| IVR_PERFORMANCE_DETAIL_VIEW | &quot;IVR_PERFORMANCE_DETAIL_VIEW&quot; |
| ANSWER_INSIGHTS_VIEW | &quot;ANSWER_INSIGHTS_VIEW&quot; |
| HANDLE_INSIGHTS_VIEW | &quot;HANDLE_INSIGHTS_VIEW&quot; |
| TALK_INSIGHTS_VIEW | &quot;TALK_INSIGHTS_VIEW&quot; |
| HOLD_INSIGHTS_VIEW | &quot;HOLD_INSIGHTS_VIEW&quot; |
| ACW_INSIGHTS_VIEW | &quot;ACW_INSIGHTS_VIEW&quot; |
| WAIT_INSIGHTS_VIEW | &quot;WAIT_INSIGHTS_VIEW&quot; |
| AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW | &quot;AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot; |
| FLOW_OUTCOME_SUMMARY_VIEW | &quot;FLOW_OUTCOME_SUMMARY_VIEW&quot; |
| FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW | &quot;FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW&quot; |
| FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW | &quot;FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot; |
| FLOW_DESTINATION_SUMMARY_VIEW | &quot;FLOW_DESTINATION_SUMMARY_VIEW&quot; |
| FLOW_DESTINATION_DETAIL_VIEW | &quot;FLOW_DESTINATION_DETAIL_VIEW&quot; |
| API_USAGE_VIEW | &quot;API_USAGE_VIEW&quot; |
{: class="table table-striped"}



