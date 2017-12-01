package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Executor
 */

public class Executor  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("onlineStatus")
  private String onlineStatus = null;

  public Executor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 唯一的名字，不能重复，代表不同的执行机
   * @return name
  **/
  @ApiModelProperty(value = "唯一的名字，不能重复，代表不同的执行机")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Executor ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Executor onlineStatus(String onlineStatus) {
    this.onlineStatus = onlineStatus;
    return this;
  }

   /**
   * Get onlineStatus
   * @return onlineStatus
  **/
  @ApiModelProperty(value = "")
  public String getOnlineStatus() {
    return onlineStatus;
  }

  public void setOnlineStatus(String onlineStatus) {
    this.onlineStatus = onlineStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Executor executor = (Executor) o;
    return Objects.equals(this.name, executor.name) &&
        Objects.equals(this.ipAddress, executor.ipAddress) &&
        Objects.equals(this.onlineStatus, executor.onlineStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ipAddress, onlineStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Executor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
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

