public class pattern_dimond {
    

    public static void main(String[] args) {
    
    
        // piramid upper
        int n= 5 ;
        for(int i=1 ; i<= n ;i++)
        {
            for(int j = 1 ;j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i*2-1 ; j++)
            {
                System.out.print("*");

            }
            for(int k= 1 ;k<=n-i ; k++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        // lower piramid

        for(int i=1 ; i<= n ;i++)
        {
            for(int j = 1 ;j<i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=n*2-(i*2-1) ; j++)
            {
                System.out.print("*");

            }
            for(int j = 1 ;j<i ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
}
    

    }
