package BasicMath;

public class pelindrom {
    public static void main(String[] args) {
        int num = 121;
        int dub = num;
        int rev = 0; 
        while (num>0) {
            int last=num%10;
            num=num/10;
            rev = (rev * 10) + last;
        }
        System.out.println(rev);
        if(dub == rev){
            System.out.println("Number is palindrom ");
        }
        else{
            System.out.println("Number is not palindrom ");
        }
    }
}
