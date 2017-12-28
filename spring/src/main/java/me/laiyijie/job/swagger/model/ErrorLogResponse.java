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

  @JsonProperty("totalRows")
  private Long totalRows = null;

  @JsonProperty("logs")
  private List<JobErrorLog> logs = null;

  public ErrorLogResponse totalRows(Long totalRows) {
    this.totalRows = totalRows;
    return this;
  }

   /**
   * Get totalRows
   * @return totalRows
  **/
  @ApiModelProperty(value = "")
  public Long getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(Long totalRows) {
    this.totalRows = totalRows;
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
    return Objects.equals(this.totalRows, errorLogResponse.totalRows) &&
        Objects.equals(this.logs, errorLogResponse.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRows, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorLogResponse {\n");
    
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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

