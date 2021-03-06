---
title: SendAgentlessOutboundMessageResponse
---
## SendAgentlessOutboundMessageResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | The identifier of the conversation. |  [optional] |
| **fromAddress** | <!----><!---->**String**<!----> | The sender of the text message. |  [optional] |
| **toAddress** | <!----><!---->**String**<!----> | The recipient of the text message. |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#MessengerTypeEnum)<!----> | Type of text messenger. |  [optional] |
| **textBody** | <!----><!---->**String**<!----> | The body of the text message. |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **user** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Details of the user created the job |  [optional] |
{: class="table table-striped"}


<a name="MessengerTypeEnum"></a>

## Enum: MessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;sms&quot; |
| FACEBOOK | &quot;facebook&quot; |
| TWITTER | &quot;twitter&quot; |
| LINE | &quot;line&quot; |
| WHATSAPP | &quot;whatsapp&quot; |
{: class="table table-striped"}



