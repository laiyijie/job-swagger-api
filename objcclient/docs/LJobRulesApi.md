# LJobRulesApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rulesGet**](LJobRulesApi.md#rulesget) | **GET** /rules | 
[**rulesPost**](LJobRulesApi.md#rulespost) | **POST** /rules | 添加规则
[**rulesRuleIdDelete**](LJobRulesApi.md#rulesruleiddelete) | **DELETE** /rules/{ruleId} | 删除规则
[**rulesRuleIdPut**](LJobRulesApi.md#rulesruleidput) | **PUT** /rules/{ruleId} | 修改规则


# **rulesGet**
```objc
-(NSURLSessionTask*) rulesGetWithCompletionHandler: 
        (void (^)(NSArray<LJobRule>* output, NSError* error)) handler;
```



### Example 
```objc


LJobRulesApi*apiInstance = [[LJobRulesApi alloc] init];

[apiInstance rulesGetWithCompletionHandler: 
          ^(NSArray<LJobRule>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling LJobRulesApi->rulesGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<LJobRule>***](LJobRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rulesPost**
```objc
-(NSURLSessionTask*) rulesPostWithRule: (LJobRule*) rule
        completionHandler: (void (^)(NSError* error)) handler;
```

添加规则

### Example 
```objc

LJobRule* rule = [[LJobRule alloc] init]; // 

LJobRulesApi*apiInstance = [[LJobRulesApi alloc] init];

// 添加规则
[apiInstance rulesPostWithRule:rule
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobRulesApi->rulesPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rule** | [**LJobRule***](LJobRule*.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rulesRuleIdDelete**
```objc
-(NSURLSessionTask*) rulesRuleIdDeleteWithRuleId: (NSString*) ruleId
        completionHandler: (void (^)(NSError* error)) handler;
```

删除规则

### Example 
```objc

NSString* ruleId = @"ruleId_example"; // 

LJobRulesApi*apiInstance = [[LJobRulesApi alloc] init];

// 删除规则
[apiInstance rulesRuleIdDeleteWithRuleId:ruleId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobRulesApi->rulesRuleIdDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rulesRuleIdPut**
```objc
-(NSURLSessionTask*) rulesRuleIdPutWithRuleId: (NSString*) ruleId
    rule: (LJobRule*) rule
        completionHandler: (void (^)(NSError* error)) handler;
```

修改规则

### Example 
```objc

NSString* ruleId = @"ruleId_example"; // 
LJobRule* rule = [[LJobRule alloc] init]; // 

LJobRulesApi*apiInstance = [[LJobRulesApi alloc] init];

// 修改规则
[apiInstance rulesRuleIdPutWithRuleId:ruleId
              rule:rule
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling LJobRulesApi->rulesRuleIdPut: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **NSString***|  | 
 **rule** | [**LJobRule***](LJobRule*.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

