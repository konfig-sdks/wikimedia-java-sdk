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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner {
  public static final String SERIALIZED_NAME_ABS_BYTES_DIFF = "abs_bytes_diff";
  @SerializedName(SERIALIZED_NAME_ABS_BYTES_DIFF)
  private Long absBytesDiff;

  public static final String SERIALIZED_NAME_PAGE_TITLE = "page_title";
  @SerializedName(SERIALIZED_NAME_PAGE_TITLE)
  private String pageTitle;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner() {
  }

  public TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner absBytesDiff(Long absBytesDiff) {
    
    
    
    
    this.absBytesDiff = absBytesDiff;
    return this;
  }

   /**
   * Get absBytesDiff
   * @return absBytesDiff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAbsBytesDiff() {
    return absBytesDiff;
  }


  public void setAbsBytesDiff(Long absBytesDiff) {
    
    
    
    this.absBytesDiff = absBytesDiff;
  }


  public TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner pageTitle(String pageTitle) {
    
    
    
    
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


  public TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner rank(Integer rank) {
    
    
    
    
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRank() {
    return rank;
  }


  public void setRank(Integer rank) {
    
    
    
    this.rank = rank;
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
   * @return the TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner instance itself
   */
  public TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner putAdditionalProperty(String key, Object value) {
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
    TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner topEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner = (TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner) o;
    return Objects.equals(this.absBytesDiff, topEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.absBytesDiff) &&
        Objects.equals(this.pageTitle, topEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.pageTitle) &&
        Objects.equals(this.rank, topEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.rank)&&
        Objects.equals(this.additionalProperties, topEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absBytesDiff, pageTitle, rank, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner {\n");
    sb.append("    absBytesDiff: ").append(toIndentedString(absBytesDiff)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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
    openapiFields.add("abs_bytes_diff");
    openapiFields.add("page_title");
    openapiFields.add("rank");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner is not found in the empty JSON string", TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("page_title") != null && !jsonObj.get("page_title").isJsonNull()) && !jsonObj.get("page_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner>() {
           @Override
           public void write(JsonWriter out, TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner value) throws IOException {
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
           public TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner
  * @throws IOException if the JSON string is invalid with respect to TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner
  */
  public static TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.class);
  }

 /**
  * Convert an instance of TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

