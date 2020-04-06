package stringtasks;

public class Task005_CompareStrings {

    public static void main(String[] args) {
        
        String str1 = "Armando";
        String str2 = "armando";
        
        int equal = str1.compareTo(str2);
        
        if (equal == 0) {
            System.out.println("String \"" + str1 + "\" is the same as string \"" + str2 + "\"");
        } else {
            System.out.println("String \"" + str1 + "\" is not the same as string \"" + str2 + "\"");
        }
                
    }
    
}
