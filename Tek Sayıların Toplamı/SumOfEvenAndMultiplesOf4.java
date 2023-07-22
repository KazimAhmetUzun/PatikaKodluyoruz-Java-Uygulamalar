import java.util.Scanner;

public class SumOfEvenAndMultiplesOf4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için 0 girin): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Kullanıcı 0 girdiğinde döngüyü sonlandır.
            }

            if (number % 2 == 0 || number % 4 == 0) {
                sum += number;
            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}
