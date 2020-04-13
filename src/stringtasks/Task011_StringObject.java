package stringtasks;

public class Task011_StringObject {

    public static void main(String[] args) {
        
        char[] arr = {'1', '2', '3'};
        String string = String.copyValueOf(arr, 0, 2);
        
        System.out.println(string);
    }
}
