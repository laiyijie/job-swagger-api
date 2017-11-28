# TestApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testInfoGet**](TestApi.md#testInfoGet) | **GET** /test/info | 测试接口


<a name="testInfoGet"></a>
# **testInfoGet**
> TestResponse testInfoGet(word)

测试接口

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.TestApi;


TestApi apiInstance = new TestApi();
String word = "word_example"; // String | 你想说的话
try {
    TestResponse result = apiInstance.testInfoGet(word);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestApi#testInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **word** | **String**| 你想说的话 |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

