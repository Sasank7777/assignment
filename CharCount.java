public class CharCount {
    public static void main(String[] args) {
        String str = "SAshank*@!";
        int vowels = 0;
        int consonants = 0; 
        int digits = 0;
        int specialChars = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else if (ch >= 'a' && ch <= 'z') consonants++;
            else if (Character.isDigit(ch)) digits++;
            else specialChars++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}