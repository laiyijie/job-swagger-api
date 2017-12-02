# ExecutorGroupApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executorGroupsGet**](ExecutorGroupApi.md#executorGroupsGet) | **GET** /executor/groups | 
[**executorGroupsGroupNameDelete**](ExecutorGroupApi.md#executorGroupsGroupNameDelete) | **DELETE** /executor/groups/{groupName} | 删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录
[**executorGroupsGroupNameGet**](ExecutorGroupApi.md#executorGroupsGroupNameGet) | **GET** /executor/groups/{groupName} | 
[**executorGroupsGroupNamePut**](ExecutorGroupApi.md#executorGroupsGroupNamePut) | **PUT** /executor/groups/{groupName} | 只能修改描述
[**executorGroupsPost**](ExecutorGroupApi.md#executorGroupsPost) | **POST** /executor/groups | 添加执行机组


<a name="executorGroupsGet"></a>
# **executorGroupsGet**
> List&lt;ExecutorGroup&gt; executorGroupsGet()



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.ExecutorGroupApi;


ExecutorGroupApi apiInstance = new ExecutorGroupApi();
try {
    List<ExecutorGroup> result = apiInstance.executorGroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutorGroupApi#executorGroupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ExecutorGroup&gt;**](ExecutorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorGroupsGroupNameDelete"></a>
# **executorGroupsGroupNameDelete**
> executorGroupsGroupNameDelete(groupName)

删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.ExecutorGroupApi;


ExecutorGroupApi apiInstance = new ExecutorGroupApi();
String groupName = "groupName_example"; // String | 
try {
    apiInstance.executorGroupsGroupNameDelete(groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutorGroupApi#executorGroupsGroupNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorGroupsGroupNameGet"></a>
# **executorGroupsGroupNameGet**
> ExecutorGroup executorGroupsGroupNameGet(groupName)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.ExecutorGroupApi;


ExecutorGroupApi apiInstance = new ExecutorGroupApi();
String groupName = "groupName_example"; // String | 
try {
    ExecutorGroup result = apiInstance.executorGroupsGroupNameGet(groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutorGroupApi#executorGroupsGroupNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

[**ExecutorGroup**](ExecutorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorGroupsGroupNamePut"></a>
# **executorGroupsGroupNamePut**
> executorGroupsGroupNamePut(groupName, executorGroup)

只能修改描述

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.ExecutorGroupApi;


ExecutorGroupApi apiInstance = new ExecutorGroupApi();
String groupName = "groupName_example"; // String | 
ExecutorGroup executorGroup = new ExecutorGroup(); // ExecutorGroup | 
try {
    apiInstance.executorGroupsGroupNamePut(groupName, executorGroup);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutorGroupApi#executorGroupsGroupNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |
 **executorGroup** | [**ExecutorGroup**](ExecutorGroup.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorGroupsPost"></a>
# **executorGroupsPost**
> String executorGroupsPost(executorGroup)

添加执行机组

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.ExecutorGroupApi;


ExecutorGroupApi apiInstance = new ExecutorGroupApi();
ExecutorGroup executorGroup = new ExecutorGroup(); // ExecutorGroup | 
try {
    String result = apiInstance.executorGroupsPost(executorGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutorGroupApi#executorGroupsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executorGroup** | [**ExecutorGroup**](ExecutorGroup.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

