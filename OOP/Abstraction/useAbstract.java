package OOP.Abstraction;

public class useAbstract{

    // @Override
    // void men(String name){
        
    // }
    // @Override
    // void women(String name){
        
    // }
    // @Override
    // int sum(int a, int b){
    //     return 0;
        
    // }

    public static void main(String[] args) {
        
        Abstraclass obj = new Abstraclass() {
            
            @Override
            void men(String name) {
                System.out.println("this is men method ");

            };
            @Override
            void women(String name) {
               System.out.println("this is women method ");
                
            };

            @Override
            int sum(int a, int b) {
                
                return a+b;
            }
        };

        System.out.println(obj.sum(5, 7));

    }
    
}
