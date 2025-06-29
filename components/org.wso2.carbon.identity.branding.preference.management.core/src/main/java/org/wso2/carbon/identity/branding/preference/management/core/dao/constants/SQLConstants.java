/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.branding.preference.management.core.dao.constants;

/**
 * SQL constants used for custom content managing DAO operations.
 */
public class SQLConstants {

    // --- ORG CUSTOM CONTENT ---
    public static final String INSERT_ORG_CUSTOM_CONTENT_SQL = "INSERT INTO IDN_CUSTOM_CONTENT_ORG " +
            "(CONTENT, CONTENT_TYPE, TENANT_ID) VALUES (:CONTENT;, :CONTENT_TYPE;, :TENANT_ID;)";
    public static final String GET_ORG_CUSTOM_CONTENT_SQL = "SELECT CONTENT, CONTENT_TYPE FROM " +
                    "IDN_CUSTOM_CONTENT_ORG WHERE TENANT_ID = :TENANT_ID;";
    public static final String DELETE_ORG_CUSTOM_CONTENT_SQL =
            "DELETE FROM IDN_CUSTOM_CONTENT_ORG WHERE TENANT_ID = :TENANT_ID;";

    // --- APP CUSTOM CONTENT ---
    public static final String INSERT_APP_CUSTOM_CONTENT_SQL = "INSERT INTO IDN_CUSTOM_CONTENT_APP " +
                    "(CONTENT, CONTENT_TYPE, APP_ID, TENANT_ID) VALUES (:CONTENT;, :CONTENT_TYPE;, :APP_ID;, " +
                    ":TENANT_ID;)";
    public static final String GET_APP_CUSTOM_CONTENT_SQL = "SELECT CONTENT, CONTENT_TYPE FROM " +
            "IDN_CUSTOM_CONTENT_APP WHERE APP_ID = :APP_ID; AND TENANT_ID = :TENANT_ID;";
    public static final String DELETE_APP_CUSTOM_CONTENT_SQL =
            "DELETE FROM IDN_CUSTOM_CONTENT_APP WHERE APP_ID = :APP_ID; AND TENANT_ID = :TENANT_ID;";

    /**
     * Grouping of constants related to database table names.
     */
    public static class CustomContentTableColumns {

        public static final String TENANT_ID = "TENANT_ID";
        public static final String CONTENT = "CONTENT";
        public static final String CONTENT_TYPE = "CONTENT_TYPE";
        public static final String APP_ID = "APP_ID";
    }
}
