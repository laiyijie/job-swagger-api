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

@Api(value = "executorgroups", description = "the executorgroups API")
public interface ExecutorgroupsApi {

    @ApiOperation(value = "", notes = "", response = ExecutorGroup.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = ExecutorGroup.class) })
    
    @RequestMapping(value = "/executorgroups",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<List<ExecutorGroup>> executorgroupsGet( HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "", notes = "", response = Integer.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Integer.class) })
    
    @RequestMapping(value = "/executorgroups",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> executorgroupsPost( HttpServletRequest request, HttpServletResponse response) throws Exception;

}
