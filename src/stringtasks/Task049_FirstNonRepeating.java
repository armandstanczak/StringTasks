package stringtasks;

import java.util.ArrayList;
import java.util.List;

public class Task049_FirstNonRepeating {

    public static void main(String[] args) {
        String word = "godisgood";
        List<Character> list = new ArrayList<>();
        boolean[] repeat = new boolean[256];
        
        System.out.println("String: " + word);
        
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            System.out.println("Reading: " + x);
            if (!repeat[x]) { 
                if (!list.contains(x)) {
                    list.add(x);
                } else {
                    list.remove((Character) x);
                    repeat[x] = true;
                }
            }
            if (!list.isEmpty()) {
                System.out.println("The first non repeating character is: " + list.get(0));
            }
        }
    }
}
