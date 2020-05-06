package stringtasks;

public class Task025_ReplaceSubstring {

    public static void main(String[] args) {
        
        String original = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original string: " + original);
        String changed = original.replace("fox", "cat");
        System.out.println("New sentence: " + changed);
    }
}
