package com.swager;

import com.jira.api.mode.CardDto;
import com.jira.api.resources.ConstantsData;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CardTest {

    @Test
    @DisplayName("Create a new ENTITY")
    void createSomeEntity() {
        var dto = new CardDto();
        dto.setIdList("65dc3c9b985276182bbb1b04");
        dto.setName("testNameNewCard");
        baseApiClient()
                .body(dto)
                .post("/cards")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @DisplayName("Get card by ID")
    void getCard() {
        baseApiClient()
                .body(new CardDto())
                .get("/cards/{id}","65e0e43461b6e61f02b978ac")
                .then()
                .assertThat()
                .statusCode(200);

    }

    @Test
    @DisplayName("Update card by ID")
    void  updateCard() {
        var dto = new CardDto();
        dto.setName("updateNameOfCard");
        baseApiClient()
                .body(dto)
                .put("/cards/{id}","65e0e43461b6e61f02b978ac")
                .then()
                .assertThat()
                .statusCode(200);

    }

    @Test
    @DisplayName("Delete card")
    void deleteCard() {
        baseApiClient()
                .body(new CardDto())
                .delete("/cards/{id}", "65e0e43461b6e61f02b978ac")
                .then()
                .assertThat()
                .statusCode(200);

    }

    private RequestSpecification baseApiClient() {
        return given()
                .baseUri(ConstantsData.baseUrl)
                .basePath("/1")
                .contentType(ContentType.JSON);
    }

}
