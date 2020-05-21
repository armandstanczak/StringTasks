package stringtasks;

public class Task034_FrequentCharacter {

    static int max = 256;
        
    public static void main(String[] args) {
        
        String a = "aabbccddeeffgghh";
        System.out.println("Given string is: " + a);
        char temp = secondFreq(a);
        if (temp != 0) {
            System.out.println("The second most frequent char is: " + temp);
        } else {
            System.out.println("There is no second frequent char found");
        }
    }
    
    public static char secondFreq(String a) {
        int[] arr = new int[max];
        int first = 0, second = 0;
        
        for (int i = 0; i < a.length(); i++) {
            (arr[a.charAt(i)])++;
        }
        
        for (int i = 0; i < max; i++) {
            if (arr[i] > arr[first]) {
                second = first;
                first = i;
            } else if (arr[i] > arr[second] && arr[i] != arr[first]) {
                second = i;
            }
        }
        return (char) second;
    }
}
