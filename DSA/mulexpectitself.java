public class mulexpectitself {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res[] = mul(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
    public static int[] mul(int arr[]){
        int n =arr.length;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
         int mul = 1;
            for(int j=0;j<n;j++){
                if(i == j ) continue;
                mul = mul * arr[j];
            }
            res[i] = mul ;
        }
        return res;
    }   
}
