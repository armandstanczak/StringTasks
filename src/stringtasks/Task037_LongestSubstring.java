package stringtasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task037_LongestSubstring {

    static int subLen = 0;
    static String subMax = "";
    
    public static void main(String[] args) {
        
        String original = "pickoutthelongestsubstring";
        char[] sub = {'u', 'b', 's', 't', 'r', 'i', 'n', 'g', 'u', 'u', 'p'};
        
        System.out.println("Original sentence: " + original);
        System.out.println("Substring characters: " + Arrays.toString(sub));
        substring(original, sub);
        System.out.println("The longest substring is: " + subMax + " of length " + subLen);
    }
    
    public static void substring(String original, char[] sub) { 
        int tempMaxLen = 0;
        //String tempMaxSub = "";
        int counterSub;
        ArrayList<Character> tempMaxSub = new ArrayList<Character>();
        
        
        for (int i = 0; i < sub.length; i++) {
            counterSub = 0;
            for (int j = 0; j < original.length(); j++) { 
                if (original.charAt(j) == sub[i])  {
                    if (!tempMaxSub.contains(sub[i])) {
                        if (counterSub == 0) {
                            counterSub = 1;
                            tempMaxLen++;        
                            tempMaxSub.add(original.charAt(j));
                        }
                    }
                }
            }
        }
        subLen = tempMaxLen;
        subMax = tempMaxSub.toString();
    }
}
