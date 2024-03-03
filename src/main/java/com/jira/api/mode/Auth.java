package com.jira.api.mode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jira.api.resources.AuthConstans;

public class Auth extends AuthConstans {
    @JsonProperty("key")
    protected String key = AuthConstans.key;

    @JsonProperty("token")
    protected String token = AuthConstans.token;
}
