package Array;

public class SecondLargest {
    
    public static void main (String[] args){
        int arr[] = {45,78,2,56,7};
        s_largest(arr);
    }
    public static void s_largest(int arr[]){

        int size =arr.length;
        int largest = arr[0];
        int SecondLargest = -1;

        for(int i=1 ; i< size   ; i++){
            if(largest < arr[i] ){
                
                SecondLargest = largest;
                largest = arr[i];
                
            }else if(arr[i] < largest && arr[i] > SecondLargest ){
                SecondLargest = arr[i] ; 
            }
        }
        System.out.println(" Second Largest Array Element is " + SecondLargest);
    }
}
