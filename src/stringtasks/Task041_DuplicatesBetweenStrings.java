package stringtasks;

import java.util.ArrayList;

public class Task041_DuplicatesBetweenStrings {

    public static void main(String[] args) {
        
        String a = "the quick brown fox";
        String b = "queena";
        
        System.out.println("The given string is: " + a);
        System.out.println("The given mask string is: " + b);
        System.out.println("The new string is: " + duplicates(a, b));
    }
    
    public static StringBuilder duplicates(String a, String b) {
        
        ArrayList<Character> original = new ArrayList<>();
        ArrayList<Character> sub = new ArrayList<>();
        char[] bb = b.toCharArray();
        char[] aa = a.toCharArray();
        StringBuilder stringNew = new StringBuilder();
        
        for (char x : bb) {
            sub.add(x);
        }
        
        for (char xx : aa) {
            original.add(xx);
        }
        
        for (int i = 0; i < sub.size(); i++) { 
            if (original.contains(sub.get(i))) {
                original.remove(sub.get(i));
                sub.set(i, null);
            }
        }
        
        for (char xxx : original) {
            stringNew.append(xxx);
        }
        
        return stringNew;
    }
}
