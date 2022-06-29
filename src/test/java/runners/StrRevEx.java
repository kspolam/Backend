package runners;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrRevEx {

    public static void main(String[] args){
         String str1= "I#Lo$ve%In&di*a";


         char[] chars=str1.toCharArray();

         int start=0;
         int end=chars.length-1;

        while(start<end){

            char c1=chars[start];
            char c2=chars[end];

            Pattern p = Pattern.compile("[^a-zA-Z0-9 ]");

            // Creating matcher for above pattern on our string
            Matcher m = p.matcher(String.valueOf(c1));

            boolean res = m.find();

            if(res){
                start++;
                continue;
            }

            Matcher m2 = p.matcher(String.valueOf(c2));

           if(m2.find()){
               end--;
               continue;
           }

            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }

        System.out.println(new String(chars));

        //System.out.println(reverse);





    }
}
