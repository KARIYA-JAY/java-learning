package Array;

public class move_zero_to_end {
    
    public static void main(String[] args){
        int arr[] = {1, 0, 3, 12, 0};

         int res[] = MoveEnd(arr);
         int opt[] = optimal(arr);
         int ans[] = moveZeroesToEnd(arr);

         for(int ress : ans){
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
    public static int[] optimal(int arr[]){
        int n=arr.length;
        int i=0;
        for(int j=i+1;j<n;j++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }
        return arr;
    } 

    public static int[] moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

     
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

       
        while (index < n) {
            arr[index++] = 0;
        }

        return arr;
    }

}

