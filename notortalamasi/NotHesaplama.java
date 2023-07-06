package notortalamasi;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Matematik sınav puanını girin: ");
            int matematik = scanner.nextInt();

            System.out.print("Fizik sınav puanını girin: ");
            int fizik = scanner.nextInt();

            System.out.print("Kimya sınav puanını girin: ");
            int kimya = scanner.nextInt();

            System.out.print("Türkçe sınav puanını girin: ");
            int turkce = scanner.nextInt();

            System.out.print("Tarih sınav puanını girin: ");
            int tarih = scanner.nextInt();

            System.out.print("Müzik sınav puanını girin: ");
            int muzik = scanner.nextInt();

            int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
            double ortalama = toplam / 6.0;

            System.out.println("Ortalama: " + ortalama);

            if (ortalama > 60) {
                System.out.println("Sınıfı Geçti");
            } else {
                System.out.println("Sınıfta Kaldı");
            }
        }
    }
}
