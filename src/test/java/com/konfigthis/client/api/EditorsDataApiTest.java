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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Editors;
import com.konfigthis.client.model.Problem;
import com.konfigthis.client.model.TopEditorsByAbsBytesDiff;
import com.konfigthis.client.model.TopEditorsByEdits;
import com.konfigthis.client.model.TopEditorsByNetBytesDiff;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EditorsDataApi
 */
@Disabled
public class EditorsDataApiTest {

    private static EditorsDataApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EditorsDataApi(apiClient);
    }

    /**
     * Get editors counts for a project.
     *
     * Given a Mediawiki project and a date range, returns a timeseries of its editors counts. You can filter by editory-type (all-editor-types, anonymous, group-bot, name-bot, user), page-type (all-page-types, content or non-content) or activity-level (1..4-edits, 5..24-edits, 25..99-edits or 100..-edits). You can choose between daily and monthly granularity as well.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEditorsCountsForProjectTest() throws ApiException {
        String project = null;
        String editorType = null;
        String pageType = null;
        String activityLevel = null;
        String granularity = null;
        String start = null;
        String end = null;
        Object response = api.getEditorsCountsForProject(project, editorType, pageType, activityLevel, granularity, start, end)
                .execute();
        // TODO: test validations
    }

    /**
     * Get top 100 editors by absolute bytes-difference.
     *
     * Given a Mediawiki project and a date (day or month), returns a timeseries of the top 100 editors by absolute bytes-difference. You can filter by editor-type (all-editor-types, anonymous, group-bot, name-bot, user) or page-type (all-page-types, content or non-content). The user_text returned is either the mediawiki user_text if the user is registered, or null if user is anonymous.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopByAbsoluteBytesDifferenceTest() throws ApiException {
        String project = null;
        String editorType = null;
        String pageType = null;
        String year = null;
        String month = null;
        String day = null;
        Object response = api.getTopByAbsoluteBytesDifference(project, editorType, pageType, year, month, day)
                .execute();
        // TODO: test validations
    }

    /**
     * Get top 100 editors by net bytes-difference.
     *
     * Given a Mediawiki project and a date (day or month), returns a timeseries of the top 100 editors by net bytes-difference. You can filter by editor-type (all-editor-types, anonymous, group-bot, name-bot, user) or page-type (all-page-types, content or non-content). The user_text returned is either the mediawiki user_text if the user is registered, or \&quot;Anonymous Editor\&quot; if user is anonymous.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopByNetBytesDifferenceTest() throws ApiException {
        String project = null;
        String editorType = null;
        String pageType = null;
        String year = null;
        String month = null;
        String day = null;
        Object response = api.getTopByNetBytesDifference(project, editorType, pageType, year, month, day)
                .execute();
        // TODO: test validations
    }

    /**
     * Get top 100 editors by edits count.
     *
     * Given a Mediawiki project and a date (day or month), returns a timeseries of the top 100 editors by edits count. You can filter by editor-type (all-editor-types, anonymous, group-bot, name-bot, user) or page-type (all-page-types, content or non-content). The user_text returned is either the mediawiki user_text if the user is registered, or null if user is anonymous.  - Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 25 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopEditorsByEditsCountTest() throws ApiException {
        String project = null;
        String editorType = null;
        String pageType = null;
        String year = null;
        String month = null;
        String day = null;
        Object response = api.getTopEditorsByEditsCount(project, editorType, pageType, year, month, day)
                .execute();
        // TODO: test validations
    }

}
