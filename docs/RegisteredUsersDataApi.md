# RegisteredUsersDataApi

All URIs are relative to *https://wikimedia.org/api/rest_v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNewUserCountsByProjectAndDateRange**](RegisteredUsersDataApi.md#getNewUserCountsByProjectAndDateRange) | **GET** /metrics/registered-users/new/{project}/{granularity}/{start}/{end} | Get newly registered users counts for a project. |


<a name="getNewUserCountsByProjectAndDateRange"></a>
# **getNewUserCountsByProjectAndDateRange**
> Object getNewUserCountsByProjectAndDateRange(project, granularity, start, end).execute();

Get newly registered users counts for a project.

Given a Mediawiki project and a date range, returns a timeseries of its newly registered users counts. You can choose between daily and monthly granularity. The newly registered users value is computed with self-created users only, not auto-login created ones.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RegisteredUsersDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off.  For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. If you're interested in the aggregation of all projects, use all. 
    String granularity = "daily"; // The time unit for the response data. As of today, supported values are daily and monthly. 
    String start = "start_example"; // The date of the first day to include, in YYYYMMDD format
    String end = "end_example"; // The date of the last day to include, in YYYYMMDD format
    try {
      Object result = client
              .registeredUsersData
              .getNewUserCountsByProjectAndDateRange(project, granularity, start, end)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredUsersDataApi#getNewUserCountsByProjectAndDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .registeredUsersData
              .getNewUserCountsByProjectAndDateRange(project, granularity, start, end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredUsersDataApi#getNewUserCountsByProjectAndDateRange");
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
| **project** | **String**| The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off.  For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. If you&#39;re interested in the aggregation of all projects, use all.  | |
| **granularity** | **String**| The time unit for the response data. As of today, supported values are daily and monthly.  | [enum: daily, monthly] |
| **start** | **String**| The date of the first day to include, in YYYYMMDD format | |
| **end** | **String**| The date of the last day to include, in YYYYMMDD format | |

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

