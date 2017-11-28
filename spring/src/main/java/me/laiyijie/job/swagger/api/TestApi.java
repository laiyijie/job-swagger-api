package me.laiyijie.job.swagger.api;

import me.laiyijie.job.swagger.model.TestResponse;

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

@Api(value = "test", description = "the test API")
public interface TestApi {

    @ApiOperation(value = "测试接口", notes = "", response = TestResponse.class, tags={ "Test", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "回复你的信息", response = TestResponse.class) })
    
    @RequestMapping(value = "/test/info",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<TestResponse> testInfoGet( @NotNull @ApiParam(value = "你想说的话", required = true) @RequestParam(value = "word", required = true) String word, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
