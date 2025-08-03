package Array;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class threesum {
    public static void main(String[] args) {
        int arr[] = {2,4,0,-1,-1,12,1};
        int key = 0;
         Set<List<Integer>> result = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                for(int k = 0;k<arr.length;k++){
                    if(key == arr[i]+arr[j]+arr[k]){
                        List l1 = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(l1);
                        result.add(l1);
                    }
                }
            }
        }
        for (List<Integer> list : result) {
            System.out.print(list.get(0));
            System.out.print(list.get(1));
            System.out.println(list.get(2));
        }
    }
}
