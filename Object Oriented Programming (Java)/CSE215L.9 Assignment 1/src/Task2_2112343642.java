import java.util.Scanner;

public class Task2_2112343642 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Enter a String : ");
        str = scanner.nextLine();
        int j = 0;
        char temp = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted String: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}