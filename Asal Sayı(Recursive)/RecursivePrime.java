import java.util.Scanner;

public class RecursivePrime {

    static boolean isPrime(int num, int divisor) {
        if (divisor == 1) {
            return true;
        } else {
            if (num % divisor == 0) {
                return false;
            } else {
                return isPrime(num, divisor - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Sayı Giriniz: ");
        number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " sayısı ASAL değildir !");
        } else {
            boolean isPrimeNumber = isPrime(number, number - 1);
            if (isPrimeNumber) {
                System.out.println(number + " sayısı ASALDIR !");
            } else {
                System.out.println(number + " sayısı ASAL değildir !");
            }
        }

        scanner.close();
    }
}
