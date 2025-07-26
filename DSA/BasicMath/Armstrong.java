package BasicMath;

public class Armstrong {

    public static void main(String[] args) {
        int num = 9474;
        int ognum = num;;
        int armstrong = 0;

        while(num>0){

            int last_digit = num%10;
            armstrong = armstrong +(last_digit * last_digit * last_digit);
            num = num/10;
        }
        if(armstrong == ognum){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number not is armstrong");
        }
    }
}