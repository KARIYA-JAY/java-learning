public class pattern13 {
    
    public static void main(String[] args) {
        int n=5;
        for(int i = 0 ; i<n ;i++)
        {
            for(int l = 0 ; l<=n-i-1;l++)
            {
                System.out.print("*");
            }
         
            for(int j = 0 ; j<(i*2) ; j ++)
            {
                System.out.print(" ");
            }

            for(int l = 0 ; l<=n-i-1;l++)
            {
                System.out.print("*");
            }
         System.out.println();

    }

    for(int i = 0 ; i<n ;i++)
    {
        for(int l = 0 ; l<=i;l++)
        {
            System.out.print("*");
        }
     
        for(int j = 1 ; j<n*2-(i*2+1 ); j ++)
        {
            System.out.print(" ");
        }

        for(int l = 0 ; l<=i;l++)
        {
            System.out.print("*");
        }
     System.out.println();

}
    }
}
