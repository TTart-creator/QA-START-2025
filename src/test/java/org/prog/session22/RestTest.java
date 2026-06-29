package org.prog.session22;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.prog.session9.PersonDto;
import org.prog.session9.ResultsDto;

import java.util.List;

public class RestTest {
    @Test
    public void myRestTest() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://randomuser.me/");
        requestSpecification.basePath("api/");
        requestSpecification.queryParam("inc", "gender,name,nat");
        requestSpecification.queryParam("results", 3);
        requestSpecification.queryParam("noinfo");
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.get();
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.contentType(ContentType.JSON);
        validatableResponse.body("results.gender", Matchers.hasItem("female"));

   /*     response.prettyPrint();
        ResultsDto dto = response.as(ResultsDto.class);

        List<String> firstLastNames = dto.getResults().stream()
                .filter(p -> p.getGender().equals("female"))
                .map(PersonDto::getName)
               .map(name -> name.getFirst() + " " + name.getLast())
               .toList();

      System.out.println(firstLastNames.size());*/

               /* List<String> values = response.jsonPath()
                .get("results.findAll {it.gender == 'female' } ");
        System.out.println(values.size());*/
    }
}
