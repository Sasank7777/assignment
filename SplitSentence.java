public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "HELLO Bhaii logg mera nam hai Sasank. Arigatho!!";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}