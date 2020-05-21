package stringtasks;

import java.util.Scanner;

public class Task026_CheckIFStringStartsTheSame {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Write a word you want to check: ");
        String start = input.nextLine();
        
        checkSentence(sentence, start);
    }
    
    public static void checkSentence(String sentence, String start){
        System.out.println("Original sentence is: " + sentence + "\nSentence starts with \"" + start + "\"?");
        System.out.println(sentence.startsWith(start));
    }
}
