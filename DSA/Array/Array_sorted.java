package Array;

public class Array_sorted {
    public static void main(String args[]){
        int arr[] = {45,7,89,5};
        int arr2[] = {3,4,5,1,2};
        reverse(arr2, 0, 4);
        
       
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
    public static void reverse(int arr[] ,int  left , int right){
        while(left<right){
            int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
        }
    } 

}
