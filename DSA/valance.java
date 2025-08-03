public class valance {
   static boolean flag = false;
    public static void main(String[] args) {
      int arr[] = {3,5,20,20};
        way2(arr);
       while (!flag) {
            arr = lessbyone(arr);

            int sum = arrsum(arr);
            if (sum <= 0) {
                System.out.println("-1");
                break;
            }
            checkprime(sum);  
        }
    }
    public static int arrsum(int arr[]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void checkprime(int sum){
        lessorzero(sum);
        int count=0;
        for(int i=1;i<=sum;i++){
            if(sum%i==0){
                count++;
            }
        }
        if(count == 2){
            flag = true;
            System.out.println("number is prime");
        }else{
            flag = false;
        }
    }
    public static int[] lessbyone(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] - 1;
        }
        return arr;
    }
    public static int lessorzero(int sum){
        if(sum<=0)
        return -1;

        return sum;
    }
    public static void way2(int arr[]){

        int n = arr.length;
        int sum = 0;
        int count=0;
        boolean flag1 = false;
        // sum of array
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
          
        // check prime
        while(sum<=0){
            System.out.println("-1");
            return;
        }
        for(int i=1;i<=sum;i++){
            if(sum%i==0){
                count++;
            }
        }
        if(count == 2){
            
            System.out.println("number is prime");
        }else{
           for(int i=0;i<n;i++){
                arr[i] = arr[i]-1; 
            }
            way2(arr);
        }

        // decrees array element
    }
}
