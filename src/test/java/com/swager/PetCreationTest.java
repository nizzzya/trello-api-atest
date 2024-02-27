package com.swager;

import com.jira.api.resources.ConstantsData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PetCreationTest {

    @Test
    @DisplayName("Create a new ENTITY")
    void CreateSomeEntity() {
//        var post = baseApiClient()
//                .body("{\n" +
//                        "  \"name\" : \"SecondList\",\n" +
//                        "  \"idBoard\" : \"65d8444a904ccc6fd3c3c542\",\n" +
//                        "  \"key\" : \"" + ConstantsData.key + "\",\n" +
//                        "  \"token\" : \"" + ConstantsData.token + "\"\n" +
//                        "}").log().all()
//                .when()
//                .post("/lists");
//        post.prettyPrint();
//
//                post.then().log().all()
//                .assertThat()
//                .statusCode(200);

        baseApiClient()
                        .get("/lists/{id}", "65d8444a904ccc6fd3c3c542");


    }

    private RequestSpecification baseApiClient() {
        return given()
                .baseUri(ConstantsData.baseUrl)
                .basePath("/1")
                .contentType(ContentType.JSON);
    }

}
