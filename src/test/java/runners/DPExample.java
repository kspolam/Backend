package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class DPExample {
    
    @Test(enabled = false)
    public void test1(Person[] obj){
        System.out.println(obj[0].getName());

    }

    @Test
    public void test2(){
        String s1="Hi dube welcome to test";
        System.out.println(s1.contains("e"));
        System.out.println(s1.indexOf("ome"));

        System.out.println(s1.matches("Hi (.*)welcome(.*)"));

        Date d= new Date();
        System.out.println(d.getTime());
    }



    @DataProvider(name="dp1")
    public Iterator<Object[]> getData(Method method){


        ArrayList<Object[]> list=new ArrayList<>();
        list.add(new Person[] { new Person("Kumar","Polam",5,2500000)});
        list.add(new Person[] { new Person("Lavin","Polam",5,2500000)});

        Iterator<Object[]> it=list.iterator();
        return it;
    }

    @DataProvider(name="dp2")
    public Object[][] getData2(){
        Object[][] obj=new Object[][]{new Person[]{new Person("Kumar","Polam",5,2500000)},new Person[]{new Person("Kumar","Polam",5,2500000)}};
        return obj;
    }

}
