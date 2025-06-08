package OOP.Inheritance;

public class child extends parent {

    String city = super.name;

    child(int age,String name,Double number,String city){
        super(age,name,number);
        this.city = city ;
    }

}
