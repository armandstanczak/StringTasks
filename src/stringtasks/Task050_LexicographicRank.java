package stringtasks;

public class Task050_LexicographicRank {

    public static void main(String[] args) {
        String str = "BDCA";
        int len = str.length();
        System.out.println("The given string is: " + str);
        System.out.println("The Lexicographic rank of the given string is: " + findRank(str, len - 1) + "\n");
    }
    
    static int factorial(int x) {
        return (x <= 2) ? x : x * factorial(x - 1);
    }
    
    static int findRank(String string, int x) {
        int rank = 1;
        for (int i = 0; i < x; i++) {
            int temp = 0;
            for (int j = i + 1; j <= x; j++) {
                if (string.charAt(i) > string.charAt(j)) {
                    temp++;
                }
            }
            rank += temp * factorial(x - i);
        }
        return rank;
    }
}
