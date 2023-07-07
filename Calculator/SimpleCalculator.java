import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Birinci sayıyı girin: ");
            double n1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            double n2 = scanner.nextDouble();

            System.out.println("Yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.print("Seçiminizi yapın (1-4): ");
            int choose = scanner.nextInt();

            double result;

            switch (choose) {
                case 1:
                    result = n1 + n2;
                    System.out.println("Sonuç: " + result);
                    break;
                case 2:
                    result = n1 - n2;
                    System.out.println("Sonuç: " + result);
                    break;
                case 3:
                    result = n1 * n2;
                    System.out.println("Sonuç: " + result);
                    break;
                case 4:
                    if (n2 != 0) {
                        result = n1 / n2;
                        System.out.println("Sonuç: " + result);
                    } else {
                        System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız.");
                    break;
            }
        }
    }
}
