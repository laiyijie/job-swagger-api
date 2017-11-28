package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import me.laiyijie.job.swagger.model.JobGroup;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * JobGroup
 */

public class JobGroup  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("preJobGroup")
  private JobGroup preJobGroup = null;

  public JobGroup id(Integer id) {
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

  public JobGroup name(String name) {
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

  public JobGroup description(String description) {
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

  public JobGroup status(String status) {
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

  public JobGroup preJobGroup(JobGroup preJobGroup) {
    this.preJobGroup = preJobGroup;
    return this;
  }

   /**
   * Get preJobGroup
   * @return preJobGroup
  **/
  @ApiModelProperty(value = "")
  public JobGroup getPreJobGroup() {
    return preJobGroup;
  }

  public void setPreJobGroup(JobGroup preJobGroup) {
    this.preJobGroup = preJobGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobGroup jobGroup = (JobGroup) o;
    return Objects.equals(this.id, jobGroup.id) &&
        Objects.equals(this.name, jobGroup.name) &&
        Objects.equals(this.description, jobGroup.description) &&
        Objects.equals(this.status, jobGroup.status) &&
        Objects.equals(this.preJobGroup, jobGroup.preJobGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, status, preJobGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    preJobGroup: ").append(toIndentedString(preJobGroup)).append("\n");
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
