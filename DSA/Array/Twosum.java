package Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Twosum {

    public static void main (String args[]){

        int[] arr = {3,7,-3,11} ;
        int destination  =  0; 

        //  Twosum(arr, destination);
   
        List<int[]> res = optimalTwosum(arr, destination);
        if(res.isEmpty()){
            System.out.println("Answer not found ");
        }
        else{
            for (int[] pair : res) {
                System.out.println(pair[0] + " + " + pair[1] + " = " + destination);
            }
        }
    }
    public  static  void Twosum(int myNum[] ,int target){
        
        for(int i=0; i<=myNum.length   ; i++){

            for(int j = i+1 ; j<myNum.length ;j++){
                if(myNum[i] + myNum[j] == target){
                    System.out.println(myNum[i]+" + "+myNum[j] +" :"+target);
                }
            }
        }
    }

    public static List<int[]> optimalTwosum(int[] arr ,int target){

      Map<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        Set<String> seen = new HashSet<>(); // to avoid duplicates

     for(int i = 0 ; i<arr.length;i++){

        int a = arr[i];
        int more = target - a ;
        if(map.containsKey(more)){

          String pairKey = Math.min(a, more) + ":" + Math.max(a, more);
                if (!seen.contains(pairKey)) {
                    result.add(new int[]{more, a});
                    seen.add(pairKey);
                }
        }else{
            map.put(arr[i],i);
        }
     }
      return result;
    }

}

