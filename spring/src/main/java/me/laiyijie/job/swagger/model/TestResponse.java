package me.laiyijie.job.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * TestResponse
 */

public class TestResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("myWord")
  private String myWord = null;

  @JsonProperty("count")
  private Long count = null;

  public TestResponse myWord(String myWord) {
    this.myWord = myWord;
    return this;
  }

   /**
   * 返回你说的话
   * @return myWord
  **/
  @ApiModelProperty(value = "返回你说的话")
  public String getMyWord() {
    return myWord;
  }

  public void setMyWord(String myWord) {
    this.myWord = myWord;
  }

  public TestResponse count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * 返回一个计数
   * @return count
  **/
  @ApiModelProperty(value = "返回一个计数")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResponse testResponse = (TestResponse) o;
    return Objects.equals(this.myWord, testResponse.myWord) &&
        Objects.equals(this.count, testResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myWord, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResponse {\n");
    
    sb.append("    myWord: ").append(toIndentedString(myWord)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

