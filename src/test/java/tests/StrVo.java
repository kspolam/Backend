package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrVo {

    public static  void mai1n(String[] args){
        String str1="MyNameIsKumaraswamyPolamUrs?";

        String str2=str1.replaceAll("[aeiouAEIOU]","");

        System.out.println(str2);
        System.out.println(str1.length()-str2.length());

    }

    public  static  void main(String[] args){
        String regex = "[aeiouAEIOU]";
        String str1="MyNameIsKumaraswamyPolamUrs?";
        Pattern pattern=Pattern.compile("[aeiouAEIOU]");
        Matcher matcher=pattern.matcher(str1);
        System.out.println(matcher.find());

        System.out.println(str1.matches(regex));


    }
}
