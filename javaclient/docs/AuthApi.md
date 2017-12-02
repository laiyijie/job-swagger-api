# AuthApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authLoginPost**](AuthApi.md#authLoginPost) | **POST** /auth/login | 


<a name="authLoginPost"></a>
# **authLoginPost**
> authLoginPost(username, password)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    apiInstance.authLoginPost(username, password);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **password** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain; charset=utf-8

