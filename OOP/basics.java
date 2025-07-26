package OOP;


public class basics  extends ONE{
    public static void main(String[] args) {
        
        detail st1 = new detail();
        System.out.println("hello Students:  " + st1.name  );
        newfile();

        // ONE obj = new ONE();
        // obj.getCreator();
    }
}
class detail {
    int roll_no ;
    String  name;

    detail(){
        this(12, "jay");
    }
    detail(int roll_no,String name){
        this.name = name ;
        this.roll_no = roll_no;
    }
    
}
