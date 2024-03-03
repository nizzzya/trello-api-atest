package com.jira.api.controller;

import com.jira.api.mode.CardDto;
import com.jira.api.resources.DataConstants;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CardController extends BaseController {

    private RequestSpecification cardApi() {
        return baseApiClient(DataConstants.baseCardApi);
    }

    public Response createNewCard(CardDto cardDto) {
        return cardApi()
                .body(cardDto)
                .post();
    }

    public Response getCardById(String targetCardId) {
        return cardApi()
                .body(new CardDto())
                .get("{id}", targetCardId);
    }

    public Response updateCardById(CardDto cardDto, int targetCardId) {
        return cardApi()
                .body(cardDto)
                .put("{id}", targetCardId);
    }

    public Response deleteCardById(int targetCardId) {
        return cardApi()
                .body(new CardDto())
                .delete("{id}", targetCardId);
    }
}
