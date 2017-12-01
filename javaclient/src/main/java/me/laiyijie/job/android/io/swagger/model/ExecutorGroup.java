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
import java.util.ArrayList;
import java.util.List;
import me.laiyijie.job.android.io.swagger.model.Executor;
import java.io.Serializable;

/**
 * ExecutorGroup
 */

public class ExecutorGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("executors")
  private List<Executor> executors = null;

  public ExecutorGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 唯一的名字，不能重复，代表唯一的执行组
   * @return name
  **/
  @ApiModelProperty(value = "唯一的名字，不能重复，代表唯一的执行组")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExecutorGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExecutorGroup executors(List<Executor> executors) {
    this.executors = executors;
    return this;
  }

  public ExecutorGroup addExecutorsItem(Executor executorsItem) {
    if (this.executors == null) {
      this.executors = new ArrayList<Executor>();
    }
    this.executors.add(executorsItem);
    return this;
  }

   /**
   * Get executors
   * @return executors
  **/
  @ApiModelProperty(value = "")
  public List<Executor> getExecutors() {
    return executors;
  }

  public void setExecutors(List<Executor> executors) {
    this.executors = executors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutorGroup executorGroup = (ExecutorGroup) o;
    return Objects.equals(this.name, executorGroup.name) &&
        Objects.equals(this.description, executorGroup.description) &&
        Objects.equals(this.executors, executorGroup.executors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, executors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutorGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executors: ").append(toIndentedString(executors)).append("\n");
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

