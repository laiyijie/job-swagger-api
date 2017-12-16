package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * JobErrorLog
 */

public class JobErrorLog  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("workflowId")
  private Integer workflowId = null;

  @JsonProperty("jobGroupId")
  private Integer jobGroupId = null;

  @JsonProperty("jobId")
  private Integer jobId = null;

  @JsonProperty("time")
  private Long time = null;

  @JsonProperty("executorName")
  private String executorName = null;

  @JsonProperty("content")
  private String content = null;

  public JobErrorLog id(Integer id) {
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

  public JobErrorLog workflowId(Integer workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(Integer workflowId) {
    this.workflowId = workflowId;
  }

  public JobErrorLog jobGroupId(Integer jobGroupId) {
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

  public JobErrorLog jobId(Integer jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(value = "")
  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  public JobErrorLog time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public JobErrorLog executorName(String executorName) {
    this.executorName = executorName;
    return this;
  }

   /**
   * Get executorName
   * @return executorName
  **/
  @ApiModelProperty(value = "")
  public String getExecutorName() {
    return executorName;
  }

  public void setExecutorName(String executorName) {
    this.executorName = executorName;
  }

  public JobErrorLog content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobErrorLog jobErrorLog = (JobErrorLog) o;
    return Objects.equals(this.id, jobErrorLog.id) &&
        Objects.equals(this.workflowId, jobErrorLog.workflowId) &&
        Objects.equals(this.jobGroupId, jobErrorLog.jobGroupId) &&
        Objects.equals(this.jobId, jobErrorLog.jobId) &&
        Objects.equals(this.time, jobErrorLog.time) &&
        Objects.equals(this.executorName, jobErrorLog.executorName) &&
        Objects.equals(this.content, jobErrorLog.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workflowId, jobGroupId, jobId, time, executorName, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobErrorLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    jobGroupId: ").append(toIndentedString(jobGroupId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    executorName: ").append(toIndentedString(executorName)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

