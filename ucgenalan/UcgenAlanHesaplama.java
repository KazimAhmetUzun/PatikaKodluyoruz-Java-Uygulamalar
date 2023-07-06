package ucgenalan;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("İlk kenar uzunluğunu girin: ");
            double kenar1 = scanner.nextDouble();

            System.out.print("İkinci kenar uzunluğunu girin: ");
            double kenar2 = scanner.nextDouble();

            System.out.print("Üçüncü kenar uzunluğunu girin: ");
            double kenar3 = scanner.nextDouble();

            double u = (kenar1 + kenar2 + kenar3) / 2.0;
            double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

            System.out.println("Alan: " + alan);
        }
    }
}
