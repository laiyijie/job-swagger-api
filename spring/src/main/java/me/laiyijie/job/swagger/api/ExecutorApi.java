package me.laiyijie.job.swagger.api;

import me.laiyijie.job.swagger.model.ExecutorGroup;

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

@Api(value = "executor", description = "the executor API")
public interface ExecutorApi {

    @ApiOperation(value = "", notes = "", response = ExecutorGroup.class, responseContainer = "List", tags={ "ExecutorGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = ExecutorGroup.class) })
    
    @RequestMapping(value = "/executor/groups",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<List<ExecutorGroup>> executorGroupsGet( HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "删除整个group，但是还在运行的执行机还是会重新生成这个group，会清空当前group下的所有执行机记录", notes = "", response = Void.class, tags={ "ExecutorGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/executor/groups/{groupName}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> executorGroupsGroupNameDelete(@ApiParam(value = "",required=true ) @PathVariable("groupName") String groupName, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = ExecutorGroup.class, tags={ "ExecutorGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = ExecutorGroup.class) })
    
    @RequestMapping(value = "/executor/groups/{groupName}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<ExecutorGroup> executorGroupsGroupNameGet(@ApiParam(value = "",required=true ) @PathVariable("groupName") String groupName, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "ExecutorGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/executor/groups/{groupName}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> executorGroupsGroupNamePut(@ApiParam(value = "",required=true ) @PathVariable("groupName") String groupName,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ExecutorGroup name, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "添加执行机组，可以不用手动添加，执行机注册会自动注册", notes = "", response = String.class, tags={ "ExecutorGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = String.class) })
    
    @RequestMapping(value = "/executor/groups",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<String> executorGroupsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ExecutorGroup executorGroup, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
