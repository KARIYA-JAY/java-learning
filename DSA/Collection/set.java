package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        int arr[]={ 1,2,2,3,6,5,4,4,4,9,9,9,97,97};
        remove(arr);
    }
     public static void remove(int arr[]){
        Set<Integer> s = new LinkedHashSet(); // set only remove duplicate linkedhashset remove dupllicate and also preserve the order .
        for(int i=0 ; i<arr.length ; i++){
            s.add(arr[i]);
        }
        System.out.println(s);
        System.out.println(s.contains(1));

    }
}
