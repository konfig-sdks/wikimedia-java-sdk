/*
 * Wikimedia
 * This API provides cacheable and straightforward access to Wikimedia content and data, in machine-readable formats. ### Global Rules - Limit your clients to no more than 200 requests/s to this API.   Each API endpoint's documentation may detail more specific usage limits. - Set a unique `User-Agent` or `Api-User-Agent` header that   allows us to contact you quickly. Email addresses or URLs   of contact pages work well.  By using this API, you agree to Wikimedia's  [Terms of Use](https://wikimediafoundation.org/wiki/Terms_of_Use) and [Privacy Policy](https://wikimediafoundation.org/wiki/Privacy_policy). Unless otherwise specified in the endpoint documentation below, content accessed via this API is licensed under the [CC-BY-SA 3.0](https://creativecommons.org/licenses/by-sa/3.0/)  and [GFDL](https://www.gnu.org/copyleft/fdl.html) licenses, and you irrevocably agree to release modifications or additions made through this API under these licenses.  See https://www.mediawiki.org/wiki/REST_API for background and details. ### Endpoint documentation Please consult each endpoint's documentation for details on: - Licensing information for the specific type of content   and data served via the endpoint. - Stability markers to inform you about development status and   change policy, according to   [our API version policy](https://www.mediawiki.org/wiki/API_versioning). - Endpoint specific usage limits. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.NetBytesDifferenceItemsInnerResultsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * NetBytesDifferencePerPageItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NetBytesDifferencePerPageItemsInner {
  public static final String SERIALIZED_NAME_EDITOR_TYPE = "editor-type";
  @SerializedName(SERIALIZED_NAME_EDITOR_TYPE)
  private String editorType;

  public static final String SERIALIZED_NAME_GRANULARITY = "granularity";
  @SerializedName(SERIALIZED_NAME_GRANULARITY)
  private String granularity;

  public static final String SERIALIZED_NAME_PAGE_TITLE = "page-title";
  @SerializedName(SERIALIZED_NAME_PAGE_TITLE)
  private String pageTitle;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<NetBytesDifferenceItemsInnerResultsInner> results = null;

  public NetBytesDifferencePerPageItemsInner() {
  }

  public NetBytesDifferencePerPageItemsInner editorType(String editorType) {
    
    
    
    
    this.editorType = editorType;
    return this;
  }

   /**
   * Get editorType
   * @return editorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEditorType() {
    return editorType;
  }


  public void setEditorType(String editorType) {
    
    
    
    this.editorType = editorType;
  }


  public NetBytesDifferencePerPageItemsInner granularity(String granularity) {
    
    
    
    
    this.granularity = granularity;
    return this;
  }

   /**
   * Get granularity
   * @return granularity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGranularity() {
    return granularity;
  }


  public void setGranularity(String granularity) {
    
    
    
    this.granularity = granularity;
  }


  public NetBytesDifferencePerPageItemsInner pageTitle(String pageTitle) {
    
    
    
    
    this.pageTitle = pageTitle;
    return this;
  }

   /**
   * Get pageTitle
   * @return pageTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPageTitle() {
    return pageTitle;
  }


  public void setPageTitle(String pageTitle) {
    
    
    
    this.pageTitle = pageTitle;
  }


  public NetBytesDifferencePerPageItemsInner project(String project) {
    
    
    
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    
    
    
    this.project = project;
  }


  public NetBytesDifferencePerPageItemsInner results(List<NetBytesDifferenceItemsInnerResultsInner> results) {
    
    
    
    
    this.results = results;
    return this;
  }

  public NetBytesDifferencePerPageItemsInner addResultsItem(NetBytesDifferenceItemsInnerResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NetBytesDifferenceItemsInnerResultsInner> getResults() {
    return results;
  }


  public void setResults(List<NetBytesDifferenceItemsInnerResultsInner> results) {
    
    
    
    this.results = results;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the NetBytesDifferencePerPageItemsInner instance itself
   */
  public NetBytesDifferencePerPageItemsInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetBytesDifferencePerPageItemsInner netBytesDifferencePerPageItemsInner = (NetBytesDifferencePerPageItemsInner) o;
    return Objects.equals(this.editorType, netBytesDifferencePerPageItemsInner.editorType) &&
        Objects.equals(this.granularity, netBytesDifferencePerPageItemsInner.granularity) &&
        Objects.equals(this.pageTitle, netBytesDifferencePerPageItemsInner.pageTitle) &&
        Objects.equals(this.project, netBytesDifferencePerPageItemsInner.project) &&
        Objects.equals(this.results, netBytesDifferencePerPageItemsInner.results)&&
        Objects.equals(this.additionalProperties, netBytesDifferencePerPageItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editorType, granularity, pageTitle, project, results, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetBytesDifferencePerPageItemsInner {\n");
    sb.append("    editorType: ").append(toIndentedString(editorType)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("editor-type");
    openapiFields.add("granularity");
    openapiFields.add("page-title");
    openapiFields.add("project");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NetBytesDifferencePerPageItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NetBytesDifferencePerPageItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetBytesDifferencePerPageItemsInner is not found in the empty JSON string", NetBytesDifferencePerPageItemsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("editor-type") != null && !jsonObj.get("editor-type").isJsonNull()) && !jsonObj.get("editor-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `editor-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("editor-type").toString()));
      }
      if ((jsonObj.get("granularity") != null && !jsonObj.get("granularity").isJsonNull()) && !jsonObj.get("granularity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `granularity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("granularity").toString()));
      }
      if ((jsonObj.get("page-title") != null && !jsonObj.get("page-title").isJsonNull()) && !jsonObj.get("page-title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page-title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page-title").toString()));
      }
      if ((jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) && !jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            NetBytesDifferenceItemsInnerResultsInner.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetBytesDifferencePerPageItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetBytesDifferencePerPageItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetBytesDifferencePerPageItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetBytesDifferencePerPageItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NetBytesDifferencePerPageItemsInner>() {
           @Override
           public void write(JsonWriter out, NetBytesDifferencePerPageItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public NetBytesDifferencePerPageItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NetBytesDifferencePerPageItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetBytesDifferencePerPageItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetBytesDifferencePerPageItemsInner
  * @throws IOException if the JSON string is invalid with respect to NetBytesDifferencePerPageItemsInner
  */
  public static NetBytesDifferencePerPageItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetBytesDifferencePerPageItemsInner.class);
  }

 /**
  * Convert an instance of NetBytesDifferencePerPageItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

