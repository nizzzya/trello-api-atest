package com.swager;

import com.github.javafaker.Faker;
import com.jira.api.controller.CardController;
import com.jira.api.mode.CardDto;
import com.jira.api.mode.card.response.CardResponse;
import com.jira.api.resources.DataConstants;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CardTest {

    Faker faker = new Faker();

    @Test
    @DisplayName("Create a new Card")
    void createNewCard() {
        var dto = new CardDto(DataConstants.idListForTestWithCards, faker.name().name());
        Response createCard = new CardController()
                .createNewCard(dto);
        createCard
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @DisplayName("Get card by ID")
    void getCardById() {
//        Setup for create a new card
        var dto = new CardDto(DataConstants.idListForTestWithCards, faker.name().name());
        Response createCard = new CardController()
                .createNewCard(dto);
//        Geg Response and actual ID of Card
        CardResponse createdCard = createCard.as(CardResponse.class);
        var cardId = createdCard.getId();
        var targetName = createdCard.getName();

        Response getCardById = new CardController()
                .getCardById(cardId);
        CardResponse actualCard = getCardById.as(CardResponse.class);

        Assertions.assertEquals(createdCard.getName(), actualCard.getName());
        Assertions.assertEquals(200, getCardById.statusCode());



    }




}
