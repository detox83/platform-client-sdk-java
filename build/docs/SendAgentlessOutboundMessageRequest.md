---
title: SendAgentlessOutboundMessageRequest
---
## SendAgentlessOutboundMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fromAddress** | <!----><!---->**String**<!----> | The messaging address of the sender of the message. For an SMS messenger type, this must be a currently provisioned sms phone number. |  |
| **toAddress** | <!----><!---->**String**<!----> | The messaging address of the recipient of the message. For an SMS messenger type, the phone number address must be in E.164 format. E.g. +13175555555 or +34234234234 |  |
| **toAddressMessengerType** | [**ToAddressMessengerTypeEnum**](#ToAddressMessengerTypeEnum)<!----> | The recipient messaging address messenger type. |  |
| **textBody** | <!----><!---->**String**<!----> | The text of the message to send |  |
{: class="table table-striped"}


<a name="ToAddressMessengerTypeEnum"></a>

## Enum: ToAddressMessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;sms&quot; |
| FACEBOOK | &quot;facebook&quot; |
| TWITTER | &quot;twitter&quot; |
| LINE | &quot;line&quot; |
| WHATSAPP | &quot;whatsapp&quot; |
{: class="table table-striped"}



