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
import me.laiyijie.job.android.io.swagger.model.Job;
import me.laiyijie.job.android.io.swagger.model.JobGroup;
import me.laiyijie.job.android.io.swagger.model.WorkFlow;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
@Ignore
public class JobApiTest {

    private final JobApi api = new JobApi();

    
    /**
     * 删除jobgroup
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobGroupsGroupIdDeleteTest() throws ApiException {
        Integer groupId = null;
        api.jobGroupsGroupIdDelete(groupId);

        // TODO: test validations
    }
    
    /**
     * 获取单个执行组的信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobGroupsGroupIdGetTest() throws ApiException {
        Integer groupId = null;
        JobGroup response = api.jobGroupsGroupIdGet(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobGroupsGroupIdJobsGetTest() throws ApiException {
        Integer groupId = null;
        Job response = api.jobGroupsGroupIdJobsGet(groupId);

        // TODO: test validations
    }
    
    /**
     * 修改jobgroup信息 只能修改 名字、第几步、描述
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobGroupsGroupIdPostTest() throws ApiException {
        Integer groupId = null;
        JobGroup jobGroup = null;
        api.jobGroupsGroupIdPost(groupId, jobGroup);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobsJobIdDeleteTest() throws ApiException {
        Integer jobId = null;
        api.jobsJobIdDelete(jobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobsJobIdGetTest() throws ApiException {
        Integer jobId = null;
        Job response = api.jobsJobIdGet(jobId);

        // TODO: test validations
    }
    
    /**
     * 修改job 信息 只能修改 名字、描述、脚本、使用的执行机组
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobsJobIdPostTest() throws ApiException {
        Integer jobId = null;
        Job job = null;
        api.jobsJobIdPost(jobId, job);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobsJobIdRunPostTest() throws ApiException {
        Integer jobId = null;
        api.jobsJobIdRunPost(jobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobsPostTest() throws ApiException {
        Job job = null;
        api.jobsPost(job);

        // TODO: test validations
    }
    
    /**
     * 获取工作流列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsGetTest() throws ApiException {
        List<WorkFlow> response = api.workflowsGet();

        // TODO: test validations
    }
    
    /**
     * 创建一个工作流
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsPostTest() throws ApiException {
        WorkFlow workFlow = null;
        Integer response = api.workflowsPost(workFlow);

        // TODO: test validations
    }
    
    /**
     * 删除这个工作流
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsWorkFlowIdDeleteTest() throws ApiException {
        Integer workFlowId = null;
        api.workflowsWorkFlowIdDelete(workFlowId);

        // TODO: test validations
    }
    
    /**
     * 获取单个工作流信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsWorkFlowIdGetTest() throws ApiException {
        Integer workFlowId = null;
        WorkFlow response = api.workflowsWorkFlowIdGet(workFlowId);

        // TODO: test validations
    }
    
    /**
     * 获取工作流下的所有执行组
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsWorkFlowIdJobGroupsGetTest() throws ApiException {
        Integer workFlowId = null;
        List<JobGroup> response = api.workflowsWorkFlowIdJobGroupsGet(workFlowId);

        // TODO: test validations
    }
    
    /**
     * 修改这个工作流信息，只能修改 名字、描述、执行间隔
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsWorkFlowIdPostTest() throws ApiException {
        Integer workFlowId = null;
        WorkFlow workFlow = null;
        api.workflowsWorkFlowIdPost(workFlowId, workFlow);

        // TODO: test validations
    }
    
    /**
     * 从失败处执行这个workflow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsWorkFlowIdResumePostTest() throws ApiException {
        Integer workFlowId = null;
        api.workflowsWorkFlowIdResumePost(workFlowId);

        // TODO: test validations
    }
    
    /**
     * 从头执行这个workflow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsWorkFlowIdRunPostTest() throws ApiException {
        Integer workFlowId = null;
        api.workflowsWorkFlowIdRunPost(workFlowId);

        // TODO: test validations
    }
    
}
