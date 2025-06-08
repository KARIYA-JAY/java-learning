package OOP.Inheritance;

public class grandchild extends child{
    
    boolean marriedStatus ;

    grandchild(int age,String name,Double number ,String city, boolean marriedStatus ){
    super(age, name, number, city);
    this.marriedStatus = marriedStatus; 
    }
}
