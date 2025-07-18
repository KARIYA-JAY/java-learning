package Array;

public class Lrgest_no {

    public static void main (String[] args){

        int arr[] = {12,78,5,99,45,23};
        Larg_no(arr);
    }

    public static void  Larg_no(int[] arr){

        
        int largest = arr[0];

        for(int j = 1 ; j < arr.length - 1  ; j++){

            // if(largest < arr[j]){
            //     largest = arr[j];
            // }
            largest = Math.max(largest, arr[j]);
        }
        
        System.out.println("Largest number of array is :" + largest);
    }
}
