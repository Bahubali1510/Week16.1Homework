package org.example.Week16Homework;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/*
* PUT is a method of modifying resources where the client sends data that updates the entire resource.

PATCH is a method of modifying resources where the client sends partial data that is to be updated without modifying the entire data.*/

public class PutRestApi {

    ValidatableResponse validatableResponse;
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;


    @Test
    public void updateEmployeeBdd() {

        String jsonData = "{\"firstname\":\"Jim\",\"lastname\":\"Wilson\",\"totalprice\":272,\"depositpaid\":false,\"bookingdates\":{\"checkin\":\"2016-09-28\",\"checkout\":\"2023-12-13\"}}";

        given()
                .baseUri("https://restful-booker.herokuapp.com/booking/2608")
                .contentType(ContentType.JSON)
                .body(jsonData)
                .put("/update/2608")
                .then().statusCode(200);

    }



}
