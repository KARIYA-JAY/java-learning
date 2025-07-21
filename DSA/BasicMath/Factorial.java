package BasicMath;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        System.out.println(revfact(n));

    }
    public static int fact(int n){
        int factstore = 1;

        if(n==0) return -1;

        for(int i=1;i<=n;i++){
            factstore = factstore * i;
        }
        return factstore;
    }

      public static int revfact(int n){
        if(n<=0) return 1; // this is base condition. here we don't return the whole function understand jay.
        return n*revfact(n-1); // here is the real game start in recursion :)
    }
}
