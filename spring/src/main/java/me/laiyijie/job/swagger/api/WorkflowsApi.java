package me.laiyijie.job.swagger.api;

import me.laiyijie.job.swagger.model.JobGroup;
import me.laiyijie.job.swagger.model.WorkFlow;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Api(value = "workflows", description = "the workflows API")
public interface WorkflowsApi {

    @ApiOperation(value = "获取工作流列表", notes = "", response = WorkFlow.class, responseContainer = "List", tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = WorkFlow.class) })
    
    @RequestMapping(value = "/workflows",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<List<WorkFlow>> workflowsGet( HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "创建一个工作流", notes = "", response = Integer.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Integer.class) })
    
    @RequestMapping(value = "/workflows",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> workflowsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody WorkFlow workFlow, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "删除这个工作流", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/workflows/{workFlowId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> workflowsWorkFlowIdDelete(@ApiParam(value = "",required=true ) @PathVariable("workFlowId") Integer workFlowId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "获取单个工作流信息", notes = "", response = WorkFlow.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = WorkFlow.class) })
    
    @RequestMapping(value = "/workflows/{workFlowId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<WorkFlow> workflowsWorkFlowIdGet(@ApiParam(value = "",required=true ) @PathVariable("workFlowId") Integer workFlowId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "获取工作流下的所有执行组", notes = "", response = JobGroup.class, responseContainer = "List", tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = JobGroup.class) })
    
    @RequestMapping(value = "/workflows/{workFlowId}/job/groups",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<List<JobGroup>> workflowsWorkFlowIdJobGroupsGet(@ApiParam(value = "",required=true ) @PathVariable("workFlowId") Integer workFlowId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "修改这个工作流信息", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/workflows/{workFlowId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> workflowsWorkFlowIdPost(@ApiParam(value = "",required=true ) @PathVariable("workFlowId") Integer workFlowId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody WorkFlow workFlow, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "从失败处执行这个workflow", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/workflows/{workFlowId}/resume",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> workflowsWorkFlowIdResumePost(@ApiParam(value = "",required=true ) @PathVariable("workFlowId") Integer workFlowId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "从头执行这个workflow", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/workflows/{workFlowId}/run",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> workflowsWorkFlowIdRunPost(@ApiParam(value = "",required=true ) @PathVariable("workFlowId") Integer workFlowId, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
