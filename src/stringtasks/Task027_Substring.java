package stringtasks;

import java.util.Scanner;

public class Task027_Substring {

    static String sentence;
    static int start, end;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("The substring is: \"" + subString() + "\"");
    }
    
    public static String sentence(){
        System.out.print("Write a string: ");
        return input.nextLine();
    }
    
    public static int startPosition() {
        System.out.print("Write starting position: ");
        return input.nextInt();
    }
    
    public static int endPosition() {
        System.out.print("Write ending position: ");
        return input.nextInt();
    }
    
    public static String subString(){
        sentence = sentence();
        start = startPosition();
        end = endPosition();
        return sentence.substring(start, end);
    }
}
