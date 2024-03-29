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
import com.konfigthis.client.model.ByCountry;
import com.konfigthis.client.model.PageviewArticle;
import com.konfigthis.client.model.PageviewProject;
import com.konfigthis.client.model.PageviewTops;
import com.konfigthis.client.model.Problem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PageviewsDataApi
 */
@Disabled
public class PageviewsDataApiTest {

    private static PageviewsDataApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PageviewsDataApi(apiClient);
    }

    /**
     * Get pageview counts for a page.
     *
     * Given a Mediawiki article and a date range, returns a daily timeseries of its pageview counts. You can also filter by access method and/or agent type.  - Stability: [stable](https://www.mediawiki.org/wiki/API_versioning#Stable) - Rate limit: 100 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPageviewCountsByArticleDateRangeTest() throws ApiException {
        String project = null;
        String access = null;
        String agent = null;
        String article = null;
        String granularity = null;
        String start = null;
        String end = null;
        Object response = api.getPageviewCountsByArticleDateRange(project, access, agent, article, granularity, start, end)
                .execute();
        // TODO: test validations
    }

    /**
     * Get pageview counts for a project.
     *
     * Given a date range, returns a timeseries of pageview counts. You can filter by project, access method and/or agent type. You can choose between daily and hourly granularity as well.  - Stability: [stable](https://www.mediawiki.org/wiki/API_versioning#Stable) - Rate limit: 100 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPageviewCountsByProjectTest() throws ApiException {
        String project = null;
        String access = null;
        String agent = null;
        String granularity = null;
        String start = null;
        String end = null;
        Object response = api.getPageviewCountsByProject(project, access, agent, granularity, start, end)
                .execute();
        // TODO: test validations
    }

    /**
     * Get pageviews by country and access method.
     *
     * Lists the pageviews to this project, split by country of origin for a given month. Because of privacy reasons, pageviews are given in a bucketed format, and countries with less than 100 views do not get reported. Stability: [experimental](https://www.mediawiki.org/wiki/API_versioning#Experimental) - Rate limit: 100 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listByCountryAndAccessTest() throws ApiException {
        String project = null;
        String access = null;
        String year = null;
        String month = null;
        Object response = api.listByCountryAndAccess(project, access, year, month)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the most viewed articles for a project.
     *
     * Lists the 1000 most viewed articles for a given project and timespan (month or day). You can filter by access method.  - Stability: [stable](https://www.mediawiki.org/wiki/API_versioning#Stable) - Rate limit: 100 req/s - License: Data accessible via this endpoint is available under the   [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMostViewedArticlesByProjectAndTimespanTest() throws ApiException {
        String project = null;
        String access = null;
        String year = null;
        String month = null;
        String day = null;
        Object response = api.listMostViewedArticlesByProjectAndTimespan(project, access, year, month, day)
                .execute();
        // TODO: test validations
    }

}
