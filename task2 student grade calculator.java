import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        char grade;
        if (averagePercentage >= 95 {
            grade = 'A';
        } else if (averagePercentage >= 85) {
            grade = 'B';
        } else if (averagePercentage >= 75) {
            grade = 'C';
        } else if (averagePercentage >= 65) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("--")
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}