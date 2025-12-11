import java_n.CIE.*;
import SEE.*;
import java.util.*;

public class exam {
    public static void main(String[] args) {
        int[] finalMarks = new int[5];
        Scanner sc = new Scanner(System.in);
        personal obj3 = new personal("bm277", "shreyas", 3);
        internal ob1 = new internal();
        external ob2 = new external();

        System.out.println("Enter internal marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " internal mark: ");
            ob1.read(sc.nextInt());
        }
        System.out.println("Enter external marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " external mark: ");
            ob2.read(sc.nextInt());
        }

        System.out.println("student details are:");
        obj3.dis();
        System.out.println("\nFinal marks for each subject:");s
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = ob1.arrcie[i] + ob2.arrsee[i];
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]);
        }
    }
}