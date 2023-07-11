import java.util.Scanner;

public class FlyAgent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) giriniz: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1: Tek Yön, 2: Gidiş Dönüş): ");
        int travelType = scanner.nextInt();

        double ticketPricePerKm = 0.10;
        double totalPrice = distance * ticketPricePerKm;
        double discount = 0;

        if (distance < 0 || age < 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        if (age < 12) {
            discount = totalPrice * 0.5;
        } else if (age >= 12 && age <= 24) {
            discount = totalPrice * 0.1;
        } else if (age >= 65) {
            discount = totalPrice * 0.3;
        }

        if (travelType == 2) {
            discount += totalPrice * 0.2;
        }

        totalPrice -= discount;

        System.out.println("Toplam Tutar: " + totalPrice + " TL");
    }
}
