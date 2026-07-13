package org.prog.session20.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session9.ResultsDto;

public class RestStepsTT {

    public static ResultsDto response;

    @Given("request {int} random people from API")
    public void requestPersonfromAPI(int amount) {
        Response respones = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "gender,name,nat")
                .queryParam("results", amount)
                .queryParam("noinfo")
                .get();
        respones.prettyPrint();
        RestStepsTT.response = respones.as(ResultsDto.class);
    }
}
