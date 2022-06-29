package demo;

import java.util.*;

public class HashMEx {



        public static  void  main(String[] args){

            HashMap<String,String> map= new HashMap<>();

            System.out.println(map.size());

            System.out.println(map.put("Key1","Java"));
            System.out.println(map.put("Key2","Automation"));
            System.out.println(map.put("Key3","Tesing"));
            System.out.println(map);

            System.out.println(map.put("Key2","manual testing"));
            System.out.println(map.get("Key2"));

            System.out.println(map.putIfAbsent("Key3","Developement"));
            System.out.println(map.get("Key3"));

            Set<String> keys= map.keySet();

            Set<Map.Entry<String,String>> set=map.entrySet();

            for(Map.Entry<String,String> e:set){
                System.out.println(e.getKey() +"--"+e.getValue());
            }

        }

}
