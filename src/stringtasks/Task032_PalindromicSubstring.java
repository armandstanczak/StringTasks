package stringtasks;

public class Task032_PalindromicSubstring {
    
    public static void main(String[] args) {
        
        String a = "forgeeksskeegfor";
        System.out.println("The given string is: " + a);
        palindrome(a);
    }
    
    public static void palindrome(String a) {
        int length = a.length();
        boolean table[][] = new boolean[length][length];
        int maxLength = 1;
        
        //for length 1
        for (int i = 0; i < length; i++) {
            table[i][i] = true;
        }
        
        //for length 2
        int start = 0;
        for (int i = 0; i < length - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        //for length >= 3
        for (int i = 3; i <= length; i++) {
            for (int j = 0; j < length - i + 1; j++) {
                int k = j + i - 1;
                if (table[j + 1][k - 1] && a.charAt(j) == a.charAt(k)) {
                    table[j][k] = true;
                    if (i > maxLength) {
                        start = j;
                        maxLength = i;
                    }
                }
            }
        }
        length(maxLength);
        printSubstring(a, start, start + maxLength);
    }
    
    public static void length(int a) {
        System.out.println("The length of the palindromic substring is: " + a);
    }
    
    public static void printSubstring(String a, int start, int end) {
        System.out.println("The longest palindrome substring in the given string is: " + a.substring(start, end));
    }
}


