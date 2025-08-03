package String;

import java.util.ArrayList;
import java.util.List;

public class reverseStringword {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String arr[] = s.split(" ");
        StringBuilder news = new StringBuilder();
        
        for(int i=0;i<arr.length;i++){

            String rev = new StringBuilder(arr[i]).reverse().toString();

            news.append(rev);
            if(i==arr.length-1){

            }else{
                news.append(" ");
            }
          
        }
        String finals =  news.toString();
        System.out.println(finals);
        
    }
}
