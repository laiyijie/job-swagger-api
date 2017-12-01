package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import me.laiyijie.job.swagger.model.Executor;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ExecutorGroup
 */

public class ExecutorGroup  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("executors")
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

