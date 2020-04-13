package stringtasks;

public class Task013_StringObjects {

    public static void main(String[] args) {
        
        String first = "Kermit Kermit";
        String second = "kermit kermit";
        String third = "Kermit kermit";
        
        boolean fs = first.equals(second);
        boolean ft = first.equals(third);
        boolean st = second.equals(third);
        
        System.out.println("\"" + first + "\" and \"" + second + "\" are equal: " + fs);
        System.out.println("\"" + first + "\" and \"" + third + "\" are equal: " + ft);
        System.out.println("\"" + second + "\" and \"" + third + "\" are equal: " + st);
    }
    
}
