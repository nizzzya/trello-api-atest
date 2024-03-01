package com.swager;

import com.jira.api.controller.CardController;
import com.jira.api.mode.CardDto;
import com.jira.api.resources.ConstantsData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
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
//        baseApiClient()
//                .body(dto)
//                .post("/cards")
//                .then().log().all()
//                .assertThat()
//                .statusCode(200);
        Response dtoCard = new CardController()
                .createNewCard(dto);
    }




}
