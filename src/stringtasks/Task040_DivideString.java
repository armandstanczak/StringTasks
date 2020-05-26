package stringtasks;

import java.util.Scanner;

public class Task040_DivideString {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxy";
        System.out.println("The given string is: " + a);
        System.out.print("How many parts you want the string to be dividen in: ");
        int x = input.nextInt();
        
        int start = 0;
        int end = start + x;
        
        System.out.println("The string divided into " + x + " parts are:");
        for (int i = 1; i <= x; i++) {
            System.out.println(a.substring(start, end));
            start = end;
            end = end + x;
        }
    }
}
