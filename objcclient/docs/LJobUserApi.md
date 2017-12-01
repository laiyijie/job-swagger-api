# LJobUserApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userLoginPost**](LJobUserApi.md#userloginpost) | **POST** /user/login | 


# **userLoginPost**
```objc
-(NSURLSessionTask*) userLoginPostWithUsername: (NSString*) username
    password: (NSString*) password
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* username = @"username_example"; // 
NSString* password = @"password_example"; // 

LJobUserApi*apiInstance = [[LJobUserApi alloc] init];

[apiInstance userLoginPostWithUsername:username
              password:password
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobUserApi->userLoginPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **NSString***|  | 
 **password** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

