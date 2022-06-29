package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateUtils {

    public static  void main(String[] args){
        System.out.println(LocalDate.now());


        SimpleDateFormat sdf=new SimpleDateFormat("dd.mm.yyyy");
        System.out.println(sdf.format(new Date()));

        int max= (6>5) ? 6:5;

        try {
            Date d=sdf.parse("22.05.2022");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
