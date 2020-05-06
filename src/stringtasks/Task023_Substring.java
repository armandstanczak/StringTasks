package stringtasks;

public class Task023_Substring {

    public static void main(String[] args) {
        
        String first = "Shanghai Houston Colorado Alexandria";
        String second = "Alexandria Colorado Houston Shanghai";
        
        boolean match1 = first.regionMatches(0, second, 28, 8);
        boolean match2 = first.regionMatches(9, second, 9, 8);
        
        System.out.println("[0-7] == [28-35]: " + match1);
        System.out.println("[9-15] == [9-15]: " + match2);
    }
}
