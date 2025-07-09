package Array;

public class Missing_num {

    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5};
        // int red = missingnum(arr);
        int res = Sumation_method(arr);
        System.out.println(""+ res);
    }
    public static int missingnum(int[] arr){

        int n = arr.length;
        int[] hash = new int[n+1];
        
        for(int i = 0 ; i < n -1; i++ ){
            hash[arr[i]]++;  
        }

        for(int j = 1; j <= n ;j++ ){
            if(hash[j] == 0)
                return j; 
        }
        
        return -1;
    }

    public static int Sumation_method(int nums[]){

          int n = nums.length ;
          
        int sum = (n*(n+1))/2; 
        
        int newsum = 0 ;
        System.out.println(sum);
        for(int i = 0 ; i <n-1 ; i++){
             newsum += nums[i] ; 
        }
        System.out.println(newsum);
        int missednumber = sum - newsum ;

        return missednumber ;
    }
    
}
