package stringtasks;

public class Task024_ReplaceLetter {

    public static void main(String[] args) {
        
        String original = "Wlazl kotek na plotek i mruga";
        String temp1 = original.replace("l", "7");
        String temp2 = temp1.replace("a", "7");
        System.out.println("Original sentence: " + original + "\nAfter replacing all \"l\" and \"a\" to \"7's\"\n" + temp2);
    }
}
