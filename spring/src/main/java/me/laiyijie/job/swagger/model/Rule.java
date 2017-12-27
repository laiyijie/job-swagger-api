package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Rule
 */

public class Rule  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("script")
  private String script = null;

  @JsonProperty("pattern")
  private String pattern = null;

  @JsonProperty("retryTimes")
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

