# LegacyDataApi

All URIs are relative to *https://wikimedia.org/api/rest_v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPagecountsAggregateByProjectAndDateRange**](LegacyDataApi.md#getPagecountsAggregateByProjectAndDateRange) | **GET** /metrics/legacy/pagecounts/aggregate/{project}/{access-site}/{granularity}/{start}/{end} |  |


<a name="getPagecountsAggregateByProjectAndDateRange"></a>
# **getPagecountsAggregateByProjectAndDateRange**
> Object getPagecountsAggregateByProjectAndDateRange(project, accessSite, granularity, start, end).execute();



Given a project and a date range, returns a timeseries of pagecounts. You can filter by access site (mobile or desktop) and you can choose between monthly, daily and hourly granularity as well.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 100 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegacyDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. 
    String accessSite = "all-sites"; // If you want to filter by access site, use one of desktop-site or mobile-site. If you are interested in pagecounts regardless of access site use all-sites.
    String granularity = "hourly"; // The time unit for the response data. As of today, the supported granularities for this endpoint are hourly, daily and monthly. 
    String start = "start_example"; // The timestamp of the first hour/day/month to include, in YYYYMMDDHH format.
    String end = "end_example"; // The timestamp of the last hour/day/month to include, in YYYYMMDDHH format. In hourly and daily granularities this value is inclusive, in the monthly granularity this value is exclusive. 
    try {
      Object result = client
              .legacyData
              .getPagecountsAggregateByProjectAndDateRange(project, accessSite, granularity, start, end)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LegacyDataApi#getPagecountsAggregateByProjectAndDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .legacyData
              .getPagecountsAggregateByProjectAndDateRange(project, accessSite, granularity, start, end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegacyDataApi#getPagecountsAggregateByProjectAndDateRange");
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
| **project** | **String**| The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia.  | |
| **accessSite** | **String**| If you want to filter by access site, use one of desktop-site or mobile-site. If you are interested in pagecounts regardless of access site use all-sites. | [enum: all-sites, desktop-site, mobile-site] |
| **granularity** | **String**| The time unit for the response data. As of today, the supported granularities for this endpoint are hourly, daily and monthly.  | [enum: hourly, daily, monthly] |
| **start** | **String**| The timestamp of the first hour/day/month to include, in YYYYMMDDHH format. | |
| **end** | **String**| The timestamp of the last hour/day/month to include, in YYYYMMDDHH format. In hourly and daily granularities this value is inclusive, in the monthly granularity this value is exclusive.  | |

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

