import java.util.Scanner;

public class ZodiacSign {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Lütfen doğduğunuz ayı girin (örn. 1-12): ");
            int month = scanner.nextInt();

            System.out.print("Lütfen doğduğunuz günü girin (örn. 1-31): ");
            int day = scanner.nextInt();

            String sign = "";

            if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
                sign = "Koç";
            } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
                sign = "Boğa";
            } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
                sign = "İkizler";
            } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
                sign = "Yengeç";
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                sign = "Aslan";
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                sign = "Başak";
            } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                sign = "Terazi";
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                sign = "Akrep";
            } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                sign = "Yay";
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                sign = "Oğlak";
            } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
                sign = "Kova";
            } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
                sign = "Balık";
            }

            System.out.println("Burcunuz: " + sign);
        }
    }
}
