package stringtasks;

public class Task020_CanonicalRepresentation {

    public static void main(String[] args) {
        
        String one = "Armando Armando";
        String two = new StringBuffer("Armando").append(" Armando").toString();
        String three = two.intern();
        
        System.out.println("First and second: " + (one == two));
        System.out.println("First and third: " + (one == three));
        System.out.println("Second and third: " + (two == three));
    }
}
