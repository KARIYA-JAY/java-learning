package Array;
import java.util.*;


public class smallestelement {
    public static void main(String[] args) {
        int arr[]={1,5,6,8,9,7,3};
        int k = 5;
        int n = arr.length;
        Arrays.sort(arr);
        
        System.out.println(arr[k-1]);

    }
}
