#import "LJobJobApi.h"
#import "LJobQueryParamCollection.h"
#import "LJobApiClient.h"
#import "LJobErrorLogResponse.h"
#import "LJobJob.h"
#import "LJobJobGroup.h"
#import "LJobWorkFlow.h"


@interface LJobJobApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation LJobJobApi

NSString* kLJobJobApiErrorDomain = @"LJobJobApiErrorDomain";
NSInteger kLJobJobApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[LJobApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(LJobApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// 所有的错误日志
/// 
///  @param pageSize  
///
///  @param pageNum  
///
///  @param startTime  
///
///  @param endTime  
///
///  @param jobId  (optional)
///
///  @param workflowId  (optional)
///
///  @returns LJobErrorLogResponse*
///
-(NSURLSessionTask*) jobErrorLogsGetWithPageSize: (NSNumber*) pageSize
    pageNum: (NSNumber*) pageNum
    startTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    jobId: (NSNumber*) jobId
    workflowId: (NSNumber*) workflowId
    completionHandler: (void (^)(LJobErrorLogResponse* output, NSError* error)) handler {
    // verify the required parameter 'pageSize' is set
    if (pageSize == nil) {
        NSParameterAssert(pageSize);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pageSize"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pageNum' is set
    if (pageNum == nil) {
        NSParameterAssert(pageNum);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pageNum"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endTime' is set
    if (endTime == nil) {
        NSParameterAssert(endTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endTime"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/job/error/logs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (pageSize != nil) {
        queryParams[@"pageSize"] = pageSize;
    }
    if (pageNum != nil) {
        queryParams[@"pageNum"] = pageNum;
    }
    if (startTime != nil) {
        queryParams[@"startTime"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"endTime"] = endTime;
    }
    if (jobId != nil) {
        queryParams[@"jobId"] = jobId;
    }
    if (workflowId != nil) {
        queryParams[@"workflowId"] = workflowId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"LJobErrorLogResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((LJobErrorLogResponse*)data, error);
                                }
                            }];
}

///
/// 删除jobgroup
/// 
///  @param groupId  
///
///  @returns void
///
-(NSURLSessionTask*) jobGroupsGroupIdDeleteWithGroupId: (NSNumber*) groupId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'groupId' is set
    if (groupId == nil) {
        NSParameterAssert(groupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/job/groups/{groupId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (groupId != nil) {
        pathParams[@"groupId"] = groupId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 获取单个执行组的信息
/// 
///  @param groupId  
///
///  @returns LJobJobGroup*
///
-(NSURLSessionTask*) jobGroupsGroupIdGetWithGroupId: (NSNumber*) groupId
    completionHandler: (void (^)(LJobJobGroup* output, NSError* error)) handler {
    // verify the required parameter 'groupId' is set
    if (groupId == nil) {
        NSParameterAssert(groupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/job/groups/{groupId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (groupId != nil) {
        pathParams[@"groupId"] = groupId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"LJobJobGroup*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((LJobJobGroup*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param groupId  
///
///  @returns NSArray<LJobJob>*
///
-(NSURLSessionTask*) jobGroupsGroupIdJobsGetWithGroupId: (NSNumber*) groupId
    completionHandler: (void (^)(NSArray<LJobJob>* output, NSError* error)) handler {
    // verify the required parameter 'groupId' is set
    if (groupId == nil) {
        NSParameterAssert(groupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/job/groups/{groupId}/jobs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (groupId != nil) {
        pathParams[@"groupId"] = groupId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<LJobJob>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<LJobJob>*)data, error);
                                }
                            }];
}

///
/// 修改jobgroup信息 只能修改 名字、第几步、描述
/// 
///  @param groupId  
///
///  @param jobGroup  
///
///  @returns void
///
-(NSURLSessionTask*) jobGroupsGroupIdPostWithGroupId: (NSNumber*) groupId
    jobGroup: (LJobJobGroup*) jobGroup
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'groupId' is set
    if (groupId == nil) {
        NSParameterAssert(groupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'jobGroup' is set
    if (jobGroup == nil) {
        NSParameterAssert(jobGroup);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jobGroup"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/job/groups/{groupId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (groupId != nil) {
        pathParams[@"groupId"] = groupId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = jobGroup;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 创建一个jobgroup 名字、第几步、描述
/// 
///  @param jobGroup  
///
///  @returns void
///
-(NSURLSessionTask*) jobGroupsPostWithJobGroup: (LJobJobGroup*) jobGroup
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'jobGroup' is set
    if (jobGroup == nil) {
        NSParameterAssert(jobGroup);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jobGroup"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/job/groups"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = jobGroup;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 获取任务列表
/// 
///  @returns NSArray<LJobJob>*
///
-(NSURLSessionTask*) jobsGetWithCompletionHandler: 
    (void (^)(NSArray<LJobJob>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/jobs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<LJobJob>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<LJobJob>*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param jobId  
///
///  @returns void
///
-(NSURLSessionTask*) jobsJobIdDeleteWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'jobId' is set
    if (jobId == nil) {
        NSParameterAssert(jobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jobId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/jobs/{jobId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (jobId != nil) {
        pathParams[@"jobId"] = jobId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 
/// 
///  @param jobId  
///
///  @returns LJobJob*
///
-(NSURLSessionTask*) jobsJobIdGetWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(LJobJob* output, NSError* error)) handler {
    // verify the required parameter 'jobId' is set
    if (jobId == nil) {
        NSParameterAssert(jobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jobId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/jobs/{jobId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (jobId != nil) {
        pathParams[@"jobId"] = jobId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"LJobJob*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((LJobJob*)data, error);
                                }
                            }];
}

///
/// 修改job 信息 只能修改 名字、描述、脚本、使用的执行机组
/// 
///  @param jobId  
///
///  @param job  
///
///  @returns void
///
-(NSURLSessionTask*) jobsJobIdPostWithJobId: (NSNumber*) jobId
    job: (LJobJob*) job
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'jobId' is set
    if (jobId == nil) {
        NSParameterAssert(jobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jobId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'job' is set
    if (job == nil) {
        NSParameterAssert(job);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"job"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/jobs/{jobId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (jobId != nil) {
        pathParams[@"jobId"] = jobId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = job;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 
/// 
///  @param jobId  
///
///  @returns void
///
-(NSURLSessionTask*) jobsJobIdRunPostWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'jobId' is set
    if (jobId == nil) {
        NSParameterAssert(jobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jobId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/jobs/{jobId}/run"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (jobId != nil) {
        pathParams[@"jobId"] = jobId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 
/// 
///  @param jobId  
///
///  @returns void
///
-(NSURLSessionTask*) jobsJobIdStopPostWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'jobId' is set
    if (jobId == nil) {
        NSParameterAssert(jobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jobId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/jobs/{jobId}/stop"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (jobId != nil) {
        pathParams[@"jobId"] = jobId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 
/// 
///  @param job  
///
///  @returns void
///
-(NSURLSessionTask*) jobsPostWithJob: (LJobJob*) job
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'job' is set
    if (job == nil) {
        NSParameterAssert(job);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"job"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/jobs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = job;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 获取工作流列表
/// 
///  @returns NSArray<LJobWorkFlow>*
///
-(NSURLSessionTask*) workflowsGetWithCompletionHandler: 
    (void (^)(NSArray<LJobWorkFlow>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<LJobWorkFlow>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<LJobWorkFlow>*)data, error);
                                }
                            }];
}

///
/// 创建一个工作流
/// 
///  @param workFlow  
///
///  @returns NSNumber*
///
-(NSURLSessionTask*) workflowsPostWithWorkFlow: (LJobWorkFlow*) workFlow
    completionHandler: (void (^)(NSNumber* output, NSError* error)) handler {
    // verify the required parameter 'workFlow' is set
    if (workFlow == nil) {
        NSParameterAssert(workFlow);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlow"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = workFlow;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSNumber*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSNumber*)data, error);
                                }
                            }];
}

///
/// 删除这个工作流
/// 
///  @param workFlowId  
///
///  @returns void
///
-(NSURLSessionTask*) workflowsWorkFlowIdDeleteWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'workFlowId' is set
    if (workFlowId == nil) {
        NSParameterAssert(workFlowId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlowId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows/{workFlowId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (workFlowId != nil) {
        pathParams[@"workFlowId"] = workFlowId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 获取单个工作流信息
/// 
///  @param workFlowId  
///
///  @returns LJobWorkFlow*
///
-(NSURLSessionTask*) workflowsWorkFlowIdGetWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(LJobWorkFlow* output, NSError* error)) handler {
    // verify the required parameter 'workFlowId' is set
    if (workFlowId == nil) {
        NSParameterAssert(workFlowId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlowId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows/{workFlowId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (workFlowId != nil) {
        pathParams[@"workFlowId"] = workFlowId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"LJobWorkFlow*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((LJobWorkFlow*)data, error);
                                }
                            }];
}

///
/// 获取工作流下的所有执行组
/// 
///  @param workFlowId  
///
///  @returns NSArray<LJobJobGroup>*
///
-(NSURLSessionTask*) workflowsWorkFlowIdJobGroupsGetWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSArray<LJobJobGroup>* output, NSError* error)) handler {
    // verify the required parameter 'workFlowId' is set
    if (workFlowId == nil) {
        NSParameterAssert(workFlowId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlowId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows/{workFlowId}/job/groups"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (workFlowId != nil) {
        pathParams[@"workFlowId"] = workFlowId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<LJobJobGroup>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<LJobJobGroup>*)data, error);
                                }
                            }];
}

///
/// 修改这个工作流信息，只能修改 名字、描述、执行间隔、是否循环执行
/// 
///  @param workFlowId  
///
///  @param workFlow  
///
///  @returns void
///
-(NSURLSessionTask*) workflowsWorkFlowIdPostWithWorkFlowId: (NSNumber*) workFlowId
    workFlow: (LJobWorkFlow*) workFlow
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'workFlowId' is set
    if (workFlowId == nil) {
        NSParameterAssert(workFlowId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlowId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'workFlow' is set
    if (workFlow == nil) {
        NSParameterAssert(workFlow);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlow"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows/{workFlowId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (workFlowId != nil) {
        pathParams[@"workFlowId"] = workFlowId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = workFlow;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 从失败处执行这个workflow
/// 
///  @param workFlowId  
///
///  @returns void
///
-(NSURLSessionTask*) workflowsWorkFlowIdResumePostWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'workFlowId' is set
    if (workFlowId == nil) {
        NSParameterAssert(workFlowId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlowId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows/{workFlowId}/resume"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (workFlowId != nil) {
        pathParams[@"workFlowId"] = workFlowId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 从头执行这个workflow
/// 
///  @param workFlowId  
///
///  @returns void
///
-(NSURLSessionTask*) workflowsWorkFlowIdRunPostWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'workFlowId' is set
    if (workFlowId == nil) {
        NSParameterAssert(workFlowId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlowId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows/{workFlowId}/run"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (workFlowId != nil) {
        pathParams[@"workFlowId"] = workFlowId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 停止这个workflow
/// 
///  @param workFlowId  
///
///  @returns void
///
-(NSURLSessionTask*) workflowsWorkFlowIdStopPostWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'workFlowId' is set
    if (workFlowId == nil) {
        NSParameterAssert(workFlowId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"workFlowId"] };
            NSError* error = [NSError errorWithDomain:kLJobJobApiErrorDomain code:kLJobJobApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/workflows/{workFlowId}/stop"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (workFlowId != nil) {
        pathParams[@"workFlowId"] = workFlowId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"text/plain; charset=utf-8"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded", @"application/json", @"multipart/form-data", @"text/plain; charset=utf-8", @"*/*"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}



@end
