package runners;

public class Person {

    private String name;
    private String vorname;
    private int age;
    private  double sal;

    public Person(String name,String vorname,int age,double sal){
        this.name=name;
        this.name=vorname;
        this.age=age;
        this.sal=sal;
    }
    public String getName(){
        return this.name;
    }

}
