import java.util.*;

public class StudentsMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marksList = new ArrayList<>();

        System.out.println("Enter marks of 5 students:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Student " + i + ": ");
            int mark = sc.nextInt();
            marksList.add(mark);
        }
        
        int sum = 0;
        for (int mark : marksList) {
            sum += mark;
        }
        double average = (double) sum / marksList.size();

        System.out.println("\nMarks of students: " + marksList);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average marks: " + average);

        int max = Collections.max(marksList);
        int min = Collections.min(marksList);
        System.out.println("Highest mark: " + max);
        System.out.println("Lowest mark: " + min);
        sc.close();
    }
}