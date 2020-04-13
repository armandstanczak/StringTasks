package stringtasks;

public class Task010_CompareStringBuffer {

    public static void main(String[] args) {
        
        String one = "armand";
        String two = "Armand";
        StringBuffer buff = new StringBuffer(one);
        
        System.out.println("Comparing " + one + " and " + buff + ": " + one.contentEquals(buff));
        System.out.println("Comparing " + two + " and " + buff + ": " + two.contentEquals(buff));
    }
}
