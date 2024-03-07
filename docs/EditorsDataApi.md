# EditorsDataApi

All URIs are relative to *https://wikimedia.org/api/rest_v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEditorsCountsForProject**](EditorsDataApi.md#getEditorsCountsForProject) | **GET** /metrics/editors/aggregate/{project}/{editor-type}/{page-type}/{activity-level}/{granularity}/{start}/{end} | Get editors counts for a project. |
| [**getTopByAbsoluteBytesDifference**](EditorsDataApi.md#getTopByAbsoluteBytesDifference) | **GET** /metrics/editors/top-by-absolute-bytes-difference/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 editors by absolute bytes-difference. |
| [**getTopByNetBytesDifference**](EditorsDataApi.md#getTopByNetBytesDifference) | **GET** /metrics/editors/top-by-net-bytes-difference/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 editors by net bytes-difference. |
| [**getTopEditorsByEditsCount**](EditorsDataApi.md#getTopEditorsByEditsCount) | **GET** /metrics/editors/top-by-edits/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 editors by edits count. |


<a name="getEditorsCountsForProject"></a>
# **getEditorsCountsForProject**
> Object getEditorsCountsForProject(project, editorType, pageType, activityLevel, granularity, start, end).execute();

Get editors counts for a project.

Given a Mediawiki project and a date range, returns a timeseries of its editors counts. You can filter by editory-type (all-editor-types, anonymous, group-bot, name-bot, user), page-type (all-page-types, content or non-content) or activity-level (1..4-edits, 5..24-edits, 25..99-edits or 100..-edits). You can choose between daily and monthly granularity as well.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorsDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off.  For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. 
    String editorType = "all-editor-types"; // If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types. 
    String pageType = "all-page-types"; // If you want to filter by page-type, use one of content (edits made in content namespaces) or non-content (edits made in non-content namespaces). If you are interested in editors regardless of their page-type, use all-page-types. 
    String activityLevel = "all-activity-levels"; // If you want to filter by activity-level, use one of 1..4-edits, 5..24-edits, 25..99-edits or 100..-edits. If you are interested in editors regardless of their activity-level, use all-activity-levels. 
    String granularity = "daily"; // The time unit for the response data. As of today, supported values are daily and monthly. 
    String start = "start_example"; // The date of the first day to include, in YYYYMMDD format
    String end = "end_example"; // The date of the last day to include, in YYYYMMDD format
    try {
      Object result = client
              .editorsData
              .getEditorsCountsForProject(project, editorType, pageType, activityLevel, granularity, start, end)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getEditorsCountsForProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .editorsData
              .getEditorsCountsForProject(project, editorType, pageType, activityLevel, granularity, start, end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getEditorsCountsForProject");
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
| **project** | **String**| The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off.  For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org.  | |
| **editorType** | **String**| If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types.  | [enum: all-editor-types, anonymous, group-bot, name-bot, user] |
| **pageType** | **String**| If you want to filter by page-type, use one of content (edits made in content namespaces) or non-content (edits made in non-content namespaces). If you are interested in editors regardless of their page-type, use all-page-types.  | [enum: all-page-types, content, non-content] |
| **activityLevel** | **String**| If you want to filter by activity-level, use one of 1..4-edits, 5..24-edits, 25..99-edits or 100..-edits. If you are interested in editors regardless of their activity-level, use all-activity-levels.  | [enum: all-activity-levels, 1..4-edits, 5..24-edits, 25..99-edits, 100..-edits] |
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

<a name="getTopByAbsoluteBytesDifference"></a>
# **getTopByAbsoluteBytesDifference**
> Object getTopByAbsoluteBytesDifference(project, editorType, pageType, year, month, day).execute();

Get top 100 editors by absolute bytes-difference.

Given a Mediawiki project and a date (day or month), returns a timeseries of the top 100 editors by absolute bytes-difference. You can filter by editor-type (all-editor-types, anonymous, group-bot, name-bot, user) or page-type (all-page-types, content or non-content). The user_text returned is either the mediawiki user_text if the user is registered, or null if user is anonymous.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorsDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. 
    String editorType = "all-editor-types"; // If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types. 
    String pageType = "all-page-types"; // If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types. 
    String year = "year_example"; // The year of the date for which to retrieve top editors, in YYYY format.
    String month = "month_example"; // The month of the date for which to retrieve top editors, in MM format. If you want to get the top editors of a whole month, the day parameter should be all-days.
    String day = "day_example"; // The day of the date for which to retrieve top editors, in DD format, or all-days for a monthly value.
    try {
      Object result = client
              .editorsData
              .getTopByAbsoluteBytesDifference(project, editorType, pageType, year, month, day)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getTopByAbsoluteBytesDifference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .editorsData
              .getTopByAbsoluteBytesDifference(project, editorType, pageType, year, month, day)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getTopByAbsoluteBytesDifference");
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
| **project** | **String**| The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org.  | |
| **editorType** | **String**| If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types.  | [enum: all-editor-types, anonymous, group-bot, name-bot, user] |
| **pageType** | **String**| If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types.  | [enum: all-page-types, content, non-content] |
| **year** | **String**| The year of the date for which to retrieve top editors, in YYYY format. | |
| **month** | **String**| The month of the date for which to retrieve top editors, in MM format. If you want to get the top editors of a whole month, the day parameter should be all-days. | |
| **day** | **String**| The day of the date for which to retrieve top editors, in DD format, or all-days for a monthly value. | |

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

<a name="getTopByNetBytesDifference"></a>
# **getTopByNetBytesDifference**
> Object getTopByNetBytesDifference(project, editorType, pageType, year, month, day).execute();

Get top 100 editors by net bytes-difference.

Given a Mediawiki project and a date (day or month), returns a timeseries of the top 100 editors by net bytes-difference. You can filter by editor-type (all-editor-types, anonymous, group-bot, name-bot, user) or page-type (all-page-types, content or non-content). The user_text returned is either the mediawiki user_text if the user is registered, or \&quot;Anonymous Editor\&quot; if user is anonymous.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorsDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. 
    String editorType = "all-editor-types"; // If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types. 
    String pageType = "all-page-types"; // If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types. 
    String year = "year_example"; // The year of the date for which to retrieve top editors, in YYYY format.
    String month = "month_example"; // The month of the date for which to retrieve top editors, in MM format. If you want to get the top editors of a whole month, the day parameter should be all-days.
    String day = "day_example"; // The day of the date for which to retrieve top editors, in DD format, or all-days for a monthly value.
    try {
      Object result = client
              .editorsData
              .getTopByNetBytesDifference(project, editorType, pageType, year, month, day)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getTopByNetBytesDifference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .editorsData
              .getTopByNetBytesDifference(project, editorType, pageType, year, month, day)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getTopByNetBytesDifference");
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
| **project** | **String**| The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org.  | |
| **editorType** | **String**| If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types.  | [enum: all-editor-types, anonymous, group-bot, name-bot, user] |
| **pageType** | **String**| If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types.  | [enum: all-page-types, content, non-content] |
| **year** | **String**| The year of the date for which to retrieve top editors, in YYYY format. | |
| **month** | **String**| The month of the date for which to retrieve top editors, in MM format. If you want to get the top editors of a whole month, the day parameter should be all-days. | |
| **day** | **String**| The day of the date for which to retrieve top editors, in DD format, or all-days for a monthly value. | |

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

<a name="getTopEditorsByEditsCount"></a>
# **getTopEditorsByEditsCount**
> Object getTopEditorsByEditsCount(project, editorType, pageType, year, month, day).execute();

Get top 100 editors by edits count.

Given a Mediawiki project and a date (day or month), returns a timeseries of the top 100 editors by edits count. You can filter by editor-type (all-editor-types, anonymous, group-bot, name-bot, user) or page-type (all-page-types, content or non-content). The user_text returned is either the mediawiki user_text if the user is registered, or null if user is anonymous.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorsDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. 
    String editorType = "all-editor-types"; // If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types. 
    String pageType = "all-page-types"; // If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types. 
    String year = "year_example"; // The year of the date for which to retrieve top editors, in YYYY format.
    String month = "month_example"; // The month of the date for which to retrieve top editors, in MM format. If you want to get the top editors of a whole month, the day parameter should be all-days.
    String day = "day_example"; // The day of the date for which to retrieve top editors, in DD format, or all-days for a monthly value.
    try {
      Object result = client
              .editorsData
              .getTopEditorsByEditsCount(project, editorType, pageType, year, month, day)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getTopEditorsByEditsCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .editorsData
              .getTopEditorsByEditsCount(project, editorType, pageType, year, month, day)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorsDataApi#getTopEditorsByEditsCount");
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
| **project** | **String**| The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org.  | |
| **editorType** | **String**| If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types.  | [enum: all-editor-types, anonymous, group-bot, name-bot, user] |
| **pageType** | **String**| If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types.  | [enum: all-page-types, content, non-content] |
| **year** | **String**| The year of the date for which to retrieve top editors, in YYYY format. | |
| **month** | **String**| The month of the date for which to retrieve top editors, in MM format. If you want to get the top editors of a whole month, the day parameter should be all-days. | |
| **day** | **String**| The day of the date for which to retrieve top editors, in DD format, or all-days for a monthly value. | |

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

