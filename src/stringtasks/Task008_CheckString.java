package stringtasks;

public class Task008_CheckString {

    public static void main(String[] args) {
        
        String sentence = "Hello worlds";
        String word = "hello";
        boolean contain = sentence.contains(word);
        
        System.out.println(contain);
    }
}
