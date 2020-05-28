package stringtasks;

public class Task048_RemoveLetters {

    public static void main(String[] args) {
        
        String original = "abrambabasc";
        String one = "b", two = "ac";
        System.out.println("The given string is: " + original);
        System.out.println("After removing letters, the string is: " + replaceString(original, one, two));
    }
    
    public static String replaceString(String original, String one, String two) {
        return original.replace(one, "").replace(two, "");
    }
}
