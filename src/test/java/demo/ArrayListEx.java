package demo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {

    public static  void  main(String[] args){

        ArrayList<String> as= new ArrayList<>(Arrays.asList("Hi","dear","Yash","tech"));

        System.out.println(as.size());

        String[] str=new String[as.size()];

        as.toArray(str);

        for(String s:str){
            System.out.println(s);
        }

    }
}
