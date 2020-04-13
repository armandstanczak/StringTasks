package stringtasks;

public class Task009_CompareString {

    public static void main(String[] args) {
        
        String one = "armand";
        String two = "armand";
        String three = "Armand";
        String four = "armand";
        
        System.out.println("Comparing " + one + " and " + two + ": " + one.equals(two));
        System.out.println("Comparing " + three + " and " + four + ": " + three.equals(four));
    }
}
