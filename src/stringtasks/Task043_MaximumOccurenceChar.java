package stringtasks;


public class Task043_MaximumOccurenceChar {

    public static void main(String[] args) {
        String a = "abbbbbb";
        System.out.println("The given string is: " + a);
        System.out.println("Max occuring character in string is: " + maxOccurence(a));
    }
    
    public static char maxOccurence(String a) {
        int len = a.length();
        int[] temp = new int[256];
        int max = -1;
        char result = ' ';
        
        for (int i = 0; i < len; i++) {
            temp[a.charAt(i)]++;
        }
        
        for (int i = 0; i < len; i++) {
            if (max < temp[a.charAt(i)]) {
                max = temp[a.charAt(i)];
                result = a.charAt(i);
            }
        }
        return result;
    }
}
