import java.util.Scanner;

public class BasamakToplamHesaplayici {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int geciciSayi = sayi;

        while (geciciSayi > 0) {
            int basamak = geciciSayi % 10;
            toplam += basamak;
            geciciSayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
