# DefaultApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executorgroupGroupIdExecutorDelete**](DefaultApi.md#executorgroupGroupIdExecutorDelete) | **DELETE** /executorgroup/{groupId}/executor | 
[**executorgroupGroupIdExecutorPost**](DefaultApi.md#executorgroupGroupIdExecutorPost) | **POST** /executorgroup/{groupId}/executor | 
[**executorgroupGroupIdGet**](DefaultApi.md#executorgroupGroupIdGet) | **GET** /executorgroup/{groupId} | 
[**executorgroupGroupIdPut**](DefaultApi.md#executorgroupGroupIdPut) | **PUT** /executorgroup/{groupId} | 
[**executorgroupsGet**](DefaultApi.md#executorgroupsGet) | **GET** /executorgroups | 
[**executorgroupsPost**](DefaultApi.md#executorgroupsPost) | **POST** /executorgroups | 


<a name="executorgroupGroupIdExecutorDelete"></a>
# **executorgroupGroupIdExecutorDelete**
> executorgroupGroupIdExecutorDelete(groupId, executorId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer groupId = 56; // Integer | 
Integer executorId = 56; // Integer | executorId
try {
    apiInstance.executorgroupGroupIdExecutorDelete(groupId, executorId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#executorgroupGroupIdExecutorDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |
 **executorId** | **Integer**| executorId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorgroupGroupIdExecutorPost"></a>
# **executorgroupGroupIdExecutorPost**
> executorgroupGroupIdExecutorPost(groupId, executorId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer groupId = 56; // Integer | 
Integer executorId = 56; // Integer | executorId
try {
    apiInstance.executorgroupGroupIdExecutorPost(groupId, executorId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#executorgroupGroupIdExecutorPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |
 **executorId** | **Integer**| executorId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorgroupGroupIdGet"></a>
# **executorgroupGroupIdGet**
> ExecutorGroup executorgroupGroupIdGet(groupId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer groupId = 56; // Integer | 
try {
    ExecutorGroup result = apiInstance.executorgroupGroupIdGet(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#executorgroupGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |

### Return type

[**ExecutorGroup**](ExecutorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorgroupGroupIdPut"></a>
# **executorgroupGroupIdPut**
> executorgroupGroupIdPut(groupId, name, description)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer groupId = 56; // Integer | 
String name = "name_example"; // String | 
String description = "description_example"; // String | 
try {
    apiInstance.executorgroupGroupIdPut(groupId, name, description);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#executorgroupGroupIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |
 **name** | **String**|  | [optional]
 **description** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="executorgroupsGet"></a>
# **executorgroupsGet**
> List&lt;ExecutorGroup&gt; executorgroupsGet()



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<ExecutorGroup> result = apiInstance.executorgroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#executorgroupsGet");
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

<a name="executorgroupsPost"></a>
# **executorgroupsPost**
> Integer executorgroupsPost()



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Integer result = apiInstance.executorgroupsPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#executorgroupsPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

