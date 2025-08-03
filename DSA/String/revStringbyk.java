package String;

public class revStringbyk {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 4;
        char c[] = s.toCharArray();
      
        for(int h=0 ;h<=c.length-1;h+=2*k) {
            int i = h ;
            int j = Math.min(i + k - 1, c.length - 1);
            while(i<j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;   
            }
         
        }
        
        for (char d : c) {
            System.out.print(d);
        }
    }
}
