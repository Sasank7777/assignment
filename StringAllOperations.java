import java.util.*;

public class StringAllOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

    
        System.out.println("UPPER CASE: " + sentence.toUpperCase());
        System.out.println("lower case: " + sentence.toLowerCase());
        System.out.println("Trimmed sentence: '" + sentence.trim() + "'");
        System.out.println("Length: " + sentence.length());
        System.out.println("Substring (3 to 7): " + (sentence.substring(3, 7)));
        System.out.println("First character: " + (sentence.charAt(0)));
        System.out.println("Index of 'a': " + sentence.indexOf('a'));
        System.out.println("Last index of 'a': " + sentence.lastIndexOf('a'));
        System.out.println("Contains 'java'? " + sentence.contains("java"));
        System.out.println("Starts with 'The'? " + sentence.startsWith("The"));
        System.out.println("Ends with '.'? " + sentence.endsWith("."));
        System.out.println("Is sentence empty? " + sentence.isEmpty());

        System.out.print("\nEnter word to be replaced: ");
        String wordToReplace = sc.nextLine();
        System.out.print("Enter replacement word: ");
        String replacementWord = sc.nextLine();

        System.out.println("\n--- Replacements ---");
        String replacedSentence = sentence.replace(wordToReplace, replacementWord);
        String replacedFirst = sentence.replaceFirst(wordToReplace, replacementWord);
        System.out.println("All occurrences replaced: " + replacedSentence);
        System.out.println("Only first occurrence replaced: " + replacedFirst);

        System.out.print("\nEnter another string for comparison: ");
        String anotherString = sc.nextLine();
        System.out.println("Equals? " + sentence.equals(anotherString));
        System.out.println("Equals Ignore Case? " + sentence.equalsIgnoreCase(anotherString));

        System.out.println("\nConcatenated sentence: " + sentence.concat(" ").concat(anotherString));
        sc.close();
    }
}
