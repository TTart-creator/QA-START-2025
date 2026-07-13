package org.prog.session22;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class RestTest2 {
    @Test
    public void myRestTest2() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://randomuser.me/");
        requestSpecification.basePath("api/");
        requestSpecification.queryParam("inc", "location,number,name,coordinates");
        requestSpecification.queryParam("results", 4);
        requestSpecification.queryParam("noinfo");
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.get();
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.contentType(ContentType.JSON);
        validatableResponse.body("results.location", Matchers.hasItem("number"));
        validatableResponse.body("results.location", Matchers.hasItem("name"));
        validatableResponse.body("results.location", Matchers.hasItem("coordinates"));


               /* List<String> values = response.jsonPath()
                .get("results.findAll {it.gender == 'female' } ");
        System.out.println(values.size());*/
    }
}


