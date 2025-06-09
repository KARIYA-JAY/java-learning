package OOP.polymorphism;

// 2nd type is dynamic / runtime archived by overriding   

public class overiding {

    void age(){
        System.out.println("age is overriden ");
    }

    public static void main(String[] args) {
        
        humen h1 = new humen();
        animal a1 = new animal();

        overiding obj = new humen(); // override the main method . 

        h1.age();;
        a1.age();
        obj.age();
    }
    
}
