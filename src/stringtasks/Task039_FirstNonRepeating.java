package stringtasks;

public class Task039_FirstNonRepeating {

    public static void main(String[] args) {
        
        String a = "gibblegabblerxiar";
        System.out.println("The given string is: " + a);
        System.out.println("The first non reapeted character in String is: " + firstChar(a));
    }
    
    public static String firstChar(String a) {
        int counter = 0;
        
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (i != j && a.charAt(i) == a.charAt(j)) {
                    counter++;
                }    
            }
            if (counter == 0) {
                    return Character.toString(a.charAt(i));
            } else {
                counter = 0;
            }
        }
        return null;
    }
}
