<div align="left">

[![Visit Wikimedia](./header.png)](https://wikimedia.org)

# [Wikimedia](https://wikimedia.org)

This API provides cacheable and straightforward access to Wikimedia content and data, in machine-readable formats.
### Global Rules
- Limit your clients to no more than 200 requests/s to this API.
  Each API endpoint's documentation may detail more specific usage limits.
- Set a unique `User-Agent` or `Api-User-Agent` header that
  allows us to contact you quickly. Email addresses or URLs
  of contact pages work well.

By using this API, you agree to Wikimedia's  [Terms of Use](https://wikimediafoundation.org/wiki/Terms_of_Use) and [Privacy Policy](https://wikimediafoundation.org/wiki/Privacy_policy). Unless otherwise specified in the endpoint documentation below, content accessed via this API is licensed under the [CC-BY-SA 3.0](https://creativecommons.org/licenses/by-sa/3.0/)  and [GFDL](https://www.gnu.org/copyleft/fdl.html) licenses, and you irrevocably agree to release modifications or additions made through this API under these licenses.  See https://www.mediawiki.org/wiki/REST_API for background and details.
### Endpoint documentation
Please consult each endpoint's documentation for details on:
- Licensing information for the specific type of content
  and data served via the endpoint.
- Stability markers to inform you about development status and
  change policy, according to
  [our API version policy](https://www.mediawiki.org/wiki/API_versioning).
- Endpoint specific usage limits.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Wikimedia&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>wikimedia-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:wikimedia-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/wikimedia-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BytesDifferenceDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String project = "project_example"; // The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. If you're interested in the aggregation of all projects, use all-projects. 
    String editorType = "all-editor-types"; // If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types. 
    String pageType = "all-page-types"; // If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types. 
    String granularity = "daily"; // Time unit for the response data. As of today, supported values are daily and monthly 
    String start = "start_example"; // The date of the first day to include, in YYYYMMDD format
    String end = "end_example"; // The date of the last day to include, in YYYYMMDD format
    try {
      Object result = client
              .bytesDifferenceData
              .getAbsoluteAggregateByProjectAndDateRange(project, editorType, pageType, granularity, start, end)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BytesDifferenceDataApi#getAbsoluteAggregateByProjectAndDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .bytesDifferenceData
              .getAbsoluteAggregateByProjectAndDateRange(project, editorType, pageType, granularity, start, end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BytesDifferenceDataApi#getAbsoluteAggregateByProjectAndDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://wikimedia.org/api/rest_v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BytesDifferenceDataApi* | [**getAbsoluteAggregateByProjectAndDateRange**](docs/BytesDifferenceDataApi.md#getAbsoluteAggregateByProjectAndDateRange) | **GET** /metrics/bytes-difference/absolute/aggregate/{project}/{editor-type}/{page-type}/{granularity}/{start}/{end} | Get the sum of absolute value of text bytes difference between current edit and previous one. 
*BytesDifferenceDataApi* | [**getAbsolutePerPage**](docs/BytesDifferenceDataApi.md#getAbsolutePerPage) | **GET** /metrics/bytes-difference/absolute/per-page/{project}/{page-title}/{editor-type}/{granularity}/{start}/{end} | Get the sum of absolute text bytes difference per page.
*BytesDifferenceDataApi* | [**getNetAggregateByProjectAndDateRange**](docs/BytesDifferenceDataApi.md#getNetAggregateByProjectAndDateRange) | **GET** /metrics/bytes-difference/net/aggregate/{project}/{editor-type}/{page-type}/{granularity}/{start}/{end} | Get the sum of net text bytes difference between current edit and previous one.
*BytesDifferenceDataApi* | [**getSumNetTextBytesDifferencePerPage**](docs/BytesDifferenceDataApi.md#getSumNetTextBytesDifferencePerPage) | **GET** /metrics/bytes-difference/net/per-page/{project}/{page-title}/{editor-type}/{granularity}/{start}/{end} | Get the sum of net text bytes difference per page.
*EditedPagesDataApi* | [**getAggregateByProjectAndDateRange**](docs/EditedPagesDataApi.md#getAggregateByProjectAndDateRange) | **GET** /metrics/edited-pages/aggregate/{project}/{editor-type}/{page-type}/{activity-level}/{granularity}/{start}/{end} | Get edited-pages counts for a project.
*EditedPagesDataApi* | [**getNewPagesCountsForProject**](docs/EditedPagesDataApi.md#getNewPagesCountsForProject) | **GET** /metrics/edited-pages/new/{project}/{editor-type}/{page-type}/{granularity}/{start}/{end} | Get new pages counts for a project.
*EditedPagesDataApi* | [**getTopByAbsoluteBytesDifference**](docs/EditedPagesDataApi.md#getTopByAbsoluteBytesDifference) | **GET** /metrics/edited-pages/top-by-absolute-bytes-difference/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 edited-pages by absolute bytes-difference.
*EditedPagesDataApi* | [**getTopByEditsCount**](docs/EditedPagesDataApi.md#getTopByEditsCount) | **GET** /metrics/edited-pages/top-by-edits/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 edited-pages by edits count.
*EditedPagesDataApi* | [**getTopByNetBytesDifference**](docs/EditedPagesDataApi.md#getTopByNetBytesDifference) | **GET** /metrics/edited-pages/top-by-net-bytes-difference/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 edited-pages by net bytes-difference.
*EditorsDataApi* | [**getEditorsCountsForProject**](docs/EditorsDataApi.md#getEditorsCountsForProject) | **GET** /metrics/editors/aggregate/{project}/{editor-type}/{page-type}/{activity-level}/{granularity}/{start}/{end} | Get editors counts for a project.
*EditorsDataApi* | [**getTopByAbsoluteBytesDifference**](docs/EditorsDataApi.md#getTopByAbsoluteBytesDifference) | **GET** /metrics/editors/top-by-absolute-bytes-difference/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 editors by absolute bytes-difference.
*EditorsDataApi* | [**getTopByNetBytesDifference**](docs/EditorsDataApi.md#getTopByNetBytesDifference) | **GET** /metrics/editors/top-by-net-bytes-difference/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 editors by net bytes-difference.
*EditorsDataApi* | [**getTopEditorsByEditsCount**](docs/EditorsDataApi.md#getTopEditorsByEditsCount) | **GET** /metrics/editors/top-by-edits/{project}/{editor-type}/{page-type}/{year}/{month}/{day} | Get top 100 editors by edits count.
*EditsDataApi* | [**getEditsCountsForProject**](docs/EditsDataApi.md#getEditsCountsForProject) | **GET** /metrics/edits/aggregate/{project}/{editor-type}/{page-type}/{granularity}/{start}/{end} | Get edits counts for a project.
*EditsDataApi* | [**getPageEditCounts**](docs/EditsDataApi.md#getPageEditCounts) | **GET** /metrics/edits/per-page/{project}/{page-title}/{editor-type}/{granularity}/{start}/{end} | Get edit counts for a page in a project.
*FeedContentAvailabilityApi* | [**getByWikiDomain**](docs/FeedContentAvailabilityApi.md#getByWikiDomain) | **GET** /feed/availability | Gets availability of featured feed content for the apps by wiki domain.
*LegacyDataApi* | [**getPagecountsAggregateByProjectAndDateRange**](docs/LegacyDataApi.md#getPagecountsAggregateByProjectAndDateRange) | **GET** /metrics/legacy/pagecounts/aggregate/{project}/{access-site}/{granularity}/{start}/{end} | 
*MathApi* | [**checkFormula**](docs/MathApi.md#checkFormula) | **POST** /media/math/check/{type} | Check and normalize a TeX formula.
*MathApi* | [**getFormulaByHash**](docs/MathApi.md#getFormulaByHash) | **GET** /media/math/formula/{hash} | Get a previously-stored formula
*MathApi* | [**renderFormulaByHash**](docs/MathApi.md#renderFormulaByHash) | **GET** /media/math/render/{format}/{hash} | Get rendered formula in the given format.
*PageviewsDataApi* | [**getPageviewCountsByArticleDateRange**](docs/PageviewsDataApi.md#getPageviewCountsByArticleDateRange) | **GET** /metrics/pageviews/per-article/{project}/{access}/{agent}/{article}/{granularity}/{start}/{end} | Get pageview counts for a page.
*PageviewsDataApi* | [**getPageviewCountsByProject**](docs/PageviewsDataApi.md#getPageviewCountsByProject) | **GET** /metrics/pageviews/aggregate/{project}/{access}/{agent}/{granularity}/{start}/{end} | Get pageview counts for a project.
*PageviewsDataApi* | [**listByCountryAndAccess**](docs/PageviewsDataApi.md#listByCountryAndAccess) | **GET** /metrics/pageviews/top-by-country/{project}/{access}/{year}/{month} | Get pageviews by country and access method.
*PageviewsDataApi* | [**listMostViewedArticlesByProjectAndTimespan**](docs/PageviewsDataApi.md#listMostViewedArticlesByProjectAndTimespan) | **GET** /metrics/pageviews/top/{project}/{access}/{year}/{month}/{day} | Get the most viewed articles for a project.
*RegisteredUsersDataApi* | [**getNewUserCountsByProjectAndDateRange**](docs/RegisteredUsersDataApi.md#getNewUserCountsByProjectAndDateRange) | **GET** /metrics/registered-users/new/{project}/{granularity}/{start}/{end} | Get newly registered users counts for a project.
*TransformApi* | [**contentMachineTranslate**](docs/TransformApi.md#contentMachineTranslate) | **POST** /transform/html/from/{from_lang}/to/{to_lang} | Machine-translate content
*TransformApi* | [**contentMachineTranslate_0**](docs/TransformApi.md#contentMachineTranslate_0) | **POST** /transform/html/from/{from_lang}/to/{to_lang}/{provider} | Machine-translate content
*TransformApi* | [**getDictionaryMeaning**](docs/TransformApi.md#getDictionaryMeaning) | **GET** /transform/word/from/{from_lang}/to/{to_lang}/{word} | Fetch the dictionary meaning of a word
*TransformApi* | [**getDictionaryMeaning_0**](docs/TransformApi.md#getDictionaryMeaning_0) | **GET** /transform/word/from/{from_lang}/to/{to_lang}/{word}/{provider} | Fetch the dictionary meaning of a word
*TransformApi* | [**getListToolLanguagePairs**](docs/TransformApi.md#getListToolLanguagePairs) | **GET** /transform/list/tool/{tool} | Lists the tools and language pairs available for the given tool category
*TransformApi* | [**languagePairList**](docs/TransformApi.md#languagePairList) | **GET** /transform/list/pair/{from}/{to} | Lists the tools available for a language pair
*TransformApi* | [**listLanguagePairs**](docs/TransformApi.md#listLanguagePairs) | **GET** /transform/list/languagepairs | Lists the language pairs supported by the back-end
*TransformApi* | [**toolLanguagePairsList**](docs/TransformApi.md#toolLanguagePairsList) | **GET** /transform/list/tool/{tool}/{from} | Lists the tools and language pairs available for the given tool category
*TransformApi* | [**toolLanguagePairsList_0**](docs/TransformApi.md#toolLanguagePairsList_0) | **GET** /transform/list/tool/{tool}/{from}/{to} | Lists the tools and language pairs available for the given tool category
*UniqueDevicesDataApi* | [**getByProjectAndDateRange**](docs/UniqueDevicesDataApi.md#getByProjectAndDateRange) | **GET** /metrics/unique-devices/{project}/{access-site}/{granularity}/{start}/{end} | Get unique devices count per project


## Documentation for Models

 - [AbsoluteBytesDifference](docs/AbsoluteBytesDifference.md)
 - [AbsoluteBytesDifferenceItemsInner](docs/AbsoluteBytesDifferenceItemsInner.md)
 - [AbsoluteBytesDifferenceItemsInnerResultsInner](docs/AbsoluteBytesDifferenceItemsInnerResultsInner.md)
 - [AbsoluteBytesDifferencePerEditor](docs/AbsoluteBytesDifferencePerEditor.md)
 - [AbsoluteBytesDifferencePerEditorItemsInner](docs/AbsoluteBytesDifferencePerEditorItemsInner.md)
 - [AbsoluteBytesDifferencePerPage](docs/AbsoluteBytesDifferencePerPage.md)
 - [AbsoluteBytesDifferencePerPageItemsInner](docs/AbsoluteBytesDifferencePerPageItemsInner.md)
 - [Availability](docs/Availability.md)
 - [ByCountry](docs/ByCountry.md)
 - [ByCountryItemsInner](docs/ByCountryItemsInner.md)
 - [ByCountryItemsInnerCountriesInner](docs/ByCountryItemsInnerCountriesInner.md)
 - [CxDict](docs/CxDict.md)
 - [CxDictTranslationsInner](docs/CxDictTranslationsInner.md)
 - [CxLanguagepairs](docs/CxLanguagepairs.md)
 - [CxListTools](docs/CxListTools.md)
 - [CxMt](docs/CxMt.md)
 - [EditedPages](docs/EditedPages.md)
 - [EditedPagesItemsInner](docs/EditedPagesItemsInner.md)
 - [EditedPagesItemsInnerResultsInner](docs/EditedPagesItemsInnerResultsInner.md)
 - [Editors](docs/Editors.md)
 - [EditorsItemsInner](docs/EditorsItemsInner.md)
 - [EditorsItemsInnerResultsInner](docs/EditorsItemsInnerResultsInner.md)
 - [Edits](docs/Edits.md)
 - [EditsItemsInner](docs/EditsItemsInner.md)
 - [EditsItemsInnerResultsInner](docs/EditsItemsInnerResultsInner.md)
 - [EditsPerEditor](docs/EditsPerEditor.md)
 - [EditsPerEditorItemsInner](docs/EditsPerEditorItemsInner.md)
 - [EditsPerPage](docs/EditsPerPage.md)
 - [EditsPerPageItemsInner](docs/EditsPerPageItemsInner.md)
 - [Listing](docs/Listing.md)
 - [MathCheckFormulaRequest](docs/MathCheckFormulaRequest.md)
 - [NetBytesDifference](docs/NetBytesDifference.md)
 - [NetBytesDifferenceItemsInner](docs/NetBytesDifferenceItemsInner.md)
 - [NetBytesDifferenceItemsInnerResultsInner](docs/NetBytesDifferenceItemsInnerResultsInner.md)
 - [NetBytesDifferencePerEditor](docs/NetBytesDifferencePerEditor.md)
 - [NetBytesDifferencePerEditorItemsInner](docs/NetBytesDifferencePerEditorItemsInner.md)
 - [NetBytesDifferencePerPage](docs/NetBytesDifferencePerPage.md)
 - [NetBytesDifferencePerPageItemsInner](docs/NetBytesDifferencePerPageItemsInner.md)
 - [NewPages](docs/NewPages.md)
 - [NewPagesItemsInner](docs/NewPagesItemsInner.md)
 - [NewPagesItemsInnerResultsInner](docs/NewPagesItemsInnerResultsInner.md)
 - [NewRegisteredUsers](docs/NewRegisteredUsers.md)
 - [NewRegisteredUsersItemsInner](docs/NewRegisteredUsersItemsInner.md)
 - [NewRegisteredUsersItemsInnerResultsInner](docs/NewRegisteredUsersItemsInnerResultsInner.md)
 - [Originalimage](docs/Originalimage.md)
 - [PagecountsProject](docs/PagecountsProject.md)
 - [PagecountsProjectItemsInner](docs/PagecountsProjectItemsInner.md)
 - [PageviewArticle](docs/PageviewArticle.md)
 - [PageviewArticleItemsInner](docs/PageviewArticleItemsInner.md)
 - [PageviewProject](docs/PageviewProject.md)
 - [PageviewProjectItemsInner](docs/PageviewProjectItemsInner.md)
 - [PageviewTops](docs/PageviewTops.md)
 - [PageviewTopsItemsInner](docs/PageviewTopsItemsInner.md)
 - [PageviewTopsItemsInnerArticlesInner](docs/PageviewTopsItemsInnerArticlesInner.md)
 - [Problem](docs/Problem.md)
 - [Summary](docs/Summary.md)
 - [SummaryCoordinates](docs/SummaryCoordinates.md)
 - [Thumbnail](docs/Thumbnail.md)
 - [TopEditedPagesByAbsBytesDiff](docs/TopEditedPagesByAbsBytesDiff.md)
 - [TopEditedPagesByAbsBytesDiffItemsInner](docs/TopEditedPagesByAbsBytesDiffItemsInner.md)
 - [TopEditedPagesByAbsBytesDiffItemsInnerResultsInner](docs/TopEditedPagesByAbsBytesDiffItemsInnerResultsInner.md)
 - [TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner](docs/TopEditedPagesByAbsBytesDiffItemsInnerResultsInnerTopInner.md)
 - [TopEditedPagesByEdits](docs/TopEditedPagesByEdits.md)
 - [TopEditedPagesByEditsItemsInner](docs/TopEditedPagesByEditsItemsInner.md)
 - [TopEditedPagesByEditsItemsInnerResultsInner](docs/TopEditedPagesByEditsItemsInnerResultsInner.md)
 - [TopEditedPagesByEditsItemsInnerResultsInnerTopInner](docs/TopEditedPagesByEditsItemsInnerResultsInnerTopInner.md)
 - [TopEditedPagesByNetBytesDiff](docs/TopEditedPagesByNetBytesDiff.md)
 - [TopEditedPagesByNetBytesDiffItemsInner](docs/TopEditedPagesByNetBytesDiffItemsInner.md)
 - [TopEditedPagesByNetBytesDiffItemsInnerResultsInner](docs/TopEditedPagesByNetBytesDiffItemsInnerResultsInner.md)
 - [TopEditedPagesByNetBytesDiffItemsInnerResultsInnerTopInner](docs/TopEditedPagesByNetBytesDiffItemsInnerResultsInnerTopInner.md)
 - [TopEditorsByAbsBytesDiff](docs/TopEditorsByAbsBytesDiff.md)
 - [TopEditorsByAbsBytesDiffItemsInner](docs/TopEditorsByAbsBytesDiffItemsInner.md)
 - [TopEditorsByAbsBytesDiffItemsInnerResultsInner](docs/TopEditorsByAbsBytesDiffItemsInnerResultsInner.md)
 - [TopEditorsByAbsBytesDiffItemsInnerResultsInnerTopInner](docs/TopEditorsByAbsBytesDiffItemsInnerResultsInnerTopInner.md)
 - [TopEditorsByEdits](docs/TopEditorsByEdits.md)
 - [TopEditorsByEditsItemsInner](docs/TopEditorsByEditsItemsInner.md)
 - [TopEditorsByEditsItemsInnerResultsInner](docs/TopEditorsByEditsItemsInnerResultsInner.md)
 - [TopEditorsByEditsItemsInnerResultsInnerTopInner](docs/TopEditorsByEditsItemsInnerResultsInnerTopInner.md)
 - [TopEditorsByNetBytesDiff](docs/TopEditorsByNetBytesDiff.md)
 - [TopEditorsByNetBytesDiffItemsInner](docs/TopEditorsByNetBytesDiffItemsInner.md)
 - [TopEditorsByNetBytesDiffItemsInnerResultsInner](docs/TopEditorsByNetBytesDiffItemsInnerResultsInner.md)
 - [TopEditorsByNetBytesDiffItemsInnerResultsInnerTopInner](docs/TopEditorsByNetBytesDiffItemsInnerResultsInnerTopInner.md)
 - [TransformContentMachineTranslateRequest](docs/TransformContentMachineTranslateRequest.md)
 - [UniqueDevices](docs/UniqueDevices.md)
 - [UniqueDevicesItemsInner](docs/UniqueDevicesItemsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
