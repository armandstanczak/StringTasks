package stringtasks;

public class Task003_CodePoint2 {

    public static void main(String[] args) {
        
        String string = "Armando";
        
        int number1 = string.codePointBefore(1);
        int number2 = string.codePointAt(0);
        
        System.out.println(number1);
        System.out.println(number2);
    }
}
