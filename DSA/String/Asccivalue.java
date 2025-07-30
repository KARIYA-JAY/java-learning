package String;

public class Asccivalue {

    public static void main(String[] args) {
        String word = " i am the hero of my life.";

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int ascci = (int) ch ;
            System.out.print(ascci);
        }
    }
}
