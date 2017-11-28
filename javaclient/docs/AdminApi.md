# AdminApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminUserInfoUserIdPut**](AdminApi.md#adminUserInfoUserIdPut) | **PUT** /admin/userInfo/{userId} | 管理员修改用户信息


<a name="adminUserInfoUserIdPut"></a>
# **adminUserInfoUserIdPut**
> adminUserInfoUserIdPut(userId, name, headImagePath, status)

管理员修改用户信息

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.AdminApi;


AdminApi apiInstance = new AdminApi();
Integer userId = 56; // Integer | 
String name = "name_example"; // String | 
String headImagePath = "headImagePath_example"; // String | 
String status = "status_example"; // String | 
try {
    apiInstance.adminUserInfoUserIdPut(userId, name, headImagePath, status);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminUserInfoUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **name** | **String**|  | [optional]
 **headImagePath** | **String**|  | [optional]
 **status** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain; charset=utf-8

