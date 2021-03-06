package me.laiyijie.job.swagger.api;

import me.laiyijie.job.swagger.model.ErrorLogResponse;
import me.laiyijie.job.swagger.model.Job;
import me.laiyijie.job.swagger.model.JobGroup;

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

@Api(value = "job", description = "the job API")
public interface JobApi {

    @ApiOperation(value = "所有的错误日志", notes = "", response = ErrorLogResponse.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = ErrorLogResponse.class) })
    
    @RequestMapping(value = "/job/error/logs",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<ErrorLogResponse> jobErrorLogsGet( @NotNull @ApiParam(value = "", required = true) @RequestParam(value = "pageSize", required = true) Integer pageSize, @NotNull @ApiParam(value = "", required = true) @RequestParam(value = "pageNum", required = true) Integer pageNum, @NotNull @ApiParam(value = "", required = true) @RequestParam(value = "startTime", required = true) Long startTime, @NotNull @ApiParam(value = "", required = true) @RequestParam(value = "endTime", required = true) Long endTime, @ApiParam(value = "") @RequestParam(value = "jobId", required = false) Integer jobId, @ApiParam(value = "") @RequestParam(value = "workflowId", required = false) Integer workflowId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "删除jobgroup", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/job/groups/{groupId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> jobGroupsGroupIdDelete(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "获取单个执行组的信息", notes = "", response = JobGroup.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = JobGroup.class) })
    
    @RequestMapping(value = "/job/groups/{groupId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<JobGroup> jobGroupsGroupIdGet(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Job.class, responseContainer = "List", tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Job.class) })
    
    @RequestMapping(value = "/job/groups/{groupId}/jobs",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<List<Job>> jobGroupsGroupIdJobsGet(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "修改jobgroup信息 只能修改 名字、第几步、描述", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/job/groups/{groupId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> jobGroupsGroupIdPost(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody JobGroup jobGroup, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "创建一个jobgroup 名字、第几步、描述", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/job/groups",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> jobGroupsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody JobGroup jobGroup, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
