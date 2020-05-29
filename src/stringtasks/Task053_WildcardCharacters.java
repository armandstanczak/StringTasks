package stringtasks;

public class Task053_WildcardCharacters {

    public static void main(String[] args) {
        
        String a = "abcdefgh", pattern = "abc*d?*";
        System.out.println("The given string us: " + a);
        System.out.println("The given pattern string is: " + pattern);
        
        char[] aChar = a.toCharArray();
        char[] patternChar = pattern.toCharArray();
        boolean[][] lookup = new boolean[aChar.length + 1][patternChar.length + 1];
        
        if (checkPattern(aChar, patternChar, aChar.length - 1, patternChar.length - 1, lookup)) {
            System.out.println("The given pattern is a match");
        } else {
            System.out.println("The given pattern is not a match");
        }
    }   
    
    public static boolean checkPattern(char[] aChar, char[] patternChar, int n, int m, boolean[][] lookup) {
        if (m < 0 && n < 0) {
            return true;
        } else if (m < 0) {
            return false;
        } else if (n < 0) {
            for (int i = 0; i <= m; i++) {
                if (patternChar[i] != '*') {
                    return false;
                }
            }
            return true;
        }
        if (!lookup[m][n]) {
            if (patternChar[m] == '*') {
                lookup[m][n] = checkPattern(aChar, patternChar, n - 1, m, lookup) || checkPattern(aChar, patternChar, n, m - 1, lookup);
            } else if (patternChar[m] != '?' && patternChar[m] != aChar[n]) {
                lookup[m][n] = false;
            } else {
                lookup[m][n] = checkPattern(aChar, patternChar, n - 1, m - 1, lookup);
            }
        }
        return lookup[m][n];
    }
}
