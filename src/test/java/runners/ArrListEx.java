package runners;

import org.picocontainer.lifecycle.LifecycleState;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrListEx {

    @Test
    public void test1(){

        List<String> list1= Arrays.asList("Hi");
        list1.add("Bye");

        List<String > list2= new ArrayList<>();
        list2.add("list2");

    }
}
