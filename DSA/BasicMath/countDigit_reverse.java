package BasicMath;

import java.util.ArrayList;
import java.util.List;

public class countDigit_reverse {
    public static void main(String[] args) {
        int num=456;
        int last_digit=Integer.MAX_VALUE; 
        int count = 0;
        int rev=0;

        List l1 = new ArrayList<Integer>();
        while(num>0){
            last_digit = num%10;
            count++;
            num/=10;
            rev = (rev * 10) + last_digit;
        }
         l1.add(rev);
         l1.add(count);
        System.out.println(l1);
    }
}
