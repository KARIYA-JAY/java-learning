package BasicMath;

public class countDigit_reverse {
    public static void main(String[] args) {
        int num=456;
        int temp=Integer.MAX_VALUE;
        int last_digit=Integer.MAX_VALUE; 
        int count = 0;
        int rev=0;

        while(num>0){
            last_digit = num%10;
            count++;
            num/=10;
            rev = (rev * 10) + last_digit;
        }
        System.out.println(rev+" "+count);
    }
}
