package Thread;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1'den 10000'e kadar olan sayıları içeren bir ArrayList oluşturuyoruz.
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbersList.add(i);
        }

        // 4 eşit parçaya ayıracağız (2500 elemanlık)
        int chunkSize = 2500;

        // 4 ayrı ArrayList oluşturuyoruz (Çift ve Tek Sayıları tutacaklar)
        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        ArrayList<Integer> oddNumbersList = new ArrayList<>();

        // 4 ayrı Thread tasarlayıp başlatıyoruz
        Thread thread1 = new NumberThread(numbersList.subList(0, chunkSize), evenNumbersList, oddNumbersList);
        Thread thread2 = new NumberThread(numbersList.subList(chunkSize, chunkSize * 2), evenNumbersList, oddNumbersList);
        Thread thread3 = new NumberThread(numbersList.subList(chunkSize * 2, chunkSize * 3), evenNumbersList, oddNumbersList);
        Thread thread4 = new NumberThread(numbersList.subList(chunkSize * 3, chunkSize * 4), evenNumbersList, oddNumbersList);

        // Thread'leri başlatıyoruz
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Thread'lerin bitmesini bekliyoruz
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("Çift Sayılar: " + evenNumbersList);
        System.out.println("Tek Sayılar: " + oddNumbersList);
    }
}