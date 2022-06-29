package api;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.List;

public class JPathEx1 {

    public static void main(String[] args){

        String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\api\\people.json";

        File file=new File(filePath);

        JsonPath jsonPath=new JsonPath(file);
        System.out.println(jsonPath.getString("[0].first_name"));

        List<String> allfirstNames=jsonPath.getList("first_name");
        System.out.println(allfirstNames);

        System.out.println(jsonPath.getList("findAll{it.gender=='Female'}.first_name"));

        System.out.println(jsonPath.getString("find{it.first_name=='Merrill' & it.last_name=='Acom'}.email"));

        System.out.println(jsonPath.getList("find{it.first_name=='Merrill' | it.first_name=='Remus'}.email"));
    }
}
