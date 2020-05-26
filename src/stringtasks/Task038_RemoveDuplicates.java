package stringtasks;

import java.util.LinkedHashSet;

public class Task038_RemoveDuplicates {
        
    static String a = "aaaaaaaaaaabbbcccccc";
    
    public static void main(String[] args) {
        
        System.out.println("The given string is: " + a);
        System.out.println("After removing duplicate characters the new string is: " + duplicateRemover(a));
    }
    
    public static String duplicateRemover(String a) {

        char[] temp = a.toCharArray();
        
        LinkedHashSet<Character> linkedHash = new LinkedHashSet<>();
        StringBuilder string = new StringBuilder();
        
        for (char x : temp) {
            linkedHash.add(x);
        }
        
        for (char y : linkedHash) {
            string.append(y);
        }
        return string.toString();
    }
}
