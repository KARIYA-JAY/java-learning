import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {10,23,56,78,95,6,32,45};
        int key = 95;
        BST(arr, key);

    }   
    public static void BST(int arr[],int key){
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left <= right) {
           int mid = left + (right-left) /2 ;
            System.out.println(mid);
            if(arr[mid] == key){
                System.out.println("keey index is : "+mid);
                return;
            }
            else if(key > arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            } 
           
        }
         System.out.println("key not founed");
    }
}
