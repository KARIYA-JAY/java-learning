package String;

import java.util.ArrayList;
import java.util.List;

public class split {
    public static void main(String[] args) {
        String sec = " Split me I am here .";

        String arr[] = sec.split(" ");
        
        for (String string : arr) {
            if(string.length() > 3){
            List<String> l1 = new ArrayList<>();
            l1.add(string);
            System.out.print(l1);
            }
        }
    }
    
}
