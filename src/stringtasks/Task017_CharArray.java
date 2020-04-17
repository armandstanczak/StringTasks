package stringtasks;

public class Task017_CharArray {

    public static void main(String[] args) {
        
        String word = "Armand";
        char[] ch = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }
        
        for (char c : ch) {
            System.out.println(c + ", ");
        }
    }
}
