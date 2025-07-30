package String;

public class Constattn_vovels {
    public static void main(String[] args) {
 String str = "Placeaaaaaaaaaaaaaaaaaaaaaaaaaament";
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);       // 3
        System.out.println("Consonants: " + consonants); // 6
    }
}
