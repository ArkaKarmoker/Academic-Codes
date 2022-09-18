import java.util.Scanner;

public class Task1_2112343642 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of students: ");
        n = scanner.nextInt();

        int[][] marks = new int[n][4];
        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks for Student - " + i + ": ");
            for (int j = 0; j < 4; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }

        total = studentTotal(marks, n);

        classTotalAndAverage(total);
    }

    public static int[] studentTotal(int[][] marks, int n) {
        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            total[i] = 0;
            for (int j = 0; j < 4; j++) {
                total[i] = total[i] + marks[i][j];
            }
            System.out.println("Total marks for Student - " + i + ": " + total[i]);
        }

        return total;
    }

    public static void classTotalAndAverage(int[] total) {

        int classTotal = 0;
        double classAverage;

        for (int i = 0; i < total.length; i++) {
            classTotal = classTotal + total[i];
        }
        classAverage = classTotal / (double) total.length;

        System.out.println("Class Total: " + classTotal);
        System.out.println("Class Average: " + classAverage);
    }
}