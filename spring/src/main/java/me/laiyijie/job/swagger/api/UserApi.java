package me.laiyijie.job.swagger.api;


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

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/user/login",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> userLoginPost(@ApiParam(value = "", required=true) @RequestParam(value="username", required=true)  String username,@ApiParam(value = "", required=true) @RequestParam(value="password", required=true)  String password, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
