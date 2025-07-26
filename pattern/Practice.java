public class Practice {
    public static void main(String args []){
        int n = 5;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-(i+1);j++){
        //         System.out.print(" ");
        //     }    
        //     for(int k=0;k<(i*2)+1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }    
        //     for(int k=0;k<n*2-(i*2+1);k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        //----------------------------------------

        for(int i=0;i<n*2;i++){
            int star = i;
            int space = 2*n-i*2;
            if(i>n){
                star=2*n-i;
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print("-");
            }
            
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            if(i<n){
                space-=2;
            }
            else{
                space+=i*2 ;
            }
        }
    } 
    
}
