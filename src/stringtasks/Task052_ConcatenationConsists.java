package stringtasks;

public class Task052_ConcatenationConsists {

    public static void main(String[] args) {
        
        String a = "ABACD", b = "CDABA";
        System.out.println("The given strings are: " + a + " and " + b);
        System.out.println("The concatenation of 1st string twice is: " + a + a);
        
        boolean x = (a.length() == b.length() && (a + a).contains(b));
        
        if (x == true) {
            System.out.println("The 2nd string is in concatenated string");
        } else {
            System.out.println("The 2nd string is not in concatenated string");
        }
    }
}
