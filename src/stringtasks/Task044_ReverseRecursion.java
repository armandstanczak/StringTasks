package stringtasks;

public class Task044_ReverseRecursion {

    public static void main(String[] args) {
        
        String a = "The quick brown fox jumps";
        System.out.println("The string is: " + a);
        System.out.println("Reversed string using recursion is: ");
        reversed(a);
        System.out.println("\n");
    }
    
    public static void reversed(String a) {
        if ("".equals(a) || a.length() <= 1) {
            System.out.print(a);
        } else {
            System.out.print(a.charAt(a.length() - 1));
            reversed(a.substring(0, a.length() - 1));
        }
    }
}
