# FeedContentAvailabilityApi

All URIs are relative to *https://wikimedia.org/api/rest_v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByWikiDomain**](FeedContentAvailabilityApi.md#getByWikiDomain) | **GET** /feed/availability | Gets availability of featured feed content for the apps by wiki domain. |


<a name="getByWikiDomain"></a>
# **getByWikiDomain**
> Availability getByWikiDomain().execute();

Gets availability of featured feed content for the apps by wiki domain.

Gets availability of featured feed content for the apps by wiki domain.  Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FeedContentAvailabilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    try {
      Availability result = client
              .feedContentAvailability
              .getByWikiDomain()
              .execute();
      System.out.println(result);
      System.out.println(result.getInTheNews());
      System.out.println(result.getMostRead());
      System.out.println(result.getOnThisDay());
      System.out.println(result.getPictureOfTheDay());
      System.out.println(result.getTodaysFeaturedArticle());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedContentAvailabilityApi#getByWikiDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Availability> response = client
              .feedContentAvailability
              .getByWikiDomain()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedContentAvailabilityApi#getByWikiDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Availability**](Availability.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8; profile=https://www.mediawiki.org/wiki/Specs/Availability/1.0.1, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON containing lists of wiki domains for which feed content is available. |  -  |
| **0** | Error |  -  |

