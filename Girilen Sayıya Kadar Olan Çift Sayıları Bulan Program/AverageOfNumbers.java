import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("0'dan " + number + " kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("0'dan " + number + " kadar olan 3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
