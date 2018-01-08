package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import me.laiyijie.job.swagger.model.Executor;
import me.laiyijie.job.swagger.model.ExecutorGroup;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Job
 */

public class Job  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("jobGroupId")
  private Integer jobGroupId = null;

  @JsonProperty("retryRegex")
  private String retryRegex = null;

  @JsonProperty("maxRetryTimes")
  private Integer maxRetryTimes = null;

  @JsonProperty("currentRetryTimes")
  private Integer currentRetryTimes = null;

  @JsonProperty("executorGroup")
  private ExecutorGroup executorGroup = null;

  @JsonProperty("currentExecutor")
  private Executor currentExecutor = null;

  @JsonProperty("script")
  private String script = null;

  public Job id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Job name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Job description(String description) {
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

  public Job status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Job type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Job jobGroupId(Integer jobGroupId) {
    this.jobGroupId = jobGroupId;
    return this;
  }

   /**
   * Get jobGroupId
   * @return jobGroupId
  **/
  @ApiModelProperty(value = "")
  public Integer getJobGroupId() {
    return jobGroupId;
  }

  public void setJobGroupId(Integer jobGroupId) {
    this.jobGroupId = jobGroupId;
  }

  public Job retryRegex(String retryRegex) {
    this.retryRegex = retryRegex;
    return this;
  }

   /**
   * Get retryRegex
   * @return retryRegex
  **/
  @ApiModelProperty(value = "")
  public String getRetryRegex() {
    return retryRegex;
  }

  public void setRetryRegex(String retryRegex) {
    this.retryRegex = retryRegex;
  }

  public Job maxRetryTimes(Integer maxRetryTimes) {
    this.maxRetryTimes = maxRetryTimes;
    return this;
  }

   /**
   * Get maxRetryTimes
   * @return maxRetryTimes
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxRetryTimes() {
    return maxRetryTimes;
  }

  public void setMaxRetryTimes(Integer maxRetryTimes) {
    this.maxRetryTimes = maxRetryTimes;
  }

  public Job currentRetryTimes(Integer currentRetryTimes) {
    this.currentRetryTimes = currentRetryTimes;
    return this;
  }

   /**
   * Get currentRetryTimes
   * @return currentRetryTimes
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentRetryTimes() {
    return currentRetryTimes;
  }

  public void setCurrentRetryTimes(Integer currentRetryTimes) {
    this.currentRetryTimes = currentRetryTimes;
  }

  public Job executorGroup(ExecutorGroup executorGroup) {
    this.executorGroup = executorGroup;
    return this;
  }

   /**
   * Get executorGroup
   * @return executorGroup
  **/
  @ApiModelProperty(value = "")
  public ExecutorGroup getExecutorGroup() {
    return executorGroup;
  }

  public void setExecutorGroup(ExecutorGroup executorGroup) {
    this.executorGroup = executorGroup;
  }

  public Job currentExecutor(Executor currentExecutor) {
    this.currentExecutor = currentExecutor;
    return this;
  }

   /**
   * Get currentExecutor
   * @return currentExecutor
  **/
  @ApiModelProperty(value = "")
  public Executor getCurrentExecutor() {
    return currentExecutor;
  }

  public void setCurrentExecutor(Executor currentExecutor) {
    this.currentExecutor = currentExecutor;
  }

  public Job script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @ApiModelProperty(value = "")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.description, job.description) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.type, job.type) &&
        Objects.equals(this.jobGroupId, job.jobGroupId) &&
        Objects.equals(this.retryRegex, job.retryRegex) &&
        Objects.equals(this.maxRetryTimes, job.maxRetryTimes) &&
        Objects.equals(this.currentRetryTimes, job.currentRetryTimes) &&
        Objects.equals(this.executorGroup, job.executorGroup) &&
        Objects.equals(this.currentExecutor, job.currentExecutor) &&
        Objects.equals(this.script, job.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, status, type, jobGroupId, retryRegex, maxRetryTimes, currentRetryTimes, executorGroup, currentExecutor, script);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    jobGroupId: ").append(toIndentedString(jobGroupId)).append("\n");
    sb.append("    retryRegex: ").append(toIndentedString(retryRegex)).append("\n");
    sb.append("    maxRetryTimes: ").append(toIndentedString(maxRetryTimes)).append("\n");
    sb.append("    currentRetryTimes: ").append(toIndentedString(currentRetryTimes)).append("\n");
    sb.append("    executorGroup: ").append(toIndentedString(executorGroup)).append("\n");
    sb.append("    currentExecutor: ").append(toIndentedString(currentExecutor)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

