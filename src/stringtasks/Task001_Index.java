package stringtasks;

import java.util.Scanner;

public class Task001_Index {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Input an index: ");
        int index = input.nextInt();
        
        System.out.println("Original sentence: " + sentence);
        System.out.println("Letter at index " + index + " is: " + sentence.charAt(index));
    }
}
