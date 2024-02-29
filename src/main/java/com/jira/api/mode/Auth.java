package com.jira.api.mode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jira.api.resources.ConstantsData;

public class Auth {
    @JsonProperty("key")
    protected String key = ConstantsData.key;

    @JsonProperty("token")
    protected String token = ConstantsData.token;
}
