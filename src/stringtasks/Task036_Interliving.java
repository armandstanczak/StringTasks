package stringtasks;

import java.util.Scanner;

public class Task036_Interliving {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String one = "MNO", two = "PQ";

    
        System.out.print("Input a string: ");
        String string = input.nextLine();
        System.out.println("The given string is: " + string);
        System.out.println("Interleaving strings are " + one + " and " + two);
    
        System.out.println("The given strings are interleaving: " + checker(one, two, string));
    }
    
    public static boolean checker(String a, String b, String c) {
        int lenA = a.length(), lenB = b.length(), lenC = c.length();
        int counterA = 0, counterB = 0;
        
        for (int i = 0; i < lenC; i++) {
            if (counterA != lenA) {
                if (c.charAt(i) == a.charAt(counterA)){
                    if (counterA < lenA) {
                        counterA++;
                        continue;
                    }
                }
            }
            if (counterB != lenB) {
                if (c.charAt(i) == b.charAt(counterB)){
                    if (counterB < lenB) {
                        counterB++;
                        continue;
                    }
                }
            }
        }
        return counterA == lenA && counterB == lenB;
    }
}