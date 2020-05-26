package stringtasks;

public class Task042_ListWordsWithCharacters {

    public static void main(String[] args) {
        
        String a = "rabbit   bribe   dog bib";
        String sub = "bib";
        String [] splitString = a.trim().split("\\s+");
        int lenSplit = splitString.length;
        
        System.out.println("The givent strings are: " + a);
        System.out.println("The givent word is: " + sub);
        System.out.println("The strings containing all the letters of the given word are: ");
        char[] subString = sub.toCharArray();
        int counter = 0;
        
        for (int i = 0; i < lenSplit; i++) {
            char[] temp = splitString[i].toCharArray();
            
            for (int j = 0; j < subString.length; j++) {
                for (int k = 0; k < temp.length; k++) {
                    if (subString[j] == temp[k]) {
                        temp[k] = 0;
                        counter++;
                    }
                }
            }
            if (counter == subString.length) {
                System.out.println(splitString[i]);
            } 
            counter = 0;
        }
    }
}

