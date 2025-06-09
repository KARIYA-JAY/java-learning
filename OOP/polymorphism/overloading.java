package OOP.polymorphism;

// 2 tpes of polymorphism 1- static/ compile time . ex - mathod overloading , constructor overloading    

public class overloading {

    int sum(int a,int b){
        return a+b;
    }
      int sum(int a,int b,int c){
        return a+b+c;
    }
      int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args){
        overloading obj = new overloading();

        System.out.println(obj.sum(5, 4));
        obj.sum(78,6,3);
        obj.sum(4,8,65,3);
    }
    
}
