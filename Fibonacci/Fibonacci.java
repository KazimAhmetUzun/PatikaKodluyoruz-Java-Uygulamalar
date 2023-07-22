import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi kac elemanli olsun: ");
        int n = input.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(firstNumber);
            } else {
                System.out.print(firstNumber + " ");
            }
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }
}
