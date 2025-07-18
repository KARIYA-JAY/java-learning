package Array;

public class LeftRotedArray {

    public static void main(String[] args) {
        int arr[] = {4,5,8,7,9};
        rev(arr,0,4);
        for(int i = 0; i<arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }

    public static int[] LeftRoted(int arr[]){

        int n = arr.length;
        int key = 1;
        
        return arr;
    }
    public static void rev(int arr[],int start,int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
