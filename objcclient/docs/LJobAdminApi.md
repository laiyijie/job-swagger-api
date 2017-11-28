# LJobAdminApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminUserInfoUserIdPut**](LJobAdminApi.md#adminuserinfouseridput) | **PUT** /admin/userInfo/{userId} | 管理员修改用户信息


# **adminUserInfoUserIdPut**
```objc
-(NSURLSessionTask*) adminUserInfoUserIdPutWithUserId: (NSNumber*) userId
    name: (NSString*) name
    headImagePath: (NSString*) headImagePath
    status: (NSString*) status
        completionHandler: (void (^)(NSError* error)) handler;
```

管理员修改用户信息

### Example 
```objc

NSNumber* userId = @56; // 
NSString* name = @"name_example"; //  (optional)
NSString* headImagePath = @"headImagePath_example"; //  (optional)
NSString* status = @"status_example"; //  (optional)

LJobAdminApi*apiInstance = [[LJobAdminApi alloc] init];

// 管理员修改用户信息
[apiInstance adminUserInfoUserIdPutWithUserId:userId
              name:name
              headImagePath:headImagePath
              status:status
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobAdminApi->adminUserInfoUserIdPut: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSNumber***|  | 
 **name** | **NSString***|  | [optional] 
 **headImagePath** | **NSString***|  | [optional] 
 **status** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

