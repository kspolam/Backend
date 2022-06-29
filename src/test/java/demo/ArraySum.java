package demo;

public class ArraySum {

    public static void main(String[] args){

        int[] numbers= {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int[][] num34= {{1,2,3},{1,2,3}};

        int sum=0;
        double avg;

        String s = "abcd";

        double arraylength=numbers.length;

        for(int num:numbers){
            sum+=num;
        }

        System.out.println(sum);

        avg=(double) sum/arraylength;


        System.out.println(avg);
    }
}
