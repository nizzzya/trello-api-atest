package com.jira.api.controller;

import com.jira.api.resources.DataConstants;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public abstract class BaseController {
    public RequestSpecification baseApiClient(String basePath) {
        return given()
                .baseUri(DataConstants.base_uri)
                .basePath(basePath)
                .contentType(ContentType.JSON);
    }
}
