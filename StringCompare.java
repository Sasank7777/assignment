public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Sashank";
        String str2 = "Shashank";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}