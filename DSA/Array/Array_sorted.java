package Array;

public class Array_sorted {
    public static void main(String args[]){
        int arr[] = { 45,7,89,5};
        int arr2[] = {5,8,9,45,55};
        check(arr2);
        
    }
    public static int check(int arr[]){

        int n = arr.length;
        for(int i=0 ; i<n-1; i++){
            if(arr[i] > arr[i+1]){
              System.out.println("not sorted");
              return 0; 
            }
        }
         System.out.println("sorted");
        return 1;
    }
}
