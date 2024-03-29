package demo;

public class SortArEx {

    public static void main(String[] args){
        int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};
        int temp = 0;

        //print original array
        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }


        //Sort the array in ascending order using two for loops
        for (int i = 0; i <intArray.length; i++) {

            for (int j = i+1; j <intArray.length; j++) {
                if(intArray[i] >intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }

            System.out.println("\nArray sorted in ascending order: ");
            for (int k = 0; k <intArray.length; k++) {
                System.out.print(intArray[k] + " ");
            }
        }
        //print sorted array

    }
}
