package String;

public class Stringbuffeer {
  
    public static void main(String[] args) {
        String str ="jaj";  
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str+"   "+reversed);
        if(str.equals(reversed))System.out.println("pelindrom String ");
        }
    
}
