package String;

import java.util.Arrays;

public class aanargrams {

    public static void main(String[] args) {
        
        String name = "jay";
        String name1 = "yakj";

        char ch[] = name.toCharArray();
        char ch1[] = name1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch1, ch)){
            System.out.println("String is anargrams");
        }else{
            System.out.println("String is  not anargrams");
        }
        
    }
    
}
