public class pattern3 {
    public static void main(String[] args) {
        
        for(int i =1 ; i<=6 ; i++ )
        {
            for (int j = 1 ;j<=6 ; j++)
            {
                if(i==1 || j == 1 || i==6  || j==6)
                {
                    System.out.print(" 4");
                }
                else  if( i== 2 || j == 2 || i==5|| j==5){
                    System.out.print(" 3");
                }
                else  if(i== 3 || j == 3 || i==4|| j==4){
                    System.out.print(" 2");

                }
                else{
                    System.out.println(" 1");
                }
            }
            System.out.println();
        }
    }
    
}
