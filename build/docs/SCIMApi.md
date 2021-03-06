---
title: SCIMApi
---
## SCIMApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteScimGroup**](SCIMApi.html#deleteScimGroup) | Delete a group. |
| [**deleteScimUser**](SCIMApi.html#deleteScimUser) | Delete a user |
| [**deleteScimV2Group**](SCIMApi.html#deleteScimV2Group) | Delete a group. |
| [**deleteScimV2User**](SCIMApi.html#deleteScimV2User) | Delete a user |
| [**getScimGroup**](SCIMApi.html#getScimGroup) | Get a group |
| [**getScimGroups**](SCIMApi.html#getScimGroups) | Get a list of groups |
| [**getScimResourcetype**](SCIMApi.html#getScimResourcetype) | Get a resource type |
| [**getScimResourcetypes**](SCIMApi.html#getScimResourcetypes) | Get a list of resource types |
| [**getScimServiceproviderconfig**](SCIMApi.html#getScimServiceproviderconfig) | Get a service provider&#39;s configuration |
| [**getScimUser**](SCIMApi.html#getScimUser) | Get a user |
| [**getScimUsers**](SCIMApi.html#getScimUsers) | Get a list of users |
| [**getScimV2Group**](SCIMApi.html#getScimV2Group) | Get a group |
| [**getScimV2Groups**](SCIMApi.html#getScimV2Groups) | Get a list of groups |
| [**getScimV2Resourcetype**](SCIMApi.html#getScimV2Resourcetype) | Get a resource type |
| [**getScimV2Resourcetypes**](SCIMApi.html#getScimV2Resourcetypes) | Get a list of resource types |
| [**getScimV2Serviceproviderconfig**](SCIMApi.html#getScimV2Serviceproviderconfig) | Get a service provider&#39;s configuration |
| [**getScimV2User**](SCIMApi.html#getScimV2User) | Get a user |
| [**getScimV2Users**](SCIMApi.html#getScimV2Users) | Get a list of users |
| [**patchScimGroup**](SCIMApi.html#patchScimGroup) | Modify a group |
| [**patchScimUser**](SCIMApi.html#patchScimUser) | Modify a user |
| [**patchScimV2Group**](SCIMApi.html#patchScimV2Group) | Modify a group |
| [**patchScimV2User**](SCIMApi.html#patchScimV2User) | Modify a user |
| [**postScimGroups**](SCIMApi.html#postScimGroups) | The information used to create a group. |
| [**postScimUsers**](SCIMApi.html#postScimUsers) | Create a user |
| [**postScimV2Groups**](SCIMApi.html#postScimV2Groups) | The information used to create a group. |
| [**postScimV2Users**](SCIMApi.html#postScimV2Users) | Create a user |
| [**putScimGroup**](SCIMApi.html#putScimGroup) | Replace a group |
| [**putScimUser**](SCIMApi.html#putScimUser) | Replace a user |
| [**putScimV2Group**](SCIMApi.html#putScimV2Group) | Replace a group |
| [**putScimV2User**](SCIMApi.html#putScimV2User) | Replace a user |
{: class="table-striped"}

<a name="deleteScimGroup"></a>

# **deleteScimGroup**



> Void deleteScimGroup(groupId, ifMatch)

Delete a group.



Wraps DELETE /api/v2/scim/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    apiInstance.deleteScimGroup(groupId, ifMatch);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#deleteScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteScimUser"></a>

# **deleteScimUser**



> [Empty](Empty.html) deleteScimUser(userId, ifMatch)

Delete a user



Wraps DELETE /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    Empty result = apiInstance.deleteScimUser(userId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#deleteScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**Empty**](Empty.html)

<a name="deleteScimV2Group"></a>

# **deleteScimV2Group**



> Void deleteScimV2Group(groupId, ifMatch)

Delete a group.



Wraps DELETE /api/v2/scim/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    apiInstance.deleteScimV2Group(groupId, ifMatch);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#deleteScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteScimV2User"></a>

# **deleteScimV2User**



> [Empty](Empty.html) deleteScimV2User(userId, ifMatch)

Delete a user



Wraps DELETE /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    Empty result = apiInstance.deleteScimV2User(userId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#deleteScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**Empty**](Empty.html)

<a name="getScimGroup"></a>

# **getScimGroup**



> [ScimV2Group](ScimV2Group.html) getScimGroup(groupId, ifNoneMatch)

Get a group



Wraps GET /api/v2/scim/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/groups.
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.
try {
    ScimV2Group result = apiInstance.getScimGroup(groupId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/groups. | 
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="getScimGroups"></a>

# **getScimGroups**



> [ScimGroupListResponse](ScimGroupListResponse.html) getScimGroups(startIndex, count, filter)

Get a list of groups



Wraps GET /api/v2/scim/groups  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\".
String filter = "displayName eq groupName"; // String | Filters results.
try {
    ScimGroupListResponse result = apiInstance.getScimGroups(startIndex, count, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. | [optional] [default to 25] 
| **filter** | **String**| Filters results. | [optional] 
{: class="table-striped"}


### Return type

[**ScimGroupListResponse**](ScimGroupListResponse.html)

<a name="getScimResourcetype"></a>

# **getScimResourcetype**



> [ScimConfigResourceType](ScimConfigResourceType.html) getScimResourcetype(resourceType)

Get a resource type



Wraps GET /api/v2/scim/resourcetypes/{resourceType}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SCIMApi;


SCIMApi apiInstance = new SCIMApi();
String resourceType = "resourceType_example"; // String | The type of resource. Returned with GET /api/v2/scim/resourcetypes.
try {
    ScimConfigResourceType result = apiInstance.getScimResourcetype(resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimResourcetype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resourceType** | **String**| The type of resource. Returned with GET /api/v2/scim/resourcetypes. |<br />**Values**: User, Group, ServiceProviderConfig, ResourceType 
{: class="table-striped"}


### Return type

[**ScimConfigResourceType**](ScimConfigResourceType.html)

<a name="getScimResourcetypes"></a>

# **getScimResourcetypes**



> [ScimConfigResourceTypesListResponse](ScimConfigResourceTypesListResponse.html) getScimResourcetypes()

Get a list of resource types



Wraps GET /api/v2/scim/resourcetypes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SCIMApi;


SCIMApi apiInstance = new SCIMApi();
try {
    ScimConfigResourceTypesListResponse result = apiInstance.getScimResourcetypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimResourcetypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ScimConfigResourceTypesListResponse**](ScimConfigResourceTypesListResponse.html)

<a name="getScimServiceproviderconfig"></a>

# **getScimServiceproviderconfig**



> [ScimServiceProviderConfig](ScimServiceProviderConfig.html) getScimServiceproviderconfig(ifNoneMatch)

Get a service provider&#39;s configuration



Wraps GET /api/v2/scim/serviceproviderconfig  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SCIMApi;


SCIMApi apiInstance = new SCIMApi();
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/serviceproviderconfig. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. 
try {
    ScimServiceProviderConfig result = apiInstance.getScimServiceproviderconfig(ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimServiceproviderconfig");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  | [optional] 
{: class="table-striped"}


### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.html)

<a name="getScimUser"></a>

# **getScimUser**



> [ScimV2User](ScimV2User.html) getScimUser(userId, attributes, excludedAttributes, ifNoneMatch)

Get a user



Wraps GET /api/v2/scim/users/{userId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
List<String> attributes = Arrays.asList("attributes_example"); // List<String> | Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList("excludedAttributes_example"); // List<String> | Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \"excludedAttributes\". Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String ifNoneMatch = "ifNoneMatch_example"; // String | TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.
try {
    ScimV2User result = apiInstance.getScimUser(userId, attributes, excludedAttributes, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **ifNoneMatch** | **String**| TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="getScimUsers"></a>

# **getScimUsers**



> [ScimUserListResponse](ScimUserListResponse.html) getScimUsers(startIndex, count, attributes, excludedAttributes, filter)

Get a list of users

To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.

Wraps GET /api/v2/scim/users  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\".
List<String> attributes = Arrays.asList("attributes_example"); // List<String> | Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList("excludedAttributes_example"); // List<String> | Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \"excludedAttributes\". Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String filter = "filter_example"; // String | Filters results. If nothing is specified, returns all active users. Examples of valid values: \"id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\", \"userName eq search@sample.org\", \"manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\", \"email eq search@sample.org\", \"division eq divisionName\", \"externalId eq 167844\", \"active eq false\".
try {
    ScimUserListResponse result = apiInstance.getScimUsers(startIndex, count, attributes, excludedAttributes, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. | [optional] [default to 25] 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **filter** | **String**| Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimUserListResponse**](ScimUserListResponse.html)

<a name="getScimV2Group"></a>

# **getScimV2Group**



> [ScimV2Group](ScimV2Group.html) getScimV2Group(groupId, ifNoneMatch)

Get a group



Wraps GET /api/v2/scim/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
String ifNoneMatch = "ifNoneMatch_example"; // String | TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. 
try {
    ScimV2Group result = apiInstance.getScimV2Group(groupId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **ifNoneMatch** | **String**| TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="getScimV2Groups"></a>

# **getScimV2Groups**



> [ScimGroupListResponse](ScimGroupListResponse.html) getScimV2Groups(filter, startIndex, count)

Get a list of groups



Wraps GET /api/v2/scim/v2/groups  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String filter = "displayName eq groupName"; // String | Filters results.
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\".
try {
    ScimGroupListResponse result = apiInstance.getScimV2Groups(filter, startIndex, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Groups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **String**| Filters results. | 
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**ScimGroupListResponse**](ScimGroupListResponse.html)

<a name="getScimV2Resourcetype"></a>

# **getScimV2Resourcetype**



> [ScimConfigResourceType](ScimConfigResourceType.html) getScimV2Resourcetype(resourceType)

Get a resource type



Wraps GET /api/v2/scim/v2/resourcetypes/{resourceType}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SCIMApi;


SCIMApi apiInstance = new SCIMApi();
String resourceType = "resourceType_example"; // String | The type of resource. Returned with GET /api/v2/scim/v2/resourcetypes.
try {
    ScimConfigResourceType result = apiInstance.getScimV2Resourcetype(resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Resourcetype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resourceType** | **String**| The type of resource. Returned with GET /api/v2/scim/v2/resourcetypes. |<br />**Values**: User, Group, ServiceProviderConfig, ResourceType 
{: class="table-striped"}


### Return type

[**ScimConfigResourceType**](ScimConfigResourceType.html)

<a name="getScimV2Resourcetypes"></a>

# **getScimV2Resourcetypes**



> [ScimConfigResourceTypesListResponse](ScimConfigResourceTypesListResponse.html) getScimV2Resourcetypes()

Get a list of resource types



Wraps GET /api/v2/scim/v2/resourcetypes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SCIMApi;


SCIMApi apiInstance = new SCIMApi();
try {
    ScimConfigResourceTypesListResponse result = apiInstance.getScimV2Resourcetypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Resourcetypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ScimConfigResourceTypesListResponse**](ScimConfigResourceTypesListResponse.html)

<a name="getScimV2Serviceproviderconfig"></a>

# **getScimV2Serviceproviderconfig**



> [ScimServiceProviderConfig](ScimServiceProviderConfig.html) getScimV2Serviceproviderconfig(ifNoneMatch)

Get a service provider&#39;s configuration



Wraps GET /api/v2/scim/v2/serviceproviderconfig  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SCIMApi;


SCIMApi apiInstance = new SCIMApi();
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/serviceproviderconfig. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. 
try {
    ScimServiceProviderConfig result = apiInstance.getScimV2Serviceproviderconfig(ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Serviceproviderconfig");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  | [optional] 
{: class="table-striped"}


### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.html)

<a name="getScimV2User"></a>

# **getScimV2User**



> [ScimV2User](ScimV2User.html) getScimV2User(userId, attributes, excludedAttributes, ifNoneMatch)

Get a user



Wraps GET /api/v2/scim/v2/users/{userId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
List<String> attributes = Arrays.asList("attributes_example"); // List<String> | Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList("excludedAttributes_example"); // List<String> | Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \"excludedAttributes\". Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.
try {
    ScimV2User result = apiInstance.getScimV2User(userId, attributes, excludedAttributes, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="getScimV2Users"></a>

# **getScimV2Users**



> [ScimUserListResponse](ScimUserListResponse.html) getScimV2Users(startIndex, count, attributes, excludedAttributes, filter)

Get a list of users

To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.

Wraps GET /api/v2/scim/v2/users  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\".
List<String> attributes = Arrays.asList("attributes_example"); // List<String> | Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList("excludedAttributes_example"); // List<String> | Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \"excludedAttributes\". Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String filter = "filter_example"; // String | Filters results. If nothing is specified, returns all active users. Examples of valid values: \"id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\", \"userName eq search@sample.org\", \"manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\", \"email eq search@sample.org\", \"division eq divisionName\", \"externalId eq 167844\", \"active eq false\".
try {
    ScimUserListResponse result = apiInstance.getScimV2Users(startIndex, count, attributes, excludedAttributes, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Users");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. | [optional] [default to 25] 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the default attributes (externalId, enterprise-user:manager, roles). Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes (externalId, enterprise-user:manager, roles) minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, photos, groups, rolesurn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:photos, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value 
| **filter** | **String**| Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimUserListResponse**](ScimUserListResponse.html)

<a name="patchScimGroup"></a>

# **patchScimGroup**



> [ScimV2Group](ScimV2Group.html) patchScimGroup(groupId, body, ifMatch)

Modify a group



Wraps PATCH /api/v2/scim/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/groups.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2Group result = apiInstance.patchScimGroup(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/groups. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="patchScimUser"></a>

# **patchScimUser**



> [ScimV2User](ScimV2User.html) patchScimUser(userId, body, ifMatch)

Modify a user



Wraps PATCH /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2User result = apiInstance.patchScimUser(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="patchScimV2Group"></a>

# **patchScimV2Group**



> [ScimV2Group](ScimV2Group.html) patchScimV2Group(groupId, body, ifMatch)

Modify a group



Wraps PATCH /api/v2/scim/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2Group result = apiInstance.patchScimV2Group(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="patchScimV2User"></a>

# **patchScimV2User**



> [ScimV2User](ScimV2User.html) patchScimV2User(userId, body, ifMatch)

Modify a user



Wraps PATCH /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2User result = apiInstance.patchScimV2User(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="postScimGroups"></a>

# **postScimGroups**



> [ScimV2Group](ScimV2Group.html) postScimGroups(body)

The information used to create a group.

PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.

Wraps POST /api/v2/scim/groups  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
ScimV2Group body = new ScimV2Group(); // ScimV2Group | The information used to create a group.
try {
    ScimV2Group result = apiInstance.postScimGroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#postScimGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScimV2Group**](ScimV2Group.html)| The information used to create a group. | 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="postScimUsers"></a>

# **postScimUsers**



> [ScimV2User](ScimV2User.html) postScimUsers(body)

Create a user



Wraps POST /api/v2/scim/users  

Requires ANY permissions: 

* directory:user:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
ScimV2CreateUser body = new ScimV2CreateUser(); // ScimV2CreateUser | The information used to create a user.
try {
    ScimV2User result = apiInstance.postScimUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#postScimUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScimV2CreateUser**](ScimV2CreateUser.html)| The information used to create a user. | 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="postScimV2Groups"></a>

# **postScimV2Groups**



> [ScimV2Group](ScimV2Group.html) postScimV2Groups(body)

The information used to create a group.

PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.

Wraps POST /api/v2/scim/v2/groups  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
ScimV2Group body = new ScimV2Group(); // ScimV2Group | The information used to create a group.
try {
    ScimV2Group result = apiInstance.postScimV2Groups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#postScimV2Groups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScimV2Group**](ScimV2Group.html)| The information used to create a group. | 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="postScimV2Users"></a>

# **postScimV2Users**



> [ScimV2User](ScimV2User.html) postScimV2Users(body)

Create a user



Wraps POST /api/v2/scim/v2/users  

Requires ANY permissions: 

* directory:user:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
ScimV2CreateUser body = new ScimV2CreateUser(); // ScimV2CreateUser | The information used to create a user.
try {
    ScimV2User result = apiInstance.postScimV2Users(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#postScimV2Users");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScimV2CreateUser**](ScimV2CreateUser.html)| The information used to create a user. | 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="putScimGroup"></a>

# **putScimGroup**



> [ScimV2Group](ScimV2Group.html) putScimGroup(groupId, body, ifMatch)

Replace a group



Wraps PUT /api/v2/scim/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/groups.
ScimV2Group body = new ScimV2Group(); // ScimV2Group | The information used to replace a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2Group result = apiInstance.putScimGroup(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/groups. | 
| **body** | [**ScimV2Group**](ScimV2Group.html)| The information used to replace a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="putScimUser"></a>

# **putScimUser**



> [ScimV2User](ScimV2User.html) putScimUser(userId, body, ifMatch)

Replace a user



Wraps PUT /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
ScimV2User body = new ScimV2User(); // ScimV2User | The information used to replace a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2User result = apiInstance.putScimUser(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **body** | [**ScimV2User**](ScimV2User.html)| The information used to replace a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="putScimV2Group"></a>

# **putScimV2Group**



> [ScimV2Group](ScimV2Group.html) putScimV2Group(groupId, body, ifMatch)

Replace a group



Wraps PUT /api/v2/scim/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
ScimV2Group body = new ScimV2Group(); // ScimV2Group | The information used to replace a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2Group result = apiInstance.putScimV2Group(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **body** | [**ScimV2Group**](ScimV2Group.html)| The information used to replace a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="putScimV2User"></a>

# **putScimV2User**



> [ScimV2User](ScimV2User.html) putScimV2User(userId, body, ifMatch)

Replace a user



Wraps PUT /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
ScimV2User body = new ScimV2User(); // ScimV2User | The information used to replace a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
try {
    ScimV2User result = apiInstance.putScimV2User(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **body** | [**ScimV2User**](ScimV2User.html)| The information used to replace a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

