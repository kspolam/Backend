package runners;

public class ArrSo {

    public static void main(String[] args){

        int[] a=new int[]{3,5,3,8,8,9,4,6};

        int n=a.length;

        int i=0;
        while(i<n){
            int j=i+1;
            while(j<n){
                if(a[i]==a[j]){
                    for(int k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    n=n-1;
                }
                else{
                    j=j+1;
                }
            }
i=1+1;
        }

    }
}
