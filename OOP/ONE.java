package OOP;

public class ONE {


    // use of grtter and setter for final key words 
    // final  String creator = "jay";
    // public String getCreator() {
    //     System.out.println("creator is  : "+creator);
    //     return creator;
    // }

    

    static String name = "lucifer ";
    static int age ;

    public static void main(String[] args){

        detail n1 = new detail();
        System.out.println(n1.name);
        System.out.println(name + age);
        newfile();
    }
   public static void newfile(){

        System.out.println("this is second file");
        ONE obj = new ONE(); // this is the way u can use non-static method in static method   
        obj.old();

        // can not use this in static method
    }
    // static methods call only static method not non static . 
     void old(){
        System.out.println("hero ");
    }

    // this block initiliaze only once when the class is lodead or object created . 
    static{
        // name="jay";
        age = 45;
    }
}
