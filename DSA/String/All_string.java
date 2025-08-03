package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;
import Collection.map;
import Collection.set;

public class All_string {
    public static void main(String[] args) {

        // String res = revString("jaj");
        // System.out.println(res);

        // String res1 = revString2("jaj");
        // System.out.println(res1);

       // checkvovel("jay45)");
      // removeduplicate("887456");
      findduplicate("jayy");
    }
    //
    public static String revString(String s){
        return new StringBuilder(s).reverse().toString();
    }
    //
    public static String revString2(String s){
        String check = s;
        int n=s.length();
        char c[] = s.toCharArray(); 
        int i=0;
        int j=n-1;
        while(i<j){
            char temp3 = c[i];
            c[i] = c[j];
            c[j] = temp3;
            i++;
            j--;
        }
        String news = new String(c);
        if(check.equals(news)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrom");
        }
        return new String(c);
    }
    //
    public static void checkvovel(String str){
        String vovels = "aeiou";
        String numbers = "0123456789";
        String specialchar = "!@#$%^&*()_+}{:";

        char strch[] = str.toCharArray();
        char vovelch[] = vovels.toCharArray();
        char numbersch[] = numbers.toCharArray();
        char specialcharch[] = specialchar.toCharArray();

        for(int i=0;i<strch.length;i++){
            for(int j=0;j<vovelch.length;j++){
                if(strch[i]==vovelch[j]){
                    System.out.println(strch[i]+" is vovel");
                }
            }
            for(int j=0;j<numbersch.length;j++){
                if(strch[i]==numbersch[j]){
                    System.out.println(strch[i]+" is number");
                }
            }
            for(int j=0;j<specialcharch.length;j++){
                if(strch[i]==specialcharch[j]){
                    System.out.println(strch[i]+" is special character");
                }
            }
        }

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> digits = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        Set<Character> specials = Set.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '}', '{', ':');

        for (char ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                System.out.println(ch + " is vowel");
            } else if (digits.contains(ch)) {
                System.out.println(ch + " is number");
            } else if (specials.contains(ch)) {
                System.out.println(ch + " is special character");
            }
        }

    }
    //
    public static void removeduplicate(String str){
        char c[] = str.toCharArray();

        LinkedHashSet<Character> s1 = new LinkedHashSet<>();
        for (Character character : c) {
            s1.add(character);
        }
        StringBuilder s2 = new StringBuilder();
        for (Character character : s1) {
            s2.append(character);
        }
        System.out.println(s2.toString());

        int count = 0 ;
        for (Character character : c) {
            if(character.isDigit(character)){
                count++;
            }
           
        }
         if(count == c.length){
                System.out.println("Whole String is degit");
            }else {
                System.out.println("Whole String is not degit");
        }
    }
    //
    public static void findduplicate(String str){
        Map<Character,Integer> mp = new HashMap<>();
        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
