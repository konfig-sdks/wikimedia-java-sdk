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


package com.konfigthis.client.auth;

import com.konfigthis.client.Pair;
import com.konfigthis.client.ApiException;

import okhttp3.Credentials;

import java.util.Map;
import java.util.List;

import java.io.UnsupportedEncodingException;

public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                              String payload, String method) throws ApiException {
        if (username == null && password == null) {
            return;
        }
        headerParams.put("Authorization", Credentials.basic(
            username == null ? "" : username,
            password == null ? "" : password));
    }
}
