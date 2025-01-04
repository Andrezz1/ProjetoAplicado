/**
 * Api Key Auth
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package pt.ipca.doamais.api.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserLogin {
  
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLogin userLogin = (UserLogin) o;
    return (this.username == null ? userLogin.username == null : this.username.equals(userLogin.username)) &&
        (this.password == null ? userLogin.password == null : this.password.equals(userLogin.password));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLogin {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
