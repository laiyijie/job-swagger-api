# LJobDefaultApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executorgroupGroupIdExecutorDelete**](LJobDefaultApi.md#executorgroupgroupidexecutordelete) | **DELETE** /executorgroup/{groupId}/executor | 
[**executorgroupGroupIdExecutorPost**](LJobDefaultApi.md#executorgroupgroupidexecutorpost) | **POST** /executorgroup/{groupId}/executor | 
[**executorgroupGroupIdGet**](LJobDefaultApi.md#executorgroupgroupidget) | **GET** /executorgroup/{groupId} | 
[**executorgroupGroupIdPut**](LJobDefaultApi.md#executorgroupgroupidput) | **PUT** /executorgroup/{groupId} | 
[**executorgroupsGet**](LJobDefaultApi.md#executorgroupsget) | **GET** /executorgroups | 
[**executorgroupsPost**](LJobDefaultApi.md#executorgroupspost) | **POST** /executorgroups | 


# **executorgroupGroupIdExecutorDelete**
```objc
-(NSURLSessionTask*) executorgroupGroupIdExecutorDeleteWithGroupId: (NSNumber*) groupId
    executorId: (NSNumber*) executorId
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSNumber* groupId = @56; // 
NSNumber* executorId = @56; // executorId

LJobDefaultApi*apiInstance = [[LJobDefaultApi alloc] init];

[apiInstance executorgroupGroupIdExecutorDeleteWithGroupId:groupId
              executorId:executorId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobDefaultApi->executorgroupGroupIdExecutorDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 
 **executorId** | **NSNumber***| executorId | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorgroupGroupIdExecutorPost**
```objc
-(NSURLSessionTask*) executorgroupGroupIdExecutorPostWithGroupId: (NSNumber*) groupId
    executorId: (NSNumber*) executorId
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSNumber* groupId = @56; // 
NSNumber* executorId = @56; // executorId

LJobDefaultApi*apiInstance = [[LJobDefaultApi alloc] init];

[apiInstance executorgroupGroupIdExecutorPostWithGroupId:groupId
              executorId:executorId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobDefaultApi->executorgroupGroupIdExecutorPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 
 **executorId** | **NSNumber***| executorId | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorgroupGroupIdGet**
```objc
-(NSURLSessionTask*) executorgroupGroupIdGetWithGroupId: (NSNumber*) groupId
        completionHandler: (void (^)(LJobExecutorGroup* output, NSError* error)) handler;
```



### Example 
```objc

NSNumber* groupId = @56; // 

LJobDefaultApi*apiInstance = [[LJobDefaultApi alloc] init];

[apiInstance executorgroupGroupIdGetWithGroupId:groupId
          completionHandler: ^(LJobExecutorGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobDefaultApi->executorgroupGroupIdGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 

### Return type

[**LJobExecutorGroup***](LJobExecutorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorgroupGroupIdPut**
```objc
-(NSURLSessionTask*) executorgroupGroupIdPutWithGroupId: (NSNumber*) groupId
    name: (NSString*) name
    _description: (NSString*) _description
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSNumber* groupId = @56; // 
NSString* name = @"name_example"; //  (optional)
NSString* _description = @"_description_example"; //  (optional)

LJobDefaultApi*apiInstance = [[LJobDefaultApi alloc] init];

[apiInstance executorgroupGroupIdPutWithGroupId:groupId
              name:name
              _description:_description
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobDefaultApi->executorgroupGroupIdPut: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 
 **name** | **NSString***|  | [optional] 
 **_description** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executorgroupsGet**
```objc
-(NSURLSessionTask*) executorgroupsGetWithCompletionHandler: 
        (void (^)(NSArray<LJobExecutorGroup>* output, NSError* error)) handler;
```



### Example 
```objc


LJobDefaultApi*apiInstance = [[LJobDefaultApi alloc] init];

[apiInstance executorgroupsGetWithCompletionHandler: 
          ^(NSArray<LJobExecutorGroup>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobDefaultApi->executorgroupsGet: %@", error);
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

# **executorgroupsPost**
```objc
-(NSURLSessionTask*) executorgroupsPostWithCompletionHandler: 
        (void (^)(NSNumber* output, NSError* error)) handler;
```



### Example 
```objc


LJobDefaultApi*apiInstance = [[LJobDefaultApi alloc] init];

[apiInstance executorgroupsPostWithCompletionHandler: 
          ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobDefaultApi->executorgroupsPost: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

