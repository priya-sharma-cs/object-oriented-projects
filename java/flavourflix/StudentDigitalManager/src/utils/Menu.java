package utils;

import models.Student;
import java.util.Scanner;

public class Menu {

    public static void start(Student student) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Digital Manager ===");
            System.out.println("1. Add Academic Work");
            System.out.println("2. Add Coding Work");
            System.out.println("3. Add Communication");
            System.out.println("4. Add Learning Topic");
            System.out.println("5. View Stored Summary");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter academic task: ");
                    student.addAcademicTask(sc.nextLine());
                    System.out.println("Saved ✅");
                    break;

                case 2:
                    System.out.print("Enter coding work: ");
                    student.addCodingTask(sc.nextLine());
                    System.out.println("Saved ✅");
                    break;

                case 3:
                    System.out.print("Enter communication detail: ");
                    student.addCommunication(sc.nextLine());
                    System.out.println("Saved ✅");
                    break;

                case 4:
                    System.out.print("Enter learning topic: ");
                    student.addLearningTopic(sc.nextLine());
                    System.out.println("Saved ✅");
                    break;

                case 5:
                    student.showSummary();
                    break;

                case 0:
                    System.out.println("Exiting... Keep growing 🚀");
                    break;

                default:
                    System.out.println("Invalid choice ❌");
            }

        } while (choice != 0);
    }
}
