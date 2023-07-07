import java.util.Scanner;

public class DaireAlaniHesaplama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Yarıçapı (r) giriniz: ");
            double yaricap = scanner.nextDouble();

            System.out.print("Merkez açısının ölçüsünü (α) girin: ");
            double merkezAcisi = scanner.nextDouble();

            double pi = 3.14;
            double alan = (pi * yaricap * yaricap * merkezAcisi) / 360.0;

            System.out.println("Dairenin Alanı: " + alan);
        }
    }
}
