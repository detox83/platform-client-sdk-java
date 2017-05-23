---
title: EventMessage
---
## EventMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | [**CodeEnum**](#CodeEnum) |  |  [optional] |
| **message** | **String** |  |  [optional] |
| **messageWithParams** | **String** |  |  [optional] |
| **messageParams** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **documentationUri** | **String** |  |  [optional] |
| **resourceURIs** | **List&lt;String&gt;** |  |  [optional] |
{: class="table table-striped"}


<a name="CodeEnum"></a>

## Enum: CodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CAMPAIGN_START_ERROR | &quot;CAMPAIGN_START_ERROR&quot; |
| CAMPAIGN_RULE_START_ERROR | &quot;CAMPAIGN_RULE_START_ERROR&quot; |
| CAMPAIGN_SET_DIALING_MODE_ERROR | &quot;CAMPAIGN_SET_DIALING_MODE_ERROR&quot; |
| INVALID_CALLABLE_TIME_ZONE | &quot;INVALID_CALLABLE_TIME_ZONE&quot; |
| CALLBACK_CREATION_INVALID_NUMBER | &quot;CALLBACK_CREATION_INVALID_NUMBER&quot; |
| CALL_RULE_INVALID_CONTACT_COLUMN | &quot;CALL_RULE_INVALID_CONTACT_COLUMN&quot; |
| CALL_RULE_MISMATCH_TYPE | &quot;CALL_RULE_MISMATCH_TYPE&quot; |
| CALL_RULE_INVALID_OPERATOR | &quot;CALL_RULE_INVALID_OPERATOR&quot; |
| CALL_RULE_NO_DNC_LISTS_CONFIGURED | &quot;CALL_RULE_NO_DNC_LISTS_CONFIGURED&quot; |
| CONTACT_LIST_FILTER_EVALUATION_FAILED | &quot;CONTACT_LIST_FILTER_EVALUATION_FAILED&quot; |
| INVALID_PHONE_NUMBER | &quot;INVALID_PHONE_NUMBER&quot; |
| IMPORT_FAILED_TO_READ_HEADERS | &quot;IMPORT_FAILED_TO_READ_HEADERS&quot; |
| IMPORT_COULD_NOT_PARSE_AN_ENTRY | &quot;IMPORT_COULD_NOT_PARSE_AN_ENTRY&quot; |
| IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT | &quot;IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT&quot; |
| IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS | &quot;IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS&quot; |
| IMPORT_INVALID_CUSTOM_ID | &quot;IMPORT_INVALID_CUSTOM_ID&quot; |
| IMPORT_INVALID_DATA | &quot;IMPORT_INVALID_DATA&quot; |
| IMPORT_NO_COLUMNS_DEFINED | &quot;IMPORT_NO_COLUMNS_DEFINED&quot; |
| IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST | &quot;IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST&quot; |
| IMPORT_LIST_NO_LONGER_EXISTS | &quot;IMPORT_LIST_NO_LONGER_EXISTS&quot; |
| RECYCLE_CAMPAIGN | &quot;RECYCLE_CAMPAIGN&quot; |
{: class="table table-striped"}

