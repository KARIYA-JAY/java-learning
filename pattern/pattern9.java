public class pattern9 {

    public static void main(String[] args) {
        

        int number = 1;

        for(int i =1 ;i<= 5 ;i++)
        {
            if(i%2 == 0)
                {
                    number = 0;
                }
                else{
                    number = 1; 
                }
            for(int j = 1 ; j <= i ; j++)
            {
                

                System.out.print(number);
                number = 1 - number;
               
            }
            System.out.println();
        }
    }


}