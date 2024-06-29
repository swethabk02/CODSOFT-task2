import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student mark calculation");
        System.out.println("Enter the number of subjects:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] subjects = new String[n];
        System.out.println("Enter the names of the subjects:");
        for (int i = 0; i < n; i++) {
            subjects[i] = scanner.nextLine();
        }

        int[] marks = new int[n];
        System.out.println("Enter the marks for each subject:");
        for (int i = 0; i < n; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += marks[i];
        }

        System.out.println("Total marks obtained: " + total);

        double avgPercentage = (double) total / n;
        System.out.println("Average percentage obtained: " + avgPercentage);

        char grade;
        if (avgPercentage >= 90) {
            grade = 'S';
        } else if (avgPercentage >= 80) {
            grade = 'A';
        } else if (avgPercentage >= 70) {
            grade = 'B';
        } else if (avgPercentage >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

