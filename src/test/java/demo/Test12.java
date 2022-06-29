package demo;

public class Test12 {

    public static void main(String[] args) {

        System.out.println("In main method-"+ test23());

        String[] stra={"ai","aut","regression","smoke"};

        for(String s:stra){
            System.out.println(s);
        }


    }

    public static String test23() {
        try {

            //throw new Exception("adf");
            //return "Hi";

            System.out.println("Hibolotar".substring(1,3));

        }
        catch(Exception e) {
            return "sad";

        }
        finally {
            return "hey";
            //System.out.println("in finally");
        }
    }
}
