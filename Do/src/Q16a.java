
import java.util.Scanner;

public class Q16a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Mark(s)");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum = arr[i] + sum;
        }

        int avg = sum / arr.length;

        System.out.println("Minimum marks " + min);
        System.out.println("Maximum marks " + max);
        System.out.println("Average marks " + avg);
    }
}
