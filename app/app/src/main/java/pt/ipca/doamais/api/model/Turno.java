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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Turno {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("tarefas")
  private String tarefas = null;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("userId")
  private Integer userId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTarefas() {
    return tarefas;
  }
  public void setTarefas(String tarefas) {
    this.tarefas = tarefas;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Turno turno = (Turno) o;
    return (this.id == null ? turno.id == null : this.id.equals(turno.id)) &&
        (this.tarefas == null ? turno.tarefas == null : this.tarefas.equals(turno.tarefas)) &&
        (this.time == null ? turno.time == null : this.time.equals(turno.time)) &&
        (this.userId == null ? turno.userId == null : this.userId.equals(turno.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.tarefas == null ? 0: this.tarefas.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Turno {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tarefas: ").append(tarefas).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
