package Collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        String name = "swarra";
        char ch[] = name.toCharArray();
        Map<Character,Integer> mp = new HashMap<>();
        
        for(char i : ch){
            mp.put(i, mp.getOrDefault(i, 0) + 1);   
        }
        System.out.println(mp);
    }
}
