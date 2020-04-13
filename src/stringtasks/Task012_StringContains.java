package stringtasks;

public class Task012_StringContains {

    public static void main(String[] args) {
        
        String str = "armando";
        String first = "do";
        String second = "d";
        
        System.out.println("\"" + str + "\" ends with \"" + first + "\"? " + checkString(str, first));
        System.out.println("\"" + str + "\" ends with \"" + second + "\"? " + checkString(str, second));
    }
    
    public static boolean checkString(String str, String substring) {
        return str.endsWith(substring);
    }
}
