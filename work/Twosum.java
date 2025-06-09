public class Twosum {

    public static void main (String args[]){

        int[] arr = {10 , 20 ,30 ,40};
        int destination  = 40 ; 

        Twosum(arr,destination);
    
       
    }
    public  static  void Twosum(int myNum[] ,int target){

        for(int i=0; i<=myNum.length   ; i++){

            for(int j = i+1 ; j<myNum.length ;j++){
                if(myNum[i] + myNum[j] == target){
                    System.out.println(i + " , " + j);
                }
            }
        }
    }
}

