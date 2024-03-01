package com.jira.api.controller;

import com.jira.api.mode.CardDto;
import com.jira.api.resources.ConstantsData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CardController {
    private RequestSpecification baseApiClient() {
        return given()
                .baseUri(ConstantsData.base_uri)
                .basePath("/1")
                .contentType(ContentType.JSON);
    }
    public Response createNewCard(CardDto cardDto) {
        var dto = new CardDto();
        dto.setIdList("65dc3c9b985276182bbb1b04");
        dto.setName("testNameNewCard");
        return baseApiClient()
                .body(dto)
                .post("/cards");
    }

    public Response getCardById(int targetCardId){
        return baseApiClient()
                .body(new CardDto())
                .get("/cards/{id}",targetCardId);
    }

    public Response updateCardById(int targetCardId){
        var dto = new CardDto();
        dto.setName("updateNameOfCard");
        return baseApiClient()
                .body(dto)
                .put("/cards/{id}","65e0e43461b6e61f02b978ac");
    }

    public Response deleteCardById(int targetCardId){
        return baseApiClient()
                        .body(new CardDto())
                        .delete("/cards/{id}", "65e0e43461b6e61f02b978ac");
    }
}
