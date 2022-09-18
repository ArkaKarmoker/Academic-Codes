import java.util.Scanner;
public class testStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 7Th digit of your NSU ID: ");
        int x = scanner.nextInt();

        System.out.println("Student name is "+ Student.getName());
        System.out.println("Student id is " + Student.getID());
        System.out.println("Student marks is " + Student.getMarks());
        System.out.println("Student status is " + Student.getStatus());
    }
}
