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

package pt.ipca.doamais.api.invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import pt.ipca.doamais.api.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Beneficiario".equalsIgnoreCase(className)) {
      return new TypeToken<List<Beneficiario>>(){}.getType();
    }
    
    if ("Levantamento".equalsIgnoreCase(className)) {
      return new TypeToken<List<Levantamento>>(){}.getType();
    }
    
    if ("Turno".equalsIgnoreCase(className)) {
      return new TypeToken<List<Turno>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    if ("UserLogin".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserLogin>>(){}.getType();
    }
    
    if ("Visita".equalsIgnoreCase(className)) {
      return new TypeToken<List<Visita>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Beneficiario".equalsIgnoreCase(className)) {
      return new TypeToken<Beneficiario>(){}.getType();
    }
    
    if ("Levantamento".equalsIgnoreCase(className)) {
      return new TypeToken<Levantamento>(){}.getType();
    }
    
    if ("Turno".equalsIgnoreCase(className)) {
      return new TypeToken<Turno>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    if ("UserLogin".equalsIgnoreCase(className)) {
      return new TypeToken<UserLogin>(){}.getType();
    }
    
    if ("Visita".equalsIgnoreCase(className)) {
      return new TypeToken<Visita>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
