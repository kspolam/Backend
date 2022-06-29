package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class GET_1001 {

    @Test
    public void test1(){

        RequestSpecBuilder builder =new RequestSpecBuilder();
        builder.setBaseUri("https://restful-booker.herokuapp.com/");
        builder.setContentType(ContentType.JSON);
      RequestSpecification spec=builder.build();



        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.log().all();

        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body("{\n" +
                "    \"firstname\": \"Bodkar\",\n" +
                "    \"lastname\": \"AjitGawda\",\n" +
                "    \"totalprice\": 113,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}");

        Response response=requestSpecification.post();



        ValidatableResponse validatableResponse=response.then();
        validatableResponse.statusCode(200);
        validatableResponse.log().all();

        validatableResponse.time(Matchers.both(Matchers.greaterThan(2000L)).and(Matchers.lessThan(7000L)));




    }
}
