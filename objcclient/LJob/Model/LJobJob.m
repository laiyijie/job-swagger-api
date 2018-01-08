#import "LJobJob.h"

@implementation LJobJob

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"_description": @"description", @"status": @"status", @"type": @"type", @"jobGroupId": @"jobGroupId", @"retryRegex": @"retryRegex", @"maxRetryTimes": @"maxRetryTimes", @"currentRetryTimes": @"currentRetryTimes", @"executorGroup": @"executorGroup", @"currentExecutor": @"currentExecutor", @"script": @"script" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"name", @"_description", @"status", @"type", @"jobGroupId", @"retryRegex", @"maxRetryTimes", @"currentRetryTimes", @"executorGroup", @"currentExecutor", @"script"];
  return [optionalProperties containsObject:propertyName];
}

@end
