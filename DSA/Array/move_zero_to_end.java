package Array;

public class move_zero_to_end {
    
    public static void main(String[] args){
        int arr[] = { 1,5,7};
         int res[] = MoveEnd(arr);

         for(int ress : res){
            System.out.print(ress+",");
         }

    }
    public static int[] MoveEnd(int arr[]){

        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++ ){
            if(arr[i] == 0){
                j = i;
                break; 
            }
        }
        
        for(int i=j+1; i<n; i++){
            if(arr[i] != 0 ){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++; 
            }
        }

        return arr; 
    }
}

