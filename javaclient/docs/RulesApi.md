# RulesApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rulesGet**](RulesApi.md#rulesGet) | **GET** /rules | 
[**rulesPost**](RulesApi.md#rulesPost) | **POST** /rules | 添加规则
[**rulesRuleIdDelete**](RulesApi.md#rulesRuleIdDelete) | **DELETE** /rules/{ruleId} | 删除规则
[**rulesRuleIdPut**](RulesApi.md#rulesRuleIdPut) | **PUT** /rules/{ruleId} | 修改规则


<a name="rulesGet"></a>
# **rulesGet**
> List&lt;Rule&gt; rulesGet()



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.RulesApi;


RulesApi apiInstance = new RulesApi();
try {
    List<Rule> result = apiInstance.rulesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#rulesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Rule&gt;**](Rule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="rulesPost"></a>
# **rulesPost**
> rulesPost(rule)

添加规则

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.RulesApi;


RulesApi apiInstance = new RulesApi();
Rule rule = new Rule(); // Rule | 
try {
    apiInstance.rulesPost(rule);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#rulesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rule** | [**Rule**](Rule.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="rulesRuleIdDelete"></a>
# **rulesRuleIdDelete**
> rulesRuleIdDelete(ruleId)

删除规则

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.RulesApi;


RulesApi apiInstance = new RulesApi();
String ruleId = "ruleId_example"; // String | 
try {
    apiInstance.rulesRuleIdDelete(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#rulesRuleIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="rulesRuleIdPut"></a>
# **rulesRuleIdPut**
> rulesRuleIdPut(ruleId, rule)

修改规则

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.RulesApi;


RulesApi apiInstance = new RulesApi();
String ruleId = "ruleId_example"; // String | 
Rule rule = new Rule(); // Rule | 
try {
    apiInstance.rulesRuleIdPut(ruleId, rule);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#rulesRuleIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**|  |
 **rule** | [**Rule**](Rule.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

