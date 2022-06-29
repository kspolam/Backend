package tests;

import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void test1(){
        //return "Hi";

        String str1="Heloo234How3are87you";

        //String str2=str1.replaceAll("\\d","");
        //String str2=str1.replaceAll("[0-9]","");
        String str2=str1.replaceAll("[^A-Za-z]","");
        System.out.println(str1.getBytes().toString());
            System.out.println(str2);
        System.out.println(str1.length()-str2.length());
    }
}
