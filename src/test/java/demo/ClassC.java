package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ClassC extends ClassB{


    public static void main(String[] args){
        //ArrayList<String> list=new ArrayList<String>(Arrays.asList("pratap"));

        ArrayList<Integer> intList= new ArrayList<Integer>(Arrays.asList(1,1,1,4,5,5,2,2,3,4,5,5));

        ArrayList<Integer> uniqueList=new ArrayList<>();

        WebDriver driver=new ChromeDriver();
        driver.getWindowHandles();

        int de=-1;
        int dc=0;
        int sd=-1;
        for( int i: intList){

            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
            else{
                if(de!=i){
                    de=i;
                    dc++;
                }
                if(dc==2){
                    sd=i;
                }

            }
        }


        System.out.println(uniqueList);
        System.out.println(sd);

    }
}
