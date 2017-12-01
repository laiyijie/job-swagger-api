#import <Foundation/Foundation.h>
#import "LJobObject.h"

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


#import "LJobExecutor.h"
#import "LJobExecutorGroup.h"


@protocol LJobJob
@end

@interface LJobJob : LJobObject


@property(nonatomic) NSNumber* _id;

@property(nonatomic) NSString* name;

@property(nonatomic) NSString* _description;

@property(nonatomic) NSString* status;

@property(nonatomic) LJobExecutorGroup* executorGroup;

@property(nonatomic) LJobExecutor* currentExecutor;

@property(nonatomic) NSString* script;

@end
