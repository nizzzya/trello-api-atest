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

        Response actualCard = new CardController()
                .getCardById(DataConstants.ifCardForTestGetUpdate);

        CardResponse cardData = actualCard.as(CardResponse.class);

        Assertions.assertEquals(200, actualCard.statusCode());
        Assertions.assertEquals(cardData.getId(), DataConstants.ifCardForTestGetUpdate);
        Assertions.assertEquals(cardData.getIdList(), DataConstants.idListForTestWithCards);

    }

    @Test
    @DisplayName("Update card")
    void updateCardByID() {
        var targetName = faker.name().name();
        var dto = new CardDto(targetName);
//        Get old data regarding card
        Response oldCard = new CardController().getCardById(DataConstants.ifCardForTestGetUpdate);
        CardResponse oldCardData = oldCard.as(CardResponse.class);
        var oldName = oldCardData.getName();
//        Update card
        Response newCard = new CardController()
                .updateCardById(dto, DataConstants.ifCardForTestGetUpdate);
//        Get new data of card
        Response actualCard = new CardController().getCardById(DataConstants.ifCardForTestGetUpdate);
        CardResponse cardDataUpdate = actualCard.as(CardResponse.class);
        var actualName = cardDataUpdate.getName();

        Assertions.assertEquals(targetName, actualName);
        Assertions.assertNotEquals(oldName, actualName);
        Assertions.assertEquals(200, newCard.statusCode());

    }

    @Test
    @DisplayName("Delete card")
    void deleteCardByID() {
//        Setup for create a new card
        var dto = new CardDto(DataConstants.idListForTestWithCards, faker.name().name());
        Response createCard = new CardController()
                .createNewCard(dto);
//        Geg Response and actual ID of Card
        CardResponse createdCard = createCard.as(CardResponse.class);
        var cardId = createdCard.getId();

        Response delete = new CardController()
                .deleteCardById(cardId);

        delete
                .then()
                .assertThat()
                .statusCode(200);

    }




}
