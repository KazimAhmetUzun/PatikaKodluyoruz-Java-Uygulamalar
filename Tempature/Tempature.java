import java.util.Scanner;

enum Activity {
    KAYAK, SINEMA, PIKNIK, YUZME
}

public class Tempature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık değerini girin: ");
        int temperature = scanner.nextInt();

        Activity activity;

        if (temperature < 5) {
            activity = Activity.KAYAK;
        } else if (temperature >= 5 && temperature < 15) {
            activity = Activity.SINEMA;
        } else if (temperature >= 10 && temperature < 25) {
            activity = Activity.PIKNIK;
        } else {
            activity = Activity.YUZME;
        }

        System.out.println("Önerilen etkinlik: " + activity);

        scanner.close();
    }
}
