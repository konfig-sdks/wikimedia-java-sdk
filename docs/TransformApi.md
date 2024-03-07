# TransformApi

All URIs are relative to *https://wikimedia.org/api/rest_v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contentMachineTranslate**](TransformApi.md#contentMachineTranslate) | **POST** /transform/html/from/{from_lang}/to/{to_lang} | Machine-translate content |
| [**contentMachineTranslate_0**](TransformApi.md#contentMachineTranslate_0) | **POST** /transform/html/from/{from_lang}/to/{to_lang}/{provider} | Machine-translate content |
| [**getDictionaryMeaning**](TransformApi.md#getDictionaryMeaning) | **GET** /transform/word/from/{from_lang}/to/{to_lang}/{word} | Fetch the dictionary meaning of a word |
| [**getDictionaryMeaning_0**](TransformApi.md#getDictionaryMeaning_0) | **GET** /transform/word/from/{from_lang}/to/{to_lang}/{word}/{provider} | Fetch the dictionary meaning of a word |
| [**getListToolLanguagePairs**](TransformApi.md#getListToolLanguagePairs) | **GET** /transform/list/tool/{tool} | Lists the tools and language pairs available for the given tool category |
| [**languagePairList**](TransformApi.md#languagePairList) | **GET** /transform/list/pair/{from}/{to} | Lists the tools available for a language pair |
| [**listLanguagePairs**](TransformApi.md#listLanguagePairs) | **GET** /transform/list/languagepairs | Lists the language pairs supported by the back-end |
| [**toolLanguagePairsList**](TransformApi.md#toolLanguagePairsList) | **GET** /transform/list/tool/{tool}/{from} | Lists the tools and language pairs available for the given tool category |
| [**toolLanguagePairsList_0**](TransformApi.md#toolLanguagePairsList_0) | **GET** /transform/list/tool/{tool}/{from}/{to} | Lists the tools and language pairs available for the given tool category |


<a name="contentMachineTranslate"></a>
# **contentMachineTranslate**
> CxMt contentMachineTranslate(fromLang, toLang, transformContentMachineTranslateRequest).execute();

Machine-translate content

Fetches the machine translation for the posted content from the source to the destination language.  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String html = "html_example"; // The HTML content to translate
    String fromLang = "fromLang_example"; // The source language code
    String toLang = "toLang_example"; // The target language code
    try {
      CxMt result = client
              .transform
              .contentMachineTranslate(html, fromLang, toLang)
              .execute();
      System.out.println(result);
      System.out.println(result.getContents());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#contentMachineTranslate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CxMt> response = client
              .transform
              .contentMachineTranslate(html, fromLang, toLang)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#contentMachineTranslate");
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
| **fromLang** | **String**| The source language code | |
| **toLang** | **String**| The target language code | |
| **transformContentMachineTranslateRequest** | [**TransformContentMachineTranslateRequest**](TransformContentMachineTranslateRequest.md)|  | |

### Return type

[**CxMt**](CxMt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translated content |  -  |
| **0** | Error |  -  |

<a name="contentMachineTranslate_0"></a>
# **contentMachineTranslate_0**
> CxMt contentMachineTranslate_0(fromLang, toLang, provider, transformContentMachineTranslateRequest).execute();

Machine-translate content

Fetches the machine translation for the posted content from the source to the destination language.  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String html = "html_example"; // The HTML content to translate
    String fromLang = "fromLang_example"; // The source language code
    String toLang = "toLang_example"; // The target language code
    String provider = "Apertium"; // The machine translation provider id
    try {
      CxMt result = client
              .transform
              .contentMachineTranslate_0(html, fromLang, toLang, provider)
              .execute();
      System.out.println(result);
      System.out.println(result.getContents());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#contentMachineTranslate_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CxMt> response = client
              .transform
              .contentMachineTranslate_0(html, fromLang, toLang, provider)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#contentMachineTranslate_0");
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
| **fromLang** | **String**| The source language code | |
| **toLang** | **String**| The target language code | |
| **provider** | **String**| The machine translation provider id | [enum: Apertium, Yandex, Youdao] |
| **transformContentMachineTranslateRequest** | [**TransformContentMachineTranslateRequest**](TransformContentMachineTranslateRequest.md)|  | |

### Return type

[**CxMt**](CxMt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translated content |  -  |
| **0** | Error |  -  |

<a name="getDictionaryMeaning"></a>
# **getDictionaryMeaning**
> CxDict getDictionaryMeaning(fromLang, toLang, word).execute();

Fetch the dictionary meaning of a word

Fetches the dictionary meaning of a word from a language and displays it in the target language.  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String fromLang = "fromLang_example"; // The source language code
    String toLang = "toLang_example"; // The target language code
    String word = "word_example"; // The word to lookup
    try {
      CxDict result = client
              .transform
              .getDictionaryMeaning(fromLang, toLang, word)
              .execute();
      System.out.println(result);
      System.out.println(result.getSource());
      System.out.println(result.getTranslations());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#getDictionaryMeaning");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CxDict> response = client
              .transform
              .getDictionaryMeaning(fromLang, toLang, word)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#getDictionaryMeaning");
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
| **fromLang** | **String**| The source language code | |
| **toLang** | **String**| The target language code | |
| **word** | **String**| The word to lookup | |

### Return type

[**CxDict**](CxDict.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the dictionary translation for the given word |  -  |
| **0** | Error |  -  |

<a name="getDictionaryMeaning_0"></a>
# **getDictionaryMeaning_0**
> CxDict getDictionaryMeaning_0(fromLang, toLang, word, provider).execute();

Fetch the dictionary meaning of a word

Fetches the dictionary meaning of a word from a language and displays it in the target language.  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String fromLang = "fromLang_example"; // The source language code
    String toLang = "toLang_example"; // The target language code
    String word = "word_example"; // The word to lookup
    String provider = "JsonDict"; // The dictionary provider id
    try {
      CxDict result = client
              .transform
              .getDictionaryMeaning_0(fromLang, toLang, word, provider)
              .execute();
      System.out.println(result);
      System.out.println(result.getSource());
      System.out.println(result.getTranslations());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#getDictionaryMeaning_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CxDict> response = client
              .transform
              .getDictionaryMeaning_0(fromLang, toLang, word, provider)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#getDictionaryMeaning_0");
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
| **fromLang** | **String**| The source language code | |
| **toLang** | **String**| The target language code | |
| **word** | **String**| The word to lookup | |
| **provider** | **String**| The dictionary provider id | [enum: JsonDict, Dictd] |

### Return type

[**CxDict**](CxDict.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the dictionary translation for the given word |  -  |
| **0** | Error |  -  |

<a name="getListToolLanguagePairs"></a>
# **getListToolLanguagePairs**
> Object getListToolLanguagePairs(tool).execute();

Lists the tools and language pairs available for the given tool category

Fetches the list of tools and all of the language pairs it can translate  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String tool = "mt"; // The tool category to list tools and language pairs for
    try {
      Object result = client
              .transform
              .getListToolLanguagePairs(tool)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#getListToolLanguagePairs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .transform
              .getListToolLanguagePairs(tool)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#getListToolLanguagePairs");
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
| **tool** | **String**| The tool category to list tools and language pairs for | [enum: mt, dictionary] |

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
| **200** | the list of language pairs available for a given translation tool |  -  |
| **0** | Error |  -  |

<a name="languagePairList"></a>
# **languagePairList**
> CxListTools languagePairList(from, to).execute();

Lists the tools available for a language pair

Fetches the list of tools that are available for the given pair of languages.  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String from = "from_example"; // The source language code
    String to = "to_example"; // The target language code
    try {
      CxListTools result = client
              .transform
              .languagePairList(from, to)
              .execute();
      System.out.println(result);
      System.out.println(result.getTools());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#languagePairList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CxListTools> response = client
              .transform
              .languagePairList(from, to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#languagePairList");
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
| **from** | **String**| The source language code | |
| **to** | **String**| The target language code | |

### Return type

[**CxListTools**](CxListTools.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the list of tools available for the language pair |  -  |
| **0** | Error |  -  |

<a name="listLanguagePairs"></a>
# **listLanguagePairs**
> CxLanguagepairs listLanguagePairs().execute();

Lists the language pairs supported by the back-end

Fetches the list of language pairs the back-end service can translate  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    try {
      CxLanguagepairs result = client
              .transform
              .listLanguagePairs()
              .execute();
      System.out.println(result);
      System.out.println(result.getSource());
      System.out.println(result.getTarget());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#listLanguagePairs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CxLanguagepairs> response = client
              .transform
              .listLanguagePairs()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#listLanguagePairs");
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

[**CxLanguagepairs**](CxLanguagepairs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the list of source and target languages supported by the API |  -  |

<a name="toolLanguagePairsList"></a>
# **toolLanguagePairsList**
> Object toolLanguagePairsList(tool, from).execute();

Lists the tools and language pairs available for the given tool category

Fetches the list of tools and all of the language pairs it can translate  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String tool = "mt"; // The tool category to list tools and language pairs for
    String from = "from_example"; // The source language code
    try {
      Object result = client
              .transform
              .toolLanguagePairsList(tool, from)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#toolLanguagePairsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .transform
              .toolLanguagePairsList(tool, from)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#toolLanguagePairsList");
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
| **tool** | **String**| The tool category to list tools and language pairs for | [enum: mt, dictionary] |
| **from** | **String**| The source language code | |

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
| **200** | the list of language pairs available for a given translation tool |  -  |
| **0** | Error |  -  |

<a name="toolLanguagePairsList_0"></a>
# **toolLanguagePairsList_0**
> Object toolLanguagePairsList_0(tool, from, to).execute();

Lists the tools and language pairs available for the given tool category

Fetches the list of tools and all of the language pairs it can translate  Stability: [unstable](https://www.mediawiki.org/wiki/API_versioning#Unstable) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Wikimedia;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransformApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://wikimedia.org/api/rest_v1";
    Wikimedia client = new Wikimedia(configuration);
    String tool = "mt"; // The tool category to list tools and language pairs for
    String from = "from_example"; // The source language code
    String to = "to_example"; // The target language code
    try {
      Object result = client
              .transform
              .toolLanguagePairsList_0(tool, from, to)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#toolLanguagePairsList_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .transform
              .toolLanguagePairsList_0(tool, from, to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformApi#toolLanguagePairsList_0");
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
| **tool** | **String**| The tool category to list tools and language pairs for | [enum: mt, dictionary] |
| **from** | **String**| The source language code | |
| **to** | **String**| The target language code | |

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
| **200** | the list of language pairs available for a given translation tool |  -  |
| **0** | Error |  -  |

