# UserApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userLoginPost**](UserApi.md#userLoginPost) | **POST** /user/login | 


<a name="userLoginPost"></a>
# **userLoginPost**
> userLoginPost(username, password)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    apiInstance.userLoginPost(username, password);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userLoginPost");
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

