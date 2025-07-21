package String; 

public class PalindromString {

    public static void main(String arge[]){

    String name="MaioaM";
    boolean ans = palindrom(0,name);
    System.out.println(ans);
    }
    public static  boolean palindrom(int i,String s){
        int n = s.length();
        if(i >= n/2 ) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return palindrom(i+1,s);
    }
}
