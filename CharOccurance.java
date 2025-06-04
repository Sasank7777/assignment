public class CharOccurance {
    public static void main(String[] args) {
        String str = "kadaliiiiiiiii";
        char ch = 'i';

        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}