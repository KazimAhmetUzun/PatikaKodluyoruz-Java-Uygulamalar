import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        if (isPalindromic(number)) {
            System.out.println(number + " bir palindromik sayıdır.");
        } else {
            System.out.println(number + " bir palindromik sayı değildir.");
        }
    }

    public static boolean isPalindromic(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
