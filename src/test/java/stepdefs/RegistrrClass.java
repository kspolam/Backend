package stepdefs;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class RegistrrClass {


    @DataTableType
    public LoginDetails getLoginDetails(Map<String,String> loginData){

        return new LoginDetails(loginData.get("username"),loginData.get("password"));

    }
}
