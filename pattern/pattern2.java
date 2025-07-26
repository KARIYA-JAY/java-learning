import java.util.Scanner;

public class pattern2 {

    static void pattern5(){
        for (int i = 0; i < 5; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    static void pattern6(){
        for(int i=0; i<=5;i++){
            for(int j=i+1;j<6;j++){
                System.out.print(j-i);
            }
            System.out.println(" ");
        }
    }
    static void pattern2(){
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println(" ");
            }
    
    } 

    static void pattern4(){
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1; j<=i; j++){
            System.out.print(i);
            }
            System.out.println(" ");
            }
    }
    static void pattern3(){
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1; j<=i; j++){
            System.out.print(j);
            }
            System.out.println(" ");
            }
    }
    static void pattern7(){
        for(int i = 0 ; i<=5 ;i++){
            
            for(int j=i; j<=5;j++){
               System.out.print(" ");
            }
            for(int k=1;k<=(i*2)+1 ;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern8(){
        for(int i = 0 ; i<=5 ;i++){
            
            for(int j=0; j<=i;j++){
               System.out.print(" ");
            }
            for(int k=5; k>=(i*2)-1 ;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern10(){
        
        for(int i = 0 ; i<=5 ;i++){
            
            for(int j=i; j<=5;j++){
                System.out.print(" ");
             }
             for(int k=1;k<=i ;k++){
                 System.out.print("*");
             }
             System.out.println("");
            }

            for(int i = 0 ; i<=5 ;i++){
            
                for(int j=0; j<=i;j++){
                   System.out.print(" ");
                }
                for(int k=5; k>i ;k--){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
    static void pattern9(){
        
        for(int i = 0 ; i<=5 ;i++){
            
            for(int j=i; j<=5;j++){
                System.out.print(" ");
             }
             for(int k=1;k<=(i*2)+1 ;k++){
                 System.out.print("*");
             }
             System.out.println("");
            }

            for(int i = 0 ; i<=5 ;i++){
            
                for(int j=0; j<=i;j++){
                   System.out.print(" ");
                }
                for(int k=10; k>=i*2;k--){
                   System.out.print("*");
                }
                System.out.println("");
            
            }
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int raw = sc.nextInt();
        // sc.close();

    //     //3
        pattern3();

    //     //4
        pattern4();
        

    //     //2
        pattern2();

    
    //    //5 
       pattern5();
       

    //     // 6 
        pattern6();
    pattern9();
    

       
    }
}
