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
import me.laiyijie.job.android.io.swagger.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        Integer userId = 56; // Integer | 
        String name = "name_example"; // String | 
        String headImagePath = "headImagePath_example"; // String | 
        String status = "status_example"; // String | 
        try {
            apiInstance.adminUserInfoUserIdPut(userId, name, headImagePath, status);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminUserInfoUserIdPut");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://58.87.75.73:8888/job/api/v1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminUserInfoUserIdPut**](docs/AdminApi.md#adminUserInfoUserIdPut) | **PUT** /admin/userInfo/{userId} | 管理员修改用户信息
*TestApi* | [**testInfoGet**](docs/TestApi.md#testInfoGet) | **GET** /test/info | 测试接口


## Documentation for Models

 - [ErrorInfo](docs/ErrorInfo.md)
 - [TestResponse](docs/TestResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



