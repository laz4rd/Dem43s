// a) Write a Java program to read an integer N and print:
// sum of digits, reverse, and whether it is a palindrome. (10 Marks)

import java.util.Scanner;

public class Q01a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum = i + sum;
        }
        System.out.println("Sum: " + sum);

        int original = sum;
        int rev = 0;

        while (sum != 0) {
            int digit = sum % 10; // take last digit
            rev = rev * 10 + digit; // build reversed number
            sum = sum / 10; // remove last digit
        }
        if (original == rev) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
