package runners;

import java.util.Arrays;

public class SubArrayEx {

    public static void getSubArray(int[] ar) {

        for (int s = 0; s < ar.length; s++) {

            for (int e = s; e < ar.length; e++) {

                System.out.println(Arrays.toString(Arrays.copyOfRange(ar, s, e + 1)));

            }
        }

    }
    public static void getSubArray2(int[] ar) {
        int k=3;

        for (int s = 0; s < ar.length; s++) {

            int endpoint=s+3;
            if(endpoint>ar.length){
                break;
            }

            int[] ar2=Arrays.copyOfRange(ar, s, endpoint);

            System.out.print(Arrays.toString(ar2));


            Arrays.sort(ar2);

            System.out.println("-"+ ar2[ar2.length-1]);






        }

    }

    public  static void main(String[] args){
        int[] ar={9,5,3,7,8,6};
        getSubArray2(ar);
    }
}
