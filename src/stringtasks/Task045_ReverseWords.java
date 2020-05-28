package stringtasks;

public class Task045_ReverseWords {

    public static void main(String[] args) {
        
        String a = "Reverse words in a given string";
        System.out.println("The given string is: " + a);
        System.out.print("The new string with reversed words is: ");
        reversedWords(a);
        System.out.println("\n");
    }
    
    public static void reversedWords(String a) {
        String[] splitString = a.trim().split("\\s", 0);
        int len = splitString.length;
        
        for (int i = len - 1; i >= 0; i--) {
            printString(splitString[i]);
        }
    }
    
    public static void printString(String a) {
        System.out.print(a + " ");
    }
}
