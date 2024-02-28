public class pattern10 {

    public static void main(String[] args) {
        
           int no = 5;

        for(int i = 0 ; i< no ;i++)

        {
           for(char ch = 'A'; ch<= 'A' + (no-1-i) ; ch++)
           {
            System.out.print(ch);
           }

           System.out.println();
        }   
    }
    
}
