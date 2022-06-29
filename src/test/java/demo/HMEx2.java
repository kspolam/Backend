package demo;

import java.util.HashMap;

public class HMEx2 {
    public  static  void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Kumar",5000);
        map.put("Lavanya",5000);
        map.put("null",5000);
        map.put("null",5000);

       map.forEach((key,value)->{
           System.out.println(key+"-"+value);
        });

    }
}
