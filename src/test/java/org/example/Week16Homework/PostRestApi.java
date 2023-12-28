package org.example.Week16Homework;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRestApi {

    ValidatableResponse validatableResponse;
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;

    @Test
    public void createUser() {

        String jsonData = "{\"firstname\":\"xyz\",\"lastname\":\"Wilson\",\"totalprice\":272,\"depositpaid\":false,\"bookingdates\":{\"checkin\":\"2016-09-28\",\"checkout\":\"2023-12-13\"}}";

        validatableResponse = given()
                .contentType(ContentType.JSON)
                .body(jsonData)
                .post("https://restful-booker.herokuapp.com/booking")
                .then()
                .statusCode(200);
//                .body("data.firstname", equalTo("abc"));

        System.out.println(validatableResponse.extract().asPrettyString());
    }


}
