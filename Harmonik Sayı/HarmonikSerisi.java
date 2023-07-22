import java.util.Scanner;

public class HarmonikSerisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        double toplam = 0;

        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println("Harmonik serisinin toplamı: " + toplam);
    }
}
