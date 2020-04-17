package stringtasks;

public class Task016_ByteArray {

    public static void main(String[] args) {
        
        String word = "Armand";
        byte[] array = word.getBytes();
        String new_word = new String(array);
        
        System.out.println("The new string is: " + new_word);
    }
}
