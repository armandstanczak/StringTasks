package stringtasks;

public class Task046_ReverseWords2 {

    public static void main(String[] args) {
        
        String originalString = "This is a test string";
        System.out.println("The given string is: " + originalString);
        System.out.println("The string reversed word by word is: ");
        reversedString(originalString);
    }
    
    public static void reversedString(String original) {
        String[] splitSentence = original.trim().split(" ");
        int lenArray = splitSentence.length;
        
        for (int i = 0; i < lenArray; i++) {
            char[] charArr = splitSentence[i].toCharArray();
            int lenCharArr = charArr.length;
            for (int j = lenCharArr - 1; j >= 0; j--) {
                System.out.print(charArr[j]);
            }
            System.out.print(" ");
        }
        System.out.println("\n");
    }
}
