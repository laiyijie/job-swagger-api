/*
 * 调度器管理后端
 * ## 错误规则  ###    401 - 未登录，如果出现这个错误，请调用 登录/自动登录 接口刷新session或者requresttoken ###    403 - 权限不足， 一般不会出现这个错误 ###    417 - 碰到这个错误请将response的body解析为ErrorInfo一般情况是直接将ErrorInfo中的errorMessage 直接展现给用户 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package me.laiyijie.job.android.io.swagger.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Rule
 */

public class Rule implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("script")
  private String script = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("retryTimes")
  private Integer retryTimes = null;

  public Rule id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @ApiModelProperty(value = "id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Rule script(String script) {
    this.script = script;
    return this;
  }

   /**
   * 脚本名称
   * @return script
  **/
  @ApiModelProperty(value = "脚本名称")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }

  public Rule pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * 匹配的字符串
   * @return pattern
  **/
  @ApiModelProperty(value = "匹配的字符串")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public Rule retryTimes(Integer retryTimes) {
    this.retryTimes = retryTimes;
    return this;
  }

   /**
   * 重试次数
   * @return retryTimes
  **/
  @ApiModelProperty(value = "重试次数")
  public Integer getRetryTimes() {
    return retryTimes;
  }

  public void setRetryTimes(Integer retryTimes) {
    this.retryTimes = retryTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.id, rule.id) &&
        Objects.equals(this.script, rule.script) &&
        Objects.equals(this.pattern, rule.pattern) &&
        Objects.equals(this.retryTimes, rule.retryTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, script, pattern, retryTimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
