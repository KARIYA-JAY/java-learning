public class pattern12 {

    public static void main(String[] args) {
        
        int no = 5;

        for(int i = 1; i<no ;i++)
        {
            for(int k = 1 ; k<=no-i ;k++)
            {
                System.out.print(" ");
            }
            for(char ch = 'A' ; ch<'A'+(2*i-1) ; ch++)
            {
                System.out.print(ch);
            }
        for(int k = 1 ; k<=no-i ;k++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }
        
    }
    
}
