# LJobJobApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobGroupsGroupIdDelete**](LJobJobApi.md#jobgroupsgroupiddelete) | **DELETE** /job/groups/{groupId} | 删除jobgroup
[**jobGroupsGroupIdGet**](LJobJobApi.md#jobgroupsgroupidget) | **GET** /job/groups/{groupId} | 获取单个执行组的信息
[**jobGroupsGroupIdJobsGet**](LJobJobApi.md#jobgroupsgroupidjobsget) | **GET** /job/groups/{groupId}/jobs | 
[**jobGroupsGroupIdPost**](LJobJobApi.md#jobgroupsgroupidpost) | **POST** /job/groups/{groupId} | 修改jobgroup信息
[**jobsJobIdDelete**](LJobJobApi.md#jobsjobiddelete) | **DELETE** /jobs/{jobId} | 
[**jobsJobIdGet**](LJobJobApi.md#jobsjobidget) | **GET** /jobs/{jobId} | 
[**jobsJobIdPost**](LJobJobApi.md#jobsjobidpost) | **POST** /jobs/{jobId} | 
[**jobsJobIdRunPost**](LJobJobApi.md#jobsjobidrunpost) | **POST** /jobs/{jobId}/run | 
[**jobsPost**](LJobJobApi.md#jobspost) | **POST** /jobs | 
[**workflowsGet**](LJobJobApi.md#workflowsget) | **GET** /workflows | 获取工作流列表
[**workflowsPost**](LJobJobApi.md#workflowspost) | **POST** /workflows | 创建一个工作流
[**workflowsWorkFlowIdDelete**](LJobJobApi.md#workflowsworkflowiddelete) | **DELETE** /workflows/{workFlowId} | 删除这个工作流
[**workflowsWorkFlowIdGet**](LJobJobApi.md#workflowsworkflowidget) | **GET** /workflows/{workFlowId} | 获取单个工作流信息
[**workflowsWorkFlowIdJobGroupsGet**](LJobJobApi.md#workflowsworkflowidjobgroupsget) | **GET** /workflows/{workFlowId}/job/groups | 获取工作流下的所有执行组
[**workflowsWorkFlowIdPost**](LJobJobApi.md#workflowsworkflowidpost) | **POST** /workflows/{workFlowId} | 修改这个工作流信息
[**workflowsWorkFlowIdResumePost**](LJobJobApi.md#workflowsworkflowidresumepost) | **POST** /workflows/{workFlowId}/resume | 从失败处执行这个workflow
[**workflowsWorkFlowIdRunPost**](LJobJobApi.md#workflowsworkflowidrunpost) | **POST** /workflows/{workFlowId}/run | 从头执行这个workflow


# **jobGroupsGroupIdDelete**
```objc
-(NSURLSessionTask*) jobGroupsGroupIdDeleteWithGroupId: (NSNumber*) groupId
        completionHandler: (void (^)(NSError* error)) handler;
```

删除jobgroup

### Example 
```objc

NSNumber* groupId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 删除jobgroup
[apiInstance jobGroupsGroupIdDeleteWithGroupId:groupId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobGroupsGroupIdDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobGroupsGroupIdGet**
```objc
-(NSURLSessionTask*) jobGroupsGroupIdGetWithGroupId: (NSNumber*) groupId
        completionHandler: (void (^)(LJobJobGroup* output, NSError* error)) handler;
```

获取单个执行组的信息

### Example 
```objc

NSNumber* groupId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 获取单个执行组的信息
[apiInstance jobGroupsGroupIdGetWithGroupId:groupId
          completionHandler: ^(LJobJobGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobGroupsGroupIdGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 

### Return type

[**LJobJobGroup***](LJobJobGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobGroupsGroupIdJobsGet**
```objc
-(NSURLSessionTask*) jobGroupsGroupIdJobsGetWithGroupId: (NSNumber*) groupId
        completionHandler: (void (^)(LJobJob* output, NSError* error)) handler;
```



### Example 
```objc

NSNumber* groupId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

[apiInstance jobGroupsGroupIdJobsGetWithGroupId:groupId
          completionHandler: ^(LJobJob* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobGroupsGroupIdJobsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 

### Return type

[**LJobJob***](LJobJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobGroupsGroupIdPost**
```objc
-(NSURLSessionTask*) jobGroupsGroupIdPostWithGroupId: (NSNumber*) groupId
    jobGroup: (LJobJobGroup*) jobGroup
        completionHandler: (void (^)(NSError* error)) handler;
```

修改jobgroup信息

### Example 
```objc

NSNumber* groupId = @56; // 
LJobJobGroup* jobGroup = [[LJobJobGroup alloc] init]; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 修改jobgroup信息
[apiInstance jobGroupsGroupIdPostWithGroupId:groupId
              jobGroup:jobGroup
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobGroupsGroupIdPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **NSNumber***|  | 
 **jobGroup** | [**LJobJobGroup***](LJobJobGroup*.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobsJobIdDelete**
```objc
-(NSURLSessionTask*) jobsJobIdDeleteWithJobId: (NSNumber*) jobId
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSNumber* jobId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

[apiInstance jobsJobIdDeleteWithJobId:jobId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobsJobIdDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **NSNumber***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobsJobIdGet**
```objc
-(NSURLSessionTask*) jobsJobIdGetWithJobId: (NSNumber*) jobId
        completionHandler: (void (^)(LJobJob* output, NSError* error)) handler;
```



### Example 
```objc

NSNumber* jobId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

[apiInstance jobsJobIdGetWithJobId:jobId
          completionHandler: ^(LJobJob* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobsJobIdGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **NSNumber***|  | 

### Return type

[**LJobJob***](LJobJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobsJobIdPost**
```objc
-(NSURLSessionTask*) jobsJobIdPostWithJobId: (NSNumber*) jobId
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSNumber* jobId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

[apiInstance jobsJobIdPostWithJobId:jobId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobsJobIdPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **NSNumber***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobsJobIdRunPost**
```objc
-(NSURLSessionTask*) jobsJobIdRunPostWithJobId: (NSNumber*) jobId
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSNumber* jobId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

[apiInstance jobsJobIdRunPostWithJobId:jobId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobsJobIdRunPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **NSNumber***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jobsPost**
```objc
-(NSURLSessionTask*) jobsPostWithJob: (LJobJob*) job
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

LJobJob* job = [[LJobJob alloc] init]; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

[apiInstance jobsPostWithJob:job
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->jobsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job** | [**LJobJob***](LJobJob*.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsGet**
```objc
-(NSURLSessionTask*) workflowsGetWithCompletionHandler: 
        (void (^)(NSArray<LJobWorkFlow>* output, NSError* error)) handler;
```

获取工作流列表

### Example 
```objc


LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 获取工作流列表
[apiInstance workflowsGetWithCompletionHandler: 
          ^(NSArray<LJobWorkFlow>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<LJobWorkFlow>***](LJobWorkFlow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsPost**
```objc
-(NSURLSessionTask*) workflowsPostWithWorkFlow: (LJobWorkFlow*) workFlow
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

创建一个工作流

### Example 
```objc

LJobWorkFlow* workFlow = [[LJobWorkFlow alloc] init]; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 创建一个工作流
[apiInstance workflowsPostWithWorkFlow:workFlow
          completionHandler: ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlow** | [**LJobWorkFlow***](LJobWorkFlow*.md)|  | 

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsWorkFlowIdDelete**
```objc
-(NSURLSessionTask*) workflowsWorkFlowIdDeleteWithWorkFlowId: (NSNumber*) workFlowId
        completionHandler: (void (^)(NSError* error)) handler;
```

删除这个工作流

### Example 
```objc

NSNumber* workFlowId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 删除这个工作流
[apiInstance workflowsWorkFlowIdDeleteWithWorkFlowId:workFlowId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsWorkFlowIdDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **NSNumber***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsWorkFlowIdGet**
```objc
-(NSURLSessionTask*) workflowsWorkFlowIdGetWithWorkFlowId: (NSNumber*) workFlowId
        completionHandler: (void (^)(LJobWorkFlow* output, NSError* error)) handler;
```

获取单个工作流信息

### Example 
```objc

NSNumber* workFlowId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 获取单个工作流信息
[apiInstance workflowsWorkFlowIdGetWithWorkFlowId:workFlowId
          completionHandler: ^(LJobWorkFlow* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsWorkFlowIdGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **NSNumber***|  | 

### Return type

[**LJobWorkFlow***](LJobWorkFlow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsWorkFlowIdJobGroupsGet**
```objc
-(NSURLSessionTask*) workflowsWorkFlowIdJobGroupsGetWithWorkFlowId: (NSNumber*) workFlowId
        completionHandler: (void (^)(NSArray<LJobJobGroup>* output, NSError* error)) handler;
```

获取工作流下的所有执行组

### Example 
```objc

NSNumber* workFlowId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 获取工作流下的所有执行组
[apiInstance workflowsWorkFlowIdJobGroupsGetWithWorkFlowId:workFlowId
          completionHandler: ^(NSArray<LJobJobGroup>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsWorkFlowIdJobGroupsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **NSNumber***|  | 

### Return type

[**NSArray<LJobJobGroup>***](LJobJobGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsWorkFlowIdPost**
```objc
-(NSURLSessionTask*) workflowsWorkFlowIdPostWithWorkFlowId: (NSNumber*) workFlowId
    workFlow: (LJobWorkFlow*) workFlow
        completionHandler: (void (^)(NSError* error)) handler;
```

修改这个工作流信息

### Example 
```objc

NSNumber* workFlowId = @56; // 
LJobWorkFlow* workFlow = [[LJobWorkFlow alloc] init]; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 修改这个工作流信息
[apiInstance workflowsWorkFlowIdPostWithWorkFlowId:workFlowId
              workFlow:workFlow
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsWorkFlowIdPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **NSNumber***|  | 
 **workFlow** | [**LJobWorkFlow***](LJobWorkFlow*.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsWorkFlowIdResumePost**
```objc
-(NSURLSessionTask*) workflowsWorkFlowIdResumePostWithWorkFlowId: (NSNumber*) workFlowId
        completionHandler: (void (^)(NSError* error)) handler;
```

从失败处执行这个workflow

### Example 
```objc

NSNumber* workFlowId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 从失败处执行这个workflow
[apiInstance workflowsWorkFlowIdResumePostWithWorkFlowId:workFlowId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsWorkFlowIdResumePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **NSNumber***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **workflowsWorkFlowIdRunPost**
```objc
-(NSURLSessionTask*) workflowsWorkFlowIdRunPostWithWorkFlowId: (NSNumber*) workFlowId
        completionHandler: (void (^)(NSError* error)) handler;
```

从头执行这个workflow

### Example 
```objc

NSNumber* workFlowId = @56; // 

LJobJobApi*apiInstance = [[LJobJobApi alloc] init];

// 从头执行这个workflow
[apiInstance workflowsWorkFlowIdRunPostWithWorkFlowId:workFlowId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobJobApi->workflowsWorkFlowIdRunPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **NSNumber***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
