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
 * Executor
 */

public class Executor implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("onlineStatus")
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

