package runners;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class StrSplitRegex {


    public static void main(String[] args){

        String x="Go To Card Order By ProductName and order by age";

        String[] y=x.split("(?i)order by");

        for(String s:y){
            System.out.println(s);
        }

        System.out.println(y.length);

        //RestAssured.given()
    }
}
