package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import me.laiyijie.job.swagger.model.JobErrorLog;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ErrorLogResponse
 */

public class ErrorLogResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("totalPage")
  private Integer totalPage = null;

  @JsonProperty("logs")
  private List<JobErrorLog> logs = null;

  public ErrorLogResponse totalPage(Integer totalPage) {
    this.totalPage = totalPage;
    return this;
  }

   /**
   * Get totalPage
   * @return totalPage
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }

  public ErrorLogResponse logs(List<JobErrorLog> logs) {
    this.logs = logs;
    return this;
  }

  public ErrorLogResponse addLogsItem(JobErrorLog logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<JobErrorLog>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @ApiModelProperty(value = "")
  public List<JobErrorLog> getLogs() {
    return logs;
  }

  public void setLogs(List<JobErrorLog> logs) {
    this.logs = logs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorLogResponse errorLogResponse = (ErrorLogResponse) o;
    return Objects.equals(this.totalPage, errorLogResponse.totalPage) &&
        Objects.equals(this.logs, errorLogResponse.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPage, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorLogResponse {\n");
    
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

