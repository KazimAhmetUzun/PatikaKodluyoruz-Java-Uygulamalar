import java.util.Scanner;

public class PowersOf4And5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 0; i <= number; i++) {
            System.out.println("4^" + i + " = " + Math.pow(4, i));
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 0; i <= number; i++) {
            System.out.println("5^" + i + " = " + Math.pow(5, i));
        }
    }
}
