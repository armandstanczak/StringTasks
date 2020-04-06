package stringtasks;

public class Task004_CountUnicodePoints {

    public static void main(String[] args) {
        
        String string = "Armando";
        int number = string.codePointCount(0, string.length());
        
        System.out.println(number);
    }
}
