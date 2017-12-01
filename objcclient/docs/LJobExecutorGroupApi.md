# LJobExecutorGroupApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executorGroupsGet**](LJobExecutorGroupApi.md#executorgroupsget) | **GET** /executor/groups | 
[**executorGroupsGroupNameDelete**](LJobExecutorGroupApi.md#executorgroupsgroupnamedelete) | **DELETE** /executor/groups/{groupName} | 删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录
[**executorGroupsGroupNameGet**](LJobExecutorGroupApi.md#executorgroupsgroupnameget) | **GET** /executor/groups/{groupName} | 
[**executorGroupsGroupNamePut**](LJobExecutorGroupApi.md#executorgroupsgroupnameput) | **PUT** /executor/groups/{groupName} | 
[**executorGroupsPost**](LJobExecutorGroupApi.md#executorgroupspost) | **POST** /executor/groups | 添加执行机组，可以不用手动添加，执行机注册会自动注册


# **executorGroupsGet**
```objc
-(NSURLSessionTask*) executorGroupsGetWithCompletionHandler: 
        (void (^)(NSArray<LJobExecutorGroup>* output, NSError* error)) handler;
```



### Example 
```objc


LJobExecutorGroupApi*apiInstance = [[LJobExecutorGroupApi alloc] init];

[apiInstance executorGroupsGetWithCompletionHandler: 
          ^(NSArray<LJobExecutorGroup>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobExecutorGroupApi->executorGroupsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<LJobExecutorGroup>***](LJobExecutorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorGroupsGroupNameDelete**
```objc
-(NSURLSessionTask*) executorGroupsGroupNameDeleteWithGroupName: (NSString*) groupName
        completionHandler: (void (^)(NSError* error)) handler;
```

删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录

### Example 
```objc

NSString* groupName = @"groupName_example"; // 

LJobExecutorGroupApi*apiInstance = [[LJobExecutorGroupApi alloc] init];

// 删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录
[apiInstance executorGroupsGroupNameDeleteWithGroupName:groupName
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobExecutorGroupApi->executorGroupsGroupNameDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorGroupsGroupNameGet**
```objc
-(NSURLSessionTask*) executorGroupsGroupNameGetWithGroupName: (NSString*) groupName
        completionHandler: (void (^)(LJobExecutorGroup* output, NSError* error)) handler;
```



### Example 
```objc

NSString* groupName = @"groupName_example"; // 

LJobExecutorGroupApi*apiInstance = [[LJobExecutorGroupApi alloc] init];

[apiInstance executorGroupsGroupNameGetWithGroupName:groupName
          completionHandler: ^(LJobExecutorGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobExecutorGroupApi->executorGroupsGroupNameGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **NSString***|  | 

### Return type

[**LJobExecutorGroup***](LJobExecutorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorGroupsGroupNamePut**
```objc
-(NSURLSessionTask*) executorGroupsGroupNamePutWithGroupName: (NSString*) groupName
    name: (LJobExecutorGroup*) name
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* groupName = @"groupName_example"; // 
LJobExecutorGroup* name = [[LJobExecutorGroup alloc] init]; // 

LJobExecutorGroupApi*apiInstance = [[LJobExecutorGroupApi alloc] init];

[apiInstance executorGroupsGroupNamePutWithGroupName:groupName
              name:name
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobExecutorGroupApi->executorGroupsGroupNamePut: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **NSString***|  | 
 **name** | [**LJobExecutorGroup***](LJobExecutorGroup*.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorGroupsPost**
```objc
-(NSURLSessionTask*) executorGroupsPostWithExecutorGroup: (LJobExecutorGroup*) executorGroup
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

添加执行机组，可以不用手动添加，执行机注册会自动注册

### Example 
```objc

LJobExecutorGroup* executorGroup = [[LJobExecutorGroup alloc] init]; // 

LJobExecutorGroupApi*apiInstance = [[LJobExecutorGroupApi alloc] init];

// 添加执行机组，可以不用手动添加，执行机注册会自动注册
[apiInstance executorGroupsPostWithExecutorGroup:executorGroup
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobExecutorGroupApi->executorGroupsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executorGroup** | [**LJobExecutorGroup***](LJobExecutorGroup*.md)|  | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

