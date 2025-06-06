public class StringHiding {

    public static String hideLast4Digits(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() < 4) {
            return phoneNumber;
        }
        return phoneNumber.substring(0, phoneNumber.length() - 4) + "****";
    }

    public static String hideEmailMiddle(String email) {
        if (email == null || !email.contains("@")) {
            return email;
        }

        int atIndex = email.indexOf("@");
        if (atIndex <= 1) {
            return email; // Invalid email format
        }

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex);

        // Hide middle part of the username (keep first and last characters)
        if (username.length() <= 2) {
            return email; // Not enough characters to hide the middle
        }

        String hiddenUsername = username.charAt(0) +
                String.valueOf(new String(new char[username.length() - 2]).replace('\0', '*')) +
                username.charAt(username.length() - 1);

        return hiddenUsername + domain;
    }

    public static String replaceAllExceptFirstAndLast(String text) {
        if (text == null || text.length() <= 2) {
            return text;
        }
        return text.charAt(0) + new String(new char[text.length() - 2]).replace('\0', '*') + text.charAt(text.length() - 1);
    }


    public static void main(String[] args) {
        String phoneNumber = "798-9988-348";
        String email = "sasankkadaliii@gmail.com";
        String text = "Sasankkkkadaliii";

        String maskedPhoneNumber = hideLast4Digits(phoneNumber);
        System.out.println("Original: " + phoneNumber + ", Masked: " + maskedPhoneNumber);

        String maskedEmail = hideEmailMiddle(email);
        System.out.println("Original: " + email + ", Masked: " + maskedEmail);

        String replacedText = replaceAllExceptFirstAndLast(text);
        System.out.println("Original: " + text + ", Replaced: " + replacedText);

        String phoneNumber2 = "1234567890"; //No dashes
        String maskedPhoneNumber2 = hideLast4Digits(phoneNumber2);
        System.out.println("Original: " + phoneNumber2 + ", Masked: " + maskedPhoneNumber2);
    }
}
