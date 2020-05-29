package stringtasks;

import java.util.ArrayList;

public class Task051_AllDuplicates {

    public static void main(String[] args) {

        String s = "w3resource";
        System.out.println("The givent string is: " + s);
        System.out.println("The duplicate characters and counts are: ");
        findDuplicates(s);
    }
    
    public static void findDuplicates(String s) {
        int lenString = s.length();
        ArrayList<Character> lettersUnique = new ArrayList<>();
        ArrayList<Integer> numberOfLetters = new ArrayList<>();
        
        for (int i = 0; i < lenString; i++) {
            if (!lettersUnique.contains(s.charAt(i))) {
                lettersUnique.add(s.charAt(i));
                numberOfLetters.add(1);
            } else {
                int index = lettersUnique.indexOf(s.charAt(i));
                numberOfLetters.set(index, numberOfLetters.get(index) + 1);
            }
        }
        printDuplicates(lettersUnique, numberOfLetters);
    }
    
    public static void printDuplicates(ArrayList<Character> letters, ArrayList<Integer> numbers) {
        int lenArray = numbers.size();
        for (int i = 0; i < lenArray; i++) {
            if (numbers.get(i) > 1) {
                System.out.println(letters.get(i) + " appears " + numbers.get(i) + " times");
            }
        }
    }
}
