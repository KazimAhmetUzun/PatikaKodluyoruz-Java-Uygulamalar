
import java.util.Scanner;

public class RecursivePower {

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponent;

        System.out.print("Taban değeri giriniz: ");
        base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);

        scanner.close();
    }
}
