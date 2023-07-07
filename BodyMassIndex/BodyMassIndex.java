
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
            double height = scanner.nextDouble();

            System.out.print("Lütfen kilonuzu(kg cinsinden) giriniz: ");
            double kilo = scanner.nextDouble();

            double bodyMassIndex = kilo / (height * height);

            System.out.println("Vücut Kitle İndeksiniz: " + bodyMassIndex);
        }
    }
}
