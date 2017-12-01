# JobApi

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobGroupsGroupIdDelete**](JobApi.md#jobGroupsGroupIdDelete) | **DELETE** /job/groups/{groupId} | 删除jobgroup
[**jobGroupsGroupIdGet**](JobApi.md#jobGroupsGroupIdGet) | **GET** /job/groups/{groupId} | 获取单个执行组的信息
[**jobGroupsGroupIdJobsGet**](JobApi.md#jobGroupsGroupIdJobsGet) | **GET** /job/groups/{groupId}/jobs | 
[**jobGroupsGroupIdPost**](JobApi.md#jobGroupsGroupIdPost) | **POST** /job/groups/{groupId} | 修改jobgroup信息
[**jobsJobIdDelete**](JobApi.md#jobsJobIdDelete) | **DELETE** /jobs/{jobId} | 
[**jobsJobIdGet**](JobApi.md#jobsJobIdGet) | **GET** /jobs/{jobId} | 
[**jobsJobIdPost**](JobApi.md#jobsJobIdPost) | **POST** /jobs/{jobId} | 
[**jobsJobIdRunPost**](JobApi.md#jobsJobIdRunPost) | **POST** /jobs/{jobId}/run | 
[**jobsPost**](JobApi.md#jobsPost) | **POST** /jobs | 
[**workflowsGet**](JobApi.md#workflowsGet) | **GET** /workflows | 获取工作流列表
[**workflowsPost**](JobApi.md#workflowsPost) | **POST** /workflows | 创建一个工作流
[**workflowsWorkFlowIdDelete**](JobApi.md#workflowsWorkFlowIdDelete) | **DELETE** /workflows/{workFlowId} | 删除这个工作流
[**workflowsWorkFlowIdGet**](JobApi.md#workflowsWorkFlowIdGet) | **GET** /workflows/{workFlowId} | 获取单个工作流信息
[**workflowsWorkFlowIdJobGroupsGet**](JobApi.md#workflowsWorkFlowIdJobGroupsGet) | **GET** /workflows/{workFlowId}/job/groups | 获取工作流下的所有执行组
[**workflowsWorkFlowIdPost**](JobApi.md#workflowsWorkFlowIdPost) | **POST** /workflows/{workFlowId} | 修改这个工作流信息
[**workflowsWorkFlowIdResumePost**](JobApi.md#workflowsWorkFlowIdResumePost) | **POST** /workflows/{workFlowId}/resume | 从失败处执行这个workflow
[**workflowsWorkFlowIdRunPost**](JobApi.md#workflowsWorkFlowIdRunPost) | **POST** /workflows/{workFlowId}/run | 从头执行这个workflow


<a name="jobGroupsGroupIdDelete"></a>
# **jobGroupsGroupIdDelete**
> jobGroupsGroupIdDelete(groupId)

删除jobgroup

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer groupId = 56; // Integer | 
try {
    apiInstance.jobGroupsGroupIdDelete(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobGroupsGroupIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobGroupsGroupIdGet"></a>
# **jobGroupsGroupIdGet**
> JobGroup jobGroupsGroupIdGet(groupId)

获取单个执行组的信息

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer groupId = 56; // Integer | 
try {
    JobGroup result = apiInstance.jobGroupsGroupIdGet(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobGroupsGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |

### Return type

[**JobGroup**](JobGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobGroupsGroupIdJobsGet"></a>
# **jobGroupsGroupIdJobsGet**
> Job jobGroupsGroupIdJobsGet(groupId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer groupId = 56; // Integer | 
try {
    Job result = apiInstance.jobGroupsGroupIdJobsGet(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobGroupsGroupIdJobsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobGroupsGroupIdPost"></a>
# **jobGroupsGroupIdPost**
> jobGroupsGroupIdPost(groupId, jobGroup)

修改jobgroup信息

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer groupId = 56; // Integer | 
JobGroup jobGroup = new JobGroup(); // JobGroup | 
try {
    apiInstance.jobGroupsGroupIdPost(groupId, jobGroup);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobGroupsGroupIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |
 **jobGroup** | [**JobGroup**](JobGroup.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobsJobIdDelete"></a>
# **jobsJobIdDelete**
> jobsJobIdDelete(jobId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | 
try {
    apiInstance.jobsJobIdDelete(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobsJobIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobsJobIdGet"></a>
# **jobsJobIdGet**
> Job jobsJobIdGet(jobId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | 
try {
    Job result = apiInstance.jobsJobIdGet(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobsJobIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**|  |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobsJobIdPost"></a>
# **jobsJobIdPost**
> jobsJobIdPost(jobId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | 
try {
    apiInstance.jobsJobIdPost(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobsJobIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobsJobIdRunPost"></a>
# **jobsJobIdRunPost**
> jobsJobIdRunPost(jobId)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | 
try {
    apiInstance.jobsJobIdRunPost(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobsJobIdRunPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="jobsPost"></a>
# **jobsPost**
> jobsPost(job)



### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Job job = new Job(); // Job | 
try {
    apiInstance.jobsPost(job);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job** | [**Job**](Job.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsGet"></a>
# **workflowsGet**
> List&lt;WorkFlow&gt; workflowsGet()

获取工作流列表

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
try {
    List<WorkFlow> result = apiInstance.workflowsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WorkFlow&gt;**](WorkFlow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsPost"></a>
# **workflowsPost**
> Integer workflowsPost(workFlow)

创建一个工作流

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
WorkFlow workFlow = new WorkFlow(); // WorkFlow | 
try {
    Integer result = apiInstance.workflowsPost(workFlow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlow** | [**WorkFlow**](WorkFlow.md)|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsWorkFlowIdDelete"></a>
# **workflowsWorkFlowIdDelete**
> workflowsWorkFlowIdDelete(workFlowId)

删除这个工作流

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer workFlowId = 56; // Integer | 
try {
    apiInstance.workflowsWorkFlowIdDelete(workFlowId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsWorkFlowIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsWorkFlowIdGet"></a>
# **workflowsWorkFlowIdGet**
> WorkFlow workflowsWorkFlowIdGet(workFlowId)

获取单个工作流信息

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer workFlowId = 56; // Integer | 
try {
    WorkFlow result = apiInstance.workflowsWorkFlowIdGet(workFlowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsWorkFlowIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **Integer**|  |

### Return type

[**WorkFlow**](WorkFlow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsWorkFlowIdJobGroupsGet"></a>
# **workflowsWorkFlowIdJobGroupsGet**
> List&lt;JobGroup&gt; workflowsWorkFlowIdJobGroupsGet(workFlowId)

获取工作流下的所有执行组

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer workFlowId = 56; // Integer | 
try {
    List<JobGroup> result = apiInstance.workflowsWorkFlowIdJobGroupsGet(workFlowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsWorkFlowIdJobGroupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **Integer**|  |

### Return type

[**List&lt;JobGroup&gt;**](JobGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsWorkFlowIdPost"></a>
# **workflowsWorkFlowIdPost**
> workflowsWorkFlowIdPost(workFlowId, workFlow)

修改这个工作流信息

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer workFlowId = 56; // Integer | 
WorkFlow workFlow = new WorkFlow(); // WorkFlow | 
try {
    apiInstance.workflowsWorkFlowIdPost(workFlowId, workFlow);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsWorkFlowIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **Integer**|  |
 **workFlow** | [**WorkFlow**](WorkFlow.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsWorkFlowIdResumePost"></a>
# **workflowsWorkFlowIdResumePost**
> workflowsWorkFlowIdResumePost(workFlowId)

从失败处执行这个workflow

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer workFlowId = 56; // Integer | 
try {
    apiInstance.workflowsWorkFlowIdResumePost(workFlowId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsWorkFlowIdResumePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

<a name="workflowsWorkFlowIdRunPost"></a>
# **workflowsWorkFlowIdRunPost**
> workflowsWorkFlowIdRunPost(workFlowId)

从头执行这个workflow

### Example
```java
// Import classes:
//import me.laiyijie.job.android.io.swagger.ApiException;
//import me.laiyijie.job.android.io.swagger.api.JobApi;


JobApi apiInstance = new JobApi();
Integer workFlowId = 56; // Integer | 
try {
    apiInstance.workflowsWorkFlowIdRunPost(workFlowId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#workflowsWorkFlowIdRunPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workFlowId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json, multipart/form-data, text/plain; charset=utf-8, */*
 - **Accept**: application/json, text/plain; charset=utf-8

