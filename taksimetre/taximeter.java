package taksimetre;

import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Gidilen mesafeyi (KM) girin: ");
            double measurement = scanner.nextDouble();

            double openingFee = 10.0;
            double perKm = 2.20;
            double minPrice = 20.0;

            double totalPrice = openingFee + (measurement * perKm);
            double price = Math.max(totalPrice, minPrice);

            System.out.println("Taksimetre Tutarı: " + price + " TL");
        }
    }
}
