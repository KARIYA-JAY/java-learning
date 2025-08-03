package Array;

public class mergearray {
   public static void main(String[] args) {
    
    int arr[] = {1,4,5,6,7,10};
    int arr1[] = {2,3,8,9};
    
    int n = arr.length + arr1.length;
       
        for(int i=0;i<n;i++){
          arr[i] = arr1[i];  
        }
   }
}
