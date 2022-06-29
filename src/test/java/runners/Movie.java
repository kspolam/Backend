//package runners;
//
//import org.jetbrains.annotations.NotNull;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Movie{//} implements Comparable<Movie>{
//
//    public double getRating() {
//        return rating;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    private double rating;
//    private String name;
//    private int year;
//
//    public Movie(String name,int year,double rating){
//        this.name=name;
//        this.year=year;
//        this.rating=rating;
//    }
//
//
//
//
//    public int compareTo(@NotNull Movie o) {
//        return o.year-this.year;
//    }
//
//    public  static  void main(String[] args){
//        ArrayList<Movie> list=new ArrayList<>();
//        list.add(new Movie("gajj",2022,4.5));
//        list.add(new Movie("dfd",1985,3.5));
//
//        Collections.sort(list);
//
//        System.out.println(list.get(0).getName()+"-"+list.get(0).getYear());
//        System.out.println(list.get(1).getName()+"-"+list.get(1).getYear());
//    }
//}
