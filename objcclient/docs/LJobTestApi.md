# LJobTestApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testInfoGet**](LJobTestApi.md#testinfoget) | **GET** /test/info | 测试接口


# **testInfoGet**
```objc
-(NSURLSessionTask*) testInfoGetWithWord: (NSString*) word
        completionHandler: (void (^)(LJobTestResponse* output, NSError* error)) handler;
```

测试接口

### Example 
```objc

NSString* word = @"word_example"; // 你想说的话

LJobTestApi*apiInstance = [[LJobTestApi alloc] init];

// 测试接口
[apiInstance testInfoGetWithWord:word
          completionHandler: ^(LJobTestResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobTestApi->testInfoGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **word** | **NSString***| 你想说的话 | 

### Return type

[**LJobTestResponse***](LJobTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

