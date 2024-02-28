public class pattern14 {
    public static void main(String[] args) {
        
        int n =5 ;

        for(int i =0 ;i <= n ; i++)
        {
            for(int j= 0 ;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int k = 0 ; k<=n*2-(i*2+1);k++)
            {
                System.out.print(" ");
            }

            for(int j= 0 ;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i =0 ;i <= n ; i++)
        {
            if(i==0)
                {
                    continue ;
                }
            for(int j= 0 ;j<=n-i;j++)
            {
                
                System.out.print("*");
            }

            for(int k = 0 ; k<i*2;k++)
            {
                System.out.print(" ");
            }

            for(int j= 0 ;j<=n-i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
    
}
