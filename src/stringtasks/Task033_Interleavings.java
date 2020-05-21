package stringtasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task033_Interleavings {

    static String a = "ABC", b = "DEF";
    static char[] aArray = a.toCharArray();
    static char[] bArray = b.toCharArray();
    static ArrayList<String> arr = new ArrayList<String>();
        
    public static void main(String[] args) {
        
        printString(a);
        printString(b);
        interLeavings("", a, b, arr);
        printArrayList(arr);
    }
    
    public static void printString(String a) {
        System.out.println("The string is: " + a);
    }
    
    public static void interLeavings(String total, String a, String b, ArrayList<String> arr) {
        if (a.length() == 0 && b.length() == 0) {
            arr.add(total);
            return;
        }
        
        if (a.length() > 0) {
            interLeavings(total + a.charAt(0), a.substring(1), b, arr);
        }
        
        if (b.length() > 0) {
            interLeavings(total + b.charAt(0), a, b.substring(1), arr);
        }
    }
    
    public static void printArrayList(ArrayList<String> arr) {
        System.out.println(Arrays.toString(arr.toArray()));
        System.out.println("Number of possibilities: " + arr.size());
    }
}
