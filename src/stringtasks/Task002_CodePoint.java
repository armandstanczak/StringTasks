package stringtasks;

public class Task002_CodePoint {

    public static void main(String[] args) {
        
        String string = "Armando";
        System.out.println("Original string: " + string);
        
        int number1 = string.codePointAt(3);
        int number2 = string.codePointAt(6);
        
        System.out.println("Unicode point character at index " + 3 + " is: " + number1);
        System.out.println("Unicode point character at index " + 6 + " is: " + number2);
    }
}