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

@Api(value = "admin", description = "the admin API")
public interface AdminApi {

    @ApiOperation(value = "管理员修改用户信息", notes = "", response = Void.class, tags={ "Admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok，修改成功", response = Void.class) })
    
    @RequestMapping(value = "/admin/userInfo/{userId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> adminUserInfoUserIdPut(@ApiParam(value = "",required=true ) @PathVariable("userId") Integer userId,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="headImagePath", required=false)  String headImagePath,@ApiParam(value = "") @RequestParam(value="status", required=false)  String status, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
