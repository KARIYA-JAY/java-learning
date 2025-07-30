package String;

import java.util.HashMap;
import java.util.Map;

public class checkduplicate {
    public static void main(String[] args) {
        String name = "jay kariya";
      
        int[] freq = new int[260]; 
        for (char c : name.toCharArray()) {
              freq[c]++;
        }
        for (int i = 0; i < 260; i++) {
            if (freq[i] > 0) {
               System.out.println((char) i +" => " + freq[i]);
            }
        }
      
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : name.toCharArray()) {
            if (c == ' ') continue;
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
      
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
         // System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println(freqMap);
        
    }
        
}
