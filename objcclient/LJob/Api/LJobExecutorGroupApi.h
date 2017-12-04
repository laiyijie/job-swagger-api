#import <Foundation/Foundation.h>
#import "LJobExecutorGroup.h"
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



@interface LJobExecutorGroupApi: NSObject <LJobApi>

extern NSString* kLJobExecutorGroupApiErrorDomain;
extern NSInteger kLJobExecutorGroupApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(LJobApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// 
///
/// 
///  code:200 message:"ok"
///
/// @return NSArray<LJobExecutorGroup>*
-(NSURLSessionTask*) executorGroupsGetWithCompletionHandler: 
    (void (^)(NSArray<LJobExecutorGroup>* output, NSError* error)) handler;


/// 删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录
/// 
///
/// @param groupName 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) executorGroupsGroupNameDeleteWithGroupName: (NSString*) groupName
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param groupName 
/// 
///  code:200 message:"ok"
///
/// @return LJobExecutorGroup*
-(NSURLSessionTask*) executorGroupsGroupNameGetWithGroupName: (NSString*) groupName
    completionHandler: (void (^)(LJobExecutorGroup* output, NSError* error)) handler;


/// 只能修改描述
/// 
///
/// @param groupName 
/// @param executorGroup 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) executorGroupsGroupNamePutWithGroupName: (NSString*) groupName
    executorGroup: (LJobExecutorGroup*) executorGroup
    completionHandler: (void (^)(NSError* error)) handler;


/// 添加执行机组
/// 
///
/// @param executorGroup 
/// 
///  code:200 message:"ok"
///
/// @return 
-(NSURLSessionTask*) executorGroupsPostWithExecutorGroup: (LJobExecutorGroup*) executorGroup
    completionHandler: (void (^)(NSError* error)) handler;



@end
