import models.Student;
import utils.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Student Digital Manager");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String roll = sc.nextLine();

        Student student = new Student(name, roll);
        Menu.start(student);
    }
}
