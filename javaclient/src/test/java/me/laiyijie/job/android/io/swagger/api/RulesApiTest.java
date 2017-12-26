/*
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


package me.laiyijie.job.android.io.swagger.api;

import me.laiyijie.job.android.io.swagger.ApiException;
import me.laiyijie.job.android.io.swagger.model.Rule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RulesApi
 */
@Ignore
public class RulesApiTest {

    private final RulesApi api = new RulesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesGetTest() throws ApiException {
        List<Rule> response = api.rulesGet();

        // TODO: test validations
    }
    
    /**
     * 添加规则
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesPostTest() throws ApiException {
        Rule rule = null;
        api.rulesPost(rule);

        // TODO: test validations
    }
    
    /**
     * 删除规则
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesRuleIdDeleteTest() throws ApiException {
        Integer ruleId = null;
        api.rulesRuleIdDelete(ruleId);

        // TODO: test validations
    }
    
    /**
     * 修改规则
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesRuleIdPutTest() throws ApiException {
        Integer ruleId = null;
        Rule rule = null;
        api.rulesRuleIdPut(ruleId, rule);

        // TODO: test validations
    }
    
}
