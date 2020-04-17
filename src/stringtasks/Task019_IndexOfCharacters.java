package stringtasks;

public class Task019_IndexOfCharacters {

    public static void main(String[] args) {
        
        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent in eleifend quam. Quisque lorem nibh, lobortis eget aliquet in, sollicitudin ac ex. Morbi ultrices metus ut orci vestibulum, eu fringilla massa tempor.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for (int counter = 0; counter < alphabet.length(); counter++) {
            System.out.println(alphabet.charAt(counter) + " : " + sentence.indexOf(alphabet.charAt(counter), 0));
        }
    }
}
