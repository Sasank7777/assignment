public class StartEndCheck {
    public static void main(String[] args) {
        String str = "HELLO bro my name is Sasank";
        boolean starts = str.startsWith("HELLO");
        boolean ends = str.endsWith("Broo");

        System.out.println("Starts with 'Java': " + starts);
        System.out.println("Ends with 'powerful': " + ends);
    }
}