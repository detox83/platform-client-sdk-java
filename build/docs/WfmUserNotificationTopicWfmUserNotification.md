---
title: WfmUserNotificationTopicWfmUserNotification
---
## WfmUserNotificationTopicWfmUserNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **mutableGroupId** | <!----><!---->**String**<!----> |  |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **shiftTrade** | <!----><!---->[**WfmUserNotificationTopicShiftTradeNotification**](WfmUserNotificationTopicShiftTradeNotification.html)<!----> |  |  [optional] |
| **timeOffRequest** | <!----><!---->[**WfmUserNotificationTopicTimeOffRequestNotification**](WfmUserNotificationTopicTimeOffRequestNotification.html)<!----> |  |  [optional] |
| **agentNotification** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **otherNotificationIdsInGroup** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SHIFTTRADE | &quot;ShiftTrade&quot; |
| TIMEOFFREQUEST | &quot;TimeOffRequest&quot; |
{: class="table table-striped"}



