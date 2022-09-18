public class Task1_2112343642 {
    public static void main(String[] args) {
        double i = 1;
        double sum = 0;

        while (i <= 51) {
            sum = sum + (i / (i + 2));
            i = i + 2;
        }
        System.out.println("Sum of the series is " + sum);
    }
}
