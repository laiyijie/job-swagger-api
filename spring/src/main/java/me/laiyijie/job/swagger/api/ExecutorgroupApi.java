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

@Api(value = "executorgroup", description = "the executorgroup API")
public interface ExecutorgroupApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/executorgroup/{groupId}/executor",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> executorgroupGroupIdExecutorDelete(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId, @NotNull @ApiParam(value = "executorId", required = true) @RequestParam(value = "executorId", required = true) Integer executorId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/executorgroup/{groupId}/executor",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> executorgroupGroupIdExecutorPost(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId, @NotNull @ApiParam(value = "executorId", required = true) @RequestParam(value = "executorId", required = true) Integer executorId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = ExecutorGroup.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = ExecutorGroup.class) })
    
    @RequestMapping(value = "/executorgroup/{groupId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<ExecutorGroup> executorgroupGroupIdGet(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/executorgroup/{groupId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> executorgroupGroupIdPut(@ApiParam(value = "",required=true ) @PathVariable("groupId") Integer groupId,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="description", required=false)  String description, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
