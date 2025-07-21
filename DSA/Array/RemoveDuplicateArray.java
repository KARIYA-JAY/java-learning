package Array;


public class RemoveDuplicateArray {
    
    public static void main(String[] args) {
        int arr[] = {0,2,3,3,8,9,9,9,9,9,4,4,4,4};
        int res = remove(arr);
        for(int i=0; i<res;i++){
            System.out.println(arr[i]);
        }
    }
    public static int remove(int arr[]){
        
        int n=arr.length;
        int k=0;

        for(int i=1; i<n; i++){
            if(arr[i] != arr[k]){
                k++;
                arr[k] = arr[i];
            }
        }
        return k+1;
    }
}
