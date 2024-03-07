# MathApi

All URIs are relative to *https://wikimedia.org/api/rest_v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkFormula**](MathApi.md#checkFormula) | **POST** /media/math/check/{type} | Check and normalize a TeX formula. |
| [**getFormulaByHash**](MathApi.md#getFormulaByHash) | **GET** /media/math/formula/{hash} | Get a previously-stored formula |
| [**renderFormulaByHash**](MathApi.md#renderFormulaByHash) | **GET** /media/math/render/{format}/{hash} | Get rendered formula in the given format. |


<a name="checkFormula"></a>
# **checkFormula**
> checkFormula(type, q, mathCheckFormulaRequest).execute();

Check and normalize a TeX formula.

Checks the supplied TeX formula for correctness and returns the normalised formula representation as well as information about identifiers. Available types are tex and inline-tex. The response contains the &#x60;x-resource-location&#x60; header which can be used to retrieve the render of the checked formula in one of the supported rendering formats. Just append the value of the header to &#x60;/media/math/{format}/&#x60; and perform a GET request against that URL.  Stability: [stable](https://www.mediawiki.org/wiki/API_versioning#Stable). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MathApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String type = "tex"; // The input type of the given formula; can be tex or inline-tex
    String q = "q_example"; // The formula to check
    try {
      client
              .math
              .checkFormula(type, q)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MathApi#checkFormula");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .math
              .checkFormula(type, q)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MathApi#checkFormula");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| The input type of the given formula; can be tex or inline-tex | [enum: tex, inline-tex, chem] |
| **q** | **String**| The formula to check | |
| **mathCheckFormulaRequest** | [**MathCheckFormulaRequest**](MathCheckFormulaRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about the checked formula |  -  |
| **0** | Error |  -  |

<a name="getFormulaByHash"></a>
# **getFormulaByHash**
> getFormulaByHash(hash).execute();

Get a previously-stored formula

Returns the previously-stored formula via &#x60;/media/math/check/{type}&#x60; for the given hash.  Stability: [stable](https://www.mediawiki.org/wiki/API_versioning#Stable). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MathApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String hash = "hash_example"; // The hash string of the previous POST data
    try {
      client
              .math
              .getFormulaByHash(hash)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MathApi#getFormulaByHash");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .math
              .getFormulaByHash(hash)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MathApi#getFormulaByHash");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hash** | **String**| The hash string of the previous POST data | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about the checked formula |  -  |
| **0** | Error |  -  |

<a name="renderFormulaByHash"></a>
# **renderFormulaByHash**
> renderFormulaByHash(format, hash).execute();

Get rendered formula in the given format.

Given a request hash, renders a TeX formula into its mathematic representation in the given format. When a request is issued to the &#x60;/media/math/check/{format}&#x60; POST endpoint, the response contains the &#x60;x-resource-location&#x60; header denoting the hash ID of the POST data. Once obtained, this endpoint has to be used to obtain the actual render.  Stability: [stable](https://www.mediawiki.org/wiki/API_versioning#Stable). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MathApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String format = "svg"; // The output format; can be svg or mml
    String hash = "hash_example"; // The hash string of the previous POST data
    try {
      client
              .math
              .renderFormulaByHash(format, hash)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MathApi#renderFormulaByHash");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .math
              .renderFormulaByHash(format, hash)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MathApi#renderFormulaByHash");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **format** | **String**| The output format; can be svg or mml | [enum: svg, mml, png] |
| **hash** | **String**| The hash string of the previous POST data | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml, application/mathml+xml, image/png, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rendered formula |  -  |
| **0** | Error |  -  |

