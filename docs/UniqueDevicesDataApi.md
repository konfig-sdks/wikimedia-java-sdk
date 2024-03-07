# UniqueDevicesDataApi

All URIs are relative to *https://wikimedia.org/api/rest_v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByProjectAndDateRange**](UniqueDevicesDataApi.md#getByProjectAndDateRange) | **GET** /metrics/unique-devices/{project}/{access-site}/{granularity}/{start}/{end} | Get unique devices count per project |


<a name="getByProjectAndDateRange"></a>
# **getByProjectAndDateRange**
> Object getByProjectAndDateRange(project, accessSite, granularity, start, end).execute();

Get unique devices count per project

Given a project and a date range, returns a timeseries of unique devices counts. You need to specify a project, and can filter by accessed site (mobile or desktop). You can choose between daily and hourly granularity as well.  - Stability: [stable](https://www.mediawiki.org/wiki/API_versioning#Stable) - Rate limit: 100 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UniqueDevicesDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // If you want to filter by project, use the domain of any Wikimedia project, for example 'en.wikipedia.org', 'www.mediawiki.org' or 'commons.wikimedia.org'. 
    String accessSite = "all-sites"; // If you want to filter by accessed site, use one of desktop-site or mobile-site. If you are interested in unique devices regardless of accessed site, use or all-sites. 
    String granularity = "daily"; // The time unit for the response data. As of today, the supported granularities for this endpoint are daily and monthly. 
    String start = "start_example"; // The timestamp of the first day/month to include, in YYYYMMDD format
    String end = "end_example"; // The timestamp of the last day/month to include, in YYYYMMDD format
    try {
      Object result = client
              .uniqueDevicesData
              .getByProjectAndDateRange(project, accessSite, granularity, start, end)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UniqueDevicesDataApi#getByProjectAndDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .uniqueDevicesData
              .getByProjectAndDateRange(project, accessSite, granularity, start, end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UniqueDevicesDataApi#getByProjectAndDateRange");
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
| **project** | **String**| If you want to filter by project, use the domain of any Wikimedia project, for example &#39;en.wikipedia.org&#39;, &#39;www.mediawiki.org&#39; or &#39;commons.wikimedia.org&#39;.  | |
| **accessSite** | **String**| If you want to filter by accessed site, use one of desktop-site or mobile-site. If you are interested in unique devices regardless of accessed site, use or all-sites.  | [enum: all-sites, desktop-site, mobile-site] |
| **granularity** | **String**| The time unit for the response data. As of today, the supported granularities for this endpoint are daily and monthly.  | [enum: daily, monthly] |
| **start** | **String**| The timestamp of the first day/month to include, in YYYYMMDD format | |
| **end** | **String**| The timestamp of the last day/month to include, in YYYYMMDD format | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of values |  -  |
| **0** | Error |  -  |

