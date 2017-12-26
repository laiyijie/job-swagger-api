package me.laiyijie.job.swagger.api;

import me.laiyijie.job.swagger.model.Rule;

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

@Api(value = "rules", description = "the rules API")
public interface RulesApi {

    @ApiOperation(value = "", notes = "", response = Rule.class, responseContainer = "List", tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Rule.class) })
    
    @RequestMapping(value = "/rules",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<List<Rule>> rulesGet( HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "添加规则", notes = "", response = Void.class, tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/rules",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Void> rulesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Rule rule, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "删除规则", notes = "", response = Void.class, tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/rules/{ruleId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> rulesRuleIdDelete(@ApiParam(value = "",required=true ) @PathVariable("ruleId") String ruleId, HttpServletRequest request, HttpServletResponse response) throws Exception;


    @ApiOperation(value = "修改规则", notes = "", response = Void.class, tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class) })
    
    @RequestMapping(value = "/rules/{ruleId}",
        produces = { "application/json", "text/plain; charset=utf-8" }, 
        consumes = { "application/x-www-form-urlencoded", "application/json", "multipart/form-data", "text/plain; charset=utf-8", "*/*" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> rulesRuleIdPut(@ApiParam(value = "",required=true ) @PathVariable("ruleId") String ruleId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Rule rule, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
