package me.laiyijie.job.swagger.api;

import me.laiyijie.job.swagger.model.Job;

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

@Api(value = "jobs", description = "the jobs API")
public interface JobsApi {

    @ApiOperation(value = "获取任务列表", notes = "", response = Job.class, responseContainer = "List", tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Job.class) })
    
    @RequestMapping(value = "/jobs",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<List<Job>> jobsGet( HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/jobs/{jobId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> jobsJobIdDelete(@ApiParam(value = "",required=true ) @PathVariable("jobId") Integer jobId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Job.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Job.class) })
    
    @RequestMapping(value = "/jobs/{jobId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<Job> jobsJobIdGet(@ApiParam(value = "",required=true ) @PathVariable("jobId") Integer jobId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "修改job 信息 只能修改 名字、描述、脚本、使用的执行机组", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/jobs/{jobId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> jobsJobIdPost(@ApiParam(value = "",required=true ) @PathVariable("jobId") Integer jobId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Job job, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/jobs/{jobId}/run",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> jobsJobIdRunPost(@ApiParam(value = "",required=true ) @PathVariable("jobId") Integer jobId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/jobs/{jobId}/stop",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> jobsJobIdStopPost(@ApiParam(value = "",required=true ) @PathVariable("jobId") Integer jobId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "Job", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/jobs",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> jobsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Job job, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
