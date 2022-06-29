package api;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class GET_1002 {

    @Test
    public void test1(){

        String jsonString="[\n" +
                "  {\n" +
                "    \"firstname\": \"Kumar\",\n" +
                "    \"lastName\": \"Polam\",\n" +
                "    \"age\": 24,\n" +
                "    \"address\": [\n" +
                "      {\n" +
                "        \"City\": \"Pune\",\n" +
                "        \"Country\": \"India\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"City\": \"Banglore\",\n" +
                "        \"Country\": \"India\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstname\": \"Lavn\",\n" +
                "    \"lastName\": \"Polamk\",\n" +
                "    \"age\": 24,\n" +
                "    \"address\": [\n" +
                "      {\n" +
                "        \"City\": \"Hyderabad\",\n" +
                "        \"Country\": \"India\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"City\": \"N.Y.\",\n" +
                "        \"Country\": \"USA\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        JsonPath jsonPath=new JsonPath(jsonString);

        System.out.println( jsonPath.getString("[0].address[0].City"));

        System.out.println( jsonPath.getList("[0].address.City"));

        System.out.println( jsonPath.getList("address.City"));

    }
}
