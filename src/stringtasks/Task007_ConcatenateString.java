package stringtasks;

public class Task007_ConcatenateString {

    public static void main(String[] args) {
        
        String one = "Armand";
        String two = " ";
        String three = "Stanczak";
        
        String sentence = "";
        
        sentence = one.concat(two).concat(three);
        
        System.out.println(sentence);
    }
}
