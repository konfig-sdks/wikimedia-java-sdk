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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.Edits;
import com.konfigthis.client.model.EditsPerPage;
import com.konfigthis.client.model.Problem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EditsDataApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EditsDataApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EditsDataApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getEditsCountsForProjectCall(String project, String editorType, String pageType, String granularity, String start, String end, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/metrics/edits/aggregate/{project}/{editor-type}/{page-type}/{granularity}/{start}/{end}"
            .replace("{" + "project" + "}", localVarApiClient.escapeString(project.toString()))
            .replace("{" + "editor-type" + "}", localVarApiClient.escapeString(editorType.toString()))
            .replace("{" + "page-type" + "}", localVarApiClient.escapeString(pageType.toString()))
            .replace("{" + "granularity" + "}", localVarApiClient.escapeString(granularity.toString()))
            .replace("{" + "start" + "}", localVarApiClient.escapeString(start.toString()))
            .replace("{" + "end" + "}", localVarApiClient.escapeString(end.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEditsCountsForProjectValidateBeforeCall(String project, String editorType, String pageType, String granularity, String start, String end, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling getEditsCountsForProject(Async)");
        }

        // verify the required parameter 'editorType' is set
        if (editorType == null) {
            throw new ApiException("Missing the required parameter 'editorType' when calling getEditsCountsForProject(Async)");
        }

        // verify the required parameter 'pageType' is set
        if (pageType == null) {
            throw new ApiException("Missing the required parameter 'pageType' when calling getEditsCountsForProject(Async)");
        }

        // verify the required parameter 'granularity' is set
        if (granularity == null) {
            throw new ApiException("Missing the required parameter 'granularity' when calling getEditsCountsForProject(Async)");
        }

        // verify the required parameter 'start' is set
        if (start == null) {
            throw new ApiException("Missing the required parameter 'start' when calling getEditsCountsForProject(Async)");
        }

        // verify the required parameter 'end' is set
        if (end == null) {
            throw new ApiException("Missing the required parameter 'end' when calling getEditsCountsForProject(Async)");
        }

        return getEditsCountsForProjectCall(project, editorType, pageType, granularity, start, end, _callback);

    }


    private ApiResponse<Object> getEditsCountsForProjectWithHttpInfo(String project, String editorType, String pageType, String granularity, String start, String end) throws ApiException {
        okhttp3.Call localVarCall = getEditsCountsForProjectValidateBeforeCall(project, editorType, pageType, granularity, start, end, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getEditsCountsForProjectAsync(String project, String editorType, String pageType, String granularity, String start, String end, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEditsCountsForProjectValidateBeforeCall(project, editorType, pageType, granularity, start, end, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetEditsCountsForProjectRequestBuilder {
        private final String project;
        private final String editorType;
        private final String pageType;
        private final String granularity;
        private final String start;
        private final String end;

        private GetEditsCountsForProjectRequestBuilder(String project, String editorType, String pageType, String granularity, String start, String end) {
            this.project = project;
            this.editorType = editorType;
            this.pageType = pageType;
            this.granularity = granularity;
            this.start = start;
            this.end = end;
        }

        /**
         * Build call for getEditsCountsForProject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getEditsCountsForProjectCall(project, editorType, pageType, granularity, start, end, _callback);
        }


        /**
         * Execute getEditsCountsForProject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getEditsCountsForProjectWithHttpInfo(project, editorType, pageType, granularity, start, end);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getEditsCountsForProject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getEditsCountsForProjectWithHttpInfo(project, editorType, pageType, granularity, start, end);
        }

        /**
         * Execute getEditsCountsForProject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getEditsCountsForProjectAsync(project, editorType, pageType, granularity, start, end, _callback);
        }
    }

    /**
     * Get edits counts for a project.
     * Given a Mediawiki project and a date range, returns a timeseries of edits counts. You can filter by editors-type (all-editor-types, anonymous, bot, registered) and page-type (all-page-types, content or non-content). You can choose between daily and monthly granularity as well.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     * @param project The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off.  For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org. If you&#39;re interested in the aggregation of all projects, use all-projects.  (required)
     * @param editorType If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types.  (required)
     * @param pageType If you want to filter by page-type, use one of content (edits on pages in content namespaces) or non-content (edits on pages in non-content namespaces). If you are interested in edits regardless of their page-type, use all-page-types.  (required)
     * @param granularity The time unit for the response data. As of today, supported values are daily and monthly.  (required)
     * @param start The date of the first day to include, in YYYYMMDD format (required)
     * @param end The date of the last day to include, in YYYYMMDD format (required)
     * @return GetEditsCountsForProjectRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public GetEditsCountsForProjectRequestBuilder getEditsCountsForProject(String project, String editorType, String pageType, String granularity, String start, String end) throws IllegalArgumentException {
        if (project == null) throw new IllegalArgumentException("\"project\" is required but got null");
            

        if (editorType == null) throw new IllegalArgumentException("\"editorType\" is required but got null");
            

        if (pageType == null) throw new IllegalArgumentException("\"pageType\" is required but got null");
            

        if (granularity == null) throw new IllegalArgumentException("\"granularity\" is required but got null");
            

        if (start == null) throw new IllegalArgumentException("\"start\" is required but got null");
            

        if (end == null) throw new IllegalArgumentException("\"end\" is required but got null");
            

        return new GetEditsCountsForProjectRequestBuilder(project, editorType, pageType, granularity, start, end);
    }
    private okhttp3.Call getPageEditCountsCall(String project, String pageTitle, String editorType, String granularity, String start, String end, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/metrics/edits/per-page/{project}/{page-title}/{editor-type}/{granularity}/{start}/{end}"
            .replace("{" + "project" + "}", localVarApiClient.escapeString(project.toString()))
            .replace("{" + "page-title" + "}", localVarApiClient.escapeString(pageTitle.toString()))
            .replace("{" + "editor-type" + "}", localVarApiClient.escapeString(editorType.toString()))
            .replace("{" + "granularity" + "}", localVarApiClient.escapeString(granularity.toString()))
            .replace("{" + "start" + "}", localVarApiClient.escapeString(start.toString()))
            .replace("{" + "end" + "}", localVarApiClient.escapeString(end.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPageEditCountsValidateBeforeCall(String project, String pageTitle, String editorType, String granularity, String start, String end, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling getPageEditCounts(Async)");
        }

        // verify the required parameter 'pageTitle' is set
        if (pageTitle == null) {
            throw new ApiException("Missing the required parameter 'pageTitle' when calling getPageEditCounts(Async)");
        }

        // verify the required parameter 'editorType' is set
        if (editorType == null) {
            throw new ApiException("Missing the required parameter 'editorType' when calling getPageEditCounts(Async)");
        }

        // verify the required parameter 'granularity' is set
        if (granularity == null) {
            throw new ApiException("Missing the required parameter 'granularity' when calling getPageEditCounts(Async)");
        }

        // verify the required parameter 'start' is set
        if (start == null) {
            throw new ApiException("Missing the required parameter 'start' when calling getPageEditCounts(Async)");
        }

        // verify the required parameter 'end' is set
        if (end == null) {
            throw new ApiException("Missing the required parameter 'end' when calling getPageEditCounts(Async)");
        }

        return getPageEditCountsCall(project, pageTitle, editorType, granularity, start, end, _callback);

    }


    private ApiResponse<Object> getPageEditCountsWithHttpInfo(String project, String pageTitle, String editorType, String granularity, String start, String end) throws ApiException {
        okhttp3.Call localVarCall = getPageEditCountsValidateBeforeCall(project, pageTitle, editorType, granularity, start, end, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPageEditCountsAsync(String project, String pageTitle, String editorType, String granularity, String start, String end, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPageEditCountsValidateBeforeCall(project, pageTitle, editorType, granularity, start, end, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetPageEditCountsRequestBuilder {
        private final String project;
        private final String pageTitle;
        private final String editorType;
        private final String granularity;
        private final String start;
        private final String end;

        private GetPageEditCountsRequestBuilder(String project, String pageTitle, String editorType, String granularity, String start, String end) {
            this.project = project;
            this.pageTitle = pageTitle;
            this.editorType = editorType;
            this.granularity = granularity;
            this.start = start;
            this.end = end;
        }

        /**
         * Build call for getPageEditCounts
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getPageEditCountsCall(project, pageTitle, editorType, granularity, start, end, _callback);
        }


        /**
         * Execute getPageEditCounts request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getPageEditCountsWithHttpInfo(project, pageTitle, editorType, granularity, start, end);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getPageEditCounts request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getPageEditCountsWithHttpInfo(project, pageTitle, editorType, granularity, start, end);
        }

        /**
         * Execute getPageEditCounts request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getPageEditCountsAsync(project, pageTitle, editorType, granularity, start, end, _callback);
        }
    }

    /**
     * Get edit counts for a page in a project.
     * Given a Mediawiki project, a page-title prefixed with its canonical namespace (for instance &#39;User:Jimbo_Wales&#39;) and a date range, returns a timeseries of edit counts. You can filter by editors-type (all-editor-types, anonymous, group-bot, name-bot, user). You can choose between daily and monthly granularity as well.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     * @param project The name of any Wikimedia project formatted like {language code}.{project name}, for example en.wikipedia. You may pass en.wikipedia.org and the .org will be stripped off. For projects like commons without language codes, use commons.wikimedia. For projects like www.mediawiki.org, you can use that full string, or just use mediawiki or mediawiki.org.  (required)
     * @param pageTitle The page-title to request edits for. It should be prefixed with canonical namespace. Spaces will be converted to underscores.  (required)
     * @param editorType If you want to filter by editor-type, use one of anonymous, group-bot (registered accounts belonging to the bot group), name-bot (registered accounts not belonging to the bot group but having bot-like names) or user (registered account not in bot group nor having bot-like name). If you are interested in edits regardless of their editor-type, use all-editor-types.  (required)
     * @param granularity Time unit for the response data. As of today, supported values are daily and monthly  (required)
     * @param start The date of the first day to include, in YYYYMMDD format (required)
     * @param end The date of the last day to include, in YYYYMMDD format (required)
     * @return GetPageEditCountsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list of values </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public GetPageEditCountsRequestBuilder getPageEditCounts(String project, String pageTitle, String editorType, String granularity, String start, String end) throws IllegalArgumentException {
        if (project == null) throw new IllegalArgumentException("\"project\" is required but got null");
            

        if (pageTitle == null) throw new IllegalArgumentException("\"pageTitle\" is required but got null");
            

        if (editorType == null) throw new IllegalArgumentException("\"editorType\" is required but got null");
            

        if (granularity == null) throw new IllegalArgumentException("\"granularity\" is required but got null");
            

        if (start == null) throw new IllegalArgumentException("\"start\" is required but got null");
            

        if (end == null) throw new IllegalArgumentException("\"end\" is required but got null");
            

        return new GetPageEditCountsRequestBuilder(project, pageTitle, editorType, granularity, start, end);
    }
}
