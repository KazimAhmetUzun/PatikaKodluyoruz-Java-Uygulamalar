import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Doğum Yılınızı Giriniz: ");
            int dogumYili = scanner.nextInt();

            String[] zodyakBurlari = {
                    "Maymun", "Horoz", "Köpek", "Domuz",
                    "Fare", "Öküz", "Kaplan", "Tavşan",
                    "Ejderha", "Yılan", "At", "Koyun"
            };

            int zodyakIndex = dogumYili % 12;

            String cinZodyagi = zodyakBurlari[zodyakIndex];

            System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
        }
    }
}
