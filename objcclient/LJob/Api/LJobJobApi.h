#import <Foundation/Foundation.h>
#import "LJobJob.h"
#import "LJobJobGroup.h"
#import "LJobWorkFlow.h"
#import "LJobApi.h"

/**
* 调度器管理后端
* ## 错误规则  ###    401 - 未登录，如果出现这个错误，请调用 登录/自动登录 接口刷新session或者requresttoken ###    403 - 权限不足， 一般不会出现这个错误 ###    417 - 碰到这个错误请将response的body解析为ErrorInfo一般情况是直接将ErrorInfo中的errorMessage 直接展现给用户 
*
* OpenAPI spec version: 0.0.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface LJobJobApi: NSObject <LJobApi>

extern NSString* kLJobJobApiErrorDomain;
extern NSInteger kLJobJobApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(LJobApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 删除jobgroup
/// 
///
/// @param groupId 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) jobGroupsGroupIdDeleteWithGroupId: (NSNumber*) groupId
    completionHandler: (void (^)(NSError* error)) handler;


/// 获取单个执行组的信息
/// 
///
/// @param groupId 
/// 
///  code:200 message:"ok"
///
/// @return LJobJobGroup*
-(NSURLSessionTask*) jobGroupsGroupIdGetWithGroupId: (NSNumber*) groupId
    completionHandler: (void (^)(LJobJobGroup* output, NSError* error)) handler;


/// 
/// 
///
/// @param groupId 
/// 
///  code:200 message:"ok"
///
/// @return LJobJob*
-(NSURLSessionTask*) jobGroupsGroupIdJobsGetWithGroupId: (NSNumber*) groupId
    completionHandler: (void (^)(LJobJob* output, NSError* error)) handler;


/// 修改jobgroup信息
/// 
///
/// @param groupId 
/// @param jobGroup 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) jobGroupsGroupIdPostWithGroupId: (NSNumber*) groupId
    jobGroup: (LJobJobGroup*) jobGroup
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param jobId 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) jobsJobIdDeleteWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param jobId 
/// 
///  code:200 message:"ok"
///
/// @return LJobJob*
-(NSURLSessionTask*) jobsJobIdGetWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(LJobJob* output, NSError* error)) handler;


/// 
/// 
///
/// @param jobId 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) jobsJobIdPostWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param jobId 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) jobsJobIdRunPostWithJobId: (NSNumber*) jobId
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param job 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) jobsPostWithJob: (LJobJob*) job
    completionHandler: (void (^)(NSError* error)) handler;


/// 获取工作流列表
/// 
///
/// 
///  code:200 message:"ok"
///
/// @return NSArray<LJobWorkFlow>*
-(NSURLSessionTask*) workflowsGetWithCompletionHandler: 
    (void (^)(NSArray<LJobWorkFlow>* output, NSError* error)) handler;


/// 创建一个工作流
/// 
///
/// @param workFlow 
/// 
///  code:200 message:"ok"
///
/// @return NSNumber*
-(NSURLSessionTask*) workflowsPostWithWorkFlow: (LJobWorkFlow*) workFlow
    completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;


/// 删除这个工作流
/// 
///
/// @param workFlowId 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) workflowsWorkFlowIdDeleteWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSError* error)) handler;


/// 获取单个工作流信息
/// 
///
/// @param workFlowId 
/// 
///  code:200 message:"ok"
///
/// @return LJobWorkFlow*
-(NSURLSessionTask*) workflowsWorkFlowIdGetWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(LJobWorkFlow* output, NSError* error)) handler;


/// 获取工作流下的所有执行组
/// 
///
/// @param workFlowId 
/// 
///  code:200 message:"ok"
///
/// @return NSArray<LJobJobGroup>*
-(NSURLSessionTask*) workflowsWorkFlowIdJobGroupsGetWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSArray<LJobJobGroup>* output, NSError* error)) handler;


/// 修改这个工作流信息
/// 
///
/// @param workFlowId 
/// @param workFlow 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) workflowsWorkFlowIdPostWithWorkFlowId: (NSNumber*) workFlowId
    workFlow: (LJobWorkFlow*) workFlow
    completionHandler: (void (^)(NSError* error)) handler;


/// 从失败处执行这个workflow
/// 
///
/// @param workFlowId 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) workflowsWorkFlowIdResumePostWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSError* error)) handler;


/// 从头执行这个workflow
/// 
///
/// @param workFlowId 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) workflowsWorkFlowIdRunPostWithWorkFlowId: (NSNumber*) workFlowId
    completionHandler: (void (^)(NSError* error)) handler;



@end