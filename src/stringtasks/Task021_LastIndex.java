package stringtasks;

public class Task021_LastIndex {

    public static void main(String[] args) {
        
        String sentence = "The quick brown fox jumps over the lazy dog";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        System.out.println("Original sentence:\n" + sentence + "\n");
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.println("Letter " + alphabet.charAt(i) + "'s last location in the sentence is: " + sentence.lastIndexOf(alphabet.charAt(i)));
        }
    }
}
