package KDV;

import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Para değerini girin: ");
            double para = scanner.nextDouble();

            double kdvOrani;
            if (para >= 0 && para <= 1000) {
                kdvOrani = 0.18;
            } else {
                kdvOrani = 0.08;
            }

            double kdvTutari = para * kdvOrani;
            double kdvliFiyat = para + kdvTutari;

            System.out.println("KDV'siz Fiyat: " + para);
            System.out.println("KDV Oranı: %" + (kdvOrani * 100));
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        }
    }
}
