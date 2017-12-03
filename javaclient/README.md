# android.swagger

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>me.laiyijie.job</groupId>
    <artifactId>android.swagger</artifactId>
    <version>0.0.24-snapshot</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "me.laiyijie.job:android.swagger:0.0.24-snapshot"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/android.swagger-0.0.24-snapshot.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import me.laiyijie.job.android.io.swagger.*;
import me.laiyijie.job.android.io.swagger.auth.*;
import me.laiyijie.job.android.io.swagger.model.*;
import me.laiyijie.job.android.io.swagger.api.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
        AuthApi apiInstance = new AuthApi();
        String username = "username_example"; // String | 
        String password = "password_example"; // String | 
        try {
            apiInstance.authLoginPost(username, password);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authLoginPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**authLoginPost**](docs/AuthApi.md#authLoginPost) | **POST** /auth/login | 
*ExecutorGroupApi* | [**executorGroupsGet**](docs/ExecutorGroupApi.md#executorGroupsGet) | **GET** /executor/groups | 
*ExecutorGroupApi* | [**executorGroupsGroupNameDelete**](docs/ExecutorGroupApi.md#executorGroupsGroupNameDelete) | **DELETE** /executor/groups/{groupName} | 删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录
*ExecutorGroupApi* | [**executorGroupsGroupNameGet**](docs/ExecutorGroupApi.md#executorGroupsGroupNameGet) | **GET** /executor/groups/{groupName} | 
*ExecutorGroupApi* | [**executorGroupsGroupNamePut**](docs/ExecutorGroupApi.md#executorGroupsGroupNamePut) | **PUT** /executor/groups/{groupName} | 只能修改描述
*ExecutorGroupApi* | [**executorGroupsPost**](docs/ExecutorGroupApi.md#executorGroupsPost) | **POST** /executor/groups | 添加执行机组
*JobApi* | [**jobGroupsGroupIdDelete**](docs/JobApi.md#jobGroupsGroupIdDelete) | **DELETE** /job/groups/{groupId} | 删除jobgroup
*JobApi* | [**jobGroupsGroupIdGet**](docs/JobApi.md#jobGroupsGroupIdGet) | **GET** /job/groups/{groupId} | 获取单个执行组的信息
*JobApi* | [**jobGroupsGroupIdJobsGet**](docs/JobApi.md#jobGroupsGroupIdJobsGet) | **GET** /job/groups/{groupId}/jobs | 
*JobApi* | [**jobGroupsGroupIdPost**](docs/JobApi.md#jobGroupsGroupIdPost) | **POST** /job/groups/{groupId} | 修改jobgroup信息 只能修改 名字、第几步、描述
*JobApi* | [**jobGroupsPost**](docs/JobApi.md#jobGroupsPost) | **POST** /job/groups | 创建一个jobgroup 名字、第几步、描述
*JobApi* | [**jobsJobIdDelete**](docs/JobApi.md#jobsJobIdDelete) | **DELETE** /jobs/{jobId} | 
*JobApi* | [**jobsJobIdGet**](docs/JobApi.md#jobsJobIdGet) | **GET** /jobs/{jobId} | 
*JobApi* | [**jobsJobIdPost**](docs/JobApi.md#jobsJobIdPost) | **POST** /jobs/{jobId} | 修改job 信息 只能修改 名字、描述、脚本、使用的执行机组
*JobApi* | [**jobsJobIdRunPost**](docs/JobApi.md#jobsJobIdRunPost) | **POST** /jobs/{jobId}/run | 
*JobApi* | [**jobsPost**](docs/JobApi.md#jobsPost) | **POST** /jobs | 
*JobApi* | [**workflowsGet**](docs/JobApi.md#workflowsGet) | **GET** /workflows | 获取工作流列表
*JobApi* | [**workflowsPost**](docs/JobApi.md#workflowsPost) | **POST** /workflows | 创建一个工作流
*JobApi* | [**workflowsWorkFlowIdDelete**](docs/JobApi.md#workflowsWorkFlowIdDelete) | **DELETE** /workflows/{workFlowId} | 删除这个工作流
*JobApi* | [**workflowsWorkFlowIdGet**](docs/JobApi.md#workflowsWorkFlowIdGet) | **GET** /workflows/{workFlowId} | 获取单个工作流信息
*JobApi* | [**workflowsWorkFlowIdJobGroupsGet**](docs/JobApi.md#workflowsWorkFlowIdJobGroupsGet) | **GET** /workflows/{workFlowId}/job/groups | 获取工作流下的所有执行组
*JobApi* | [**workflowsWorkFlowIdPost**](docs/JobApi.md#workflowsWorkFlowIdPost) | **POST** /workflows/{workFlowId} | 修改这个工作流信息，只能修改 名字、描述、执行间隔、是否循环执行
*JobApi* | [**workflowsWorkFlowIdResumePost**](docs/JobApi.md#workflowsWorkFlowIdResumePost) | **POST** /workflows/{workFlowId}/resume | 从失败处执行这个workflow
*JobApi* | [**workflowsWorkFlowIdRunPost**](docs/JobApi.md#workflowsWorkFlowIdRunPost) | **POST** /workflows/{workFlowId}/run | 从头执行这个workflow
*TestApi* | [**testInfoGet**](docs/TestApi.md#testInfoGet) | **GET** /test/info | 测试接口


## Documentation for Models

 - [ErrorInfo](docs/ErrorInfo.md)
 - [Executor](docs/Executor.md)
 - [ExecutorGroup](docs/ExecutorGroup.md)
 - [Job](docs/Job.md)
 - [JobGroup](docs/JobGroup.md)
 - [TestResponse](docs/TestResponse.md)
 - [WorkFlow](docs/WorkFlow.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



