import java.util.Scanner;

public class Task1_2112343642 {
    public static void main(String[] args) {
        int n, a;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();

        System.out.println("Enter the value of a: ");
        a = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double r = (Math.pow(i, i)) / (Math.pow(a, i - 1));
            sum += r;
        }
        System.out.println(sum);
    }
}