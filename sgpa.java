import java.util.Scanner;

public class sgpa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        String[] subjects = {"Java", "Data Structures", "Logic Design"};
        double[] gradePoints = new double[3];
        int[] credits = new int[3];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter grade point for " + subjects[i] + ": ");
            gradePoints[i] = s.nextDouble();

            System.out.print("Enter credit for " + subjects[i] + ": ");
            credits[i] = s.nextInt();
        }

        double totalWeightedPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < subjects.length; i++) {
            totalWeightedPoints += gradePoints[i] * credits[i];
            totalCredits += credits[i];
        }

        double sgpa = totalWeightedPoints / totalCredits;

        System.out.printf("Your SGPA is: %.2f\n", sgpa);

        s.close();
    }
}