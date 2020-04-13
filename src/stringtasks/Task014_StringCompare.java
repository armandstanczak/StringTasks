package stringtasks;

public class Task014_StringCompare {

    public static void main(String[] args) {
        
        String first = "Kermit Kermit";
        String second = "kermit kermit";
        
        System.out.println("\"" + first + "\" compared to \"" + second + "\" is " + first.equals(second));
        System.out.println("\"" + first + "\" compared to \"" + second + "\" ignoring case considerations is " + first.equalsIgnoreCase(second));
    }
}
