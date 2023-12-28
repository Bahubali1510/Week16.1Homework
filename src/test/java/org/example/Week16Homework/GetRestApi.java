package org.example.Week16Homework;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRestApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void getBooking(){
        given().log().all()
                .when()
                .get("https://restful-booker.herokuapp.com/booking")
                .then().log().all()
                .statusCode(200);

    }



    @Test
    public void test() {
        Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking/1");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("Content Type"));
    }
    }






