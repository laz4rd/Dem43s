import java.util.*;

public class Q15a {

    // Recursive method to calculate nth Fibonacci number
    public static int fibRec(int n) {
        if (n <= 1)
            return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    // Iterative method to print Fibonacci up to N terms
    public static void fibIter(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Using Iteration: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();

        // Iteration Output
        fibIter(n);

        // Recursion Output
        System.out.print("Fibonacci Using Recursion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}